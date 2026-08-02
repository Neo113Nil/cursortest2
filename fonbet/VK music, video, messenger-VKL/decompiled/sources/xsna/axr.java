package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.foa0;

/* compiled from: FocusGroupNode.android.kt */
/* loaded from: classes11.dex */
public final class axr extends ytl implements hr70, nvi {
    public final dxr r;
    public foa0.a s;

    /* compiled from: FocusGroupNode.android.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<xwr, xwr, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(xwr xwrVar, xwr xwrVar2) {
            boolean h;
            xwr xwrVar3 = xwrVar;
            xwr xwrVar4 = xwrVar2;
            axr axrVar = (axr) this.receiver;
            if (axrVar.o && (h = xwrVar4.h()) != xwrVar3.h()) {
                if (h) {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ir70.a(axrVar, new bxr(ref$ObjectRef, axrVar));
                    foa0 foa0Var = (foa0) ref$ObjectRef.element;
                    axrVar.s = foa0Var != null ? foa0Var.a() : null;
                } else {
                    foa0.a aVar = axrVar.s;
                    if (aVar != null) {
                        aVar.release();
                    }
                    axrVar.s = null;
                }
            }
            return s3q0.a;
        }
    }

    public axr() {
        dxr dxrVar = new dxr(new a(2, this, axr.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0), 0, 9);
        i2(dxrVar);
        this.r = dxrVar;
    }

    @Override // xsna.hr70
    public final void D1() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ir70.a(this, new bxr(ref$ObjectRef, this));
        foa0 foa0Var = (foa0) ref$ObjectRef.element;
        if (this.r.k0().h()) {
            foa0.a aVar = this.s;
            if (aVar != null) {
                aVar.release();
            }
            this.s = foa0Var != null ? foa0Var.a() : null;
        }
    }
}
