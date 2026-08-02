package com.yandex.passport.internal.ui.social.authenticators;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.util.p;
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
@mvg(c = "com.yandex.passport.internal.ui.social.authenticators.AuthSocialViewModel$onMasterTokenReceived$1", f = "AuthSocialViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthSocialViewModel$onMasterTokenReceived$1 extends SuspendLambda implements wls {
    final /* synthetic */ MasterToken $masterToken;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthSocialViewModel$onMasterTokenReceived$1(c cVar, MasterToken masterToken, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$masterToken = masterToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthSocialViewModel$onMasterTokenReceived$1(this.this$0, this.$masterToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AuthSocialViewModel$onMasterTokenReceived$1 authSocialViewModel$onMasterTokenReceived$1 = (AuthSocialViewModel$onMasterTokenReceived$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        authSocialViewModel$onMasterTokenReceived$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
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
        c cVar = this.this$0;
        MasterToken masterToken = this.$masterToken;
        try {
            com.yandex.passport.internal.account.c cVar2 = cVar.H;
            LoginProperties loginProperties = cVar.b;
            Environment u = p.u(loginProperties.getFilter().getPrimaryEnvironment());
            AnalyticsFromValue.Companion.getClass();
            analyticsFromValue = AnalyticsFromValue.SOCIAL_NATIVE;
            obj2 = cVar2.g(u, masterToken, analyticsFromValue.withLoginSdk(loginProperties.isFromAuthSdk()));
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            c cVar3 = this.this$0;
            if (!(obj2 instanceof Result.Failure)) {
            }
            c cVar4 = this.this$0;
            a = Result.a(obj2);
            if (a != null) {
            }
            return zy11.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            c cVar32 = this.this$0;
            if (!(obj2 instanceof Result.Failure)) {
            }
            c cVar42 = this.this$0;
            a = Result.a(obj2);
            if (a != null) {
            }
            return zy11.a;
        }
        c cVar322 = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            cVar322.e0((ModernAccount) obj2);
        }
        c cVar422 = this.this$0;
        a = Result.a(obj2);
        if (a != null) {
            cVar422.c0(a);
        }
        return zy11.a;
    }
}
