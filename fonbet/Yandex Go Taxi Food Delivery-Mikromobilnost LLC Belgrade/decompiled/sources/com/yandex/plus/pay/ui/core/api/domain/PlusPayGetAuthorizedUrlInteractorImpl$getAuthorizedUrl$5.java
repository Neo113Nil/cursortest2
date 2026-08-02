package com.yandex.plus.pay.ui.core.api.domain;

import android.net.Uri;
import com.yandex.plus.log.api.LogPriority;
import defpackage.mdd0;
import defpackage.mvg;
import defpackage.ndd0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.VMInspector.OpenList;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.core.api.domain.PlusPayGetAuthorizedUrlInteractorImpl$getAuthorizedUrl$5", f = "PlusPayGetAuthorizedUrlInteractorImpl.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusPayGetAuthorizedUrlInteractorImpl$getAuthorizedUrl$5 extends SuspendLambda implements wls {
    final /* synthetic */ String $tld;
    final /* synthetic */ Uri $uri;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPayGetAuthorizedUrlInteractorImpl$getAuthorizedUrl$5(a aVar, Uri uri, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$uri = uri;
        this.$tld = str;
        this.$url = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusPayGetAuthorizedUrlInteractorImpl$getAuthorizedUrl$5(this.this$0, this.$uri, this.$tld, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusPayGetAuthorizedUrlInteractorImpl$getAuthorizedUrl$5) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.plus.domain.auth.impl.a aVar = this.this$0.a;
            String uri = this.$uri.toString();
            String str = this.$tld;
            this.label = 1;
            d = aVar.d(uri, str, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            d = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        String str2 = this.$url;
        Throwable a = Result.a(d);
        if (a != null) {
            mdd0 mdd0Var = aVar2.c;
            LogPriority logPriority = LogPriority.ERROR;
            mdd0Var.getClass();
            ((ndd0) mdd0Var).b(logPriority, "PlusPayGetAuthorizedUrlInteractorImpl", "Failed to authorize url = \"" + str2 + OpenList.CHAR_QUOTE, a);
        }
        a aVar3 = this.this$0;
        boolean z = d instanceof Result.Failure;
        if (!z) {
            mdd0 mdd0Var2 = aVar3.c;
            LogPriority logPriority2 = LogPriority.INFO;
            mdd0Var2.getClass();
            ((ndd0) mdd0Var2).a(logPriority2, "PlusPayGetAuthorizedUrlInteractorImpl", "Authorized url = \"" + ((String) d) + OpenList.CHAR_QUOTE);
        }
        return z ? this.$url : d;
    }
}
