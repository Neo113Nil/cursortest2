package xsna;

import com.vk.dto.common.data.PrivacySetting;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: PublishInlineActor.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.PublishInlineActor$handleScreenResume$1", f = "PublishInlineActor.kt", l = {ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class fce0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ gce0 this$0;

    /* compiled from: PublishInlineActor.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.publish.feature.store.PublishInlineActor$handleScreenResume$1$2", f = "PublishInlineActor.kt", l = {111}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;
        final /* synthetic */ gce0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gce0 gce0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = gce0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                gce0 gce0Var = this.this$0;
                this.label = 1;
                if (a85.a(gce0Var, ((PublishState) gce0Var.b.getCurrentState()).j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                ((Result) obj).getClass();
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fce0(gce0 gce0Var, spj<? super fce0> spjVar) {
        super(2, spjVar);
        this.this$0 = gce0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        fce0 fce0Var = new fce0(this.this$0, spjVar);
        fce0Var.L$0 = obj;
        return fce0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((fce0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        yvj yvjVar = (yvj) this.L$0;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            gce0 gce0Var = this.this$0;
            this.L$0 = yvjVar;
            this.label = 1;
            List<PrivacySetting.PrivacyRule> list = rxw.a;
            PublishState.Block block = ((PublishState) gce0Var.b.getCurrentState()).b;
            if (block instanceof PublishState.Upload) {
                c = rxw.d(gce0Var, (PublishState.Upload) block, this);
                if (c != obj2) {
                    c = s3q0.a;
                }
            } else {
                if (!(block instanceof PublishState.Edit)) {
                    throw new NoWhenBranchMatchedException();
                }
                c = rxw.c(gce0Var, (PublishState.Edit) block, this);
                if (c != obj2) {
                    c = s3q0.a;
                }
            }
            if (c == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        if (((PublishState) this.this$0.b.getCurrentState()).R) {
            rdi.y(this.this$0, new i0r(14));
            myc0.h(yvjVar, null, null, new a(this.this$0, null), 3);
        }
        return s3q0.a;
    }
}
