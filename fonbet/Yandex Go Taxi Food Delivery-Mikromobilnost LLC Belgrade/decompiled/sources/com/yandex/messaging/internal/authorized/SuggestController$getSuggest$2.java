package com.yandex.messaging.internal.authorized;

import com.yandex.messaging.core.net.entities.GetSuggestData;
import com.yandex.messaging.core.net.entities.GetSuggestParam;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getSuggest$$inlined$makeCall$1;
import defpackage.fse;
import defpackage.l020;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.tje;
import defpackage.to3;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.SuggestController$getSuggest$2", f = "SuggestController.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SuggestController$getSuggest$2 extends SuspendLambda implements wls {
    final /* synthetic */ GetSuggestParam $suggestQuery;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestController$getSuggest$2(GetSuggestParam getSuggestParam, g gVar, Continuation continuation) {
        super(2, continuation);
        this.$suggestQuery = getSuggestParam;
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuggestController$getSuggest$2 suggestController$getSuggest$2 = new SuggestController$getSuggest$2(this.$suggestQuery, this.this$0, continuation);
        suggestController$getSuggest$2.L$0 = obj;
        return suggestController$getSuggest$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestController$getSuggest$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            GetSuggestParam getSuggestParam = this.$suggestQuery;
            String str = getSuggestParam.mChatId;
            if (str != null) {
                getSuggestParam.mInviteHash = this.this$0.b.u(str);
            }
            to3 to3Var = this.this$0.a;
            fse coroutineContext = tseVar.getCoroutineContext();
            GetSuggestParam getSuggestParam2 = this.$suggestQuery;
            this.label = 1;
            if (coroutineContext == null) {
                coroutineContext = get_context();
            }
            obj = tje.k0(coroutineContext, new AuthorizedApiCallsExtensionsKt$getSuggest$$inlined$makeCall$1(null, to3Var, getSuggestParam2), this);
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
        GetSuggestData getSuggestData = (GetSuggestData) ((oyj0) obj).b();
        if (getSuggestData != null) {
            l020 C = this.this$0.b.C();
            try {
                UserData[] userDataArr = getSuggestData.users;
                if (userDataArr != null) {
                    for (UserData userData : userDataArr) {
                        C.D0(userData);
                    }
                }
                C.s();
                C.close();
                UserData[] userDataArr2 = getSuggestData.users;
                if (userDataArr2 != null) {
                    ArrayList arrayList = new ArrayList(userDataArr2.length);
                    for (UserData userData2 : userDataArr2) {
                        arrayList.add(userData2.userId);
                    }
                    return arrayList;
                }
            } finally {
            }
        }
        return null;
    }
}
