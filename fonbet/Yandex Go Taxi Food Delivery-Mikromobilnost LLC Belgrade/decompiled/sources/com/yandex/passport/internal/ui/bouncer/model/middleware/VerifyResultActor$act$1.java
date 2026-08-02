package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.api.exception.PassportPartitionNotMatchedException;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.domik.FinishRegistrationActivities;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.zls;
import defpackage.zy11;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/l0;", "action", "Lcom/yandex/passport/internal/ui/bouncer/model/s1;", "currentState", "Lcom/yandex/passport/internal/ui/bouncer/model/n0;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/bouncer/model/l0;Lcom/yandex/passport/internal/ui/bouncer/model/s1;)Lcom/yandex/passport/internal/ui/bouncer/model/n0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.VerifyResultActor$act$1", f = "VerifyResultActor.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VerifyResultActor$act$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ r1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyResultActor$act$1(r1 r1Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = r1Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VerifyResultActor$act$1 verifyResultActor$act$1 = new VerifyResultActor$act$1(this.this$0, (Continuation) obj3);
        verifyResultActor$act$1.L$0 = (com.yandex.passport.internal.ui.bouncer.model.l0) obj;
        verifyResultActor$act$1.L$1 = (s1) obj2;
        return verifyResultActor$act$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02be  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.passport.internal.ui.bouncer.model.l0 l0Var;
        s1 s1Var;
        LoginProperties loginProperties;
        r1 r1Var;
        com.yandex.passport.internal.ui.bouncer.model.l lVar;
        CoroutineSingletons coroutineSingletons;
        ModernAccount modernAccount;
        boolean z;
        Object b;
        ModernAccount modernAccount2;
        boolean z2;
        com.yandex.passport.internal.ui.bouncer.model.l lVar2 = com.yandex.passport.internal.ui.bouncer.model.l.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l0Var = (com.yandex.passport.internal.ui.bouncer.model.l0) this.L$0;
            s1Var = (s1) this.L$1;
            loginProperties = s1Var.c;
            if (loginProperties == null) {
                return new com.yandex.passport.internal.ui.bouncer.model.o("VerifyResultActor", "No login properties in current state", null);
            }
            r1Var = this.this$0;
            com.yandex.passport.internal.ui.bouncer.model.q1 q1Var = l0Var.a;
            ModernAccount modernAccount3 = q1Var.a;
            EnumSet enumSet = q1Var.f;
            r1Var.getClass();
            if (q1Var.f.contains(FinishRegistrationActivities.SKIP_VERIFY)) {
                return new com.yandex.passport.internal.ui.bouncer.model.s(q1Var);
            }
            com.yandex.passport.internal.flags.j jVar = r1Var.a;
            boolean contains = enumSet.contains(FinishRegistrationActivities.SOCIAL_REGISTRATION);
            boolean z3 = modernAccount3.getPrimaryAliasType() == 6;
            boolean z4 = loginProperties.getFilter().get(PassportAccountType.SOCIAL);
            boolean z5 = !z4;
            boolean z6 = !contains && z3 && (!z4 || ((Boolean) jVar.b(com.yandex.passport.internal.flags.q.h)).booleanValue());
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                lVar = lVar2;
                coroutineSingletons = coroutineSingletons2;
                modernAccount = modernAccount3;
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, smw0.k(", isSocialExcluded = ", ", isExperimentForAllowedSocialEnabled = $ isExperimentForAllowedSocialEnabled", qv10.u("isSocialRegistrationRequired: ", "; shouldSkipSocialRegistration = ", ", isSocial = ", z6, contains), z3, z5), 8);
            } else {
                lVar = lVar2;
                coroutineSingletons = coroutineSingletons2;
                modernAccount = modernAccount3;
            }
            if (!z6) {
                boolean contains2 = enumSet.contains(FinishRegistrationActivities.LITE_REGISTRATION);
                boolean z7 = modernAccount.getPrimaryAliasType() == 5;
                boolean z8 = loginProperties.getFilter().get(PassportAccountType.LITE);
                boolean z9 = !z8;
                boolean z10 = (contains2 || !z7 || z8) ? false : true;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    LogLevel logLevel = LogLevel.DEBUG;
                    StringBuilder u = qv10.u("isLiteFinishRegistrationRequired: ", "; shouldSkipLiteRegistration = ", ", isLite = ", z10, contains2);
                    u.append(z7);
                    u.append(", isLiteExcluded = ");
                    u.append(z9);
                    com.yandex.passport.common.logger.a.c(logLevel, null, u.toString(), 8);
                }
                if (!z10) {
                    boolean z11 = enumSet.contains(FinishRegistrationActivities.FORCE_UPGRADE) || modernAccount.getUpgradeStatus() == PassportAccountUpgradeStatus.SKIPPED;
                    boolean z12 = !z11 && com.yandex.passport.internal.ui.c.p(modernAccount.getUpgradeStatus()) && ((Boolean) jVar.b(com.yandex.passport.internal.flags.q.y)).booleanValue();
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        LogLevel logLevel2 = LogLevel.DEBUG;
                        StringBuilder u2 = qv10.u("isUpgradeByStatusRequired: ", "; shouldSkipForceRegistration = ", ", shouldAccountBeUpgraded = ", z12, z11);
                        u2.append(com.yandex.passport.internal.ui.c.p(modernAccount.getUpgradeStatus()));
                        u2.append(", upgradeStatus = ");
                        u2.append(modernAccount.getUpgradeStatus());
                        com.yandex.passport.common.logger.a.c(logLevel2, null, u2.toString(), 8);
                    }
                    if (!z12) {
                        if (!enumSet.contains(FinishRegistrationActivities.BIND_PHONE) && loginProperties.getBindPhoneProperties() != null && s1Var.f == null && q1Var.e == null) {
                            return new com.yandex.passport.internal.ui.bouncer.model.d0(s1Var.c, null, null, null, false, false, null, null, 254);
                        }
                        com.yandex.passport.internal.filter.i iVar = r1Var.d;
                        Filter filter = loginProperties.getFilter();
                        this.L$0 = l0Var;
                        this.L$1 = s1Var;
                        this.L$2 = r1Var;
                        this.L$3 = loginProperties;
                        ModernAccount modernAccount4 = modernAccount;
                        this.L$4 = modernAccount4;
                        z = true;
                        this.label = 1;
                        b = iVar.b(modernAccount4, filter, this);
                        CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                        if (b == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        modernAccount2 = modernAccount4;
                    }
                }
            }
            return new com.yandex.passport.internal.ui.bouncer.model.q(q1Var);
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        modernAccount2 = (ModernAccount) this.L$4;
        LoginProperties loginProperties2 = (LoginProperties) this.L$3;
        r1 r1Var2 = (r1) this.L$2;
        s1Var = (s1) this.L$1;
        com.yandex.passport.internal.ui.bouncer.model.l0 l0Var2 = (com.yandex.passport.internal.ui.bouncer.model.l0) this.L$0;
        kotlin.b.b(obj);
        lVar = lVar2;
        z = true;
        r1Var = r1Var2;
        loginProperties = loginProperties2;
        l0Var = l0Var2;
        b = obj;
        com.yandex.passport.internal.filter.g gVar = (com.yandex.passport.internal.filter.g) b;
        r1Var.getClass();
        com.yandex.passport.internal.filter.a aVar = com.yandex.passport.internal.filter.a.a;
        if (jl40.l(gVar, aVar) && modernAccount2.getAccountType() == PassportAccountType.CHILDISH) {
            Uid uid = modernAccount2.getUid();
            LoginProperties loginProperties3 = s1Var.c;
            if (loginProperties3 != null) {
                PassportEnvironmentImpl primaryEnvironment = loginProperties3.getFilter().getPrimaryEnvironment();
                return new com.yandex.passport.internal.ui.bouncer.model.j0(new SlothParams(new com.yandex.passport.sloth.data.o(((com.yandex.passport.internal.network.l) r1Var.b).m(com.yandex.passport.internal.util.p.u(primaryEnvironment), null), uid, com.yandex.passport.internal.properties.u.W(loginProperties3.getTheme())), com.yandex.passport.internal.util.p.u(primaryEnvironment), null, com.yandex.passport.internal.properties.u.J(loginProperties3.getWebAmProperties(), ((Boolean) r1Var.a.b(com.yandex.passport.internal.flags.q.z)).booleanValue()), 4, null));
            }
            ny61.r("loginProperties is missing");
            return null;
        }
        if (!jl40.l(gVar, com.yandex.passport.internal.filter.b.a) && !jl40.l(gVar, aVar)) {
            if (jl40.l(gVar, com.yandex.passport.internal.filter.d.a)) {
                return new com.yandex.passport.internal.ui.bouncer.model.s(new com.yandex.passport.internal.ui.bouncer.model.m1(new PassportPartitionNotMatchedException()));
            }
            if (jl40.l(gVar, com.yandex.passport.internal.filter.f.a)) {
                if (loginProperties.getSetAsCurrent()) {
                    ModernAccount a = r1Var.c.a();
                    if (!jl40.l(a != null ? a.getUid() : null, modernAccount2.getUid())) {
                        z2 = z;
                        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "should set as current " + z2, 8);
                        }
                        return !z2 ? new com.yandex.passport.internal.ui.bouncer.model.a0(l0Var.a) : new com.yandex.passport.internal.ui.bouncer.model.s(l0Var.a);
                    }
                }
                z2 = false;
                com.yandex.passport.common.logger.c cVar22 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                }
                if (!z2) {
                }
            }
        }
        return lVar;
    }
}
