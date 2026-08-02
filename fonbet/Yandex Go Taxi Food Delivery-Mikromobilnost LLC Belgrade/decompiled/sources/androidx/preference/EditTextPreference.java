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
import defpackage.gly0;
import defpackage.n2i0;
import defpackage.uvb1;

/* loaded from: classes10.dex */
public class EditTextPreference extends DialogPreference {
    public String o0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int b = uvb1.b(context, fog0.editTextPreferenceStyle, R.attr.editTextPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2i0.EditTextPreference, b, 0);
        int i = n2i0.EditTextPreference_useSimpleSummaryProvider;
        if (obtainStyledAttributes.getBoolean(i, obtainStyledAttributes.getBoolean(i, false))) {
            if (gly0.z == null) {
                gly0.z = new gly0();
            }
            this.g0 = gly0.z;
            i();
        }
        obtainStyledAttributes.recycle();
    }

    public final void A(String str) {
        boolean y = y();
        this.o0 = str;
        u(str);
        boolean y2 = y();
        if (y2 != y) {
            j(y2);
        }
        i();
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
        A(savedState.mText);
    }

    @Override // androidx.preference.Preference
    public final Parcelable r() {
        super.r();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.K) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.mText = this.o0;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void s(Object obj) {
        A(f((String) obj));
    }

    @Override // androidx.preference.Preference
    public final boolean y() {
        return TextUtils.isEmpty(this.o0) || super.y();
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.EditTextPreference.SavedState.1
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
        String mText;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mText = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.mText);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
