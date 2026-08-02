package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cdp0;
import xsna.q630;

/* compiled from: PointerIcon.kt */
/* loaded from: classes11.dex */
public abstract class jgv extends q630.c implements npp0, cmb0, nvi {
    public vco p;
    public ulb0 q;
    public boolean r;

    /* compiled from: PointerIcon.kt */
    public static final class a extends Lambda implements izs<jgv, TraversableNode$Companion$TraverseDescendantsAction> {
        final /* synthetic */ Ref$BooleanRef $hasIconRightsOverDescendants;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref$BooleanRef ref$BooleanRef) {
            super(1);
            this.$hasIconRightsOverDescendants = ref$BooleanRef;
        }

        @Override // xsna.izs
        public final TraversableNode$Companion$TraverseDescendantsAction invoke(jgv jgvVar) {
            if (!jgvVar.r) {
                return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
            }
            this.$hasIconRightsOverDescendants.element = false;
            return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
        }
    }

    public jgv(ulb0 ulb0Var, vco vcoVar) {
        this.p = vcoVar;
        this.q = ulb0Var;
    }

    @Override // xsna.cmb0
    public final void H(plb0 plb0Var, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            List<xlb0> list = plb0Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (l2(list.get(i).i)) {
                    int i2 = plb0Var.f;
                    if (i2 == 4) {
                        this.r = true;
                        k2();
                        return;
                    } else {
                        if (i2 == 5) {
                            m2();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // xsna.q630.c
    public final void b2() {
        m2();
    }

    @Override // xsna.cmb0
    public final long c1() {
        vco vcoVar = this.p;
        if (vcoVar == null) {
            return cdp0.a;
        }
        azl azlVar = itl.f(this).z;
        int i = cdp0.b;
        return cdp0.a.b(azlVar.r0(vcoVar.a), azlVar.r0(vcoVar.b), azlVar.r0(vcoVar.c), azlVar.r0(vcoVar.d));
    }

    @Override // xsna.cmb0
    public final void h1() {
        m2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i2() {
        ulb0 ulb0Var;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        hr80.I(this, new kgv(ref$ObjectRef));
        jgv jgvVar = (jgv) ref$ObjectRef.element;
        if (jgvVar == null || (ulb0Var = jgvVar.q) == null) {
            ulb0Var = this.q;
        }
        j2(ulb0Var);
    }

    public abstract void j2(ulb0 ulb0Var);

    public final void k2() {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        hr80.K(this, new a(ref$BooleanRef));
        if (ref$BooleanRef.element) {
            i2();
        }
    }

    public abstract boolean l2(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public final void m2() {
        if (this.r) {
            this.r = false;
            if (this.o) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                hr80.I(this, new igv(ref$ObjectRef));
                jgv jgvVar = (jgv) ref$ObjectRef.element;
                if (jgvVar != null) {
                    jgvVar.i2();
                } else {
                    j2(null);
                }
            }
        }
    }
}
