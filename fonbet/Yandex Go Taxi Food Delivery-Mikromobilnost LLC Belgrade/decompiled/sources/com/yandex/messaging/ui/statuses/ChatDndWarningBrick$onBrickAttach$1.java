package com.yandex.messaging.ui.statuses;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import defpackage.i2b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.ut21;
import defpackage.v4a;
import defpackage.wls;
import defpackage.z6t;
import defpackage.zy11;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz6t;", "dndWarning", "Lzy11;", "<anonymous>", "(Lz6t;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.statuses.ChatDndWarningBrick$onBrickAttach$1", f = "ChatDndWarningBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatDndWarningBrick$onBrickAttach$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatDndWarningBrick$onBrickAttach$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatDndWarningBrick$onBrickAttach$1 chatDndWarningBrick$onBrickAttach$1 = new ChatDndWarningBrick$onBrickAttach$1(this.this$0, continuation);
        chatDndWarningBrick$onBrickAttach$1.L$0 = obj;
        return chatDndWarningBrick$onBrickAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChatDndWarningBrick$onBrickAttach$1 chatDndWarningBrick$onBrickAttach$1 = (ChatDndWarningBrick$onBrickAttach$1) create((z6t) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chatDndWarningBrick$onBrickAttach$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        z6t z6tVar = (z6t) this.L$0;
        ut21 ut21Var = this.this$0.x;
        Objects.toString(z6tVar);
        ut21Var.getClass();
        a aVar = this.this$0;
        if (z6tVar != null) {
            i2b i2bVar = aVar.b;
            View view = i2bVar.b;
            view.setVisibility(0);
            i2bVar.w.setText(((FrameLayout) view).getResources().getString(oyh0.dnd_status_warning_v2, z6tVar.a));
            ((ImageView) i2bVar.y).setImageResource(z6tVar.c);
            a aVar2 = this.this$0;
            aVar2.b.x.post(new v4a(5, aVar2));
        } else {
            aVar.b.b.setVisibility(8);
            this.this$0.w.c(ChatInputHeightState.HeightConsumer.DndWarning);
        }
        return zy11.a;
    }
}
