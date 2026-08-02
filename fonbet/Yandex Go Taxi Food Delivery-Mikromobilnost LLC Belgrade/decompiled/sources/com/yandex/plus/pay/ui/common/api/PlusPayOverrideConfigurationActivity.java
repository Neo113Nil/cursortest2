package com.yandex.plus.pay.ui.common.api;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.plus.ui.core.theme.PlusTheme;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.tpd0;
import defpackage.w511;
import java.util.Locale;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00060\fR\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/plus/pay/ui/common/api/PlusPayOverrideConfigurationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "layoutId", "<init>", "(I)V", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "Landroid/content/res/AssetManager;", "getAssets", "()Landroid/content/res/AssetManager;", "Landroid/content/res/Resources$Theme;", "getTheme", "()Landroid/content/res/Resources$Theme;", "Ljava/util/Locale;", "locale", "Lcom/yandex/plus/ui/core/theme/PlusTheme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, UrbanAdsBottomSheetFragment.THEME_ID, "", "contentScaleFactor", "Lzy11;", "overrideConfiguration", "(Ljava/util/Locale;Lcom/yandex/plus/ui/core/theme/PlusTheme;IF)V", CA20Status.STATUS_USER_I, "Landroid/content/Context;", "internalContext", "Landroid/content/Context;", "pay-sdk-ui-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PlusPayOverrideConfigurationActivity extends AppCompatActivity {
    private Context internalContext;
    private final int layoutId;

    public PlusPayOverrideConfigurationActivity(int i) {
        super(i);
        this.layoutId = i;
    }

    public static /* synthetic */ void overrideConfiguration$default(PlusPayOverrideConfigurationActivity plusPayOverrideConfigurationActivity, Locale locale, PlusTheme plusTheme, int i, float f, int i2, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: overrideConfiguration");
            return;
        }
        if ((i2 & 8) != 0) {
            f = 1.0f;
        }
        plusPayOverrideConfigurationActivity.overrideConfiguration(locale, plusTheme, i, f);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        AssetManager assets;
        Context context = this.internalContext;
        return (context == null || (assets = context.getAssets()) == null) ? super.getAssets() : assets;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources;
        Context context = this.internalContext;
        return (context == null || (resources = context.getResources()) == null) ? super.getResources() : resources;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme;
        Context context = this.internalContext;
        return (context == null || (theme = context.getTheme()) == null) ? super.getTheme() : theme;
    }

    public final void overrideConfiguration(Locale locale, PlusTheme theme, int themeId, float contentScaleFactor) {
        getDelegate().setLocalNightMode(tpd0.a(this, theme) ? 2 : 1);
        Configuration configuration = new Configuration(getResources().getConfiguration());
        configuration.setLocale(locale);
        configuration.densityDpi = (int) (configuration.densityDpi * contentScaleFactor);
        this.internalContext = new ContextThemeWrapper(createConfigurationContext(configuration), themeId);
    }
}
