package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.author.AuthorType;
import com.vkontakte.android.R;
import xsna.phw;
import xsna.tlo0;

/* compiled from: Author.kt */
/* loaded from: classes7.dex */
public final class wb5 {

    /* compiled from: Author.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuthorType.values().length];
            try {
                iArr[AuthorType.CHANNEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthorType.PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(ld5 ld5Var, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        String O;
        androidx.compose.runtime.a M = aVar.M(973927859);
        int i2 = i | (M.J(ld5Var) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(973927859, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.author.Author (Author.kt:25)");
            }
            String obj = tlo0.b.a(ld5Var.b, (Context) M.r(AndroidCompositionLocals_androidKt.b)).toString();
            int i3 = a.$EnumSwitchMapping$0[ld5Var.c.ordinal()];
            if (i3 == 1) {
                M.K(-358188329);
                O = d370.O(R.string.setting_author_talkback_channel, new Object[]{obj}, M);
                M.j();
            } else {
                if (i3 != 2) {
                    throw alb0.c(-358189867, M);
                }
                M.K(-358185161);
                O = d370.O(R.string.setting_author_talkback_profile, new Object[]{obj}, M);
                M.j();
            }
            q630Var2 = q630Var;
            q630 E = ahn.E(txj0.h(txj0.f(q630Var2, 1.0f), 60), "AuthorTags.ROOT");
            com.vk.core.compose.component.cell.content.t a2 = com.vk.core.compose.component.cell.content.e.a(phw.a.a(fwu0.l(null, ld5Var.a, null, null, M, 0, 61), null, null, null, null, M, 196616, 30), Cell$Left.Main.Size.Medium, null, null, null, null, null, M, 100663344, 252);
            com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a(obj, null, null, 1, null, null, M, 12610560, 102);
            boolean J = M.J(O);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new com.vk.im.ui.fragments.b(O, 5);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(a3, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196608, 14);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new py(4);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.u0 a5 = o.b.a.a(null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), 0L, false, M, 196608, 27);
            M = M;
            wiu0.b(E, false, a2, a4, a5, gzsVar, null, M, (i2 << 12) & 458752, 66);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vb5(i, 0, (Object) ld5Var, (Object) gzsVar, (Object) q630Var2);
        }
    }
}
