package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vk.dzenarticle.impl.ui.DzenArticleFragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.fro;

/* compiled from: DzenArticleFragment.kt */
@b6l(c = "com.vk.dzenarticle.impl.ui.DzenArticleFragment$ScreenContent$1$2$1", f = "DzenArticleFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class jro extends SuspendLambda implements yzs<z37<cro>, fro, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DzenArticleFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jro(DzenArticleFragment dzenArticleFragment, spj<? super jro> spjVar) {
        super(3, spjVar);
        this.this$0 = dzenArticleFragment;
    }

    @Override // xsna.yzs
    public final Object invoke(z37<cro> z37Var, fro froVar, spj<? super s3q0> spjVar) {
        jro jroVar = new jro(this.this$0, spjVar);
        jroVar.L$0 = froVar;
        return jroVar.invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fro froVar = (fro) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        DzenArticleFragment dzenArticleFragment = this.this$0;
        qcy<Object>[] qcyVarArr = DzenArticleFragment.R;
        if (froVar instanceof fro.a) {
            dzenArticleFragment.finish();
        } else if (froVar instanceof fro.d) {
            Context mo2getContext = dzenArticleFragment.mo2getContext();
            if (mo2getContext != null) {
                ((DzenArticleFragment.c) dzenArticleFragment.N.getValue()).e.k(mo2getContext, ((fro.d) froVar).a);
            }
        } else if (froVar instanceof fro.c) {
            Context mo2getContext2 = dzenArticleFragment.mo2getContext();
            if (mo2getContext2 != null) {
                ((DzenArticleFragment.c) dzenArticleFragment.N.getValue()).f.getBrowser().f(mo2getContext2, null, new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108863), ((fro.c) froVar).a);
            }
        } else {
            if (!(froVar instanceof fro.b)) {
                dzenArticleFragment.getClass();
                throw new NoWhenBranchMatchedException();
            }
            Context mo2getContext3 = dzenArticleFragment.mo2getContext();
            if (mo2getContext3 != null) {
                fro.b bVar = (fro.b) froVar;
                ((DzenArticleFragment.c) dzenArticleFragment.N.getValue()).g.U(mo2getContext3, bVar.a, bVar.b);
            }
        }
        return s3q0.a;
    }
}
