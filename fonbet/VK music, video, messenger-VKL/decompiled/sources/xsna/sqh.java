package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vk.music.screens.about.CommunityProfileLinksFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.qqh;

/* compiled from: CommunityProfileLinksFragment.kt */
@b6l(c = "com.vk.music.screens.about.CommunityProfileLinksFragment$ScreenContent$2$1", f = "CommunityProfileLinksFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class sqh extends SuspendLambda implements yzs<z37<iqh>, qqh, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CommunityProfileLinksFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqh(CommunityProfileLinksFragment communityProfileLinksFragment, spj<? super sqh> spjVar) {
        super(3, spjVar);
        this.this$0 = communityProfileLinksFragment;
    }

    @Override // xsna.yzs
    public final Object invoke(z37<iqh> z37Var, qqh qqhVar, spj<? super s3q0> spjVar) {
        sqh sqhVar = new sqh(this.this$0, spjVar);
        sqhVar.L$0 = qqhVar;
        return sqhVar.invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qqh qqhVar = (qqh) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (qqhVar instanceof qqh.b) {
            Context mo2getContext = this.this$0.mo2getContext();
            if (mo2getContext != null) {
                maz.c(((qdz) this.this$0.N.getValue()).e(), mo2getContext, ((qqh.b) qqhVar).a, LaunchContext.A, null, null, 24);
            }
        } else if (qqhVar instanceof qqh.a) {
            this.this$0.finish();
        }
        return s3q0.a;
    }
}
