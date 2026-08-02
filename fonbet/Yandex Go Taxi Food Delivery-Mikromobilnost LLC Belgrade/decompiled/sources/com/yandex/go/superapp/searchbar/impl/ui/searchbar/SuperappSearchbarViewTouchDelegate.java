package com.yandex.go.superapp.searchbar.impl.ui.searchbar;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.g73;
import defpackage.jl40;
import defpackage.jr31;
import defpackage.n2y;
import defpackage.pew0;
import defpackage.rdw0;
import defpackage.scc;
import defpackage.sdw0;
import defpackage.tdw0;
import defpackage.w511;
import defpackage.wls;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$IntRef;
import ru.yandex.taxi.utils.TouchDelegateComposite;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/go/superapp/searchbar/impl/ui/searchbar/SuperappSearchbarViewTouchDelegate;", "Landroid/view/TouchDelegate;", "Lcom/yandex/go/superapp/searchbar/impl/ui/searchbar/SuperappSearchbarView;", "view", "Ln2y;", "binding", "Lpew0;", "dimens", "<init>", "(Lcom/yandex/go/superapp/searchbar/impl/ui/searchbar/SuperappSearchbarView;Ln2y;Lpew0;)V", "Lzy11;", "recalculateStateIfNeeded", "()V", "Lru/yandex/taxi/utils/TouchDelegateComposite;", "calculateExpandedStateDelegate", "()Lru/yandex/taxi/utils/TouchDelegateComposite;", "", "isVisibleState", "Ltdw0;", "mode", "setMode", "(ZLtdw0;)V", "onSizeChanged", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lcom/yandex/go/superapp/searchbar/impl/ui/searchbar/SuperappSearchbarView;", "Ln2y;", "Lpew0;", "Z", "Ltdw0;", "expandedStateDelegate", "Landroid/view/TouchDelegate;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperappSearchbarViewTouchDelegate extends TouchDelegate {
    private final n2y binding;
    private final pew0 dimens;
    private TouchDelegate expandedStateDelegate;
    private boolean isVisibleState;
    private tdw0 mode;
    private final SuperappSearchbarView view;

    public SuperappSearchbarViewTouchDelegate(SuperappSearchbarView superappSearchbarView, n2y n2yVar, pew0 pew0Var) {
        super(new Rect(), superappSearchbarView);
        this.view = superappSearchbarView;
        this.binding = n2yVar;
        this.dimens = pew0Var;
    }

    private final TouchDelegateComposite calculateExpandedStateDelegate() {
        ViewParent parent = this.view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        boolean n = xw31.n(this.view.getContext());
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        int top = this.view.getTop();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        TouchDelegateComposite touchDelegateComposite = new TouchDelegateComposite(this.view);
        wls superappSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeLeadButtonTouchBounds$1 = n ? new SuperappSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeLeadButtonTouchBounds$1(ref$IntRef2, top, measuredHeight, touchDelegateComposite) : new SuperappSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeLeadButtonTouchBounds$2(ref$IntRef, top, measuredHeight, touchDelegateComposite);
        wls superappSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeTrailButtonTouchBounds$1 = n ? new SuperappSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeTrailButtonTouchBounds$1(ref$IntRef, top, measuredHeight, touchDelegateComposite) : new SuperappSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeTrailButtonTouchBounds$2(ref$IntRef2, top, measuredHeight, touchDelegateComposite);
        calculateExpandedStateDelegate$forEachWithButtonBounds(new g73(2, new jr31(this.binding.d, 0)), this, superappSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeLeadButtonTouchBounds$1);
        calculateExpandedStateDelegate$forEachWithButtonBounds(a.q0(new g73(2, new jr31(this.binding.g, 0))), this, superappSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeTrailButtonTouchBounds$1);
        touchDelegateComposite.addDelegate(new TouchDelegate(new Rect(ref$IntRef.element, top, ref$IntRef2.element, measuredHeight), this.view));
        return touchDelegateComposite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void calculateExpandedStateDelegate$consumeLeftButtonTouchBounds(Ref$IntRef ref$IntRef, int i, int i2, TouchDelegateComposite touchDelegateComposite, View view, int i3) {
        int i4 = ref$IntRef.element;
        touchDelegateComposite.addDelegate(new TouchDelegate(new Rect(i4, i, i4 + i3, i2), view));
        ref$IntRef.element += i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void calculateExpandedStateDelegate$consumeRightButtonTouchBounds(Ref$IntRef ref$IntRef, int i, int i2, TouchDelegateComposite touchDelegateComposite, View view, int i3) {
        int i4 = ref$IntRef.element;
        touchDelegateComposite.addDelegate(new TouchDelegate(new Rect(i4 - i3, i, i4, i2), view));
        ref$IntRef.element -= i3;
    }

    private static final void calculateExpandedStateDelegate$forEachWithButtonBounds(Iterable<? extends View> iterable, SuperappSearchbarViewTouchDelegate superappSearchbarViewTouchDelegate, wls wlsVar) {
        int i = 0;
        for (View view : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            View view2 = view;
            int measuredWidth = view2.getMeasuredWidth();
            if (i == 0) {
                measuredWidth += superappSearchbarViewTouchDelegate.binding.c.getPaddingStart() + superappSearchbarViewTouchDelegate.dimens.b.d;
            }
            wlsVar.invoke(view2, Integer.valueOf(measuredWidth));
            i = i2;
        }
    }

    private final void recalculateStateIfNeeded() {
        TouchDelegateComposite touchDelegateComposite;
        tdw0 tdw0Var = this.mode;
        if (tdw0Var == null || tdw0Var.equals(rdw0.a)) {
            touchDelegateComposite = null;
        } else {
            if (!tdw0Var.equals(sdw0.a)) {
                w511.b();
                return;
            }
            touchDelegateComposite = calculateExpandedStateDelegate();
        }
        this.expandedStateDelegate = touchDelegateComposite;
    }

    public final void onSizeChanged() {
        recalculateStateIfNeeded();
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(MotionEvent event) {
        boolean z = this.isVisibleState;
        if (!z) {
            return false;
        }
        if (!z) {
            w511.b();
            return false;
        }
        TouchDelegate touchDelegate = this.expandedStateDelegate;
        if (touchDelegate != null) {
            return touchDelegate.onTouchEvent(event);
        }
        return false;
    }

    public final void setMode(boolean isVisibleState, tdw0 mode) {
        this.isVisibleState = isVisibleState;
        if (jl40.l(mode, this.mode)) {
            return;
        }
        this.mode = mode;
        recalculateStateIfNeeded();
    }
}
