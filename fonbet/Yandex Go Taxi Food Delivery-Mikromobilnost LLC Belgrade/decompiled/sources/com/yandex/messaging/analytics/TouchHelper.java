package com.yandex.messaging.analytics;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.state.db.StateEntry;
import defpackage.dlp0;
import defpackage.dzz0;
import defpackage.l4j0;
import defpackage.m4j0;
import defpackage.ma30;
import defpackage.x22;

/* loaded from: classes15.dex */
class TouchHelper extends GestureDetector.SimpleOnGestureListener implements ma30 {
    private GestureDetector mGestureDetector;
    private View mParent;
    private dzz0 mTapListener;

    public TouchHelper(View view, dzz0 dzz0Var) {
        this.mGestureDetector = new GestureDetector(view.getContext(), this);
        this.mTapListener = dzz0Var;
        this.mParent = view;
    }

    private View findClickableView(View view, MotionEvent motionEvent) {
        if (!(view instanceof ViewGroup)) {
            if (view instanceof TextureView) {
                return view;
            }
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                Rect rect = new Rect();
                childAt.getGlobalVisibleRect(rect);
                if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    View findClickableView = findClickableView(childAt, motionEvent);
                    if (findClickableView != null) {
                        return findClickableView;
                    }
                    if (childAt.isClickable()) {
                        return childAt;
                    }
                } else {
                    continue;
                }
            }
        }
        if ((view instanceof dlp0) || (view instanceof Toolbar)) {
            return view;
        }
        return null;
    }

    @Override // defpackage.ma30
    public void onDispatchTouchEvent(MotionEvent motionEvent) {
        this.mGestureDetector.onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View findClickableView = findClickableView(this.mParent, motionEvent);
        if (findClickableView == null) {
            return false;
        }
        a aVar = (a) this.mTapListener;
        aVar.getClass();
        StringBuilder sb = new StringBuilder(128);
        StringBuilder sb2 = new StringBuilder(128);
        View view = null;
        String str = null;
        while (findClickableView != null) {
            if ((findClickableView instanceof RecyclerView) && view != null) {
                sb.insert(0, ((RecyclerView) findClickableView).getChildAdapterPosition(view)).insert(0, "/");
                sb2.insert(0, "none").insert(0, "/");
            }
            m4j0 a = m4j0.a(findClickableView);
            if (a != null) {
                String str2 = l4j0.a(findClickableView).a;
                if (str2 != null) {
                    str = str2;
                }
                sb.insert(0, a.a).insert(0, "/");
                sb2.insert(0, a.b).insert(0, "/");
            } else if (sb.length() == 0 && findClickableView.getId() != -1) {
                int id = findClickableView.getId();
                sb.insert(0, id > 16777215 ? aVar.a.getResources().getResourceEntryName(id) : "unknown_view").insert(0, "/");
                sb2.insert(0, "none").insert(0, "/");
            }
            view = findClickableView;
            findClickableView = findClickableView.getParent() instanceof View ? (View) findClickableView.getParent() : null;
        }
        if (sb.length() == 0) {
            return true;
        }
        x22 x22Var = aVar.b;
        if (str != null) {
            x22Var.h("q_tap", StateEntry.COLUMN_PATH, sb.toString(), "args", sb2.toString(), "show_id", str);
            return true;
        }
        x22Var.f("q_tap", StateEntry.COLUMN_PATH, sb.toString(), "args", sb2.toString());
        return true;
    }
}
