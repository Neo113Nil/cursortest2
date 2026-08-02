package xsna;

import android.view.View;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;
import com.vk.core.view.StaticMapView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSource;
import xsna.e260;
import xsna.zjn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zq5 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zq5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentHashMap concurrentHashMap;
        switch (this.b) {
            case 0:
                ((ar5) this.c).d.setProgress(((ClipsInterestsViewState.d) this.d).b.b);
                break;
            case 1:
                ((sjd) this.c).d.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(u11.f(tlo0.Companion, (CharSequence) this.d), null, null, null, null, 30), null, 0 == true ? 1 : 0, com.vk.core.compose.component.semantics.b.a(null, new tr0(4), 3), 6));
                break;
            case 2:
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) this.c;
                CommunityAddressesFragment.b bVar = (CommunityAddressesFragment.b) this.d;
                VkBottomSheetBehavior<View> vkBottomSheetBehavior = communityAddressesFragment.v0;
                if (vkBottomSheetBehavior == null) {
                    vkBottomSheetBehavior = null;
                }
                vkBottomSheetBehavior.J(3);
                VkBottomSheetBehavior<View> vkBottomSheetBehavior2 = communityAddressesFragment.v0;
                (vkBottomSheetBehavior2 != null ? vkBottomSheetBehavior2 : null).q = bVar;
                break;
            case 3:
                e260 e260Var = (e260) this.c;
                qv10 qv10Var = (qv10) this.d;
                e260.b bVar2 = e260Var.b.get(qv10Var.a);
                if (bVar2 != null) {
                    bVar2.b = qv10Var;
                }
                e260.b bVar3 = e260Var.b.get(qv10Var.a);
                if (bVar3 != null && (concurrentHashMap = bVar3.a) != null) {
                    Iterator it = concurrentHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        e260Var.c((am4) ((Map.Entry) it.next()).getKey());
                    }
                    break;
                }
                break;
            case 4:
                StaticMapView.a((StaticMapView) this.c, (izs) this.d);
                break;
            case 5:
                ((v5d0) this.c).a((zjn0.g) this.d);
                break;
            case 6:
                qoo0 qoo0Var = (qoo0) this.c;
                zjn0 zjn0Var = (zjn0) this.d;
                zjn0 zjn0Var2 = qoo0Var.g;
                if (zjn0Var2 != null && zjn0Var2 == zjn0Var) {
                    qoo0Var.g = null;
                    qoo0Var.f = null;
                }
                w5d0 w5d0Var = qoo0Var.k;
                if (w5d0Var != null) {
                    w5d0Var.a();
                    qoo0Var.k = null;
                    break;
                }
                break;
            case 7:
                ((VideoSource) this.c).lambda$setVideoProcessor$0((VideoFrame) this.d);
                break;
            case 8:
                com.vk.writebar.d dVar = (com.vk.writebar.d) this.c;
                com.vk.writebar.g gVar = (com.vk.writebar.g) this.d;
                if (dVar.c && gVar.b.getState().f) {
                    h1y0 h1y0Var = gVar.d;
                    if (h1y0Var != null) {
                        h1y0Var.c(true);
                    }
                    gVar.b.m0();
                }
                dVar.c = false;
                break;
            default:
                ((yads.q92) this.c).a((yads.o92) this.d);
                break;
        }
    }
}
