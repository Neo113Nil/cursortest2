package xsna;

import android.R;
import android.content.res.ColorStateList;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;

/* compiled from: MaterialRadioButton.java */
/* loaded from: classes13.dex */
public final class pm10 extends AppCompatRadioButton {
    public static final int h = R$style.Widget_MaterialComponents_CompoundButton_RadioButton;
    public static final int[][] i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    @Nullable
    public ColorStateList f;
    public boolean g;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f == null) {
            int d = dm10.d(R$attr.colorControlActivated, this);
            int d2 = dm10.d(R$attr.colorOnSurface, this);
            int d3 = dm10.d(R$attr.colorSurface, this);
            this.f = new ColorStateList(i, new int[]{dm10.g(1.0f, d3, d), dm10.g(0.54f, d3, d2), dm10.g(0.38f, d3, d2), dm10.g(0.38f, d3, d2)});
        }
        return this.f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.g && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.g = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
