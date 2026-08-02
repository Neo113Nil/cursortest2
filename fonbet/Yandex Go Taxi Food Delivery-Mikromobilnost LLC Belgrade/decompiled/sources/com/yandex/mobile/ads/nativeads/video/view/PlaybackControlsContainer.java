package com.yandex.mobile.ads.nativeads.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;
import com.yandex.mobile.ads.R$id;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/video/view/PlaybackControlsContainer;", "Lcom/monetization/ads/nativeads/video/view/CorePlaybackControlsContainer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "countDownProgress", "Landroid/widget/TextView;", "getCountDownProgress", "()Landroid/widget/TextView;", "muteControl", "Landroid/widget/CheckBox;", "getMuteControl", "()Landroid/widget/CheckBox;", "videoProgress", "Landroid/widget/ProgressBar;", "getVideoProgress", "()Landroid/widget/ProgressBar;", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackControlsContainer extends CorePlaybackControlsContainer {
    public PlaybackControlsContainer(Context context) {
        super(context);
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, defpackage.x071
    public TextView getCountDownProgress() {
        View findViewById = findViewById(R$id.video_count_down_control);
        if (findViewById instanceof TextView) {
            return (TextView) findViewById;
        }
        return null;
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, defpackage.x071
    public CheckBox getMuteControl() {
        View findViewById = findViewById(R$id.video_mute_control);
        if (findViewById instanceof CheckBox) {
            return (CheckBox) findViewById;
        }
        return null;
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, defpackage.x071
    public ProgressBar getVideoProgress() {
        View findViewById = findViewById(R$id.video_progress_control);
        if (findViewById instanceof ProgressBar) {
            return (ProgressBar) findViewById;
        }
        return null;
    }

    public PlaybackControlsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PlaybackControlsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PlaybackControlsContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
