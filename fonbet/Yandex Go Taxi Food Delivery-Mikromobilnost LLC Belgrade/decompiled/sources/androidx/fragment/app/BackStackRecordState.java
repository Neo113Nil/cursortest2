package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import defpackage.des;
import defpackage.g8e;
import defpackage.ny61;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new Parcelable.Creator<BackStackRecordState>() { // from class: androidx.fragment.app.BackStackRecordState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    };
    private static final String TAG = "FragmentManager";
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int[] mCurrentMaxLifecycleStates;
    final ArrayList<String> mFragmentWhos;
    final int mIndex;
    final String mName;
    final int[] mOldMaxLifecycleStates;
    final int[] mOps;
    final boolean mReorderingAllowed;
    final ArrayList<String> mSharedElementSourceNames;
    final ArrayList<String> mSharedElementTargetNames;
    final int mTransition;

    public BackStackRecordState(a aVar) {
        int size = aVar.a.size();
        this.mOps = new int[size * 6];
        if (!aVar.g) {
            ny61.r("Not on back stack");
            throw null;
        }
        this.mFragmentWhos = new ArrayList<>(size);
        this.mOldMaxLifecycleStates = new int[size];
        this.mCurrentMaxLifecycleStates = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            des desVar = (des) aVar.a.get(i2);
            int i3 = i + 1;
            this.mOps[i] = desVar.a;
            ArrayList<String> arrayList = this.mFragmentWhos;
            Fragment fragment = desVar.b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.mOps;
            iArr[i3] = desVar.c ? 1 : 0;
            iArr[i + 2] = desVar.d;
            iArr[i + 3] = desVar.e;
            int i4 = i + 5;
            iArr[i + 4] = desVar.f;
            i += 6;
            iArr[i4] = desVar.g;
            this.mOldMaxLifecycleStates[i2] = desVar.h.ordinal();
            this.mCurrentMaxLifecycleStates[i2] = desVar.i.ordinal();
        }
        this.mTransition = aVar.f;
        this.mName = aVar.i;
        this.mIndex = aVar.t;
        this.mBreadCrumbTitleRes = aVar.j;
        this.mBreadCrumbTitleText = aVar.k;
        this.mBreadCrumbShortTitleRes = aVar.l;
        this.mBreadCrumbShortTitleText = aVar.m;
        this.mSharedElementSourceNames = aVar.n;
        this.mSharedElementTargetNames = aVar.o;
        this.mReorderingAllowed = aVar.p;
    }

    private void fillInBackStackRecord(a aVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.mOps;
            boolean z = true;
            if (i >= iArr.length) {
                aVar.f = this.mTransition;
                aVar.i = this.mName;
                aVar.g = true;
                aVar.j = this.mBreadCrumbTitleRes;
                aVar.k = this.mBreadCrumbTitleText;
                aVar.l = this.mBreadCrumbShortTitleRes;
                aVar.m = this.mBreadCrumbShortTitleText;
                aVar.n = this.mSharedElementSourceNames;
                aVar.o = this.mSharedElementTargetNames;
                aVar.p = this.mReorderingAllowed;
                return;
            }
            des desVar = new des();
            int i3 = i + 1;
            desVar.a = iArr[i];
            if (FragmentManager.O(2)) {
                Objects.toString(aVar);
                int i4 = this.mOps[i3];
            }
            desVar.h = Lifecycle.State.values()[this.mOldMaxLifecycleStates[i2]];
            desVar.i = Lifecycle.State.values()[this.mCurrentMaxLifecycleStates[i2]];
            int[] iArr2 = this.mOps;
            int i5 = i + 2;
            if (iArr2[i3] == 0) {
                z = false;
            }
            desVar.c = z;
            int i6 = iArr2[i5];
            desVar.d = i6;
            int i7 = iArr2[i + 3];
            desVar.e = i7;
            int i8 = i + 5;
            int i9 = iArr2[i + 4];
            desVar.f = i9;
            i += 6;
            int i10 = iArr2[i8];
            desVar.g = i10;
            aVar.b = i6;
            aVar.c = i7;
            aVar.d = i9;
            aVar.e = i10;
            aVar.b(desVar);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public a instantiate(FragmentManager fragmentManager, Map<String, Fragment> map) {
        a aVar = new a(fragmentManager);
        fillInBackStackRecord(aVar);
        for (int i = 0; i < this.mFragmentWhos.size(); i++) {
            String str = this.mFragmentWhos.get(i);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment == null) {
                    ny61.r(g8e.r(new StringBuilder("Restoring FragmentTransaction "), this.mName, " failed due to missing saved state for Fragment (", str, Extension.C_BRAKE));
                    return null;
                }
                ((des) aVar.a.get(i)).b = fragment;
            }
        }
        return aVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.mOps);
        parcel.writeStringList(this.mFragmentWhos);
        parcel.writeIntArray(this.mOldMaxLifecycleStates);
        parcel.writeIntArray(this.mCurrentMaxLifecycleStates);
        parcel.writeInt(this.mTransition);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mBreadCrumbTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(this.mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, parcel, 0);
        parcel.writeStringList(this.mSharedElementSourceNames);
        parcel.writeStringList(this.mSharedElementTargetNames);
        parcel.writeInt(this.mReorderingAllowed ? 1 : 0);
    }

    public a instantiate(FragmentManager fragmentManager) {
        a aVar = new a(fragmentManager);
        fillInBackStackRecord(aVar);
        aVar.t = this.mIndex;
        for (int i = 0; i < this.mFragmentWhos.size(); i++) {
            String str = this.mFragmentWhos.get(i);
            if (str != null) {
                ((des) aVar.a.get(i)).b = fragmentManager.c.b(str);
            }
        }
        aVar.j(1);
        return aVar;
    }

    public BackStackRecordState(Parcel parcel) {
        this.mOps = parcel.createIntArray();
        this.mFragmentWhos = parcel.createStringArrayList();
        this.mOldMaxLifecycleStates = parcel.createIntArray();
        this.mCurrentMaxLifecycleStates = parcel.createIntArray();
        this.mTransition = parcel.readInt();
        this.mName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mBreadCrumbTitleRes = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.mBreadCrumbTitleText = (CharSequence) creator.createFromParcel(parcel);
        this.mBreadCrumbShortTitleRes = parcel.readInt();
        this.mBreadCrumbShortTitleText = (CharSequence) creator.createFromParcel(parcel);
        this.mSharedElementSourceNames = parcel.createStringArrayList();
        this.mSharedElementTargetNames = parcel.createStringArrayList();
        this.mReorderingAllowed = parcel.readInt() != 0;
    }
}
