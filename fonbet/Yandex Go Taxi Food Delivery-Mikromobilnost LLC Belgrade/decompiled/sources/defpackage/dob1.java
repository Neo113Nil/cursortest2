package defpackage;

import android.graphics.Color;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.go.morphlex.network.MorphlexApi;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.themes.ThemeChangeMode;

/* loaded from: classes6.dex */
public abstract class dob1 {
    public static final int a(ThemeChangeMode themeChangeMode) {
        int i = ivy0.a[themeChangeMode.ordinal()];
        if (i == 1) {
            return kyh0.settings_theme_on;
        }
        if (i == 2) {
            return kyh0.settings_theme_off;
        }
        if (i == 3) {
            return kyh0.settings_theme_auto;
        }
        if (i == 4) {
            return kyh0.settings_theme_system;
        }
        w511.b();
        return 0;
    }

    public static final int b(String str) {
        return Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(str));
    }

    public static MorphlexApi c(on2 on2Var) {
        on2Var.getClass();
        return (MorphlexApi) on2Var.a(GoApiName.TaxiV4, MorphlexApi.class);
    }
}
