package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import com.ybsdk.feature.savings.internal.screens.dashboard.delegates.b;

/* loaded from: classes3.dex */
public final class cbm0 extends GridLayoutManager.b {
    public final /* synthetic */ b d;

    public cbm0(b bVar) {
        this.d = bVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public final int c(int i) {
        qa3 qa3Var = this.d.d;
        return ((qa3Var.b.f.get(i) instanceof fam0) || (qa3Var.b.f.get(i) instanceof scm0)) ? 1 : 2;
    }
}
