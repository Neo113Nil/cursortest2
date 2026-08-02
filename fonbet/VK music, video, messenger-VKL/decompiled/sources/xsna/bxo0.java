package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.vk.story.viewer.impl.presentation.stories.view.TimelineThumbsView;

/* compiled from: TimelineThumbsView.kt */
/* loaded from: classes6.dex */
public final class bxo0 extends ViewOutlineProvider {
    public final /* synthetic */ TimelineThumbsView a;

    public bxo0(TimelineThumbsView timelineThumbsView) {
        this.a = timelineThumbsView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (outline != null) {
            TimelineThumbsView timelineThumbsView = this.a;
            outline.setRoundRect(0, 0, timelineThumbsView.getWidth(), timelineThumbsView.getHeight(), timelineThumbsView.b);
        }
    }
}
