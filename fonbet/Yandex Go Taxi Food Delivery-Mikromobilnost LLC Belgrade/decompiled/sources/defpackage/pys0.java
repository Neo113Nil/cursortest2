package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes5.dex */
public final class pys0 implements wni {
    public final y30 a;
    public final yys0 b;
    public final hwy0 c;
    public final l7s0 w;

    public pys0(y30 y30Var, yys0 yys0Var, hwy0 hwy0Var, l7s0 l7s0Var) {
        this.a = y30Var;
        this.b = yys0Var;
        this.c = hwy0Var;
        this.w = l7s0Var;
    }

    @Override // defpackage.wni
    public final ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView(this.a.a(), null, 0, 6, null);
        composeView.setContent(new a(-1693514193, new oys0(this, composeView, 0), true));
        return composeView;
    }
}
