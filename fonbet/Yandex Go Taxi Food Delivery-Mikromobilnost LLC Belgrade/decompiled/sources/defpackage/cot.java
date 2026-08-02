package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yandex.go.logger.GoMangoThrowable;
import com.yandex.pulse.metrics.MetricsState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.analytics.q;

/* loaded from: classes.dex */
public final class cot implements ke00, bx60, w32, x0b0 {
    public static final cot c = new cot(1, (Object) null);
    public final /* synthetic */ int a;
    public final Object b;

    public cot(hxk hxkVar) {
        this.a = 21;
        this.b = hxkVar.a.b();
    }

    @Override // defpackage.ke00
    public void a(int i, String str, Throwable th, String str2, fe00 fe00Var) {
        ac20 ac20Var = (ac20) this.b;
        if (i == 10) {
            if (str2 == null || str2.length() == 0) {
                return;
            }
            ((q) ac20Var).c(str2, th != null ? ffx.i(th) : null);
            return;
        }
        if (i != 15) {
            if (i != 20) {
                return;
            }
            if (str2 == null || str2.length() == 0) {
                str2 = th != null ? th.toString() : null;
            }
            String X = a.X(fe00Var.a(qoi0.e(bot.class)), ":", null, null, dot.a, 30);
            if (str2 == null) {
                str2 = "";
            }
            String concat = "WTF: ".concat(str2);
            if (X.length() > 0) {
                ((q) ac20Var).e(X, concat, th == null ? new GoMangoThrowable(fe00Var.b(qoi0.e(got.class)), 6) : th);
            } else {
                ((q) ac20Var).f(concat, th == null ? new GoMangoThrowable(fe00Var.b(qoi0.e(got.class)), 6) : th);
            }
            ((q) ac20Var).i(concat, th);
            return;
        }
        if (str2 == null || str2.length() == 0) {
            str2 = th != null ? th.toString() : null;
        }
        String X2 = a.X(fe00Var.a(qoi0.e(bot.class)), ":", null, null, dot.a, 30);
        if (str2 == null || str2.length() == 0) {
            return;
        }
        if (X2.length() > 0) {
            if (th == null) {
                th = new GoMangoThrowable(fe00Var.b(qoi0.e(got.class)), 6);
            }
            ((q) ac20Var).e(X2, str2, th);
        } else {
            if (th == null) {
                th = new GoMangoThrowable(fe00Var.b(qoi0.e(got.class)), 6);
            }
            ((q) ac20Var).f(str2, th);
        }
    }

    @Override // defpackage.ke00
    public boolean b(int i) {
        return i == 10 || i == 15 || i == 20;
    }

    @Override // defpackage.w32
    public void c(Bundle bundle) {
        ((d32) ((c32) this.b)).a("clx", "_ae", bundle);
    }

    public u1m d(u1m u1mVar) {
        String a;
        lne lneVar;
        ls20 ls20Var = (ls20) this.b;
        u1m u1mVar2 = null;
        if (ls20Var.b.c.b && (a = ls20Var.a.a()) != null) {
            Set N0 = a.N0(ls20Var.c.a);
            if (N0.isEmpty()) {
                N0 = null;
            }
            lneVar = new lne(a, N0);
        } else {
            lneVar = null;
        }
        if (lneVar == null) {
            return u1mVar;
        }
        Pair k = ymb1.k(lneVar);
        Map map = u1mVar.c;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.putAll(gw00.e(new Pair("extensions", gw00.e(new Pair("feed", gw00.e(new Pair("mediaAdvUniversalSnippet", gw00.e(k))))))));
            u1mVar2 = u1m.a(u1mVar, linkedHashMap);
        }
        return u1mVar2 == null ? u1mVar : u1mVar2;
    }

    public void e(rq90 rq90Var) {
        ((nfh) this.b).q().k(rq90Var);
    }

    public void f(float f, float f2, float f3, float f4, int i) {
        ((nfh) this.b).q().b(f, f2, f3, f4, i);
    }

    public j820 g(String str) {
        return (j820) ((am2) this.b).i(new fe7(str));
    }

    public void h(float f, float f2, float f3, float f4) {
        nfh nfhVar = (nfh) this.b;
        i28 q = nfhVar.q();
        float intBitsToFloat = Float.intBitsToFloat((int) (nfhVar.v() >> 32)) - (f3 + f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (nfhVar.v() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - (f4 + f2);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) < 0.0f) {
            hxv.a("Width and height must be greater than or equal to zero");
        }
        nfhVar.E(floatToRawIntBits);
        q.c(f, f2);
    }

    public void i(String str) {
        jc4 jc4Var = (jc4) this.b;
        jc4Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(CRLReasonCodeExtension.REASON, str);
        jc4Var.a.a("YandexLogin.Deeplink.Dismiss", hashMap, 1, new HashMap());
    }

    public void j(float f, long j) {
        i28 q = ((nfh) this.b).q();
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        q.c(intBitsToFloat, Float.intBitsToFloat(i2));
        q.q(f);
        q.c(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void k(String str, j820 j820Var) {
        ((am2) this.b).n(new fe7(str), j820Var);
    }

    @Override // defpackage.x0b0
    public void l(od20[] od20VarArr) {
        MetricsState metricsState = (MetricsState) this.b;
        qd20 qd20Var = metricsState.d;
        qd20Var.e();
        if (od20VarArr != null) {
            qd20Var.c(j73.d0(od20VarArr));
        }
        metricsState.a();
    }

    public void m(float f, float f2, long j) {
        i28 q = ((nfh) this.b).q();
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        q.c(intBitsToFloat, Float.intBitsToFloat(i2));
        q.j(f, f2);
        q.c(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void n(float f, float f2) {
        ((nfh) this.b).q().c(f, f2);
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 4:
                return ((AppBarLayout) obj).onWindowInsetChanged(n751Var);
            default:
                return ((CollapsingToolbarLayout) obj).onWindowInsetChanged(n751Var);
        }
    }

    @Override // defpackage.x0b0
    public od20[] s() {
        MetricsState metricsState = (MetricsState) this.b;
        if (metricsState.d.h() > 0) {
            Object[] array = metricsState.d.i().toArray(new od20[0]);
            if (array != null) {
                return (od20[]) array;
            }
            ny61.t("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        return null;
    }

    public /* synthetic */ cot(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public cot(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 14;
        this.b = a.m0(arrayList2, arrayList);
    }

    public cot(uo11 uo11Var) {
        this.a = 27;
        this.b = new am2(uo11Var);
    }

    public cot(boolean z) {
        this.a = 6;
        this.b = new AtomicBoolean(z);
    }
}
