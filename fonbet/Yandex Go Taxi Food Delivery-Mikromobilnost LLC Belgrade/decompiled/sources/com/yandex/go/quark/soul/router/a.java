package com.yandex.go.quark.soul.router;

import com.yandex.go.quark.ai_assistant.api.chat.ChatViewController$Mode;
import com.yandex.go.quark.ai_assistant.api.router.AiAssistantRouter$Payload$AnalyticsType;
import com.yandex.go.quark.soul.experiments.SoulAiAssistantExperiment;
import defpackage.cm1;
import defpackage.cne0;
import defpackage.fm1;
import defpackage.g8e;
import defpackage.g9t0;
import defpackage.h55;
import defpackage.h9t0;
import defpackage.hm1;
import defpackage.hxx;
import defpackage.i9t0;
import defpackage.j9t0;
import defpackage.k9t0;
import defpackage.m950;
import defpackage.nl1;
import defpackage.ny61;
import defpackage.tje;
import defpackage.w511;
import defpackage.xl1;
import defpackage.yio0;
import defpackage.yl1;
import defpackage.yvf0;
import defpackage.zl1;
import defpackage.zy11;
import java.util.LinkedHashSet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a extends h55 implements j9t0 {
    public final yvf0 D;
    public final com.yandex.go.quark.soul.domain.a E;
    public final h9t0 F;
    public final g9t0 G;

    public a(yvf0 yvf0Var, com.yandex.go.quark.soul.domain.a aVar, h9t0 h9t0Var, g9t0 g9t0Var) {
        super(null);
        this.D = yvf0Var;
        this.E = aVar;
        this.F = h9t0Var;
        this.G = g9t0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        if (r8 == r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, i9t0 i9t0Var, SoulAiAssistantExperiment.Navbar.Mode mode, ContinuationImpl continuationImpl) {
        SoulAiAssistantRouterImpl$launchAiAssistantRouter$1 soulAiAssistantRouterImpl$launchAiAssistantRouter$1;
        Object obj;
        int i;
        i9t0 i9t0Var2;
        SoulAiAssistantExperiment.Navbar.Mode mode2;
        Object Q;
        Object a;
        i9t0 i9t0Var3;
        String str;
        int i2;
        zl1 zl1Var;
        aVar.getClass();
        if (continuationImpl instanceof SoulAiAssistantRouterImpl$launchAiAssistantRouter$1) {
            soulAiAssistantRouterImpl$launchAiAssistantRouter$1 = (SoulAiAssistantRouterImpl$launchAiAssistantRouter$1) continuationImpl;
            int i3 = soulAiAssistantRouterImpl$launchAiAssistantRouter$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                soulAiAssistantRouterImpl$launchAiAssistantRouter$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = soulAiAssistantRouterImpl$launchAiAssistantRouter$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = soulAiAssistantRouterImpl$launchAiAssistantRouter$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    i9t0Var2 = i9t0Var;
                    soulAiAssistantRouterImpl$launchAiAssistantRouter$1.L$0 = i9t0Var2;
                    mode2 = mode;
                    soulAiAssistantRouterImpl$launchAiAssistantRouter$1.L$1 = mode2;
                    soulAiAssistantRouterImpl$launchAiAssistantRouter$1.label = 1;
                    Q = aVar.Q(soulAiAssistantRouterImpl$launchAiAssistantRouter$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str2 = (String) soulAiAssistantRouterImpl$launchAiAssistantRouter$1.L$2;
                        mode2 = (SoulAiAssistantExperiment.Navbar.Mode) soulAiAssistantRouterImpl$launchAiAssistantRouter$1.L$1;
                        i9t0Var3 = (i9t0) soulAiAssistantRouterImpl$launchAiAssistantRouter$1.L$0;
                        kotlin.b.b(obj2);
                        str = str2;
                        nl1 nl1Var = (nl1) obj2;
                        m950 m950Var = (m950) aVar.D.get();
                        cm1 cm1Var = i9t0Var3.a;
                        fm1 fm1Var = i9t0Var3.b;
                        ChatViewController$Mode chatViewController$Mode = i9t0Var3.c;
                        String str3 = i9t0Var3.d;
                        i2 = k9t0.a[mode2.ordinal()];
                        if (i2 != 1) {
                            zl1Var = xl1.d;
                        } else {
                            if (i2 != 2) {
                                w511.b();
                                return null;
                            }
                            zl1Var = yl1.a;
                        }
                        aVar.E(m950Var, new hm1(cm1Var, fm1Var, chatViewController$Mode, str3, null, zl1Var, AiAssistantRouter$Payload$AnalyticsType.Soul, str, nl1Var, 16), new yio0(6, aVar), hxx.a);
                        return zy11.a;
                    }
                    mode2 = (SoulAiAssistantExperiment.Navbar.Mode) soulAiAssistantRouterImpl$launchAiAssistantRouter$1.L$1;
                    i9t0 i9t0Var4 = (i9t0) soulAiAssistantRouterImpl$launchAiAssistantRouter$1.L$0;
                    kotlin.b.b(obj2);
                    Q = obj2;
                    i9t0Var2 = i9t0Var4;
                }
                String str4 = (String) Q;
                com.yandex.go.quark.soul.domain.a aVar2 = aVar.E;
                soulAiAssistantRouterImpl$launchAiAssistantRouter$1.L$0 = i9t0Var2;
                soulAiAssistantRouterImpl$launchAiAssistantRouter$1.L$1 = mode2;
                soulAiAssistantRouterImpl$launchAiAssistantRouter$1.L$2 = str4;
                soulAiAssistantRouterImpl$launchAiAssistantRouter$1.label = 2;
                a = aVar2.a(soulAiAssistantRouterImpl$launchAiAssistantRouter$1);
                if (a != obj) {
                    i9t0Var3 = i9t0Var2;
                    obj2 = a;
                    str = str4;
                    nl1 nl1Var2 = (nl1) obj2;
                    m950 m950Var2 = (m950) aVar.D.get();
                    cm1 cm1Var2 = i9t0Var3.a;
                    fm1 fm1Var2 = i9t0Var3.b;
                    ChatViewController$Mode chatViewController$Mode2 = i9t0Var3.c;
                    String str32 = i9t0Var3.d;
                    i2 = k9t0.a[mode2.ordinal()];
                    if (i2 != 1) {
                    }
                    aVar.E(m950Var2, new hm1(cm1Var2, fm1Var2, chatViewController$Mode2, str32, null, zl1Var, AiAssistantRouter$Payload$AnalyticsType.Soul, str, nl1Var2, 16), new yio0(6, aVar), hxx.a);
                    return zy11.a;
                }
                return obj;
            }
        }
        soulAiAssistantRouterImpl$launchAiAssistantRouter$1 = new SoulAiAssistantRouterImpl$launchAiAssistantRouter$1(aVar, continuationImpl);
        Object obj22 = soulAiAssistantRouterImpl$launchAiAssistantRouter$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = soulAiAssistantRouterImpl$launchAiAssistantRouter$1.label;
        if (i != 0) {
        }
        String str42 = (String) Q;
        com.yandex.go.quark.soul.domain.a aVar22 = aVar.E;
        soulAiAssistantRouterImpl$launchAiAssistantRouter$1.L$0 = i9t0Var2;
        soulAiAssistantRouterImpl$launchAiAssistantRouter$1.L$1 = mode2;
        soulAiAssistantRouterImpl$launchAiAssistantRouter$1.L$2 = str42;
        soulAiAssistantRouterImpl$launchAiAssistantRouter$1.label = 2;
        a = aVar22.a(soulAiAssistantRouterImpl$launchAiAssistantRouter$1);
        if (a != obj) {
        }
        return obj;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new SoulAiAssistantRouterImpl$onLaunch$1(this, (i9t0) obj, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(ContinuationImpl continuationImpl) {
        SoulAiAssistantRouterImpl$getPromoId$1 soulAiAssistantRouterImpl$getPromoId$1;
        int i;
        SoulAiAssistantExperiment.Onboarding onboarding;
        String o;
        int i2;
        if (continuationImpl instanceof SoulAiAssistantRouterImpl$getPromoId$1) {
            soulAiAssistantRouterImpl$getPromoId$1 = (SoulAiAssistantRouterImpl$getPromoId$1) continuationImpl;
            int i3 = soulAiAssistantRouterImpl$getPromoId$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                soulAiAssistantRouterImpl$getPromoId$1.label = i3 - Integer.MIN_VALUE;
                Object obj = soulAiAssistantRouterImpl$getPromoId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = soulAiAssistantRouterImpl$getPromoId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    soulAiAssistantRouterImpl$getPromoId$1.label = 1;
                    obj = this.E.b(soulAiAssistantRouterImpl$getPromoId$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                onboarding = (SoulAiAssistantExperiment.Onboarding) obj;
                if (onboarding != null) {
                    SoulAiAssistantExperiment.Onboarding.ShowPolicy showPolicy = onboarding.b;
                    String str = showPolicy.a;
                    int i4 = showPolicy.b;
                    h9t0 h9t0Var = this.F;
                    cne0 cne0Var = h9t0Var.b;
                    LinkedHashSet linkedHashSet = h9t0Var.a;
                    if (!linkedHashSet.contains(str) && (i2 = cne0Var.i((o = g8e.o("show_count_", str)), 0)) < i4) {
                        cne0Var.p(i2 + 1, o);
                        linkedHashSet.add(str);
                        return onboarding.a;
                    }
                }
                return null;
            }
        }
        soulAiAssistantRouterImpl$getPromoId$1 = new SoulAiAssistantRouterImpl$getPromoId$1(this, continuationImpl);
        Object obj2 = soulAiAssistantRouterImpl$getPromoId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = soulAiAssistantRouterImpl$getPromoId$1.label;
        if (i != 0) {
        }
        onboarding = (SoulAiAssistantExperiment.Onboarding) obj2;
        if (onboarding != null) {
        }
        return null;
    }
}
