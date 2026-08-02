package com.yandex.quark.core.common.internal.consumer;

import com.yandex.quark.core.common.internal.consumer.capability.b;
import com.yandex.quark.core.common.internal.consumer.capability.c;
import com.yandex.quark.core.common.internal.consumer.capability.d;
import com.yandex.quark.utils.Disposable;
import com.yandex.quark.webchat.feature.dependencies.BufferingProfile;
import defpackage.a6h;
import defpackage.arw;
import defpackage.b64;
import defpackage.crw;
import defpackage.dsu;
import defpackage.dsw;
import defpackage.e0p;
import defpackage.e38;
import defpackage.e8h;
import defpackage.esu;
import defpackage.f38;
import defpackage.ffj;
import defpackage.g38;
import defpackage.gj41;
import defpackage.hqv;
import defpackage.hzl0;
import defpackage.ilu;
import defpackage.jhg0;
import defpackage.jl;
import defpackage.jx11;
import defpackage.jyj0;
import defpackage.k6h;
import defpackage.k9e;
import defpackage.l9e;
import defpackage.lyj0;
import defpackage.ms1;
import defpackage.o6e;
import defpackage.o6h;
import defpackage.pa41;
import defpackage.phg0;
import defpackage.qoi0;
import defpackage.qs1;
import defpackage.rl;
import defpackage.sru0;
import defpackage.sya0;
import defpackage.syj0;
import defpackage.tls;
import defpackage.u5h;
import defpackage.uqw;
import defpackage.v2n;
import defpackage.vj21;
import defpackage.vjd;
import defpackage.vx;
import defpackage.vy11;
import defpackage.w5h;
import defpackage.wdf0;
import defpackage.x8o;
import defpackage.x9z;
import defpackage.xa20;
import defpackage.xch;
import defpackage.xl60;
import defpackage.y3h;
import defpackage.y5h;
import defpackage.y9z;
import defpackage.yt1;
import defpackage.yv;
import defpackage.yw;
import defpackage.zk;
import defpackage.zoc;
import defpackage.zv;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class a implements rl, qs1, zv, uqw, e0p, crw, ffj, hzl0, f38, yt1, esu, yw, x9z, sru0, jx11, g38, arw, wdf0, k9e {
    public final /* synthetic */ com.yandex.quark.core.common.internal.consumer.dialogTriggerHandler.a A;
    public final /* synthetic */ com.yandex.quark.core.common.internal.consumer.satellite.a B;
    public final /* synthetic */ com.yandex.quark.core.common.internal.consumer.capability.a C;
    public final /* synthetic */ com.yandex.quark.core.common.internal.consumer.supportedFeatures.a D;
    public final /* synthetic */ com.yandex.quark.core.common.internal.consumer.webHost.a E;
    public final /* synthetic */ com.yandex.quark.core.common.internal.consumer.actionObservable.a F;
    public final /* synthetic */ com.yandex.quark.core.common.internal.consumer.location.a G;
    public final /* synthetic */ com.yandex.quark.core.common.internal.consumer.streaming.a H;
    public final /* synthetic */ d I;
    public final /* synthetic */ b J;
    public final /* synthetic */ c K;
    public final /* synthetic */ com.yandex.quark.core.common.internal.consumer.profile.a L;
    public final String M;
    public final Map N;
    public final x8o a;
    public final /* synthetic */ zk b;
    public final /* synthetic */ com.yandex.quark.core.common.internal.consumer.aliceProSubscriptionChecker.a c;
    public final /* synthetic */ com.yandex.quark.core.common.internal.consumer.actionExecutor.a w;
    public final /* synthetic */ com.yandex.quark.core.common.internal.consumer.actionExecutor.b x;
    public final /* synthetic */ com.yandex.quark.core.common.internal.consumer.config.a y;
    public final /* synthetic */ com.yandex.quark.core.common.internal.consumer.config.b z;

    public a(zoc zocVar, pa41 pa41Var, com.yandex.quark.lite.b bVar, x8o x8oVar, xa20 xa20Var, ilu iluVar, xch xchVar, sya0 sya0Var, gj41 gj41Var, vx vxVar, y3h y3hVar, k6h k6hVar, y5h y5hVar, o6h o6hVar, a6h a6hVar, u5h u5hVar, w5h w5hVar, xl60 xl60Var, phg0 phg0Var) {
        vj21 vj21Var = new vj21();
        vy11 vy11Var = new vy11();
        o6e o6eVar = new o6e("CommonQuarkConfigRegistry", zocVar, CoreConsumerRegistry$1.b, xa20Var);
        o6e o6eVar2 = new o6e("ArpcClientRegistry", pa41Var, CoreConsumerRegistry$2.b, xa20Var);
        o6e o6eVar3 = new o6e("InternalEndpointRegistry", bVar, CoreConsumerRegistry$3.b, xa20Var);
        o6e o6eVar4 = new o6e("AudioSinkRegistry", k6hVar, CoreConsumerRegistry$4.b, xa20Var);
        o6e o6eVar5 = new o6e("AudioInputRegistry", y5hVar, CoreConsumerRegistry$5.b, xa20Var);
        o6e o6eVar6 = new o6e("AudioSourceRegistry", o6hVar, CoreConsumerRegistry$6.b, xa20Var);
        o6e o6eVar7 = new o6e("AudioRecorderFactoryRegistry", a6hVar, CoreConsumerRegistry$7.b, xa20Var);
        o6e o6eVar8 = new o6e("AudioChannelsSerializerRegistry", u5hVar, CoreConsumerRegistry$8.b, xa20Var);
        o6e o6eVar9 = new o6e("DefaultAudioSinkFactoryRegistry", phg0Var, CoreConsumerRegistry$9.b, xa20Var);
        o6e o6eVar10 = new o6e("AudioFocusManagerRegistry", w5hVar, CoreConsumerRegistry$10.b, xa20Var);
        o6e o6eVar11 = new o6e("FilePlayerRegistry", xl60Var, CoreConsumerRegistry$11.b, xa20Var);
        o6e o6eVar12 = new o6e("LoggerRegistry", x8oVar, CoreConsumerRegistry$12.b, xa20Var);
        o6e o6eVar13 = new o6e("MetricaRegistry", xa20Var, CoreConsumerRegistry$13.b, xa20Var);
        o6e o6eVar14 = new o6e("HistogramRecorderRegistry", iluVar, CoreConsumerRegistry$14.b, xa20Var);
        o6e o6eVar15 = new o6e("IdentityRegistry", xchVar, CoreConsumerRegistry$15.b, xa20Var);
        o6e o6eVar16 = new o6e("PermissionRequesterRegistry", sya0Var, CoreConsumerRegistry$16.b, xa20Var);
        o6e o6eVar17 = new o6e("PermissionCheckerRegistry", sya0Var, CoreConsumerRegistry$17.b, xa20Var);
        o6e o6eVar18 = new o6e("PermissionRequestInfoProviderRegistry", sya0Var, CoreConsumerRegistry$18.b, xa20Var);
        o6e o6eVar19 = new o6e("PermissionSetterRegistry", gj41Var, CoreConsumerRegistry$19.b, xa20Var);
        o6e o6eVar20 = new o6e("UserAgentSetterRegistry", vj21Var, CoreConsumerRegistry$20.b, xa20Var);
        o6e o6eVar21 = new o6e("UniproxyCookiesRegistry", vy11Var, CoreConsumerRegistry$21.b, xa20Var);
        o6e o6eVar22 = new o6e("ActionSchedulerRegistry", vxVar, CoreConsumerRegistry$22.b, xa20Var);
        o6e o6eVar23 = new o6e("DeeplinkWrapperRegistry", y3hVar, CoreConsumerRegistry$23.b, xa20Var);
        b bVar2 = new b(xa20Var);
        c cVar = new c(xa20Var);
        zk zkVar = new zk(x8oVar, xa20Var);
        com.yandex.quark.core.common.internal.consumer.alice.a aVar = new com.yandex.quark.core.common.internal.consumer.alice.a(xa20Var);
        com.yandex.quark.core.common.internal.consumer.aliceProSubscriptionChecker.a aVar2 = new com.yandex.quark.core.common.internal.consumer.aliceProSubscriptionChecker.a(xa20Var);
        com.yandex.quark.core.common.internal.consumer.actionExecutor.a aVar3 = new com.yandex.quark.core.common.internal.consumer.actionExecutor.a(xa20Var);
        com.yandex.quark.core.common.internal.consumer.actionExecutor.b bVar3 = new com.yandex.quark.core.common.internal.consumer.actionExecutor.b(xa20Var);
        com.yandex.quark.core.common.internal.consumer.config.a aVar4 = new com.yandex.quark.core.common.internal.consumer.config.a(xa20Var);
        com.yandex.quark.core.common.internal.consumer.config.b bVar4 = new com.yandex.quark.core.common.internal.consumer.config.b(xa20Var);
        com.yandex.quark.core.common.internal.consumer.dialogTriggerHandler.a aVar5 = new com.yandex.quark.core.common.internal.consumer.dialogTriggerHandler.a(xa20Var);
        com.yandex.quark.core.common.internal.consumer.satellite.a aVar6 = new com.yandex.quark.core.common.internal.consumer.satellite.a(xa20Var);
        com.yandex.quark.core.common.internal.consumer.capability.a aVar7 = new com.yandex.quark.core.common.internal.consumer.capability.a(xa20Var);
        com.yandex.quark.core.common.internal.consumer.supportedFeatures.a aVar8 = new com.yandex.quark.core.common.internal.consumer.supportedFeatures.a(xa20Var);
        com.yandex.quark.core.common.internal.consumer.webHost.a aVar9 = new com.yandex.quark.core.common.internal.consumer.webHost.a(xa20Var);
        com.yandex.quark.core.common.internal.consumer.actionObservable.a aVar10 = new com.yandex.quark.core.common.internal.consumer.actionObservable.a(xa20Var);
        com.yandex.quark.core.common.internal.consumer.location.a aVar11 = new com.yandex.quark.core.common.internal.consumer.location.a(xa20Var);
        com.yandex.quark.core.common.internal.consumer.streaming.a aVar12 = new com.yandex.quark.core.common.internal.consumer.streaming.a(xa20Var);
        d dVar = new d(xa20Var);
        com.yandex.quark.core.common.internal.consumer.profile.a aVar13 = new com.yandex.quark.core.common.internal.consumer.profile.a(xa20Var);
        this.a = x8oVar;
        this.b = zkVar;
        this.c = aVar2;
        this.w = aVar3;
        this.x = bVar3;
        this.y = aVar4;
        this.z = bVar4;
        this.A = aVar5;
        this.B = aVar6;
        this.C = aVar7;
        this.D = aVar8;
        this.E = aVar9;
        this.F = aVar10;
        this.G = aVar11;
        this.H = aVar12;
        this.I = dVar;
        this.J = bVar2;
        this.K = cVar;
        this.L = aVar13;
        this.M = "CoreConsumerRegistry";
        this.N = kotlin.collections.b.i(new Pair(o6eVar12, new CoreConsumerRegistry$allRegistries$1(1, o6eVar12, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar13, new CoreConsumerRegistry$allRegistries$2(1, o6eVar13, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar15, new CoreConsumerRegistry$allRegistries$3(1, o6eVar15, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar17, new CoreConsumerRegistry$allRegistries$4(1, o6eVar17, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar16, new CoreConsumerRegistry$allRegistries$5(1, o6eVar16, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar18, new CoreConsumerRegistry$allRegistries$6(1, o6eVar18, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar19, new CoreConsumerRegistry$allRegistries$7(1, o6eVar19, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar20, new CoreConsumerRegistry$allRegistries$8(1, o6eVar20, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar21, new CoreConsumerRegistry$allRegistries$9(1, o6eVar21, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar, new CoreConsumerRegistry$allRegistries$10(1, o6eVar, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar2, new CoreConsumerRegistry$allRegistries$11(1, o6eVar2, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(bVar2, new CoreConsumerRegistry$allRegistries$12(1, bVar2, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(cVar, new CoreConsumerRegistry$allRegistries$13(1, cVar, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar3, new CoreConsumerRegistry$allRegistries$14(1, o6eVar3, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(aVar6, new CoreConsumerRegistry$allRegistries$15(1, aVar6, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar4, new CoreConsumerRegistry$allRegistries$16(1, o6eVar4, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar5, new CoreConsumerRegistry$allRegistries$17(1, o6eVar5, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar6, new CoreConsumerRegistry$allRegistries$18(1, o6eVar6, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar7, new CoreConsumerRegistry$allRegistries$19(1, o6eVar7, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar8, new CoreConsumerRegistry$allRegistries$20(1, o6eVar8, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar9, new CoreConsumerRegistry$allRegistries$21(1, o6eVar9, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar10, new CoreConsumerRegistry$allRegistries$22(1, o6eVar10, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar11, new CoreConsumerRegistry$allRegistries$23(1, o6eVar11, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(zkVar, new CoreConsumerRegistry$allRegistries$24(1, zkVar, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(aVar, new CoreConsumerRegistry$allRegistries$25(1, aVar, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(aVar2, new CoreConsumerRegistry$allRegistries$26(1, aVar2, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(aVar3, new CoreConsumerRegistry$allRegistries$27(1, aVar3, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(bVar3, new CoreConsumerRegistry$allRegistries$28(1, bVar3, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(aVar4, new CoreConsumerRegistry$allRegistries$29(1, aVar4, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(bVar4, new CoreConsumerRegistry$allRegistries$30(1, bVar4, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(aVar5, new CoreConsumerRegistry$allRegistries$31(1, aVar5, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(aVar7, new CoreConsumerRegistry$allRegistries$32(1, aVar7, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(aVar8, new CoreConsumerRegistry$allRegistries$33(1, aVar8, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar22, new CoreConsumerRegistry$allRegistries$34(1, o6eVar22, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar23, new CoreConsumerRegistry$allRegistries$35(1, o6eVar23, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(aVar9, new CoreConsumerRegistry$allRegistries$36(1, aVar9, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(o6eVar14, new CoreConsumerRegistry$allRegistries$37(1, o6eVar14, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(aVar10, new CoreConsumerRegistry$allRegistries$38(1, aVar10, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(aVar11, new CoreConsumerRegistry$allRegistries$39(1, aVar11, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(aVar12, new CoreConsumerRegistry$allRegistries$40(1, aVar12, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(dVar, new CoreConsumerRegistry$allRegistries$41(1, dVar, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)), new Pair(aVar13, new CoreConsumerRegistry$allRegistries$42(1, aVar13, l9e.class, "registerConsumerIfCompatible", "registerConsumerIfCompatible(Lcom/yandex/quark/contracts/internal/consumer/ConsumerRegistry;Ljava/lang/Object;)Lcom/yandex/quark/utils/Result;", 1)));
    }

    @Override // defpackage.k9e
    public final void a() {
        this.a.c("CompositeConsumerRegistry", "Reset all registries");
        Iterator it = this.N.keySet().iterator();
        while (it.hasNext()) {
            ((k9e) it.next()).a();
        }
    }

    @Override // defpackage.qs1
    public final void b() {
        this.c.w(null);
    }

    @Override // defpackage.f38
    public final void c(e38 e38Var) {
        this.C.w(e38Var);
    }

    @Override // defpackage.crw
    public final void d(v2n v2nVar) {
        this.z.w(v2nVar);
    }

    @Override // defpackage.rl
    public final void e() {
        this.b.e();
    }

    @Override // defpackage.jx11
    public final void f() {
        this.I.w(null);
    }

    @Override // defpackage.uqw
    public final void g(dsw dswVar) {
        this.x.w(dswVar);
    }

    @Override // defpackage.rl
    public final void h(jl jlVar) {
        this.b.h(jlVar);
    }

    @Override // defpackage.x9z
    public final void i(y9z y9zVar) {
        this.G.w(y9zVar);
    }

    @Override // defpackage.arw
    public final void j(e8h e8hVar) {
        this.K.w(e8hVar);
    }

    @Override // defpackage.yt1
    public final void k(Set set) {
        this.D.w(set);
    }

    @Override // defpackage.hzl0
    public final void l() {
        this.B.w(null);
    }

    @Override // defpackage.esu
    public final void m(dsu dsuVar) {
        this.E.w(dsuVar);
    }

    @Override // defpackage.g38
    public final void n(e8h e8hVar) {
        this.J.w(e8hVar);
    }

    @Override // defpackage.sru0
    public final void o() {
        this.H.w(null);
    }

    @Override // defpackage.k9e
    public final syj0 p(Object obj) {
        Object obj2;
        Object obj3;
        String str = "Attempt to register consumer " + qoi0.a(obj.getClass()).c();
        x8o x8oVar = this.a;
        x8oVar.c("CompositeConsumerRegistry", str);
        vjd vjdVar = new vjd();
        for (Map.Entry entry : this.N.entrySet()) {
            k9e k9eVar = (k9e) entry.getKey();
            syj0 syj0Var = (syj0) ((tls) entry.getValue()).invoke(obj);
            lyj0 lyj0Var = syj0Var instanceof lyj0 ? (lyj0) syj0Var : null;
            if (lyj0Var != null && (obj3 = lyj0Var.a) != null) {
                x8oVar.c("CompositeConsumerRegistry", b64.l("Consumer ", qoi0.a(obj.getClass()).c(), " successfully registered in ", k9eVar.q()));
                vjdVar.a((Disposable) obj3);
            }
            jyj0 jyj0Var = syj0Var instanceof jyj0 ? (jyj0) syj0Var : null;
            if (jyj0Var != null && (obj2 = jyj0Var.a) != null) {
                jhg0 jhg0Var = (jhg0) obj2;
                if (!(jhg0Var.a instanceof hqv)) {
                    return new jyj0(jhg0Var);
                }
            }
        }
        return new lyj0(vjdVar);
    }

    @Override // defpackage.k9e
    public final String q() {
        return this.M;
    }

    @Override // defpackage.ffj
    public final void r() {
        this.A.w(null);
    }

    @Override // defpackage.e0p
    public final void s(v2n v2nVar) {
        this.y.w(v2nVar);
    }

    @Override // defpackage.zv
    public final void t(yv yvVar) {
        this.w.w(yvVar);
    }

    @Override // defpackage.yw
    public final void u(ms1 ms1Var) {
        this.F.w(ms1Var);
    }

    @Override // defpackage.wdf0
    public final void v(BufferingProfile bufferingProfile) {
        this.L.w(bufferingProfile);
    }
}
