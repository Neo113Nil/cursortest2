package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.internal.ParcelableSparseArray;
import defpackage.xm10;

/* loaded from: classes11.dex */
public class NavigationBarPresenter implements xm10 {
    public NavigationBarMenuView a;
    public boolean b = false;
    public int c;

    @Override // defpackage.xm10
    public final boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // defpackage.xm10
    public final boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // defpackage.xm10
    public final boolean flagActionItems() {
        return false;
    }

    @Override // defpackage.xm10
    public final int getId() {
        return this.c;
    }

    @Override // defpackage.xm10
    public final void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.a.initialize(menuBuilder);
    }

    @Override // defpackage.xm10
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
    }

    @Override // defpackage.xm10
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.a.tryRestoreSelectedItemId(savedState.selectedItemId);
            Context context = this.a.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.badgeSavedStates;
            SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
            for (int i = 0; i < parcelableSparseArray.size(); i++) {
                int keyAt = parcelableSparseArray.keyAt(i);
                BadgeState$State badgeState$State = (BadgeState$State) parcelableSparseArray.valueAt(i);
                sparseArray.put(keyAt, badgeState$State != null ? BadgeDrawable.createFromSavedState(context, badgeState$State) : null);
            }
            this.a.restoreBadgeDrawables(sparseArray);
        }
    }

    @Override // defpackage.xm10
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.selectedItemId = this.a.getSelectedItemId();
        SparseArray<BadgeDrawable> badgeDrawables = this.a.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int keyAt = badgeDrawables.keyAt(i);
            BadgeDrawable valueAt = badgeDrawables.valueAt(i);
            parcelableSparseArray.put(keyAt, valueAt != null ? valueAt.getSavedState() : null);
        }
        savedState.badgeSavedStates = parcelableSparseArray;
        return savedState;
    }

    @Override // defpackage.xm10
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // defpackage.xm10
    public final void updateMenuView(boolean z) {
        if (this.b) {
            return;
        }
        NavigationBarMenuView navigationBarMenuView = this.a;
        if (z) {
            navigationBarMenuView.buildMenuView();
        } else {
            navigationBarMenuView.updateMenuView();
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarPresenter.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        ParcelableSparseArray badgeSavedStates;
        int selectedItemId;

        public SavedState(Parcel parcel) {
            this.selectedItemId = parcel.readInt();
            this.badgeSavedStates = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.selectedItemId);
            parcel.writeParcelable(this.badgeSavedStates, 0);
        }

        public SavedState() {
        }
    }
}
