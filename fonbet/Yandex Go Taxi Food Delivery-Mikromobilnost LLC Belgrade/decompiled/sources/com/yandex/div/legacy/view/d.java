package com.yandex.div.legacy.view;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.w801;

/* loaded from: classes11.dex */
public final class d extends RecyclerView.i {
    public final RecyclerView a;
    public final GestureDetector b;

    public d(final w801 w801Var, Context context, RecyclerView recyclerView) {
        this.a = recyclerView;
        this.b = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener(this) { // from class: com.yandex.div.legacy.view.TrafficDivViewBuilder$RecyclerViewClickListener$1
            final /* synthetic */ d this$1;

            {
                this.this$1 = this;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return true;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i, defpackage.vji0
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        RecyclerView recyclerView2 = this.a;
        if (!recyclerView2.hasOnClickListeners() || !this.b.onTouchEvent(motionEvent)) {
            return false;
        }
        recyclerView2.callOnClick();
        return true;
    }
}
