package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.profile.user.impl.ui.adapter.MergeMode;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import xsna.q630;

/* compiled from: UserProfilePromoButtonViewHolder.kt */
/* loaded from: classes5.dex */
public final class wtq0 extends dri<UserProfileAdapterItem.PromoButtons.a> {
    public static final a s = new a();
    public final zuq0 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;

    /* compiled from: UserProfilePromoButtonViewHolder.kt */
    public static final class a extends eri<wtq0> {
        @Override // xsna.eri
        public final dri a(ComposeView composeView, slq0 slq0Var, zuq0 zuq0Var) {
            return new wtq0(composeView, zuq0Var);
        }
    }

    public wtq0(ComposeView composeView, zuq0 zuq0Var) {
        super(composeView);
        this.n = zuq0Var;
        this.o = androidx.compose.runtime.k.b(null);
        this.p = androidx.compose.runtime.k.b("");
        this.q = zy60.d(l5g.k);
        this.r = androidx.compose.runtime.k.b(MergeMode.Default);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        UserProfileAdapterItem.PromoButtons.a aVar = (UserProfileAdapterItem.PromoButtons.a) obj;
        ((zak0) this.r).setValue(aVar.b);
        ((zak0) this.o).setValue(aVar.d);
        ((zak0) this.p).setValue(aVar.e);
        ((zak0) this.q).setValue(new l5g(f870.c(aVar.f)));
    }

    @Override // xsna.dri
    public final void q6(int i, androidx.compose.runtime.a aVar) {
        lg90 l;
        androidx.compose.runtime.a M = aVar.M(-1442703800);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1442703800, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.UserProfilePromoButtonViewHolder.Content (UserProfilePromoButtonViewHolder.kt:55)");
            }
            String str = (String) ((zak0) this.p).getValue();
            String str2 = (String) ((zak0) this.o).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-569574192, 0, -1, "com.vk.profile.user.impl.ui.adapter.holders.contentIcon (UserProfilePromoButtonViewHolder.kt:115)");
            }
            if (str2 == null) {
                M.K(1231110342);
                M.j();
                l = null;
            } else {
                M.K(1231110343);
                l = fwu0.l(str2, null, null, null, M, 0, 62);
                M.j();
            }
            if (l == null) {
                l = new y6g(l5g.j);
            }
            lg90 lg90Var = l;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            uog0 O = znk0.O((MergeMode) ((zak0) this.r).getValue());
            long j = ((l5g) ((zak0) this.q).getValue()).a;
            q630 z = txj0.z(txj0.f(q630.a.a, 1.0f), null, 3);
            boolean y = M.y(this);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new y3l0(this, 15);
                M.R(x);
            }
            ztq0.a(str, lg90Var, O, (gzs) x, z, j, 0L, M, 64);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new nx7(this, i, 15);
        }
    }
}
