package xsna;

import androidx.compose.ui.platform.ComposeView;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;

/* compiled from: UserProfileLegoServiceInfoViewHolder.kt */
/* loaded from: classes5.dex */
public final class grq0 extends dri<UserProfileAdapterItem.j.e> {
    public static final a o = new a();
    public final wh50 n;

    /* compiled from: UserProfileLegoServiceInfoViewHolder.kt */
    public static final class a extends eri<grq0> {
        @Override // xsna.eri
        public final dri a(ComposeView composeView, slq0 slq0Var, zuq0 zuq0Var) {
            return new grq0(composeView);
        }
    }

    public grq0(ComposeView composeView) {
        super(composeView);
        this.n = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        ((zak0) this.n).setValue(null);
    }

    @Override // xsna.dri
    public final void q6(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> nw6Var;
        androidx.compose.runtime.a M = aVar.M(-1440354805);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1440354805, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.lego.UserProfileLegoServiceInfoViewHolder.Content (UserProfileLegoServiceInfoViewHolder.kt:27)");
            }
            if (((s8u0) ((zak0) this.n).getValue()) == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    nw6Var = new w1(this, i, 9);
                    s.d = nw6Var;
                }
                return;
            }
            rrv0.a(null, null, kai.c(-477978445, new nq2((byte) 0, 12), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            nw6Var = new nw6(this, i, 11);
            s.d = nw6Var;
        }
    }
}
