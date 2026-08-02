package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: RightFilterImpl.kt */
/* loaded from: classes17.dex */
public final class fkg0 implements tlh0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50<zhf0> e;
    public final wh50 f;

    public fkg0() {
        throw null;
    }

    public fkg0(long j, gzs gzsVar) {
        this.a = zy60.d(j);
        this.b = androidx.compose.runtime.k.b(null);
        this.c = androidx.compose.runtime.k.b(null);
        this.d = androidx.compose.runtime.k.b(gzsVar);
        wh50<zhf0> b = androidx.compose.runtime.k.b(zhf0.e);
        this.e = b;
        this.f = b;
    }

    @Override // xsna.tlh0
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1503120938);
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
                androidx.compose.runtime.b.f(1503120938, i2, -1, "com.vk.core.compose.component.search.right.RightFilterImpl.Content (RightFilterImpl.kt:32)");
            }
            gzs gzsVar = (gzs) ((zak0) this.d).getValue();
            if (gzsVar == null) {
                M.K(146959926);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new l35(25);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(1390213623);
            }
            M.j();
            gzs gzsVar2 = gzsVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1794058044, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Filter24> (VkSdkIcons.kt:890)");
            }
            lg90 b = or.b(M, 210325805, R.drawable.vk_icon_filter_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            div0.a(b, gzsVar2, cdi.H(aVar2, this.e), ((l5g) ((zak0) this.a).getValue()).a, (String) ((zak0) this.b).getValue(), (SemanticsConfiguration) ((zak0) this.c).getValue(), M, 8, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qma(this, i);
        }
    }

    @Override // xsna.rzb0
    public final zhf0 d() {
        return (zhf0) ((zak0) this.f).getValue();
    }
}
