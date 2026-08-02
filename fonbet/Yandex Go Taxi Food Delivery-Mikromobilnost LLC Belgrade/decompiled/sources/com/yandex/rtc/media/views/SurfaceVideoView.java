package com.yandex.rtc.media.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.ro31;
import defpackage.sls;
import defpackage.wl31;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001dJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/rtc/media/views/SurfaceVideoView;", "Landroid/widget/FrameLayout;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lwl31;", "frame", "Lzy11;", "onFrame", "(Lwl31;)V", "Lro31;", "videoViewDelegate", "Lkotlin/Function0;", "onFirstFrameRendered", "init", "(Lro31;Lsls;)V", "release", "()V", "Lcom/yandex/rtc/media/views/ScalingType;", "scalingType", "setScalingType", "(Lcom/yandex/rtc/media/views/ScalingType;)V", "scalingTypeMatchOrientation", "scalingTypeMismatchOrientation", "(Lcom/yandex/rtc/media/views/ScalingType;Lcom/yandex/rtc/media/views/ScalingType;)V", "", "isMediaOverlay", "setZOrderMediaOverlay", "(Z)V", "Lro31;", "media-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SurfaceVideoView extends FrameLayout {
    private volatile ro31 videoViewDelegate;

    public SurfaceVideoView(Context context) {
        this(context, null);
    }

    public void init(ro31 videoViewDelegate, sls onFirstFrameRendered) {
        videoViewDelegate.b();
    }

    public void onFrame(wl31 frame) {
    }

    public void release() {
    }

    public void setScalingType(ScalingType scalingType) {
    }

    public void setScalingType(ScalingType scalingTypeMatchOrientation, ScalingType scalingTypeMismatchOrientation) {
    }

    public final void setZOrderMediaOverlay(boolean isMediaOverlay) {
    }

    public SurfaceVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
