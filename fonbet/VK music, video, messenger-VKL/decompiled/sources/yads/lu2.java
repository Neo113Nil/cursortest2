package yads;

import android.content.Context;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.bdn;
import xsna.ge00;
import xsna.ie00;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.syx;
import xsna.ttp0;
import xsna.v8i0;
import xsna.wzs;
import xsna.y8i0;
import xsna.yok0;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class lu2 extends SuspendLambda implements wzs {
    public v5 b;
    public mu2 c;
    public dp d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ mu2 g;
    public final /* synthetic */ dp h;
    public final /* synthetic */ j00 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu2(mu2 mu2Var, dp dpVar, j00 j00Var, spj spjVar) {
        super(2, spjVar);
        this.g = mu2Var;
        this.h = dpVar;
        this.i = j00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        lu2 lu2Var = new lu2(this.g, this.h, this.i, spjVar);
        lu2Var.f = obj;
        return lu2Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((lu2) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|(1:(1:(3:9|10|11)(2:6|7))(1:12))(2:75|(2:77|78)(1:79))|13|14|15|(4:18|(4:21|(1:67)(0)|31|19)|71|16)|72|73|32|(1:34)(1:64)|(1:36)|(1:38)(1:63)|(1:40)|41|(1:43)(1:62)|44|(1:46)(1:61)|(1:48)|49|(4:51|(1:53)(1:57)|54|(1:56))(2:58|(1:60))|10|11) */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w5 w5Var;
        dp dpVar;
        Object g;
        mu2 mu2Var;
        v5 v5Var;
        String str;
        byte[] address;
        int i;
        lu2 lu2Var = this;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lu2Var.e;
        if (i2 == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) lu2Var.f;
            mu2 mu2Var2 = lu2Var.g;
            mu2Var2.f.b(le1.b, mu2Var2);
            mu2 mu2Var3 = lu2Var.g;
            w5Var = mu2Var3.b;
            v5 v5Var2 = v5.x;
            dpVar = lu2Var.h;
            w5Var.a(v5Var2, null);
            v8i0 v8i0Var = new v8i0(lu2Var.getContext());
            yok0 h = myc0.h(yvjVar, null, null, new hu2(null), 3);
            syx syxVar = syx.b;
            ttp0.d(3, syxVar);
            v8i0Var.k(new v8i0.a(h, syxVar, y8i0.a.b, y8i0.e, new iu2(null), null), false);
            v8i0Var.j(myc0.b(yvjVar, null, null, new ju2(mu2Var3, null), 3).a0(), new ku2(null));
            lu2Var.f = w5Var;
            lu2Var.b = v5Var2;
            lu2Var.c = mu2Var3;
            lu2Var.d = dpVar;
            lu2Var.e = 1;
            g = v8i0Var.g(lu2Var);
            if (g == coroutineSingletons) {
                return coroutineSingletons;
            }
            mu2Var = mu2Var3;
            v5Var = v5Var2;
        } else {
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                mu2 mu2Var4 = lu2Var.g;
                mu2Var4.f.a(le1.b, mu2Var4);
                return s3q0.a;
            }
            dp dpVar2 = lu2Var.d;
            mu2Var = lu2Var.c;
            v5Var = lu2Var.b;
            w5Var = (w5) lu2Var.f;
            kotlin.a.a(obj);
            dpVar = dpVar2;
            g = obj;
        }
        nu2 nu2Var = (nu2) g;
        eu2 eu2Var = mu2Var.g;
        Context context = mu2Var.a;
        rd rdVar = mu2Var.d;
        km0 km0Var = mu2Var.c.a;
        w5 w5Var2 = eu2Var.a;
        v5 v5Var3 = v5.y;
        w5Var2.a(v5Var3, null);
        qx qxVar = new qx(rdVar, km0Var);
        iz2.a.getClass();
        String c = ((uh1) ((jz2) hz2.a(context)).b).c("SessionData");
        String a = ((p63) ne.a().a).a();
        yy2.a.getClass();
        String c2 = ((uh1) ((zy2) xy2.a(context)).b).c("ServerSideClientIP");
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        loop0: while (networkInterfaces.hasMoreElements()) {
            Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
            while (inetAddresses.hasMoreElements()) {
                InetAddress nextElement = inetAddresses.nextElement();
                Enumeration<NetworkInterface> enumeration = networkInterfaces;
                if (!(nextElement instanceof Inet6Address) || (address = ((Inet6Address) nextElement).getAddress()) == null || ((i = address[0] & 240) != 32 && i != 48)) {
                    networkInterfaces = enumeration;
                }
                str = ((Inet6Address) nextElement).getHostAddress();
            }
        }
        str = null;
        v5 v5Var4 = v5Var;
        vu0 a2 = wu0.a(context, eu2Var.b, qxVar, new tq2(), new qb2(vh1.a(context)));
        e00 e00Var = dpVar != null ? dpVar.a : null;
        if (e00Var != null) {
            a2.w = e00Var.b;
        }
        e13 e13Var = dpVar != null ? dpVar.b : null;
        if (e13Var != null) {
            a2.z = e13Var.b().b;
            a2.x = Integer.valueOf(e13Var.c(context));
            a2.y = Integer.valueOf(e13Var.a(context));
        }
        a2.K0 = c;
        a2.J0 = a;
        a2.L0 = c2;
        a2.M0 = str;
        a2.N0 = nu2Var != null ? nu2Var.b : null;
        Map map = dpVar != null ? dpVar.c : null;
        if (map != null) {
            a2.h.putAll(map);
        }
        String a3 = eu2Var.c.a(context, new zu0(a2).toString());
        w5Var2.a(v5Var3);
        e83 e83Var = new e83(a3, nu2Var);
        w5Var.a(v5Var4);
        if (a3 != null) {
            lu2Var = this;
            ob2 ob2Var = lu2Var.g.h;
            dp dpVar3 = lu2Var.h;
            ob2Var.b.getClass();
            gp2 a4 = cp.a(dpVar3);
            ep2 ep2Var = ep2.c;
            a4.b("success", "status");
            a4.b(ob2Var.c.a(), "durations");
            a4.a(nu2Var != null ? nu2Var.b : null, "stub_reason");
            dp2 dp2Var = dp2.c;
            ob2Var.a.a(new fp2("open_bidding_token_generation_result", new LinkedHashMap(a4.a), a4.b));
            bdn bdnVar = bdn.a;
            ge00 U = ie00.a.U();
            fu2 fu2Var = new fu2(lu2Var.i, e83Var, null);
            lu2Var.f = null;
            lu2Var.b = null;
            lu2Var.c = null;
            lu2Var.d = null;
            lu2Var.e = 2;
            if (myc0.k(U, fu2Var, lu2Var) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            lu2Var = this;
            ob2 ob2Var2 = lu2Var.g.h;
            dp dpVar4 = lu2Var.h;
            ob2Var2.b.getClass();
            gp2 a5 = cp.a(dpVar4);
            ep2 ep2Var2 = ep2.c;
            a5.b("error", "status");
            a5.b("Cannot load bidder token. Token generation failed", "failure_reason");
            a5.b(ob2Var2.c.a(), "durations");
            dp2 dp2Var2 = dp2.c;
            ob2Var2.a.a(new fp2("open_bidding_token_generation_result", new LinkedHashMap(a5.a), a5.b));
            bdn bdnVar2 = bdn.a;
            ge00 U2 = ie00.a.U();
            gu2 gu2Var = new gu2(lu2Var.i, null);
            lu2Var.f = null;
            lu2Var.b = null;
            lu2Var.c = null;
            lu2Var.d = null;
            lu2Var.e = 3;
            if (myc0.k(U2, gu2Var, lu2Var) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        mu2 mu2Var42 = lu2Var.g;
        mu2Var42.f.a(le1.b, mu2Var42);
        return s3q0.a;
    }
}
