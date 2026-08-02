package com.yandex.go.payments.porttech.navigation;

import android.net.Uri;
import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.bce0;
import defpackage.cce0;
import defpackage.dqe0;
import defpackage.fx60;
import defpackage.hxx;
import defpackage.jk0;
import defpackage.m950;
import defpackage.mdh;
import defpackage.mo21;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.pbe0;
import defpackage.pep0;
import defpackage.po21;
import defpackage.qbe0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.preorder.source.userposition.e;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

/* loaded from: classes8.dex */
public final class a extends qbe0 {
    public final dqe0 b;
    public final yvf0 c;
    public final n20 d;
    public final po21 e;
    public final fx60 f;
    public final bce0 g;

    public a(dqe0 dqe0Var, jk0 jk0Var, n20 n20Var, po21 po21Var, fx60 fx60Var, bce0 bce0Var) {
        this.b = dqe0Var;
        this.c = jk0Var;
        this.d = n20Var;
        this.e = po21Var;
        this.f = fx60Var;
        this.g = bce0Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (pbe0) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(1:(1:(4:14|15|16|(2:18|19)(2:21|22))(2:24|25))(6:26|27|28|29|(3:32|16|(0)(0))|31))(5:33|34|(2:44|(3:38|(5:40|27|28|29|(0))|31)(5:41|28|29|(0)|31))|36|(0)(0)))(6:45|46|(1:(3:50|(5:52|34|(3:42|44|(0)(0))|36|(0)(0))|31))(2:53|(2:55|(0)(0)))|49|36|(0)(0)))(1:56))(1:63)|57|(3:59|(6:61|46|(0)(0)|49|36|(0)(0))|31)|62))|68|6|7|(0)(0)|57|(0)|62|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
    
        if (r14 == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c0, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c1, code lost:
    
        throw r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b9 A[Catch: all -> 0x01bf, CancellationException -> 0x01c0, TRY_ENTER, TryCatch #2 {CancellationException -> 0x01c0, all -> 0x01bf, blocks: (B:15:0x004a, B:16:0x019e, B:21:0x01b9, B:22:0x01be, B:29:0x0174), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, pbe0 pbe0Var, ContinuationImpl continuationImpl) {
        PortTechDeeplinkHandler$handleDeeplink$1 portTechDeeplinkHandler$handleDeeplink$1;
        int i;
        boolean booleanValue;
        pbe0 pbe0Var2;
        boolean z;
        int size;
        oep0 oep0Var2;
        int i2;
        zzs zzsVar;
        int i3;
        zzs zzsVar2;
        boolean z2;
        oep0 oep0Var3;
        o2y0 o2y0Var;
        TaxiOrder b;
        oep0 oep0Var4;
        WebViewFromDeeplinkExperiment.a aVar;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof PortTechDeeplinkHandler$handleDeeplink$1) {
            portTechDeeplinkHandler$handleDeeplink$1 = (PortTechDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i4 = portTechDeeplinkHandler$handleDeeplink$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                portTechDeeplinkHandler$handleDeeplink$1.label = i4 - Integer.MIN_VALUE;
                Object obj = portTechDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = portTechDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fx60 fx60Var = this.f;
                    Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.DEEPLINK;
                    portTechDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    portTechDeeplinkHandler$handleDeeplink$1.L$1 = pbe0Var;
                    portTechDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    portTechDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    portTechDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = fx60Var.c(events$Zalogin$LoginContext, portTechDeeplinkHandler$handleDeeplink$1);
                } else if (i == 1) {
                    pbe0Var = (pbe0) portTechDeeplinkHandler$handleDeeplink$1.L$1;
                    oep0Var = (oep0) portTechDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                } else if (i == 2) {
                    boolean z3 = portTechDeeplinkHandler$handleDeeplink$1.Z$0;
                    pbe0 pbe0Var3 = (pbe0) portTechDeeplinkHandler$handleDeeplink$1.L$1;
                    oep0 oep0Var5 = (oep0) portTechDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                    z = z3;
                    oep0Var = oep0Var5;
                    pbe0Var2 = pbe0Var3;
                    size = ((List) obj).size();
                    if (size != 0) {
                        Address b2 = this.b.a.G.b();
                        if (b2 != null) {
                            zzs B = b2.B();
                            oep0Var2 = oep0Var;
                            i2 = size;
                            zzsVar = B;
                            if (zzsVar != null) {
                            }
                        }
                    } else if (size == 1) {
                        n20 n20Var = this.d;
                        portTechDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                        portTechDeeplinkHandler$handleDeeplink$1.L$1 = pbe0Var2;
                        portTechDeeplinkHandler$handleDeeplink$1.L$2 = null;
                        portTechDeeplinkHandler$handleDeeplink$1.L$3 = null;
                        portTechDeeplinkHandler$handleDeeplink$1.Z$0 = z;
                        portTechDeeplinkHandler$handleDeeplink$1.I$0 = size;
                        portTechDeeplinkHandler$handleDeeplink$1.label = 3;
                        Object t = ((com.yandex.go.taxi.order.provider.a) n20Var).t(portTechDeeplinkHandler$handleDeeplink$1);
                        if (t != coroutineSingletons) {
                            oep0Var2 = oep0Var;
                            i2 = size;
                            obj = t;
                            o2y0Var = (o2y0) obj;
                            if (o2y0Var != null) {
                                zzsVar = b.m();
                                if (zzsVar != null) {
                                }
                            }
                            zzsVar = null;
                            if (zzsVar != null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    oep0Var2 = oep0Var;
                    i2 = size;
                    zzsVar = null;
                    if (zzsVar != null) {
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            zzsVar2 = (zzs) portTechDeeplinkHandler$handleDeeplink$1.L$4;
                            oep0Var4 = (oep0) portTechDeeplinkHandler$handleDeeplink$1.L$0;
                            kotlin.b.b(obj);
                            aVar = (WebViewFromDeeplinkExperiment.a) obj;
                            if (aVar.b.length() != 0) {
                                throw new IllegalStateException();
                            }
                            ((pep0) oep0Var4).f((m950) this.c.get(), new cce0(aVar, zzsVar2), hxx.a);
                            return zy11Var;
                        }
                        i2 = portTechDeeplinkHandler$handleDeeplink$1.I$0;
                        z = portTechDeeplinkHandler$handleDeeplink$1.Z$0;
                        pbe0Var2 = (pbe0) portTechDeeplinkHandler$handleDeeplink$1.L$1;
                        oep0Var3 = (oep0) portTechDeeplinkHandler$handleDeeplink$1.L$0;
                        kotlin.b.b(obj);
                        boolean z4 = z;
                        i3 = i2;
                        zzsVar2 = ((mo21) obj).a();
                        z2 = z4;
                        Uri a = pbe0Var2.a();
                        bce0 bce0Var = this.g;
                        portTechDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var3;
                        portTechDeeplinkHandler$handleDeeplink$1.L$1 = null;
                        portTechDeeplinkHandler$handleDeeplink$1.L$2 = null;
                        portTechDeeplinkHandler$handleDeeplink$1.L$3 = null;
                        portTechDeeplinkHandler$handleDeeplink$1.L$4 = zzsVar2;
                        portTechDeeplinkHandler$handleDeeplink$1.L$5 = null;
                        portTechDeeplinkHandler$handleDeeplink$1.Z$0 = z2;
                        portTechDeeplinkHandler$handleDeeplink$1.I$0 = i3;
                        portTechDeeplinkHandler$handleDeeplink$1.label = 5;
                        bce0Var.a.getClass();
                        sjh sjhVar = uyj.a;
                        obj = tje.k0(mdh.b, new PorttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2(a, bce0Var, zzsVar2, null), portTechDeeplinkHandler$handleDeeplink$1);
                        if (obj != coroutineSingletons) {
                            oep0Var4 = oep0Var3;
                            aVar = (WebViewFromDeeplinkExperiment.a) obj;
                            if (aVar.b.length() != 0) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    i2 = portTechDeeplinkHandler$handleDeeplink$1.I$0;
                    z = portTechDeeplinkHandler$handleDeeplink$1.Z$0;
                    pbe0Var2 = (pbe0) portTechDeeplinkHandler$handleDeeplink$1.L$1;
                    oep0Var2 = (oep0) portTechDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                    o2y0Var = (o2y0) obj;
                    if (o2y0Var != null && (b = o2y0Var.b()) != null) {
                        zzsVar = b.m();
                        if (zzsVar != null) {
                            boolean z5 = z;
                            i3 = i2;
                            zzsVar2 = zzsVar;
                            z2 = z5;
                            oep0Var3 = oep0Var2;
                            Uri a2 = pbe0Var2.a();
                            bce0 bce0Var2 = this.g;
                            portTechDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var3;
                            portTechDeeplinkHandler$handleDeeplink$1.L$1 = null;
                            portTechDeeplinkHandler$handleDeeplink$1.L$2 = null;
                            portTechDeeplinkHandler$handleDeeplink$1.L$3 = null;
                            portTechDeeplinkHandler$handleDeeplink$1.L$4 = zzsVar2;
                            portTechDeeplinkHandler$handleDeeplink$1.L$5 = null;
                            portTechDeeplinkHandler$handleDeeplink$1.Z$0 = z2;
                            portTechDeeplinkHandler$handleDeeplink$1.I$0 = i3;
                            portTechDeeplinkHandler$handleDeeplink$1.label = 5;
                            bce0Var2.a.getClass();
                            sjh sjhVar2 = uyj.a;
                            obj = tje.k0(mdh.b, new PorttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2(a2, bce0Var2, zzsVar2, null), portTechDeeplinkHandler$handleDeeplink$1);
                            if (obj != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        po21 po21Var = this.e;
                        portTechDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var2;
                        portTechDeeplinkHandler$handleDeeplink$1.L$1 = pbe0Var2;
                        portTechDeeplinkHandler$handleDeeplink$1.L$2 = null;
                        portTechDeeplinkHandler$handleDeeplink$1.L$3 = null;
                        portTechDeeplinkHandler$handleDeeplink$1.Z$0 = z;
                        portTechDeeplinkHandler$handleDeeplink$1.I$0 = i2;
                        portTechDeeplinkHandler$handleDeeplink$1.label = 4;
                        obj = ((e) po21Var).h(portTechDeeplinkHandler$handleDeeplink$1);
                        if (obj != coroutineSingletons) {
                            oep0Var3 = oep0Var2;
                            boolean z42 = z;
                            i3 = i2;
                            zzsVar2 = ((mo21) obj).a();
                            z2 = z42;
                            Uri a22 = pbe0Var2.a();
                            bce0 bce0Var22 = this.g;
                            portTechDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var3;
                            portTechDeeplinkHandler$handleDeeplink$1.L$1 = null;
                            portTechDeeplinkHandler$handleDeeplink$1.L$2 = null;
                            portTechDeeplinkHandler$handleDeeplink$1.L$3 = null;
                            portTechDeeplinkHandler$handleDeeplink$1.L$4 = zzsVar2;
                            portTechDeeplinkHandler$handleDeeplink$1.L$5 = null;
                            portTechDeeplinkHandler$handleDeeplink$1.Z$0 = z2;
                            portTechDeeplinkHandler$handleDeeplink$1.I$0 = i3;
                            portTechDeeplinkHandler$handleDeeplink$1.label = 5;
                            bce0Var22.a.getClass();
                            sjh sjhVar22 = uyj.a;
                            obj = tje.k0(mdh.b, new PorttechParseDeeplinkForWebViewInteractor$getPortUrlByDeeplink$2(a22, bce0Var22, zzsVar2, null), portTechDeeplinkHandler$handleDeeplink$1);
                            if (obj != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    zzsVar = null;
                    if (zzsVar != null) {
                    }
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    n20 n20Var2 = this.d;
                    portTechDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    portTechDeeplinkHandler$handleDeeplink$1.L$1 = pbe0Var;
                    portTechDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    portTechDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    portTechDeeplinkHandler$handleDeeplink$1.Z$0 = booleanValue;
                    portTechDeeplinkHandler$handleDeeplink$1.label = 2;
                    Object k = ((com.yandex.go.taxi.order.provider.a) n20Var2).k(portTechDeeplinkHandler$handleDeeplink$1);
                    if (k != coroutineSingletons) {
                        pbe0Var2 = pbe0Var;
                        z = booleanValue;
                        obj = k;
                        size = ((List) obj).size();
                        if (size != 0) {
                        }
                        oep0Var2 = oep0Var;
                        i2 = size;
                        zzsVar = null;
                        if (zzsVar != null) {
                        }
                    }
                    return coroutineSingletons;
                }
                return zy11Var;
            }
        }
        portTechDeeplinkHandler$handleDeeplink$1 = new PortTechDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = portTechDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = portTechDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
        return zy11Var;
    }
}
