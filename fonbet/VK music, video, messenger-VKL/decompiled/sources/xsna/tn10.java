package xsna;

import android.view.View;
import com.vk.libvideo.api.ui.VideoResizer;

/* compiled from: MatrixProvider.kt */
/* loaded from: classes2.dex */
public interface tn10 {
    View b();

    int getContentHeight();

    VideoResizer.VideoFitType getContentScaleType();

    int getContentWidth();

    void l(int i, int i2);

    void setContentScaleType(VideoResizer.VideoFitType videoFitType);
}
