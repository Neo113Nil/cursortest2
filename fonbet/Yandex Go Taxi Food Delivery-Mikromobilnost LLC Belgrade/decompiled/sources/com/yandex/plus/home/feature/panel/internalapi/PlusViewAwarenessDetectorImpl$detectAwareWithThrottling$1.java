package com.yandex.plus.home.feature.panel.internalapi;

import android.util.SparseArray;
import android.view.View;
import com.yandex.plus.log.api.LogPriority;
import defpackage.gi91;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rkd0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.panel.internalapi.PlusViewAwarenessDetectorImpl$detectAwareWithThrottling$1", f = "PlusViewAwarenessDetectorImpl.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusViewAwarenessDetectorImpl$detectAwareWithThrottling$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $needNotifyImmediately;
    final /* synthetic */ View $shortcutView;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusViewAwarenessDetectorImpl$detectAwareWithThrottling$1(View view, a aVar, Continuation continuation, boolean z) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$shortcutView = view;
        this.$needNotifyImmediately = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusViewAwarenessDetectorImpl$detectAwareWithThrottling$1(this.$shortcutView, this.this$0, continuation, this.$needNotifyImmediately);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusViewAwarenessDetectorImpl$detectAwareWithThrottling$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.label = 1;
            if (kotlinx.coroutines.a.i(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        a aVar = this.this$0;
        View view = this.$shortcutView;
        boolean z = this.$needNotifyImmediately;
        SparseArray sparseArray = aVar.d;
        rkd0 rkd0Var = aVar.a;
        LogPriority logPriority = LogPriority.DEBUG;
        if (rkd0Var.e(logPriority)) {
            rkd0Var.b(logPriority, "PlusViewAwarenessDetectorImpl", "detectViewAware() view=" + view, null);
        }
        boolean z2 = gi91.c(view) > 0.8f;
        if (z2 && sparseArray.get(view.getId()) == null) {
            sparseArray.put(view.getId(), tje.N(aVar.b, null, null, new PlusViewAwarenessDetectorImpl$detectViewAware$2(view, aVar, null, z), 3));
        } else if (!z2) {
            int id = view.getId();
            Object obj2 = sparseArray.get(id);
            if (obj2 != null) {
                sparseArray.remove(id);
            } else {
                obj2 = null;
            }
            l8x l8xVar = (l8x) obj2;
            if (l8xVar != null) {
                l8xVar.a(null);
            }
        }
        this.this$0.c.remove(this.$shortcutView.getId());
        return zy11.a;
    }
}
