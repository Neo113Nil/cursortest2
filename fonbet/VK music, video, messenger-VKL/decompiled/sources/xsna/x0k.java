package xsna;

import android.graphics.Bitmap;
import com.vk.video.ui.upload.impl.coverchoose.presentation.feature.entity.CoverChooseState;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.k0k;

/* compiled from: CoverChooseInlineActor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.coverchoose.presentation.feature.store.CoverChooseInlineActor$loadCover$1$1", f = "CoverChooseInlineActor.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class x0k extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ z0k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0k(z0k z0kVar, spj<? super x0k> spjVar) {
        super(2, spjVar);
        this.this$0 = z0kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new x0k(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((x0k) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (((CoverChooseState) this.this$0.b.getCurrentState()).c != null) {
                return s3q0.a;
            }
            z0k z0kVar = this.this$0;
            a1k a1kVar = z0kVar.d;
            String U2 = z0kVar.c.U2();
            this.label = 1;
            a = a1kVar.a(U2, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a = ((Result) obj).d();
        }
        z0k z0kVar2 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            rdi.y(z0kVar2, new p4f((Bitmap) a, 12));
        }
        z0k z0kVar3 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            com.vk.metrics.eventtracking.b.a.a(a2);
            z0kVar3.c(k0k.b.a);
        }
        return s3q0.a;
    }
}
