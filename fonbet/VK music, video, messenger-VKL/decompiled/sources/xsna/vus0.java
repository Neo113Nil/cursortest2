package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class vus0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VideoMinimizableDiscoveryFragment c;

    public /* synthetic */ vus0(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment, int i) {
        this.b = i;
        this.c = videoMinimizableDiscoveryFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r3 != (-1)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        if (r1 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        r1 = r1.intValue();
        r3 = r0.U;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r3 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        r3 = r3.b.g.f.getRecyclerView().getLayoutManager();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        if ((r3 instanceof androidx.recyclerview.widget.LinearLayoutManager) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        r5 = (androidx.recyclerview.widget.LinearLayoutManager) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        if (r5 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
    
        r0.o1 = false;
        r5.K(r1, r0.getResources().getDimensionPixelSize(com.vkontakte.android.R.dimen.video_discovery_catalog_tabs_height));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
    
        r1 = java.lang.Integer.valueOf(r3);
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        com.vk.video.ui.discovery.minimizable.m mVar;
        switch (this.b) {
            case 0:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.c;
                if (videoMinimizableDiscoveryFragment.o1) {
                    if (!videoMinimizableDiscoveryFragment.oo() || (mVar = videoMinimizableDiscoveryFragment.J0) == null || !com.vk.video.ui.discovery.minimizable.m.h(mVar.c()) || !iah0.r(videoMinimizableDiscoveryFragment.requireContext())) {
                        kfs0 kfs0Var = videoMinimizableDiscoveryFragment.G0;
                        if (kfs0Var != null) {
                            Iterator<T> it = kfs0Var.h.f.iterator();
                            int i = 0;
                            while (true) {
                                LinearLayoutManager linearLayoutManager = null;
                                if (!it.hasNext()) {
                                    i = -1;
                                    break;
                                } else {
                                    Object next = it.next();
                                    if (i < 0) {
                                        e43.t();
                                        throw null;
                                    }
                                    if (((hfz) next) instanceof vfs0) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        videoMinimizableDiscoveryFragment.o1 = false;
                    }
                }
                return s3q0.a;
            default:
                VideoMinimizableDiscoveryFragment.b bVar = this.c.U;
                if (bVar == null) {
                    bVar = null;
                }
                return bVar.b.h.a;
        }
    }
}
