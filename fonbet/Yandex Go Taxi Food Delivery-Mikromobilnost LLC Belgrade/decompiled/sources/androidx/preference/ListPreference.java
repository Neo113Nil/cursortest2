package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import defpackage.fog0;
import defpackage.ity;
import defpackage.mle0;
import defpackage.n2i0;
import defpackage.uvb1;

/* loaded from: classes10.dex */
public class ListPreference extends DialogPreference {
    public CharSequence[] o0;
    public CharSequence[] p0;
    public String q0;
    public String r0;
    public boolean s0;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2i0.ListPreference, i, 0);
        int i2 = n2i0.ListPreference_entries;
        int i3 = n2i0.ListPreference_android_entries;
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(i2);
        this.o0 = textArray == null ? obtainStyledAttributes.getTextArray(i3) : textArray;
        int i4 = n2i0.ListPreference_entryValues;
        int i5 = n2i0.ListPreference_android_entryValues;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(i4);
        this.p0 = textArray2 == null ? obtainStyledAttributes.getTextArray(i5) : textArray2;
        int i6 = n2i0.ListPreference_useSimpleSummaryProvider;
        if (obtainStyledAttributes.getBoolean(i6, obtainStyledAttributes.getBoolean(i6, false))) {
            if (ity.a == null) {
                ity.a = new ity();
            }
            this.g0 = ity.a;
            i();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, n2i0.Preference, i, 0);
        int i7 = n2i0.Preference_summary;
        int i8 = n2i0.Preference_android_summary;
        String string = obtainStyledAttributes2.getString(i7);
        this.r0 = string == null ? obtainStyledAttributes2.getString(i8) : string;
        obtainStyledAttributes2.recycle();
    }

    public final int A(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.p0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.p0[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public void B(CharSequence[] charSequenceArr) {
        this.o0 = charSequenceArr;
    }

    public final void C(String str) {
        boolean equals = TextUtils.equals(this.q0, str);
        if (equals && this.s0) {
            return;
        }
        this.q0 = str;
        this.s0 = true;
        u(str);
        if (equals) {
            return;
        }
        i();
    }

    @Override // androidx.preference.Preference
    public final CharSequence g() {
        CharSequence[] charSequenceArr;
        mle0 mle0Var = this.g0;
        if (mle0Var != null) {
            return mle0Var.c(this);
        }
        int A = A(this.q0);
        CharSequence charSequence = (A < 0 || (charSequenceArr = this.o0) == null) ? null : charSequenceArr[A];
        CharSequence g = super.g();
        String str = this.r0;
        if (str != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            String format = String.format(str, charSequence);
            if (!TextUtils.equals(format, g)) {
                return format;
            }
        }
        return g;
    }

    @Override // androidx.preference.Preference
    public final Object p(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void q(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.q(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.q(savedState.getSuperState());
        C(savedState.mValue);
    }

    @Override // androidx.preference.Preference
    public final Parcelable r() {
        super.r();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.K) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.mValue = this.q0;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void s(Object obj) {
        C(f((String) obj));
    }

    @Override // androidx.preference.Preference
    public final void x(CharSequence charSequence) {
        super.x(charSequence);
        if (charSequence == null) {
            this.r0 = null;
        } else {
            this.r0 = ((String) charSequence).toString();
        }
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.ListPreference.SavedState.1
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
        String mValue;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mValue = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.mValue);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, uvb1.b(context, fog0.dialogPreferenceStyle, R.attr.dialogPreferenceStyle));
    }
}
