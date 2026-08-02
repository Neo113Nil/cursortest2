package defpackage;

import androidx.compose.ui.node.s;

/* loaded from: classes.dex */
public abstract class lqh extends e530 {
    public final int a = ce60.f(this);
    public e530 b;

    public final void E0(cqh cqhVar) {
        e530 node = cqhVar.getNode();
        if (node != cqhVar) {
            e530 e530Var = cqhVar instanceof e530 ? (e530) cqhVar : null;
            e530 parent$ui = e530Var != null ? e530Var.getParent$ui() : null;
            if (node == getNode() && jl40.l(parent$ui, this)) {
                return;
            }
            ny61.r("Cannot delegate to an already delegated node");
            return;
        }
        if (node.isAttached()) {
            ixv.b("Cannot delegate to an already attached node");
        }
        node.setAsDelegateTo$ui(getNode());
        int kindSet$ui = getKindSet$ui();
        int g = ce60.g(node);
        node.setKindSet$ui(g);
        int kindSet$ui2 = getKindSet$ui();
        int i = g & 2;
        if (i != 0 && (kindSet$ui2 & 2) != 0 && !(this instanceof v0y)) {
            ixv.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node);
        }
        node.setChild$ui(this.b);
        this.b = node;
        node.setParent$ui(this);
        G0(g | getKindSet$ui(), false);
        if (isAttached()) {
            if (i == 0 || (kindSet$ui & 2) != 0) {
                updateCoordinator$ui(getCoordinator$ui());
            } else {
                t300 t300Var = qje.P(this).a0;
                getNode().updateCoordinator$ui(null);
                t300Var.h();
            }
            node.markAsAttached$ui();
            node.runAttachLifecycle$ui();
            ce60.a(node);
        }
    }

    public final void F0(cqh cqhVar) {
        e530 e530Var = null;
        for (e530 e530Var2 = this.b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
            if (e530Var2 == cqhVar) {
                if (e530Var2.isAttached()) {
                    qy40 qy40Var = ce60.a;
                    if (!e530Var2.isAttached()) {
                        ixv.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    ce60.b(e530Var2, -1, 2);
                    e530Var2.runDetachLifecycle$ui();
                    e530Var2.markAsDetached$ui();
                }
                e530Var2.setAsDelegateTo$ui(e530Var2);
                e530Var2.setAggregateChildKindSet$ui(0);
                if (e530Var == null) {
                    this.b = e530Var2.getChild$ui();
                } else {
                    e530Var.setChild$ui(e530Var2.getChild$ui());
                }
                e530Var2.setChild$ui(null);
                e530Var2.setParent$ui(null);
                int kindSet$ui = getKindSet$ui();
                int g = ce60.g(this);
                G0(g, true);
                if (isAttached() && (kindSet$ui & 2) != 0 && (g & 2) == 0) {
                    t300 t300Var = qje.P(this).a0;
                    getNode().updateCoordinator$ui(null);
                    t300Var.h();
                    return;
                }
                return;
            }
            e530Var = e530Var2;
        }
        yhl.d(cqhVar, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [e530] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void G0(int i, boolean z) {
        e530 child$ui;
        int kindSet$ui = getKindSet$ui();
        setKindSet$ui(i);
        if (kindSet$ui != i) {
            if (getNode() == this) {
                setAggregateChildKindSet$ui(i);
            }
            if (isAttached()) {
                e530 node = getNode();
                ?? r2 = this;
                while (r2 != 0) {
                    i |= r2.getKindSet$ui();
                    r2.setKindSet$ui(i);
                    if (r2 == node) {
                        break;
                    } else {
                        r2 = r2.getParent$ui();
                    }
                }
                if (z && r2 == node) {
                    i = ce60.g(node);
                    node.setKindSet$ui(i);
                }
                int aggregateChildKindSet$ui = i | ((r2 == 0 || (child$ui = r2.getChild$ui()) == null) ? 0 : child$ui.getAggregateChildKindSet$ui());
                for (e530 e530Var = r2; e530Var != null; e530Var = e530Var.getParent$ui()) {
                    aggregateChildKindSet$ui |= e530Var.getKindSet$ui();
                    e530Var.setAggregateChildKindSet$ui(aggregateChildKindSet$ui);
                }
            }
        }
    }

    @Override // defpackage.e530
    public final void markAsAttached$ui() {
        super.markAsAttached$ui();
        for (e530 e530Var = this.b; e530Var != null; e530Var = e530Var.getChild$ui()) {
            e530Var.updateCoordinator$ui(getCoordinator$ui());
            if (!e530Var.isAttached()) {
                e530Var.markAsAttached$ui();
            }
        }
    }

    @Override // defpackage.e530
    public final void markAsDetached$ui() {
        for (e530 e530Var = this.b; e530Var != null; e530Var = e530Var.getChild$ui()) {
            e530Var.markAsDetached$ui();
        }
        super.markAsDetached$ui();
    }

    @Override // defpackage.e530
    public final void reset$ui() {
        super.reset$ui();
        for (e530 e530Var = this.b; e530Var != null; e530Var = e530Var.getChild$ui()) {
            e530Var.reset$ui();
        }
    }

    @Override // defpackage.e530
    public final void runAttachLifecycle$ui() {
        for (e530 e530Var = this.b; e530Var != null; e530Var = e530Var.getChild$ui()) {
            e530Var.runAttachLifecycle$ui();
        }
        super.runAttachLifecycle$ui();
    }

    @Override // defpackage.e530
    public final void runDetachLifecycle$ui() {
        super.runDetachLifecycle$ui();
        for (e530 e530Var = this.b; e530Var != null; e530Var = e530Var.getChild$ui()) {
            e530Var.runDetachLifecycle$ui();
        }
    }

    @Override // defpackage.e530
    public final void setAsDelegateTo$ui(e530 e530Var) {
        super.setAsDelegateTo$ui(e530Var);
        for (e530 e530Var2 = this.b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
            e530Var2.setAsDelegateTo$ui(e530Var);
        }
    }

    @Override // defpackage.e530
    public final void updateCoordinator$ui(s sVar) {
        super.updateCoordinator$ui(sVar);
        for (e530 e530Var = this.b; e530Var != null; e530Var = e530Var.getChild$ui()) {
            e530Var.updateCoordinator$ui(sVar);
        }
    }
}
