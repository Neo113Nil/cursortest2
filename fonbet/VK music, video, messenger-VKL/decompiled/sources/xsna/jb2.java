package xsna;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidPlatformTextInputSession.android.kt */
@b6l(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {184}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class jb2 extends SuspendLambda implements wzs<l2x, spj<?>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ kb2 this$0;

    /* compiled from: AndroidPlatformTextInputSession.android.kt */
    public static final class a extends Lambda implements izs<Throwable, s3q0> {
        final /* synthetic */ l2x $methodSession;
        final /* synthetic */ kb2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l2x l2xVar, kb2 kb2Var) {
            super(1);
            this.$methodSession = l2xVar;
            this.this$0 = kb2Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            l2x l2xVar = this.$methodSession;
            synchronized (l2xVar.c) {
                try {
                    l2xVar.e = true;
                    ci50<ndx0<ym70>> ci50Var = l2xVar.d;
                    ndx0<ym70>[] ndx0VarArr = ci50Var.b;
                    int i = ci50Var.d;
                    for (int i2 = 0; i2 < i; i2++) {
                        ym70 ym70Var = ndx0VarArr[i2].get();
                        if (ym70Var != null) {
                            ym70Var.a();
                        }
                    }
                    l2xVar.d.g();
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            mio0 mio0Var = this.this$0.c;
            mio0Var.b.set(null);
            mio0Var.a.a();
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb2(kb2 kb2Var, spj<? super jb2> spjVar) {
        super(2, spjVar);
        this.this$0 = kb2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        jb2 jb2Var = new jb2(this.this$0, spjVar);
        jb2Var.L$0 = obj;
        return jb2Var;
    }

    @Override // xsna.wzs
    public final Object invoke(l2x l2xVar, spj<?> spjVar) {
        return ((jb2) create(l2xVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            l2x l2xVar = (l2x) this.L$0;
            kb2 kb2Var = this.this$0;
            this.L$0 = l2xVar;
            this.L$1 = kb2Var;
            this.label = 1;
            lq9 lq9Var = new lq9(1, s7s0.c(this));
            lq9Var.o();
            mio0 mio0Var = kb2Var.c;
            oua0 oua0Var = mio0Var.a;
            oua0Var.c();
            mio0Var.b.set(new sio0(mio0Var, oua0Var));
            lq9Var.r(new a(l2xVar, kb2Var));
            if (lq9Var.n() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        throw new KotlinNothingValueException();
    }
}
