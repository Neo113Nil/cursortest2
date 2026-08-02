package xsna;

import androidx.compose.runtime.a;

/* compiled from: PostTextContent.kt */
/* loaded from: classes4.dex */
public final class g8c0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, izs izsVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-138852782);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-138852782, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.step2.PostTextContent (PostTextContent.kt:21)");
            }
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new mmd(izsVar, 3);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new uuz(13);
                M.R(x2);
            }
            izs izsVar3 = (izs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new ept(20);
                M.R(x3);
            }
            izs izsVar4 = (izs) x3;
            boolean z2 = (i2 & 14) == 4;
            Object x4 = M.x();
            if (z2 || x4 == c0012a) {
                x4 = new gub(str, 1);
                M.R(x4);
            }
            ae2.b(izsVar2, null, izsVar3, izsVar4, (izs) x4, M, 3456, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xw5(str, izsVar, i, 3);
        }
    }
}
