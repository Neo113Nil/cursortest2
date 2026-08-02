package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.eyx;
import xsna.foa0;
import xsna.zc;

/* compiled from: Focusable.kt */
/* loaded from: classes11.dex */
public final class nxr extends ytl implements fgi0, o1u, nvi, hr70, npp0 {
    public static final a x = new a();
    public sg50 r;
    public final izs<Boolean, s3q0> s;
    public pvr t;
    public foa0.a u;
    public tny v;
    public final cxr w;

    /* compiled from: Focusable.kt */
    public static final class a {
    }

    /* compiled from: Focusable.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(((nxr) this.receiver).w.v1(7));
        }
    }

    /* compiled from: Focusable.kt */
    @b6l(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", l = {Sdk.SDKError.Reason.MRAID_UNRECOGNIZED_COMMAND_VALUE}, m = "invokeSuspend", v = 1)
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ ogn $handler;
        final /* synthetic */ vax $interaction;
        final /* synthetic */ sg50 $this_emitWithFallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(sg50 sg50Var, vax vaxVar, ogn ognVar, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$this_emitWithFallback = sg50Var;
            this.$interaction = vaxVar;
            this.$handler = ognVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$this_emitWithFallback, this.$interaction, this.$handler, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                sg50 sg50Var = this.$this_emitWithFallback;
                vax vaxVar = this.$interaction;
                this.label = 1;
                if (sg50Var.a(vaxVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            ogn ognVar = this.$handler;
            if (ognVar != null) {
                ognVar.dispose();
            }
            return s3q0.a;
        }
    }

    public nxr() {
        throw null;
    }

    public nxr(sg50 sg50Var, int i, zc.b bVar) {
        this.r = sg50Var;
        this.s = bVar;
        dxr dxrVar = new dxr(new cog(2, this, nxr.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 1), i, 10);
        i2(dxrVar);
        this.w = dxrVar;
    }

    @Override // xsna.hr70
    public final void D1() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ir70.a(this, new u14(ref$ObjectRef, this));
        foa0 foa0Var = (foa0) ref$ObjectRef.element;
        if (this.w.k0().h()) {
            foa0.a aVar = this.u;
            if (aVar != null) {
                aVar.release();
            }
            this.u = foa0Var != null ? foa0Var.a() : null;
        }
    }

    @Override // xsna.o1u
    public final void T1(androidx.compose.ui.node.o oVar) {
        this.v = oVar;
        if (this.w.k0().h()) {
            if (!oVar.D1().o) {
                if (m2() != null) {
                    throw null;
                }
                return;
            }
            tny tnyVar = this.v;
            if (tnyVar != null && tnyVar.e() && m2() != null) {
                throw null;
            }
        }
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.q630.c
    public final void c2() {
        foa0.a aVar = this.u;
        if (aVar != null) {
            aVar.release();
        }
        this.u = null;
    }

    @Override // xsna.npp0
    public final Object g0() {
        return x;
    }

    @Override // xsna.fgi0
    public final void l1(tgi0 tgi0Var) {
        boolean h = this.w.k0().h();
        qcy<Object>[] qcyVarArr = qgi0.a;
        sgi0<Boolean> sgi0Var = ngi0.l;
        qcy<Object> qcyVar = qgi0.a[4];
        tgi0Var.a(sgi0Var, Boolean.valueOf(h));
        tgi0Var.a(wfi0.w, new ck(null, new b(0, this, nxr.class, "requestFocus", "requestFocus()Z", 0)));
    }

    public final void l2(sg50 sg50Var, vax vaxVar) {
        if (!this.o) {
            sg50Var.c(vaxVar);
        } else {
            eyx eyxVar = (eyx) ((hpj) W1()).b.get(eyx.a.b);
            myc0.h(W1(), null, null, new c(sg50Var, vaxVar, eyxVar != null ? eyxVar.E(new np5(10, sg50Var, vaxVar)) : null, null), 3);
        }
    }

    public final pxr m2() {
        if (!this.o) {
            return null;
        }
        npp0 u = hr80.u(this, pxr.p);
        if (u instanceof pxr) {
            return (pxr) u;
        }
        return null;
    }

    public final void n2(sg50 sg50Var) {
        pvr pvrVar;
        if (epx.f(this.r, sg50Var)) {
            return;
        }
        sg50 sg50Var2 = this.r;
        if (sg50Var2 != null && (pvrVar = this.t) != null) {
            sg50Var2.c(new qvr(pvrVar));
        }
        this.t = null;
        this.r = sg50Var;
    }
}
