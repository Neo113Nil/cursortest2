package com.yandex.go.flex.main_screen.presentation;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.go.flex.main_screen.interactors.p;
import com.yandex.go.flex.main_screen.interactors.q;
import com.yandex.go.payments_widgets.g;
import defpackage.aa00;
import defpackage.acw0;
import defpackage.atx;
import defpackage.b5q0;
import defpackage.bvf0;
import defpackage.cot;
import defpackage.gci0;
import defpackage.gjp0;
import defpackage.gv51;
import defpackage.hl3;
import defpackage.hnr0;
import defpackage.ij3;
import defpackage.jf5;
import defpackage.jl40;
import defpackage.jst;
import defpackage.l8x;
import defpackage.lse;
import defpackage.ly70;
import defpackage.ly90;
import defpackage.mdh;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ocz;
import defpackage.ofa0;
import defpackage.p0t;
import defpackage.p4q0;
import defpackage.py51;
import defpackage.pz40;
import defpackage.q4q0;
import defpackage.qv10;
import defpackage.r4q0;
import defpackage.s4q0;
import defpackage.sjh;
import defpackage.t900;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.ute0;
import defpackage.uyj;
import defpackage.uzs;
import defpackage.v2w0;
import defpackage.wls;
import defpackage.x900;
import defpackage.xir;
import defpackage.y4q0;
import defpackage.y900;
import defpackage.z900;
import defpackage.zir;
import defpackage.zqq;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.ssl.cl_88;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3", f = "MainScreenFlexSdkPresenter.kt", l = {HProv.PP_EXPORT_CSP}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MainScreenFlexSdkPresenter$attachView$3 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<Boolean> $lastIsSupportedZone;
    final /* synthetic */ t900 $mvpView;
    final /* synthetic */ l8x $showInitialDocumentJob;
    final /* synthetic */ com.yandex.go.flex.main_screen.utils.query.a $startAppQuery;
    final /* synthetic */ Ref$ObjectRef<b5q0> $startAppTrigger;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ aa00 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$1", f = "MainScreenFlexSdkPresenter.kt", l = {SubsamplingScaleImageView.ORIENTATION_180}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Ref$ObjectRef<Boolean> $lastIsSupportedZone;
        final /* synthetic */ pz40 $shouldListenToLabelsUpdates;
        final /* synthetic */ com.yandex.go.flex.main_screen.utils.query.a $startAppQuery;
        final /* synthetic */ Ref$ObjectRef<b5q0> $startAppTrigger;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ aa00 this$0;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzir;", "geoParams", "Lzy11;", "<anonymous>", "(Lzir;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$1$1", f = "MainScreenFlexSdkPresenter.kt", l = {185, 209, 213, 230, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$1$1, reason: invalid class name and collision with other inner class name */
        final class C00551 extends SuspendLambda implements wls {
            final /* synthetic */ Ref$ObjectRef<Boolean> $lastIsSupportedZone;
            final /* synthetic */ pz40 $shouldListenToLabelsUpdates;
            final /* synthetic */ Ref$ObjectRef<l8x> $startAppDocumentJob;
            final /* synthetic */ Ref$ObjectRef<Set<p0t>> $startAppGeoRequestIds;
            final /* synthetic */ com.yandex.go.flex.main_screen.utils.query.a $startAppQuery;
            final /* synthetic */ Ref$ObjectRef<b5q0> $startAppTrigger;
            final /* synthetic */ Ref$ObjectRef<l8x> $unsupportedZoneDocumentJob;
            /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            boolean Z$0;
            int label;
            final /* synthetic */ aa00 this$0;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
            @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$1$1$1", f = "MainScreenFlexSdkPresenter.kt", l = {200}, m = "invokeSuspend", v = 2)
            /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes12.dex */
            final class C00561 extends SuspendLambda implements wls {
                int label;
                final /* synthetic */ aa00 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00561(aa00 aa00Var, Continuation continuation) {
                    super(2, continuation);
                    this.this$0 = aa00Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C00561(this.this$0, continuation);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00561) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        kotlin.b.b(obj);
                        q qVar = this.this$0.Q;
                        this.label = 1;
                        if (qVar.a(this) == coroutineSingletons) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00551(aa00 aa00Var, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, pz40 pz40Var, com.yandex.go.flex.main_screen.utils.query.a aVar, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, Continuation continuation) {
                super(2, continuation);
                this.this$0 = aa00Var;
                this.$lastIsSupportedZone = ref$ObjectRef;
                this.$startAppTrigger = ref$ObjectRef2;
                this.$shouldListenToLabelsUpdates = pz40Var;
                this.$startAppQuery = aVar;
                this.$startAppDocumentJob = ref$ObjectRef3;
                this.$startAppGeoRequestIds = ref$ObjectRef4;
                this.$unsupportedZoneDocumentJob = ref$ObjectRef5;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C00551 c00551 = new C00551(this.this$0, this.$lastIsSupportedZone, this.$startAppTrigger, this.$shouldListenToLabelsUpdates, this.$startAppQuery, this.$startAppDocumentJob, this.$startAppGeoRequestIds, this.$unsupportedZoneDocumentJob, continuation);
                c00551.L$0 = obj;
                return c00551;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C00551) create((zir) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x0241, code lost:
            
                if (r13 == r1) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x01ff, code lost:
            
                if (r0 != false) goto L79;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x0201, code lost:
            
                r3 = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x021d, code lost:
            
                if (r0 != false) goto L79;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x012f, code lost:
            
                if (r13 == r1) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x0191, code lost:
            
                if (r13 == r1) goto L94;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x0085, code lost:
            
                if (r13.a(r12) == r1) goto L94;
             */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0233  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x01a9  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0222  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0113  */
            /* JADX WARN: Type inference failed for: r0v5, types: [T, pzt0] */
            /* JADX WARN: Type inference failed for: r0v6, types: [T, java.util.Set] */
            /* JADX WARN: Type inference failed for: r10v1, types: [T, java.lang.Boolean] */
            /* JADX WARN: Type inference failed for: r13v40, types: [T, pzt0] */
            /* JADX WARN: Type inference failed for: r3v0, types: [T, kotlin.collections.EmptySet] */
            /* JADX WARN: Type inference failed for: r8v1, types: [T, java.lang.Boolean] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                boolean G;
                b5q0 b5q0Var;
                ute0 ute0Var;
                l8x l8xVar;
                boolean z;
                l8x l8xVar2;
                b5q0 b5q0Var2;
                zir zirVar = (zir) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                ?? r3 = EmptySet.a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    G = bvf0.G(this.this$0.P, zirVar);
                    if (G && jl40.l(this.$lastIsSupportedZone.element, Boolean.FALSE)) {
                        this.$lastIsSupportedZone.element = Boolean.TRUE;
                        p pVar = this.this$0.C;
                        this.L$0 = zirVar;
                        this.Z$0 = G;
                        this.label = 1;
                    } else {
                        this.$lastIsSupportedZone.element = Boolean.valueOf(G);
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            G = this.Z$0;
                            b5q0Var = (b5q0) this.L$1;
                            kotlin.b.b(obj);
                            ute0Var = (ute0) obj;
                            jst.e.getClass();
                            if (ute0Var == null) {
                                com.yandex.go.flex.main_screen.interactors.d dVar = this.this$0.A;
                                List singletonList = Collections.singletonList(b5q0Var.a);
                                zzs a = zirVar.a();
                                this.L$0 = zirVar;
                                this.L$1 = b5q0Var;
                                this.L$2 = null;
                                this.Z$0 = G;
                                this.label = 3;
                                obj = dVar.a(a, singletonList, this);
                            }
                            this.$startAppGeoRequestIds.element = zirVar.c();
                            l8xVar = this.$startAppDocumentJob.element;
                            if (l8xVar != null) {
                            }
                            Ref$ObjectRef<l8x> ref$ObjectRef = this.$startAppDocumentJob;
                            aa00 aa00Var = this.this$0;
                            ref$ObjectRef.element = tje.M(aa00Var.Jg(), new ij3(lse.a, 8), CoroutineStart.UNDISPATCHED, new MainScreenFlexSdkPresenter$loadStartAppDocument$2(aa00Var, Collections.singleton(b5q0Var), ute0Var, null));
                            this.$startAppTrigger.element = null;
                            z = G;
                            l8xVar2 = this.$startAppDocumentJob.element;
                            if (l8xVar2 != null) {
                            }
                            pz40 pz40Var = this.$shouldListenToLabelsUpdates;
                            Boolean valueOf = Boolean.valueOf(z);
                            r0 r0Var = (r0) pz40Var;
                            r0Var.getClass();
                            r0Var.m(null, valueOf);
                            return zy11.a;
                        }
                        if (i == 3) {
                            G = this.Z$0;
                            b5q0Var = (b5q0) this.L$1;
                            kotlin.b.b(obj);
                            ute0Var = (ute0) obj;
                            this.$startAppGeoRequestIds.element = zirVar.c();
                            l8xVar = this.$startAppDocumentJob.element;
                            if (l8xVar != null) {
                                l8xVar.a(null);
                            }
                            Ref$ObjectRef<l8x> ref$ObjectRef2 = this.$startAppDocumentJob;
                            aa00 aa00Var2 = this.this$0;
                            ref$ObjectRef2.element = tje.M(aa00Var2.Jg(), new ij3(lse.a, 8), CoroutineStart.UNDISPATCHED, new MainScreenFlexSdkPresenter$loadStartAppDocument$2(aa00Var2, Collections.singleton(b5q0Var), ute0Var, null));
                            this.$startAppTrigger.element = null;
                            z = G;
                            l8xVar2 = this.$startAppDocumentJob.element;
                            if (l8xVar2 != null) {
                            }
                            pz40 pz40Var2 = this.$shouldListenToLabelsUpdates;
                            Boolean valueOf2 = Boolean.valueOf(z);
                            r0 r0Var2 = (r0) pz40Var2;
                            r0Var2.getClass();
                            r0Var2.m(null, valueOf2);
                            return zy11.a;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z = this.Z$0;
                            kotlin.b.b(obj);
                            pz40 pz40Var22 = this.$shouldListenToLabelsUpdates;
                            Boolean valueOf22 = Boolean.valueOf(z);
                            r0 r0Var22 = (r0) pz40Var22;
                            r0Var22.getClass();
                            r0Var22.m(null, valueOf22);
                            return zy11.a;
                        }
                        G = this.Z$0;
                        kotlin.b.b(obj);
                        if (Collections.disjoint(this.$startAppGeoRequestIds.element, zirVar.c())) {
                            this.$startAppGeoRequestIds.element = r3;
                            cot cotVar = this.this$0.S;
                            if (zirVar instanceof xir) {
                                cotVar.getClass();
                            } else {
                                zzs zzsVar = (zzs) ((atx) cotVar.b).a.get();
                                if (zzsVar != null) {
                                    zzs a2 = zirVar.a();
                                    uzs uzsVar = zzs.Companion;
                                    if (zzsVar.a(a2, 1.0E-6d)) {
                                        jst.e.getClass();
                                    }
                                }
                                Float valueOf3 = zzsVar != null ? Float.valueOf(ru.yandex.taxi.map.utils.a.j(zzsVar, zirVar.a())) : null;
                                boolean b = zirVar.b();
                                jst.e.getClass();
                                b5q0Var2 = p4q0.d;
                                q4q0 q4q0Var = q4q0.d;
                                if (valueOf3 != null) {
                                    if (valueOf3.floatValue() < 100.0f) {
                                        b5q0Var2 = r4q0.d;
                                    } else if (valueOf3.floatValue() <= 1000.0f) {
                                        b5q0Var2 = s4q0.d;
                                    }
                                    if (b5q0Var2 != null) {
                                        this.this$0.D.a(b5q0Var2);
                                    }
                                }
                            }
                            b5q0Var2 = null;
                            if (b5q0Var2 != null) {
                            }
                        }
                        z = G;
                        l8xVar2 = this.$startAppDocumentJob.element;
                        if (l8xVar2 != null) {
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.Z$0 = z;
                            this.label = 5;
                            obj = l8xVar2.u0(this);
                        }
                        pz40 pz40Var222 = this.$shouldListenToLabelsUpdates;
                        Boolean valueOf222 = Boolean.valueOf(z);
                        r0 r0Var222 = (r0) pz40Var222;
                        r0Var222.getClass();
                        r0Var222.m(null, valueOf222);
                        return zy11.a;
                    }
                    G = this.Z$0;
                    kotlin.b.b(obj);
                }
                b5q0 b5q0Var3 = this.$startAppTrigger.element;
                if (!G) {
                    pz40 pz40Var3 = this.$shouldListenToLabelsUpdates;
                    Boolean bool = Boolean.FALSE;
                    r0 r0Var3 = (r0) pz40Var3;
                    r0Var3.getClass();
                    r0Var3.m(null, bool);
                    this.$startAppQuery.b();
                    l8x l8xVar3 = this.$startAppDocumentJob.element;
                    if (l8xVar3 != null) {
                        l8xVar3.a(null);
                    }
                    this.$startAppDocumentJob.element = null;
                    this.$startAppGeoRequestIds.element = r3;
                    l8x l8xVar4 = this.$unsupportedZoneDocumentJob.element;
                    if (l8xVar4 != null) {
                        l8xVar4.a(null);
                    }
                    this.$unsupportedZoneDocumentJob.element = tje.N(this.this$0.Jg(), null, null, new C00561(this.this$0, null), 3);
                    z = G;
                    l8xVar2 = this.$startAppDocumentJob.element;
                    if (l8xVar2 != null) {
                    }
                    pz40 pz40Var2222 = this.$shouldListenToLabelsUpdates;
                    Boolean valueOf2222 = Boolean.valueOf(z);
                    r0 r0Var2222 = (r0) pz40Var2222;
                    r0Var2222.getClass();
                    r0Var2222.m(null, valueOf2222);
                    return zy11.a;
                }
                Ref$ObjectRef<l8x> ref$ObjectRef3 = this.$unsupportedZoneDocumentJob;
                if (b5q0Var3 == null) {
                    l8x l8xVar5 = ref$ObjectRef3.element;
                    if (l8xVar5 != null) {
                        l8xVar5.a(null);
                    }
                    this.$unsupportedZoneDocumentJob.element = null;
                    l8x l8xVar6 = this.$startAppDocumentJob.element;
                    if (l8xVar6 != null) {
                        this.L$0 = zirVar;
                        this.L$1 = null;
                        this.Z$0 = G;
                        this.label = 4;
                        obj = l8xVar6.u0(this);
                    }
                    if (Collections.disjoint(this.$startAppGeoRequestIds.element, zirVar.c())) {
                    }
                    z = G;
                    l8xVar2 = this.$startAppDocumentJob.element;
                    if (l8xVar2 != null) {
                    }
                    pz40 pz40Var22222 = this.$shouldListenToLabelsUpdates;
                    Boolean valueOf22222 = Boolean.valueOf(z);
                    r0 r0Var22222 = (r0) pz40Var22222;
                    r0Var22222.getClass();
                    r0Var22222.m(null, valueOf22222);
                    return zy11.a;
                }
                l8x l8xVar7 = ref$ObjectRef3.element;
                if (l8xVar7 != null) {
                    l8xVar7.a(null);
                }
                this.$unsupportedZoneDocumentJob.element = null;
                com.yandex.go.flex.main_screen.utils.query.a aVar = this.$startAppQuery;
                Set c = zirVar.c();
                this.L$0 = zirVar;
                this.L$1 = b5q0Var3;
                this.Z$0 = G;
                this.label = 2;
                Object a3 = aVar.a(c, this);
                if (a3 != coroutineSingletons) {
                    b5q0Var = b5q0Var3;
                    obj = a3;
                    ute0Var = (ute0) obj;
                    jst.e.getClass();
                    if (ute0Var == null) {
                    }
                    this.$startAppGeoRequestIds.element = zirVar.c();
                    l8xVar = this.$startAppDocumentJob.element;
                    if (l8xVar != null) {
                    }
                    Ref$ObjectRef<l8x> ref$ObjectRef22 = this.$startAppDocumentJob;
                    aa00 aa00Var22 = this.this$0;
                    ref$ObjectRef22.element = tje.M(aa00Var22.Jg(), new ij3(lse.a, 8), CoroutineStart.UNDISPATCHED, new MainScreenFlexSdkPresenter$loadStartAppDocument$2(aa00Var22, Collections.singleton(b5q0Var), ute0Var, null));
                    this.$startAppTrigger.element = null;
                    z = G;
                    l8xVar2 = this.$startAppDocumentJob.element;
                    if (l8xVar2 != null) {
                    }
                    pz40 pz40Var222222 = this.$shouldListenToLabelsUpdates;
                    Boolean valueOf222222 = Boolean.valueOf(z);
                    r0 r0Var222222 = (r0) pz40Var222222;
                    r0Var222222.getClass();
                    r0Var222222.m(null, valueOf222222);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(aa00 aa00Var, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, pz40 pz40Var, com.yandex.go.flex.main_screen.utils.query.a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aa00Var;
            this.$lastIsSupportedZone = ref$ObjectRef;
            this.$startAppTrigger = ref$ObjectRef2;
            this.$shouldListenToLabelsUpdates = pz40Var;
            this.$startAppQuery = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$lastIsSupportedZone, this.$startAppTrigger, this.$shouldListenToLabelsUpdates, this.$startAppQuery, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Type inference failed for: r15v1, types: [T, kotlin.collections.EmptySet] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                Ref$ObjectRef z = qv10.z(obj);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                ref$ObjectRef2.element = EmptySet.a;
                aa00 aa00Var = this.this$0;
                mth mthVar = new mth(aa00Var.J.b, 6);
                C00551 c00551 = new C00551(aa00Var, this.$lastIsSupportedZone, this.$startAppTrigger, this.$shouldListenToLabelsUpdates, this.$startAppQuery, z, ref$ObjectRef2, ref$ObjectRef, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(mthVar, c00551, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$10", f = "MainScreenFlexSdkPresenter.kt", l = {307}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$10, reason: invalid class name */
    final class AnonymousClass10 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ aa00 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(aa00 aa00Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aa00Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass10(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass10) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                aa00 aa00Var = this.this$0;
                gci0 gci0Var = aa00Var.T.b;
                x900 x900Var = new x900(aa00Var, 0);
                this.label = 1;
                if (gci0Var.a.collect(x900Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            ny61.A();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$11", f = "MainScreenFlexSdkPresenter.kt", l = {311}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$11, reason: invalid class name */
    final class AnonymousClass11 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ aa00 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(aa00 aa00Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aa00Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass11(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass11) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                g gVar = this.this$0.U;
                this.label = 1;
                if (gVar.a(this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$12", f = "MainScreenFlexSdkPresenter.kt", l = {316}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$12, reason: invalid class name */
    final class AnonymousClass12 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ aa00 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(aa00 aa00Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aa00Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass12(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass12) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ofa0 ofa0Var = this.this$0.V;
                com.yandex.go.payments_widgets.d dVar = new com.yandex.go.payments_widgets.d(kotlinx.coroutines.flow.e.K(new com.yandex.go.payments_widgets.f(((py51) ofa0Var.b).b()), new com.yandex.go.payments_widgets.b(new mth(((gv51) ofa0Var.c).a, 4)), ((ly90) ofa0Var.w).a));
                ((tt2) ofa0Var.a).getClass();
                sjh sjhVar = uyj.a;
                tpr F = kotlinx.coroutines.flow.e.F(dVar, mdh.b);
                y900 y900Var = new y900(this.this$0, 0);
                this.label = 1;
                if (F.collect(y900Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$13", f = "MainScreenFlexSdkPresenter.kt", l = {323}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$13, reason: invalid class name */
    final class AnonymousClass13 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ aa00 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(aa00 aa00Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aa00Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass13(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass13) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                kotlin.b.b(obj);
                aa00 aa00Var = this.this$0;
                r0 r0Var = ((v2w0) aa00Var.W).a;
                y900 y900Var = new y900(aa00Var, i2);
                this.label = 1;
                if (r0Var.collect(y900Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$14", f = "MainScreenFlexSdkPresenter.kt", l = {329}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$14, reason: invalid class name */
    final class AnonymousClass14 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ aa00 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(aa00 aa00Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aa00Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass14(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass14) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.go.flex.main_screen.presentation.feed.b bVar = this.this$0.c0;
                this.label = 1;
                if (bVar.b(this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$15", f = "MainScreenFlexSdkPresenter.kt", l = {336}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$15, reason: invalid class name */
    final class AnonymousClass15 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ aa00 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(aa00 aa00Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aa00Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass15(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass15) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                kotlin.b.b(obj);
                tpr t = kotlinx.coroutines.flow.e.t(new c(kotlinx.coroutines.flow.e.d(((acw0) this.this$0.g0).b)));
                x900 x900Var = new x900(this.this$0, i2);
                this.label = 1;
                if (t.collect(x900Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$2", f = "MainScreenFlexSdkPresenter.kt", l = {247}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ aa00 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(aa00 aa00Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aa00Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ly70 ly70Var = this.this$0.F;
                tpr t = kotlinx.coroutines.flow.e.t(new com.yandex.go.flex.main_screen.domain.c(ly70Var.b.k, ly70Var.c));
                ly70Var.a.getClass();
                tpr F = kotlinx.coroutines.flow.e.F(t, uyj.a);
                y900 y900Var = new y900(this.this$0, 2);
                this.label = 1;
                if (F.collect(y900Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$3", f = "MainScreenFlexSdkPresenter.kt", l = {253}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ aa00 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(aa00 aa00Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aa00Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                hnr0 hnr0Var = (hnr0) ((zqq) this.this$0.I).f.getValue();
                this.this$0.E.getClass();
                sjh sjhVar = uyj.a;
                tpr F = kotlinx.coroutines.flow.e.F(hnr0Var, mdh.b);
                y900 y900Var = new y900(this.this$0, 3);
                this.label = 1;
                if (F.collect(y900Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$4", f = "MainScreenFlexSdkPresenter.kt", l = {cl_88.n}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ aa00 this$0;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhl3;", "authStatus", "Lzy11;", "<anonymous>", "(Lhl3;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$4$1", f = "MainScreenFlexSdkPresenter.kt", l = {263}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$4$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements wls {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ aa00 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(aa00 aa00Var, Continuation continuation) {
                super(2, continuation);
                this.this$0 = aa00Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((hl3) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                hl3 hl3Var = (hl3) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    this.this$0.D.a(new y4q0(hl3Var));
                    aa00 aa00Var = this.this$0;
                    this.L$0 = null;
                    this.label = 1;
                    if (aa00Var.N.a(new gjp0(Boolean.FALSE), this) == coroutineSingletons) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(aa00 aa00Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aa00Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                tpr t = kotlinx.coroutines.flow.e.t(this.this$0.L.h());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(t, anonymousClass1, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$5", f = "MainScreenFlexSdkPresenter.kt", l = {431}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements wls {
        final /* synthetic */ pz40 $shouldListenToLabelsUpdates;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ aa00 this$0;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shouldListen", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$5$1", f = "MainScreenFlexSdkPresenter.kt", l = {431}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$5$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements wls {
            final /* synthetic */ tse $$this$launch;
            Object L$0;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ aa00 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(aa00 aa00Var, tse tseVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = aa00Var;
                this.$$this$launch = tseVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$launch, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((AnonymousClass1) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                if (z) {
                    o oVar = new o(this.this$0.z.b(), new MainScreenFlexSdkPresenter$attachView$3$5$1$invokeSuspend$$inlined$safeCollect$1(this.$$this$launch, null));
                    z900 z900Var = new z900();
                    this.L$0 = null;
                    this.Z$0 = z;
                    this.label = 1;
                    if (oVar.collect(z900Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(pz40 pz40Var, aa00 aa00Var, Continuation continuation) {
            super(2, continuation);
            this.$shouldListenToLabelsUpdates = pz40Var;
            this.this$0 = aa00Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$shouldListenToLabelsUpdates, this.this$0, continuation);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                pz40 pz40Var = this.$shouldListenToLabelsUpdates;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, tseVar, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(pz40Var, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            ny61.r("SharedFlow never completes, this call should never return.");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$6", f = "MainScreenFlexSdkPresenter.kt", l = {HProv.ALG_SID_SHA_224}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$6, reason: invalid class name */
    final class AnonymousClass6 extends SuspendLambda implements wls {
        final /* synthetic */ t900 $mvpView;
        int label;
        final /* synthetic */ aa00 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(aa00 aa00Var, t900 t900Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aa00Var;
            this.$mvpView = t900Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass6(this.this$0, this.$mvpView, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass6) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                gci0 gci0Var = this.this$0.K.e;
                ocz oczVar = new ocz(4, this.$mvpView);
                this.label = 1;
                if (gci0Var.a.collect(oczVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            ny61.A();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$7", f = "MainScreenFlexSdkPresenter.kt", l = {292}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$7, reason: invalid class name */
    final class AnonymousClass7 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ aa00 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(aa00 aa00Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aa00Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass7(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass7) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                tpr b = this.this$0.N.b();
                jf5 jf5Var = new jf5(5, this.this$0.x);
                this.label = 1;
                if (b.collect(jf5Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$8", f = "MainScreenFlexSdkPresenter.kt", l = {297}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$8, reason: invalid class name */
    final class AnonymousClass8 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ aa00 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(aa00 aa00Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aa00Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass8(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass8) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                aa00 aa00Var = this.this$0;
                gci0 gci0Var = aa00Var.e0.b;
                x900 x900Var = new x900(aa00Var, 2);
                this.label = 1;
                if (gci0Var.a.collect(x900Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$9", f = "MainScreenFlexSdkPresenter.kt", l = {302}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkPresenter$attachView$3$9, reason: invalid class name */
    final class AnonymousClass9 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ aa00 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(aa00 aa00Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aa00Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass9(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass9) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                aa00 aa00Var = this.this$0;
                gci0 gci0Var = aa00Var.O.b;
                x900 x900Var = new x900(aa00Var, 3);
                this.label = 1;
                if (gci0Var.a.collect(x900Var, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenFlexSdkPresenter$attachView$3(l8x l8xVar, aa00 aa00Var, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, com.yandex.go.flex.main_screen.utils.query.a aVar, t900 t900Var, Continuation continuation) {
        super(2, continuation);
        this.$showInitialDocumentJob = l8xVar;
        this.this$0 = aa00Var;
        this.$lastIsSupportedZone = ref$ObjectRef;
        this.$startAppTrigger = ref$ObjectRef2;
        this.$startAppQuery = aVar;
        this.$mvpView = t900Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainScreenFlexSdkPresenter$attachView$3 mainScreenFlexSdkPresenter$attachView$3 = new MainScreenFlexSdkPresenter$attachView$3(this.$showInitialDocumentJob, this.this$0, this.$lastIsSupportedZone, this.$startAppTrigger, this.$startAppQuery, this.$mvpView, continuation);
        mainScreenFlexSdkPresenter$attachView$3.L$0 = obj;
        return mainScreenFlexSdkPresenter$attachView$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainScreenFlexSdkPresenter$attachView$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l8x l8xVar = this.$showInitialDocumentJob;
            this.L$0 = tseVar;
            this.label = 1;
            if (l8xVar.u0(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        r0 c = bvf0.c(Boolean.FALSE);
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, this.$lastIsSupportedZone, this.$startAppTrigger, c, this.$startAppQuery, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass4(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass5(c, this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass6(this.this$0, this.$mvpView, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass7(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass8(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass9(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass10(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass11(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass12(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass13(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass14(this.this$0, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass15(this.this$0, null), 3);
        return zy11.a;
    }
}
