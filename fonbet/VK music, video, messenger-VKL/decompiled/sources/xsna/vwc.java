package xsna;

import android.graphics.Bitmap;
import android.view.View;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import java.lang.ref.SoftReference;
import one.video.transform.TransformController;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class vwc implements View.OnLayoutChangeListener {
    public final /* synthetic */ twc b;
    public final /* synthetic */ VideoFile c;

    public vwc(twc twcVar, VideoFile videoFile) {
        this.b = twcVar;
        this.c = videoFile;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        twc twcVar = this.b;
        VideoTextureView video = twcVar.getVideo();
        TransformController.ScaleType T4 = twcVar.T4(this.c);
        SoftReference<Bitmap> softReference = VideoTextureView.r;
        video.i(T4, false);
    }
}
