package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: PollEditorNavigatorSubBackStack.kt */
/* loaded from: classes4.dex */
public final class uob0 {
    public static final void a(gzs gzsVar, gzs gzsVar2, androidx.compose.runtime.a aVar, int i) {
        String str;
        androidx.compose.runtime.a M = aVar.M(-1187970625);
        int i2 = i | (M.y(gzsVar) ? 4 : 2) | (M.y(gzsVar2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1187970625, i2, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.ExitPollEditorAlert (PollEditorNavigatorSubBackStack.kt:56)");
            }
            q630 E = ahn.E(q630.a.a, "PollExitDialog");
            xim ximVar = new xim(true, 4);
            String N = d370.N(R.string.poll_editor_exit_alert_title, 0, M);
            String N2 = d370.N(R.string.poll_editor_exit_alert_message, 0, M);
            String N3 = d370.N(R.string.poll_editor_exit_alert_positive, 0, M);
            String N4 = d370.N(R.string.poll_editor_exit_alert_negative, 0, M);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new e420(11);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 2);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new s6x(19);
                M.R(x2);
            }
            com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new ev60(4);
                M.R(x3);
            }
            com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x3, 2);
            Object x4 = M.x();
            if (x4 == c0012a) {
                str = N;
                x4 = new amp(20);
                M.R(x4);
            } else {
                str = N;
            }
            com.vk.core.compose.component.semantics.a a4 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x4, 2);
            boolean z = (i2 & 112) == 32;
            Object x5 = M.x();
            if (z || x5 == c0012a) {
                x5 = new dix(1, gzsVar2);
                M.R(x5);
            }
            p7u0.e(str, N2, N3, (izs) x5, gzsVar, E, N4, a, a2, a3, a4, ximVar, gzsVar2, M, 196608 | ((i2 << 12) & 57344), ((i2 << 3) & 896) | 48, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a6(gzsVar, gzsVar2, i, 10);
        }
    }

    public static final void b(gzs gzsVar, gzs gzsVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1060518296);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1060518296, i2, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.RemovePollAlert (PollEditorNavigatorSubBackStack.kt:19)");
            }
            xim ximVar = new xim(false, 4);
            String N = d370.N(R.string.poll_editor_delete_alert_title, 0, M);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new ehu(21);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 2);
            String N2 = d370.N(R.string.poll_editor_delete_alert_positive, 0, M);
            Alert$Button.Style style = Alert$Button.Style.Neutral;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new byo(17);
                M.R(x2);
            }
            Alert$Button alert$Button = new Alert$Button(N2, gzsVar, style, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2));
            String N3 = d370.N(R.string.poll_editor_delete_alert_negative, 0, M);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new u4u(22);
                M.R(x3);
            }
            Alert$Button alert$Button2 = new Alert$Button(N3, gzsVar2, style, com.vk.core.compose.component.semantics.b.a(mode, (izs) x3, 2));
            q630 E = ahn.E(q630.a.a, "PostingSettingsRemovePollDialog");
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new xmz(23);
                M.R(x4);
            }
            p7u0.c(100688304, 64, M, alert$Button, alert$Button2, a, null, N, null, ximVar, (izs) x4, E);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vi1(gzsVar, gzsVar2, i);
        }
    }
}
