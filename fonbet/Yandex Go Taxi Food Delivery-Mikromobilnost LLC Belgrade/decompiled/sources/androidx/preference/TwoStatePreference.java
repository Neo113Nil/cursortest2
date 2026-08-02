package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;

/* loaded from: classes10.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean i0;
    public CharSequence j0;
    public CharSequence k0;
    public boolean l0;
    public boolean m0;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void A(boolean z) {
        boolean z2 = this.i0 != z;
        if (z2 || !this.l0) {
            this.i0 = z;
            this.l0 = true;
            if (z()) {
                boolean z3 = !z;
                if (z()) {
                    z3 = this.b.d().getBoolean(this.D, z3);
                }
                if (z != z3) {
                    SharedPreferences.Editor c = this.b.c();
                    c.putBoolean(this.D, z);
                    if (!this.b.e) {
                        c.apply();
                    }
                }
            }
            if (z2) {
                j(y());
                i();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(View view) {
        boolean z;
        int i;
        if (!(view instanceof TextView)) {
            return;
        }
        TextView textView = (TextView) view;
        if (this.i0 && !TextUtils.isEmpty(this.j0)) {
            textView.setText(this.j0);
        } else {
            if (this.i0 || TextUtils.isEmpty(this.k0)) {
                z = true;
                if (z) {
                    CharSequence g = g();
                    if (!TextUtils.isEmpty(g)) {
                        textView.setText(g);
                        z = false;
                    }
                }
                i = z ? 8 : 0;
                if (i == textView.getVisibility()) {
                    textView.setVisibility(i);
                    return;
                }
                return;
            }
            textView.setText(this.k0);
        }
        z = false;
        if (z) {
        }
        if (z) {
        }
        if (i == textView.getVisibility()) {
        }
    }

    @Override // androidx.preference.Preference
    public final void n() {
        boolean z = !this.i0;
        a(Boolean.valueOf(z));
        A(z);
    }

    @Override // androidx.preference.Preference
    public final Object p(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    public final void q(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.q(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.q(savedState.getSuperState());
        A(savedState.mChecked);
    }

    @Override // androidx.preference.Preference
    public final Parcelable r() {
        super.r();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.K) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.mChecked = this.i0;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void s(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (z()) {
            booleanValue = this.b.d().getBoolean(this.D, booleanValue);
        }
        A(booleanValue);
    }

    @Override // androidx.preference.Preference
    public final boolean y() {
        boolean z = this.m0;
        boolean z2 = this.i0;
        if (!z) {
            z2 = !z2;
        }
        return z2 || super.y();
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.TwoStatePreference.SavedState.1
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
        boolean mChecked;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mChecked = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mChecked ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
