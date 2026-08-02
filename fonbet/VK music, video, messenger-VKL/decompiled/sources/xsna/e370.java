package xsna;

import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import kotlin.Pair;

/* compiled from: NoOpCacheErrorLogger.java */
/* loaded from: classes.dex */
public final class e370 {
    public static e370 a;
    public static gfx0 b;
    public static ifx0 c;
    public static SuperappUiRouterBridge d;
    public static vdx0 e;
    public static wdx0 f;
    public static sgn0 g;
    public static k0x h;
    public static udx0 i;
    public static rex0 j;
    public static efx0 k;
    public static sex0 l;
    public static gnl m;
    public static wex0 n;
    public static cfx0 o;
    public static tyx p;
    public static zex0 q;
    public static afx0 r;
    public static dex0 s;
    public static gqo t;
    public static onl u;
    public static zdx0 v;
    public static y6l w;
    public static tgn0 x;
    public static qex0 y;

    public static final void a(bx2 bx2Var) {
        b(bx2Var);
        bx2Var.r = true;
        bx2Var.c = true;
        bx2Var.d = true;
    }

    public static final void b(bx2 bx2Var) {
        Iterator it = RegistrationStatParamsFactory.a().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            bx2Var.o((String) pair.d(), (String) pair.g());
        }
    }

    public static final void c(int i2, StringBuilder sb) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("?");
            if (i3 < i2 - 1) {
                sb.append(StringUtils.COMMA);
            }
        }
    }

    public static final asp d(Enum[] enumArr) {
        return new asp(enumArr);
    }

    public static final bx2 e(xy2 xy2Var) {
        bx2 bx2Var = new bx2(xy2Var.d(), new ax2(xy2Var), xy2Var.b());
        bx2Var.i = xy2Var.c();
        bx2Var.j.putAll(xy2Var.getParamsMap());
        return bx2Var;
    }
}
