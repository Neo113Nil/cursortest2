package xsna;

import android.annotation.SuppressLint;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;
import xsna.pox0;
import xsna.q630;

/* compiled from: WidgetList.kt */
/* loaded from: classes17.dex */
public final class inx0 {
    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    public static final void a(int i, androidx.compose.runtime.a aVar, List list, izs izsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-847836713);
        int i2 = 4;
        int i3 = (M.J(list != null ? new wow(list) : null) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-847836713, i3, -1, "com.vk.community.design.compose.widget.list.WidgetList (WidgetList.kt:33)");
            }
            wow wowVar = list != null ? new wow(list) : null;
            if (wowVar == null || wowVar.b.isEmpty()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new lug(list, izsVar, i, i2);
                    return;
                }
                return;
            }
            int size = list.size();
            q630.a aVar2 = q630.a.a;
            if (size > 1) {
                M.K(799498119);
                ua8.a(null, null, false, kai.c(1580760831, new ofo(3, list, izsVar), M), M, 3072, 7);
                M = M;
                M.j();
            } else {
                M.K(800041394);
                pox0.b.C3524b c3524b = (pox0.b.C3524b) j5g.a0(new wow(list));
                if (c3524b == null) {
                    M.K(800070998);
                    M.j();
                } else {
                    M.K(800070999);
                    hnx0.b(c3524b, true, txj0.f(ahn.E(aVar2, "CommunityProfileWidgetBanner"), 1.0f), izsVar, M, ((i3 << 6) & 7168) | Tensorflow.FRAME_WIDTH);
                    M.j();
                    s3q0 s3q0Var = s3q0.a;
                }
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new ss0(i, 6, list, izsVar, q630Var2);
        }
    }
}
