package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingHints;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.osd0;
import xsna.q630;
import xsna.vgc0;

/* compiled from: ProductsPickerEntryPointCell.kt */
/* loaded from: classes4.dex */
public final class ftd0 {
    public static final void a(osd0.a aVar, ActionsAvailabilityState.AttachmentState attachmentState, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        boolean z;
        int i3;
        Cell$Left cell$Left;
        String F;
        String str;
        androidx.compose.runtime.a M = aVar2.M(-1993372086);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(attachmentState) : M.y(attachmentState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        int i4 = 1;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1993372086, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.ProductsContent (ProductsPickerEntryPointCell.kt:129)");
            }
            String str2 = aVar.b;
            boolean z2 = aVar.d;
            if (str2 == null) {
                M.K(1965265063);
                qzu0.a.getClass();
                lg90 J0 = qzu0.J0(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                Cell$Left a = vgc0.a.a(J0, ylu0Var.getIcon().l, M);
                M.j();
                cell$Left = a;
                i3 = 0;
                z = z2;
            } else {
                M.K(1965383142);
                z = z2;
                i3 = 0;
                Cell$Left a2 = toc0.a(fwu0.l(null, aVar.b, null, null, M, 0, 61), M);
                M.j();
                cell$Left = a2;
            }
            int i5 = i2 & 896;
            int i6 = i2 & 112;
            int i7 = (i5 == 256 ? 1 : i3) | ((i6 == 32 || ((i2 & 64) != 0 && M.y(attachmentState))) ? 1 : i3);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i7 != 0 || x == c0012a) {
                x = new com.vk.movika.sdk.base.ui.i(25, izsVar, attachmentState);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            String O = d370.O(R.string.posting_step2_market_button_content_description, new Object[]{aVar.a}, M);
            Integer num = aVar.c;
            if (num == null) {
                M.K(1965838066);
                M.j();
                F = null;
            } else {
                M.K(1965838067);
                int intValue = num.intValue();
                F = d370.F(R.plurals.once_more_products, intValue, new Object[]{Integer.valueOf(intValue)}, M, i3);
                M.j();
            }
            if (z) {
                str = zq.a(M, -75121797, R.string.posting_step2_remove_products_button_content_description, M, i3);
            } else {
                M.K(1966275507);
                M.j();
                str = null;
            }
            if (!z) {
                gzsVar = null;
            }
            int i8 = i5 == 256 ? 1 : i3;
            if (i6 != 32 && ((i2 & 64) == 0 || !M.y(attachmentState))) {
                i4 = i3;
            }
            int i9 = i8 | i4;
            Object x2 = M.x();
            if (i9 != 0 || x2 == c0012a) {
                x2 = new dp0(16, izsVar, attachmentState);
                M.R(x2);
            }
            qoc0.b(O, q630Var, cell$Left, F, str, null, null, null, (gzs) x2, gzsVar, 0, 0, false, M, (i2 >> 6) & 112, 0, 14788);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qzj(aVar, attachmentState, izsVar, q630Var, i);
        }
    }

    public static final void b(String str, ActionsAvailabilityState.AttachmentState attachmentState, izs izsVar, PostingHints postingHints, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        Pair pair;
        androidx.compose.runtime.a M = aVar.M(2113492904);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(attachmentState) : M.y(attachmentState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? M.J(postingHints) : M.y(postingHints) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2113492904, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.ProductsEmpty (ProductsPickerEntryPointCell.kt:75)");
            }
            String N = d370.N(R.string.posting_step2_empty_market_button_content_description, 0, M);
            int i3 = i2 >> 3;
            int i4 = (i2 & 14) | (i3 & 112) | (i3 & 896);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(316337877, i4, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.getLeftContent (ProductsPickerEntryPointCell.kt:99)");
            }
            if (str != null) {
                pair = new Pair(str, PostingAction.Tooltips.BusinessOnboardingTooltipShowed.b);
            } else {
                pair = (postingHints != null ? postingHints.j : null) != null ? new Pair(postingHints.j, PostingAction.Hints.RemoveBcProductsPostingOnboardingHint.b) : null;
            }
            String str2 = pair != null ? (String) pair.i() : null;
            qzu0.a.getClass();
            lg90 J0 = qzu0.J0(M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            vgc0 a = vgc0.a.a(J0, ylu0Var.getIcon().l, M);
            boolean y = M.y(pair) | ((((i4 & 112) ^ 48) > 32 && M.J(izsVar)) || (i4 & 48) == 32);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (y || x == obj) {
                x = new ww(pair, izsVar);
                M.R(x);
            }
            o5p0 o5p0Var = new o5p0(str2, a, (gzs) x);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N2 = d370.N(R.string.posting_step2_market_button, 0, M);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
            boolean J = M.J(N);
            Object x2 = M.x();
            if (J || x2 == obj) {
                x2 = new u17(N, 2);
                M.R(x2);
            }
            com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2);
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && M.y(attachmentState)));
            Object x3 = M.x();
            if (z || x3 == obj) {
                x3 = new com.vk.movika.sdk.base.ui.m(18, izsVar, attachmentState);
                M.R(x3);
            }
            aVar2 = M;
            qoc0.b(N2, q630Var, o5p0Var, null, null, null, a2, null, (gzs) x3, null, 0, 0, false, aVar2, (i2 >> 9) & 112, 0, 15732);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new b74(str, attachmentState, izsVar, postingHints, q630Var, i);
        }
    }

    public static final void c(final osd0 osd0Var, ActionsAvailabilityState.AttachmentState attachmentState, izs izsVar, PostingHints postingHints, String str, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        ActionsAvailabilityState.AttachmentState attachmentState2;
        izs izsVar2;
        String str2;
        final PostingHints postingHints2;
        androidx.compose.runtime.a M = aVar.M(214517520);
        if ((i & 6) == 0) {
            i2 = (M.J(osd0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(attachmentState) : M.y(attachmentState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? M.J(postingHints) : M.y(postingHints) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(str) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(214517520, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.ProductsPickerEntryPointCell (ProductsPickerEntryPointCell.kt:35)");
            }
            float f = attachmentState.b instanceof ActionsAvailabilityState.Availability.Available ? 1.0f : 0.5f;
            q630 q630Var = q630.a.a;
            if (str != null) {
                q630Var = ahn.E(q630Var, str);
            }
            q630 a = o19.a(q630Var, f);
            if (osd0Var instanceof osd0.b) {
                M.K(-219379496);
                attachmentState2 = attachmentState;
                izsVar2 = izsVar;
                b(((osd0.b) osd0Var).a, attachmentState2, izsVar2, postingHints, a, M, i2 & 8176);
                str2 = str;
                postingHints2 = postingHints;
                M = M;
                M.j();
            } else {
                attachmentState2 = attachmentState;
                izsVar2 = izsVar;
                str2 = str;
                postingHints2 = postingHints;
                if (!(osd0Var instanceof osd0.a)) {
                    throw alb0.c(-7077962, M);
                }
                M.K(-219099876);
                a((osd0.a) osd0Var, attachmentState2, izsVar2, a, M, i2 & 1008);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            attachmentState2 = attachmentState;
            izsVar2 = izsVar;
            str2 = str;
            postingHints2 = postingHints;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final String str3 = str2;
            final ActionsAvailabilityState.AttachmentState attachmentState3 = attachmentState2;
            final izs izsVar3 = izsVar2;
            s.d = new wzs() { // from class: xsna.etd0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ftd0.c(osd0.this, attachmentState3, izsVar3, postingHints2, str3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
