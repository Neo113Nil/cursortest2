package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DragAndDropReorder.kt */
@b6l(c = "com.vk.catalog.mvi.section.ui.view.reorder.DragAndDropReorderKt$rememberDragDropState$1$1", f = "DragAndDropReorder.kt", l = {257, 258}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class tfo extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ xvy $lazyListState;
    final /* synthetic */ wfo $state;
    float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfo(wfo wfoVar, xvy xvyVar, spj<? super tfo> spjVar) {
        super(2, spjVar);
        this.$state = wfoVar;
        this.$lazyListState = xvyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new tfo(this.$state, this.$lazyListState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((tfo) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (xsna.fdi.K(r1, r5, r4) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r5 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0039 -> B:11:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.a.a(obj);
                float floatValue = ((Number) obj).floatValue();
                xvy xvyVar = this.$lazyListState;
                this.F$0 = floatValue;
                this.label = 2;
            } else if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        kotlin.a.a(obj);
        nm8 nm8Var = this.$state.e;
        this.label = 1;
        obj = nm8Var.a(this);
    }
}
