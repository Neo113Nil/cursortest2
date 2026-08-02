package com.ybsdk.feature.settings.internal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;
import defpackage.cma1;
import defpackage.dzh0;
import defpackage.eaj0;
import defpackage.eer0;
import defpackage.ei;
import defpackage.foh0;
import defpackage.g8e;
import defpackage.ibv;
import defpackage.ny61;
import defpackage.o861;
import defpackage.rbv;
import defpackage.tls;
import defpackage.ubh0;
import defpackage.v3i0;
import defpackage.v4b1;
import defpackage.ykn0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/settings/internal/view/SettingsThemeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Leer0;", ClidProvider.STATE, "Lzy11;", "render", "(Leer0;)V", "", "isActive", "setA11yText", "(Z)V", "Lkotlin/Function1;", "onCheckedListener", "Ltls;", "getOnCheckedListener", "()Ltls;", "setOnCheckedListener", "(Ltls;)V", "Lo861;", "binding", "Lo861;", "Lcom/ybsdk/widgets/common/checkbox/CheckBoxView;", "getCheckBox", "()Lcom/ybsdk/widgets/common/checkbox/CheckBoxView;", "checkBox", "feature-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SettingsThemeView extends LinearLayout {
    private final o861 binding;
    private tls onCheckedListener;

    public SettingsThemeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(foh0.ybsdk_setting_theme_layout, this);
        int i2 = ubh0.theme_checkbox;
        CheckBoxView checkBoxView = (CheckBoxView) cma1.O(i2, this);
        if (checkBoxView != null) {
            i2 = ubh0.theme_preview;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
            if (appCompatImageView != null) {
                i2 = ubh0.theme_title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i2, this);
                if (appCompatTextView != null) {
                    this.binding = new o861(this, checkBoxView, appCompatImageView, appCompatTextView);
                    setOrientation(1);
                    int i3 = 17;
                    setGravity(17);
                    TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, v3i0.YbSdkSettingsThemeView, 0, 0);
                    Drawable drawable = obtainStyledAttributes.getDrawable(v3i0.YbSdkSettingsThemeView_ybsdk_theme_preview_image);
                    ibv ibvVar = drawable != null ? new ibv(drawable) : null;
                    String string = obtainStyledAttributes.getString(v3i0.YbSdkSettingsThemeView_ybsdk_theme_title);
                    render(new eer0(ibvVar, string != null ? g8e.i(Text.Companion, string) : null));
                    obtainStyledAttributes.recycle();
                    setOnClickListener(new eaj0(i3, this));
                    checkBoxView.setOnCheckedChangeListener(new ykn0(8, this));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(SettingsThemeView settingsThemeView, View view) {
        settingsThemeView.binding.b.setChecked(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(SettingsThemeView settingsThemeView, CheckBoxView checkBoxView, boolean z) {
        tls tlsVar = settingsThemeView.onCheckedListener;
        if (tlsVar != null) {
            tlsVar.invoke(Boolean.valueOf(z));
        }
    }

    public final CheckBoxView getCheckBox() {
        return this.binding.b;
    }

    public final tls getOnCheckedListener() {
        return this.onCheckedListener;
    }

    public final void render(eer0 state) {
        rbv rbvVar = state.a;
        if (rbvVar != null) {
            v4b1.k(rbvVar, this.binding.c, null, null, 6);
        }
        AppCompatTextView appCompatTextView = this.binding.d;
        Text text = state.b;
        appCompatTextView.setText(text != null ? d.a(getContext(), text) : null);
    }

    public final void setA11yText(boolean isActive) {
        if (!isActive) {
            setContentDescription(null);
            androidx.core.view.b.p(this, null);
            return;
        }
        setContentDescription(((Object) this.binding.d.getText()) + Extension.FIX_SPACE + getContext().getString(dzh0.ybsdk_settings_theme_active_a11y));
        androidx.core.view.b.p(this, new ei(19));
    }

    public final void setOnCheckedListener(tls tlsVar) {
        this.onCheckedListener = tlsVar;
    }

    public SettingsThemeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SettingsThemeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SettingsThemeView(Context context) {
        this(context, null, 0, 6, null);
    }
}
