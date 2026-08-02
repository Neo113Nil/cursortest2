package defpackage;

import androidx.compose.ui.semantics.g;

/* loaded from: classes10.dex */
public final class n82 implements mnq0 {
    public boolean a;
    public final /* synthetic */ ehr0 b;

    public n82(ehr0 ehr0Var) {
        this.b = ehr0Var;
    }

    @Override // defpackage.mnq0
    public final void a(g gVar, Object obj) {
        if (obj == this.b) {
            this.a = true;
        }
    }

    public final boolean b() {
        return this.a;
    }
}
