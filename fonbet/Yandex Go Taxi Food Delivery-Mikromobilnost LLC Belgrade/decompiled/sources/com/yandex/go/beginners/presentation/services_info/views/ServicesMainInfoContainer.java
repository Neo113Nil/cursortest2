package com.yandex.go.beginners.presentation.services_info.views;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import defpackage.al5;
import defpackage.h8;
import defpackage.scc;
import defpackage.uxq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u0017*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010%\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0017H\u0014¢\u0006\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0013\u0010.\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u00100\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u00103\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b4\u00102R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020+0\u00048F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/yandex/go/beginners/presentation/services_info/views/ServicesMainInfoContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "", "Lal5;", "services", "Landroid/graphics/Typeface;", "mainInfoTypeface", "Luxq0;", "servicesCoordinator", "<init>", "(Landroid/content/Context;Ljava/util/List;Landroid/graphics/Typeface;Luxq0;)V", "Landroid/graphics/Rect;", "Landroid/view/View;", "prev", "current", "Lzy11;", "updatePosition", "(Landroid/graphics/Rect;Landroid/view/View;Landroid/view/View;)V", "child", "setFirstPosition", "(Landroid/graphics/Rect;Landroid/view/View;)V", "", "index", "getCurrentWidth", "(Landroid/view/View;I)I", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/graphics/Typeface;", "Luxq0;", "childPositionRect", "Landroid/graphics/Rect;", "Lcom/yandex/go/beginners/presentation/services_info/views/ServiceMainInfoItemView;", "getMainService", "()Lcom/yandex/go/beginners/presentation/services_info/views/ServiceMainInfoItemView;", "mainService", "getNextService", "nextService", "getLastServiceEndPoint", "()I", "lastServiceEndPoint", "getDisappearingServiceWidth", "disappearingServiceWidth", "getOthersServices", "()Ljava/util/List;", "othersServices", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServicesMainInfoContainer extends ViewGroup {
    public static final int $stable = 8;
    private Rect childPositionRect;
    private final Typeface mainInfoTypeface;
    private final uxq0 servicesCoordinator;

    public ServicesMainInfoContainer(Context context, List<al5> list, Typeface typeface, uxq0 uxq0Var) {
        super(context);
        this.mainInfoTypeface = typeface;
        this.servicesCoordinator = uxq0Var;
        this.childPositionRect = new Rect();
        Iterator it = a.q0(list).iterator();
        while (it.hasNext()) {
            addView(new ServiceMainInfoItemView(context, (al5) it.next(), this.mainInfoTypeface));
        }
    }

    private final int getCurrentWidth(View view, int i) {
        return i == 0 ? view.getMeasuredWidth() : ((ServiceMainInfoItemView) view).getTextWidth();
    }

    private final void setFirstPosition(Rect rect, View view) {
        int paddingLeft = getPaddingLeft();
        rect.left = paddingLeft;
        rect.right = view.getMeasuredWidth() + paddingLeft;
        rect.top = getPaddingTop();
        rect.bottom = view.getMeasuredHeight() - getPaddingBottom();
    }

    private final void updatePosition(Rect rect, View view, View view2) {
        int iconWidth = rect.right - ((ServiceMainInfoItemView) view).getIconWidth();
        rect.left = iconWidth;
        rect.right = view2.getMeasuredWidth() + iconWidth;
    }

    public final int getDisappearingServiceWidth() {
        ServiceMainInfoItemView mainService;
        if (this.servicesCoordinator.a == 0 || (mainService = getMainService()) == null) {
            return 0;
        }
        return mainService.getTextWidth();
    }

    public final int getLastServiceEndPoint() {
        View childAt = getChildAt(0);
        ServiceMainInfoItemView serviceMainInfoItemView = childAt instanceof ServiceMainInfoItemView ? (ServiceMainInfoItemView) childAt : null;
        if (serviceMainInfoItemView == null) {
            return 0;
        }
        int[] iArr = new int[2];
        serviceMainInfoItemView.getLocationOnScreen(iArr);
        return serviceMainInfoItemView.getTextWidth() + new Point(iArr[0], iArr[1]).x;
    }

    public final ServiceMainInfoItemView getMainService() {
        View childAt = getChildAt(this.servicesCoordinator.a);
        if (childAt instanceof ServiceMainInfoItemView) {
            return (ServiceMainInfoItemView) childAt;
        }
        return null;
    }

    public final ServiceMainInfoItemView getNextService() {
        View childAt = getChildAt(this.servicesCoordinator.a - 1);
        if (childAt instanceof ServiceMainInfoItemView) {
            return (ServiceMainInfoItemView) childAt;
        }
        return null;
    }

    public final List<ServiceMainInfoItemView> getOthersServices() {
        int i = this.servicesCoordinator.a;
        if (i <= 0) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(getChildAt((i - 1) - i2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ServiceMainInfoItemView) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        View childAt = getChildAt(getChildCount() - 1);
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            }
            View childAt2 = getChildAt(childCount);
            int childCount2 = getChildCount() - 1;
            Rect rect = this.childPositionRect;
            if (childCount == childCount2) {
                setFirstPosition(rect, childAt2);
            } else {
                updatePosition(rect, childAt, childAt2);
                childAt = childAt2;
            }
            Rect rect2 = this.childPositionRect;
            childAt2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        h8 h8Var = new h8(3, this);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (h8Var.hasNext()) {
            Object next = h8Var.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                scc.m();
                throw null;
            }
            View view = (View) next;
            view.measure(0, 0);
            int measuredHeight = view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                i2 = measuredHeight;
            }
            i += getCurrentWidth(view, i3);
            i3 = i4;
        }
        setMeasuredDimension(getPaddingEnd() + getPaddingStart() + i, getPaddingBottom() + getPaddingTop() + i2);
    }
}
