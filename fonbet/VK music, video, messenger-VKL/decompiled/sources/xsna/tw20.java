package xsna;

import android.content.Context;
import android.view.Window;

/* compiled from: ModalBottomSheet.android.kt */
/* loaded from: classes11.dex */
public final class tw20 extends td implements omm {
    public final Window l;
    public final wh50 m;
    public boolean n;

    public tw20(Context context, Window window) {
        super(context, null, 6, 0);
        this.l = window;
        this.m = androidx.compose.runtime.k.b(phi.a);
    }

    @Override // xsna.td
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.n;
    }

    @Override // xsna.omm
    public final Window getWindow() {
        return this.l;
    }

    @Override // xsna.td
    public final void o(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(576708319);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(576708319, i2, -1, "androidx.compose.material3.ModalBottomSheetDialogLayout.Content (ModalBottomSheet.android.kt:437)");
            }
            ((wzs) ((zak0) this.m).getValue()).invoke(M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new no3(this, i, 4);
        }
    }
}
