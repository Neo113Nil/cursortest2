package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.voip.miniapps.impl.picture_in_picture.overlay.MiniAppCallPiPOverlayService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3g implements gzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Context c;

    public /* synthetic */ d3g(Context context) {
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return new f1g(context);
            default:
                VideoPipStateHolder.a.getClass();
                VideoPipStateHolder.b();
                hf8.b("picture_in_picture_action_close");
                int i2 = MiniAppCallPiPOverlayService.e;
                try {
                    context.stopService(new Intent(context, (Class<?>) MiniAppCallPiPOverlayService.class));
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.q(th);
                }
                return s3q0.a;
        }
    }
}
