package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.properties.CommonWebProperties;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.domik.FinishRegistrationActivities;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.SlothTheme;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.zls;
import defpackage.zy11;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/q;", "action", "Lcom/yandex/passport/internal/ui/bouncer/model/s1;", "currentState", "Lcom/yandex/passport/internal/ui/bouncer/model/n0;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/bouncer/model/q;Lcom/yandex/passport/internal/ui/bouncer/model/s1;)Lcom/yandex/passport/internal/ui/bouncer/model/n0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.FinishRegistrationActor$act$1", f = "FinishRegistrationActor.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FinishRegistrationActor$act$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinishRegistrationActor$act$1(y yVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = yVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FinishRegistrationActor$act$1 finishRegistrationActor$act$1 = new FinishRegistrationActor$act$1(this.this$0, (Continuation) obj3);
        finishRegistrationActor$act$1.L$0 = (com.yandex.passport.internal.ui.bouncer.model.q) obj;
        finishRegistrationActor$act$1.L$1 = (s1) obj2;
        return finishRegistrationActor$act$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.yandex.passport.internal.ui.bouncer.model.q qVar;
        s1 s1Var;
        Object a;
        ModernAccount modernAccount;
        SlothTheme slothTheme;
        Filter filter;
        EnumSet<PassportAccountType> supportedAccountTypes;
        boolean z;
        PassportTheme theme;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Boolean bool = null;
        if (i == 0) {
            kotlin.b.b(obj);
            qVar = (com.yandex.passport.internal.ui.bouncer.model.q) this.L$0;
            s1Var = (s1) this.L$1;
            ModernAccount modernAccount2 = qVar.a.a;
            com.yandex.passport.internal.upgrader.k kVar = this.this$0.a;
            Uid uid = modernAccount2.getUid();
            this.L$0 = qVar;
            this.L$1 = s1Var;
            this.L$2 = modernAccount2;
            this.label = 1;
            a = kVar.a(uid, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            modernAccount = modernAccount2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            modernAccount = (ModernAccount) this.L$2;
            s1Var = (s1) this.L$1;
            qVar = (com.yandex.passport.internal.ui.bouncer.model.q) this.L$0;
            kotlin.b.b(obj);
            a = obj;
        }
        Object value = ((Result) a).getValue();
        y yVar = this.this$0;
        Throwable a2 = Result.a(value);
        if (a2 != null) {
            com.yandex.passport.internal.report.reporters.f fVar = yVar.b;
            Uid uid2 = modernAccount.getUid();
            fVar.getClass();
            fVar.f(com.yandex.passport.internal.report.r.w, new yd(uid2), new yd(a2));
            com.yandex.passport.internal.ui.bouncer.model.q1 q1Var = qVar.a;
            q1Var.f.addAll(scc.g(FinishRegistrationActivities.FORCE_UPGRADE, FinishRegistrationActivities.LITE_REGISTRATION, FinishRegistrationActivities.SOCIAL_REGISTRATION));
            return new com.yandex.passport.internal.ui.bouncer.model.l0(q1Var);
        }
        String str = ((com.yandex.passport.common.url.b) value).a;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Start show account upgrade", 8);
        }
        Uid uid3 = modernAccount.getUid();
        LoginProperties loginProperties = s1Var.c;
        if (loginProperties == null || (theme = loginProperties.getTheme()) == null || (slothTheme = com.yandex.passport.internal.properties.u.W(theme)) == null) {
            slothTheme = SlothTheme.FOLLOW_SYSTEM;
        }
        LoginProperties loginProperties2 = s1Var.c;
        com.yandex.passport.internal.ui.bouncer.model.q1 q1Var2 = qVar.a;
        yVar.getClass();
        if (loginProperties2 != null && (filter = loginProperties2.getFilter()) != null && (supportedAccountTypes = filter.getSupportedAccountTypes()) != null) {
            if (!supportedAccountTypes.isEmpty()) {
                Iterator<T> it = supportedAccountTypes.iterator();
                while (it.hasNext()) {
                    if (((PassportAccountType) it.next()) == q1Var2.a.getAccountType()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            bool = Boolean.valueOf(z);
        }
        return new com.yandex.passport.internal.ui.bouncer.model.j0(new SlothParams(new com.yandex.passport.sloth.data.j(str, uid3, slothTheme, !(bool != null ? bool.booleanValue() : false)), modernAccount.getUid().getEnvironment(), null, new CommonWebProperties(true, null, false, false, 14, null), 4, null));
    }
}
