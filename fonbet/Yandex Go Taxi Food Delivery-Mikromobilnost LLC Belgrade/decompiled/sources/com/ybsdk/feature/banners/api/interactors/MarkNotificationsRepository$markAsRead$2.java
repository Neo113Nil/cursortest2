package com.ybsdk.feature.banners.api.interactors;

import com.ybsdk.feature.banners.api.MarkEventsApi;
import com.ybsdk.feature.banners.api.dto.MarkEventsRequest;
import com.ybsdk.feature.banners.api.dto.MarkType;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qw00;
import defpackage.tls;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lzy11;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.banners.api.interactors.MarkNotificationsRepository$markAsRead$2", f = "MarkNotificationsRepository.kt", l = {17}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MarkNotificationsRepository$markAsRead$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $id;
    final /* synthetic */ String $idempotencyToken;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkNotificationsRepository$markAsRead$2(a aVar, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$id = str;
        this.$idempotencyToken = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MarkNotificationsRepository$markAsRead$2(this.this$0, this.$id, this.$idempotencyToken, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MarkNotificationsRepository$markAsRead$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            MarkEventsApi markEventsApi = this.this$0.a;
            qw00 qw00Var = MarkEventsRequest.Companion;
            String str = this.$id;
            MarkType markType = MarkType.READ;
            qw00Var.getClass();
            MarkEventsRequest markEventsRequest = new MarkEventsRequest(Collections.singletonList(str), null, markType);
            String str2 = this.$idempotencyToken;
            this.label = 1;
            a = markEventsApi.a(markEventsRequest, str2, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
