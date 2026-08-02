package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: LeftBackImpl.kt */
/* loaded from: classes17.dex */
public final class ozy {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public ozy() {
        this(0);
    }

    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1347283784);
        int i3 = i & 6;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1347283784, i2, -1, "com.vk.core.compose.component.search.LeftBackImpl.Content (LeftBackImpl.kt:26)");
            }
            gzs gzsVar = (gzs) ((zak0) this.c).getValue();
            if (gzsVar == null) {
                M.K(-461714872);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new fc(19);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(-1954557019);
            }
            M.j();
            gzs gzsVar2 = gzsVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            nzu0.c(gzsVar2, b, (String) ((zak0) this.a).getValue(), s200.D(com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.b).getValue()), kqu0.r), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ylu0Var.getIcon().a, false, null, false, null, null, M, 64, 2000);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nzy(this, i);
        }
    }

    public ozy(int i) {
        this.a = androidx.compose.runtime.k.b(null);
        this.b = androidx.compose.runtime.k.b(null);
        this.c = androidx.compose.runtime.k.b(null);
    }
}
