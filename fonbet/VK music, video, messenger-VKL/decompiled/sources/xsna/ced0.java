package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.newsfeed.posting.impl.presentation.model.ui.PrivacyViewState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: PrivacyEntryPointCell2.kt */
/* loaded from: classes4.dex */
public final class ced0 {

    /* compiled from: PrivacyEntryPointCell2.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrivacyViewState.RightAction.values().length];
            try {
                iArr[PrivacyViewState.RightAction.Open.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrivacyViewState.RightAction.Cancel.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ca, code lost:
    
        if (r13 == r10) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(PrivacyViewState privacyViewState, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        a.C0011a.C0012a c0012a;
        int i3;
        Cell$Middle.d dVar;
        a.C0011a.C0012a c0012a2;
        int i4;
        com.vk.core.compose.component.cell.content.o a2;
        int i5;
        int i6;
        a.C0011a.C0012a c0012a3;
        boolean z = privacyViewState.e;
        androidx.compose.runtime.a M = aVar.M(-751851172);
        if ((i & 6) == 0) {
            i2 = (M.J(privacyViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-751851172, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.PostingPrivacyCell2 (PrivacyEntryPointCell2.kt:34)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a4 = a.C0011a.a;
            if (x == c0012a4) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            M.K(-974459448);
            q630 E = ahn.E(q630Var, "PostingPrivacyButton");
            if (z && !((Boolean) wh50Var.getValue()).booleanValue()) {
                Object x2 = M.x();
                if (x2 == c0012a4) {
                    x2 = new bed0(0, wh50Var);
                    M.R(x2);
                }
                E = E.g(egi.o(q630.a.a, (izs) x2));
            }
            q630 q630Var2 = E;
            M.j();
            String J = blk.J(privacyViewState.a, M);
            boolean z2 = ((Boolean) wh50Var.getValue()).booleanValue() && z;
            int i7 = i2 & 112;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-977818036, i7, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.resolveTitle (PrivacyEntryPointCell2.kt:90)");
            }
            if (z2) {
                M.K(-1708739060);
                boolean z3 = ((i7 ^ 48) > 32 && M.J(izsVar)) || (i2 & 48) == 32;
                Object x3 = M.x();
                if (z3 || x3 == c0012a4) {
                    x3 = new dz7(izsVar, 4);
                    M.R(x3);
                }
                Cell$Middle.d vnaVar = new vna(J, (gzs) x3);
                M.j();
                dVar = vnaVar;
                c0012a = c0012a4;
                i3 = 1;
            } else {
                M.K(-1708568033);
                c0012a = c0012a4;
                i3 = 1;
                Cell$Middle.d a3 = Cell$Middle.d.b.a(J, null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M = M;
                M.j();
                dVar = a3;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            androidx.compose.runtime.a aVar2 = M;
            com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(dVar, Cell$Middle.c.b.b(blk.J(privacyViewState.b, M), 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar2, 196608, 28);
            androidx.compose.runtime.a aVar3 = aVar2;
            int i8 = a.$EnumSwitchMapping$0[privacyViewState.c.ordinal()];
            if (i8 == i3) {
                c0012a2 = c0012a;
                i4 = 0;
                aVar3.K(-142699232);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a2 = o.b.a.a(null, null, ylu0Var.getIcon().n, false, aVar3, 196608, 23);
                aVar3.j();
            } else {
                if (i8 != 2) {
                    throw alb0.c(-974436688, aVar3);
                }
                aVar3.K(-142503250);
                if (androidx.compose.runtime.b.d()) {
                    i5 = -1;
                    i6 = 0;
                    androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
                } else {
                    i5 = -1;
                    i6 = 0;
                }
                lg90 b = or.b(aVar3, 1833859693, R.drawable.vk_icon_cancel_24, aVar3, i6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i6, i5, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var2.getIcon().n;
                int i9 = i7 == 32 ? i3 : i6;
                Object x4 = aVar3.x();
                if (i9 == 0) {
                    c0012a3 = c0012a;
                } else {
                    c0012a3 = c0012a;
                }
                x4 = new me1(izsVar, 6);
                aVar3.R(x4);
                i4 = i6;
                c0012a2 = c0012a3;
                a2 = com.vk.core.compose.component.cell.content.p.a(b, j, 0L, null, (gzs) x4, null, aVar3, 1572872, 44);
                aVar3 = aVar3;
                aVar3.j();
            }
            com.vk.core.compose.component.cell.content.o oVar = a2;
            boolean z4 = privacyViewState.d;
            if (i7 == 32) {
                i4 = 1;
            }
            Object x5 = aVar3.x();
            if (i4 != 0 || x5 == c0012a2) {
                x5 = new ne1(izsVar, 4);
                aVar3.R(x5);
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            wiu0.b(q630Var2, z4, null, a4, oVar, (gzs) x5, null, aVar4, 0, 68);
            M = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hj(i, 7, privacyViewState, izsVar, q630Var);
        }
    }
}
