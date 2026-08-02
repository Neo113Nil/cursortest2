package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import xsna.ihz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class hhz implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hhz(Object obj, int i, Object obj2, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.e;
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ihz.a aVar = (ihz.a) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    ihz.c cVar = (ihz.c) it.next();
                    if (!cVar.d) {
                        if (i2 != -1) {
                            cVar.b.a(i2);
                        }
                        cVar.c = true;
                        aVar.invoke(cVar.a);
                    }
                }
                break;
            default:
                int i3 = VideoMinimizableDiscoveryFragment.p1;
                rvs0 rvs0Var = new rvs0(((VideoMinimizableDiscoveryFragment) obj2).mo2getContext());
                rvs0Var.setTargetPosition(i2);
                ((LinearLayoutManager) obj).startSmoothScroll(rvs0Var);
                break;
        }
    }
}
