package com.yandex.go.ai_widget.ui.component;

import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.f;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationLikeDislikeKt$EvaluationButton$2$1$1", f = "AiWidgetEvaluationLikeDislike.kt", l = {119, Constants.VPN_TRAFFIC}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AiWidgetEvaluationLikeDislikeKt$EvaluationButton$2$1$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ AiWidgetEvaluationSwipeDirection $direction;
    final /* synthetic */ b $swipeState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiWidgetEvaluationLikeDislikeKt$EvaluationButton$2$1$1(b bVar, AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection, Continuation continuation) {
        super(2, continuation);
        this.$swipeState = bVar;
        this.$direction = aiWidgetEvaluationSwipeDirection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AiWidgetEvaluationLikeDislikeKt$EvaluationButton$2$1$1 aiWidgetEvaluationLikeDislikeKt$EvaluationButton$2$1$1 = new AiWidgetEvaluationLikeDislikeKt$EvaluationButton$2$1$1(this.$swipeState, this.$direction, continuation);
        aiWidgetEvaluationLikeDislikeKt$EvaluationButton$2$1$1.L$0 = obj;
        return aiWidgetEvaluationLikeDislikeKt$EvaluationButton$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiWidgetEvaluationLikeDislikeKt$EvaluationButton$2$1$1) create((f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x002a, code lost:
    
        if (androidx.compose.foundation.gestures.z.b(r0, null, r6, 2) == r1) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f fVar = (f) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.L$0 = fVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                b bVar = this.$swipeState;
                if (obj != null) {
                    AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection = this.$direction;
                    if (!bVar.g() && bVar.f() == aiWidgetEvaluationSwipeDirection) {
                        bVar.j.setValue(Boolean.TRUE);
                        bVar.h(new AiWidgetEvaluationSwipeState$onButtonRelease$1(bVar, aiWidgetEvaluationSwipeDirection, null));
                    }
                } else if (!bVar.g() && bVar.f() != null) {
                    bVar.h(new AiWidgetEvaluationSwipeState$onButtonCancel$1(bVar, null));
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        b bVar2 = this.$swipeState;
        AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection2 = this.$direction;
        if (!bVar2.g() && (bVar2.c() == null || bVar2.c() == aiWidgetEvaluationSwipeDirection2)) {
            bVar2.i.setValue(aiWidgetEvaluationSwipeDirection2);
            bVar2.h.setValue(aiWidgetEvaluationSwipeDirection2);
            bVar2.h(new AiWidgetEvaluationSwipeState$onButtonPress$1(bVar2, aiWidgetEvaluationSwipeDirection2, null));
        }
        this.L$0 = null;
        this.label = 2;
        zls zlsVar = z.a;
        obj = z.k(fVar, PointerEventPass.Main, this);
    }
}
