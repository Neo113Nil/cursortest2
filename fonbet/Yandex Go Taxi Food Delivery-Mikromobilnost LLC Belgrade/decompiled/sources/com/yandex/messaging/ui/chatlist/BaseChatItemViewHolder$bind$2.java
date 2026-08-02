package com.yandex.messaging.ui.chatlist;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import defpackage.d2b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld2b;", "it", "Lzy11;", "<anonymous>", "(Ld2b;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.chatlist.BaseChatItemViewHolder$bind$2", f = "BaseChatItemViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BaseChatItemViewHolder$bind$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChatItemViewHolder$bind$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseChatItemViewHolder$bind$2 baseChatItemViewHolder$bind$2 = new BaseChatItemViewHolder$bind$2(this.this$0, continuation);
        baseChatItemViewHolder$bind$2.L$0 = obj;
        return baseChatItemViewHolder$bind$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BaseChatItemViewHolder$bind$2 baseChatItemViewHolder$bind$2 = (BaseChatItemViewHolder$bind$2) create((d2b) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        baseChatItemViewHolder$bind$2.invokeSuspend(zy11Var);
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
        d2b d2bVar = (d2b) this.L$0;
        b bVar = this.this$0;
        String str = d2bVar.a;
        Drawable drawable = d2bVar.b;
        if (str.length() > 0) {
            TextView textView = bVar.Z().d;
            textView.setText(str);
            textView.setContentDescription(str);
            bVar.Y().a = str;
        }
        bVar.Z().c.setImageDrawable(drawable);
        bVar.Y().b = drawable;
        return zy11.a;
    }
}
