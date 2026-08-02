package defpackage;

import androidx.compose.ui.node.LookaheadCapablePlaceable;

/* loaded from: classes.dex */
public final class o3c0 implements n390 {
    public aa10 a;
    public final LookaheadCapablePlaceable b;

    public o3c0(aa10 aa10Var, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.a = aa10Var;
        this.b = lookaheadCapablePlaceable;
    }

    @Override // defpackage.n390
    public final boolean isValidOwnerScope() {
        return this.b.H0().d();
    }
}
