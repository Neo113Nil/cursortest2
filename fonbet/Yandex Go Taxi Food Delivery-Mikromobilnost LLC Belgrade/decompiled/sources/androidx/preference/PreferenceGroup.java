package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import defpackage.n2i0;
import defpackage.ny61;
import defpackage.ycs0;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public abstract class PreferenceGroup extends Preference {
    public final ycs0 i0;
    public final ArrayList j0;
    public boolean k0;
    public int l0;
    public boolean m0;
    public int n0;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.i0 = new ycs0();
        new Handler(Looper.getMainLooper());
        this.k0 = true;
        this.l0 = 0;
        this.m0 = false;
        this.n0 = Integer.MAX_VALUE;
        this.j0 = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2i0.PreferenceGroup, i, 0);
        int i3 = n2i0.PreferenceGroup_orderingFromXml;
        this.k0 = obtainStyledAttributes.getBoolean(i3, obtainStyledAttributes.getBoolean(i3, true));
        if (obtainStyledAttributes.hasValue(n2i0.PreferenceGroup_initialExpandedChildrenCount)) {
            int i4 = n2i0.PreferenceGroup_initialExpandedChildrenCount;
            int i5 = obtainStyledAttributes.getInt(i4, obtainStyledAttributes.getInt(i4, Integer.MAX_VALUE));
            if (i5 != Integer.MAX_VALUE && TextUtils.isEmpty(this.D)) {
                Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.n0 = i5;
        }
        obtainStyledAttributes.recycle();
    }

    public final Preference A(CharSequence charSequence) {
        Preference A;
        if (charSequence == null) {
            ny61.g("Key cannot be null");
            return null;
        }
        if (TextUtils.equals(this.D, charSequence)) {
            return this;
        }
        int size = this.j0.size();
        for (int i = 0; i < size; i++) {
            Preference B = B(i);
            if (TextUtils.equals(B.D, charSequence)) {
                return B;
            }
            if ((B instanceof PreferenceGroup) && (A = ((PreferenceGroup) B).A(charSequence)) != null) {
                return A;
            }
        }
        return null;
    }

    public final Preference B(int i) {
        return (Preference) this.j0.get(i);
    }

    @Override // androidx.preference.Preference
    public final void b(Bundle bundle) {
        super.b(bundle);
        int size = this.j0.size();
        for (int i = 0; i < size; i++) {
            B(i).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void c(Bundle bundle) {
        super.c(bundle);
        int size = this.j0.size();
        for (int i = 0; i < size; i++) {
            B(i).c(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void j(boolean z) {
        super.j(z);
        int size = this.j0.size();
        for (int i = 0; i < size; i++) {
            Preference B = B(i);
            if (B.O == z) {
                B.O = !z;
                B.j(B.y());
                B.i();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void k() {
        super.k();
        this.m0 = true;
        int size = this.j0.size();
        for (int i = 0; i < size; i++) {
            B(i).k();
        }
    }

    @Override // androidx.preference.Preference
    public final void o() {
        super.o();
        this.m0 = false;
        int size = this.j0.size();
        for (int i = 0; i < size; i++) {
            B(i).o();
        }
    }

    @Override // androidx.preference.Preference
    public final void q(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.q(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.n0 = savedState.mInitialExpandedChildrenCount;
        super.q(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable r() {
        super.r();
        return new SavedState(AbsSavedState.EMPTY_STATE, this.n0);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.PreferenceGroup.SavedState.1
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
        int mInitialExpandedChildrenCount;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mInitialExpandedChildrenCount = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mInitialExpandedChildrenCount);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.mInitialExpandedChildrenCount = i;
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
