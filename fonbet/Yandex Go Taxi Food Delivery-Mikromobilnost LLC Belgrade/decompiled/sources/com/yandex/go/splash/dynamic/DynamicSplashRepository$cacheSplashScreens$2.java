package com.yandex.go.splash.dynamic;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.splash.data.dto.DynamicSplash;
import com.yandex.go.splash.data.dto.DynamicSplashRequestPoint;
import com.yandex.go.splash.data.dto.DynamicSplashScreenRequestBody;
import com.yandex.go.splash.data.dto.DynamicSplashScreenResponse;
import defpackage.cmt;
import defpackage.dei0;
import defpackage.e9n;
import defpackage.f2t;
import defpackage.g2t;
import defpackage.gqt0;
import defpackage.hk20;
import defpackage.iei0;
import defpackage.jst;
import defpackage.ksw;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.sls;
import defpackage.tse;
import defpackage.u6r;
import defpackage.v6r;
import defpackage.wls;
import defpackage.xv11;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.preorder.source.userposition.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.splash.dynamic.DynamicSplashRepository$cacheSplashScreens$2", f = "DynamicSplashRepository.kt", l = {149, 154, ModuleDescriptor.MODULE_VERSION, 160, 167}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class DynamicSplashRepository$cacheSplashScreens$2 extends SuspendLambda implements wls {
    final /* synthetic */ sls $logoBitmapProvider;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicSplashRepository$cacheSplashScreens$2(c cVar, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$logoBitmapProvider = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicSplashRepository$cacheSplashScreens$2(this.this$0, this.$logoBitmapProvider, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicSplashRepository$cacheSplashScreens$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0189 A[Catch: all -> 0x01c2, CancellationException -> 0x01cb, TryCatch #2 {CancellationException -> 0x01cb, all -> 0x01c2, blocks: (B:10:0x0028, B:11:0x01ba, B:19:0x0037, B:21:0x0167, B:22:0x0183, B:24:0x0189, B:28:0x019d, B:31:0x01a8, B:36:0x0052, B:38:0x011d, B:42:0x006b, B:43:0x00fd, B:47:0x0074, B:49:0x00b2, B:50:0x00b8, B:55:0x007d, B:57:0x0089, B:59:0x008d, B:61:0x0091, B:63:0x0095, B:65:0x009d, B:68:0x00a2), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object h;
        v6r v6rVar;
        u6r u6rVar;
        List list;
        ksw kswVar;
        String str;
        Object b;
        e9n e9nVar;
        DynamicSplashRequestPoint dynamicSplashRequestPoint;
        Object a;
        DynamicSplashRequestPoint dynamicSplashRequestPoint2;
        String str2;
        String str3;
        e9n e9nVar2;
        Object d;
        List<DynamicSplash> list2;
        c cVar;
        sls slsVar;
        List list3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.j(th);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            g2t a2 = ((f2t) this.this$0.g).a();
            if (a2 == null || (v6rVar = a2.a) == null || (u6rVar = v6rVar.a) == null || (list = u6rVar.c) == null || (kswVar = (ksw) kotlin.collections.a.R(list)) == null || (r2 = kswVar.d) == null) {
                po21 po21Var = this.this$0.i;
                this.label = 1;
                h = ((e) po21Var).h(this);
                if (h == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                double d2 = r2.b;
                double d3 = r2.a;
                e9n e9nVar3 = this.this$0.d;
                str = d3 + ";" + d2;
                DynamicSplashRequestPoint dynamicSplashRequestPoint3 = new DynamicSplashRequestPoint(new Double(d3), new Double(d2));
                xv11 xv11Var = this.this$0.j;
                this.L$0 = null;
                this.L$1 = e9nVar3;
                this.L$2 = str;
                this.L$3 = dynamicSplashRequestPoint3;
                this.label = 2;
                b = ((com.yandex.go.ultima_mode.domain.c) xv11Var).b(this);
                if (b != coroutineSingletons) {
                    return coroutineSingletons;
                }
                e9nVar = e9nVar3;
                dynamicSplashRequestPoint = dynamicSplashRequestPoint3;
                String str4 = (String) b;
                xv11 xv11Var2 = this.this$0.j;
                this.L$0 = null;
                this.L$1 = e9nVar;
                this.L$2 = str;
                this.L$3 = dynamicSplashRequestPoint;
                this.L$4 = str4;
                this.label = 3;
                a = ((com.yandex.go.ultima_mode.domain.c) xv11Var2).a(this);
                if (a != coroutineSingletons) {
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    dynamicSplashRequestPoint = (DynamicSplashRequestPoint) this.L$3;
                    String str5 = (String) this.L$2;
                    e9n e9nVar4 = (e9n) this.L$1;
                    kotlin.b.b(obj);
                    e9nVar = e9nVar4;
                    str = str5;
                    b = obj;
                    String str42 = (String) b;
                    xv11 xv11Var22 = this.this$0.j;
                    this.L$0 = null;
                    this.L$1 = e9nVar;
                    this.L$2 = str;
                    this.L$3 = dynamicSplashRequestPoint;
                    this.L$4 = str42;
                    this.label = 3;
                    a = ((com.yandex.go.ultima_mode.domain.c) xv11Var22).a(this);
                    if (a != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    dynamicSplashRequestPoint2 = dynamicSplashRequestPoint;
                    str2 = str42;
                    str3 = str;
                    e9nVar2 = e9nVar;
                    cmt<DynamicSplashScreenResponse> a3 = ((DynamicSplashInternalApi) e9nVar2.a.getValue()).a(str3, new DynamicSplashScreenRequestBody(dynamicSplashRequestPoint2, str2, (String) a, new Integer(this.this$0.h.b()), this.this$0.h.c().getTitle(), ((com.yandex.go.performance_class.a) this.this$0.k).d()));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 4;
                    d = ru.yandex.taxi.network.api.a.d(a3, this);
                    if (d == coroutineSingletons) {
                    }
                    list2 = ((DynamicSplashScreenResponse) d).a;
                    cVar = this.this$0;
                    slsVar = this.$logoBitmapProvider;
                    ((hk20) cVar.f.a.getValue()).b(list2);
                    while (r6.hasNext()) {
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = list2;
                    this.L$3 = null;
                    this.label = 5;
                    if (c.b(cVar, slsVar, list2, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i == 3) {
                    String str6 = (String) this.L$4;
                    DynamicSplashRequestPoint dynamicSplashRequestPoint4 = (DynamicSplashRequestPoint) this.L$3;
                    str3 = (String) this.L$2;
                    e9nVar2 = (e9n) this.L$1;
                    kotlin.b.b(obj);
                    str2 = str6;
                    dynamicSplashRequestPoint2 = dynamicSplashRequestPoint4;
                    a = obj;
                    cmt<DynamicSplashScreenResponse> a32 = ((DynamicSplashInternalApi) e9nVar2.a.getValue()).a(str3, new DynamicSplashScreenRequestBody(dynamicSplashRequestPoint2, str2, (String) a, new Integer(this.this$0.h.b()), this.this$0.h.c().getTitle(), ((com.yandex.go.performance_class.a) this.this$0.k).d()));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 4;
                    d = ru.yandex.taxi.network.api.a.d(a32, this);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list2 = ((DynamicSplashScreenResponse) d).a;
                    cVar = this.this$0;
                    slsVar = this.$logoBitmapProvider;
                    ((hk20) cVar.f.a.getValue()).b(list2);
                    while (r6.hasNext()) {
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = list2;
                    this.L$3 = null;
                    this.label = 5;
                    if (c.b(cVar, slsVar, list2, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 4) {
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list3 = (List) this.L$2;
                    kotlin.b.b(obj);
                    this.this$0.o.set(list3);
                    return zy11.a;
                }
                kotlin.b.b(obj);
                d = obj;
                list2 = ((DynamicSplashScreenResponse) d).a;
                cVar = this.this$0;
                slsVar = this.$logoBitmapProvider;
                ((hk20) cVar.f.a.getValue()).b(list2);
                for (DynamicSplash dynamicSplash : list2) {
                    gqt0 gqt0Var = cVar.e;
                    String str7 = dynamicSplash.a;
                    Map map = dynamicSplash.k;
                    dei0 dei0Var = gqt0Var.b;
                    CreativeType creativeType = CreativeType.Splash;
                    if (str7 == null) {
                        str7 = "";
                    }
                    ((com.yandex.go.analytics.realtime.a) dei0Var).d(new iei0(creativeType, str7, map));
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = list2;
                this.L$3 = null;
                this.label = 5;
                if (c.b(cVar, slsVar, list2, this) != coroutineSingletons) {
                    list3 = list2;
                    this.this$0.o.set(list3);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
            h = obj;
        }
        zzs zzsVar = ((mo21) h).a();
        double d22 = zzsVar.b;
        double d32 = zzsVar.a;
        e9n e9nVar32 = this.this$0.d;
        str = d32 + ";" + d22;
        DynamicSplashRequestPoint dynamicSplashRequestPoint32 = new DynamicSplashRequestPoint(new Double(d32), new Double(d22));
        xv11 xv11Var3 = this.this$0.j;
        this.L$0 = null;
        this.L$1 = e9nVar32;
        this.L$2 = str;
        this.L$3 = dynamicSplashRequestPoint32;
        this.label = 2;
        b = ((com.yandex.go.ultima_mode.domain.c) xv11Var3).b(this);
        if (b != coroutineSingletons) {
        }
    }
}
