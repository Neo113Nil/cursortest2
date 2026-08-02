package defpackage;

import android.graphics.Color;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.utils.theme.LateInitColorCallbackImpl;
import com.ybsdk.core.utils.ColorModel;
import kotlin.Result;

/* loaded from: classes3.dex */
public abstract class lvy0 {
    public static final ColorModel a(Themes themes, ColorModel colorModel, tls tlsVar) {
        ColorModel b = b((String) themes.getLight(), (String) themes.getDark(), tlsVar);
        return b == null ? colorModel : b;
    }

    public static final ColorModel b(String str, String str2, tls tlsVar) {
        ColorModel f = f(str);
        if (f == null) {
            tlsVar.invoke("(light-theme)");
        }
        ColorModel f2 = f(str2);
        if (f2 == null) {
            tlsVar.invoke("(dark-theme)");
        }
        return (f == null || f2 == null) ? f == null ? f2 : f : new ColorModel.LateInitColor(new LateInitColorCallbackImpl(f, f2));
    }

    public static ColorModel c(Themes themes) {
        String str = (String) themes.getLight();
        String str2 = (String) themes.getDark();
        ColorModel f = f(str);
        ColorModel f2 = f(str2);
        return (f == null || f2 == null) ? f == null ? f2 : f : new ColorModel.LateInitColor(new LateInitColorCallbackImpl(f, f2));
    }

    public static ColorModel e(String str, String str2) {
        ColorModel f = f(str);
        ColorModel f2 = f(str2);
        return (f == null || f2 == null) ? f == null ? f2 : f : new ColorModel.LateInitColor(new LateInitColorCallbackImpl(f, f2));
    }

    public static final ColorModel f(String str) {
        Object failure;
        if (str == null) {
            return null;
        }
        try {
            failure = Integer.valueOf(Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(evu0.Q(ShimmerDivHandler.NUMBER_SING, str))));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (!(failure instanceof Result.Failure)) {
            failure = new ColorModel.Raw(((Number) failure).intValue());
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            x4c.g("Color parsing error", a, "Invalid color is ".concat(str), null, 8);
        }
        return (ColorModel) (failure instanceof Result.Failure ? null : failure);
    }
}
