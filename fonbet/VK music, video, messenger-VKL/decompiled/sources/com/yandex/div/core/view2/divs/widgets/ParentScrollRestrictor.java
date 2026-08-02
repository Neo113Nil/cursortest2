package com.yandex.div.core.view2.divs.widgets;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;

/* compiled from: ParentScrollRestrictor.kt */
/* loaded from: classes7.dex */
public final class ParentScrollRestrictor implements OnInterceptTouchEventListener {
    public static final ParentScrollRestrictor INSTANCE = new ParentScrollRestrictor();

    private ParentScrollRestrictor() {
    }

    @Override // com.yandex.div.internal.widget.OnInterceptTouchEventListener
    public boolean onInterceptTouchEvent(ViewGroup viewGroup, MotionEvent motionEvent) {
        ViewParent parent = viewGroup.getParent();
        if (parent == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            parent.requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 1 || actionMasked == 3) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }
}
