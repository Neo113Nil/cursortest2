package com.yandex.div.video.m3;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.SurfaceView;
import android.view.View;
import androidx.media3.ui.PlayerView;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div2.DivVideoScale;
import defpackage.bno;
import defpackage.cno;
import defpackage.hlh0;
import defpackage.jl40;
import defpackage.r4l;
import defpackage.sls;
import defpackage.w511;
import defpackage.wfx;
import defpackage.zxc0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001b\u0010\u0014R\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/yandex/div/video/m3/ExoDivPlayerView;", "Lcom/yandex/div/core/player/DivPlayerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lkotlin/Function0;", "Landroidx/media3/ui/PlayerView;", "viewCreator", "setupPlayerView", "(Lsls;)Landroidx/media3/ui/PlayerView;", "Landroid/util/AttributeSet;", "getAttributeSet", "()Landroid/util/AttributeSet;", "Lr4l;", "player", "Lzy11;", "attach", "(Lr4l;)V", "detach", "()V", "getAttachedPlayer", "()Lr4l;", "Lcom/yandex/div2/DivVideoScale;", "videoScale", "setScale", "(Lcom/yandex/div2/DivVideoScale;)V", "onAttachedToWindow", "playerView", "Landroidx/media3/ui/PlayerView;", "attachedPlayer", "Lr4l;", "", "didFallbackToSurfaceView", "Z", "Companion", "bno", "div-video-m3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoDivPlayerView extends DivPlayerView {
    private static final String TAG = "ExoPlayerView";
    private static final String TYPE_PLAYER_VIEW = "androidx.media3.ui.PlayerView";
    private static AttributeSet attributeSet;
    private static boolean definitelyNoHardwareAcceleration;
    private r4l attachedPlayer;
    private boolean didFallbackToSurfaceView;
    private PlayerView playerView;
    public static final bno Companion = new bno();
    private static final Object lock = new Object();

    public ExoDivPlayerView(Context context) {
        super(context, null, 0, 6, null);
        PlayerView playerView = new PlayerView(context, getAttributeSet());
        playerView.setUseController(false);
        playerView.setShutterBackgroundColor(0);
        View videoSurfaceView = playerView.getVideoSurfaceView();
        SurfaceView surfaceView = videoSurfaceView instanceof SurfaceView ? (SurfaceView) videoSurfaceView : null;
        if (surfaceView != null) {
            surfaceView.setZOrderOnTop(false);
            surfaceView.setBackgroundColor(0);
            surfaceView.getHolder().setFormat(-2);
        }
        addView(playerView);
        this.playerView = playerView;
    }

    private final AttributeSet getAttributeSet() {
        AttributeSet attributeSet2;
        AttributeSet attributeSet3 = null;
        if (definitelyNoHardwareAcceleration) {
            this.didFallbackToSurfaceView = true;
            return null;
        }
        Companion.getClass();
        if (attributeSet == null) {
            synchronized (lock) {
                attributeSet2 = attributeSet;
            }
        } else {
            attributeSet2 = attributeSet;
        }
        if (attributeSet2 != null) {
            return attributeSet2;
        }
        synchronized (lock) {
            try {
                XmlResourceParser layout = getResources().getLayout(hlh0.zoom_player_view);
                while (true) {
                    int next = layout.next();
                    if (jl40.l(layout.getName(), TYPE_PLAYER_VIEW)) {
                        attributeSet3 = Xml.asAttributeSet(layout);
                        break;
                    }
                    if (next == 1) {
                        break;
                    }
                }
                if (attributeSet3 == null) {
                    int i = wfx.a;
                    this.didFallbackToSurfaceView = true;
                }
                attributeSet = attributeSet3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return attributeSet3;
    }

    private final PlayerView setupPlayerView(sls viewCreator) {
        PlayerView playerView = (PlayerView) viewCreator.invoke();
        playerView.setUseController(false);
        playerView.setShutterBackgroundColor(0);
        View videoSurfaceView = playerView.getVideoSurfaceView();
        SurfaceView surfaceView = videoSurfaceView instanceof SurfaceView ? (SurfaceView) videoSurfaceView : null;
        if (surfaceView != null) {
            surfaceView.setZOrderOnTop(false);
            surfaceView.setBackgroundColor(0);
            surfaceView.getHolder().setFormat(-2);
        }
        addView(playerView);
        return playerView;
    }

    @Override // com.yandex.div.core.player.DivPlayerView
    public void attach(r4l player) {
        detach();
        throw new ClassCastException();
    }

    @Override // com.yandex.div.core.player.DivPlayerView
    public void detach() {
        zxc0 player = this.playerView.getPlayer();
        if (player != null) {
            player.release();
        }
        this.playerView.setPlayer(null);
        this.attachedPlayer = null;
    }

    @Override // com.yandex.div.core.player.DivPlayerView
    public r4l getAttachedPlayer() {
        return this.attachedPlayer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (this.didFallbackToSurfaceView || isHardwareAccelerated()) {
            super.onAttachedToWindow();
            return;
        }
        definitelyNoHardwareAcceleration = true;
        this.didFallbackToSurfaceView = true;
        int i = wfx.a;
        getAttachedPlayer();
    }

    @Override // com.yandex.div.core.player.DivPlayerView
    public void setScale(DivVideoScale videoScale) {
        if (this.didFallbackToSurfaceView && videoScale == DivVideoScale.FILL) {
            int i = wfx.a;
        }
        PlayerView playerView = this.playerView;
        int i2 = cno.a[videoScale.ordinal()];
        int i3 = 0;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                w511.b();
                return;
            }
            i3 = 4;
        }
        playerView.setResizeMode(i3);
    }

    @Override // com.yandex.div.core.player.DivPlayerView
    public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z) {
        super.setVisibleOnScreen(z);
    }
}
