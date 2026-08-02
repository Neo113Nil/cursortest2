package com.yandex.messaging.internal.urlpreview.impl;

import com.yandex.alicekit.core.views.EllipsizingTextView;
import com.yandex.images.FadingDrawable;
import defpackage.ad7;
import defpackage.kh21;
import defpackage.mvg;
import defpackage.nh21;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.ye0;
import defpackage.zgv;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.urlpreview.impl.MessageUrlPreview$bindChatMessageJob$1", f = "MessageUrlPreview.kt", l = {188, 191}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MessageUrlPreview$bindChatMessageJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ kh21 $chatMessage;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageUrlPreview$bindChatMessageJob$1(kh21 kh21Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$chatMessage = kh21Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessageUrlPreview$bindChatMessageJob$1(this.$chatMessage, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MessageUrlPreview$bindChatMessageJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0085, code lost:
    
        if (r9 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str2 = this.$chatMessage.A;
            this.this$0.J.setText(str2);
            cVar = this.this$0;
            this.L$0 = str2;
            this.L$1 = cVar;
            this.label = 1;
            cVar.getClass();
            Object k0 = tje.k0(uyj.a, new MessageUrlPreview$processMessageText$2(cVar, null), this);
            if (k0 != coroutineSingletons) {
                str = str2;
                obj = k0;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ad7 ad7Var = (ad7) obj;
            FadingDrawable.setBitmap(this.this$0.I, ad7Var.a, false, ad7Var.d);
            return zy11.a;
        }
        cVar = (c) this.L$1;
        str = (String) this.L$0;
        kotlin.b.b(obj);
        EllipsizingTextView ellipsizingTextView = cVar.K;
        ellipsizingTextView.setLastLinePadding(cVar.B);
        ellipsizingTextView.setText((CharSequence) obj);
        c cVar2 = this.this$0;
        cVar2.L.setOnClickListener(new zgv(16, cVar2));
        c cVar3 = this.this$0;
        String str3 = ((nh21) ((ye0) cVar3.b)).x;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = tje.k0(cVar3.y.d, new MessageUrlPreview$loadAvatarAsync$2(str3, cVar3, str, null), this);
    }
}
