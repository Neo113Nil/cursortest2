package xsna;

import android.app.Activity;
import com.vk.core.view.components.subnavigation.VkSubnavigationBar;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.q;
import com.vk.video.ui.discovery.minimizable.s;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import java.util.List;
import xsna.f1s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class cdr0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cdr0(int i, Object obj, Object obj2) {
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
                ddr0 ddr0Var = (ddr0) obj3;
                fvv0 fvv0Var = ddr0Var.b;
                fvv0Var.C((WebApiApplication) obj);
                ((nrq0) obj2).invoke();
                xc80 xc80Var = ddr0Var.f;
                xc80Var.t(false);
                xc80Var.w();
                VkBridgeAnalytics E = fvv0Var.E();
                if (E != null) {
                    E.j(VkBridgeAnalytics.InstallScreenEvent.OPEN);
                }
                break;
            case 1:
                int i2 = VideoAlbumEditorFragment.l0;
                VideoAlbumEditorFragment.b.a((UserId) obj3).m(new f1s0.a((Activity) obj2));
                break;
            default:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj3;
                s.a aVar = (s.a) obj2;
                List<q.a> list = (List) obj;
                ags0 ags0Var = videoMinimizableDiscoveryFragment.C0;
                if (ags0Var != null) {
                    q.a a = aVar.l.a();
                    VkSubnavigationBar vkSubnavigationBar = ags0Var.b;
                    ags0Var.n.b(a, list);
                    ags0Var.o.b(a, list);
                    if (list.isEmpty()) {
                        ags0Var.i = true;
                        vkSubnavigationBar.setVisibility(8);
                        ags0Var.a.setTranslationY(-ags0Var.f);
                    } else {
                        vkSubnavigationBar.setVisibility(0);
                        ags0Var.i = false;
                        ags0Var.a();
                    }
                }
                znj0 znj0Var = videoMinimizableDiscoveryFragment.B0;
                if (znj0Var != null) {
                    q.a a2 = aVar.l.a();
                    if (gsi0.b().e) {
                        mha mhaVar = znj0Var.i;
                        if (mhaVar == null) {
                            mhaVar = null;
                        }
                        mhaVar.b(a2, list);
                        bwt0.p0(znj0Var.h().f, !list.isEmpty());
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
