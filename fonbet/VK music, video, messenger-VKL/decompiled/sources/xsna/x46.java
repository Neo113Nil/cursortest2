package xsna;

import android.view.Surface;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AndroidExternalSurface.android.kt */
@b6l(c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", f = "AndroidExternalSurface.android.kt", l = {130, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class x46 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $height;
    final /* synthetic */ Surface $surface;
    final /* synthetic */ int $width;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ y46 this$0;

    /* compiled from: AndroidExternalSurface.android.kt */
    public static final class a implements mjn0, akn0, yvj {
        public final /* synthetic */ y46 b;
        public final /* synthetic */ yvj c;

        public a(y46 y46Var, yvj yvjVar) {
            this.b = y46Var;
            this.c = yvjVar;
        }

        @Override // xsna.akn0
        public final void a(zco zcoVar) {
            this.b.d = zcoVar;
        }

        @Override // xsna.akn0
        public final void c(je2 je2Var) {
            this.b.e = je2Var;
        }

        @Override // xsna.yvj
        public final kotlin.coroutines.d getCoroutineContext() {
            return this.c.getCoroutineContext();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x46(y46 y46Var, Surface surface, int i, int i2, spj<? super x46> spjVar) {
        super(2, spjVar);
        this.this$0 = y46Var;
        this.$surface = surface;
        this.$width = i;
        this.$height = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        x46 x46Var = new x46(this.this$0, this.$surface, this.$width, this.$height, spjVar);
        x46Var.L$0 = obj;
        return x46Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((x46) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (r3.invoke(r4, r5, r6, r7, r9) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (xsna.iyx.c(r10, r9) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvjVar = (yvj) this.L$0;
            yok0 yok0Var = this.this$0.f;
            if (yok0Var != null) {
                this.L$0 = yvjVar;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            yvjVar = (yvj) this.L$0;
            kotlin.a.a(obj);
        }
        y46 y46Var = this.this$0;
        a aVar = new a(y46Var, yvjVar);
        w4b0 w4b0Var = y46Var.c;
        if (w4b0Var != null) {
            Surface surface = this.$surface;
            Integer num = new Integer(this.$width);
            Integer num2 = new Integer(this.$height);
            this.L$0 = null;
            this.label = 2;
        }
        return s3q0.a;
    }
}
