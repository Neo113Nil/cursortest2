package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.feed.tool.compose.posting.step2cell.OnboardingType;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: StoryRepostSwitchCell.kt */
/* loaded from: classes18.dex */
public final class dcm0 {
    public static final void a(q630 q630Var, final String str, final boolean z, final OnboardingType onboardingType, final boolean z2, final int i, final gzs gzsVar, final izs izsVar, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(-434000037);
        int i3 = (M.y(izsVar) ? 8388608 : 4194304) | i2 | 6 | (M.l(z) ? 256 : 128) | (M.o(onboardingType == null ? -1 : onboardingType.ordinal()) ? 2048 : 1024) | (M.l(z2) ? 16384 : 8192) | (M.o(i) ? 131072 : 65536) | (M.y(gzsVar) ? 1048576 : 524288);
        boolean z3 = false;
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            M.V();
            if ((i2 & 1) == 0 || M.i()) {
                q630Var3 = q630.a.a;
            } else {
                M.h();
                q630Var3 = q630Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-434000037, i3, -1, "com.vk.feed.tool.compose.posting.step2cell.StoryRepostSwitchCell (StoryRepostSwitchCell.kt:37)");
            }
            q630 a = d1p0.a(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, vov0.a(0), 1, txj0.f(str == null ? q630Var3 : ahn.E(q630Var3, str), 1.0f)), z, z2, new plg0(2), izsVar, 8);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new mcl0(3);
                M.R(x);
            }
            q630 b = egi0.b(a, true, (izs) x);
            int i4 = i3 & 7168;
            int i5 = 3670016 & i3;
            boolean z4 = (i4 == 2048) | (i5 == 1048576);
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new f6v(onboardingType == OnboardingType.TITLE, gzsVar);
                M.R(x2);
            }
            f6v f6vVar = (f6v) x2;
            boolean z5 = (i4 == 2048) | (i5 == 1048576) | ((((458752 & i3) ^ 196608) > 131072 && M.o(i)) || (i3 & 196608) == 131072);
            Object x3 = M.x();
            if (z5 || x3 == c0012a) {
                x3 = new s5v(i, gzsVar, onboardingType == OnboardingType.SUBTITLE);
                M.R(x3);
            }
            s5v s5vVar = (s5v) x3;
            if (i == 0) {
                s5vVar = null;
            }
            q630Var2 = q630Var3;
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(f6vVar, s5vVar, null, null, M, 196608, 28);
            aVar2 = M;
            if (z && z2) {
                z3 = true;
            }
            wiu0.b(b, false, null, a2, com.vk.core.compose.component.cell.content.n.a(z3, null, z2, null, aVar2, ((i3 >> 6) & 896) | 24576, 10), null, null, aVar2, 0, 102);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final q630 q630Var4 = q630Var2;
            s.d = new wzs(str, z, onboardingType, z2, i, gzsVar, izsVar, i2) { // from class: xsna.acm0
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ OnboardingType e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ int g;
                public final /* synthetic */ gzs h;
                public final /* synthetic */ izs i;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(49);
                    dcm0.a(q630.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(String str, Cell$Middle.Size size, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1391164395);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(size.ordinal()) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1391164395, i3, -1, "com.vk.feed.tool.compose.posting.step2cell.Subtitle (StoryRepostSwitchCell.kt:160)");
            }
            str2 = str;
            com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.c.b.b(str2, 0, null, null, null, M, (i3 & 14) | 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            int i4 = ((i3 >> 6) & 14) | (i3 & 112);
            q630.a aVar2 = q630.a.a;
            b.c(aVar2, size, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            str2 = str;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i95(i, 1, str2, size, q630Var2);
        }
    }

    public static final void c(String str, Cell$Middle.Size size, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1589625602);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(size.ordinal()) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1589625602, i3, -1, "com.vk.feed.tool.compose.posting.step2cell.Title (StoryRepostSwitchCell.kt:109)");
            }
            str2 = str;
            com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(str2, null, null, 0, null, null, M, (i3 & 14) | 12582912 | ((i3 << 9) & 3670016), 62);
            int i4 = ((i3 >> 6) & 14) | (i3 & 112);
            q630.a aVar2 = q630.a.a;
            a.c(aVar2, size, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            str2 = str;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xv9(i, 5, str2, size, q630Var2);
        }
    }
}
