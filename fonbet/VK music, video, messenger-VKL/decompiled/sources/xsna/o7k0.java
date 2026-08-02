package xsna;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.superapp.ui.widgets.SuperAppShowcaseConfirmNumberWidget;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import xsna.aiq0;
import xsna.rhw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o7k0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o7k0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                MusicTrack musicTrack = (MusicTrack) obj;
                try {
                    g9o g9oVar = ((p7k0) obj2).b;
                    if (g9oVar != null) {
                        g9oVar.Q(musicTrack);
                    }
                } catch (Throwable unused) {
                }
                break;
            case 1:
                break;
            case 2:
                kdn0 kdn0Var = (kdn0) obj2;
                ldn0 ldn0Var = (ldn0) obj;
                u7n0 u7n0Var = kdn0Var.p;
                SuperAppShowcaseConfirmNumberWidget superAppShowcaseConfirmNumberWidget = ldn0Var.e;
                u7n0Var.e0(superAppShowcaseConfirmNumberWidget.j, superAppShowcaseConfirmNumberWidget.o.i);
                u7n0Var.D0(new yk(12, kdn0Var, ldn0Var), new m84(16, kdn0Var, ldn0Var));
                break;
            case 3:
                nek0 nek0Var = (nek0) obj2;
                izs izsVar = (izs) obj;
                if (nek0Var != null) {
                    nek0Var.hide();
                }
                izsVar.invoke(aiq0.h.b.b);
                break;
            case 4:
                qcy<Object>[] qcyVarArr = VideoView.T0;
                fxc0.B().d((VideoFile) obj2);
                yg5 yg5Var = ((VideoView) obj).I;
                if (yg5Var != null) {
                    yg5Var.play();
                }
                break;
            case 5:
                qow qowVar = (qow) obj;
                String str = (String) ((gzs) obj2).invoke();
                if (str != null) {
                    ImageRequestBuilder h = ImageRequestBuilder.h(Uri.parse(str));
                    h.k = qowVar != null ? (ktc0) qowVar.a : null;
                    break;
                }
                break;
            case 6:
                int i2 = VoipCallServiceFragment.Y;
                xn50.a.c((VoipCallServiceFragment) obj2, new rhw0.g((shw0) obj));
                break;
            default:
                ComponentCallbacks2 componentCallbacks2 = (Activity) obj;
                u1u0.b((ner0) obj2);
                if (componentCallbacks2 instanceof ey50) {
                    ((ey50) componentCallbacks2).Y().K(null);
                }
                break;
        }
        return s3q0.a;
    }
}
