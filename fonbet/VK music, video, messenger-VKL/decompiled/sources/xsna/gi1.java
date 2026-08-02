package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ei1;

/* compiled from: AlbumEvent.kt */
/* loaded from: classes16.dex */
public final class gi1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AlbumEvent.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.albums.AlbumEventKt$AlbumHandleEvents$1$1", f = "AlbumEvent.kt", l = {}, m = "invokeSuspend")
    public static final class a<T> extends SuspendLambda implements wzs<T, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$context, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(Object obj, spj<? super s3q0> spjVar) {
            return ((a) create((ei1) obj, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ei1 ei1Var = (ei1) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (ei1Var instanceof ei1.a) {
                g7s0 B = fxc0.B();
                Context context = this.$context;
                bpn0 bpn0Var = o25.a;
                if (bpn0Var == null) {
                    bpn0Var = null;
                }
                UserId c = ((b25) bpn0Var.getValue()).c();
                int i = g7s0.G7;
                B.n(context, c);
            } else {
                if (!(ei1Var instanceof ei1.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ydt0 Y = fxc0.B().Y();
                Activity h = e3m.h(this.$context);
                if (h == null) {
                    return s3q0.a;
                }
                ydt0.e(Y, h, ((ei1.b) ei1Var).b, null, null, 28);
            }
            return s3q0.a;
        }
    }

    public static final <T extends ei1> void a(ksr<? extends T> ksrVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1012753227);
        if ((i & 6) == 0) {
            i2 = (M.J(ksrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1012753227, i2, -1, "com.vk.catalog.mvi.block.video.impl.albums.AlbumHandleEvents (AlbumEvent.kt:27)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            boolean y = M.y(context);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new a(context, null);
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
            s.d = new fi1(ksrVar, i, 0);
        }
    }
}
