package com.monetization.ads.nativeads.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import defpackage.x071;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB+\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/monetization/ads/nativeads/video/view/CorePlaybackControlsContainer;", "Landroid/widget/FrameLayout;", "Lx071;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class CorePlaybackControlsContainer extends FrameLayout implements x071 {
    public CorePlaybackControlsContainer(Context context) {
        super(context);
    }

    @Override // defpackage.x071
    public TextView getCountDownProgress() {
        return (TextView) findViewById(R$id.video_count_down_control);
    }

    @Override // defpackage.x071
    public CheckBox getMuteControl() {
        return (CheckBox) findViewById(R$id.video_mute_control);
    }

    @Override // defpackage.x071
    public ProgressBar getVideoProgress() {
        return (ProgressBar) findViewById(R$id.video_progress_control);
    }

    public CorePlaybackControlsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CorePlaybackControlsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CorePlaybackControlsContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
