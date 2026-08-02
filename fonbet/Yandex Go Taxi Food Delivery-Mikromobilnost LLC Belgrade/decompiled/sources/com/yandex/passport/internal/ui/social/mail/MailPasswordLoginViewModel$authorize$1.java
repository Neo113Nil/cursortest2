package com.yandex.passport.internal.ui.social.mail;

import com.yandex.passport.api.PassportSocialProviderCode;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.social.mail.MailPasswordLoginViewModel$authorize$1", f = "MailPasswordLoginViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MailPasswordLoginViewModel$authorize$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $email;
    final /* synthetic */ String $password;
    final /* synthetic */ SocialConfiguration $socialConfiguration;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MailPasswordLoginViewModel$authorize$1(d dVar, String str, String str2, SocialConfiguration socialConfiguration, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$email = str;
        this.$password = str2;
        this.$socialConfiguration = socialConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MailPasswordLoginViewModel$authorize$1(this.this$0, this.$email, this.$password, this.$socialConfiguration, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MailPasswordLoginViewModel$authorize$1 mailPasswordLoginViewModel$authorize$1 = (MailPasswordLoginViewModel$authorize$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mailPasswordLoginViewModel$authorize$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        Throwable a;
        AnalyticsFromValue analyticsFromValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        String str = this.$email;
        String str2 = this.$password;
        SocialConfiguration socialConfiguration = this.$socialConfiguration;
        try {
            com.yandex.passport.internal.account.c cVar = dVar.B;
            Environment environment = dVar.A;
            PassportSocialProviderCode providerCode = socialConfiguration.getProviderCode();
            AnalyticsFromValue.Companion.getClass();
            analyticsFromValue = AnalyticsFromValue.MAILISH_PASSWORD;
            obj2 = cVar.b(environment, str, str2, providerCode, analyticsFromValue);
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            d dVar2 = this.this$0;
            if (!(obj2 instanceof Result.Failure)) {
            }
            d dVar3 = this.this$0;
            a = Result.a(obj2);
            if (a != null) {
            }
            return zy11.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            d dVar22 = this.this$0;
            if (!(obj2 instanceof Result.Failure)) {
            }
            d dVar32 = this.this$0;
            a = Result.a(obj2);
            if (a != null) {
            }
            return zy11.a;
        }
        d dVar222 = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            dVar222.D.m((ModernAccount) obj2);
            dVar222.c.m(Boolean.FALSE);
        }
        d dVar322 = this.this$0;
        a = Result.a(obj2);
        if (a != null) {
            dVar322.b.m(dVar322.E.a(a));
            dVar322.c.m(Boolean.FALSE);
        }
        return zy11.a;
    }
}
