package xsna;

import com.vk.music.offline.ui.presentation.MusicDownloadsSettingsFragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.xi40;

/* compiled from: MusicDownloadsSettingsFragment.kt */
@b6l(c = "com.vk.music.offline.ui.presentation.MusicDownloadsSettingsFragment$ScreenContent$2$1", f = "MusicDownloadsSettingsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class zi40 extends SuspendLambda implements yzs<z37<wi40>, xi40, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MusicDownloadsSettingsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi40(MusicDownloadsSettingsFragment musicDownloadsSettingsFragment, spj<? super zi40> spjVar) {
        super(3, spjVar);
        this.this$0 = musicDownloadsSettingsFragment;
    }

    @Override // xsna.yzs
    public final Object invoke(z37<wi40> z37Var, xi40 xi40Var, spj<? super s3q0> spjVar) {
        zi40 zi40Var = new zi40(this.this$0, spjVar);
        zi40Var.L$0 = xi40Var;
        return zi40Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xi40 xi40Var = (xi40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        MusicDownloadsSettingsFragment musicDownloadsSettingsFragment = this.this$0;
        qcy<Object>[] qcyVarArr = MusicDownloadsSettingsFragment.P;
        musicDownloadsSettingsFragment.getClass();
        if (!epx.f(xi40Var, xi40.a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        musicDownloadsSettingsFragment.finish();
        return s3q0.a;
    }
}
