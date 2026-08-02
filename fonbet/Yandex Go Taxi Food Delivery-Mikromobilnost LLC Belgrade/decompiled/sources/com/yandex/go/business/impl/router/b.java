package com.yandex.go.business.impl.router;

import android.content.Context;
import com.yandex.go.business.impl.web.YangoBusinessJsNativeApi;
import defpackage.ag41;
import defpackage.aj31;
import defpackage.aui;
import defpackage.cu41;
import defpackage.cvu0;
import defpackage.dg41;
import defpackage.ff41;
import defpackage.gf41;
import defpackage.gg41;
import defpackage.h331;
import defpackage.h55;
import defpackage.i3y;
import defpackage.jn51;
import defpackage.jst;
import defpackage.jv21;
import defpackage.jy31;
import defpackage.m950;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.scg;
import defpackage.tt2;
import defpackage.un51;
import defpackage.vn51;
import defpackage.wnt;
import defpackage.wnw;
import defpackage.xby;
import defpackage.xes0;
import defpackage.xf41;
import defpackage.xn51;
import defpackage.xvf0;
import defpackage.yuf0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.n;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.preorder.source.userposition.e;
import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes12.dex */
public final class b extends h55 implements m950 {
    public final ru.yandex.taxi.am.token.a D;
    public final xn51 E;
    public final xes0 F;
    public final o G;
    public final po21 H;
    public SimpleSpinnerModalView I;
    public final i3y J;
    public final YangoBusinessJsNativeApi K;

    public b(gf41 gf41Var, un51 un51Var, ru.yandex.taxi.am.token.a aVar, xn51 xn51Var, xes0 xes0Var, o oVar, po21 po21Var) {
        super(null);
        this.D = aVar;
        this.E = xn51Var;
        this.F = xes0Var;
        this.G = oVar;
        this.H = po21Var;
        this.J = kotlin.a.a(new aui(gf41Var, 1));
        aj31 aj31Var = new aj31(15, this);
        yuf0 yuf0Var = un51Var.a;
        this.K = new YangoBusinessJsNativeApi(aj31Var, (Context) ((xvf0) yuf0Var.a).get(), (tt2) ((xvf0) yuf0Var.b).get(), (jn51) ((jv21) yuf0Var.c).get(), (com.yandex.go.business.impl.web.handler.b) ((wnw) yuf0Var.d).get(), (com.yandex.go.business.impl.web.handler.a) ((wnw) yuf0Var.e).get(), (wnt) ((xvf0) yuf0Var.f).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(b bVar, vn51 vn51Var, ContinuationImpl continuationImpl) {
        YangoBusinessRouterImpl$launchWebView$1 yangoBusinessRouterImpl$launchWebView$1;
        int i;
        m950 m950Var;
        vn51 vn51Var2;
        xn51 xn51Var;
        b bVar2;
        bVar.getClass();
        if (continuationImpl instanceof YangoBusinessRouterImpl$launchWebView$1) {
            yangoBusinessRouterImpl$launchWebView$1 = (YangoBusinessRouterImpl$launchWebView$1) continuationImpl;
            int i2 = yangoBusinessRouterImpl$launchWebView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yangoBusinessRouterImpl$launchWebView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yangoBusinessRouterImpl$launchWebView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yangoBusinessRouterImpl$launchWebView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bVar.I = bVar.F.b(new jy31(13, bVar));
                    gg41 b = ((scg) bVar.S()).b();
                    xn51 xn51Var2 = bVar.E;
                    yangoBusinessRouterImpl$launchWebView$1.L$0 = vn51Var;
                    yangoBusinessRouterImpl$launchWebView$1.L$1 = null;
                    yangoBusinessRouterImpl$launchWebView$1.L$2 = bVar;
                    yangoBusinessRouterImpl$launchWebView$1.L$3 = b;
                    yangoBusinessRouterImpl$launchWebView$1.L$4 = xn51Var2;
                    yangoBusinessRouterImpl$launchWebView$1.label = 1;
                    Object R = bVar.R(vn51Var, yangoBusinessRouterImpl$launchWebView$1);
                    if (R == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    m950Var = b;
                    obj = R;
                    vn51Var2 = vn51Var;
                    xn51Var = xn51Var2;
                    bVar2 = bVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xn51Var = (xn51) yangoBusinessRouterImpl$launchWebView$1.L$4;
                    m950Var = (m950) yangoBusinessRouterImpl$launchWebView$1.L$3;
                    bVar2 = (b) yangoBusinessRouterImpl$launchWebView$1.L$2;
                    vn51Var2 = (vn51) yangoBusinessRouterImpl$launchWebView$1.L$0;
                    kotlin.b.b(obj);
                }
                bVar2.A(m950Var, new dg41(xn51Var.a(bVar.K, (String) obj), new a(bVar, vn51Var2), null, null, null, null, null, 252), new h331(bVar, 6));
                return zy11.a;
            }
        }
        yangoBusinessRouterImpl$launchWebView$1 = new YangoBusinessRouterImpl$launchWebView$1(bVar, continuationImpl);
        Object obj2 = yangoBusinessRouterImpl$launchWebView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yangoBusinessRouterImpl$launchWebView$1.label;
        if (i != 0) {
        }
        bVar2.A(m950Var, new dg41(xn51Var.a(bVar.K, (String) obj2), new a(bVar, vn51Var2), null, null, null, null, null, 252), new h331(bVar, 6));
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r7.T(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(b bVar, vn51 vn51Var, ContinuationImpl continuationImpl) {
        YangoBusinessRouterImpl$refreshToken$1 yangoBusinessRouterImpl$refreshToken$1;
        int i;
        Object d;
        Object obj;
        bVar.getClass();
        if (continuationImpl instanceof YangoBusinessRouterImpl$refreshToken$1) {
            yangoBusinessRouterImpl$refreshToken$1 = (YangoBusinessRouterImpl$refreshToken$1) continuationImpl;
            int i2 = yangoBusinessRouterImpl$refreshToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yangoBusinessRouterImpl$refreshToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = yangoBusinessRouterImpl$refreshToken$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yangoBusinessRouterImpl$refreshToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ((ag41) ((scg) bVar.S()).a()).c(cu41.b);
                    ru.yandex.taxi.am.token.a aVar = bVar.D;
                    yangoBusinessRouterImpl$refreshToken$1.L$0 = vn51Var;
                    yangoBusinessRouterImpl$refreshToken$1.label = 1;
                    d = aVar.d(false, yangoBusinessRouterImpl$refreshToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = yangoBusinessRouterImpl$refreshToken$1.L$1;
                        kotlin.b.b(obj2);
                        if (Result.a(obj) != null) {
                            ((ag41) ((scg) bVar.S()).a()).c(cu41.d);
                        }
                        return zy11.a;
                    }
                    vn51Var = (vn51) yangoBusinessRouterImpl$refreshToken$1.L$0;
                    kotlin.b.b(obj2);
                    d = ((Result) obj2).getValue();
                }
                Object obj4 = d;
                vn51 vn51Var2 = vn51Var;
                obj = obj4;
                if (!(obj instanceof Result.Failure)) {
                    yangoBusinessRouterImpl$refreshToken$1.L$0 = null;
                    yangoBusinessRouterImpl$refreshToken$1.L$1 = obj;
                    yangoBusinessRouterImpl$refreshToken$1.L$2 = null;
                    yangoBusinessRouterImpl$refreshToken$1.label = 2;
                }
                if (Result.a(obj) != null) {
                }
                return zy11.a;
            }
        }
        yangoBusinessRouterImpl$refreshToken$1 = new YangoBusinessRouterImpl$refreshToken$1(bVar, continuationImpl);
        Object obj22 = yangoBusinessRouterImpl$refreshToken$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yangoBusinessRouterImpl$refreshToken$1.label;
        if (i != 0) {
        }
        Object obj42 = d;
        vn51 vn51Var22 = vn51Var;
        obj = obj42;
        if (!(obj instanceof Result.Failure)) {
        }
        if (Result.a(obj) != null) {
        }
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        SimpleSpinnerModalView simpleSpinnerModalView = this.I;
        if (simpleSpinnerModalView != null) {
            simpleSpinnerModalView.dismiss();
        }
        this.I = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        com.yandex.go.coroutines.b.g(o(), null, null, new YangoBusinessRouterImpl$onLaunch$1(this, (vn51) obj, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(vn51 vn51Var, ContinuationImpl continuationImpl) {
        YangoBusinessRouterImpl$getUrl$1 yangoBusinessRouterImpl$getUrl$1;
        Object obj;
        Object obj2;
        int i;
        String str;
        IllegalStateException illegalStateException;
        String str2;
        try {
            if (continuationImpl instanceof YangoBusinessRouterImpl$getUrl$1) {
                yangoBusinessRouterImpl$getUrl$1 = (YangoBusinessRouterImpl$getUrl$1) continuationImpl;
                int i2 = yangoBusinessRouterImpl$getUrl$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    yangoBusinessRouterImpl$getUrl$1.label = i2 - Integer.MIN_VALUE;
                    obj = yangoBusinessRouterImpl$getUrl$1.result;
                    obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = yangoBusinessRouterImpl$getUrl$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        String str3 = vn51Var.a;
                        yangoBusinessRouterImpl$getUrl$1.L$0 = null;
                        yangoBusinessRouterImpl$getUrl$1.label = 1;
                        obj = U(str3, yangoBusinessRouterImpl$getUrl$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str2 = (String) yangoBusinessRouterImpl$getUrl$1.L$1;
                            try {
                                kotlin.b.b(obj);
                                return (String) obj;
                            } catch (IllegalStateException e) {
                                illegalStateException = e;
                                xby.l(jst.e, "YangoBusiness.Error.AuthorizationUrl", null, illegalStateException, "Error when getting authorization url", 2);
                                return str2;
                            }
                        }
                        kotlin.b.b(obj);
                    }
                    str = (String) obj;
                    o oVar = this.G;
                    yangoBusinessRouterImpl$getUrl$1.L$0 = null;
                    yangoBusinessRouterImpl$getUrl$1.L$1 = str;
                    yangoBusinessRouterImpl$getUrl$1.label = 2;
                    obj = n.a(oVar, str, yangoBusinessRouterImpl$getUrl$1);
                    if (obj != obj2) {
                        str2 = str;
                        return (String) obj;
                    }
                    return obj2;
                }
            }
            o oVar2 = this.G;
            yangoBusinessRouterImpl$getUrl$1.L$0 = null;
            yangoBusinessRouterImpl$getUrl$1.L$1 = str;
            yangoBusinessRouterImpl$getUrl$1.label = 2;
            obj = n.a(oVar2, str, yangoBusinessRouterImpl$getUrl$1);
            if (obj != obj2) {
            }
            return obj2;
        } catch (IllegalStateException e2) {
            illegalStateException = e2;
            str2 = str;
            xby.l(jst.e, "YangoBusiness.Error.AuthorizationUrl", null, illegalStateException, "Error when getting authorization url", 2);
            return str2;
        }
        yangoBusinessRouterImpl$getUrl$1 = new YangoBusinessRouterImpl$getUrl$1(this, continuationImpl);
        obj = yangoBusinessRouterImpl$getUrl$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yangoBusinessRouterImpl$getUrl$1.label;
        if (i != 0) {
        }
        str = (String) obj;
    }

    public final ff41 S() {
        return (ff41) this.J.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(vn51 vn51Var, ContinuationImpl continuationImpl) {
        YangoBusinessRouterImpl$successRefreshToken$1 yangoBusinessRouterImpl$successRefreshToken$1;
        int i;
        xf41 xf41Var;
        xn51 xn51Var;
        if (continuationImpl instanceof YangoBusinessRouterImpl$successRefreshToken$1) {
            yangoBusinessRouterImpl$successRefreshToken$1 = (YangoBusinessRouterImpl$successRefreshToken$1) continuationImpl;
            int i2 = yangoBusinessRouterImpl$successRefreshToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yangoBusinessRouterImpl$successRefreshToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yangoBusinessRouterImpl$successRefreshToken$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yangoBusinessRouterImpl$successRefreshToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ag41 ag41Var = (ag41) ((scg) S()).a();
                    ag41Var.c(cu41.c);
                    yangoBusinessRouterImpl$successRefreshToken$1.L$0 = null;
                    yangoBusinessRouterImpl$successRefreshToken$1.L$1 = ag41Var;
                    yangoBusinessRouterImpl$successRefreshToken$1.L$2 = null;
                    xn51 xn51Var2 = this.E;
                    yangoBusinessRouterImpl$successRefreshToken$1.L$3 = xn51Var2;
                    yangoBusinessRouterImpl$successRefreshToken$1.L$4 = ag41Var;
                    yangoBusinessRouterImpl$successRefreshToken$1.label = 1;
                    Object R = R(vn51Var, yangoBusinessRouterImpl$successRefreshToken$1);
                    if (R == obj2) {
                        return obj2;
                    }
                    obj = R;
                    xf41Var = ag41Var;
                    xn51Var = xn51Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xf41Var = (xf41) yangoBusinessRouterImpl$successRefreshToken$1.L$4;
                    xn51Var = (xn51) yangoBusinessRouterImpl$successRefreshToken$1.L$3;
                    kotlin.b.b(obj);
                }
                ag41 ag41Var2 = (ag41) xf41Var;
                ag41Var2.a(xn51Var.a(this.K, (String) obj));
                return zy11.a;
            }
        }
        yangoBusinessRouterImpl$successRefreshToken$1 = new YangoBusinessRouterImpl$successRefreshToken$1(this, continuationImpl);
        Object obj3 = yangoBusinessRouterImpl$successRefreshToken$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yangoBusinessRouterImpl$successRefreshToken$1.label;
        if (i != 0) {
        }
        ag41 ag41Var22 = (ag41) xf41Var;
        ag41Var22.a(xn51Var.a(this.K, (String) obj3));
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(String str, ContinuationImpl continuationImpl) {
        YangoBusinessRouterImpl$withLocation$1 yangoBusinessRouterImpl$withLocation$1;
        int i;
        try {
            if (continuationImpl instanceof YangoBusinessRouterImpl$withLocation$1) {
                yangoBusinessRouterImpl$withLocation$1 = (YangoBusinessRouterImpl$withLocation$1) continuationImpl;
                int i2 = yangoBusinessRouterImpl$withLocation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    yangoBusinessRouterImpl$withLocation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = yangoBusinessRouterImpl$withLocation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = yangoBusinessRouterImpl$withLocation$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        po21 po21Var = this.H;
                        yangoBusinessRouterImpl$withLocation$1.L$0 = str;
                        yangoBusinessRouterImpl$withLocation$1.label = 1;
                        obj = ((e) po21Var).f(yangoBusinessRouterImpl$withLocation$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) yangoBusinessRouterImpl$withLocation$1.L$0;
                        kotlin.b.b(obj);
                    }
                    mo21 mo21Var = (mo21) obj;
                    return cvu0.v(cvu0.v(str, "{lat}", String.valueOf(mo21Var.a), false), "{lon}", String.valueOf(mo21Var.b), false);
                }
            }
            if (i != 0) {
            }
            mo21 mo21Var2 = (mo21) obj;
            return cvu0.v(cvu0.v(str, "{lat}", String.valueOf(mo21Var2.a), false), "{lon}", String.valueOf(mo21Var2.b), false);
        } catch (LocationRequirementsException e) {
            xby.l(jst.e, "YangoBusiness.Error.LocationFetch", null, e, "error fetch location", 2);
            return str;
        }
        yangoBusinessRouterImpl$withLocation$1 = new YangoBusinessRouterImpl$withLocation$1(this, continuationImpl);
        Object obj2 = yangoBusinessRouterImpl$withLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yangoBusinessRouterImpl$withLocation$1.label;
    }
}
