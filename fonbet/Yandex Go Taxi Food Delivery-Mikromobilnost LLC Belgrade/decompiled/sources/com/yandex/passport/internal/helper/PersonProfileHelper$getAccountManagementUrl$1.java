package com.yandex.passport.internal.helper;

import android.net.Uri;
import com.yandex.passport.common.core.FrontendUrlType;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.usecase.w;
import com.yandex.passport.internal.usecase.y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/common/url/b;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.helper.PersonProfileHelper$getAccountManagementUrl$1", f = "PersonProfileHelper.kt", l = {Constants.VPN_TRAFFIC}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PersonProfileHelper$getAccountManagementUrl$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.network.client.e $frontendClient;
    final /* synthetic */ String $tld;
    final /* synthetic */ Uid $uid;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonProfileHelper$getAccountManagementUrl$1(h hVar, com.yandex.passport.internal.network.client.e eVar, Uid uid, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$frontendClient = eVar;
        this.$uid = uid;
        this.$tld = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersonProfileHelper$getAccountManagementUrl$1(this.this$0, this.$frontendClient, this.$uid, this.$tld, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonProfileHelper$getAccountManagementUrl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        y yVar = this.this$0.h;
        com.yandex.passport.internal.network.client.e eVar = this.$frontendClient;
        w wVar = new w(this.$uid, (Locale) null, Uri.parse(eVar.a()).buildUpon().appendEncodedPath("profile").appendQueryParameter("lite", "1").appendQueryParameter("sourceapp", ((com.yandex.passport.internal.common.e) eVar.f).a()).toString(), this.$tld, (Map) null, (FrontendUrlType) null, 112);
        this.label = 1;
        Object a = yVar.a(wVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
