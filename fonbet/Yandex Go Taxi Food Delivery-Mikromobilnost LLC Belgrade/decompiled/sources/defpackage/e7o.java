package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes5.dex */
public final class e7o implements wni {
    public final y30 a;
    public final hwy0 b;
    public final dci c;
    public final g7o w;

    public e7o(y30 y30Var, hwy0 hwy0Var, dci dciVar, g7o g7oVar) {
        this.a = y30Var;
        this.b = hwy0Var;
        this.c = dciVar;
        this.w = g7oVar;
    }

    @Override // defpackage.wni
    public final ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView(this.a.a(), null, 0, 6, null);
        composeView.setContent(new a(1591452931, new d7o(this, 0), true));
        return composeView;
    }
}
