package xsna;

import androidx.compose.ui.platform.ComposeView;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;

/* compiled from: UserProfileLegoPostingViewHolder.kt */
/* loaded from: classes5.dex */
public final class drq0 extends dri<UserProfileAdapterItem.j.c> {
    public static final a p = new a();
    public final slq0 n;
    public final wh50 o;

    /* compiled from: UserProfileLegoPostingViewHolder.kt */
    public static final class a extends eri<drq0> {
        @Override // xsna.eri
        public final dri a(ComposeView composeView, slq0 slq0Var, zuq0 zuq0Var) {
            return new drq0(composeView, slq0Var);
        }
    }

    public drq0(ComposeView composeView, slq0 slq0Var) {
        super(composeView);
        this.n = slq0Var;
        this.o = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        ((zak0) this.o).setValue((UserProfileAdapterItem.j.c) obj);
    }

    @Override // xsna.dri
    public final void q6(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-2098527381);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2098527381, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.lego.UserProfileLegoPostingViewHolder.Content (UserProfileLegoPostingViewHolder.kt:41)");
            }
            rrv0.a(null, null, kai.c(1708711443, new nrb(5), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x76(this, i, 12);
        }
    }
}
