package com.ybsdk.widgets.common.communication;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.f;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.videoplayer.api.VideoPlayer$RepeatMode;
import com.ybsdk.feature.videoplayer.impl.a;
import defpackage.asc;
import defpackage.cma1;
import defpackage.em3;
import defpackage.fch0;
import defpackage.jl40;
import defpackage.mm31;
import defpackage.moo;
import defpackage.nrc;
import defpackage.ny61;
import defpackage.om31;
import defpackage.ooo;
import defpackage.orc;
import defpackage.pm31;
import defpackage.poh0;
import defpackage.prc;
import defpackage.qrc;
import defpackage.rbv;
import defpackage.rje;
import defpackage.rm31;
import defpackage.rrc;
import defpackage.sm31;
import defpackage.td10;
import defpackage.ung0;
import defpackage.v4b1;
import defpackage.w511;
import defpackage.wrc;
import defpackage.x061;
import defpackage.x4c;
import defpackage.yrc;
import defpackage.zrc;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0015\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u0011J\u0017\u0010!\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/ybsdk/widgets/common/communication/CommunicationFullScreenVideoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lnrc;", ClidProvider.STATE, "", "handleError", "(Lnrc;)Z", "Lzy11;", "updatePlaceholderImage", "(Lnrc;)V", "updateBackground", "updateInfoView", "onLoadingStateChange", "orc", "createPlayerListener", "()Lorc;", "onDetachedFromWindow", "()V", "Lrm31;", "factory", "initPlayer", "(Lrm31;)V", "render", "Lasc;", "listener", "setEventsListener", "(Lasc;)V", "Lrrc;", "command", "onCommand", "(Lrrc;)V", "Lx061;", "binding", "Lx061;", "Lom31;", "player", "Lom31;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "currentState", "Lnrc;", "eventsListener", "Lasc;", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CommunicationFullScreenVideoView extends ConstraintLayout {
    private final x061 binding;
    private nrc currentState;
    private asc eventsListener;
    private Handler handler;
    private om31 player;

    public CommunicationFullScreenVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_communication_full_screen_video_view, this);
        int i2 = fch0.infoView;
        CommunicationFullScreenInfoView communicationFullScreenInfoView = (CommunicationFullScreenInfoView) cma1.O(i2, this);
        if (communicationFullScreenInfoView != null) {
            i2 = fch0.placeholderImage;
            ImageView imageView = (ImageView) cma1.O(i2, this);
            if (imageView != null) {
                i2 = fch0.playerTextureView;
                TextureView textureView = (TextureView) cma1.O(i2, this);
                if (textureView != null) {
                    this.binding = new x061(this, communicationFullScreenInfoView, imageView, textureView);
                    this.handler = new Handler(Looper.getMainLooper());
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final orc createPlayerListener() {
        return new orc(this);
    }

    private final boolean handleError(nrc state) {
        if (!(state.i instanceof wrc)) {
            return false;
        }
        nrc nrcVar = this.currentState;
        if (jl40.l(nrcVar != null ? nrcVar.k : null, state.k)) {
            return false;
        }
        asc ascVar = this.eventsListener;
        if (ascVar == null) {
            return true;
        }
        ascVar.p(yrc.a);
        return true;
    }

    private final void onLoadingStateChange(nrc state) {
        zrc zrcVar = state.i;
        this.binding.c.setVisibility(((zrcVar instanceof yrc) || (zrcVar instanceof wrc)) ? 0 : 8);
    }

    private final void updateBackground(nrc state) {
        ColorModel colorModel = state.b;
        setBackgroundColor(colorModel != null ? colorModel.get(getContext()) : rje.a(getContext(), ung0.ybColor_background_primary));
    }

    private final void updateInfoView(nrc state) {
        CommunicationFullScreenInfoView communicationFullScreenInfoView = this.binding.b;
        communicationFullScreenInfoView.setPadding(communicationFullScreenInfoView.getPaddingLeft(), state.d, communicationFullScreenInfoView.getPaddingRight(), communicationFullScreenInfoView.getPaddingBottom());
        Integer num = state.l;
        if (num != null) {
            int intValue = num.intValue();
            ViewGroup.LayoutParams layoutParams = communicationFullScreenInfoView.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, intValue, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                communicationFullScreenInfoView.setLayoutParams(marginLayoutParams);
            }
        }
        communicationFullScreenInfoView.render(state.c);
    }

    private final void updatePlaceholderImage(nrc state) {
        x061 x061Var = this.binding;
        ColorModel colorModel = state.b;
        int a = colorModel != null ? colorModel.get(getContext()) : rje.a(getContext(), ung0.ybColor_background_primary);
        rbv rbvVar = state.a;
        if (rbvVar != null) {
            v4b1.k(rbvVar, this.binding.c, null, null, 6);
        }
        x061Var.c.setBackgroundColor(a);
    }

    public final void initPlayer(rm31 factory) {
        Context context = getContext();
        sm31 sm31Var = (sm31) factory;
        AppAnalyticsReporter appAnalyticsReporter = sm31Var.b;
        ooo oooVar = new ooo(appAnalyticsReporter);
        pm31 pm31Var = sm31Var.a;
        a aVar = new a(context, pm31Var, oooVar);
        em3 em3Var = appAnalyticsReporter.t0;
        Map i = b.i(new Pair("playerType", "ExoVideoPlayer"), new Pair("exoLoadControlMinBufferMs", Integer.valueOf(pm31Var.a)), new Pair("exoLoadControlMaxBufferMs", Integer.valueOf(pm31Var.b)), new Pair("exoLoadControlBufferForPlaybackMs", Integer.valueOf(pm31Var.c)), new Pair("exoLoadControlBufferForPlaybackAfterRebufferMS", Integer.valueOf(pm31Var.d)));
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("video_player_config", i);
        em3Var.a.a("video_player.initialized", linkedHashMap);
        this.player = aVar;
        this.binding.d.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: com.ybsdk.widgets.common.communication.CommunicationFullScreenVideoView$initPlayer$1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
                om31 om31Var;
                x061 x061Var;
                om31Var = CommunicationFullScreenVideoView.this.player;
                if (om31Var != null) {
                    x061Var = CommunicationFullScreenVideoView.this.binding;
                    TextureView textureView = x061Var.d;
                    f fVar = ((a) om31Var).c;
                    if (fVar != null) {
                        fVar.setVideoTextureView(textureView);
                    }
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surface) {
            }
        });
    }

    public final void onCommand(rrc command) {
        if (command instanceof qrc) {
            om31 om31Var = this.player;
            if (om31Var != null) {
                a aVar = (a) om31Var;
                aVar.a.b = false;
                f fVar = aVar.c;
                if (fVar != null) {
                    fVar.play();
                    return;
                }
                return;
            }
            return;
        }
        if (!(command instanceof prc)) {
            w511.b();
            return;
        }
        om31 om31Var2 = this.player;
        if (om31Var2 != null) {
            a aVar2 = (a) om31Var2;
            aVar2.a.b = true;
            f fVar2 = aVar2.c;
            if (fVar2 != null) {
                fVar2.pause();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.handler.removeCallbacksAndMessages(null);
        om31 om31Var = this.player;
        if (om31Var != null) {
            ((a) om31Var).a();
        }
        this.player = null;
        super.onDetachedFromWindow();
    }

    public final void render(nrc state) {
        f fVar;
        om31 om31Var;
        if (jl40.l(this.currentState, state) || handleError(state)) {
            return;
        }
        nrc nrcVar = this.currentState;
        if (!jl40.l(nrcVar != null ? nrcVar.k : null, state.k) && (om31Var = this.player) != null) {
            ((a) om31Var).d = createPlayerListener();
        }
        this.currentState = state;
        updateInfoView(state);
        updateBackground(state);
        updatePlaceholderImage(state);
        onLoadingStateChange(state);
        if (state.i instanceof wrc) {
            om31 om31Var2 = this.player;
            if (om31Var2 == null || (fVar = ((a) om31Var2).c) == null) {
                return;
            }
            fVar.prepare();
            return;
        }
        String str = state.e;
        VideoPlayer$RepeatMode videoPlayer$RepeatMode = state.g;
        boolean z = state.h;
        mm31 mm31Var = new mm31(str, videoPlayer$RepeatMode, z);
        om31 om31Var3 = this.player;
        if (om31Var3 != null) {
            a aVar = (a) om31Var3;
            if (mm31Var.equals(aVar.e)) {
                return;
            }
            aVar.e = mm31Var;
            f fVar2 = aVar.c;
            if (fVar2 == null) {
                return;
            }
            int i = moo.a[videoPlayer$RepeatMode.ordinal()];
            int i2 = 1;
            if (i == 1) {
                i2 = 0;
            } else if (i != 2) {
                if (i != 3) {
                    w511.b();
                    return;
                }
                i2 = 2;
            }
            fVar2.setRepeatMode(i2);
            fVar2.setPlayWhenReady(z);
            if (!fVar2.isCommandAvailable(20)) {
                x4c.g("Can't play video, because COMMAND_CHANGE_MEDIA_ITEMS is not available", null, null, null, 14);
                return;
            }
            td10 td10Var = new td10();
            td10Var.b(str);
            td10Var.a = str;
            fVar2.setMediaItem(td10Var.a());
            fVar2.prepare();
        }
    }

    public final void setEventsListener(asc listener) {
        this.eventsListener = listener;
    }

    public CommunicationFullScreenVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CommunicationFullScreenVideoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CommunicationFullScreenVideoView(Context context) {
        this(context, null, 0, 6, null);
    }
}
