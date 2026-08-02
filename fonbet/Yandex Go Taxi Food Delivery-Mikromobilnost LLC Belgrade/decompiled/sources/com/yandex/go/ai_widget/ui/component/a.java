package com.yandex.go.ai_widget.ui.component;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection;
import defpackage.hwd0;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class a implements PointerInputEventHandler {
    public final /* synthetic */ b a;
    public final /* synthetic */ AiWidgetEvaluationSwipeDirection b;

    public a(b bVar, AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection) {
        this.a = bVar;
        this.b = aiWidgetEvaluationSwipeDirection;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        return androidx.compose.foundation.gestures.c.l(hwd0Var, new AiWidgetEvaluationLikeDislikeKt$EvaluationButton$2$1$1(this.a, this.b, null), continuation);
    }
}
