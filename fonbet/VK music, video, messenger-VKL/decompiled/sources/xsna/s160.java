package xsna;

import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* compiled from: NestedScrollingChildHelper.java */
/* loaded from: classes.dex */
public final class s160 {
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;

    public s160(View view) {
        this.c = view;
    }

    public final boolean a(float f, float f2, boolean z) {
        ViewParent e;
        if (!this.d || (e = e(0)) == null) {
            return false;
        }
        return pq3.k(e, this.c, f, f2, z);
    }

    public final boolean b(float f, float f2) {
        ViewParent e;
        if (!this.d || (e = e(0)) == null) {
            return false;
        }
        return pq3.l(e, this.c, f, f2);
    }

    public final boolean c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent e;
        int i4;
        int i5;
        if (this.d && (e = e(i3)) != null) {
            if (i != 0 || i2 != 0) {
                View view = this.c;
                if (iArr2 != null) {
                    view.getLocationInWindow(iArr2);
                    i4 = iArr2[0];
                    i5 = iArr2[1];
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (iArr == null) {
                    if (this.e == null) {
                        this.e = new int[2];
                    }
                    iArr = this.e;
                }
                int[] iArr3 = iArr;
                iArr3[0] = 0;
                iArr3[1] = 0;
                pq3.m(e, this.c, i, i2, iArr3, i3);
                if (iArr2 != null) {
                    view.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i4;
                    iArr2[1] = iArr2[1] - i5;
                }
                if (iArr3[0] != 0 || iArr3[1] != 0) {
                    return true;
                }
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final boolean d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent e;
        int i6;
        int i7;
        int[] iArr3;
        if (this.d && (e = e(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                View view = this.c;
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.e == null) {
                        this.e = new int[2];
                    }
                    int[] iArr4 = this.e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                pq3.n(e, this.c, i, i2, i3, i4, i5, iArr3);
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final void g(boolean z) {
        if (this.d) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            this.c.stopNestedScroll();
        }
        this.d = z;
    }

    public final boolean h(int i, int i2) {
        if (f(i2)) {
            return true;
        }
        if (!this.d) {
            return false;
        }
        View view = this.c;
        View view2 = view;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (pq3.p(parent, view2, view, i, i2)) {
                if (i2 == 0) {
                    this.a = parent;
                } else if (i2 == 1) {
                    this.b = parent;
                }
                pq3.o(parent, view2, view, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view2 = parent;
            }
        }
        return false;
    }

    public final void i(int i) {
        ViewParent e = e(i);
        if (e != null) {
            pq3.q(e, this.c, i);
            if (i == 0) {
                this.a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.b = null;
            }
        }
    }
}
