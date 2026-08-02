package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.deq0;
import xsna.saq0;

/* compiled from: UploadEvent.kt */
/* loaded from: classes.dex */
public final class taq0 {
    public final dot0 a;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: UploadEvent.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.upload.UploadEventHandler$UploadListHandleEvents$1$1", f = "UploadEvent.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes16.dex */
    public static final class a<T> extends SuspendLambda implements wzs<T, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ taq0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, taq0 taq0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$context = context;
            this.this$0 = taq0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$context, this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(Object obj, spj<? super s3q0> spjVar) {
            return ((a) create((saq0) obj, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            saq0 saq0Var = (saq0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (!(saq0Var instanceof saq0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            new deq0.b(this.$context, this.this$0.a, ((saq0.a) saq0Var).b).I0(null);
            return s3q0.a;
        }
    }

    public taq0(dot0 dot0Var) {
        this.a = dot0Var;
    }

    public final <T extends saq0> void a(ksr<? extends T> ksrVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-211556237);
        if ((i & 6) == 0) {
            i2 = (M.J(ksrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-211556237, i2, -1, "com.vk.catalog.mvi.block.video.impl.upload.UploadEventHandler.UploadListHandleEvents (UploadEvent.kt:27)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b());
            boolean y = M.y(context) | ((i2 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new a(context, this, null);
                M.R(x);
            }
            c1q.a(ksrVar, (wzs) x, M, i2 & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new o7c(this, ksrVar, i, 5));
        }
    }
}
