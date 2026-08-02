package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: RemovePollAlert.kt */
/* loaded from: classes4.dex */
public final class oxf0 {
    public static final void a(PostingStepScreen postingStepScreen, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-258808364);
        if ((i & 6) == 0) {
            i2 = (M.J(postingStepScreen) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-258808364, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.step2.RemovePollAlert (RemovePollAlert.kt:21)");
            }
            xim ximVar = new xim(false, 4);
            String N = d370.N(R.string.poll_editor_delete_alert_title, 0, M);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new juz(23);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 2);
            String N2 = d370.N(R.string.poll_editor_delete_alert_positive, 0, M);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new oq5(izsVar, 11);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            Alert$Button.Style style = Alert$Button.Style.Neutral;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new jz30(11);
                M.R(x3);
            }
            Alert$Button alert$Button = new Alert$Button(N2, gzsVar, style, com.vk.core.compose.component.semantics.b.a(mode, (izs) x3, 2));
            String N3 = d370.N(R.string.poll_editor_delete_alert_negative, 0, M);
            boolean z2 = i3 == 32;
            Object x4 = M.x();
            if (z2 || x4 == c0012a) {
                x4 = new gr7(izsVar, 7);
                M.R(x4);
            }
            gzs gzsVar2 = (gzs) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new kl60(15);
                M.R(x5);
            }
            Alert$Button alert$Button2 = new Alert$Button(N3, gzsVar2, style, com.vk.core.compose.component.semantics.b.a(mode, (izs) x5, 2));
            q630 E = ahn.E(q630.a.a, "PostingSettingsRemovePollDialog");
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new sux(23);
                M.R(x6);
            }
            p7u0.c(100688304, 64, M, alert$Button, alert$Button2, a, null, N, null, ximVar, (izs) x6, E);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n2f(postingStepScreen, izsVar, i);
        }
    }
}
