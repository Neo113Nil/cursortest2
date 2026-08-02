package xsna;

import androidx.compose.runtime.a;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.publicationdate.PublicationDateDialogViewState;
import com.vkontakte.android.R;
import java.util.Date;
import xsna.q630;

/* compiled from: PublicationDateDialog.kt */
/* loaded from: classes7.dex */
public final class bbe0 {
    public static final void a(PublicationDateDialogViewState publicationDateDialogViewState, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-466800668);
        int i2 = i | (M.J(publicationDateDialogViewState) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-466800668, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.dialog.publicationdate.PublicationDateDialog (PublicationDateDialog.kt:20)");
            }
            String N = d370.N(R.string.publication_date_dialog_title, 0, M);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new byb(izsVar, 2);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new u620(19);
                M.R(x2);
            }
            com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3);
            Date date = publicationDateDialogViewState.b;
            Date date2 = publicationDateDialogViewState.c;
            Date date3 = publicationDateDialogViewState.d;
            boolean z2 = i3 == 32;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new cr0(izsVar, 8);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            boolean z3 = i3 == 32;
            Object x4 = M.x();
            if (z3 || x4 == c0012a) {
                x4 = new v67(izsVar, 6);
                M.R(x4);
            }
            q630.a aVar2 = q630.a.a;
            eyk.a(N, izsVar2, aVar2, a, date, date2, date3, gzsVar, (gzs) x4, M, 384, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cr7(i, 12, publicationDateDialogViewState, izsVar, q630Var2);
        }
    }
}
