package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.api.exception.PassportActionForbiddenException;
import com.yandex.passport.api.exception.PassportHostProcessedException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.f9;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.kb;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.ui.bouncer.model.c2;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.z1;
import com.yandex.passport.internal.ui.domik.DomikExternalAuthRequest;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/u;", "action", "Lcom/yandex/passport/internal/ui/bouncer/model/s1;", "currentState", "Lcom/yandex/passport/internal/ui/bouncer/model/n0;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/bouncer/model/u;Lcom/yandex/passport/internal/ui/bouncer/model/s1;)Lcom/yandex/passport/internal/ui/bouncer/model/n0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.ProcessEventActor$act$1", f = "ProcessEventActor.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ProcessEventActor$act$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ f0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessEventActor$act$1(f0 f0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = f0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ProcessEventActor$act$1 processEventActor$act$1 = new ProcessEventActor$act$1(this.this$0, (Continuation) obj3);
        processEventActor$act$1.L$0 = (com.yandex.passport.internal.ui.bouncer.model.u) obj;
        processEventActor$act$1.L$1 = (s1) obj2;
        return processEventActor$act$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0280  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.passport.internal.ui.bouncer.model.a1 a1Var;
        s1 s1Var;
        Object a;
        SocialConfiguration socialConfiguration;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.internal.ui.bouncer.model.u uVar = (com.yandex.passport.internal.ui.bouncer.model.u) this.L$0;
            s1 s1Var2 = (s1) this.L$1;
            com.yandex.passport.internal.ui.bouncer.model.a1 a1Var2 = uVar.a;
            if (jl40.l(a1Var2, com.yandex.passport.internal.ui.bouncer.model.o0.a)) {
                return new com.yandex.passport.internal.ui.bouncer.model.s(com.yandex.passport.internal.ui.bouncer.model.k1.a);
            }
            if (jl40.l(a1Var2, com.yandex.passport.internal.ui.bouncer.model.o0.b)) {
                f0 f0Var = this.this$0;
                Map map = f0.d;
                f0Var.getClass();
                c2 c2Var = s1Var2.a;
                com.yandex.passport.internal.ui.bouncer.model.g1 g1Var = s1Var2.d;
                return ((c2Var instanceof z1) && (((z1) c2Var).a.getVariant() instanceof com.yandex.passport.sloth.data.o) && g1Var != null) ? new com.yandex.passport.internal.ui.bouncer.model.y(com.yandex.passport.internal.ui.bouncer.model.g1.a(g1Var, LoginProperties.m307copyLjS6rdk$default(g1Var.a, null, false, null, null, null, null, null, false, false, null, null, false, com.yandex.passport.internal.util.p.A(((com.yandex.passport.sloth.data.o) ((z1) s1Var2.a).a.getVariant()).b), null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, false, null, 2147479551, null), null, 62)) : com.yandex.passport.internal.ui.bouncer.model.x.a;
            }
            if (a1Var2 instanceof com.yandex.passport.internal.ui.bouncer.model.u0) {
                return new com.yandex.passport.internal.ui.bouncer.model.w(((com.yandex.passport.internal.ui.bouncer.model.u0) a1Var2).a);
            }
            if (jl40.l(a1Var2, com.yandex.passport.internal.ui.bouncer.model.o0.c)) {
                return new com.yandex.passport.internal.ui.bouncer.model.s(new com.yandex.passport.internal.ui.bouncer.model.m1(new PassportActionForbiddenException()));
            }
            if (a1Var2 instanceof com.yandex.passport.internal.ui.bouncer.model.t0) {
                com.yandex.passport.internal.ui.bouncer.model.t0 t0Var = (com.yandex.passport.internal.ui.bouncer.model.t0) a1Var2;
                ModernAccount modernAccount = t0Var.a;
                PassportLoginAction passportLoginAction = t0Var.c;
                String str = t0Var.d;
                String str2 = str != null ? str : null;
                String str3 = s1Var2.f;
                if (str3 == null) {
                    str3 = t0Var.e;
                }
                com.yandex.passport.internal.ui.bouncer.model.l0 l0Var = new com.yandex.passport.internal.ui.bouncer.model.l0(new com.yandex.passport.internal.ui.bouncer.model.q1(modernAccount, null, passportLoginAction, str2, str3, null, 32));
                f0 f0Var2 = this.this$0;
                c2 c2Var2 = s1Var2.a;
                if ((c2Var2 instanceof z1) && (((z1) c2Var2).a.getVariant() instanceof com.yandex.passport.sloth.data.s)) {
                    com.yandex.passport.internal.report.reporters.m mVar = f0Var2.a;
                    String valueOf = String.valueOf(t0Var.b.getValue());
                    mVar.getClass();
                    mVar.f(f9.w, new jd(valueOf, 3));
                }
                return l0Var;
            }
            if (a1Var2 instanceof com.yandex.passport.internal.ui.bouncer.model.w0) {
                return f0.b(this.this$0, s1Var2, new DomikExternalAuthRequest.SamlSso(((com.yandex.passport.internal.ui.bouncer.model.w0) a1Var2).a));
            }
            if (a1Var2 instanceof com.yandex.passport.internal.ui.bouncer.model.y0) {
                f0 f0Var3 = this.this$0;
                String str4 = ((com.yandex.passport.internal.ui.bouncer.model.y0) a1Var2).a;
                Map map2 = f0.d;
                f0Var3.getClass();
                PassportSocialConfiguration passportSocialConfiguration = (PassportSocialConfiguration) f0.d.get(str4);
                if (passportSocialConfiguration != null) {
                    SocialConfiguration.Companion.getClass();
                    socialConfiguration = com.yandex.passport.internal.y.a(passportSocialConfiguration);
                } else {
                    socialConfiguration = null;
                }
                return socialConfiguration != null ? f0.b(this.this$0, s1Var2, new DomikExternalAuthRequest.Social(socialConfiguration)) : new com.yandex.passport.internal.ui.bouncer.model.o("ProcessEventActor", g8e.o("Unknown social config ", str4), null);
            }
            if (a1Var2 instanceof com.yandex.passport.internal.ui.bouncer.model.v0) {
                com.yandex.passport.api.exception.b bVar = PassportHostProcessedException.Companion;
                List list = ((com.yandex.passport.internal.ui.bouncer.model.v0) a1Var2).a;
                bVar.getClass();
                return new com.yandex.passport.internal.ui.bouncer.model.s(new com.yandex.passport.internal.ui.bouncer.model.m1(com.yandex.passport.api.exception.b.a(list)));
            }
            if (a1Var2 instanceof com.yandex.passport.internal.ui.bouncer.model.z0) {
                return new com.yandex.passport.internal.ui.bouncer.model.k0(((com.yandex.passport.internal.ui.bouncer.model.z0) a1Var2).a);
            }
            if (a1Var2 instanceof com.yandex.passport.internal.ui.bouncer.model.s0) {
                com.yandex.passport.internal.ui.bouncer.model.s0 s0Var = (com.yandex.passport.internal.ui.bouncer.model.s0) a1Var2;
                return new com.yandex.passport.internal.ui.bouncer.model.s(new com.yandex.passport.internal.ui.bouncer.model.o1(s0Var.a, s0Var.b));
            }
            if (a1Var2 instanceof com.yandex.passport.internal.ui.bouncer.model.q0) {
                return new com.yandex.passport.internal.ui.bouncer.model.n(((com.yandex.passport.internal.ui.bouncer.model.q0) a1Var2).a);
            }
            if (a1Var2 instanceof com.yandex.passport.internal.ui.bouncer.model.r0) {
                com.yandex.passport.internal.ui.bouncer.model.r0 r0Var = (com.yandex.passport.internal.ui.bouncer.model.r0) a1Var2;
                Throwable th = r0Var.a;
                return new com.yandex.passport.internal.ui.bouncer.model.o(r0Var.b, String.valueOf(th.getMessage()), th);
            }
            if (!(a1Var2 instanceof com.yandex.passport.internal.ui.bouncer.model.p0)) {
                if (!(a1Var2 instanceof com.yandex.passport.internal.ui.bouncer.model.x0)) {
                    w511.b();
                    return null;
                }
                com.yandex.passport.internal.report.reporters.v0 v0Var = this.this$0.c;
                com.yandex.passport.internal.ui.bouncer.model.x0 x0Var = (com.yandex.passport.internal.ui.bouncer.model.x0) a1Var2;
                String str5 = x0Var.c;
                String str6 = x0Var.b;
                String str7 = x0Var.a;
                v0Var.getClass();
                v0Var.f(kb.w, new md(str7, 28, false), new jd("social_url", str6), new jd("am_url", str5));
                return new com.yandex.passport.internal.ui.bouncer.model.h0(str7, str6, str5);
            }
            LoginProperties loginProperties = s1Var2.c;
            if (loginProperties == null) {
                return new com.yandex.passport.internal.ui.bouncer.model.o("ProcessEventActor", "No login properties on CreateNewProfile", null);
            }
            try {
                com.yandex.passport.internal.usecase.ui.c0 c0Var = this.this$0.b;
                com.yandex.passport.internal.usecase.ui.b0 b0Var = new com.yandex.passport.internal.usecase.ui.b0(loginProperties.getFilter());
                this.L$0 = s1Var2;
                this.L$1 = a1Var2;
                this.label = 1;
                a = c0Var.a(b0Var, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                a1Var = a1Var2;
                s1Var = s1Var2;
            } catch (Throwable th2) {
                th = th2;
                a1Var = a1Var2;
                s1Var = s1Var2;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "No master accounts to create profile with.", th);
                }
                LoginProperties m307copyLjS6rdk$default = LoginProperties.m307copyLjS6rdk$default(s1Var.c, null, false, null, null, null, null, null, false, true, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, false, null, 2147483391, null);
                String str8 = ((com.yandex.passport.internal.ui.bouncer.model.p0) a1Var).a;
                return new com.yandex.passport.internal.ui.bouncer.model.d0(m307copyLjS6rdk$default, null, null, null, false, false, null, str8 != null ? str8 : null, HProv.PP_DELETE_SAVED_PASSWD);
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a1Var = (com.yandex.passport.internal.ui.bouncer.model.a1) this.L$1;
            s1Var = (s1) this.L$0;
            try {
                kotlin.b.b(obj);
                a = obj;
            } catch (Throwable th3) {
                th = th3;
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                }
                LoginProperties m307copyLjS6rdk$default2 = LoginProperties.m307copyLjS6rdk$default(s1Var.c, null, false, null, null, null, null, null, false, true, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, false, null, 2147483391, null);
                String str82 = ((com.yandex.passport.internal.ui.bouncer.model.p0) a1Var).a;
                return new com.yandex.passport.internal.ui.bouncer.model.d0(m307copyLjS6rdk$default2, null, null, null, false, false, null, str82 != null ? str82 : null, HProv.PP_DELETE_SAVED_PASSWD);
            }
        }
        List<ModernAccount> list2 = ((com.yandex.passport.internal.usecase.ui.a0) a).b.a;
        ArrayList arrayList = new ArrayList();
        for (ModernAccount modernAccount2 : list2) {
            Uid masterUid = modernAccount2.getMasterUid();
            String phoneNumber = modernAccount2.getPhoneNumber();
            com.yandex.passport.internal.ui.bouncer.model.d1 d1Var = (phoneNumber == null || masterUid == null) ? null : new com.yandex.passport.internal.ui.bouncer.model.d1(masterUid, phoneNumber);
            if (d1Var != null) {
                arrayList.add(d1Var);
            }
        }
        List I = kotlin.collections.a.I(arrayList);
        if (!I.isEmpty()) {
            return new com.yandex.passport.internal.ui.bouncer.model.k(I);
        }
        LoginProperties m307copyLjS6rdk$default22 = LoginProperties.m307copyLjS6rdk$default(s1Var.c, null, false, null, null, null, null, null, false, true, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, null, false, null, 2147483391, null);
        String str822 = ((com.yandex.passport.internal.ui.bouncer.model.p0) a1Var).a;
        return new com.yandex.passport.internal.ui.bouncer.model.d0(m307copyLjS6rdk$default22, null, null, null, false, false, null, str822 != null ? str822 : null, HProv.PP_DELETE_SAVED_PASSWD);
    }
}
