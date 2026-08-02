package com.yandex.go.environment;

import android.os.SystemClock;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.a5o;
import defpackage.b2k;
import defpackage.hxx;
import defpackage.jid;
import defpackage.l10;
import defpackage.m950;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nzw0;
import defpackage.pep0;
import defpackage.pv0;
import defpackage.ra00;
import defpackage.rx2;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tse0;
import defpackage.uoe0;
import defpackage.uyj;
import defpackage.wls;
import defpackage.x4e;
import defpackage.z4o;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.environment.SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1", f = "SwitchNetworkEnvironmentListener.kt", l = {80}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ i this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lpv0;", "Lru/yandex/taxi/persuggest/domain/model/RoutePointType;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.environment.SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1$3", f = "SwitchNetworkEnvironmentListener.kt", l = {102, PollMessageDraft.MAX_ANSWER_LENGTH}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.environment.SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        int I$0;
        long J$0;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        boolean Z$0;
        int label;
        final /* synthetic */ i this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(i iVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0297  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            pv0 pv0Var;
            RoutePointType routePointType;
            a5o environment;
            l10 a;
            Screen b;
            zy11 zy11Var;
            String str;
            String str2;
            z4o z4oVar;
            com.yandex.go.preload.b bVar;
            long j;
            com.yandex.go.preload.b bVar2;
            l10 l10Var;
            int i;
            CoroutineSingletons coroutineSingletons;
            com.yandex.go.preload.b bVar3;
            pv0 pv0Var2;
            int i2;
            String str3;
            boolean z;
            Screen screen;
            RoutePointType routePointType2;
            String str4;
            String str5;
            Pair pair = (Pair) this.L$0;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.label;
            zy11 zy11Var2 = zy11.a;
            try {
                if (i3 == 0) {
                    kotlin.b.b(obj);
                    pv0Var = (pv0) pair.getFirst();
                    routePointType = (RoutePointType) pair.getSecond();
                    environment = pv0Var.a.getEnvironment();
                    a = this.this$0.j.a();
                    b = this.this$0.r.b();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    rx2 rx2Var = this.this$0.q;
                    zy11Var = zy11Var2;
                    String str6 = a.a;
                    str = "default";
                    if (environment == null || (str2 = environment.a) == null) {
                        str2 = str;
                    }
                    String b2 = b.b();
                    String zoneName = pv0Var.a.getZoneName();
                    rx2Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("from_contour", str6);
                    hashMap.put("to_contour", str2);
                    if (zoneName != null) {
                        hashMap.put("zone_name", zoneName);
                    }
                    rx2Var.a.a("SwitchNetworkEnvironment.Started", hashMap, 1, tse0.r("trigger_screen", hashMap, b2));
                    z4oVar = environment != null ? environment.b : null;
                    com.yandex.go.preload.b bVar4 = (com.yandex.go.preload.b) this.this$0.m.get();
                    ((pep0) this.this$0.n).f(bVar4, new uoe0(null, false), hxx.a);
                    this.this$0.j.b(environment != null ? environment.a : null, environment != null ? environment.c : false);
                    try {
                        this.this$0.f.getClass();
                        sjh sjhVar = uyj.a;
                        mdh mdhVar = mdh.b;
                        SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1$3$launchResult$1 switchNetworkEnvironmentListener$onFirstContentfulPaint$1$3$launchResult$1 = new SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1$3$launchResult$1(this.this$0, null);
                        this.L$0 = null;
                        this.L$1 = pv0Var;
                        this.L$2 = routePointType;
                        this.L$3 = environment;
                        this.L$4 = a;
                        this.L$5 = b;
                        this.L$6 = z4oVar;
                        this.L$7 = bVar4;
                        j = elapsedRealtime;
                        try {
                            this.J$0 = j;
                            bVar = bVar4;
                            try {
                                this.I$0 = 0;
                                this.label = 1;
                                Object k0 = tje.k0(mdhVar, switchNetworkEnvironmentListener$onFirstContentfulPaint$1$3$launchResult$1, this);
                                coroutineSingletons = coroutineSingletons2;
                                if (k0 != coroutineSingletons) {
                                    bVar3 = bVar;
                                    obj = k0;
                                    pv0Var2 = pv0Var;
                                    i2 = 0;
                                }
                                return coroutineSingletons;
                            } catch (Throwable th) {
                                th = th;
                                bVar2 = bVar;
                                l10Var = a;
                                i = 0;
                                bVar2.i();
                                if (i == 0) {
                                    this.this$0.j.b(l10Var.a, l10Var.b);
                                    this.this$0.q.a((int) (SystemClock.elapsedRealtime() - j), l10Var.a, (environment == null || (str3 = environment.a) == null) ? str : str3, b.b(), pv0Var.a.getZoneName());
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = bVar4;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bVar = bVar4;
                        j = elapsedRealtime;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var2;
                    }
                    i2 = this.I$0;
                    j = this.J$0;
                    bVar2 = (com.yandex.go.preload.b) this.L$7;
                    z4o z4oVar2 = (z4o) this.L$6;
                    b = (Screen) this.L$5;
                    a = (l10) this.L$4;
                    environment = (a5o) this.L$3;
                    routePointType = (RoutePointType) this.L$2;
                    pv0 pv0Var3 = (pv0) this.L$1;
                    try {
                        kotlin.b.b(obj);
                        z4oVar = z4oVar2;
                        str = "default";
                        bVar3 = bVar2;
                        zy11Var = zy11Var2;
                        coroutineSingletons = coroutineSingletons2;
                        pv0Var2 = pv0Var3;
                    } catch (Throwable th4) {
                        th = th4;
                        l10Var = a;
                        str = "default";
                        i = i2;
                        pv0Var = pv0Var3;
                        bVar2.i();
                        if (i == 0) {
                        }
                        throw th;
                    }
                }
                Result result = (Result) obj;
                z4o z4oVar3 = z4oVar;
                boolean z2 = result.getValue() instanceof Result.Failure;
                boolean z3 = !z2;
                bVar3.i();
                if (z2) {
                    z = z2;
                    screen = b;
                    this.this$0.j.b(a.a, a.b);
                    routePointType2 = routePointType;
                    this.this$0.q.a((int) (SystemClock.elapsedRealtime() - j), a.a, (environment == null || (str5 = environment.a) == null) ? str : str5, screen.b(), pv0Var2.a.getZoneName());
                } else {
                    z = z2;
                    screen = b;
                    routePointType2 = routePointType;
                }
                if (!z) {
                    rx2 rx2Var2 = this.this$0.q;
                    String str7 = a.a;
                    String str8 = (environment == null || (str4 = environment.a) == null) ? str : str4;
                    String b3 = screen.b();
                    int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - j);
                    String zoneName2 = pv0Var2.a.getZoneName();
                    boolean z4 = z4oVar3 != null;
                    rx2Var2.getClass();
                    CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("from_contour", str7);
                    hashMap2.put("to_contour", str8);
                    if (zoneName2 != null) {
                        hashMap2.put("zone_name", zoneName2);
                    }
                    hashMap2.put("trigger_screen", b3);
                    hashMap2.put("duration_ms", Integer.valueOf(elapsedRealtime2));
                    rx2Var2.a.a("SwitchNetworkEnvironment.Success", hashMap2, 1, x4e.r(z4, hashMap2, "modal_shown"));
                    i iVar = this.this$0;
                    ra00 ra00Var = iVar.d;
                    if (z4oVar3 == null) {
                        ra00Var.a();
                    } else {
                        ra00Var.b((m950) iVar.g.get(), new nzw0(z4oVar3.b(), z4oVar3.d(), z4oVar3.c(), z4oVar3.a()));
                    }
                    i iVar2 = this.this$0;
                    com.yandex.go.taxi.order.provider.a aVar = iVar2.p;
                    EmptyList emptyList = EmptyList.a;
                    aVar.e(emptyList);
                    iVar2.k.b(emptyList);
                    iVar2.l.b(emptyList, true, true);
                    i iVar3 = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.J$0 = j;
                    this.Z$0 = z3;
                    this.label = 2;
                    coroutineSingletons = coroutineSingletons3;
                    if (i.i(iVar3, pv0Var2, routePointType2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            } catch (Throwable th5) {
                th = th5;
                Screen screen2 = b;
                int i4 = i2;
                pv0Var = pv0Var2;
                l10Var = a;
                i = i4;
                bVar2 = bVar3;
                b = screen2;
                bVar2.i();
                if (i == 0) {
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SwitchNetworkEnvironmentListener$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar = this.this$0;
            iVar.getClass();
            kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(new f(iVar.a.k(RoutePointType.POINT_A, true)), new SwitchNetworkEnvironmentListener$taxiSourceChangedFlow$1(iVar, null));
            i iVar2 = this.this$0;
            iVar2.getClass();
            b2k s = kotlinx.coroutines.flow.e.s(kotlinx.coroutines.flow.e.K(I, kotlinx.coroutines.flow.e.I(new f(iVar2.a.k(RoutePointType.TRANSPORT_A, true)), new SwitchNetworkEnvironmentListener$mtSourceChangedFlow$1(iVar2, null))), new jid(9, this.this$0));
            i iVar3 = this.this$0;
            h hVar = new h(s, iVar3);
            iVar3.f.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(hVar, uyj.a);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.e.k(F, anonymousClass3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
