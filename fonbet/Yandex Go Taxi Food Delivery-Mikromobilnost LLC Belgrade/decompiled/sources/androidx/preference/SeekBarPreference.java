package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import defpackage.fog0;
import defpackage.jme0;
import defpackage.mbh0;
import defpackage.n2i0;

/* loaded from: classes10.dex */
public class SeekBarPreference extends Preference {
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public SeekBar n0;
    public TextView o0;
    public final boolean p0;
    public final boolean q0;
    public final boolean r0;
    public final SeekBar.OnSeekBarChangeListener s0;
    public final View.OnKeyListener t0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int i = fog0.seekBarPreferenceStyle;
        this.s0 = new SeekBar.OnSeekBarChangeListener() { // from class: androidx.preference.SeekBarPreference.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                if (z) {
                    SeekBarPreference seekBarPreference = SeekBarPreference.this;
                    if (seekBarPreference.r0 || !seekBarPreference.m0) {
                        seekBarPreference.B(seekBar);
                        return;
                    }
                }
                SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
                int i3 = i2 + seekBarPreference2.j0;
                TextView textView = seekBarPreference2.o0;
                if (textView != null) {
                    textView.setText(String.valueOf(i3));
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                SeekBarPreference.this.m0 = true;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                SeekBarPreference.this.m0 = false;
                int progress = seekBar.getProgress();
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (progress + seekBarPreference.j0 != seekBarPreference.i0) {
                    seekBarPreference.B(seekBar);
                }
            }
        };
        this.t0 = new View.OnKeyListener() { // from class: androidx.preference.SeekBarPreference.2
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if ((!seekBarPreference.p0 && (i2 == 21 || i2 == 22)) || i2 == 23 || i2 == 66) {
                    return false;
                }
                SeekBar seekBar = seekBarPreference.n0;
                if (seekBar != null) {
                    return seekBar.onKeyDown(i2, keyEvent);
                }
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n2i0.SeekBarPreference, i, 0);
        this.j0 = obtainStyledAttributes.getInt(n2i0.SeekBarPreference_min, 0);
        int i2 = obtainStyledAttributes.getInt(n2i0.SeekBarPreference_android_max, 100);
        int i3 = this.j0;
        i2 = i2 < i3 ? i3 : i2;
        if (i2 != this.k0) {
            this.k0 = i2;
            i();
        }
        int i4 = obtainStyledAttributes.getInt(n2i0.SeekBarPreference_seekBarIncrement, 0);
        if (i4 != this.l0) {
            this.l0 = Math.min(this.k0 - this.j0, Math.abs(i4));
            i();
        }
        this.p0 = obtainStyledAttributes.getBoolean(n2i0.SeekBarPreference_adjustable, true);
        this.q0 = obtainStyledAttributes.getBoolean(n2i0.SeekBarPreference_showSeekBarValue, false);
        this.r0 = obtainStyledAttributes.getBoolean(n2i0.SeekBarPreference_updatesContinuously, false);
        obtainStyledAttributes.recycle();
    }

    public final void A(int i, boolean z) {
        int i2 = this.j0;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.k0;
        if (i > i3) {
            i = i3;
        }
        if (i != this.i0) {
            this.i0 = i;
            TextView textView = this.o0;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (z()) {
                int i4 = ~i;
                if (z()) {
                    i4 = this.b.d().getInt(this.D, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor c = this.b.c();
                    c.putInt(this.D, i);
                    if (!this.b.e) {
                        c.apply();
                    }
                }
            }
            if (z) {
                i();
            }
        }
    }

    public final void B(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.j0;
        if (progress != this.i0) {
            a(Integer.valueOf(progress));
            A(progress, false);
        }
    }

    @Override // androidx.preference.Preference
    public final void m(jme0 jme0Var) {
        super.m(jme0Var);
        jme0Var.a.setOnKeyListener(this.t0);
        this.n0 = (SeekBar) jme0Var.W(mbh0.seekbar);
        TextView textView = (TextView) jme0Var.W(mbh0.seekbar_value);
        this.o0 = textView;
        if (this.q0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.o0 = null;
        }
        SeekBar seekBar = this.n0;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.s0);
        this.n0.setMax(this.k0 - this.j0);
        int i = this.l0;
        SeekBar seekBar2 = this.n0;
        if (i != 0) {
            seekBar2.setKeyProgressIncrement(i);
        } else {
            this.l0 = seekBar2.getKeyProgressIncrement();
        }
        this.n0.setProgress(this.i0 - this.j0);
        int i2 = this.i0;
        TextView textView2 = this.o0;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.n0.setEnabled(h());
    }

    @Override // androidx.preference.Preference
    public final Object p(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public final void q(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.q(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.q(savedState.getSuperState());
        this.i0 = savedState.mSeekBarValue;
        this.j0 = savedState.mMin;
        this.k0 = savedState.mMax;
        i();
    }

    @Override // androidx.preference.Preference
    public final Parcelable r() {
        super.r();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.K) {
            return absSavedState;
        }
        SavedState savedState = new SavedState(absSavedState);
        savedState.mSeekBarValue = this.i0;
        savedState.mMin = this.j0;
        savedState.mMax = this.k0;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void s(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int intValue = ((Integer) obj).intValue();
        if (z()) {
            intValue = this.b.d().getInt(this.D, intValue);
        }
        A(intValue, true);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.SeekBarPreference.SavedState.1
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
        int mMax;
        int mMin;
        int mSeekBarValue;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mSeekBarValue = parcel.readInt();
            this.mMin = parcel.readInt();
            this.mMax = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mSeekBarValue);
            parcel.writeInt(this.mMin);
            parcel.writeInt(this.mMax);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
