package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: PollEditorQuestionInput.kt */
/* loaded from: classes4.dex */
public final class cpb0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, final boolean z, String str2, final int i, q630 q630Var, final izs izsVar, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i2) {
        String str3;
        int i3;
        String str4;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1368384252);
        if ((i2 & 6) == 0) {
            str3 = str;
            i3 = (M.J(str3) ? 4 : 2) | i2;
        } else {
            str3 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.l(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            str4 = str2;
            i3 |= M.J(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.o(i) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i4 |= M.y(izsVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= M.y(gzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i4 & 1, (599187 & i4) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1368384252, i4, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.PollQuestionInput (PollEditorQuestionInput.kt:25)");
            }
            float f = 16;
            float f2 = 12;
            q630.a aVar3 = q630.a.a;
            q630 G = s200.G(aVar3, f, f2, f, f2);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, G);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean z2 = (i4 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = androidx.compose.runtime.k.b(str3);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            String str5 = (String) wh50Var.getValue();
            q630 f3 = txj0.f(aVar3, 1.0f);
            String N = d370.N(R.string.poll_editor_question_hint, 0, M);
            String N2 = d370.N(R.string.poll_editor_question_title, 0, M);
            String str6 = z ? str4 : null;
            boolean J = M.J(wh50Var) | ((i4 & 458752) == 131072);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new g6(24, izsVar, wh50Var);
                M.R(x2);
            }
            aVar2 = M;
            ne2.a(str5, true, N, f3, N2, str6, false, i, "pollEditorQuestionInput", "pollEditorLengthCounter", (izs) x2, gzsVar, null, null, false, null, null, null, aVar2, ((i4 << 12) & 29360128) | 905972784, (i4 >> 15) & 112, 258112);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final String str7 = str3;
            final String str8 = str4;
            s.d = new wzs() { // from class: xsna.bpb0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cpb0.a(str7, z, str8, i, q630Var2, izsVar, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
