package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.feature.settings.internal.view.SettingsThemeView;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;

/* loaded from: classes3.dex */
public final class o861 implements zo31 {
    public final SettingsThemeView a;
    public final CheckBoxView b;
    public final AppCompatImageView c;
    public final AppCompatTextView d;

    public o861(SettingsThemeView settingsThemeView, CheckBoxView checkBoxView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.a = settingsThemeView;
        this.b = checkBoxView;
        this.c = appCompatImageView;
        this.d = appCompatTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
