package com.yandex.go.taxi.order.util;

import android.view.accessibility.AccessibilityManager;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.util.ContextExtensionsKt$isTouchExplorationEnabledFlow$2", f = "ContextExtensions.kt", l = {25}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ContextExtensionsKt$isTouchExplorationEnabledFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextExtensionsKt$isTouchExplorationEnabledFlow$2(AccessibilityManager accessibilityManager, Continuation continuation) {
        super(2, continuation);
        this.$accessibilityManager = accessibilityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ContextExtensionsKt$isTouchExplorationEnabledFlow$2 contextExtensionsKt$isTouchExplorationEnabledFlow$2 = new ContextExtensionsKt$isTouchExplorationEnabledFlow$2(this.$accessibilityManager, continuation);
        contextExtensionsKt$isTouchExplorationEnabledFlow$2.L$0 = obj;
        return contextExtensionsKt$isTouchExplorationEnabledFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ContextExtensionsKt$isTouchExplorationEnabledFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Boolean valueOf = Boolean.valueOf(this.$accessibilityManager.isTouchExplorationEnabled());
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
