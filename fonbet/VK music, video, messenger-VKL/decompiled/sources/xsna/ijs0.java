package xsna;

import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VideoEpisodesContentState.kt */
@b6l(c = "com.vk.libvideo.bottomsheet.episode.VideoEpisodesContentStateKt$VideoEpisodesContent$1$1", f = "VideoEpisodesContentState.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ijs0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ xvy $listState;
    final /* synthetic */ hjs0 $state;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijs0(hjs0 hjs0Var, xvy xvyVar, spj<? super ijs0> spjVar) {
        super(2, spjVar);
        this.$state = hjs0Var;
        this.$listState = xvyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ijs0(this.$state, this.$listState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ijs0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Iterator<atp> it = this.$state.a.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (it.next().e) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                xvy xvyVar = this.$listState;
                int i3 = i2 - 1;
                int i4 = i3 >= 0 ? i3 : 0;
                this.I$0 = i2;
                this.label = 1;
                fh9 fh9Var = xvy.y;
                if (xvyVar.f(i4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
