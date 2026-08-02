package ru.ok.media.api;

import android.graphics.SurfaceTexture;
import androidx.annotation.Nullable;
import javax.microedition.khronos.opengles.GL10;
import ru.ok.media.video.FrameBuffer;
import xsna.yis0;

/* loaded from: classes9.dex */
public interface PublisherRendererCallback {
    void afterFrameEncode(GL10 gl10, FrameBuffer frameBuffer);

    void afterRenderToFBO(GL10 gl10, FrameBuffer frameBuffer);

    boolean beforeRenderToFBO(GL10 gl10, FrameBuffer frameBuffer, float[] fArr);

    @Nullable
    SurfaceTexture getInputSurfaceTexture();

    int getInputTextureId(GL10 gl10, int i, int i2);

    yis0 getOverriddenEncoderTexture();

    void onVideoSizeChanged(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, int i6);
}
