package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import one.video.ad.ux.playpause.PlayPauseFrameView;

/* compiled from: OneVideoPlayPauseFrameViewBinding.java */
/* loaded from: classes8.dex */
public final class nm80 implements xtt0 {

    @NonNull
    public final PlayPauseFrameView a;

    @NonNull
    public final AppCompatImageView b;

    public nm80(@NonNull PlayPauseFrameView playPauseFrameView, @NonNull AppCompatImageView appCompatImageView) {
        this.a = playPauseFrameView;
        this.b = appCompatImageView;
    }

    @Override // xsna.xtt0
    @NonNull
    public final View getRoot() {
        return this.a;
    }
}
