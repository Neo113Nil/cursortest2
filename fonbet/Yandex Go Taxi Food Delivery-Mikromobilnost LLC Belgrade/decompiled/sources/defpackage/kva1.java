package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class kva1 {
    public static final void a(dme dmeVar, sls slsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2006018146);
        dmw0 dmw0Var = btsVar2.a;
        int i2 = i | (btsVar2.k(dmeVar) ? 4 : 2) | (btsVar2.e(slsVar) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            xw91 xw91Var = ((nx2) btsVar2.m(uy2.c)).b;
            byk0 c = cyk0.c(16.0f);
            f530 b = q791.b(f530Var, null, null, false, null, new awk0(0), slsVar, 12);
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, b);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar2, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar2, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d);
            so5 so5Var = x4c.H;
            f530 c2 = bzk0.c(ljs0.m(new ypu(so5Var), 60.0f), AppColor$Palette.ControlMinor, c);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d3 = b.d(btsVar2, c2);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, d2);
            qje.W(btsVar2, wlsVar2, o2);
            vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar);
            qje.W(btsVar2, wlsVar4, d3);
            jrb1.a(cj6.a.a(ljs0.m(c530.a, 20.0f), x4c.y), dmeVar.d, dmeVar.e, btsVar2, 0);
            btsVar2.t(true);
            jeb1.f(krb1.b(dmeVar.b, btsVar2), an91.o(new ypu(so5Var), 6.0f, 8.0f, 6.0f, 0.0f, 8), null, uh6.K(16.0f, 4294967296L), 0L, null, new sjy0(3), 0L, 2, false, 1, 0, null, xya1.e(btsVar2).g.b, btsVar2, 805306368, 48, 13684);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jhl0(dmeVar, slsVar, f530Var, i, 1);
        }
    }

    public static final void b(dme dmeVar, sls slsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(239257179);
        int i2 = 4;
        int i3 = (btsVar.k(dmeVar) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.k(f530Var) ? 256 : 128);
        int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new n7l0(i2, slsVar);
                btsVar.o0(Q);
            }
            ulb1.a(f530Var, false, null, (sls) Q, wwg.S(-735574148, true, new ihl0(dmeVar, i4), btsVar), btsVar, ((i3 >> 6) & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jhl0(dmeVar, slsVar, f530Var, i, 0);
        }
    }

    public static final CompletableFuture c(noh nohVar) {
        CompletableFuture completableFuture = new CompletableFuture();
        completableFuture.handle((BiFunction) new pw7(3, new bns(2, nohVar)));
        nohVar.w(new sxo(21, completableFuture, nohVar));
        return completableFuture;
    }

    public static void d() {
        int i = pb2.d;
    }

    public static void e() {
        int i = pb2.d;
    }

    public static RippleDrawable f(int i, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{dng0.payButtonGenericBackground});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        GradientDrawable gradientDrawable = (GradientDrawable) drawable.mutate();
        gradientDrawable.setCornerRadius(i);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{dng0.payButtonGenericRippleColor});
        int color = obtainStyledAttributes2.getColor(0, 0);
        obtainStyledAttributes2.recycle();
        return new RippleDrawable(ColorStateList.valueOf(color), gradientDrawable, null);
    }
}
