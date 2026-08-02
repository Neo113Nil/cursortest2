package defpackage;

import androidx.compose.ui.focus.d;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes11.dex */
public abstract class m6b1 {
    public static mgv a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.Object, z4y] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Object, z4y] */
    public static final Object b(d dVar, int i, tls tlsVar) {
        int i2;
        int i3;
        Object obj;
        e530 e530Var;
        ko5 I0;
        f5y f5yVar;
        t300 t300Var;
        if (!dVar.getNode().isAttached()) {
            ixv.b("visitAncestors called on an unattached node");
        }
        e530 parent$ui = dVar.getNode().getParent$ui();
        LayoutNode P = qje.P(dVar);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            obj = null;
            if (P == null) {
                e530Var = null;
                break;
            }
            if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 1024) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                        e530Var = parent$ui;
                        wz40 wz40Var = null;
                        while (e530Var != null) {
                            if (e530Var instanceof d) {
                                break loop0;
                            }
                            if ((e530Var.getKindSet$ui() & 1024) != 0 && (e530Var instanceof lqh)) {
                                int i4 = 0;
                                for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                    if ((e530Var2.getKindSet$ui() & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            e530Var = e530Var2;
                                        } else {
                                            if (wz40Var == null) {
                                                wz40Var = new wz40(new e530[16]);
                                            }
                                            if (e530Var != null) {
                                                wz40Var.b(e530Var);
                                                e530Var = null;
                                            }
                                            wz40Var.b(e530Var2);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            e530Var = qje.c(wz40Var);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            P = P.s();
            parent$ui = (P == null || (t300Var = P.a0) == null) ? null : (v7x0) t300Var.f;
        }
        d dVar2 = (d) e530Var;
        if ((dVar2 == null || !jl40.l(dVar2.I0(), dVar.I0())) && (I0 = dVar.I0()) != null) {
            int i5 = 5;
            if (i != 5) {
                i5 = 6;
                if (i != 6) {
                    i5 = 3;
                    if (i != 3) {
                        i5 = 4;
                        if (i != 4) {
                            if (i == 1) {
                                i3 = 2;
                            } else if (i != 2) {
                                ny61.r("Unsupported direction for beyond bounds layout");
                            }
                            f5yVar = (f5y) I0;
                            if (f5yVar.a.getItemCount() > 0 || !f5yVar.a.c() || !f5yVar.isAttached()) {
                                return tlsVar.invoke(f5y.w);
                            }
                            boolean F0 = f5yVar.F0(i3);
                            g5y g5yVar = f5yVar.a;
                            int d = F0 ? g5yVar.d() : g5yVar.b();
                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            a5y a5yVar = f5yVar.b;
                            a5yVar.getClass();
                            ?? z4yVar = new z4y(d, d);
                            a5yVar.a.b(z4yVar);
                            ref$ObjectRef.element = z4yVar;
                            int a2 = f5yVar.a.a() * 2;
                            int itemCount = f5yVar.a.getItemCount();
                            if (a2 > itemCount) {
                                a2 = itemCount;
                            }
                            while (obj == null && f5yVar.E0((z4y) ref$ObjectRef.element, i3) && i2 < a2) {
                                z4y z4yVar2 = (z4y) ref$ObjectRef.element;
                                int i6 = z4yVar2.a;
                                int i7 = z4yVar2.b;
                                if (f5yVar.F0(i3)) {
                                    i7++;
                                } else {
                                    i6--;
                                }
                                a5y a5yVar2 = f5yVar.b;
                                a5yVar2.getClass();
                                ?? z4yVar3 = new z4y(i6, i7);
                                a5yVar2.a.b(z4yVar3);
                                f5yVar.b.a.j((z4y) ref$ObjectRef.element);
                                ref$ObjectRef.element = z4yVar3;
                                i2++;
                                qje.P(f5yVar).h();
                                obj = tlsVar.invoke(new e5y(f5yVar, ref$ObjectRef, i3));
                            }
                            f5yVar.b.a.j((z4y) ref$ObjectRef.element);
                            qje.P(f5yVar).h();
                            return obj;
                        }
                    }
                }
            }
            i3 = i5;
            f5yVar = (f5y) I0;
            if (f5yVar.a.getItemCount() > 0) {
            }
            return tlsVar.invoke(f5y.w);
        }
        return null;
    }
}
