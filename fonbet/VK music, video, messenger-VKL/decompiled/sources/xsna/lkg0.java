package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.q630;
import xsna.tlh0;

/* compiled from: RightMicrophoneImpl.kt */
/* loaded from: classes17.dex */
public final class lkg0 implements tlh0.b {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50<zhf0> d;
    public final wh50 e;

    public lkg0() {
        this(null, null, null);
    }

    @Override // xsna.tlh0
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-406321832);
        int i3 = i & 48;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-406321832, i2, -1, "com.vk.core.compose.component.search.RightMicrophoneImpl.Content (RightMicrophoneImpl.kt:26)");
            }
            q630 H = cdi.H(aVar2, this.d);
            gzs<s3q0> b = b();
            if (b == null) {
                M.K(-1515655544);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new c2c0(8);
                    M.R(x);
                }
                b = (gzs) x;
            } else {
                M.K(366749541);
            }
            M.j();
            gzs<s3q0> gzsVar = b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1400769860, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-VoiceOutline24> (VkSdkIcons.kt:3770)");
            }
            lg90 b2 = or.b(M, -432475738, R.drawable.vk_icon_voice_outline_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            div0.a(b2, gzsVar, H, 0L, c(), (SemanticsConfiguration) ((zak0) this.c).getValue(), M, 8, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x1f0(this, i);
        }
    }

    @Override // xsna.tlh0.b
    public final gzs<s3q0> b() {
        return (gzs) ((zak0) this.b).getValue();
    }

    @Override // xsna.tlh0.b
    public final String c() {
        return (String) ((zak0) this.a).getValue();
    }

    @Override // xsna.rzb0
    public final zhf0 d() {
        return (zhf0) ((zak0) this.e).getValue();
    }

    public lkg0(SemanticsConfiguration semanticsConfiguration, String str, gzs gzsVar) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(gzsVar);
        this.c = androidx.compose.runtime.k.b(semanticsConfiguration);
        wh50<zhf0> b = androidx.compose.runtime.k.b(zhf0.e);
        this.d = b;
        this.e = b;
    }
}
