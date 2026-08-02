package xsna;

import android.content.Context;
import kotlin.collections.EmptyList;
import xsna.pox0;

/* compiled from: WidgetTableView.kt */
/* loaded from: classes17.dex */
public final class vox0 extends i5i {
    public static final float o = 24;
    public final wh50 n;

    public vox0(Context context) {
        super(context, null, 0);
        rmx0 rmx0Var = new rmx0(0);
        EmptyList emptyList = EmptyList.b;
        this.n = androidx.compose.runtime.k.b(new pox0.f(rmx0Var, emptyList, emptyList, 24));
    }

    public static s3q0 B(vox0 vox0Var, androidx.compose.runtime.a aVar, int i) {
        if (aVar.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(47734122, i, -1, "com.vk.community.design.compose.widget.views.WidgetTableView.ThemedContent.<anonymous> (WidgetTableView.kt:29)");
            }
            uox0.f(vox0Var.getState(), vox0Var.getOnOpenUrl(), null, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }

    private final pox0.f getState() {
        return (pox0.f) ((zak0) this.n).getValue();
    }

    private final void setState(pox0.f fVar) {
        ((zak0) this.n).setValue(fVar);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(963279257);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(963279257, i2, -1, "com.vk.community.design.compose.widget.views.WidgetTableView.ThemedContent (WidgetTableView.kt:24)");
            }
            qmx0.a(getState().a, null, getOnOpenUrl(), kai.c(47734122, new b47(this, 13), M), M, 3072, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ce0(this, i, 13);
        }
    }

    @Override // xsna.mmx0
    public final void h(pox0 pox0Var) {
        if (pox0Var instanceof pox0.f) {
            setState((pox0.f) pox0Var);
        }
    }
}
