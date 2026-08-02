package xsna;

import android.view.LayoutInflater;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vkontakte.android.R;
import xsna.av20;

/* compiled from: ClipsDraftController.kt */
/* loaded from: classes16.dex */
public final class lsd implements w8i {
    public final CameraUIView b;
    public final com.vk.cameraui.impl.a c;
    public final jpd d;
    public final kpd e;
    public final StoryCameraParams f;
    public dw20 g;
    public androidx.appcompat.app.d h;
    public final av20<String> i;

    public lsd(CameraUIView cameraUIView, com.vk.cameraui.impl.a aVar, jpd jpdVar, kpd kpdVar) {
        this.b = cameraUIView;
        this.c = aVar;
        this.d = jpdVar;
        this.e = kpdVar;
        this.f = aVar.c;
        av20.a aVar2 = new av20.a();
        aVar2.d(R.layout.actions_popup_item, LayoutInflater.from(cameraUIView.getContext()));
        aVar2.d = new jsd();
        aVar2.f = e43.l(y8g0.e(R.string.clips_save_draft), y8g0.e(R.string.clips_remove_draft));
        aVar2.e = new ksd(this);
        this.i = aVar2.b();
    }
}
