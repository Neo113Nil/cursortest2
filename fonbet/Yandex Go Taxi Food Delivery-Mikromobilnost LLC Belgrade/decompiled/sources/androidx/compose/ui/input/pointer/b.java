package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import defpackage.d8m;
import defpackage.dai0;
import defpackage.dd11;
import defpackage.e530;
import defpackage.fud;
import defpackage.fwi;
import defpackage.gwd0;
import defpackage.qje;
import defpackage.tls;
import defpackage.tvd0;
import defpackage.wdz;
import defpackage.wvd0;
import defpackage.wyz0;
import defpackage.zvd0;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public abstract class b extends e530 implements dd11, gwd0, fud {
    public d8m a;
    public wvd0 b;
    public boolean c;

    public b(wvd0 wvd0Var, d8m d8mVar) {
        this.a = d8mVar;
        this.b = wvd0Var;
    }

    @Override // defpackage.gwd0
    public final long B() {
        if (this.a == null) {
            return wyz0.a;
        }
        fwi fwiVar = qje.P(this).R;
        int i = wyz0.b;
        return wdz.j(fwiVar.f0(10.0f), fwiVar.f0(40.0f), fwiVar.f0(10.0f), fwiVar.f0(40.0f));
    }

    @Override // defpackage.gwd0
    public final void D() {
        I0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E0() {
        wvd0 wvd0Var;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        dai0.M(this, new tls() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$findOverridingAncestorNode$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((b) obj).getClass();
                return Boolean.TRUE;
            }
        });
        b bVar = (b) ref$ObjectRef.element;
        if (bVar == null || (wvd0Var = bVar.b) == null) {
            wvd0Var = this.b;
        }
        F0(wvd0Var);
    }

    public abstract void F0(wvd0 wvd0Var);

    public final void G0() {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        dai0.O(this, new tls() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                if (!((b) obj).c) {
                    return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                }
                Ref$BooleanRef.this.element = false;
                return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
            }
        });
        if (ref$BooleanRef.element) {
            E0();
        }
    }

    public abstract boolean H0(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public final void I0() {
        if (this.c) {
            this.c = false;
            if (isAttached()) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                dai0.M(this, new tls() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1
                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r3v1, types: [T, androidx.compose.ui.input.pointer.b, java.lang.Object] */
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        ?? r3 = (b) obj;
                        Ref$ObjectRef<b> ref$ObjectRef2 = Ref$ObjectRef.this;
                        b bVar = ref$ObjectRef2.element;
                        if (bVar == null && r3.c) {
                            ref$ObjectRef2.element = r3;
                        } else if (bVar != null) {
                            r3.getClass();
                        }
                        return Boolean.TRUE;
                    }
                });
                b bVar = (b) ref$ObjectRef.element;
                if (bVar != null) {
                    bVar.E0();
                } else {
                    F0(null);
                }
            }
        }
    }

    @Override // defpackage.gwd0
    public final void m0(tvd0 tvd0Var, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            List list = tvd0Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (H0(((zvd0) list.get(i)).i)) {
                    int i2 = tvd0Var.f;
                    if (i2 == 4) {
                        this.c = true;
                        G0();
                        return;
                    } else {
                        if (i2 == 5) {
                            I0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.e530
    public final void onDetach() {
        I0();
    }
}
