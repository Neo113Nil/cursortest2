package xsna;

import androidx.compose.foundation.gestures.Orientation;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.q630;

/* compiled from: LazyLayoutSemantics.kt */
/* loaded from: classes11.dex */
public final class puy extends q630.c implements fgi0 {
    public gzs<? extends androidx.compose.foundation.lazy.layout.b> p;
    public luy q;
    public Orientation r;
    public boolean s;
    public qeh0 t;
    public final bbw u = new bbw(this, 1);
    public bzw v;

    /* compiled from: LazyLayoutSemantics.kt */
    @b6l(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", l = {Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ int $index;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$index = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return puy.this.new a(this.$index, spjVar);
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
                luy luyVar = puy.this.q;
                int i2 = this.$index;
                this.label = 1;
                if (luyVar.f(i2, this) == coroutineSingletons) {
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

    public puy(gzs gzsVar, luy luyVar, Orientation orientation, boolean z) {
        this.p = gzsVar;
        this.q = luyVar;
        this.r = orientation;
        this.s = z;
        i2();
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    public final void i2() {
        this.t = new qeh0(new sim(this, 14), new atm(this, 15));
        this.v = this.s ? new bzw(this, 1) : null;
    }

    @Override // xsna.fgi0
    public final void l1(tgi0 tgi0Var) {
        qgi0.u(tgi0Var);
        tgi0Var.a(ngi0.N, this.u);
        if (this.r == Orientation.Vertical) {
            qeh0 qeh0Var = this.t;
            if (qeh0Var == null) {
                qeh0Var = null;
            }
            sgi0<qeh0> sgi0Var = ngi0.w;
            qcy<Object> qcyVar = qgi0.a[13];
            tgi0Var.a(sgi0Var, qeh0Var);
        } else {
            qeh0 qeh0Var2 = this.t;
            if (qeh0Var2 == null) {
                qeh0Var2 = null;
            }
            sgi0<qeh0> sgi0Var2 = ngi0.v;
            qcy<Object> qcyVar2 = qgi0.a[12];
            tgi0Var.a(sgi0Var2, qeh0Var2);
        }
        bzw bzwVar = this.v;
        if (bzwVar != null) {
            tgi0Var.a(wfi0.f, new ck(null, bzwVar));
        }
        tgi0Var.a(wfi0.C, new ck(null, new pgi0(new btm(this, 18))));
        q4g c = this.q.c();
        sgi0<q4g> sgi0Var3 = ngi0.f;
        qcy<Object> qcyVar3 = qgi0.a[24];
        tgi0Var.a(sgi0Var3, c);
    }
}
