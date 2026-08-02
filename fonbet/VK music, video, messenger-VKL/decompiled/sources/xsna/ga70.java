package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.generated.VkColorToken;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: NotificationImpl.kt */
/* loaded from: classes18.dex */
public final class ga70 implements wxe0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public ga70() {
        throw null;
    }

    public ga70(String str, gzs gzsVar) {
        this.a = androidx.compose.runtime.k.b(new xxe0(str));
        this.b = androidx.compose.runtime.k.b(gzsVar);
        this.c = androidx.compose.runtime.k.b(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d1, code lost:
    
        if (r8 == androidx.compose.runtime.a.C0011a.a) goto L25;
     */
    @Override // xsna.wxe0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, androidx.compose.runtime.a aVar) {
        Object obj;
        androidx.compose.runtime.a M = aVar.M(-1966379785);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1966379785, i2, -1, "com.vk.ecomm.design.compose.ratingblock.NotificationImpl.Content (NotificationImpl.kt:37)");
            }
            SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.c).getValue();
            q630.a aVar2 = q630.a.a;
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, semanticsConfiguration);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String N = d370.N(R.string.market_rating_block_notification_moreButton, 0, M);
            wh50 wh50Var = this.a;
            boolean J = M.J(((xxe0) ((zak0) wh50Var).getValue()).a) | M.J(N) | M.J((gzs) ((zak0) this.b).getValue());
            Object x = M.x();
            if (!J) {
                obj = x;
            }
            s8u0 s8u0Var = new s8u0(0);
            s8u0Var.e(((xxe0) ((zak0) wh50Var).getValue()).a);
            s8u0Var.e(" ");
            int g = s8u0Var.g(new h2v0("MORE_ACTION", new zqv0(new klv0(null, VkColorToken.TextLink), 14), new i9z() { // from class: xsna.fa70
                @Override // xsna.i9z
                public final void a(q8z q8zVar) {
                    ((gzs) ((zak0) ga70.this.b).getValue()).invoke();
                }
            }));
            try {
                s8u0Var.e(N);
                s3q0 s3q0Var = s3q0.a;
                s8u0Var.f(g);
                M.R(s8u0Var);
                obj = s8u0Var;
                us2 j = ((s8u0) obj).j(8, M);
                q630 f = txj0.f(aVar2, 1.0f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.i0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.d(j, f, ylu0Var.getText().p, 0, null, 0, false, 0, null, null, frv0Var, M, 48, 0, 8184);
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } catch (Throwable th) {
                s8u0Var.f(g);
                throw th;
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q0r(this, i, 2);
        }
    }
}
