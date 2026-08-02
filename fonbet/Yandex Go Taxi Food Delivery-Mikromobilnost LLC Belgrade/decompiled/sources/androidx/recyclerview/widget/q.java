package androidx.recyclerview.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import defpackage.mbs;
import defpackage.vji0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q implements vji0 {
    public final /* synthetic */ s a;

    public q(s sVar) {
        this.a = sVar;
    }

    @Override // defpackage.vji0
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        s sVar = this.a;
        sVar.Q.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        ItemTouchHelper$RecoverAnimation itemTouchHelper$RecoverAnimation = null;
        if (actionMasked == 0) {
            sVar.E = motionEvent.getPointerId(0);
            sVar.w = motionEvent.getX();
            sVar.x = motionEvent.getY();
            VelocityTracker velocityTracker = sVar.M;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            sVar.M = VelocityTracker.obtain();
            if (sVar.c == null) {
                ArrayList arrayList = sVar.I;
                if (!arrayList.isEmpty()) {
                    View k = sVar.k(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        ItemTouchHelper$RecoverAnimation itemTouchHelper$RecoverAnimation2 = (ItemTouchHelper$RecoverAnimation) arrayList.get(size);
                        if (itemTouchHelper$RecoverAnimation2.mViewHolder.a == k) {
                            itemTouchHelper$RecoverAnimation = itemTouchHelper$RecoverAnimation2;
                            break;
                        }
                        size--;
                    }
                }
                if (itemTouchHelper$RecoverAnimation != null) {
                    sVar.w -= itemTouchHelper$RecoverAnimation.mX;
                    sVar.x -= itemTouchHelper$RecoverAnimation.mY;
                    sVar.j(itemTouchHelper$RecoverAnimation.mViewHolder, true);
                    if (sVar.a.remove(itemTouchHelper$RecoverAnimation.mViewHolder.a)) {
                        sVar.F.b(sVar.K, itemTouchHelper$RecoverAnimation.mViewHolder);
                    }
                    sVar.o(itemTouchHelper$RecoverAnimation.mViewHolder, itemTouchHelper$RecoverAnimation.mActionState);
                    sVar.q(sVar.H, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            sVar.E = -1;
            sVar.o(null, 0);
        } else {
            int i = sVar.E;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                sVar.h(actionMasked, findPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = sVar.M;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return sVar.c != null;
    }

    @Override // defpackage.vji0
    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            this.a.o(null, 0);
        }
    }

    @Override // defpackage.vji0
    public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        s sVar = this.a;
        mbs mbsVar = sVar.L;
        sVar.Q.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = sVar.M;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (sVar.E == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(sVar.E);
        if (findPointerIndex >= 0) {
            sVar.h(actionMasked, findPointerIndex, motionEvent);
        }
        x0 x0Var = sVar.c;
        if (x0Var == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex >= 0) {
                    sVar.q(sVar.H, findPointerIndex, motionEvent);
                    sVar.n(x0Var);
                    sVar.K.removeCallbacks(mbsVar);
                    mbsVar.run();
                    sVar.K.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == sVar.E) {
                    sVar.E = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    sVar.q(sVar.H, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = sVar.M;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        sVar.o(null, 0);
        sVar.E = -1;
    }
}
