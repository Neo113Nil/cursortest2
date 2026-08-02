package com.yandex.messaging.ui.chatlist;

import android.widget.TextView;
import com.yandex.messaging.internal.MessageStatus;
import defpackage.d4b;
import defpackage.m8t;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Date;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm8t;", "it", "Lzy11;", "<anonymous>", "(Lm8t;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.chatlist.BaseChatItemViewHolder$bind$5", f = "BaseChatItemViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BaseChatItemViewHolder$bind$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChatItemViewHolder$bind$5(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseChatItemViewHolder$bind$5 baseChatItemViewHolder$bind$5 = new BaseChatItemViewHolder$bind$5(this.this$0, continuation);
        baseChatItemViewHolder$bind$5.L$0 = obj;
        return baseChatItemViewHolder$bind$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BaseChatItemViewHolder$bind$5 baseChatItemViewHolder$bind$5 = (BaseChatItemViewHolder$bind$5) create((m8t) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        baseChatItemViewHolder$bind$5.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        m8t m8tVar = (m8t) this.L$0;
        b bVar = this.this$0;
        int i = b.i0;
        bVar.getClass();
        CharSequence charSequence = m8tVar.a;
        Date date = m8tVar.b;
        MessageStatus messageStatus = m8tVar.c;
        Integer num = m8tVar.d;
        d4b Z = bVar.Z();
        TextView textView = Z.e;
        if (textView != null) {
            textView.setText(charSequence, TextView.BufferType.EDITABLE);
        }
        Z.c(messageStatus);
        Z.d(date);
        Z.b(num);
        bVar.Y().c = charSequence;
        bVar.Y().d = date;
        bVar.Y().e = messageStatus;
        bVar.Y().j = num;
        return zy11.a;
    }
}
