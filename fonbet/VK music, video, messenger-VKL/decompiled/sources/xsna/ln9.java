package xsna;

import android.content.Context;
import com.vk.content.design.view.camera.CameraUIView;
import java.util.ArrayList;
import java.util.List;
import xsna.xxd0;
import xsna.zbb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ln9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ln9(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        bm9 presenter;
        int i = this.b;
        Object obj2 = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                CameraUIView cameraUIView = (CameraUIView) obj2;
                baf bafVar = cameraUIView.H;
                float f = CameraUIView.w1;
                if (!cameraUIView.getClickLock().a() && !cameraUIView.getShutterLock().a() && (presenter = cameraUIView.getPresenter()) != null && presenter.U3()) {
                    if (z) {
                        bafVar.a();
                        bm9 presenter2 = cameraUIView.getPresenter();
                        if (presenter2 != null) {
                            presenter2.u4();
                        }
                    } else {
                        bafVar.a();
                        bm9 presenter3 = cameraUIView.getPresenter();
                        if (presenter3 != null) {
                            presenter3.u4();
                        }
                    }
                }
                return s3q0.a;
            case 1:
                zbb.b bVar = ((com.vk.channels.impl.channel_screen.send_msg.a) obj2).E;
                (bVar != null ? bVar : null).Kb(z);
                return s3q0.a;
            default:
                Context context = ((ioq0) obj2).b;
                xxd0.b bVar2 = (xxd0.b) obj;
                List<xub> list = bVar2.o;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (Object obj3 : list) {
                    if ((obj3 instanceof yub) && z) {
                        obj3 = new awb(context);
                    } else if ((obj3 instanceof awb) && !z) {
                        obj3 = new yub(context);
                    }
                    arrayList.add(obj3);
                }
                return xxd0.b.a(bVar2, null, arrayList, null, 4177919);
        }
    }

    public /* synthetic */ ln9(boolean z, ioq0 ioq0Var) {
        this.b = 2;
        this.c = z;
        this.d = ioq0Var;
    }
}
