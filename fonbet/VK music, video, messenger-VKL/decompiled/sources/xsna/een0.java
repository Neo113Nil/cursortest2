package xsna;

import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.video.VideoCatalogAlbumBottomSheet;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.model.web.ClipBox;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.log.L;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipSelectVideoPlaylistsFragment;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.egp0;
import xsna.jto0;
import xsna.p0x0;
import xsna.ru70;
import xsna.uu70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class een0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ een0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                gen0 gen0Var = (gen0) obj3;
                fen0 fen0Var = (fen0) obj2;
                fen0Var.p.b(fen0Var.itemView.getContext(), gen0Var.h.o.b, gen0Var, null);
                return s3q0.a;
            case 1:
                ((i0b0) obj3).invoke(jto0.b.a((jto0.b) obj2, null, null, null, null, ((Boolean) obj).booleanValue(), null, false, false, false, false, null, false, false, false, null, false, 65519));
                return s3q0.a;
            case 2:
                ((xfp0) obj3).V(egp0.a.C2808a.b, (MusicTrack) obj2);
                return s3q0.a;
            case 3:
                o7q0 o7q0Var = (o7q0) obj3;
                ((Long) obj).longValue();
                float f = o7q0Var.e;
                o7q0Var.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                ((izs) obj2).invoke(Float.valueOf(f));
                return s3q0.a;
            case 4:
                return UserProfileHeaderView.P4((UserProfileHeaderView) obj3, (VkOnboardingCampaign) obj2, ((Boolean) obj).booleanValue());
            case 5:
                iur0 iur0Var = (iur0) obj3;
                gk30 gk30Var = (gk30) obj2;
                mkr0 mkr0Var = iur0Var.l;
                Dialog dialog = gk30Var.b;
                int i2 = gk30Var.d.d;
                iur0Var.getAdapterPosition();
                mkr0Var.Y(dialog, i2);
                return s3q0.a;
            case 6:
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) obj3;
                uu70.b bVar = (uu70.b) obj2;
                int intValue = ((Integer) obj).intValue();
                if (videoAutoPlay.F != null) {
                    new su70(new ru70.a(bVar, intValue, videoAutoPlay.u.o0(), videoAutoPlay.u.I0().b)).q();
                }
                return s3q0.a;
            case 7:
                his0.w((TextView) obj3, ((VideoCatalogAlbumBottomSheet.a.EnumC0516a) obj2).h(), R.attr.vk_ui_action_sheet_text);
                L.i((Throwable) obj);
                return s3q0.a;
            case 8:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj2;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && !ref$BooleanRef.element && !gVar.n0) {
                    gVar.n0 = true;
                    gVar.J.b(VideoMinimizableDiscoverySideEffect.f0.a);
                }
                ref$BooleanRef.element = bool.booleanValue();
                return s3q0.a;
            case 9:
                szw0 szw0Var = (szw0) obj3;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) obj2;
                p0x0.b bVar2 = (p0x0.b) obj;
                int i3 = VoipSelectVideoPlaylistsFragment.S;
                if (!(bVar2 instanceof p0x0.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                p0x0.b.a aVar = (p0x0.b.a) bVar2;
                szw0Var.setItems(aVar.a);
                swipeRefreshLayout.setRefreshing(aVar.b);
                return s3q0.a;
            default:
                Long l = (Long) obj3;
                String str = (String) obj2;
                Throwable th = (Throwable) obj;
                L.i(th);
                if (str != null) {
                    fxv0.a.a(new hvv0(l.longValue(), str, new bxv0(th instanceof ClipBox.ClipBoxException ? (ClipBox.ClipBoxException) th : new ClipBox.ClipBoxException(null))));
                }
                return s3q0.a;
        }
    }
}
