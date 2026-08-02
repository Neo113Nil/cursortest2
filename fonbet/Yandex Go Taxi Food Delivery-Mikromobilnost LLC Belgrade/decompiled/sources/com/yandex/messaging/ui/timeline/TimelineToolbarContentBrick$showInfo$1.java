package com.yandex.messaging.ui.timeline;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import defpackage.d2b;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld2b;", "it", "Lzy11;", "<anonymous>", "(Ld2b;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.timeline.TimelineToolbarContentBrick$showInfo$1", f = "TimelineToolbarContentBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class TimelineToolbarContentBrick$showInfo$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineToolbarContentBrick$showInfo$1(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimelineToolbarContentBrick$showInfo$1 timelineToolbarContentBrick$showInfo$1 = new TimelineToolbarContentBrick$showInfo$1(this.this$0, continuation);
        timelineToolbarContentBrick$showInfo$1.L$0 = obj;
        return timelineToolbarContentBrick$showInfo$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TimelineToolbarContentBrick$showInfo$1 timelineToolbarContentBrick$showInfo$1 = (TimelineToolbarContentBrick$showInfo$1) create((d2b) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        timelineToolbarContentBrick$showInfo$1.invokeSuspend(zy11Var);
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
        g gVar = this.this$0;
        String str = d2bVar.a;
        Drawable drawable = d2bVar.b;
        kgx[] kgxVarArr = g.N;
        gVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView = gVar.D;
        if (isEmpty) {
            textView.setText(oyh0.chat_list_progress_title);
            gVar.q(true);
        } else {
            textView.setText(str);
            gVar.F.setImageDrawable(drawable);
            gVar.q(false);
        }
        return zy11.a;
    }
}
