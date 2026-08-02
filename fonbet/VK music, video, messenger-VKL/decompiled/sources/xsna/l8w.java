package xsna;

import android.view.View;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.live.impl.dialog.LiveVideoDialog;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import xsna.dbi0;
import xsna.kyd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l8w implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l8w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((fh1) obj2).invoke(obj);
                break;
            case 1:
                ((iou) obj2).invoke(obj);
                break;
            case 2:
                float f = ListGroupCallView.o0;
                ((ListGroupCallView.a) obj2).invoke(obj);
                break;
            case 3:
                LiveVideoDialog liveVideoDialog = (LiveVideoDialog) obj2;
                int i2 = LiveVideoDialog.B0;
                tn10 lo = liveVideoDialog.lo();
                View b = lo != null ? lo.b() : null;
                if (b instanceof VideoTextureView) {
                    ((VideoTextureView) b).e();
                }
                liveVideoDialog.j0.post(new fs2(liveVideoDialog, 9));
                break;
            case 4:
                ((t710) obj2).e(new w610((Throwable) obj));
                break;
            case 5:
                ((com.vk.ml.c) obj2).invoke(obj);
                break;
            case 6:
                ((x4c) obj2).invoke(obj);
                break;
            case 7:
                ((iou) obj2).invoke(obj);
                break;
            case 8:
                ((iou) obj2).invoke(obj);
                break;
            case 9:
                ((iou) obj2).invoke(obj);
                break;
            case 10:
                ((ix50) obj2).invoke(obj);
                break;
            case 11:
                ((leq) obj2).invoke(obj);
                break;
            case 12:
                ((agh) obj2).invoke(obj);
                break;
            case 13:
                ((iou) obj2).invoke(obj);
                break;
            case 14:
                ((leq) obj2).invoke(obj);
                break;
            case 15:
                ((agh) obj2).invoke(obj);
                break;
            case 16:
                ((fda0) obj2).invoke(obj);
                break;
            case 17:
                ((fh1) obj2).invoke(obj);
                break;
            case 18:
                ((kyd0.a) obj2).invoke(obj);
                break;
            case 19:
                ((izs) obj2).invoke(obj);
                break;
            case 20:
                ((dbi0.b.a) obj2).invoke(obj);
                break;
            case 21:
                ((fda0) obj2).invoke(obj);
                break;
            case 22:
                ((p8) obj2).invoke(obj);
                break;
            case 23:
                ((fda0) obj2).invoke(obj);
                break;
            case 24:
                ((h3e0) obj2).invoke(obj);
                break;
            case 25:
                ((fh1) obj2).invoke(obj);
                break;
            case 26:
                ((fda0) obj2).invoke(obj);
                break;
            case 27:
                ((fda0) obj2).invoke(obj);
                break;
            case 28:
                ((h3e0) obj2).invoke(obj);
                break;
            default:
                ((fh1) obj2).invoke(obj);
                break;
        }
    }
}
