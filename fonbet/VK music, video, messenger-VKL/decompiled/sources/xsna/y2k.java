package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.f0k;

/* compiled from: Cover.kt */
@b6l(c = "com.vk.video.ui.upload.impl.coverchoose.presentation.compose.cover.CoverKt$Cover$2$1", f = "Cover.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class y2k extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ v2k $curCoverInfo;
    final /* synthetic */ izs<f0k.b, s3q0> $onAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y2k(v2k v2kVar, izs<? super f0k.b, s3q0> izsVar, spj<? super y2k> spjVar) {
        super(2, spjVar);
        this.$curCoverInfo = v2kVar;
        this.$onAction = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new y2k(this.$curCoverInfo, this.$onAction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((y2k) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        v2k v2kVar = this.$curCoverInfo;
        if (v2kVar != null) {
            this.$onAction.invoke(new f0k.b.C2843b(xa4.K(v2kVar.b)));
        }
        return s3q0.a;
    }
}
