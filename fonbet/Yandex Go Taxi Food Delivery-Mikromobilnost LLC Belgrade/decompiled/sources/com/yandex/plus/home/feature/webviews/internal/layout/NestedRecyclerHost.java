package com.yandex.plus.home.feature.webviews.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/layout/NestedRecyclerHost;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/MotionEvent;", "e", "Lzy11;", "handleInterceptTouchEvent", "(Landroid/view/MotionEvent;)V", "", "isRecyclerCanScrollVertically", "()Z", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "touchSlop", CA20Status.STATUS_USER_I, "", "initialX", "F", "initialY", "Landroidx/recyclerview/widget/RecyclerView;", "getChild", "()Landroidx/recyclerview/widget/RecyclerView;", "child", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NestedRecyclerHost extends FrameLayout {
    private float initialX;
    private float initialY;
    private int touchSlop;

    public NestedRecyclerHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private final RecyclerView getChild() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof RecyclerView) {
                return (RecyclerView) childAt;
            }
        }
        return null;
    }

    private final void handleInterceptTouchEvent(MotionEvent e) {
        if (e.getAction() == 0) {
            this.initialX = e.getX();
            this.initialY = e.getY();
            getParent().requestDisallowInterceptTouchEvent(isRecyclerCanScrollVertically());
        } else if (e.getAction() == 2) {
            float abs = Math.abs(e.getX() - this.initialX);
            if (abs <= Math.abs(e.getY() - this.initialY) || abs <= this.touchSlop) {
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(isRecyclerCanScrollVertically());
                    return;
                }
                return;
            }
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    private final boolean isRecyclerCanScrollVertically() {
        RecyclerView child = getChild();
        if (child != null) {
            return child.canScrollVertically(-1);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent e) {
        handleInterceptTouchEvent(e);
        return super.onInterceptTouchEvent(e);
    }

    public /* synthetic */ NestedRecyclerHost(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NestedRecyclerHost(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
