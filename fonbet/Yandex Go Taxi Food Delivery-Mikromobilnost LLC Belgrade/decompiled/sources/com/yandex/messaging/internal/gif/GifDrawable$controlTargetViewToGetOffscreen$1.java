package com.yandex.messaging.internal.gif;

import android.widget.ImageView;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.gif.GifDrawable$controlTargetViewToGetOffscreen$1", f = "GifDrawable.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GifDrawable$controlTargetViewToGetOffscreen$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ GifDrawable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifDrawable$controlTargetViewToGetOffscreen$1(GifDrawable gifDrawable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gifDrawable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GifDrawable$controlTargetViewToGetOffscreen$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GifDrawable$controlTargetViewToGetOffscreen$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ImageView attachedView;
        boolean isViewOnScreen;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        while (kotlinx.coroutines.a.p(get_context())) {
            GifDrawable gifDrawable = this.this$0;
            attachedView = gifDrawable.getAttachedView();
            isViewOnScreen = gifDrawable.isViewOnScreen(attachedView);
            if (!isViewOnScreen) {
                this.this$0.reset();
                this.this$0.scheduleRestartWhenOnScreen();
                throw new CancellationException("View got offscreen");
            }
            o430 o430Var = e3n.b;
            long U = kp50.U(500, DurationUnit.MILLISECONDS);
            this.label = 1;
            if (kotlinx.coroutines.a.j(U, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11.a;
    }
}
