package xsna;

import androidx.compose.ui.platform.ComposeView;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import kotlin.collections.EmptyList;

/* compiled from: UserProfileLegoCustomBadgeViewHolder.kt */
/* loaded from: classes5.dex */
public final class xqq0 extends dri<UserProfileAdapterItem.j.b> {
    public static final a p = new a();
    public final slq0 n;
    public final wh50 o;

    /* compiled from: UserProfileLegoCustomBadgeViewHolder.kt */
    public static final class a extends eri<xqq0> {
        @Override // xsna.eri
        public final dri a(ComposeView composeView, slq0 slq0Var, zuq0 zuq0Var) {
            return new xqq0(composeView, slq0Var);
        }
    }

    public xqq0(ComposeView composeView, slq0 slq0Var) {
        super(composeView);
        this.n = slq0Var;
        this.o = androidx.compose.runtime.k.b(EmptyList.b);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        ((UserProfileAdapterItem.j.b) obj).getClass();
        ((zak0) this.o).setValue(new wow(null));
    }

    @Override // xsna.dri
    public final void q6(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(63889387);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(63889387, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.lego.UserProfileLegoCustomBadgeViewHolder.Content (UserProfileLegoCustomBadgeViewHolder.kt:37)");
            }
            rrv0.a(null, null, kai.c(1026265747, new b47(this), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ce0(this, i, 10);
        }
    }

    public final void s6(UserProfileAdapterItem.j.b.a aVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(21119763);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(21119763, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.lego.UserProfileLegoCustomBadgeViewHolder.BadgeItem (UserProfileLegoCustomBadgeViewHolder.kt:50)");
            }
            if (oq.h(2111608655, M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p70(this, aVar, i, 5);
        }
    }
}
