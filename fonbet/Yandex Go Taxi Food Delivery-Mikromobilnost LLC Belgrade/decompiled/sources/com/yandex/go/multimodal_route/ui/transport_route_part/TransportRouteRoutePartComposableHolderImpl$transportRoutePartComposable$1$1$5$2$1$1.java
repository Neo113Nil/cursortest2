package com.yandex.go.multimodal_route.ui.transport_route_part;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.f811;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r3y0;
import defpackage.tvd0;
import defpackage.wls;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_route_part.TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$5$2$1$1", f = "TransportRouteRoutePartComposableHolderImpl.kt", l = {154}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$5$2$1$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ androidx.compose.foundation.lazy.b $listState;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f811 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$5$2$1$1(f811 f811Var, androidx.compose.foundation.lazy.b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = f811Var;
        this.$listState = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$5$2$1$1 transportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$5$2$1$1 = new TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$5$2$1$1(this.this$0, this.$listState, continuation);
        transportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$5$2$1$1.L$0 = obj;
        return transportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$5$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransportRouteRoutePartComposableHolderImpl$transportRoutePartComposable$1$1$5$2$1$1) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x002e -> B:5:0x002f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        r3y0 r3y0Var;
        androidx.compose.ui.input.pointer.f fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zvd0 zvd0Var = null;
        if (i == 0) {
            kotlin.b.b(obj);
            PointerEventPass pointerEventPass = PointerEventPass.Initial;
            this.L$0 = fVar;
            this.L$1 = zvd0Var;
            this.label = 1;
            obj = fVar.a(pointerEventPass, this);
            if (obj != coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zvd0 zvd0Var2 = (zvd0) this.L$1;
            kotlin.b.b(obj);
            tvd0 tvd0Var = (tvd0) obj;
            r3y0 r3y0Var2 = this.this$0.g;
            if (r3y0Var2 != null) {
                r3y0Var2.invoke(Boolean.TRUE, Boolean.valueOf(this.$listState.e()));
            }
            List list = tvd0Var.a;
            if ((list instanceof Collection) || !list.isEmpty()) {
                it = list.iterator();
                while (it.hasNext()) {
                    if (((zvd0) it.next()).d) {
                        break;
                    }
                }
            }
            boolean z = true;
            zvd0 zvd0Var3 = !z ? (zvd0) kotlin.collections.a.b0(tvd0Var.a) : zvd0Var2;
            if (!z) {
                if (zvd0Var3 != null && (r3y0Var = this.this$0.g) != null) {
                    r3y0Var.invoke(Boolean.FALSE, Boolean.valueOf(this.$listState.e()));
                }
                return zy11.a;
            }
            zvd0Var = zvd0Var3;
            PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
            this.L$0 = fVar;
            this.L$1 = zvd0Var;
            this.label = 1;
            obj = fVar.a(pointerEventPass2, this);
            if (obj != coroutineSingletons) {
                return coroutineSingletons;
            }
            zvd0Var2 = zvd0Var;
            tvd0 tvd0Var2 = (tvd0) obj;
            r3y0 r3y0Var22 = this.this$0.g;
            if (r3y0Var22 != null) {
            }
            List list2 = tvd0Var2.a;
            if (list2 instanceof Collection) {
            }
            it = list2.iterator();
            while (it.hasNext()) {
            }
            boolean z2 = true;
            if (!z2) {
            }
            if (!z2) {
            }
        }
    }
}
