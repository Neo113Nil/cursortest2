package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.View;
import com.google.android.gms.internal.measurement.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.animation.NavigationDirection;

/* loaded from: classes11.dex */
public abstract class mwa1 {
    public static final void a(View view, boolean z, NavigationDirection navigationDirection, Runnable runnable, Runnable runnable2) {
        int i = cul0.a[navigationDirection.ordinal()];
        float f = 0.0f;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    w511.b();
                    return;
                } else {
                    runnable.run();
                    runnable2.run();
                    return;
                }
            }
            if (z) {
                view.setTranslationX(-ofp0.b);
            } else {
                f = ofp0.b;
            }
        } else if (z) {
            view.setTranslationX(ofp0.b);
        } else {
            f = -ofp0.b;
        }
        cma1.g(f, view).withStartAction(runnable).withEndAction(runnable2).setDuration(300L);
    }

    public static /* synthetic */ void b(View view, boolean z, NavigationDirection navigationDirection) {
        int i = 1;
        a(view, z, navigationDirection, new d82(i), new d82(i));
    }

    public static final nxi c(View view) {
        Context context = view.getContext();
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if ((context2 instanceof Activity) || (context2 instanceof InputMethodService) || (context2 instanceof Application)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context2 = contextWrapper.getBaseContext();
        }
        context2 = null;
        if (context2 == null) {
            Configuration configuration = context.getResources().getConfiguration();
            jwi c = gwk0.c(context);
            long o = cl91.o(configuration.screenWidthDp, configuration.screenHeightDp);
            long R = c.R(o);
            return new nxi((((int) Float.intBitsToFloat((int) (R & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((int) Float.intBitsToFloat((int) (R >> 32))) << 32), o);
        }
        y751.a.getClass();
        z751 z751Var = x751.b;
        int i = Build.VERSION.SDK_INT;
        hi6 hi6Var = (i >= 34 ? hwi.b : i >= 30 ? ji6.b : zoy0.x).k(context2, z751Var.b).a;
        long height = (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & hi6Var.c().height()) | (hi6Var.c().width() << 32);
        return new nxi(height, gwk0.c(context2).f(rzo.a0(height)));
    }

    public static final String d(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / pow;
        return max > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static r691 e(Object obj) {
        if (obj == null) {
            return r691.A5;
        }
        if (obj instanceof String) {
            return new a791((String) obj);
        }
        if (obj instanceof Double) {
            return new n591((Double) obj);
        }
        if (obj instanceof Long) {
            return new n591(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new n591(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new b591((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                ny61.g("Invalid value type");
                return null;
            }
            w491 w491Var = new w491();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                w491Var.l(w491Var.j(), e(it.next()));
            }
            return w491Var;
        }
        i691 i691Var = new i691();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            r691 e = e(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                i691Var.f((String) obj2, e);
            }
        }
        return i691Var;
    }

    public static r691 f(s0 s0Var) {
        if (s0Var == null) {
            return r691.z5;
        }
        int z = s0Var.z() - 1;
        if (z == 1) {
            return s0Var.t() ? new a791(s0Var.u()) : r691.G5;
        }
        if (z == 2) {
            return s0Var.x() ? new n591(Double.valueOf(s0Var.y())) : new n591(null);
        }
        if (z == 3) {
            return s0Var.v() ? new b591(Boolean.valueOf(s0Var.w())) : new b591(null);
        }
        if (z != 4) {
            ny61.g("Unknown type found. Cannot convert entity");
            return null;
        }
        List r = s0Var.r();
        ArrayList arrayList = new ArrayList();
        Iterator it = r.iterator();
        while (it.hasNext()) {
            arrayList.add(f((s0) it.next()));
        }
        return new s691(s0Var.s(), arrayList);
    }
}
