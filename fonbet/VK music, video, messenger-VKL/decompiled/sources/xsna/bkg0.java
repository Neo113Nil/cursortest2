package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: RightClearImpl.kt */
/* loaded from: classes17.dex */
public final class bkg0 implements tlh0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50<zhf0> d;
    public final wh50 e;

    public bkg0() {
        this(null, null);
    }

    @Override // xsna.tlh0
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-408982718);
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
                androidx.compose.runtime.b.f(-408982718, i2, -1, "com.vk.core.compose.component.search.right.RightClearImpl.Content (RightClearImpl.kt:28)");
            }
            q630 H = cdi.H(aVar2, this.d);
            gzs gzsVar = (gzs) ((zak0) this.c).getValue();
            if (gzsVar == null) {
                M.K(818268254);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new daz(13);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(2104605391);
            }
            M.j();
            gzs gzsVar2 = gzsVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
            }
            lg90 b = or.b(M, 1833859693, R.drawable.vk_icon_cancel_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            div0.a(b, gzsVar2, H, 0L, (String) ((zak0) this.a).getValue(), (SemanticsConfiguration) ((zak0) this.b).getValue(), M, 8, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new at3(this, i);
        }
    }

    @Override // xsna.rzb0
    public final zhf0 d() {
        return (zhf0) ((zak0) this.e).getValue();
    }

    public bkg0(String str, gzs gzsVar) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(null);
        this.c = androidx.compose.runtime.k.b(gzsVar);
        wh50<zhf0> b = androidx.compose.runtime.k.b(zhf0.e);
        this.d = b;
        this.e = b;
    }
}
