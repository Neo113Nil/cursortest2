package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AlbumChooseInlineActor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.store.AlbumChooseInlineActor", f = "AlbumChooseInlineActor.kt", l = {251}, m = "getInitialSelectedIds-IoAF18A")
/* loaded from: classes7.dex */
public final class ud1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ td1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud1(td1 td1Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = td1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m = td1.m(this.this$0, this);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : new Result(m);
    }
}
