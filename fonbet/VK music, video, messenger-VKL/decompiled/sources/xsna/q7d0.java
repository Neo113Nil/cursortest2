package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vungle.ads.internal.protos.Sdk;
import xsna.i7d0;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: PrimaryBlockEmptyContentImpl.kt */
/* loaded from: classes17.dex */
public final class q7d0 extends i7d0.a {
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e = androidx.compose.runtime.k.b(null);

    public q7d0(String str, String str2, gzs gzsVar) {
        this.b = androidx.compose.runtime.k.b(str);
        this.c = androidx.compose.runtime.k.b(str2);
        this.d = androidx.compose.runtime.k.b(gzsVar);
    }

    @Override // xsna.i7d0
    public final void a(final int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        int i3;
        q630.a aVar3;
        vl20 vl20Var;
        androidx.compose.runtime.a M = aVar.M(-921146678);
        int i4 = i & 6;
        q630.a aVar4 = q630.a.a;
        if (i4 == 0) {
            i2 = (M.J(aVar4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        int i5 = i2;
        if (M.t(i5 & 1, (i5 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-921146678, i5, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockEmptyContentImpl.Content (PrimaryBlockEmptyContentImpl.kt:37)");
            }
            String str = (String) ((zak0) this.b).getValue();
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new d4r(20);
                M.R(x);
            }
            y48 y48Var = null;
            vl20 a = zra0.a.a(null, null, str, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196608, 11);
            String str2 = (String) ((zak0) this.c).getValue();
            if (str2 == null) {
                M.K(-1334262958);
                M.j();
                vl20Var = a;
                aVar3 = aVar4;
                i3 = i5;
            } else {
                M.K(-1334262957);
                qzu0.a.getClass();
                lg90 a2 = qzu0.a(M);
                ButtonSize buttonSize = ButtonSize.Small;
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                gzs gzsVar = (gzs) ((zak0) this.d).getValue();
                if (gzsVar == null) {
                    M.K(739432846);
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = new pm60(5);
                        M.R(x2);
                    }
                    gzsVar = (gzs) x2;
                } else {
                    M.K(-391789727);
                }
                M.j();
                gzs gzsVar2 = gzsVar;
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new tuq(26);
                    M.R(x3);
                }
                i3 = i5;
                aVar3 = aVar4;
                vl20Var = a;
                r48 a3 = wra0.a.C3954a.a(str2, gzsVar2, buttonSize, buttonStyle, buttonAppearance, false, a2, null, null, null, null, null, false, false, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, 2125184, 12582912, 65440);
                M = M;
                y48Var = wra0.b.a(a3, null, null, M, 14);
                M.j();
            }
            aVar2 = M;
            ldv0.d(aVar3, null, vl20Var, y48Var, null, null, false, aVar2, i3 & 14, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.p7d0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    q7d0.this.a(I, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }
}
