package androidx.compose.material3;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1", f = "ModalBottomSheet.kt", l = {248}, m = "performFling", v = 1)
/* loaded from: classes10.dex */
final class ModalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetContent$modalBottomSheetFlingBehavior$1$1$performFling$1(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, 0.0f, this);
    }
}
