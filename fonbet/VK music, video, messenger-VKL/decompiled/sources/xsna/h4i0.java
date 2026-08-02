package xsna;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: SeekbarUI.kt */
/* loaded from: classes3.dex */
public final class h4i0 implements SeekBar.OnSeekBarChangeListener {
    public final y17 b;
    public final l07 c;
    public final mb40 d;
    public boolean e = true;
    public boolean f = true;
    public boolean g = true;
    public int h;
    public boolean i;
    public int j;

    public h4i0(y17 y17Var, l07 l07Var, mb40 mb40Var) {
        this.b = y17Var;
        this.c = l07Var;
        this.d = mb40Var;
        y17Var.t.setOnSeekBarChangeListener(this);
        a(l07Var.t, true, false);
    }

    public final void a(int i, boolean z, boolean z2) {
        SeekBar seekBar = this.b.t;
        if (this.h == i && this.i == z && !z2) {
            return;
        }
        this.h = i;
        this.i = z;
        seekBar.setEnabled(z);
        Drawable mutate = seekBar.getThumb().mutate();
        int i2 = z ? i : 0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(i2, mode);
        LayerDrawable layerDrawable = (LayerDrawable) seekBar.getProgressDrawable().mutate();
        layerDrawable.getDrawable(1).mutate().setColorFilter(i, mode);
        layerDrawable.getDrawable(2).mutate().setColorFilter(i, mode);
    }

    public final void g(int i, int i2) {
        String format = String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60)}, 2));
        y17 y17Var = this.b;
        TextView textView = y17Var.h;
        TextView textView2 = y17Var.j;
        if (!TextUtils.equals(format, textView2.getText())) {
            textView2.setText(format);
        }
        int max = Math.max(0, i);
        String format2 = String.format(Locale.getDefault(), "-%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(max / 60), Integer.valueOf(max % 60)}, 2));
        if (TextUtils.equals(format2, textView.getText())) {
            return;
        }
        textView.setText(format2);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (!z || seekBar.getMax() == 0) {
            return;
        }
        int i2 = this.j / 1000;
        int i3 = i / 1000;
        int i4 = i2 - i3;
        if (i4 <= 0) {
            i4 = 0;
        }
        if (i4 > i2) {
            i4 = i2;
        }
        if (i3 <= 0) {
            i3 = 0;
        }
        if (i3 <= i2) {
            i2 = i3;
        }
        g(i4, i2);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.g = false;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.d.L2(new gz6(seekBar.getProgress()));
        this.g = true;
    }
}
