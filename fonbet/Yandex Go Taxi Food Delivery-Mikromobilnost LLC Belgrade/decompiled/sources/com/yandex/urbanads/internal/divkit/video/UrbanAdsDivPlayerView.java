package com.yandex.urbanads.internal.divkit.video;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div2.DivVideoScale;
import defpackage.ag21;
import defpackage.c1x0;
import defpackage.ff21;
import defpackage.fng0;
import defpackage.gf21;
import defpackage.r4l;
import defpackage.t5w;
import defpackage.v4l;
import defpackage.y6i0;
import defpackage.zf21;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001(\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\b*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\u000f\u0010\u001e\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001e\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/yandex/urbanads/internal/divkit/video/UrbanAdsDivPlayerView;", "Lcom/yandex/div/core/player/DivPlayerView;", "Landroid/content/Context;", "context", "Lag21;", "videoPlayerProvider", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Lag21;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateShutterColor", "()V", "getNearestBgColorOrNull", "()Ljava/lang/Integer;", "Landroid/graphics/drawable/Drawable;", "getColorOrNull", "(Landroid/graphics/drawable/Drawable;)Ljava/lang/Integer;", "visibility", "onWindowVisibilityChanged", "(I)V", "Lr4l;", "player", "attach", "(Lr4l;)V", "getAttachedPlayer", "()Lr4l;", "detach", "onAttachedToWindow", "Lag21;", "Landroid/view/View;", "playerView", "Landroid/view/View;", "getPlayerView$urbanads_sdk_release", "()Landroid/view/View;", "Lff21;", "attachedPlayer", "Lff21;", "gf21", "stateObserver", "Lgf21;", "urbanads-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UrbanAdsDivPlayerView extends DivPlayerView {
    private ff21 attachedPlayer;
    private final View playerView;
    private final gf21 stateObserver;
    private final ag21 videoPlayerProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public UrbanAdsDivPlayerView(Context context, ag21 ag21Var, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.videoPlayerProvider = ag21Var;
        ((c1x0) ag21Var).getClass();
        ListYandexPlayerView listYandexPlayerView = new ListYandexPlayerView(context, null, 2, 0 == true ? 1 : 0);
        this.playerView = listYandexPlayerView;
        this.stateObserver = new gf21(this);
        addView(listYandexPlayerView, -1, -1);
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

    private final Integer getNearestBgColorOrNull() {
        Integer colorOrNull;
        View view = this;
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

    private final void updateShutterColor() {
        Integer nearestBgColorOrNull = getNearestBgColorOrNull();
        this.playerView.setBackgroundColor(nearestBgColorOrNull != null ? nearestBgColorOrNull.intValue() : 0);
    }

    @Override // com.yandex.div.core.player.DivPlayerView
    public void attach(r4l player) {
        ff21 ff21Var = player instanceof ff21 ? (ff21) player : null;
        if (ff21Var == null) {
            return;
        }
        ff21 ff21Var2 = this.attachedPlayer;
        if (ff21Var2 != null) {
            ff21Var2.e = null;
            zf21 zf21Var = ff21Var2.d;
            ListYandexPlayerView listYandexPlayerView = zf21Var.d;
            if (listYandexPlayerView != null) {
                listYandexPlayerView.detach();
            }
            zf21Var.d = null;
            ff21Var2.c.remove(this.stateObserver);
        }
        this.attachedPlayer = ff21Var;
        v4l v4lVar = ff21Var.b;
        ff21Var.e = this;
        zf21 zf21Var2 = ff21Var.d;
        View playerView = getPlayerView();
        zf21Var2.getClass();
        ListYandexPlayerView listYandexPlayerView2 = playerView instanceof ListYandexPlayerView ? (ListYandexPlayerView) playerView : null;
        if (listYandexPlayerView2 != null) {
            ListYandexPlayerView listYandexPlayerView3 = zf21Var2.d;
            if (listYandexPlayerView3 != null) {
                listYandexPlayerView3.detach();
            }
            zf21Var2.d = listYandexPlayerView2;
            listYandexPlayerView2.attachPlayer(zf21Var2.a());
        }
        ff21Var.d(ff21Var.a, v4lVar.d);
        if (v4lVar.a) {
            zf21Var2.a().play();
        }
        ff21Var.a(this.stateObserver);
    }

    @Override // com.yandex.div.core.player.DivPlayerView
    public void detach() {
        ff21 ff21Var = this.attachedPlayer;
        if (ff21Var == null) {
            return;
        }
        ff21Var.e = null;
        zf21 zf21Var = ff21Var.d;
        ListYandexPlayerView listYandexPlayerView = zf21Var.d;
        if (listYandexPlayerView != null) {
            listYandexPlayerView.detach();
        }
        zf21Var.d = null;
        ff21Var.c.remove(this.stateObserver);
    }

    @Override // com.yandex.div.core.player.DivPlayerView
    public r4l getAttachedPlayer() {
        ff21 ff21Var = this.attachedPlayer;
        if (ff21Var == null || ff21Var.e == null) {
            return null;
        }
        return ff21Var;
    }

    /* renamed from: getPlayerView$urbanads_sdk_release, reason: from getter */
    public final View getPlayerView() {
        return this.playerView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateShutterColor();
        ff21 ff21Var = this.attachedPlayer;
        if (ff21Var == null || ff21Var.e != null) {
            return;
        }
        attach(ff21Var);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        ff21 ff21Var;
        super.onWindowVisibilityChanged(visibility);
        if (visibility == 0 || (ff21Var = this.attachedPlayer) == null) {
            return;
        }
        ff21Var.pause();
    }

    @Override // com.yandex.div.core.player.DivPlayerView
    public /* bridge */ /* synthetic */ void setScale(DivVideoScale divVideoScale) {
        super.setScale(divVideoScale);
    }

    @Override // com.yandex.div.core.player.DivPlayerView
    public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z) {
        super.setVisibleOnScreen(z);
    }

    public /* synthetic */ UrbanAdsDivPlayerView(Context context, ag21 ag21Var, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, ag21Var, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? fng0.divImageStyle : i);
    }
}
