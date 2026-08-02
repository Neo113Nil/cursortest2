package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkMixSettingsRepositoryImpl.kt */
@b6l(c = "com.vk.music.bottomsheets.settings.data.repository.VkMixSettingsRepositoryImpl", f = "VkMixSettingsRepositoryImpl.kt", l = {32}, m = "getSettings")
/* loaded from: classes3.dex */
public final class u4v0 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v4v0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4v0(v4v0 v4v0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = v4v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
