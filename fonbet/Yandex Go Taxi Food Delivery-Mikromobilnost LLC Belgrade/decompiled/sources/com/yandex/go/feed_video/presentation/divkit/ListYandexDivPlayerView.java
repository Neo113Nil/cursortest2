package com.yandex.go.feed_video.presentation.divkit;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div2.DivVideoScale;
import defpackage.auy;
import defpackage.fng0;
import defpackage.k4o;
import defpackage.pey;
import defpackage.r4l;
import defpackage.t5w;
import defpackage.tls;
import defpackage.vng;
import defpackage.y6i0;
import defpackage.zp7;
import defpackage.zty;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\u0007*\u0002CF\b\u0000\u0018\u0000 I2\u00020\u0001:\u0002JKB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0006*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0006*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0011\u0010'\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\fJ\u000f\u0010*\u001a\u00020\nH\u0014¢\u0006\u0004\b*\u0010\fJ\u000f\u0010+\u001a\u00020\nH\u0014¢\u0006\u0004\b+\u0010\fJ\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\fJ#\u0010/\u001a\u00020\n2\u0014\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010-¢\u0006\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R$\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00102R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00102R\u0016\u0010B\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00102R\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lcom/yandex/go/feed_video/presentation/divkit/ListYandexDivPlayerView;", "Lcom/yandex/div/core/player/DivPlayerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "detachPlayer", "()V", "prepareForReuse", "switchToSurfaceViewForPlayerIfNeeded", "updateShutterColor", "Landroid/view/View;", "getNearestBgColorOrNull", "(Landroid/view/View;)Ljava/lang/Integer;", "Landroid/graphics/drawable/Drawable;", "getColorOrNull", "(Landroid/graphics/drawable/Drawable;)Ljava/lang/Integer;", "getAttributeSet", "()Landroid/util/AttributeSet;", "Lcom/yandex/go/feed_video/presentation/divkit/ListYandexDivPlayerView$PlayerState;", ClidProvider.STATE, "setPlayerState", "(Lcom/yandex/go/feed_video/presentation/divkit/ListYandexDivPlayerView$PlayerState;)V", "visibility", "onWindowVisibilityChanged", "(I)V", "", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "Lr4l;", "player", "attach", "(Lr4l;)V", "getAttachedPlayer", "()Lr4l;", "detach", "onAttachedToWindow", "onDetachedFromWindow", "requestLayout", "Lkotlin/Function1;", "callback", "setOnDetachCallback", "(Ltls;)V", "didFallbackToSurfaceView", "Z", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "styledPlayerView", "Lru/yandex/video/m3/ui/ListYandexPlayerView;", "Lzty;", "attachedPlayer", "Lzty;", "onDetachCallback", "Ltls;", "lastStateBeforeOverlap", "Lcom/yandex/go/feed_video/presentation/divkit/ListYandexDivPlayerView$PlayerState;", "isPlayerOverlapped", "Landroidx/lifecycle/Lifecycle;", "observedLifecycle", "Landroidx/lifecycle/Lifecycle;", "lastVisibilityState", "lastWindowVisibility", "com/yandex/go/feed_video/presentation/divkit/a", "lifecycleObserver", "Lcom/yandex/go/feed_video/presentation/divkit/a;", "com/yandex/go/feed_video/presentation/divkit/b", "stateObserver", "Lcom/yandex/go/feed_video/presentation/divkit/b;", "Companion", "PlayerState", "auy", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListYandexDivPlayerView extends DivPlayerView {
    public static final auy Companion = new auy();
    private static final AtomicReference<AttributeSet> attributeSetAtomic = new AtomicReference<>();
    private static boolean definitelyNoHardwareAcceleration;
    private zty attachedPlayer;
    private boolean didFallbackToSurfaceView;
    private boolean isPlayerOverlapped;
    private PlayerState lastStateBeforeOverlap;
    private boolean lastVisibilityState;
    private boolean lastWindowVisibility;
    private final a lifecycleObserver;
    private Lifecycle observedLifecycle;
    private tls onDetachCallback;
    private final b stateObserver;
    private ListYandexPlayerView styledPlayerView;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/feed_video/presentation/divkit/ListYandexDivPlayerView$PlayerState;", "", "PLAYING", "PAUSED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class PlayerState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PlayerState[] $VALUES;
        public static final PlayerState PAUSED;
        public static final PlayerState PLAYING;

        static {
            PlayerState playerState = new PlayerState("PLAYING", 0);
            PLAYING = playerState;
            PlayerState playerState2 = new PlayerState("PAUSED", 1);
            PAUSED = playerState2;
            PlayerState[] playerStateArr = {playerState, playerState2};
            $VALUES = playerStateArr;
            $ENTRIES = kotlin.enums.a.a(playerStateArr);
        }

        public static PlayerState valueOf(String str) {
            return (PlayerState) Enum.valueOf(PlayerState.class, str);
        }

        public static PlayerState[] values() {
            return (PlayerState[]) $VALUES.clone();
        }
    }

    public ListYandexDivPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ListYandexPlayerView listYandexPlayerView = new ListYandexPlayerView(context, attributeSet == null ? getAttributeSet() : attributeSet);
        this.styledPlayerView = listYandexPlayerView;
        this.lastStateBeforeOverlap = PlayerState.PAUSED;
        addView(listYandexPlayerView, -1, -1);
        this.lastVisibilityState = true;
        this.lastWindowVisibility = true;
        this.lifecycleObserver = new a(this);
        this.stateObserver = new b(this);
    }

    private final void detachPlayer() {
        zty ztyVar = this.attachedPlayer;
        if (ztyVar != null) {
            ztyVar.g(this.stateObserver);
        }
        zty ztyVar2 = this.attachedPlayer;
        if (ztyVar2 != null) {
            ztyVar2.f();
        }
        this.attachedPlayer = null;
    }

    private final AttributeSet getAttributeSet() {
        if (definitelyNoHardwareAcceleration) {
            this.didFallbackToSurfaceView = true;
            return null;
        }
        auy auyVar = Companion;
        Resources resources = getResources();
        auyVar.getClass();
        AttributeSet attributeSet = (AttributeSet) attributeSetAtomic.get();
        return attributeSet != null ? attributeSet : (AttributeSet) attributeSetAtomic.updateAndGet(new zp7(3, resources));
    }

    private final Integer getColorOrNull(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() == 0) {
                return null;
            }
            Iterator it = y6i0.n(0, layerDrawable.getNumberOfLayers()).iterator();
            while (it.hasNext()) {
                Integer colorOrNull = getColorOrNull(layerDrawable.getDrawable(((t5w) it).nextInt()));
                if (colorOrNull != null) {
                    return colorOrNull;
                }
            }
        }
        return null;
    }

    private final Integer getNearestBgColorOrNull(View view) {
        Integer colorOrNull;
        while (view != null) {
            Drawable background = view.getBackground();
            int intValue = (background == null || (colorOrNull = getColorOrNull(background)) == null) ? 0 : colorOrNull.intValue();
            if (intValue != 0) {
                return Integer.valueOf(intValue);
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private final void prepareForReuse() {
        this.lastStateBeforeOverlap = PlayerState.PAUSED;
        this.isPlayerOverlapped = false;
        this.lastVisibilityState = true;
        this.lastWindowVisibility = true;
        this.observedLifecycle = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlayerState(PlayerState state) {
        if (this.isPlayerOverlapped || !hasWindowFocus()) {
            return;
        }
        this.lastStateBeforeOverlap = state;
    }

    private final void switchToSurfaceViewForPlayerIfNeeded() {
        if (this.didFallbackToSurfaceView || isHardwareAccelerated()) {
            return;
        }
        definitelyNoHardwareAcceleration = true;
        this.didFallbackToSurfaceView = true;
        removeView(this.styledPlayerView);
        ListYandexPlayerView listYandexPlayerView = new ListYandexPlayerView(getContext(), null, 2, null);
        this.styledPlayerView = listYandexPlayerView;
        addView(listYandexPlayerView, -1, -1);
        r4l r4lVar = this.attachedPlayer;
        if (r4lVar != null) {
            attach(r4lVar);
        }
    }

    private final void updateShutterColor() {
        Integer nearestBgColorOrNull = getNearestBgColorOrNull(this);
        this.styledPlayerView.setBackgroundColor(nearestBgColorOrNull != null ? nearestBgColorOrNull.intValue() : 0);
    }

    @Override // com.yandex.div.core.player.DivPlayerView
    public void attach(r4l player) {
        zty ztyVar;
        zty ztyVar2 = this.attachedPlayer;
        boolean z = ztyVar2 != null;
        zty ztyVar3 = player instanceof zty ? (zty) player : null;
        if (ztyVar3 != null) {
            if (ztyVar2 != null) {
                detachPlayer();
            }
            ztyVar3.e(this.styledPlayerView);
            this.attachedPlayer = ztyVar3;
        }
        zty ztyVar4 = this.attachedPlayer;
        if (ztyVar4 != null) {
            ztyVar4.a(this.stateObserver);
        }
        if (z && this.lastStateBeforeOverlap == PlayerState.PLAYING && (ztyVar = this.attachedPlayer) != null) {
            ztyVar.play();
        }
    }

    @Override // com.yandex.div.core.player.DivPlayerView
    public void detach() {
        detachPlayer();
        tls tlsVar = this.onDetachCallback;
        if (tlsVar != null) {
            tlsVar.invoke(this);
        }
    }

    @Override // com.yandex.div.core.player.DivPlayerView
    public r4l getAttachedPlayer() {
        return this.attachedPlayer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switchToSurfaceViewForPlayerIfNeeded();
        updateShutterColor();
        super.onAttachedToWindow();
        pey o = vng.o(this);
        Lifecycle lifecycle = o != null ? o.getLifecycle() : null;
        if (lifecycle == null || lifecycle.equals(this.observedLifecycle)) {
            return;
        }
        Lifecycle lifecycle2 = this.observedLifecycle;
        if (lifecycle2 != null) {
            lifecycle2.d(this.lifecycleObserver);
        }
        lifecycle.a(this.lifecycleObserver);
        this.observedLifecycle = lifecycle;
        if (lifecycle.b().a(Lifecycle.State.RESUMED)) {
            return;
        }
        this.isPlayerOverlapped = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Lifecycle lifecycle = this.observedLifecycle;
        if (lifecycle != null) {
            lifecycle.d(this.lifecycleObserver);
        }
        this.observedLifecycle = null;
        prepareForReuse();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        zty ztyVar;
        if (this.lastVisibilityState == hasWindowFocus) {
            return;
        }
        this.lastVisibilityState = hasWindowFocus;
        if (!hasWindowFocus) {
            zty ztyVar2 = this.attachedPlayer;
            if (ztyVar2 != null) {
                ztyVar2.pause();
                return;
            }
            return;
        }
        if (this.isPlayerOverlapped || this.lastStateBeforeOverlap != PlayerState.PLAYING || (ztyVar = this.attachedPlayer) == null) {
            return;
        }
        ztyVar.play();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        boolean z = visibility == 0;
        if (this.lastWindowVisibility != z) {
            this.lastWindowVisibility = z;
            this.styledPlayerView.onViewVisibleChange(z);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.isPlayerOverlapped) {
            return;
        }
        super.requestLayout();
    }

    public final void setOnDetachCallback(tls callback) {
        this.onDetachCallback = callback;
    }

    @Override // com.yandex.div.core.player.DivPlayerView
    public /* bridge */ /* synthetic */ void setScale(DivVideoScale divVideoScale) {
        super.setScale(divVideoScale);
    }

    @Override // com.yandex.div.core.player.DivPlayerView
    public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z) {
        super.setVisibleOnScreen(z);
    }

    public ListYandexDivPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ListYandexDivPlayerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ListYandexDivPlayerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? fng0.divImageStyle : i);
    }
}
