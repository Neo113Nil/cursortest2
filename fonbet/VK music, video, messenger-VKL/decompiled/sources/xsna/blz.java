package xsna;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.live.impl.views.chat.LiveRecycleView;

/* compiled from: LiveRecycleView.java */
/* loaded from: classes3.dex */
public final class blz implements RecyclerView.s {
    public final float b;
    public float c;
    public float d;
    public boolean e;

    public blz(LiveRecycleView liveRecycleView) {
        this.b = ViewConfiguration.get(liveRecycleView.getContext()).getScaledTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 0) {
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
            this.e = false;
            this.c = motionEvent.getY();
            this.d = motionEvent.getX();
            return false;
        }
        if (action != 1) {
            if (action == 2) {
                if (!this.e) {
                    float abs = Math.abs(motionEvent.getX() - this.d);
                    float abs2 = Math.abs(motionEvent.getY() - this.c);
                    float f = this.b;
                    boolean z2 = abs > abs2 && abs > 4.0f * f;
                    this.e = abs2 >= abs && abs2 > f;
                    ViewParent parent = recyclerView.getParent();
                    if (!this.e && z2) {
                        z = false;
                    }
                    parent.requestDisallowInterceptTouchEvent(z);
                }
            }
            return false;
        }
        recyclerView.getParent().requestDisallowInterceptTouchEvent(false);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void h(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void f(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
    }
}
