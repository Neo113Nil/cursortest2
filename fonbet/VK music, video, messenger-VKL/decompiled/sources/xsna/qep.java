package xsna;

import com.vk.profile.design.compose.header.a;
import com.vkontakte.android.R;
import xsna.e95;
import xsna.kja0;
import xsna.phw;
import xsna.wkj;
import xsna.zra0;

/* compiled from: EmptyAvatarSlotImpl.kt */
/* loaded from: classes5.dex */
public final class qep implements e95.a {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public qep(a.b bVar, boolean z, lja0 lja0Var, float f) {
        this.a = androidx.compose.runtime.k.b(bVar);
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.k.b(lja0Var);
        this.d = cq.f(f);
    }

    @Override // xsna.e95
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1843298481);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1843298481, i2, -1, "com.vk.profile.design.compose.header.header.EmptyAvatarSlotImpl.Content (EmptyAvatarSlotImpl.kt:45)");
            }
            q630 a = qri.a(txj0.h(txj0.f(q630Var, 1.0f), ((pco) ((zak0) this.d).getValue()).b), a5x.a, new mja0((izs) M.r(h85.a), kja0.b.a, (lja0) ((zak0) this.c).getValue()));
            if (((Boolean) ((zak0) this.b).getValue()).booleanValue()) {
                M.K(-1746362951);
                b(a, M, i2 & 112);
                M.j();
            } else {
                M.K(-1746301292);
                c(a, M, i2 & 112);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u67(this, q630Var, i, 1);
        }
    }

    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-679029681);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-679029681, i2, -1, "com.vk.profile.design.compose.header.header.EmptyAvatarSlotImpl.EmptyAdminAvatar (EmptyAvatarSlotImpl.kt:83)");
            }
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2087503938, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LegoCamera56> (VkIcons.kt:4450)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_lego_camera_56, 0, M);
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
            q630Var2 = q630Var;
            ldv0.d(q630Var2, csa0.a(a, ylu0Var.getIcon().l, 0L, null, null, M, 196616, 28), zra0.a.a(null, null, d370.N(R.string.author_header_avatar_no_picture_placeholder, 0, M), null, M, 196608, 27), null, null, null, false, M, i2 & 14, 120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ks3(this, q630Var2, i, 4);
        }
    }

    public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        lg90 l;
        androidx.compose.runtime.a M = aVar.M(1191937926);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1191937926, i2, -1, "com.vk.profile.design.compose.header.header.EmptyAvatarSlotImpl.EmptySubscriberAvatar (EmptyAvatarSlotImpl.kt:65)");
            }
            if (((Boolean) M.r(c5x.a)).booleanValue()) {
                l = or.b(M, -1766601922, R.drawable.vk_icon_illustration_placeholder_kid_llama_ny_h150, M, 0);
            } else {
                M.K(-1766472187);
                l = fwu0.l(null, ((a.b) ((zak0) this.a).getValue()).a, null, null, M, 0, 61);
                M.j();
            }
            q630Var2 = q630Var;
            gdv0.a(phw.a.a(l, null, wkj.a.a, null, null, M, 197000, 26), ((pco) ((zak0) this.d).getValue()).b, q630Var2, null, false, null, null, M, ((i2 << 6) & 896) | 24576);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g4o(this, q630Var2, i, 1);
        }
    }
}
