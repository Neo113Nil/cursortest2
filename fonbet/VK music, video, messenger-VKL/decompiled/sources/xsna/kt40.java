package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicPickerItems.kt */
@b6l(c = "com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerItemsKt$SnippetRightIcons$1$1", f = "MusicPickerItems.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class kt40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ mtk0<Boolean> $isTooltipVisibleState$delegate;
    final /* synthetic */ etv0 $tooltipState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt40(etv0 etv0Var, mtk0<Boolean> mtk0Var, spj<? super kt40> spjVar) {
        super(2, spjVar);
        this.$tooltipState = etv0Var;
        this.$isTooltipVisibleState$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new kt40(this.$tooltipState, this.$isTooltipVisibleState$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((kt40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        etv0 etv0Var = this.$tooltipState;
        mtk0<Boolean> mtk0Var = this.$isTooltipVisibleState$delegate;
        qcy<Object>[] qcyVarArr = lt40.a;
        etv0Var.setVisible(mtk0Var.getValue().booleanValue());
        return s3q0.a;
    }
}
