package com.yandex.passport.internal.ui.base;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.w;
import defpackage.oey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Stack;

/* loaded from: classes2.dex */
public class FragmentBackStack {
    public final Stack a = new Stack();
    public final ArrayList b = new ArrayList();

    public static j a(BackStackEntry backStackEntry) {
        if (backStackEntry.fragment == null) {
            return null;
        }
        boolean z = backStackEntry.animationTypeBackward == null;
        return new j(backStackEntry.tag, backStackEntry.fragment, z ? backStackEntry.animationTypeForward : backStackEntry.animationTypeBackward, z);
    }

    public final void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((k) it.next()).a(this);
        }
        Stack stack = this.a;
        if (stack.isEmpty()) {
            com.yandex.passport.legacy.a.a("Fragment back stack is empty");
            return;
        }
        StringBuilder sb = new StringBuilder("Fragments in back stack:\n");
        Iterator it2 = stack.iterator();
        while (it2.hasNext()) {
            BackStackEntry backStackEntry = (BackStackEntry) it2.next();
            Locale locale = Locale.US;
            sb.append("0. " + backStackEntry.tag + "\n");
        }
        com.yandex.passport.legacy.a.a(sb.toString());
    }

    public final void c() {
        Stack stack = this.a;
        if (stack.isEmpty()) {
            return;
        }
        stack.pop();
        b();
    }

    public static class BackStackEntry implements Parcelable, oey {
        public static final Parcelable.Creator<BackStackEntry> CREATOR = new Parcelable.Creator<BackStackEntry>() { // from class: com.yandex.passport.internal.ui.base.FragmentBackStack.BackStackEntry.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public BackStackEntry createFromParcel(Parcel parcel) {
                return new BackStackEntry(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public BackStackEntry[] newArray(int i) {
                return new BackStackEntry[i];
            }
        };
        private ShowFragmentInfo$AnimationType animationTypeBackward;
        private final ShowFragmentInfo$AnimationType animationTypeForward;
        private Bundle arguments;
        private final String className;
        private Fragment fragment;
        private Bundle savedInstanceState;
        private final String tag;
        private SparseArray<Parcelable> viewState;

        private BackStackEntry(Parcel parcel) {
            this.animationTypeBackward = null;
            this.viewState = new SparseArray<>();
            this.savedInstanceState = null;
            this.tag = parcel.readString();
            this.className = parcel.readString();
            this.arguments = parcel.readBundle(getClass().getClassLoader());
            this.animationTypeForward = ShowFragmentInfo$AnimationType.values()[parcel.readInt()];
            int readInt = parcel.readInt();
            this.animationTypeBackward = readInt >= 0 ? ShowFragmentInfo$AnimationType.values()[readInt] : null;
            int readInt2 = parcel.readInt();
            if (readInt2 > 0) {
                this.viewState = new SparseArray<>();
                for (int i = 0; i < readInt2; i++) {
                    this.viewState.put(parcel.readInt(), parcel.readParcelable(getClass().getClassLoader()));
                }
            }
            this.savedInstanceState = parcel.readBundle(getClass().getClassLoader());
            this.fragment = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @w(Lifecycle.Event.ON_CREATE)
        public void onViewCreated() {
            Fragment fragment = this.fragment;
            if (fragment != null) {
                fragment.onViewStateRestored(this.savedInstanceState);
                if (this.fragment.getView() != null) {
                    this.fragment.getView().restoreHierarchyState(this.viewState);
                }
            }
        }

        @w(Lifecycle.Event.ON_DESTROY)
        public void onViewDestroy() {
            if (this.fragment != null) {
                Bundle bundle = new Bundle();
                this.savedInstanceState = bundle;
                this.fragment.onSaveInstanceState(bundle);
                if (this.fragment.getView() != null) {
                    this.fragment.getView().saveHierarchyState(this.viewState);
                }
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.tag);
            parcel.writeString(this.className);
            parcel.writeBundle(this.arguments);
            parcel.writeInt(this.animationTypeForward.ordinal());
            ShowFragmentInfo$AnimationType showFragmentInfo$AnimationType = this.animationTypeBackward;
            parcel.writeInt(showFragmentInfo$AnimationType == null ? -1 : showFragmentInfo$AnimationType.ordinal());
            SparseArray<Parcelable> sparseArray = this.viewState;
            parcel.writeInt(sparseArray == null ? 0 : sparseArray.size());
            if (this.viewState != null) {
                for (int i2 = 0; i2 < this.viewState.size(); i2++) {
                    parcel.writeInt(this.viewState.keyAt(i2));
                    parcel.writeParcelable(this.viewState.valueAt(i2), i);
                }
            }
            parcel.writeBundle(this.savedInstanceState);
        }

        public /* synthetic */ BackStackEntry(String str, String str2, Bundle bundle, Fragment fragment, ShowFragmentInfo$AnimationType showFragmentInfo$AnimationType, i iVar) {
            this(str, str2, bundle, fragment, showFragmentInfo$AnimationType);
        }

        private BackStackEntry(String str, String str2, Bundle bundle, Fragment fragment, ShowFragmentInfo$AnimationType showFragmentInfo$AnimationType) {
            this.animationTypeBackward = null;
            this.viewState = new SparseArray<>();
            this.savedInstanceState = null;
            this.tag = str;
            this.className = str2;
            this.arguments = bundle;
            this.fragment = fragment;
            this.animationTypeForward = showFragmentInfo$AnimationType;
        }

        public /* synthetic */ BackStackEntry(Parcel parcel, i iVar) {
            this(parcel);
        }
    }
}
