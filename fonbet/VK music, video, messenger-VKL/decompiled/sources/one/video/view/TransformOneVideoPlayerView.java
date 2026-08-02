package one.video.view;

import android.content.Context;
import android.util.AttributeSet;
import one.video.player.OneVideoPlayer;
import one.video.transform.TransformController;
import xsna.bpn0;
import xsna.ozl;
import xsna.qah0;

/* compiled from: TransformOneVideoPlayerView.kt */
@ozl
/* loaded from: classes8.dex */
public class TransformOneVideoPlayerView extends OneVideoPlayerView {
    public static final /* synthetic */ int l = 0;
    public final bpn0 k;

    public TransformOneVideoPlayerView(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // one.video.view.OneVideoPlayerView
    public OneVideoPlayer getPlayer() {
        return super.getPlayer();
    }

    public final TransformController getTransformController() {
        return (TransformController) this.k.getValue();
    }

    @Override // one.video.view.OneVideoPlayerView
    public void setPlayer(OneVideoPlayer oneVideoPlayer) {
        super.setPlayer(oneVideoPlayer);
        getTransformController().e(getPlayer());
    }

    public TransformOneVideoPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public TransformOneVideoPlayerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ TransformOneVideoPlayerView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public TransformOneVideoPlayerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.k = new bpn0(new qah0(this, 10));
    }
}
