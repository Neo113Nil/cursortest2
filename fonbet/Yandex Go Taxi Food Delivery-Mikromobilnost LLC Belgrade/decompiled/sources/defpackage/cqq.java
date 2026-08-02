package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.yandex.go.feedsdk.log.c;
import com.yandex.go.overdraft.domain.i;
import com.yandex.go.overdraft.ui.g;
import ru.yandex.taxi.settings.api.PushSettingsApi;

/* loaded from: classes.dex */
public final class cqq implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final xvf0 l;
    public final xvf0 m;
    public final xvf0 n;
    public final xvf0 o;
    public final xvf0 p;
    public final xvf0 q;
    public final xvf0 r;
    public final xvf0 s;
    public final xvf0 t;

    public /* synthetic */ cqq(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, xvf0 xvf0Var15, xvf0 xvf0Var16, xvf0 xvf0Var17, xvf0 xvf0Var18, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = v7pVar;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
        this.i = xvf0Var7;
        this.j = xvf0Var8;
        this.k = xvf0Var9;
        this.l = xvf0Var10;
        this.m = xvf0Var11;
        this.n = xvf0Var12;
        this.o = xvf0Var13;
        this.p = xvf0Var14;
        this.q = xvf0Var15;
        this.r = xvf0Var16;
        this.s = xvf0Var17;
        this.t = xvf0Var18;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.i;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.t;
        xvf0 xvf0Var5 = this.s;
        xvf0 xvf0Var6 = this.r;
        xvf0 xvf0Var7 = this.q;
        xvf0 xvf0Var8 = this.p;
        xvf0 xvf0Var9 = this.o;
        xvf0 xvf0Var10 = this.n;
        xvf0 xvf0Var11 = this.m;
        xvf0 xvf0Var12 = this.l;
        xvf0 xvf0Var13 = this.k;
        xvf0 xvf0Var14 = this.j;
        xvf0 xvf0Var15 = this.h;
        xvf0 xvf0Var16 = this.g;
        xvf0 xvf0Var17 = this.f;
        xvf0 xvf0Var18 = this.c;
        xvf0 xvf0Var19 = this.b;
        switch (i) {
            case 0:
                i6r i6rVar = (i6r) xvf0Var19.get();
                Activity activity = (Activity) xvf0Var18.get();
                su00 su00Var = (su00) xvf0Var17.get();
                ru00 ru00Var = (ru00) xvf0Var16.get();
                hhr hhrVar = (hhr) xvf0Var15.get();
                vv2 vv2Var = (vv2) xvf0Var14.get();
                gir girVar = (gir) xvf0Var13.get();
                vpq vpqVar = (vpq) xvf0Var12.get();
                wa90 wa90Var = (wa90) xvf0Var11.get();
                gmr gmrVar = (gmr) xvf0Var10.get();
                alr alrVar = (alr) xvf0Var9.get();
                ra10 ra10Var = (ra10) xvf0Var8.get();
                o631 o631Var = (o631) xvf0Var7.get();
                c cVar = (c) xvf0Var6.get();
                return new ypq((btl) xvf0Var4.get(), (pav) xvf0Var5.get(), this.d, this.e, cVar, i6rVar, su00Var, ru00Var, hhrVar, gmrVar, alrVar, girVar, this.i, o631Var, vv2Var, vpqVar, ra10Var, activity, wa90Var);
            case 1:
                return new g((tse) xvf0Var19.get(), (com.yandex.go.navigation.screen.c) xvf0Var18.get(), (y3u0) xvf0Var3.get(), (v3u0) xvf0Var2.get(), (n20) xvf0Var17.get(), (i) xvf0Var16.get(), (yy80) xvf0Var15.get(), (qug) xvf0Var.get(), (ycq0) xvf0Var14.get(), i5m.a(xvf0Var13), (mhf) xvf0Var12.get(), (y50) xvf0Var11.get(), (ql21) xvf0Var10.get(), (hd) xvf0Var9.get(), (zz80) xvf0Var8.get(), (com.yandex.go.overdraft.g) xvf0Var7.get(), (oep0) xvf0Var6.get(), (e2x0) xvf0Var5.get(), (po21) xvf0Var4.get());
            default:
                Context context = (Context) xvf0Var19.get();
                Application application = (Application) xvf0Var18.get();
                tt2 tt2Var = (tt2) xvf0Var2.get();
                pho phoVar = (pho) xvf0Var17.get();
                PushSettingsApi pushSettingsApi = (PushSettingsApi) xvf0Var16.get();
                po21 po21Var = (po21) xvf0Var15.get();
                k7x0 k7x0Var = (k7x0) xvf0Var.get();
                pav pavVar = (pav) xvf0Var14.get();
                q3g0 q3g0Var = (q3g0) xvf0Var13.get();
                jae0 jae0Var = (jae0) xvf0Var12.get();
                dne0 dne0Var = (dne0) xvf0Var11.get();
                g5g0 g5g0Var = (g5g0) xvf0Var10.get();
                xk60 xk60Var = (xk60) xvf0Var9.get();
                return new iw8(context, application, tt2Var, phoVar, pushSettingsApi, po21Var, k7x0Var, pavVar, q3g0Var, jae0Var, dne0Var, g5g0Var, xk60Var, (wnt) xvf0Var7.get(), (tj60) xvf0Var6.get(), (c3g0) xvf0Var5.get(), (pwy0) xvf0Var4.get());
        }
    }
}
