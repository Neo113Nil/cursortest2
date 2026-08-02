package com.yandex.go.suggest.impl.router;

import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import com.adjust.sdk.Constants;
import com.yandex.go.suggest.impl.analytics.FindInGoSearchAnalytics$Style;
import com.yandex.go.suggest.impl.data.experiments.j;
import defpackage.a42;
import defpackage.awp0;
import defpackage.c0g;
import defpackage.c1m0;
import defpackage.cfw0;
import defpackage.ci3;
import defpackage.dfw0;
import defpackage.dxp0;
import defpackage.e6v0;
import defpackage.efw0;
import defpackage.f8v0;
import defpackage.f9w0;
import defpackage.g3p;
import defpackage.g9t0;
import defpackage.gfw0;
import defpackage.ggw0;
import defpackage.h90;
import defpackage.hfw0;
import defpackage.hgw0;
import defpackage.i5m;
import defpackage.i6r;
import defpackage.j230;
import defpackage.jgw0;
import defpackage.ji3;
import defpackage.k9w0;
import defpackage.kpp0;
import defpackage.kr0;
import defpackage.kxl0;
import defpackage.l01;
import defpackage.lag;
import defpackage.lg21;
import defpackage.m5v0;
import defpackage.mvg;
import defpackage.mz0;
import defpackage.n3w;
import defpackage.n4j0;
import defpackage.nag;
import defpackage.ny61;
import defpackage.o950;
import defpackage.oag;
import defpackage.ogw0;
import defpackage.p7w0;
import defpackage.p9p;
import defpackage.q5z;
import defpackage.qgw0;
import defpackage.rmv0;
import defpackage.rqo;
import defpackage.ru2;
import defpackage.rz0;
import defpackage.swp0;
import defpackage.t7r;
import defpackage.t870;
import defpackage.tse;
import defpackage.twp0;
import defpackage.u7r;
import defpackage.umt0;
import defpackage.v7p;
import defpackage.w030;
import defpackage.wks;
import defpackage.wls;
import defpackage.x4v0;
import defpackage.xgw0;
import defpackage.xks;
import defpackage.xvf0;
import defpackage.y2r0;
import defpackage.y9y0;
import defpackage.yks;
import defpackage.zuj0;
import defpackage.zvv;
import defpackage.zy11;
import defpackage.zzf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.router.SuperappSuggestRouterImpl$onLaunch$1", f = "SuperappSuggestRouterImpl.kt", l = {56, HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SuperappSuggestRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ ogw0 $navigator;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.suggest.impl.router.SuperappSuggestRouterImpl$onLaunch$1$2", f = "SuperappSuggestRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.suggest.impl.router.SuperappSuggestRouterImpl$onLaunch$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ f8v0 $settingsConfiguration;
        int label;
        final /* synthetic */ e this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(e eVar, f8v0 f8v0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$settingsConfiguration = f8v0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$settingsConfiguration, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass2.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e eVar = this.this$0;
            u7r u7rVar = eVar.D;
            swp0 swp0Var = eVar.L;
            String a = swp0Var != null ? swp0Var.a() : null;
            FindInGoSearchAnalytics$Style a2 = a42.a(this.$settingsConfiguration.e);
            dxp0 dxp0Var = this.$settingsConfiguration.f;
            t7r t7rVar = dxp0Var != null ? new t7r(dxp0Var.d(), dxp0Var.c(), dxp0Var.a(), dxp0Var.b()) : null;
            Uri uri = this.this$0.J;
            String uri2 = uri != null ? uri.toString() : null;
            u7rVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("type", a2.getEventValue());
            if (t7rVar != null) {
                hashMap.put("trail_input_button", t7rVar.a());
            }
            if (uri2 != null) {
                hashMap.put(Constants.DEEPLINK, uri2);
            }
            if (a != null) {
                hashMap.put("search_session_id", a);
            }
            u7rVar.a.a("FindInGoSearch.Shown", hashMap, 4, new HashMap());
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestRouterImpl$onLaunch$1(e eVar, ogw0 ogw0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$navigator = ogw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappSuggestRouterImpl$onLaunch$1(this.this$0, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappSuggestRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x04e5, code lost:
    
        if (r0 == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x04e7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r2 == r1) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j jVar = this.this$0.H;
            this.label = 1;
            a = jVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            a = obj;
        }
        f8v0 f8v0Var = (f8v0) a;
        e eVar = this.this$0;
        i6r i6rVar = eVar.I;
        ogw0 ogw0Var = this.$navigator;
        tse o = eVar.o();
        zvv zvvVar = new zvv(this.this$0.J);
        o950 lifecycle = this.this$0.getLifecycle();
        i6rVar.getClass();
        ogw0Var.getClass();
        f8v0Var.getClass();
        lag lagVar = new lag(i6rVar, 17);
        lag lagVar2 = new lag(i6rVar, 21);
        xvf0 b = i5m.b(xgw0.a);
        xvf0 b2 = i5m.b(new awp0(lagVar, lagVar2, b, 21, false));
        lag lagVar3 = new lag(i6rVar, 19);
        lag lagVar4 = new lag(i6rVar, 25);
        lag lagVar5 = new lag(i6rVar, 18);
        nag nagVar = new nag(i6rVar, 20);
        oag oagVar = new oag(i6rVar, 16);
        xvf0 b3 = i5m.b(new e6v0(new lag(i6rVar, 29), 17));
        xvf0 b4 = i5m.b(hfw0.a);
        p9p p9pVar = new p9p(new lag(i6rVar, 27), 23);
        n3w a2 = n3w.a(o);
        n3w a3 = n3w.a(zvvVar);
        xvf0 b5 = i5m.b(efw0.a);
        n3w a4 = n3w.a(f8v0Var);
        xvf0 b6 = i5m.b(twp0.a);
        xvf0 b7 = i5m.b(new ci3(oagVar, b3, b4, p9pVar, a2, a3, b5, a4, b6));
        xvf0 b8 = i5m.b(k9w0.a);
        xvf0 b9 = i5m.b(new p7w0(b8, 1));
        nag nagVar2 = new nag(i6rVar, 21);
        oag oagVar2 = new oag(i6rVar, 10);
        lag lagVar6 = new lag(i6rVar, 20);
        xvf0 b10 = i5m.b(qgw0.a);
        oag oagVar3 = new oag(i6rVar, 2);
        xvf0 b11 = i5m.b(new umt0(b3, b5, (xvf0) a2, (xvf0) lagVar2, 7));
        lag lagVar7 = new lag(i6rVar, 24);
        oag oagVar4 = new oag(i6rVar, 8);
        oag oagVar5 = new oag(i6rVar, 19);
        n3w a5 = n3w.a(ogw0Var);
        oag oagVar6 = new oag(i6rVar, 12);
        oag oagVar7 = new oag(i6rVar, 17);
        n3w a6 = n3w.a(new yks(new xks(b6, lagVar6, oagVar, b10, oagVar3, b7, b4, b11, p9pVar, lagVar7, oagVar4, oagVar5, a5, oagVar6, oagVar7, a4, new oag(i6rVar, 7), new oag(i6rVar, 14), new oag(i6rVar, 11), i5m.b(new rmv0(i5m.b(new e6v0(new lag(i6rVar, 28), 16)), b3, 13)))));
        oag oagVar8 = new oag(i6rVar, 0);
        oag oagVar9 = new oag(i6rVar, 5);
        n3w a7 = n3w.a(i6rVar);
        xvf0 b12 = i5m.b(hgw0.a);
        p7w0 p7w0Var = new p7w0(b11, 13);
        oag oagVar10 = new oag(i6rVar, 13);
        ji3 ji3Var = new ji3(i5m.b(new n4j0(a5, b4, p9pVar, oagVar10, a2, oagVar7, b6, a4)), a4, 14);
        e6v0 e6v0Var = new e6v0(ji3Var, 19);
        n3w n3wVar = y2r0.c;
        ArrayList arrayList = new ArrayList(1);
        List list = Collections.EMPTY_LIST;
        arrayList.add(e6v0Var);
        y2r0 y2r0Var = new y2r0(arrayList, list);
        m5v0 m5v0Var = new m5v0(b4, b11, b7, 15);
        com.yandex.go.suggest.impl.di.a aVar = new com.yandex.go.suggest.impl.di.a(m5v0Var, 0);
        com.yandex.go.suggest.impl.di.a aVar2 = new com.yandex.go.suggest.impl.di.a(m5v0Var, 3);
        com.yandex.go.suggest.impl.di.a aVar3 = new com.yandex.go.suggest.impl.di.a(m5v0Var, 2);
        com.yandex.go.suggest.impl.di.a aVar4 = new com.yandex.go.suggest.impl.di.a(m5v0Var, 1);
        com.yandex.go.suggest.impl.di.c cVar = new com.yandex.go.suggest.impl.di.c(new kxl0(a4, oagVar10, p9pVar, a5, new oag(i6rVar, 18), b6), 1);
        com.yandex.go.suggest.impl.di.c cVar2 = new com.yandex.go.suggest.impl.di.c(new g3p(b4, new oag(i6rVar, 4), 9, false), 0 == true ? 1 : 0);
        oag oagVar11 = new oag(i6rVar, 3);
        umt0 umt0Var = new umt0((xvf0) new lag(i6rVar, 26), b6, (v7p) a3, (v7p) a4, 6);
        com.yandex.go.suggest.impl.di.b bVar = new com.yandex.go.suggest.impl.di.b(oagVar11, umt0Var, b7, n3w.a(lifecycle));
        e6v0 e6v0Var2 = new e6v0(new oag(i6rVar, 15), 20);
        ArrayList arrayList2 = new ArrayList(8);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(aVar);
        arrayList2.add(aVar2);
        arrayList2.add(aVar3);
        arrayList2.add(aVar4);
        arrayList2.add(cVar);
        arrayList2.add(cVar2);
        arrayList2.add(bVar);
        arrayList2.add(e6v0Var2);
        y2r0 y2r0Var2 = new y2r0(arrayList2, list2);
        p7w0 p7w0Var2 = new p7w0(b8, 2);
        ArrayList arrayList3 = new ArrayList(1);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(p7w0Var2);
        y2r0 y2r0Var3 = new y2r0(arrayList3, list3);
        cfw0 cfw0Var = new cfw0(b4, n3w.a(ogw0Var), b7, p9pVar, oagVar, new oag(i6rVar, 1), b5, umt0Var, b6, a4);
        xvf0 b13 = i5m.b(new e6v0(new oag(i6rVar, 9), 18));
        n3w a8 = n3w.a(new wks(new ru2(lagVar, oagVar8, oagVar9, new mz0(a7, b10, b12, p7w0Var, y2r0Var, y2r0Var2, y2r0Var3, cfw0Var, new kpp0(b5, b4, b13, 29), new h90(a4, 14), ji3Var, a2, a4, b, b9, b3, i5m.b(new p7w0(b5, 12))), new oag(i6rVar, 6), oagVar7, a4, new lag(i6rVar, 22), new lag(i6rVar, 23))));
        this.this$0.L = (swp0) b6.get();
        e eVar2 = this.this$0;
        c0g c0gVar = (c0g) i6rVar;
        zzf zzfVar = c0gVar.z;
        w030 C2 = c0gVar.C2();
        q5z.h(C2);
        com.yandex.go.suggest.impl.data.flex.a aVar5 = (com.yandex.go.suggest.impl.data.flex.a) b2.get();
        ru.yandex.taxi.design.utils.b d6 = c0gVar.d6();
        y9y0 b32 = c0gVar.b3();
        t870 D2 = c0gVar.D2();
        l01 l01Var = new l01(new rz0((rqo) zzfVar.C.get(), 0));
        zuj0 N2 = c0gVar.N2();
        q5z.h(N2);
        com.yandex.go.suggest.impl.data.a aVar6 = (com.yandex.go.suggest.impl.data.a) b7.get();
        lg21 d3 = c0gVar.d3();
        q5z.h(d3);
        f9w0 f9w0Var = (f9w0) b9.get();
        com.yandex.go.quark.soul.domain.a aVar7 = new com.yandex.go.quark.soul.domain.a(new g9t0((rqo) zzfVar.C.get()));
        jgw0 jgw0Var = new jgw0(f8v0Var, (com.yandex.go.suggest.impl.data.a) b7.get(), (com.yandex.go.suggest.impl.data.flex.variables.b) b11.get(), (dfw0) b5.get(), (ggw0) b12.get(), new x4v0((dfw0) b5.get(), (gfw0) b4.get(), (c1m0) b13.get()));
        yks yksVar = (yks) a6.a;
        wks wksVar = (wks) a8.a;
        kr0 kr0Var = (kr0) c0gVar.Ec.get();
        q5z.h(kr0Var);
        eVar2.z(new d(C2, aVar5, d6, lagVar3, b32, lagVar4, D2, lagVar5, nagVar, l01Var, N2, aVar6, d3, f9w0Var, aVar7, nagVar2, oagVar2, jgw0Var, yksVar, wksVar, kr0Var, (dfw0) b5.get()), new j230(this.this$0, 3));
        e eVar3 = this.this$0;
        Lifecycle.State state = Lifecycle.State.STARTED;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(eVar3, f8v0Var, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object a9 = b0.a(eVar3, state, anonymousClass2, this);
        coroutineSingletons = coroutineSingletons;
    }
}
