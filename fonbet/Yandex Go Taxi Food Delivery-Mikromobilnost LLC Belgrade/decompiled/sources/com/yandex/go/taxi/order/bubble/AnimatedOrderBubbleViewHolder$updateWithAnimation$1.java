package com.yandex.go.taxi.order.bubble;

import android.animation.PropertyValuesHolder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.bubble.AnimatedOrderBubbleViewHolder$updateWithAnimation$1", f = "AnimatedOrderBubbleViewHolder.kt", l = {ModuleDescriptor.MODULE_VERSION, 159}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class AnimatedOrderBubbleViewHolder$updateWithAnimation$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedOrderBubbleViewHolder$updateWithAnimation$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnimatedOrderBubbleViewHolder$updateWithAnimation$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AnimatedOrderBubbleViewHolder$updateWithAnimation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (kotlinx.coroutines.a.i(500, r8) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (kotlinx.coroutines.a.i(500, r8) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean z = this.this$0.J;
            a aVar = this.this$0;
            if (z) {
                if (aVar.y.j != 0.0f) {
                    aVar.H = false;
                    aVar.e(PropertyValuesHolder.ofFloat(CaretView.ALPHA_PROPERTY, 1.0f, 0.0f));
                }
                this.label = 1;
            } else if (aVar.y.j == 0.0f) {
                this.label = 2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            a.b(this.this$0);
            this.this$0.J = false;
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a.b(this.this$0);
        }
        return zy11.a;
    }
}
