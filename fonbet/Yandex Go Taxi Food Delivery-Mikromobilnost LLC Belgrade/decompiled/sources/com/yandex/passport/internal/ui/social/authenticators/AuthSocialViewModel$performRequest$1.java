package com.yandex.passport.internal.ui.social.authenticators;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
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
@mvg(c = "com.yandex.passport.internal.ui.social.authenticators.AuthSocialViewModel$performRequest$1", f = "AuthSocialViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthSocialViewModel$performRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $applicationId;
    final /* synthetic */ String $socialTokenValue;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthSocialViewModel$performRequest$1(c cVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$socialTokenValue = str;
        this.$applicationId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthSocialViewModel$performRequest$1(this.this$0, this.$socialTokenValue, this.$applicationId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AuthSocialViewModel$performRequest$1 authSocialViewModel$performRequest$1 = (AuthSocialViewModel$performRequest$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        authSocialViewModel$performRequest$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        String str = this.$socialTokenValue;
        String str2 = this.$applicationId;
        try {
            com.yandex.passport.internal.account.c cVar2 = cVar.H;
            SocialConfiguration socialConfiguration = cVar.c;
            obj2 = cVar2.d(p.u(cVar.b.getFilter().getPrimaryEnvironment()), str, str2, socialConfiguration.getProviderCode(), socialConfiguration.getScope());
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
