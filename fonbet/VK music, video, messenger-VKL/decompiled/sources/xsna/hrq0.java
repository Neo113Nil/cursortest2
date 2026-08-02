package xsna;

import androidx.compose.ui.platform.ComposeView;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;

/* compiled from: UserProfileLegoSilentBannerViewHolder.kt */
/* loaded from: classes5.dex */
public final class hrq0 extends dri<UserProfileAdapterItem.j.f> {
    public static final a p = new a();
    public final slq0 n;
    public final wh50 o;

    /* compiled from: UserProfileLegoSilentBannerViewHolder.kt */
    public static final class a extends eri<hrq0> {
        @Override // xsna.eri
        public final dri a(ComposeView composeView, slq0 slq0Var, zuq0 zuq0Var) {
            return new hrq0(composeView, slq0Var);
        }
    }

    public hrq0(ComposeView composeView, slq0 slq0Var) {
        super(composeView);
        this.n = slq0Var;
        this.o = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        ((zak0) this.o).setValue(null);
    }

    @Override // xsna.dri
    public final void q6(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> z77Var;
        androidx.compose.runtime.a M = aVar.M(-1021790697);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1021790697, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.lego.UserProfileLegoSilentBannerViewHolder.Content (UserProfileLegoSilentBannerViewHolder.kt:35)");
            }
            if (((String) ((zak0) this.o).getValue()) == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    z77Var = new a86(this, i, 16);
                    s.d = z77Var;
                }
                return;
            }
            rrv0.a(null, null, kai.c(403922623, new g6g(2), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            z77Var = new z77(this, i, 14);
            s.d = z77Var;
        }
    }
}
