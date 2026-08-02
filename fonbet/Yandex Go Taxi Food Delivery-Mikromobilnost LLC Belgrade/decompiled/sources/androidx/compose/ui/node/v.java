package androidx.compose.ui.node;

import defpackage.dr60;
import defpackage.n390;
import defpackage.tls;

/* loaded from: classes10.dex */
public final class v implements n390 {
    public static final tls b = null;
    public final dr60 a;

    public v(dr60 dr60Var) {
        this.a = dr60Var;
    }

    @Override // defpackage.n390
    public final boolean isValidOwnerScope() {
        return this.a.getNode().isAttached();
    }
}
