package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: EqualizerSwitchRow.kt */
/* loaded from: classes3.dex */
public final class sup {
    public static final void a(final int i, androidx.compose.runtime.a aVar, final izs izsVar, q630 q630Var, final boolean z) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1493417658);
        int i4 = (M.o(R.string.equalizer_switch_title) ? 4 : 2) | i | (M.l(z) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | 3072;
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1493417658, i4, -1, "com.vk.music.design.compose.equalizer.EqualizerSwitchRow (EqualizerSwitchRow.kt:22)");
            }
            if (z) {
                i2 = -1160507648;
                i3 = R.string.equalizer_enabled_accessibility;
            } else {
                i2 = -1160430241;
                i3 = R.string.equalizer_disabled_accessibility;
            }
            String a = zq.a(M, i2, i3, M, 0);
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.equalizer_switch_title, i4 & 14, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30);
            int i5 = i4 & 112;
            boolean z2 = (i5 == 32) | ((i4 & 896) == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new gzs() { // from class: xsna.qup
                    @Override // xsna.gzs
                    public final Object invoke() {
                        izs.this.invoke(Boolean.valueOf(!z));
                        return s3q0.a;
                    }
                };
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean J = M.J(a) | (i5 == 32);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new no1(a, z, 2);
                M.R(x2);
            }
            wiu0.b(f, false, null, a2, o.c.a(com.vk.core.compose.component.cell.content.n.a(z, gzsVar, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, ((i4 >> 3) & 14) | 24576, 4), null, null, null, null, M, 62), null, null, M, 0, 102);
            aVar2 = M;
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
            s.d = new wzs(i, izsVar, q630Var2, z) { // from class: xsna.rup
                public final /* synthetic */ boolean b;
                public final /* synthetic */ izs c;
                public final /* synthetic */ q630 d;

                {
                    this.b = z;
                    this.c = izsVar;
                    this.d = q630Var2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sup.a(ne7.I(1), (androidx.compose.runtime.a) obj, this.c, this.d, this.b);
                    return s3q0.a;
                }
            };
        }
    }
}
