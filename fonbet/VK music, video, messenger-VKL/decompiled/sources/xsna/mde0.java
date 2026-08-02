package xsna;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoAuthorDo;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PublishNetworkApiImpl.kt */
@b6l(c = "com.vk.video.ui.upload.impl.publish.data.network.PublishNetworkApiImpl$getAvailableVideoAuthorList$3", f = "PublishNetworkApiImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class mde0 extends SuspendLambda implements wzs<yvj, spj<? super zrl<? extends Result<? extends List<? extends VideoAuthorDo>>>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ bee0 this$0;

    /* compiled from: PublishNetworkApiImpl.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.publish.data.network.PublishNetworkApiImpl$getAvailableVideoAuthorList$3$1", f = "PublishNetworkApiImpl.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends List<? extends VideoAuthorDo>>>, Object> {
        int label;
        final /* synthetic */ bee0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bee0 bee0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = bee0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Result<? extends List<? extends VideoAuthorDo>>> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object k;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                bee0 bee0Var = this.this$0;
                this.label = 1;
                k = bee0.k(bee0Var, this);
                if (k == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                k = ((Result) obj).d();
            }
            return new Result(k);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mde0(bee0 bee0Var, spj<? super mde0> spjVar) {
        super(2, spjVar);
        this.this$0 = bee0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        mde0 mde0Var = new mde0(this.this$0, spjVar);
        mde0Var.L$0 = obj;
        return mde0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super zrl<? extends Result<? extends List<? extends VideoAuthorDo>>>> spjVar) {
        return ((mde0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        asl b = myc0.b(yvjVar, null, null, new a(this.this$0, null), 3);
        this.this$0.d = b;
        return b;
    }
}
