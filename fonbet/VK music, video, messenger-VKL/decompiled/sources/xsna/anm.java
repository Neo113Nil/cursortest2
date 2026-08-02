package xsna;

import androidx.compose.runtime.a;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorScreen;
import com.vk.newsfeed.posting.poll_editor.presentation.model.BackStack;
import xsna.xpb0;

/* compiled from: DialogsBackStack.kt */
/* loaded from: classes4.dex */
public final class anm {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(xpb0.a aVar, izs<? super pnb0, s3q0> izsVar, spb0 spb0Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-1469262756);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(spb0Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1469262756, i2, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.DialogsBackStack (DialogsBackStack.kt:17)");
            }
            for (PollEditorScreen pollEditorScreen : ((BackStack) jk50.c(aVar.a, M).getValue()).b) {
                if (pollEditorScreen instanceof PollEditorScreen.ExitPollEditorAlert) {
                    M.K(-794670832);
                    int i3 = i2 & 112;
                    boolean J = (i3 == 32) | M.J(pollEditorScreen);
                    Object x = M.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new i5(11, izsVar, (PollEditorScreen.ExitPollEditorAlert) pollEditorScreen);
                        M.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean J2 = (i3 == 32) | M.J(pollEditorScreen) | ((i2 & 896) == 256);
                    Object x2 = M.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new xah(izsVar, (PollEditorScreen.ExitPollEditorAlert) pollEditorScreen, spb0Var, 1);
                        M.R(x2);
                    }
                    uob0.a(gzsVar, (gzs) x2, M, 384);
                    M.j();
                } else if (pollEditorScreen instanceof PollEditorScreen.RemovePollAlert) {
                    M.K(1082776247);
                    nxf0.a((i2 >> 3) & 14, M, izsVar, null);
                    M.j();
                } else {
                    M.K(1082777760);
                    M.j();
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kv7(aVar, (izs) izsVar, spb0Var, i);
        }
    }
}
