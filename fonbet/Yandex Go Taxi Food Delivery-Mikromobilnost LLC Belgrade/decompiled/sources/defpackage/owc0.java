package defpackage;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;

/* loaded from: classes4.dex */
public final class owc0 implements qwc0 {
    public final SurfaceView a;

    public owc0(Context context, ExoPlayer exoPlayer) {
        SurfaceView surfaceView = new SurfaceView(context);
        this.a = surfaceView;
        exoPlayer.setVideoSurfaceView(surfaceView);
    }

    @Override // defpackage.qwc0
    public final void dispose() {
        this.a.getHolder().getSurface().release();
    }

    @Override // defpackage.qwc0
    public final View getView() {
        return this.a;
    }
}
