package com.yandex.plus.home.auth;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.skd0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.auth.AuthorizationInteractorImpl$withAuthCookieRedirect$2", f = "AuthorizationInteractorImpl.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthorizationInteractorImpl$withAuthCookieRedirect$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $tld;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizationInteractorImpl$withAuthCookieRedirect$2(b bVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$url = str;
        this.$tld = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthorizationInteractorImpl$withAuthCookieRedirect$2(this.this$0, this.$url, this.$tld, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthorizationInteractorImpl$withAuthCookieRedirect$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.plus.domain.auth.impl.a aVar = this.this$0.a;
            String str = this.$url;
            String str2 = this.$tld;
            this.label = 1;
            d = aVar.d(str, str2, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            d = ((Result) obj).getValue();
        }
        String str3 = this.$url;
        Throwable a = Result.a(d);
        if (a != null) {
            skd0.h(PlusLogTag.SDK, "Can't authorize url = \"" + str3 + OpenList.CHAR_QUOTE, a);
        }
        boolean z = d instanceof Result.Failure;
        if (!z) {
            skd0.e(PlusLogTag.SDK, "Authorized url = \"" + ((String) d) + OpenList.CHAR_QUOTE);
        }
        return z ? this.$url : d;
    }
}
