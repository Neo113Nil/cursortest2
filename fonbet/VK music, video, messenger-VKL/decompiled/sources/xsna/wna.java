package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import xsna.us2;

/* compiled from: PrivacySettingsNewContentView.kt */
/* loaded from: classes4.dex */
public final class wna implements Cell$Middle.d {
    public final wh50 a;

    public wna(String str) {
        this.a = androidx.compose.runtime.k.b(str);
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Middle.d, com.vk.core.compose.component.cell.content.Cell$Middle.c, com.vk.core.compose.component.cell.content.Cell$Middle.b
    public final void c(final q630 q630Var, final Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(228491217);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(size.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(228491217, i2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.CellOnboardingTitle.Content (PrivacySettingsNewContentView.kt:497)");
            }
            String str = (String) ((zak0) this.a).getValue();
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new v5v(str, new Pair(0, Integer.valueOf(str.length())));
                M.R(x);
            }
            final v5v v5vVar = (v5v) x;
            d8v0.a(v5vVar.b, null, null, null, false, false, true, null, kai.c(1254786453, new zzs() { // from class: xsna.sna
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    v5v v5vVar2 = v5vVar;
                    izs izsVar = (izs) obj;
                    ((Boolean) obj2).getClass();
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.y(izsVar) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1254786453, intValue, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.CellOnboardingTitle.Content.<anonymous> (PrivacySettingsNewContentView.kt:507)");
                        }
                        us2.b b = xga0.b(-1036026220, aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        int m = b.m(new hik0(ylu0Var.getText().o, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        try {
                            b.g(v5vVar2.a);
                            s3q0 s3q0Var = s3q0.a;
                            b.k(m);
                            int i3 = intValue;
                            us2 n = b.n();
                            aVar2.j();
                            Cell$Middle.d.b.b(n, null, null, null, 0, 0, null, null, izsVar, aVar2, (i3 << 27) & 1879048192, 6, 510).c(q630.this, size, aVar2, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } catch (Throwable th) {
                            b.k(m);
                            throw th;
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 806879232, 446);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rh2(i, 1, this, q630Var, size);
        }
    }
}
