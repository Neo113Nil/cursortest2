package androidx.preference;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import defpackage.fog0;
import defpackage.n2i0;
import defpackage.uvb1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes10.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] o0;
    public final CharSequence[] p0;
    public final HashSet q0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int b = uvb1.b(context, fog0.dialogPreferenceStyle, R.attr.dialogPreferenceStyle);
        this.q0 = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2i0.MultiSelectListPreference, b, 0);
        int i = n2i0.MultiSelectListPreference_entries;
        int i2 = n2i0.MultiSelectListPreference_android_entries;
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(i);
        this.o0 = textArray == null ? obtainStyledAttributes.getTextArray(i2) : textArray;
        int i3 = n2i0.MultiSelectListPreference_entryValues;
        int i4 = n2i0.MultiSelectListPreference_android_entryValues;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(i3);
        this.p0 = textArray2 == null ? obtainStyledAttributes.getTextArray(i4) : textArray2;
        obtainStyledAttributes.recycle();
    }

    public final void A(Set set) {
        HashSet hashSet = this.q0;
        hashSet.clear();
        hashSet.addAll(set);
        if (z()) {
            if (!set.equals(z() ? this.b.d().getStringSet(this.D, null) : null)) {
                SharedPreferences.Editor c = this.b.c();
                c.putStringSet(this.D, set);
                if (!this.b.e) {
                    c.apply();
                }
            }
        }
        i();
    }

    @Override // androidx.preference.Preference
    public final Object p(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void q(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.q(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.q(savedState.getSuperState());
        A(savedState.mValues);
    }

    @Override // androidx.preference.Preference
    public final Parcelable r() {
        super.r();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.K) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.mValues = this.q0;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void s(Object obj) {
        Set<String> set = (Set) obj;
        if (z()) {
            set = this.b.d().getStringSet(this.D, set);
        }
        A(set);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.MultiSelectListPreference.SavedState.1
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
        Set<String> mValues;

        public SavedState(Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.mValues = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.mValues, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mValues.size());
            Set<String> set = this.mValues;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
