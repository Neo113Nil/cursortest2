package defpackage;

import androidx.compose.ui.ModifierNodeDetachedCancellationException;
import androidx.compose.ui.node.s;
import androidx.compose.ui.node.v;

/* loaded from: classes.dex */
public abstract class e530 implements cqh {
    public static final int $stable = 8;
    private e530 child;
    private s coordinator;
    private sls detachedListener;
    private boolean insertedNodeAwaitingAttachForInvalidation;
    private boolean isAttached;
    private int kindSet;
    private boolean onAttachRunExpected;
    private boolean onDetachRunExpected;
    private v ownerScope;
    private e530 parent;
    private tse scope;
    private boolean updatedNodeAwaitingAttachForInvalidation;
    private e530 node = this;
    private int aggregateChildKindSet = -1;

    public static /* synthetic */ void getNode$annotations() {
    }

    public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
    }

    public final int getAggregateChildKindSet$ui() {
        return this.aggregateChildKindSet;
    }

    public final e530 getChild$ui() {
        return this.child;
    }

    public final s getCoordinator$ui() {
        return this.coordinator;
    }

    public final tse getCoroutineScope() {
        tse tseVar = this.scope;
        if (tseVar != null) {
            return tseVar;
        }
        ike a = bvf0.a(qje.Q(this).getCoroutineContext().plus(new s8x((l8x) qje.Q(this).getCoroutineContext().get(seu.C))));
        this.scope = a;
        return a;
    }

    public final sls getDetachedListener$ui() {
        return this.detachedListener;
    }

    public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui() {
        return this.insertedNodeAwaitingAttachForInvalidation;
    }

    public final int getKindSet$ui() {
        return this.kindSet;
    }

    @Override // defpackage.cqh
    public final e530 getNode() {
        return this.node;
    }

    public final v getOwnerScope$ui() {
        return this.ownerScope;
    }

    public final e530 getParent$ui() {
        return this.parent;
    }

    public boolean getShouldAutoInvalidate() {
        return true;
    }

    public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui() {
        return this.updatedNodeAwaitingAttachForInvalidation;
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    /* renamed from: isKind-H91voCI$ui, reason: not valid java name */
    public final boolean m481isKindH91voCI$ui(int i) {
        return (getKindSet$ui() & i) != 0;
    }

    public boolean isValidOwnerScope() {
        return isAttached();
    }

    public void markAsAttached$ui() {
        if (this.isAttached) {
            ixv.b("node attached multiple times");
        }
        if (!(this.coordinator != null)) {
            ixv.b("attach invoked on a node without a coordinator");
        }
        this.isAttached = true;
        this.onAttachRunExpected = true;
    }

    public void markAsDetached$ui() {
        if (!this.isAttached) {
            ixv.b("Cannot detach a node that is not attached");
        }
        if (this.onAttachRunExpected) {
            ixv.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.onDetachRunExpected) {
            ixv.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.isAttached = false;
        tse tseVar = this.scope;
        if (tseVar != null) {
            bvf0.j(tseVar, new ModifierNodeDetachedCancellationException());
            this.scope = null;
        }
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onReset() {
    }

    public void reset$ui() {
        if (!this.isAttached) {
            ixv.b("reset() called on an unattached node");
        }
        onReset();
    }

    public void runAttachLifecycle$ui() {
        if (!this.isAttached) {
            ixv.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.onAttachRunExpected) {
            ixv.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.onAttachRunExpected = false;
        onAttach();
        this.onDetachRunExpected = true;
    }

    public void runDetachLifecycle$ui() {
        if (!this.isAttached) {
            ixv.b("node detached multiple times");
        }
        if (this.coordinator == null) {
            ixv.b("detach invoked on a node without a coordinator");
        }
        if (!this.onDetachRunExpected) {
            ixv.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.onDetachRunExpected = false;
        sls slsVar = this.detachedListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
        onDetach();
    }

    public final void setAggregateChildKindSet$ui(int i) {
        this.aggregateChildKindSet = i;
    }

    public void setAsDelegateTo$ui(e530 e530Var) {
        this.node = e530Var;
    }

    public final void setChild$ui(e530 e530Var) {
        this.child = e530Var;
    }

    public final void setDetachedListener$ui(sls slsVar) {
        this.detachedListener = slsVar;
    }

    public final void setInsertedNodeAwaitingAttachForInvalidation$ui(boolean z) {
        this.insertedNodeAwaitingAttachForInvalidation = z;
    }

    public final void setKindSet$ui(int i) {
        this.kindSet = i;
    }

    public final void setOwnerScope$ui(v vVar) {
        this.ownerScope = vVar;
    }

    public final void setParent$ui(e530 e530Var) {
        this.parent = e530Var;
    }

    public final void setUpdatedNodeAwaitingAttachForInvalidation$ui(boolean z) {
        this.updatedNodeAwaitingAttachForInvalidation = z;
    }

    public final void sideEffect(sls slsVar) {
        qje.Q(this).registerOnEndApplyChangesListener(slsVar);
    }

    public void updateCoordinator$ui(s sVar) {
        this.coordinator = sVar;
    }
}
