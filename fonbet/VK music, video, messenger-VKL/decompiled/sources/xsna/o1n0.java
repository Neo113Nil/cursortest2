package xsna;

import android.graphics.RectF;
import android.view.View;
import com.vk.clips.viewer.impl.feed.view.subs.ClipsCanvasSubtitleView;

/* compiled from: SubtitlesTouchDelegate.kt */
/* loaded from: classes17.dex */
public final class o1n0 {
    public View.OnClickListener a;
    public final RectF b = new RectF();

    public o1n0(ClipsCanvasSubtitleView clipsCanvasSubtitleView) {
        clipsCanvasSubtitleView.setOnTouchListener(new n1n0(this));
    }
}
