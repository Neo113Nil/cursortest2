package com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.delegates;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views.SuperAppMapSearchbarView;
import defpackage.e5w0;
import defpackage.g73;
import defpackage.jr31;
import defpackage.s6w0;
import defpackage.scc;
import defpackage.wls;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$IntRef;
import ru.yandex.taxi.utils.TouchDelegateComposite;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/ui/main/searchbar/delegates/SuperAppMapSearchbarViewTouchDelegate;", "Landroid/view/TouchDelegate;", "Lcom/yandex/go/superapp/discovery/map/impl/ui/main/searchbar/views/SuperAppMapSearchbarView;", "view", "Ls6w0;", "binding", "Le5w0;", "dimens", "<init>", "(Lcom/yandex/go/superapp/discovery/map/impl/ui/main/searchbar/views/SuperAppMapSearchbarView;Ls6w0;Le5w0;)V", "Lzy11;", "calculateExpandedStateDelegate", "()V", "onSizeChanged", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lcom/yandex/go/superapp/discovery/map/impl/ui/main/searchbar/views/SuperAppMapSearchbarView;", "Ls6w0;", "Le5w0;", "expandedStateDelegate", "Landroid/view/TouchDelegate;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppMapSearchbarViewTouchDelegate extends TouchDelegate {
    private final s6w0 binding;
    private final e5w0 dimens;
    private TouchDelegate expandedStateDelegate;
    private final SuperAppMapSearchbarView view;

    public SuperAppMapSearchbarViewTouchDelegate(SuperAppMapSearchbarView superAppMapSearchbarView, s6w0 s6w0Var, e5w0 e5w0Var) {
        super(new Rect(), superAppMapSearchbarView);
        this.view = superAppMapSearchbarView;
        this.binding = s6w0Var;
        this.dimens = e5w0Var;
    }

    private final void calculateExpandedStateDelegate() {
        ViewParent parent = this.view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        boolean n = xw31.n(this.view.getContext());
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        int top = this.view.getTop();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        TouchDelegateComposite touchDelegateComposite = new TouchDelegateComposite(this.view);
        wls superAppMapSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeLeadButtonTouchBounds$1 = n ? new SuperAppMapSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeLeadButtonTouchBounds$1(ref$IntRef2, top, measuredHeight, touchDelegateComposite) : new SuperAppMapSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeLeadButtonTouchBounds$2(ref$IntRef, top, measuredHeight, touchDelegateComposite);
        wls superAppMapSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeTrailButtonTouchBounds$1 = n ? new SuperAppMapSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeTrailButtonTouchBounds$1(ref$IntRef, top, measuredHeight, touchDelegateComposite) : new SuperAppMapSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeTrailButtonTouchBounds$2(ref$IntRef2, top, measuredHeight, touchDelegateComposite);
        calculateExpandedStateDelegate$forEachWithButtonBounds(new g73(2, new jr31(this.binding.c, 0)), this, superAppMapSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeLeadButtonTouchBounds$1);
        calculateExpandedStateDelegate$forEachWithButtonBounds(a.q0(new g73(2, new jr31(this.binding.f, 0))), this, superAppMapSearchbarViewTouchDelegate$calculateExpandedStateDelegate$consumeTrailButtonTouchBounds$1);
        touchDelegateComposite.addDelegate(new TouchDelegate(new Rect(ref$IntRef.element, top, ref$IntRef2.element, measuredHeight), this.view));
        this.expandedStateDelegate = touchDelegateComposite;
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

    private static final void calculateExpandedStateDelegate$forEachWithButtonBounds(Iterable<? extends View> iterable, SuperAppMapSearchbarViewTouchDelegate superAppMapSearchbarViewTouchDelegate, wls wlsVar) {
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
                measuredWidth += superAppMapSearchbarViewTouchDelegate.binding.b.getPaddingStart() + superAppMapSearchbarViewTouchDelegate.dimens.d;
            }
            wlsVar.invoke(view2, Integer.valueOf(measuredWidth));
            i = i2;
        }
    }

    public final void onSizeChanged() {
        calculateExpandedStateDelegate();
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(MotionEvent event) {
        TouchDelegate touchDelegate = this.expandedStateDelegate;
        if (touchDelegate != null) {
            return touchDelegate.onTouchEvent(event);
        }
        return false;
    }
}
