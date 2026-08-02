package xsna;

import android.view.MotionEvent;
import android.view.View;
import one.video.player.OneVideoPlayer;

/* compiled from: VideoDebugView.kt */
/* loaded from: classes2.dex */
public interface fes0 {
    boolean a(MotionEvent motionEvent);

    View b();

    void setOnHideBtnClickListener(View.OnClickListener onClickListener);

    void setPlayer(OneVideoPlayer oneVideoPlayer);

    void setVideoDebugInfo(ces0 ces0Var);
}
