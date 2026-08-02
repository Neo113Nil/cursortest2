package xsna;

import com.vk.friends.discover.UsersDiscoverPresenter;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.log.L;
import xsna.svq0;
import xsna.yau0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class xvq0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xvq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                zvq0 zvq0Var = (zvq0) obj2;
                Throwable th = (Throwable) obj;
                if (((dwq0) zvq0Var.b.getCurrentState()).q.b.a.isEmpty()) {
                    zvq0Var.c(svq0.b.n.a);
                }
                zvq0Var.t();
                L.e(th);
                com.vk.metrics.eventtracking.b.a.a(th);
                break;
            case 1:
                ((UsersDiscoverPresenter.c) obj2).invoke(obj);
                break;
            case 2:
                ((d6c) obj2).invoke(obj);
                break;
            case 3:
                ((ecs0) obj2).invoke(obj);
                break;
            case 4:
                ((wo40) obj2).invoke(obj);
                break;
            case 5:
                qcy<Object>[] qcyVarArr = VideoView.T0;
                ((bqt0) obj2).invoke(obj);
                break;
            case 6:
                ((yau0.d.a) obj2).invoke(obj);
                break;
            case 7:
                ((d6c) obj2).invoke(obj);
                break;
            case 8:
                ((wo40) obj2).invoke(obj);
                break;
            case 9:
                ((z8l0) obj2).invoke(obj);
                break;
            case 10:
                ((v6w0) obj2).invoke(obj);
                break;
            case 11:
                ((z8l0) obj2).invoke(obj);
                break;
            case 12:
                ((omw0) obj2).invoke(obj);
                break;
            default:
                ((izs) obj2).invoke(obj);
                break;
        }
    }
}
