package xsna;

import android.content.Context;
import com.vk.core.exceptions.DisposableException;
import com.vk.im.channelcreation.impl.i;
import com.vk.toggle.debug.BaseDebugTogglesFragment;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSnackBarManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig4 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ig4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((ng4) this.c).k.b(null);
                break;
            case 1:
                BaseDebugTogglesFragment baseDebugTogglesFragment = (BaseDebugTogglesFragment) this.c;
                int i = BaseDebugTogglesFragment.X;
                baseDebugTogglesFragment.go("");
                break;
            case 2:
                ((com.vk.im.channelcreation.impl.b) this.c).n(i.a.a);
                break;
            case 3:
                ((com.vk.folders.impl.configure.d) this.c).q(new qm(22));
                break;
            case 4:
                ((aq80) this.c).onError(new DisposableException());
                break;
            case 5:
                p4n0 p4n0Var = (p4n0) this.c;
                Context context = e43.a;
                cuz.a(context != null ? context : null).d(p4n0Var.m);
                p4n0Var.s().w().g(p4n0Var.j);
                p4n0Var.s().w().g(p4n0Var.l);
                p4n0Var.s().w().g(p4n0Var.k);
                break;
            case 6:
                ((l4o0) this.c).k = false;
                break;
            case 7:
                ikv0 ikv0Var = ((dgs0) this.c).b;
                if (ikv0Var != null) {
                    ikv0Var.a();
                    break;
                }
                break;
            default:
                ikv0 ikv0Var2 = ((VideoDiscoveryRelatedVideosSnackBarManager) this.c).b;
                if (ikv0Var2 != null) {
                    ikv0Var2.a();
                    break;
                }
                break;
        }
    }
}
