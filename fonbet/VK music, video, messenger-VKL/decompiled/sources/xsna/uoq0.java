package xsna;

import androidx.compose.ui.platform.ComposeView;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;

/* compiled from: UserProfileDonutBannerViewHolder.kt */
/* loaded from: classes5.dex */
public final class uoq0 extends dri<UserProfileAdapterItem.c> {
    public static final a p = new a();
    public final toq0 n;
    public final wh50 o;

    /* compiled from: UserProfileDonutBannerViewHolder.kt */
    public static final class a extends eri<uoq0> {
        @Override // xsna.eri
        public final dri a(ComposeView composeView, slq0 slq0Var, zuq0 zuq0Var) {
            return new uoq0(composeView, new toq0(1, slq0Var, slq0.class, "send", "send(Lcom/vk/profile/user/impl/ui/UserProfileAction;)V", 0));
        }
    }

    public uoq0(ComposeView composeView, toq0 toq0Var) {
        super(composeView);
        this.n = toq0Var;
        this.o = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        UserProfileAdapterItem.c cVar = (UserProfileAdapterItem.c) obj;
        ((zak0) this.o).setValue(cVar != null ? cVar.c : null);
        this.n.invoke(UserProfileAction.DonutBanner.c.b);
    }

    @Override // xsna.dri
    public final void q6(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(2001408174);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2001408174, i2, -1, "com.vk.profile.user.impl.ui.adapter.holders.UserProfileDonutBannerViewHolder.Content (UserProfileDonutBannerViewHolder.kt:48)");
            }
            hyn hynVar = (hyn) ((zak0) this.o).getValue();
            if (hynVar == null) {
                M.K(1214987768);
            } else {
                M.K(1214987769);
                voq0.a(hynVar, this.n, M, 384);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u61(this, i, 13);
        }
    }
}
