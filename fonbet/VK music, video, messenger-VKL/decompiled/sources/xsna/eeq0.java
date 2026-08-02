package xsna;

import com.vk.catalog.mvi.block.video.impl.upload.video.bottomsheet.UploadingVideoBottomSheetState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UploadingVideoBottomSheet.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.upload.video.bottomsheet.UploadingVideoBottomSheet$handleUploadEvents$1", f = "UploadingVideoBottomSheet.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class eeq0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isFailed;
    int label;
    final /* synthetic */ deq0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeq0(deq0 deq0Var, boolean z, spj<? super eeq0> spjVar) {
        super(2, spjVar);
        this.this$0 = deq0Var;
        this.$isFailed = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new eeq0(this.this$0, this.$isFailed, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((eeq0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            utk0 utk0Var = this.this$0.j1;
            UploadingVideoBottomSheetState uploadingVideoBottomSheetState = (UploadingVideoBottomSheetState) utk0Var.getValue();
            boolean z = this.$isFailed;
            uploadingVideoBottomSheetState.getClass();
            UploadingVideoBottomSheetState uploadingVideoBottomSheetState2 = new UploadingVideoBottomSheetState(z);
            this.label = 1;
            utk0Var.getClass();
            utk0Var.i(null, uploadingVideoBottomSheetState2);
            if (s3q0.a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
