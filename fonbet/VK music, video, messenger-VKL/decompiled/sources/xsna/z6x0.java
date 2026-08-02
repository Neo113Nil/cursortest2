package xsna;

import android.database.ContentObserver;
import android.provider.Settings;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VolumeChangeReporter.kt */
@b6l(c = "com.vk.music.player.core.stats.VolumeChangeReporter$volumeChanges$1", f = "VolumeChangeReporter.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class z6x0 extends SuspendLambda implements wzs<zhd0<? super Integer>, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ y6x0 this$0;

    /* compiled from: VolumeChangeReporter.kt */
    public static final class a extends ContentObserver {
        public final /* synthetic */ zhd0<Integer> a;
        public final /* synthetic */ y6x0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(zhd0<? super Integer> zhd0Var, y6x0 y6x0Var) {
            super(null);
            this.a = zhd0Var;
            this.b = y6x0Var;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            this.a.f(Integer.valueOf(y6x0.a(this.b)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6x0(y6x0 y6x0Var, spj<? super z6x0> spjVar) {
        super(2, spjVar);
        this.this$0 = y6x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        z6x0 z6x0Var = new z6x0(this.this$0, spjVar);
        z6x0Var.L$0 = obj;
        return z6x0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super Integer> zhd0Var, spj<? super s3q0> spjVar) {
        return ((z6x0) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zhd0 zhd0Var = (zhd0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            a aVar = new a(zhd0Var, this.this$0);
            zhd0Var.f(new Integer(y6x0.a(this.this$0)));
            this.this$0.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, aVar);
            fqd fqdVar = new fqd(19, this.this$0, aVar);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (phd0.a(zhd0Var, fqdVar, this) == coroutineSingletons) {
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
