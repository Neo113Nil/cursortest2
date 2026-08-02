package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;

/* compiled from: SheetDefaults.kt */
/* loaded from: classes11.dex */
public final class bdj0 {
    public static final dtp0 a = jq2.d(300, 0, luo.a, 2);

    public static final void a(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(1033612924);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1033612924, i, -1, "androidx.compose.material3.DragHandleWithTooltip (SheetDefaults.kt:432)");
            }
            String b = e7b0.b(R.string.m3c_bottom_sheet_drag_handle_description, M);
            dt1.a.getClass();
            gcv gcvVar = new gcv(dt1.a.o);
            cp10 d = ja8.d(dt1.a.b, false);
            int m = n34.m(M);
            sy90 D = M.D();
            q630 c = qri.c(M, gcvVar);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m))) {
                kr.a(m, M, m, bVar);
            }
            k9q0.w(M, c, cri.a.d);
            jaiVar2 = jaiVar;
            x5p0.b(f5p0.a(M), kai.c(2059851063, new adj0(b), M), x5p0.c(M), null, false, jaiVar2, M, 100663344);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vcj0(i, jaiVar2);
        }
    }
}
