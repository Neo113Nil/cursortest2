package xsna;

import androidx.work.impl.constraints.a;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

/* compiled from: ContraintControllers.kt */
@b6l(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class yb6 extends SuspendLambda implements wzs<zhd0<? super androidx.work.impl.constraints.a>, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ zb6<Object> this$0;

    /* compiled from: ContraintControllers.kt */
    public static final class a extends Lambda implements gzs<s3q0> {
        final /* synthetic */ b $listener;
        final /* synthetic */ zb6<Object> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zb6<Object> zb6Var, b bVar) {
            super(0);
            this.this$0 = zb6Var;
            this.$listener = bVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            k6j<Object> k6jVar = this.this$0.a;
            b bVar = this.$listener;
            synchronized (k6jVar.c) {
                if (k6jVar.d.remove(bVar) && k6jVar.d.isEmpty()) {
                    k6jVar.d();
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: ContraintControllers.kt */
    public static final class b implements f6j<Object> {
        public final /* synthetic */ zb6<Object> a;
        public final /* synthetic */ zhd0<androidx.work.impl.constraints.a> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(zb6<Object> zb6Var, zhd0<? super androidx.work.impl.constraints.a> zhd0Var) {
            this.a = zb6Var;
            this.b = zhd0Var;
        }

        @Override // xsna.f6j
        public final void a(Object obj) {
            zb6<Object> zb6Var = this.a;
            this.b.getChannel().f(zb6Var.e(obj) ? new a.b(zb6Var.d()) : a.C0094a.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb6(zb6<Object> zb6Var, spj<? super yb6> spjVar) {
        super(2, spjVar);
        this.this$0 = zb6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        yb6 yb6Var = new yb6(this.this$0, spjVar);
        yb6Var.L$0 = obj;
        return yb6Var;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super androidx.work.impl.constraints.a> zhd0Var, spj<? super s3q0> spjVar) {
        return ((yb6) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zhd0 zhd0Var = (zhd0) this.L$0;
            zb6<Object> zb6Var = this.this$0;
            b bVar = new b(zb6Var, zhd0Var);
            k6j<Object> k6jVar = zb6Var.a;
            synchronized (k6jVar.c) {
                try {
                    if (k6jVar.d.add(bVar)) {
                        if (k6jVar.d.size() == 1) {
                            k6jVar.e = k6jVar.a();
                            m100 c = m100.c();
                            int i2 = l6j.a;
                            Objects.toString(k6jVar.e);
                            c.getClass();
                            k6jVar.c();
                        }
                        bVar.a(k6jVar.e);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            a aVar = new a(this.this$0, bVar);
            this.label = 1;
            if (phd0.a(zhd0Var, aVar, this) == coroutineSingletons) {
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
