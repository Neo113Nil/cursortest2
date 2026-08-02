package xsna;

import android.util.SparseArray;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.upload.UploadListView$UploadListState;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ln50;
import xsna.saq0;

/* compiled from: UploadActor.kt */
/* loaded from: classes16.dex */
public final class tbq0 extends u1a<UploadListView$UploadListState, fcq0> {

    /* compiled from: UploadActor.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.upload.UploadListInlineActor$1$1", f = "UploadActor.kt", l = {32}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ dot0 $videoUploadController;
        int label;
        final /* synthetic */ tbq0 this$0;

        /* compiled from: UploadActor.kt */
        /* renamed from: xsna.tbq0$a$a, reason: collision with other inner class name */
        public static final class C3737a<T> implements lsr {
            public final /* synthetic */ tbq0 b;

            public C3737a(tbq0 tbq0Var) {
                this.b = tbq0Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                tbq0 tbq0Var = this.b;
                tbq0Var.getClass();
                tbq0Var.m(new f1p0(2, (List) obj, tbq0Var));
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dot0 dot0Var, tbq0 tbq0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$videoUploadController = dot0Var;
            this.this$0 = tbq0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$videoUploadController, this.this$0, spjVar);
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
                nb9 a = cdn.a(this.$videoUploadController.b());
                C3737a c3737a = new C3737a(this.this$0);
                this.label = 1;
                if (a.collect(c3737a, this) == coroutineSingletons) {
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

    public tbq0(b2a b2aVar, dot0 dot0Var) {
        super(b2aVar);
        SparseArray<VideoUploadEvent> e = dot0Var.e();
        u4q0 u4q0Var = zik0.a;
        m(new f1p0(2, j5g.O0(new yik0(e)), this));
        e(new rn50("OBSERVE_UPLOADS_TASK_ID"), ln50.a.b, new kp5(29, dot0Var, this));
    }

    @Override // xsna.u1a
    public final void g(fcq0 fcq0Var) {
        fcq0 fcq0Var2 = fcq0Var;
        t(new saq0.a(new BlockId.Simple(fcq0Var2.b), fcq0Var2.c));
    }

    @Override // xsna.u1a
    public final UploadListView$UploadListState h(UploadListView$UploadListState uploadListView$UploadListState, UploadListView$UploadListState uploadListView$UploadListState2) {
        return UploadListView$UploadListState.a(uploadListView$UploadListState2, uploadListView$UploadListState.f);
    }
}
