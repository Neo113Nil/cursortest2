package xsna;

import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.x44;

/* compiled from: AttachedClipsInlineActor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.attachedclips.presentation.feature.store.AttachedClipsInlineActor$loadVideoAttachedClips$2", f = "AttachedClipsInlineActor.kt", l = {238}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class j54 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ h54 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j54(h54 h54Var, spj<? super j54> spjVar) {
        super(2, spjVar);
        this.this$0 = h54Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new j54(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((j54) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            String str = (String) this.this$0.c.g.getValue();
            if (((AttachedClipsState) this.this$0.b.getCurrentState()).b != null || str == null) {
                this.this$0.r();
                return s3q0.a;
            }
            q54 q54Var = this.this$0.d;
            this.L$0 = null;
            this.label = 1;
            c = q54Var.c(str, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            c = ((Result) obj).d();
        }
        h54 h54Var = this.this$0;
        if (!(c instanceof Result.Failure)) {
            rdi.y(h54Var, new i54((List) c, 0));
            h54Var.r();
        }
        h54 h54Var2 = this.this$0;
        Throwable a = Result.a(c);
        if (a != null) {
            if (h03.a(a)) {
                h54Var2.c(x44.c.C3973c.a);
            } else {
                com.vk.metrics.eventtracking.b.a.a(a);
                h54Var2.c(x44.c.b.a);
            }
            h54Var2.q(false);
        }
        return s3q0.a;
    }
}
