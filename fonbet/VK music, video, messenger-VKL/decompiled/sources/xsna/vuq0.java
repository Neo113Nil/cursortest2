package xsna;

import androidx.compose.ui.platform.ComposeView;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;

/* compiled from: UserProfileServiceInfoViewHolder.kt */
/* loaded from: classes5.dex */
public final class vuq0 extends dri<UserProfileAdapterItem.r> {
    public static final a o = new a();
    public final wh50 n;

    /* compiled from: UserProfileServiceInfoViewHolder.kt */
    public static final class a extends eri<vuq0> {
        @Override // xsna.eri
        public final dri a(ComposeView composeView, slq0 slq0Var, zuq0 zuq0Var) {
            return new vuq0(composeView);
        }
    }

    public vuq0(ComposeView composeView) {
        super(composeView);
        this.n = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        UserProfileAdapterItem.r rVar = (UserProfileAdapterItem.r) obj;
        ((zak0) this.n).setValue(rVar != null ? rVar.c : null);
    }

    @Override // xsna.dri
    public final void q6(int i, androidx.compose.runtime.a aVar) {
        us2 j;
        androidx.compose.runtime.a M = aVar.M(1389664900);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1389664900, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.UserProfileServiceInfoViewHolder.Content (UserProfileServiceInfoViewHolder.kt:27)");
            }
            s8u0 s8u0Var = (s8u0) ((zak0) this.n).getValue();
            if (s8u0Var == null) {
                M.K(317439978);
                M.j();
                j = null;
            } else {
                M.K(-266854665);
                j = s8u0Var.j(8, M);
                M.j();
            }
            uuq0.a(j, M, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ce0(this, i, 11);
        }
    }
}
