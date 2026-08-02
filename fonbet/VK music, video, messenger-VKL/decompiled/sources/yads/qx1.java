package yads;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.lq9;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class qx1 extends SuspendLambda implements wzs {
    public int b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ pk1 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ rx1 f;
    public final /* synthetic */ v9 g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx1(Context context, pk1 pk1Var, String str, rx1 rx1Var, v9 v9Var, boolean z, spj spjVar) {
        super(2, spjVar);
        this.c = context;
        this.d = pk1Var;
        this.e = str;
        this.f = rx1Var;
        this.g = v9Var;
        this.h = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj create(Object obj, spj spjVar) {
        return new qx1(this.c, this.d, this.e, this.f, this.g, this.h, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((qx1) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zo3 zo3Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.a.a(obj);
            tx1 a = tx1.c.a(this.c);
            if (a.b.size() != a.a) {
                if (!a.b.containsKey(this.d) && this.e != null) {
                    gt2 gt2Var = this.f.a;
                    Context context = this.c;
                    String str = this.g.G;
                    if (str != null) {
                        zo3.c.getClass();
                        zo3Var = (zo3) zo3.d.get(str);
                        if (zo3Var == null) {
                            zo3Var = zo3.e;
                        }
                    } else {
                        zo3Var = zo3.e;
                    }
                    xo3 xo3Var = new xo3(zo3Var);
                    gt2Var.getClass();
                    ix1 ix1Var = null;
                    try {
                        ix1Var = new ix1(context, xo3Var, null);
                    } catch (Throwable unused) {
                    }
                    if (ix1Var == null) {
                        return s3q0.a;
                    }
                    pk1 pk1Var = this.d;
                    String str2 = this.e;
                    boolean z = this.h;
                    this.b = 1;
                    lq9 lq9Var = new lq9(1, s7s0.c(this));
                    lq9Var.o();
                    ox1 ox1Var = new ox1(a, pk1Var, new px1(z, lq9Var));
                    if (a.b.size() < a.a) {
                        a.b.put(pk1Var, ix1Var);
                    }
                    ix1Var.a(str2, ox1Var);
                    if (!z && lq9Var.isActive()) {
                        lq9Var.resumeWith(s3q0.a);
                    }
                    Object n = lq9Var.n();
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (n == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return s3q0.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        return s3q0.a;
    }
}
