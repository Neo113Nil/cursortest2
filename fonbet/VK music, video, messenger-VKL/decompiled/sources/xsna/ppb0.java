package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;

/* compiled from: PollEditorSettings.kt */
/* loaded from: classes4.dex */
public final class ppb0 {
    public static final void a(final boolean z, final yrb0 yrb0Var, final bob0 bob0Var, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1344871560);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(yrb0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(bob0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1344871560, i2, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.PollEditorSettings (PollEditorSettings.kt:34)");
            }
            com.vk.core.compose.component.group.header.f a = f.a.a(d370.N(R.string.poll_editor_settings_title, 0, M), null, null, null, null, null, null, null, false, M, 805306368, 510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(958254720, Tensorflow.FRAME_WIDTH, -1, "com.vk.core.compose.component.group.header.GroupHeader.Middle.Companion.invoke (GroupHeader.kt:1088)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new com.vk.core.compose.component.group.header.a(a, null);
                M.R(x);
            }
            com.vk.core.compose.component.group.header.a aVar2 = (com.vk.core.compose.component.group.header.a) x;
            ((zak0) aVar2.a).setValue(a);
            ((zak0) aVar2.b).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.group.header.g.a(aVar2, null, b.d.a, null, null, true, M, 196992, 90);
            String b = b(yrb0Var.b, M);
            boolean J = M.J(b);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new l9n(b, 3);
                M.R(x2);
            }
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(egi0.b(aVar3, false, (izs) x2), "pollEditorIsAnonymousCheckbox");
            String N = d370.N(R.string.poll_editor_anonymous, 0, M);
            boolean z2 = yrb0Var.b;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z3 = (i3 == 256) | (i4 == 32);
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new y4(17, bob0Var, yrb0Var);
                M.R(x3);
            }
            int i5 = (i2 << 15) & 458752;
            eku0.d(N, (gzs) x3, E, z2, null, z, false, M, i5, 80);
            String b2 = b(yrb0Var.c, M);
            boolean J2 = M.J(b2);
            Object x4 = M.x();
            if (J2 || x4 == c0012a) {
                x4 = new zl1(b2, 6);
                M.R(x4);
            }
            q630 E2 = ahn.E(egi0.b(aVar3, false, (izs) x4), "pollEditorCanHaveMultipleVotesCheckbox");
            String N2 = d370.N(R.string.poll_editor_multiple_votes, 0, M);
            boolean z4 = yrb0Var.c;
            boolean z5 = (i4 == 32) | (i3 == 256);
            Object x5 = M.x();
            if (z5 || x5 == c0012a) {
                x5 = new gd0(15, bob0Var, yrb0Var);
                M.R(x5);
            }
            eku0.d(N2, (gzs) x5, E2, z4, null, z, false, M, i5, 80);
            String b3 = b(yrb0Var.d, M);
            boolean J3 = M.J(b3);
            Object x6 = M.x();
            if (J3 || x6 == c0012a) {
                x6 = new sqd(b3, 1);
                M.R(x6);
            }
            q630 E3 = ahn.E(egi0.b(aVar3, false, (izs) x6), "pollEditorDisableUnvoteCheckbox");
            String N3 = d370.N(R.string.poll_editor_cancel_vote, 0, M);
            boolean z6 = yrb0Var.d;
            boolean z7 = (i4 == 32) | (i3 == 256);
            Object x7 = M.x();
            if (z7 || x7 == c0012a) {
                x7 = new mh3(20, bob0Var, yrb0Var);
                M.R(x7);
            }
            eku0.d(N3, (gzs) x7, E3, z6, null, z, false, M, i5, 80);
            String b4 = b(yrb0Var.e, M);
            boolean J4 = M.J(b4);
            Object x8 = M.x();
            if (J4 || x8 == c0012a) {
                x8 = new jjl(b4, 2);
                M.R(x8);
            }
            q630 E4 = ahn.E(egi0.b(aVar3, false, (izs) x8), "pollEditorHasEndDateCheckbox");
            String N4 = d370.N(R.string.poll_editor_completion_time, 0, M);
            boolean z8 = yrb0Var.e;
            boolean z9 = (i3 == 256) | (i4 == 32);
            Object x9 = M.x();
            if (z9 || x9 == c0012a) {
                x9 = new nh3(24, bob0Var, yrb0Var);
                M.R(x9);
            }
            eku0.d(N4, (gzs) x9, E4, z8, null, z, false, M, i5, 80);
            mm2.f(yrb0Var.e, aVar3, anp.d(null, null, null, 15).b(anp.e(null, 3)), anp.k(null, null, 15).b(anp.f(null, 3)), null, kai.c(991134048, new nd00(1, yrb0Var, izsVar), M), M, 200112, 16);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.opb0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ppb0.a(z, yrb0Var, bob0Var, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final String b(boolean z, androidx.compose.runtime.a aVar) {
        int i;
        int i2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1205502138, 0, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.getCheckboxSemantics (PollEditorSettings.kt:126)");
        }
        if (z) {
            i = 1402447286;
            i2 = R.string.poll_editor_uncheck_semantics;
        } else {
            i = 1402522616;
            i2 = R.string.poll_editor_check_semantics;
        }
        String a = zq.a(aVar, i, i2, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }
}
