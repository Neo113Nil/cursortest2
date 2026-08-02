package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: RxApiRequest.kt */
/* loaded from: classes.dex */
public class rsg0<T> extends xz2<T> {
    public rsg0(String str) {
        super(str);
    }

    public static io.reactivex.rxjava3.internal.operators.observable.f0 D0(rsg0 rsg0Var) {
        rsg0Var.getClass();
        return rsg0Var.v0(new g03(), null).r0(vx2.d.m()).a0(BuildInfo.h() ? new yv90(io.reactivex.rxjava3.android.schedulers.a.b(), new Throwable()) : io.reactivex.rxjava3.android.schedulers.a.b()).K();
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 T(rsg0 rsg0Var) {
        rsg0Var.getClass();
        return rsg0Var.v0(new g03(), null).r0(vx2.d.m()).Z(io.reactivex.rxjava3.core.g.b, vx2.d.r(), false);
    }

    public static io.reactivex.rxjava3.internal.operators.observable.f0 W(rsg0 rsg0Var, int i) {
        return rsg0Var.v0(new g03(), null).r0(vx2.d.m()).Z(io.reactivex.rxjava3.core.g.b, vx2.d.r(), (i & 2) == 0).K();
    }

    public static io.reactivex.rxjava3.internal.operators.observable.b1 Z(rsg0 rsg0Var) {
        return new io.reactivex.rxjava3.internal.operators.observable.b1(rsg0Var.v0(new g03(), null).r0(vx2.d.m()));
    }

    public static io.reactivex.rxjava3.internal.operators.observable.b0 a0(rsg0 rsg0Var) {
        return rsg0Var.v0(new g03(), null);
    }

    public static io.reactivex.rxjava3.internal.operators.observable.l2 l0(rsg0 rsg0Var, la2 la2Var, int i) {
        if ((i & 2) != 0) {
            la2Var = null;
        }
        return rsg0Var.v0(new g03(), la2Var).r0(vx2.d.m());
    }

    public static io.reactivex.rxjava3.internal.operators.observable.f0 w0(rsg0 rsg0Var) {
        return rsg0Var.v0(new g03(), null).r0(vx2.d.m()).K();
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 y0(rsg0 rsg0Var, jx2 jx2Var, qyn0 qyn0Var, int i) {
        g03 g03Var = jx2Var;
        if ((i & 1) != 0) {
            g03Var = null;
        }
        if ((i & 2) != 0) {
            qyn0Var = null;
        }
        if (g03Var == null) {
            rsg0Var.getClass();
            g03Var = new g03();
        }
        return rsg0Var.v0(g03Var, qyn0Var).r0(vx2.d.m()).a0(BuildInfo.h() ? new yv90(io.reactivex.rxjava3.android.schedulers.a.b(), new Throwable()) : io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public void B(String str, String str2) {
        this.l = str;
        this.m = str2;
    }

    public final void C(int i, String str) {
        this.j.put(str, String.valueOf(i));
    }

    public final void D(long j, String str) {
        this.j.put(str, String.valueOf(j));
    }

    public final void F(UserId userId, String str) {
        if (userId != null) {
            this.j.put(str, String.valueOf(userId.b));
        }
    }

    public final void G(String str, Iterable iterable) {
        K(str.toString(), j5g.g0(iterable, StringUtils.COMMA, null, null, 0, null, 62));
    }

    public final void K(String str, String str2) {
        if (str2 != null) {
            this.j.put(str, str2);
        }
    }

    public final void M(String str, List list) {
        K(str.toString(), j5g.g0(list, StringUtils.COMMA, null, null, 0, new tcu(23), 30));
    }

    public final void R(String str, boolean z) {
        this.j.put(str, z ? "1" : "0");
    }

    public final io.reactivex.rxjava3.disposables.c p() {
        return y0(this, null, null, 3).subscribe(new a970(new kdw(18), 1), new y7c(new amp(25), 1));
    }

    public final T u(long j) {
        try {
            io.reactivex.rxjava3.core.q v0 = v0(new g03(), null);
            if (j > 0) {
                v0 = v0.y0(j, TimeUnit.MILLISECONDS);
            }
            return (T) v0.a();
        } catch (Exception unused) {
            return null;
        }
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 v0(g03 g03Var, izs izsVar) {
        xz2.o(this.b, this.j);
        int i = 2;
        io.reactivex.rxjava3.internal.operators.observable.b0 F = new io.reactivex.rxjava3.internal.operators.observable.q(new vgz(g03Var, this, izsVar)).F(new kos(new jos(this, 1), 3)).F(new va3(new pej(this), i));
        a1v a1vVar = new a1v(new z0v(this), i);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.observable.c0(F, a1vVar, kVar).E(new b720(new l8m(this, 3), 2), io.reactivex.rxjava3.internal.functions.a.d, kVar, kVar);
    }
}
