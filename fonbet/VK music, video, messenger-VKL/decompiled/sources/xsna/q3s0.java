package xsna;

import android.view.View;
import com.vk.api.generated.catalog.dto.CatalogCatalogDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.catalog.dto.CatalogSectionDto;
import com.vk.auth.passport.VkPassportView;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.video.profile.presentation.views.VideoNewProfileToolbarV2;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Portrait;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import java.util.List;
import kotlin.Triple;
import xsna.f6x0;
import xsna.sqt0;
import xsna.xcw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class q3s0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q3s0(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment, dns0 dns0Var) {
        this.b = 1;
        this.c = videoMinimizableDiscoveryFragment;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        yks0 yks0Var;
        List<CatalogSectionDto> j;
        CatalogSectionDto catalogSectionDto;
        List<CatalogSectionDto> j2;
        CatalogSectionDto catalogSectionDto2;
        int i = this.b;
        r1 = null;
        r1 = null;
        String str = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                t3s0 t3s0Var = (t3s0) obj2;
                t3s0Var.itemView.post(new d8h(6, t3s0Var, (ups0) obj));
                break;
            case 1:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj2;
                nb30 nb30Var = (nb30) obj;
                MiniPlayerControllersWrapper miniPlayerControllersWrapper = videoMinimizableDiscoveryFragment.X;
                VideoFile videoFile = (miniPlayerControllersWrapper == null || (yks0Var = miniPlayerControllersWrapper.t) == null) ? null : yks0Var.e;
                com.vk.video.ui.discovery.minimizable.m mVar = videoMinimizableDiscoveryFragment.J0;
                VideoMinimizableState f = mVar != null ? mVar.f(nb30Var) : null;
                dns0.a(videoFile, f != null ? Boolean.valueOf(com.vk.libvideo.api.minimizable.a.g(f)) : null, true);
                if (nb30Var == DiscoveryScreenMotionStates$Portrait.Discovery && videoMinimizableDiscoveryFragment.s0.a) {
                    videoMinimizableDiscoveryFragment.ro();
                }
                break;
            case 2:
                int i2 = VideoNewProfileToolbarV2.m;
                ((stg0) obj2).invoke();
                break;
            case 3:
                qcy<Object>[] qcyVarArr = VideoView.T0;
                ne7.w((View) obj, (VideoFile) obj2);
                break;
            case 4:
                sqt0 sqt0Var = (sqt0) obj2;
                Triple triple = (Triple) obj;
                Long l = (Long) triple.d();
                boolean booleanValue = ((Boolean) triple.g()).booleanValue();
                sqt0.c cVar = (sqt0.c) triple.h();
                VideoSkippablePartView.m(sqt0Var.o0, l, false, booleanValue, false, 10);
                if (!((Boolean) sqt0Var.u.getValue()).booleanValue() && !((Boolean) sqt0Var.m.getValue()).booleanValue()) {
                    sqt0Var.o0.u(x19.M(sqt0Var.j0));
                    sqt0Var.C.setButtonsVisibilityList(sqt0Var.k(cVar));
                    sqt0Var.j(null);
                }
                break;
            case 5:
                reu0 reu0Var = ((VkPassportView) obj2).z;
                seu0 seu0Var = reu0Var.b;
                gzs<Boolean> gzsVar = reu0Var.h;
                rr1 rr1Var = seu0Var.a;
                Object obj3 = rr1Var.c;
                d0h0.a(SchemeStatSak$TypeVkConnectNavigationItem.EventType.CLICK_ENTER_LK, (String) rr1Var.a, (String) rr1Var.b);
                break;
            case 6:
                rw0 rw0Var = (rw0) obj2;
                CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto = (CatalogCatalogResponseObjectDto) obj;
                CatalogCatalogDto F = catalogCatalogResponseObjectDto.F();
                String id = (F == null || (j2 = F.j()) == null || (catalogSectionDto2 = (CatalogSectionDto) j5g.a0(j2)) == null) ? null : catalogSectionDto2.getId();
                CatalogCatalogDto F2 = catalogCatalogResponseObjectDto.F();
                if (F2 != null && (j = F2.j()) != null && (catalogSectionDto = (CatalogSectionDto) j5g.a0(j)) != null) {
                    str = catalogSectionDto.l();
                }
                break;
            case 7:
                ((nrw0) obj2).q(xcw0.u.a);
                break;
            case 8:
                int i3 = y5x0.l1;
                ((f6x0) obj2).n.onNext(f6x0.b.LOADING);
                break;
            default:
                xkx0 xkx0Var = (xkx0) obj2;
                xkx0Var.A0(xkx0Var.x.b, (VkAuthValidatePhoneResult) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ q3s0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
