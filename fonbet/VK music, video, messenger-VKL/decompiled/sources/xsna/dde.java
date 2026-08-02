package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vkontakte.android.R;
import xsna.kpv;
import xsna.mut0;
import xsna.phw;
import xsna.q630;

/* compiled from: ClipsGridHeaderAuthorCell.kt */
/* loaded from: classes17.dex */
public final class dde extends rpo0 {
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;
    public final wh50 s;
    public final wh50 t;

    public dde(Context context) {
        super(context, null, 0);
        this.m = androidx.compose.runtime.k.b(null);
        this.n = androidx.compose.runtime.k.b(null);
        this.o = androidx.compose.runtime.k.b("");
        this.p = androidx.compose.runtime.k.b("");
        this.q = androidx.compose.runtime.k.b(null);
        this.r = androidx.compose.runtime.k.b(Boolean.FALSE);
        this.s = androidx.compose.runtime.k.b(null);
        this.t = androidx.compose.runtime.k.b(null);
        setViewCompositionStrategy(mut0.b.a);
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        int i2;
        a.C0011a.C0012a c0012a;
        iy5 iy5Var;
        androidx.compose.runtime.a M = aVar.M(-511648134);
        int i3 = i | (M.y(this) ? 4 : 2);
        int i4 = 1;
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-511648134, i3, -1, "com.vk.clips.viewer.impl.grid.holders.cell.ClipsGridHeaderAuthorCell.ThemedContent (ClipsGridHeaderAuthorCell.kt:54)");
            }
            int i5 = i3 & 14;
            boolean z = i5 == 4 || M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z || x == c0012a2) {
                x = new com.vk.movika.sdk.base.model.b(this, 24);
                M.R(x);
            }
            q630 c = ojc.c(q630.a.a, false, null, null, (gzs) x, 15);
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = new jr3(6);
                M.R(x2);
            }
            q630 b = egi0.b(c, false, (izs) x2);
            phw a = phw.a.a(fwu0.l(null, getAvatarUrl(), null, null, M, 0, 61), null, null, null, null, M, 196616, 30);
            androidx.compose.runtime.a aVar2 = M;
            Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
            if (epx.f((Boolean) ((zak0) this.n).getValue(), Boolean.TRUE)) {
                aVar2.K(329972401);
                float f = 24;
                i2 = 0;
                c0012a = c0012a2;
                iy5Var = kpv.a.a(pg90.a(dhr0.M() ? R.drawable.vk_icon_verified_dark_24 : R.drawable.vk_icon_verified_light_24, 0, aVar2), l5g.k, byc0.b(f, f), null, false, null, null, aVar2, 100663736, 248);
                aVar2 = aVar2;
                aVar2.j();
            } else {
                i2 = 0;
                c0012a = c0012a2;
                aVar2.K(330555790);
                aVar2.j();
                iy5Var = rep.a;
            }
            iy5 iy5Var2 = iy5Var;
            Object x3 = aVar2.x();
            if (x3 == c0012a) {
                x3 = new nt(20);
                aVar2.R(x3);
            }
            com.vk.core.compose.component.cell.content.x xVar = null;
            androidx.compose.runtime.a aVar3 = aVar2;
            com.vk.core.compose.component.cell.content.i0 a2 = Cell$Left.a.a(com.vk.core.compose.component.cell.content.e.a(a, size, iy5Var2, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), aVar3, 100663344, 120), null, aVar3, 2);
            String title = getTitle();
            Object x4 = aVar3.x();
            if (x4 == c0012a) {
                x4 = new v7(16);
                aVar3.R(x4);
            }
            com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a(title, null, null, 1, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), null, aVar3, 12610560, 70);
            String description = getDescription();
            Object x5 = aVar3.x();
            if (x5 == c0012a) {
                x5 = new db(21);
                aVar3.R(x5);
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            com.vk.core.compose.component.cell.content.k0 a4 = Cell$Middle.a.a(a3, Cell$Middle.c.b.b(description, 1, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), aVar3, 12583344, 88), null, null, aVar4, 196608, 28);
            Integer subscriptionIcon = getSubscriptionIcon();
            if (subscriptionIcon == null) {
                aVar4.K(331677245);
            } else {
                aVar4.K(331677246);
                lg90 a5 = pg90.a(subscriptionIcon.intValue(), i2, aVar4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i2, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().b;
                String N = d370.N(R.string.clips_subscribe, i2, aVar4);
                if (i5 != 4 && !aVar4.y(this)) {
                    i4 = i2;
                }
                Object x6 = aVar4.x();
                if (i4 != 0 || x6 == c0012a) {
                    x6 = new eb(this, 19);
                    aVar4.R(x6);
                }
                gzs gzsVar = (gzs) x6;
                Object x7 = aVar4.x();
                if (x7 == c0012a) {
                    x7 = new pt(19);
                    aVar4.R(x7);
                }
                xVar = com.vk.core.compose.component.cell.content.p.a(a5, j, 0L, N, gzsVar, com.vk.core.compose.component.semantics.b.a(null, (izs) x7, 3), aVar4, 1572872, 4);
                aVar4 = aVar4;
            }
            aVar4.j();
            androidx.compose.runtime.a aVar5 = aVar4;
            wiu0.b(b, false, a2, a4, xVar, null, null, aVar5, 0, 98);
            M = aVar5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.k(this, i, 3);
        }
    }

    public final String getAvatarUrl() {
        return (String) ((zak0) this.m).getValue();
    }

    public final String getDescription() {
        return (String) ((zak0) this.p).getValue();
    }

    public final gzs<s3q0> getOnCellClicked() {
        return (gzs) ((zak0) this.s).getValue();
    }

    public final gzs<s3q0> getOnSubscribeClicked() {
        return (gzs) ((zak0) this.t).getValue();
    }

    public final Integer getSubscriptionIcon() {
        return (Integer) ((zak0) this.q).getValue();
    }

    public final String getTitle() {
        return (String) ((zak0) this.o).getValue();
    }

    public final void setAvatarUrl(String str) {
        ((zak0) this.m).setValue(str);
    }

    public final void setDescription(String str) {
        ((zak0) this.p).setValue(str);
    }

    public final void setOnCellClicked(gzs<s3q0> gzsVar) {
        ((zak0) this.s).setValue(gzsVar);
    }

    public final void setOnSubscribeClicked(gzs<s3q0> gzsVar) {
        ((zak0) this.t).setValue(gzsVar);
    }

    public final void setSubscribed(boolean z) {
        ((zak0) this.r).setValue(Boolean.valueOf(z));
    }

    public final void setSubscriptionIcon(Integer num) {
        ((zak0) this.q).setValue(num);
    }

    public final void setTitle(String str) {
        ((zak0) this.o).setValue(str);
    }

    public final void setVerifiedAuthor(Boolean bool) {
        ((zak0) this.n).setValue(bool);
    }
}
