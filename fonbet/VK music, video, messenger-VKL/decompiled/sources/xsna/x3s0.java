package xsna;

import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.vk.core.view.links.LinkedTextView;
import com.vk.newsfeed.common.views.video.VideoAutoPlayHolderView;

/* compiled from: VideoAutoPlayHolderWithFooterView.kt */
/* loaded from: classes4.dex */
public final class x3s0 extends LinearLayout {
    public VideoAutoPlayHolderView b;
    public Space c;
    public TextView d;
    public TextView e;
    public LinkedTextView f;

    public final VideoAutoPlayHolderView getVideoAutoPlayHolderView() {
        VideoAutoPlayHolderView videoAutoPlayHolderView = this.b;
        if (videoAutoPlayHolderView != null) {
            return videoAutoPlayHolderView;
        }
        return null;
    }

    public final LinkedTextView getVideoFooterDescription() {
        LinkedTextView linkedTextView = this.f;
        if (linkedTextView != null) {
            return linkedTextView;
        }
        return null;
    }

    public final Space getVideoFooterSpace() {
        Space space = this.c;
        if (space != null) {
            return space;
        }
        return null;
    }

    public final TextView getVideoFooterSubtitle() {
        TextView textView = this.e;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    public final TextView getVideoFooterTitle() {
        TextView textView = this.d;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    public final void setVideoAutoPlayHolderView(VideoAutoPlayHolderView videoAutoPlayHolderView) {
        this.b = videoAutoPlayHolderView;
    }

    public final void setVideoFooterDescription(LinkedTextView linkedTextView) {
        this.f = linkedTextView;
    }

    public final void setVideoFooterSpace(Space space) {
        this.c = space;
    }

    public final void setVideoFooterSubtitle(TextView textView) {
        this.e = textView;
    }

    public final void setVideoFooterTitle(TextView textView) {
        this.d = textView;
    }
}
