package xsna;

import android.text.Spanned;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.a;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFeatureCell;
import xsna.us2;

/* compiled from: LicenseAgreementBanner.kt */
/* loaded from: classes17.dex */
public final class v3z {
    public static final void a(us2 us2Var, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-592152855);
        if ((i & 6) == 0) {
            i2 = (M.J(us2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-592152855, i2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.license.LicenseAgreementBanner (LicenseAgreementBanner.kt:74)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.s0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 E = ahn.E(s200.E(hr80.m(q630Var, ylu0Var.getBackground().x, vog0.b(8)), 16, 12), ClipsUploadFeatureCell.LicenseAgreementBanner.i());
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new u3z(izsVar, 0);
                M.R(x);
            }
            aVar2 = M;
            vku0.b(us2Var, E, 0L, 0L, 0L, 0L, null, 0, false, 0, null, null, (izs) x, frv0Var, aVar2, i2 & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new lkg(us2Var, q630Var, izsVar, i);
        }
    }

    public static final void b(Object obj, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        us2 n;
        Spanned spanned;
        int i4;
        Object[] objArr;
        char c;
        androidx.compose.runtime.a M = aVar.M(-2082473846);
        if ((i & 6) == 0) {
            i2 = (M.J(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        int i5 = 0;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2082473846, i2, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.license.LicenseAgreementBanner (LicenseAgreementBanner.kt:30)");
            }
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence instanceof Spanned) {
                M.K(1824573539);
                us2.b bVar = new us2.b();
                bVar.f(charSequence);
                M.K(197407689);
                Spanned spanned2 = (Spanned) charSequence;
                Object[] spans = spanned2.getSpans(0, spanned2.length(), CharacterStyle.class);
                int length = spans.length;
                int i6 = 0;
                while (i6 < length) {
                    CharacterStyle characterStyle = (CharacterStyle) spans[i6];
                    int spanStart = spanned2.getSpanStart(characterStyle);
                    int spanEnd = spanned2.getSpanEnd(characterStyle);
                    if (characterStyle instanceof qaz) {
                        M.K(-1695825661);
                        String i7 = ((qaz) characterStyle).i();
                        if (i7 == null) {
                            M.K(-1030953900);
                            M.j();
                            spanned = spanned2;
                            i4 = i2;
                            objArr = spans;
                            c = 65535;
                        } else {
                            M.K(-1030953899);
                            bVar.e(new seq0(i7), spanStart, spanEnd);
                            if (androidx.compose.runtime.b.d()) {
                                spanned = spanned2;
                                i4 = i2;
                                c = 65535;
                                androidx.compose.runtime.b.f(1040687336, i5, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            } else {
                                spanned = spanned2;
                                i4 = i2;
                                c = 65535;
                            }
                            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            objArr = spans;
                            bVar.d(new hik0(ylu0Var.getText().f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), spanStart, spanEnd);
                            bVar.c(spanStart, spanEnd, i7, "");
                            M.j();
                        }
                    } else {
                        spanned = spanned2;
                        i4 = i2;
                        objArr = spans;
                        c = 65535;
                        M.K(-1032604525);
                    }
                    M.j();
                    i6++;
                    spans = objArr;
                    spanned2 = spanned;
                    i2 = i4;
                    i5 = 0;
                }
                i3 = i2;
                M.j();
                n = bVar.n();
                M.j();
            } else {
                i3 = i2;
                M.K(1825462371);
                M.j();
                us2.b bVar2 = new us2.b();
                bVar2.f(charSequence);
                n = bVar2.n();
            }
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new owo(izsVar, 1);
                M.R(x);
            }
            a(n, q630Var, (izs) x, M, (i3 >> 3) & 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rh2(obj, izsVar, q630Var, i);
        }
    }
}
