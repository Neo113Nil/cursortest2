package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.state.db.StateEntry;
import com.yandex.div2.DivBorder;
import defpackage.aw5;
import defpackage.f1k;
import defpackage.fng0;
import defpackage.msk;
import defpackage.nsk;
import defpackage.r4l;
import defpackage.ssi0;
import defpackage.y2k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u0004B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0014J \u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u0014J*\u0010$\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b(\u0010'J/\u0010-\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\nH\u0014¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0010H\u0016¢\u0006\u0004\b3\u0010\u0014J\u000f\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u0010\u0014J\u000f\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b:\u0010\u0012R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000e0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001e\u0010M\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020N8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001c\u0010T\u001a\u00020N8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bQ\u0010P\"\u0004\bR\u0010SR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u000e0B8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lmsk;", "Ly2k;", "", "Lssi0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lf1k;", "subscription", "Lzy11;", "addSubscription", "(Lf1k;)V", "closeAllSubscription", "()V", "Lcom/yandex/div/core/view2/divs/widgets/a;", "getDivBorderDrawer", "()Lcom/yandex/div/core/view2/divs/widgets/a;", "invalidateBorder", "width", "height", "onBoundsChanged", "(II)V", "releaseBorderDrawer", "Law5;", "bindingContext", "Lcom/yandex/div2/DivBorder;", "border", "Landroid/view/View;", "view", "setBorder", "(Law5;Lcom/yandex/div2/DivBorder;Landroid/view/View;)V", "transitionFinished", "(Landroid/view/View;)V", "transitionStarted", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "release", "releaseMedia", "Lcom/yandex/div/core/player/DivPlayerView;", "getPlayerView", "()Lcom/yandex/div/core/player/DivPlayerView;", "getBaseline", "()I", "addVideoSubscription", "Lcom/yandex/div/core/state/b;", StateEntry.COLUMN_PATH, "Lcom/yandex/div/core/state/b;", "getPath", "()Lcom/yandex/div/core/state/b;", "setPath", "(Lcom/yandex/div/core/state/b;)V", "", "videoSubscriptions", "Ljava/util/List;", "getBindingContext", "()Law5;", "setBindingContext", "(Law5;)V", "getDiv", "()Ly2k;", "setDiv", "(Ly2k;)V", "div", "", "isTransient", "()Z", "getNeedClipping", "setNeedClipping", "(Z)V", "needClipping", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivVideoView extends FrameContainerLayout implements msk, ssi0 {
    private final /* synthetic */ nsk $$delegate_0;
    private com.yandex.div.core.state.b path;
    private final List<f1k> videoSubscriptions;

    public DivVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.$$delegate_0 = new nsk();
        this.videoSubscriptions = new ArrayList();
    }

    @Override // defpackage.uvo
    public void addSubscription(f1k subscription) {
        this.$$delegate_0.addSubscription(subscription);
    }

    public final void addVideoSubscription(f1k subscription) {
        if (subscription == null || subscription == f1k.O1) {
            return;
        }
        this.videoSubscriptions.add(subscription);
    }

    @Override // defpackage.uvo
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        a divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            divBorderDrawer.b(canvas);
            super.draw(canvas);
            divBorderDrawer.c(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        return getMeasuredHeight() - getPaddingBottom();
    }

    @Override // defpackage.msk
    public aw5 getBindingContext() {
        return this.$$delegate_0.w;
    }

    @Override // defpackage.msk
    public y2k getDiv() {
        return (y2k) this.$$delegate_0.c;
    }

    @Override // defpackage.ugk
    public a getDivBorderDrawer() {
        return this.$$delegate_0.a.a;
    }

    @Override // defpackage.ugk
    public boolean getNeedClipping() {
        return this.$$delegate_0.a.b;
    }

    public final com.yandex.div.core.state.b getPath() {
        return this.path;
    }

    public final DivPlayerView getPlayerView() {
        getChildCount();
        View childAt = getChildAt(0);
        if (childAt == null || !(childAt instanceof DivPlayerView)) {
            return null;
        }
        return (DivPlayerView) childAt;
    }

    @Override // defpackage.uvo
    public List<f1k> getSubscriptions() {
        return this.$$delegate_0.x;
    }

    @Override // defpackage.ugk
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // defpackage.ax01
    public boolean isTransient() {
        return this.$$delegate_0.b.isTransient();
    }

    public void onBoundsChanged(int width, int height) {
        this.$$delegate_0.a(width, height);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        onBoundsChanged(w, h);
    }

    @Override // defpackage.msk, defpackage.uvo, defpackage.ssi0
    public void release() {
        super.release();
        releaseMedia();
    }

    @Override // defpackage.ugk
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public void releaseMedia() {
        DivPlayerView playerView = getPlayerView();
        if (playerView != null) {
            r4l attachedPlayer = playerView.getAttachedPlayer();
            playerView.detach();
            if (attachedPlayer != null) {
                attachedPlayer.release();
            }
        }
        Iterator<T> it = this.videoSubscriptions.iterator();
        while (it.hasNext()) {
            ((f1k) it.next()).close();
        }
        this.videoSubscriptions.clear();
    }

    @Override // defpackage.msk
    public void setBindingContext(aw5 aw5Var) {
        this.$$delegate_0.w = aw5Var;
    }

    @Override // defpackage.ugk
    public void setBorder(aw5 bindingContext, DivBorder border, View view) {
        this.$$delegate_0.setBorder(bindingContext, border, view);
    }

    @Override // defpackage.ugk
    public void setNeedClipping(boolean z) {
        this.$$delegate_0.setNeedClipping(z);
    }

    public final void setPath(com.yandex.div.core.state.b bVar) {
        this.path = bVar;
    }

    @Override // defpackage.ax01
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // defpackage.ax01
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    @Override // defpackage.msk
    public void setDiv(y2k y2kVar) {
        this.$$delegate_0.c = y2kVar;
    }

    public DivVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivVideoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? fng0.divImageStyle : i);
    }

    public DivVideoView(Context context) {
        this(context, null, 0, 6, null);
    }
}
