package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AttachmentPickersScreen.kt */
@b6l(c = "com.vk.newsfeed.posting.impl.presentation.base.view.steps.AttachmentPickersScreenKt$AttachmentPickersScreen$4$1", f = "AttachmentPickersScreen.kt", l = {199, 200, 202}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class o74 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ jgh0 $scrollState;
    final /* synthetic */ izs<PostingAction, s3q0> $sendAction;
    final /* synthetic */ boolean $showStoryOnboarding;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o74(jgh0 jgh0Var, boolean z, izs<? super PostingAction, s3q0> izsVar, spj<? super o74> spjVar) {
        super(2, spjVar);
        this.$scrollState = jgh0Var;
        this.$showStoryOnboarding = z;
        this.$sendAction = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new o74(this.$scrollState, this.$showStoryOnboarding, this.$sendAction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((o74) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (xsna.qsl.b(5000, r6) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r7 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        if (xsna.qsl.b(500, r6) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.a.a(obj);
                    if (this.$showStoryOnboarding) {
                        this.label = 3;
                    }
                    return s3q0.a;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                this.$sendAction.invoke(PostingAction.Editing.HideStoryRepostSwitchOnboarding.b);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        jgh0 jgh0Var = this.$scrollState;
        int f = jgh0Var.f();
        this.label = 2;
        Object g = fdi.g(jgh0Var, f - ((wak0) jgh0Var.a).getIntValue(), new xmk0(null, 7), this);
        if (g != obj2) {
            g = s3q0.a;
        }
    }
}
