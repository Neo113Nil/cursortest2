package com.yandex.go.feed.global.div.custom.time_slot_histogram;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.s7z0;
import defpackage.sp31;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/feed/global/div/custom/time_slot_histogram/TimeSlotHistogramRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", "left", "top", "right", "bottom", "Lzy11;", "onLayout", "(ZIIII)V", "Landroid/view/MotionEvent;", "motionEvent", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ls7z0;", "horizontalScrollGuard", "Ls7z0;", "Landroid/graphics/Rect;", "systemGestureExclusionRect", "Landroid/graphics/Rect;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimeSlotHistogramRecyclerView extends RecyclerView {
    private final s7z0 horizontalScrollGuard;
    private final Rect systemGestureExclusionRect;

    public TimeSlotHistogramRecyclerView(Context context) {
        super(context);
        this.horizontalScrollGuard = new s7z0(context);
        this.systemGestureExclusionRect = new Rect();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        s7z0 s7z0Var = this.horizontalScrollGuard;
        ViewParent parent = getParent();
        s7z0Var.getClass();
        int action = motionEvent.getAction();
        if (action == 0) {
            s7z0Var.b = motionEvent.getX();
            s7z0Var.c = motionEvent.getY();
            parent.requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getX() - s7z0Var.b);
            float abs2 = Math.abs(motionEvent.getY() - s7z0Var.c);
            float f = s7z0Var.a;
            if (abs > f || abs2 > f) {
                if (abs2 > abs) {
                    parent.requestDisallowInterceptTouchEvent(false);
                } else {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            this.systemGestureExclusionRect.set(0, 0, getWidth(), getHeight());
            List singletonList = Collections.singletonList(this.systemGestureExclusionRect);
            WeakHashMap weakHashMap = b.a;
            sp31.c(this, singletonList);
        }
    }
}
