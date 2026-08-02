package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.ui.core.util.EditorMode;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicMyAudiosCatalogRootVh.kt */
@b6l(c = "com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh$editModeChange$1", f = "MusicMyAudiosCatalogRootVh.kt", l = {IronSourceError.ERROR_NT_INSTANCE_INIT_TIMEOUT}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class xo40 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ zra $cmd;
    int label;
    final /* synthetic */ MusicMyAudiosCatalogRootVh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo40(MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh, zra zraVar, spj<? super xo40> spjVar) {
        super(2, spjVar);
        this.this$0 = musicMyAudiosCatalogRootVh;
        this.$cmd = zraVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xo40(this.this$0, this.$cmd, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xo40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            m7a m7aVar = (m7a) this.this$0.D.getValue();
            u580 u580Var = new u580(this.$cmd.a == EditorMode.ENTER_EDITOR_MODE);
            this.label = 1;
            if (m7aVar.a(u580Var, this) == coroutineSingletons) {
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
