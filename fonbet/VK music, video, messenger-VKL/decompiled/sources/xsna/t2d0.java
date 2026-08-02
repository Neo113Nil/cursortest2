package xsna;

import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.q630;

/* compiled from: FeedFooter.kt */
/* loaded from: classes18.dex */
public final class t2d0 extends q630.c implements noy {
    public wax p;
    public float q;
    public int r;
    public final if2<Float, sq2> s = qf2.a(1.0f);
    public yok0 t;

    /* compiled from: FeedFooter.kt */
    @b6l(c = "com.vk.feed.design.compose.newsfeed.footer.PressScaleNode$onAttach$1", f = "FeedFooter.kt", l = {849}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return t2d0.this.new a(spjVar);
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
                t2d0 t2d0Var = t2d0.this;
                this.label = 1;
                if (t2d0.i2(t2d0Var, this) == coroutineSingletons) {
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

    public t2d0(wax waxVar, float f, int i) {
        this.p = waxVar;
        this.q = f;
        this.r = i;
    }

    public static final Object i2(t2d0 t2d0Var, SuspendLambda suspendLambda) {
        t2d0Var.getClass();
        ArrayList arrayList = new ArrayList();
        caj0 b = t2d0Var.p.b();
        s2d0 s2d0Var = new s2d0(arrayList, t2d0Var);
        b.getClass();
        CoroutineSingletons k = caj0.k(b, s2d0Var, suspendLambda);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }

    @Override // xsna.q630.c
    public final void a2() {
        this.t = myc0.h(W1(), null, null, new a(null), 3);
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        tra0 N = zo10Var.N(j);
        return ep10Var.Q(N.b, N.c, jgp.b, new mp3(27, N, this));
    }
}
