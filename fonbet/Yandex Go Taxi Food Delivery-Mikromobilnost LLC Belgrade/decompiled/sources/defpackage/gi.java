package defpackage;

import android.graphics.Typeface;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import java.util.List;
import ru.yandex.taxi.TaxiApplication;

/* loaded from: classes13.dex */
public abstract class gi {
    public static final ro5 a = new ro5(-1.0f);
    public static final ro5 b = new ro5(1.0f);
    public static final qo5 c = new qo5(-1.0f);
    public static final qo5 d = new qo5(1.0f);

    public static j4n a(i6r i6rVar, OverdraftContext overdraftContext, ContextThemeWrapper contextThemeWrapper, yj70 yj70Var) {
        i6rVar.getClass();
        overdraftContext.getClass();
        j4n j4nVar = new j4n();
        j4nVar.a = i6rVar;
        j4nVar.b = yj70Var;
        j4nVar.c = overdraftContext;
        j4nVar.x = new z4g(i6rVar, 18);
        j4nVar.y = new e840(new z4g(i6rVar, 15), new z4g(i6rVar, 14), new z4g(i6rVar, 17), new z4g(i6rVar, 16), new f380(new z4g(i6rVar, 19), 7), 24);
        j4nVar.z = new z4g(i6rVar, 21);
        j4nVar.w = new z4g(i6rVar, 20);
        return j4nVar;
    }

    public static Typeface b(TaxiApplication taxiApplication, String str) {
        return Typeface.createFromAsset(taxiApplication.getAssets(), str);
    }

    public static final Typeface c(TaxiApplication taxiApplication, int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? b(taxiApplication, "fonts/Roboto-Regular.ttf") : b(taxiApplication, "fonts/Roboto-Black.ttf") : b(taxiApplication, "fonts/Roboto-Bold.ttf") : b(taxiApplication, "fonts/Roboto-Medium.ttf") : b(taxiApplication, "fonts/Roboto-Thin.ttf") : b(taxiApplication, "fonts/Roboto-Light.ttf") : b(taxiApplication, "fonts/Roboto-Regular.ttf");
    }

    public static final boolean d(View view) {
        if (view instanceof ViewGroup) {
            h8 h8Var = new h8(3, (ViewGroup) view);
            while (h8Var.hasNext()) {
                if (d((View) h8Var.next())) {
                    return true;
                }
            }
        }
        return view.isAccessibilityFocused();
    }

    public static final b580 e(String str, String str2) {
        return new b580(str, "boolean", str2, new mf70(true), (List) null, 48);
    }

    public static final b580 f(String str, String str2, List list, rf70 rf70Var) {
        return new b580(str, "select", str2, rf70Var, list, 32);
    }
}
