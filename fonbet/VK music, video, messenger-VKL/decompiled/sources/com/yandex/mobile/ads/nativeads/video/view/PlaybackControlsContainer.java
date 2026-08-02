package com.yandex.mobile.ads.nativeads.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes8.dex */
public final class PlaybackControlsContainer extends CorePlaybackControlsContainer {
    public PlaybackControlsContainer(Context context) {
        super(context);
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, yads.hm1
    public TextView getCountDownProgress() {
        View findViewById = findViewById(R$id.video_count_down_control);
        if (findViewById instanceof TextView) {
            return (TextView) findViewById;
        }
        return null;
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, yads.hm1
    public CheckBox getMuteControl() {
        View findViewById = findViewById(R$id.video_mute_control);
        if (findViewById instanceof CheckBox) {
            return (CheckBox) findViewById;
        }
        return null;
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, yads.hm1
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
