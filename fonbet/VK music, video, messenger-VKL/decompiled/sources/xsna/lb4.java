package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AudioAdRepositoryImpl.kt */
@b6l(c = "com.vk.music.player.ads.impl.data.repository.AudioAdRepositoryImpl", f = "AudioAdRepositoryImpl.kt", l = {44}, m = "updateUserStatistic")
/* loaded from: classes3.dex */
public final class lb4 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ kb4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb4(kb4 kb4Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kb4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, 0, 0, null, this);
    }
}
