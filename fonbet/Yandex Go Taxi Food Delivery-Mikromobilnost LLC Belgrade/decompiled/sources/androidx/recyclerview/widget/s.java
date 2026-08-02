package androidx.recyclerview.widget;

import android.animation.Animator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.mbs;
import defpackage.ny61;
import defpackage.qwg0;
import defpackage.uji0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s extends RecyclerView.d implements uji0 {
    public float A;
    public float B;
    public float C;
    public float D;
    public final ItemTouchHelper$Callback F;
    public int H;
    public int J;
    public RecyclerView K;
    public VelocityTracker M;
    public ArrayList N;
    public ArrayList O;
    public GestureDetector Q;
    public ItemTouchHelper$ItemTouchHelperGestureListener R;
    public Rect T;
    public long U;
    public float w;
    public float x;
    public float y;
    public float z;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public x0 c = null;
    public int E = -1;
    public int G = 0;
    public final ArrayList I = new ArrayList();
    public final mbs L = new mbs(4, this);
    public View P = null;
    public final q S = new q(this);

    public s(ItemTouchHelper$Callback itemTouchHelper$Callback) {
        this.F = itemTouchHelper$Callback;
    }

    public static boolean m(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // defpackage.uji0
    public final void a(View view) {
        if (view == this.P) {
            this.P = null;
        }
        x0 childViewHolder = this.K.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        x0 x0Var = this.c;
        if (x0Var != null && childViewHolder == x0Var) {
            o(null, 0);
            return;
        }
        j(childViewHolder, false);
        if (this.a.remove(childViewHolder.a)) {
            this.F.b(this.K, childViewHolder);
        }
    }

    @Override // defpackage.uji0
    public final void b(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.k kVar) {
        float f;
        float f2;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        x0 x0Var = this.c;
        int i = this.G;
        ItemTouchHelper$Callback itemTouchHelper$Callback = this.F;
        itemTouchHelper$Callback.getClass();
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            ItemTouchHelper$RecoverAnimation itemTouchHelper$RecoverAnimation = (ItemTouchHelper$RecoverAnimation) arrayList.get(i2);
            itemTouchHelper$RecoverAnimation.update();
            int save = canvas.save();
            x0 x0Var2 = itemTouchHelper$RecoverAnimation.mViewHolder;
            float f4 = itemTouchHelper$RecoverAnimation.mX;
            float f5 = itemTouchHelper$RecoverAnimation.mY;
            int i3 = itemTouchHelper$RecoverAnimation.mActionState;
            ItemTouchHelper$Callback itemTouchHelper$Callback2 = itemTouchHelper$Callback;
            itemTouchHelper$Callback2.l(canvas, recyclerView, x0Var2, f4, f5, i3, false);
            canvas.restoreToCount(save);
            i2++;
            itemTouchHelper$Callback = itemTouchHelper$Callback2;
        }
        ItemTouchHelper$Callback itemTouchHelper$Callback3 = itemTouchHelper$Callback;
        if (x0Var != null) {
            int save2 = canvas.save();
            itemTouchHelper$Callback3.l(canvas, recyclerView, x0Var, f2, f, i, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        x0 x0Var = this.c;
        this.F.getClass();
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ItemTouchHelper$RecoverAnimation itemTouchHelper$RecoverAnimation = (ItemTouchHelper$RecoverAnimation) arrayList.get(i);
            int save = canvas.save();
            View view = itemTouchHelper$RecoverAnimation.mViewHolder.a;
            canvas.restoreToCount(save);
        }
        if (x0Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            ItemTouchHelper$RecoverAnimation itemTouchHelper$RecoverAnimation2 = (ItemTouchHelper$RecoverAnimation) arrayList.get(i2);
            boolean z2 = itemTouchHelper$RecoverAnimation2.mEnded;
            if (z2 && !itemTouchHelper$RecoverAnimation2.mIsPendingCleanup) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [androidx.recyclerview.widget.ItemTouchHelper$ItemTouchHelperGestureListener] */
    public final void f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.K;
        if (recyclerView2 == recyclerView) {
            return;
        }
        q qVar = this.S;
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.K.removeOnItemTouchListener(qVar);
            this.K.removeOnChildAttachStateChangeListener(this);
            ArrayList arrayList = this.I;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ItemTouchHelper$RecoverAnimation itemTouchHelper$RecoverAnimation = (ItemTouchHelper$RecoverAnimation) arrayList.get(0);
                itemTouchHelper$RecoverAnimation.cancel();
                this.F.b(this.K, itemTouchHelper$RecoverAnimation.mViewHolder);
            }
            arrayList.clear();
            this.P = null;
            VelocityTracker velocityTracker = this.M;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.M = null;
            }
            ItemTouchHelper$ItemTouchHelperGestureListener itemTouchHelper$ItemTouchHelperGestureListener = this.R;
            if (itemTouchHelper$ItemTouchHelperGestureListener != null) {
                itemTouchHelper$ItemTouchHelperGestureListener.doNotReactToLongPress();
                this.R = null;
            }
            if (this.Q != null) {
                this.Q = null;
            }
        }
        this.K = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.y = resources.getDimension(qwg0.item_touch_helper_swipe_escape_velocity);
            this.z = resources.getDimension(qwg0.item_touch_helper_swipe_escape_max_velocity);
            this.J = ViewConfiguration.get(this.K.getContext()).getScaledTouchSlop();
            this.K.addItemDecoration(this);
            this.K.addOnItemTouchListener(qVar);
            this.K.addOnChildAttachStateChangeListener(this);
            this.R = new GestureDetector.SimpleOnGestureListener() { // from class: androidx.recyclerview.widget.ItemTouchHelper$ItemTouchHelperGestureListener
                private boolean mShouldReactToLongPress = true;

                public void doNotReactToLongPress() {
                    this.mShouldReactToLongPress = false;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public boolean onDown(MotionEvent motionEvent) {
                    return true;
                }

                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public void onLongPress(MotionEvent motionEvent) {
                    View k;
                    x0 childViewHolder;
                    if (!this.mShouldReactToLongPress || (k = s.this.k(motionEvent)) == null || (childViewHolder = s.this.K.getChildViewHolder(k)) == null) {
                        return;
                    }
                    s sVar = s.this;
                    ItemTouchHelper$Callback itemTouchHelper$Callback = sVar.F;
                    if ((itemTouchHelper$Callback.c(itemTouchHelper$Callback.e(childViewHolder), sVar.K.getLayoutDirection()) & 16711680) != 0) {
                        int pointerId = motionEvent.getPointerId(0);
                        int i = s.this.E;
                        if (pointerId == i) {
                            int findPointerIndex = motionEvent.findPointerIndex(i);
                            float x = motionEvent.getX(findPointerIndex);
                            float y = motionEvent.getY(findPointerIndex);
                            s sVar2 = s.this;
                            sVar2.w = x;
                            sVar2.x = y;
                            sVar2.B = 0.0f;
                            sVar2.A = 0.0f;
                            if (sVar2.F.j()) {
                                s.this.o(childViewHolder, 2);
                            }
                        }
                    }
                }
            };
            this.Q = new GestureDetector(this.K.getContext(), this.R);
        }
    }

    public final int g(x0 x0Var, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.A > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.M;
        ItemTouchHelper$Callback itemTouchHelper$Callback = this.F;
        if (velocityTracker != null && this.E > -1) {
            velocityTracker.computeCurrentVelocity(1000, itemTouchHelper$Callback.g(this.z));
            float xVelocity = this.M.getXVelocity(this.E);
            float yVelocity = this.M.getYVelocity(this.E);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= itemTouchHelper$Callback.f(this.y) && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.K.getWidth();
        itemTouchHelper$Callback.getClass();
        float f = 0.5f * width;
        if ((i & i2) == 0 || Math.abs(this.A) <= f) {
            return 0;
        }
        return i2;
    }

    public final void h(int i, int i2, MotionEvent motionEvent) {
        View k;
        if (this.c == null && i == 2 && this.G != 2) {
            ItemTouchHelper$Callback itemTouchHelper$Callback = this.F;
            if (itemTouchHelper$Callback.i() && this.K.getScrollState() != 1) {
                RecyclerView.e layoutManager = this.K.getLayoutManager();
                int i3 = this.E;
                x0 x0Var = null;
                if (i3 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(findPointerIndex) - this.w;
                    float y = motionEvent.getY(findPointerIndex) - this.x;
                    float abs = Math.abs(x);
                    float abs2 = Math.abs(y);
                    float f = this.J;
                    if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !layoutManager.I()) && ((abs2 <= abs || !layoutManager.J()) && (k = k(motionEvent)) != null))) {
                        x0Var = this.K.getChildViewHolder(k);
                    }
                }
                if (x0Var == null) {
                    return;
                }
                int c = (itemTouchHelper$Callback.c(itemTouchHelper$Callback.e(x0Var), this.K.getLayoutDirection()) & 65280) >> 8;
                if (c == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f2 = x2 - this.w;
                float f3 = y2 - this.x;
                float abs3 = Math.abs(f2);
                float abs4 = Math.abs(f3);
                float f4 = this.J;
                if (abs3 >= f4 || abs4 >= f4) {
                    if (abs3 > abs4) {
                        if (f2 < 0.0f && (c & 4) == 0) {
                            return;
                        }
                        if (f2 > 0.0f && (c & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f3 < 0.0f && (c & 1) == 0) {
                            return;
                        }
                        if (f3 > 0.0f && (c & 2) == 0) {
                            return;
                        }
                    }
                    this.B = 0.0f;
                    this.A = 0.0f;
                    this.E = motionEvent.getPointerId(0);
                    o(x0Var, 1);
                }
            }
        }
    }

    public final int i(x0 x0Var, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.B > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.M;
        ItemTouchHelper$Callback itemTouchHelper$Callback = this.F;
        if (velocityTracker != null && this.E > -1) {
            velocityTracker.computeCurrentVelocity(1000, itemTouchHelper$Callback.g(this.z));
            float xVelocity = this.M.getXVelocity(this.E);
            float yVelocity = this.M.getYVelocity(this.E);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= itemTouchHelper$Callback.f(this.y) && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.K.getHeight();
        itemTouchHelper$Callback.getClass();
        float f = 0.5f * height;
        if ((i & i2) == 0 || Math.abs(this.B) <= f) {
            return 0;
        }
        return i2;
    }

    public final void j(x0 x0Var, boolean z) {
        ArrayList arrayList = this.I;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ItemTouchHelper$RecoverAnimation itemTouchHelper$RecoverAnimation = (ItemTouchHelper$RecoverAnimation) arrayList.get(size);
            if (itemTouchHelper$RecoverAnimation.mViewHolder == x0Var) {
                itemTouchHelper$RecoverAnimation.mOverridden |= z;
                if (!itemTouchHelper$RecoverAnimation.mEnded) {
                    itemTouchHelper$RecoverAnimation.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View k(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        x0 x0Var = this.c;
        if (x0Var != null) {
            View view = x0Var.a;
            if (m(view, x, y, this.C + this.A, this.D + this.B)) {
                return view;
            }
        }
        ArrayList arrayList = this.I;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ItemTouchHelper$RecoverAnimation itemTouchHelper$RecoverAnimation = (ItemTouchHelper$RecoverAnimation) arrayList.get(size);
            View view2 = itemTouchHelper$RecoverAnimation.mViewHolder.a;
            if (m(view2, x, y, itemTouchHelper$RecoverAnimation.mX, itemTouchHelper$RecoverAnimation.mY)) {
                return view2;
            }
        }
        return this.K.findChildViewUnder(x, y);
    }

    public final void l(float[] fArr) {
        if ((this.H & 12) != 0) {
            fArr[0] = (this.C + this.A) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.H & 3) != 0) {
            fArr[1] = (this.D + this.B) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public final void n(x0 x0Var) {
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i;
        int i2;
        int i3;
        View view;
        if (!this.K.isLayoutRequested() && this.G == 2) {
            ItemTouchHelper$Callback itemTouchHelper$Callback = this.F;
            itemTouchHelper$Callback.getClass();
            int i4 = (int) (this.C + this.A);
            int i5 = (int) (this.D + this.B);
            View view2 = x0Var.a;
            if (Math.abs(i5 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i4 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList = this.N;
                if (arrayList == null) {
                    this.N = new ArrayList();
                    this.O = new ArrayList();
                } else {
                    arrayList.clear();
                    this.O.clear();
                }
                int round = Math.round(this.C + this.A);
                int round2 = Math.round(this.D + this.B);
                int width = view2.getWidth() + round;
                int height = view2.getHeight() + round2;
                int i6 = (round + width) / 2;
                int i7 = (round2 + height) / 2;
                RecyclerView.e layoutManager = this.K.getLayoutManager();
                int d0 = layoutManager.d0();
                int i8 = 0;
                while (i8 < d0) {
                    View c0 = layoutManager.c0(i8);
                    if (c0 == view2) {
                        i = i8;
                    } else {
                        i = i8;
                        if (c0.getBottom() >= round2 && c0.getTop() <= height && c0.getRight() >= round && c0.getLeft() <= width) {
                            x0 childViewHolder = this.K.getChildViewHolder(c0);
                            if (itemTouchHelper$Callback.a(childViewHolder)) {
                                int abs5 = Math.abs(i6 - ((c0.getRight() + c0.getLeft()) / 2));
                                int abs6 = Math.abs(i7 - ((c0.getBottom() + c0.getTop()) / 2));
                                int i9 = (abs6 * abs6) + (abs5 * abs5);
                                i2 = i4;
                                int size = this.N.size();
                                i3 = i5;
                                view = view2;
                                int i10 = 0;
                                int i11 = 0;
                                while (i10 < size) {
                                    int i12 = size;
                                    if (i9 <= ((Integer) this.O.get(i10)).intValue()) {
                                        break;
                                    }
                                    i11++;
                                    i10++;
                                    size = i12;
                                }
                                this.N.add(i11, childViewHolder);
                                this.O.add(i11, Integer.valueOf(i9));
                                i8 = i + 1;
                                i4 = i2;
                                i5 = i3;
                                view2 = view;
                            }
                        }
                    }
                    i2 = i4;
                    i3 = i5;
                    view = view2;
                    i8 = i + 1;
                    i4 = i2;
                    i5 = i3;
                    view2 = view;
                }
                int i13 = i4;
                int i14 = i5;
                View view3 = view2;
                ArrayList arrayList2 = this.N;
                if (arrayList2.size() == 0) {
                    return;
                }
                int width2 = view3.getWidth() + i13;
                int height2 = view3.getHeight() + i14;
                int left2 = i13 - view3.getLeft();
                int top2 = i14 - view3.getTop();
                int size2 = arrayList2.size();
                x0 x0Var2 = null;
                int i15 = -1;
                for (int i16 = 0; i16 < size2; i16++) {
                    x0 x0Var3 = (x0) arrayList2.get(i16);
                    if (left2 > 0 && (right = x0Var3.a.getRight() - width2) < 0 && x0Var3.a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i15) {
                        x0Var2 = x0Var3;
                        i15 = abs4;
                    }
                    if (left2 < 0 && (left = x0Var3.a.getLeft() - i13) > 0 && x0Var3.a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i15) {
                        x0Var2 = x0Var3;
                        i15 = abs3;
                    }
                    if (top2 < 0 && (top = x0Var3.a.getTop() - i14) > 0 && x0Var3.a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i15) {
                        x0Var2 = x0Var3;
                        i15 = abs2;
                    }
                    if (top2 > 0 && (bottom = x0Var3.a.getBottom() - height2) < 0 && x0Var3.a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i15) {
                        x0Var2 = x0Var3;
                        i15 = abs;
                    }
                }
                if (x0Var2 == null) {
                    this.N.clear();
                    this.O.clear();
                    return;
                }
                int E = x0Var2.E();
                int E2 = x0Var.E();
                if (itemTouchHelper$Callback.m(this.K, x0Var, x0Var2)) {
                    this.F.n(this.K, x0Var, E2, x0Var2, E);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x008e, code lost:
    
        if (r8 > 0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(x0 x0Var, int i) {
        ItemTouchHelper$Callback itemTouchHelper$Callback;
        boolean z;
        boolean z2;
        ViewParent parent;
        x0 x0Var2;
        int i2;
        final int i3;
        final float signum;
        if (x0Var == this.c && i == this.G) {
            return;
        }
        this.U = Long.MIN_VALUE;
        final int i4 = this.G;
        j(x0Var, true);
        this.G = i;
        if (i == 2) {
            if (x0Var == null) {
                ny61.g("Must pass a ViewHolder when dragging");
                return;
            }
            this.P = x0Var.a;
        }
        int i5 = (1 << ((i * 8) + 8)) - 1;
        final x0 x0Var3 = this.c;
        ItemTouchHelper$Callback itemTouchHelper$Callback2 = this.F;
        if (x0Var3 != null) {
            View view = x0Var3.a;
            if (view.getParent() != null) {
                if (i4 == 2) {
                    i3 = 0;
                } else {
                    if (this.G != 2) {
                        int e = itemTouchHelper$Callback2.e(x0Var3);
                        int c = (itemTouchHelper$Callback2.c(e, this.K.getLayoutDirection()) & 65280) >> 8;
                        if (c != 0) {
                            int i6 = (e & 65280) >> 8;
                            if (Math.abs(this.A) > Math.abs(this.B)) {
                                i2 = g(x0Var3, c);
                                if (i2 <= 0) {
                                    i2 = i(x0Var3, c);
                                } else if ((i6 & i2) == 0) {
                                    i2 = ItemTouchHelper$Callback.d(i2, this.K.getLayoutDirection());
                                }
                                i3 = i2;
                            } else {
                                i2 = i(x0Var3, c);
                                if (i2 <= 0) {
                                    i2 = g(x0Var3, c);
                                    if (i2 > 0) {
                                        if ((i6 & i2) == 0) {
                                            i2 = ItemTouchHelper$Callback.d(i2, this.K.getLayoutDirection());
                                        }
                                    }
                                }
                                i3 = i2;
                            }
                        }
                    }
                    i2 = 0;
                    i3 = i2;
                }
                VelocityTracker velocityTracker = this.M;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.M = null;
                }
                int i7 = 4;
                float f = 0.0f;
                if (i3 == 1 || i3 == 2) {
                    signum = Math.signum(this.B) * this.K.getHeight();
                } else if (i3 == 4 || i3 == 8 || i3 == 16 || i3 == 32) {
                    signum = 0.0f;
                    f = Math.signum(this.A) * this.K.getWidth();
                } else {
                    signum = 0.0f;
                }
                if (i4 == 2) {
                    i7 = 8;
                } else if (i3 > 0) {
                    i7 = 2;
                }
                float[] fArr = this.b;
                l(fArr);
                final int i8 = i7;
                final float f2 = fArr[0];
                final float f3 = fArr[1];
                final float f4 = f;
                x0Var2 = null;
                ItemTouchHelper$RecoverAnimation itemTouchHelper$RecoverAnimation = new ItemTouchHelper$RecoverAnimation(x0Var3, i8, i4, f2, f3, f4, signum) { // from class: androidx.recyclerview.widget.ItemTouchHelper$3
                    @Override // androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        if (this.mOverridden) {
                            return;
                        }
                        int i9 = i3;
                        s sVar = s.this;
                        if (i9 <= 0) {
                            sVar.F.b(sVar.K, x0Var3);
                        } else {
                            sVar.a.add(x0Var3.a);
                            this.mIsPendingCleanup = true;
                            int i10 = i3;
                            if (i10 > 0) {
                                s sVar2 = s.this;
                                sVar2.K.post(new r(sVar2, this, i10));
                            }
                        }
                        s sVar3 = s.this;
                        View view2 = sVar3.P;
                        View view3 = x0Var3.a;
                        if (view2 == view3 && view3 == view2) {
                            sVar3.P = null;
                        }
                    }
                };
                RecyclerView recyclerView = this.K;
                itemTouchHelper$Callback2.getClass();
                RecyclerView.c itemAnimator = recyclerView.getItemAnimator();
                itemTouchHelper$RecoverAnimation.setDuration(itemAnimator == null ? i8 == 8 ? 200L : 250L : i8 == 8 ? itemAnimator.e : itemAnimator.d);
                this.I.add(itemTouchHelper$RecoverAnimation);
                itemTouchHelper$RecoverAnimation.start();
                itemTouchHelper$Callback = itemTouchHelper$Callback2;
                z = true;
            } else {
                x0Var2 = null;
                if (view == this.P) {
                    this.P = null;
                }
                itemTouchHelper$Callback = itemTouchHelper$Callback2;
                itemTouchHelper$Callback.b(this.K, x0Var3);
                z = false;
            }
            this.c = x0Var2;
        } else {
            itemTouchHelper$Callback = itemTouchHelper$Callback2;
            z = false;
        }
        if (x0Var != null) {
            View view2 = x0Var.a;
            this.H = (itemTouchHelper$Callback.c(itemTouchHelper$Callback.e(x0Var), this.K.getLayoutDirection()) & i5) >> (this.G * 8);
            this.C = view2.getLeft();
            this.D = view2.getTop();
            this.c = x0Var;
            if (i == 2) {
                z2 = false;
                view2.performHapticFeedback(0);
                parent = this.K.getParent();
                if (parent != null) {
                    if (this.c != null) {
                        z2 = true;
                    }
                    parent.requestDisallowInterceptTouchEvent(z2);
                }
                if (!z) {
                    this.K.getLayoutManager().y = true;
                }
                itemTouchHelper$Callback.o(this.c, this.G);
                this.K.invalidate();
            }
        }
        z2 = false;
        parent = this.K.getParent();
        if (parent != null) {
        }
        if (!z) {
        }
        itemTouchHelper$Callback.o(this.c, this.G);
        this.K.invalidate();
    }

    public final void p(x0 x0Var) {
        RecyclerView recyclerView = this.K;
        ItemTouchHelper$Callback itemTouchHelper$Callback = this.F;
        if ((itemTouchHelper$Callback.c(itemTouchHelper$Callback.e(x0Var), recyclerView.getLayoutDirection()) & 16711680) == 0) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (x0Var.a.getParent() != this.K) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker = this.M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.M = VelocityTracker.obtain();
        this.B = 0.0f;
        this.A = 0.0f;
        o(x0Var, 2);
    }

    public final void q(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.w;
        this.A = f;
        this.B = y - this.x;
        if ((i & 4) == 0) {
            this.A = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.A = Math.min(0.0f, this.A);
        }
        if ((i & 1) == 0) {
            this.B = Math.max(0.0f, this.B);
        }
        if ((i & 2) == 0) {
            this.B = Math.min(0.0f, this.B);
        }
    }
}
