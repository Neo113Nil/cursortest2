package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;

/* compiled from: RemoveCoverDialog.kt */
/* loaded from: classes5.dex */
public final class vwf0 {
    public static final void a(izs<? super aiq0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1885750971);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1885750971, i2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.dialog.RemoveCoverDialog (RemoveCoverDialog.kt:9)");
            }
            String N = d370.N(R.string.user_profile_edit_cover_delete_title, 0, M);
            String N2 = d370.N(R.string.user_profile_edit_cover_delete_description, 0, M);
            String N3 = d370.N(R.string.user_profile_edit_delete, 0, M);
            String N4 = d370.N(R.string.user_profile_edit_cancel, 0, M);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new y310(izsVar, 2);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new cc1(izsVar, 8);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            boolean z3 = i3 == 4;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new j750(izsVar, 2);
                M.R(x3);
            }
            aVar2 = M;
            p7u0.e(N, N2, N3, izsVar2, gzsVar, null, N4, null, null, null, null, null, (gzs) x3, aVar2, 0, 0, 4000);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ioa(izsVar, i, 3);
        }
    }
}
