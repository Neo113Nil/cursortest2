package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.clips.design.view.component.play.ClipPlayPauseView;
import com.vk.clips.sdk.shared.feed.model.FeedItem;

/* compiled from: ClipFeedItemView.kt */
/* loaded from: classes17.dex */
public final class wwc extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ twc<FeedItem.n> b;

    public wwc(twc<FeedItem.n> twcVar) {
        this.b = twcVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        yg5 autoPlay;
        twc<FeedItem.n> twcVar = this.b;
        if (!twcVar.getVideoFocused() || jjc.d().a() || (autoPlay = twcVar.getAutoPlay()) == null) {
            return true;
        }
        ((ClipPlayPauseView) twcVar.G.e.a()).U(autoPlay.isPlaying());
        if (autoPlay.isPlaying()) {
            autoPlay.c();
            rlt0 m0 = autoPlay.m0();
            if (m0 == null) {
                return true;
            }
            m0.i("pause", "pause");
            return true;
        }
        autoPlay.D();
        rlt0 m02 = autoPlay.m0();
        if (m02 != null) {
            m02.i("pause", CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        }
        autoPlay.z0(twcVar.getVideo(), twcVar.getVideoConfig(), null);
        autoPlay.f();
        return true;
    }
}
