package com.yandex.go.scooters.bdui.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.go.design.view.GoFrameLayout;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0013"}, d2 = {"Lcom/yandex/go/scooters/bdui/view/ScootersComposeToDivkitCompatFrameLayout;", "Lcom/yandex/go/design/view/GoFrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "startY", "", "touchSlop", "", "canScrollVertically", "", "direction", "checkScroll", "view", "Landroid/view/View;", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "impl", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersComposeToDivkitCompatFrameLayout extends GoFrameLayout {
    public static final int $stable = 8;
    private float startY;
    private final int touchSlop;

    public ScootersComposeToDivkitCompatFrameLayout(Context context) {
        super(context, null, 0, 0, 14, null);
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private final boolean checkScroll(View view, int direction) {
        if (view != this && view.canScrollVertically(direction)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (checkScroll(viewGroup.getChildAt(i), direction)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        return super.canScrollVertically(direction) || checkScroll(this, direction);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r0 != 3) goto L24;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(MotionEvent ev) {
        ViewParent parent;
        int actionMasked = ev.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (ev.getY() - this.startY > this.touchSlop && !canScrollVertically(-1) && (parent = getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
        } else {
            this.startY = ev.getY();
            ViewParent parent3 = getParent();
            if (parent3 != null) {
                parent3.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.dispatchTouchEvent(ev);
    }
}
