package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicPickerItems.kt */
@b6l(c = "com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerItemsKt$MusicPickerList$2$1", f = "MusicPickerItems.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class et40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<lr40, s3q0> $sendAction;
    final /* synthetic */ mtk0<Boolean> $shouldLoadMore$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et40(spj spjVar, izs izsVar, mtk0 mtk0Var) {
        super(2, spjVar);
        this.$sendAction = izsVar;
        this.$shouldLoadMore$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new et40(spjVar, this.$sendAction, this.$shouldLoadMore$delegate);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((et40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        mtk0<Boolean> mtk0Var = this.$shouldLoadMore$delegate;
        qcy<Object>[] qcyVarArr = lt40.a;
        if (mtk0Var.getValue().booleanValue()) {
            this.$sendAction.invoke(mr40.b);
        }
        return s3q0.a;
    }
}
