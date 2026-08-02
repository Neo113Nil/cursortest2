package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attaches.CarouselRatio;
import com.vk.music.player.PlayerAction;
import java.util.List;

/* compiled from: BroadcastFriendsView.kt */
/* loaded from: classes16.dex */
public final class jg8 implements ixj {
    public final Object b;
    public Object c;

    public /* synthetic */ jg8(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    public boolean a() {
        com.vk.music.player.f H = ((u2b0) this.b).H();
        return H == null || !H.l(PlayerAction.changeTrackNext);
    }

    public boolean b() {
        com.vk.music.player.f H = ((u2b0) this.b).H();
        return H == null || !H.l(PlayerAction.changeTrackPrev);
    }

    @Override // xsna.ixj
    public void e(yzs yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1593890405);
        if ((i & 6) == 0) {
            i2 = (M.y(yzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1593890405, i2, -1, "com.vk.clips.design.view.BroadcastFriendsView.setPrivacyInfoCellContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (BroadcastFriendsView.kt:148)");
            }
            yzsVar.invoke(Integer.valueOf(((Integer) this.b).intValue() - ((List) this.c).size()), M, Integer.valueOf((i2 << 3) & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ig8(this, yzsVar, i, 0);
        }
    }

    public jg8(hpt0 hpt0Var) {
        this.b = hpt0Var;
        this.c = new CarouselRatio(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, null);
    }
}
