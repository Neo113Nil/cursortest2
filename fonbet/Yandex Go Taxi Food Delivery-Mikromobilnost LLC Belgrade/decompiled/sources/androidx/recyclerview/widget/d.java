package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import defpackage.b64;
import defpackage.jpb;
import defpackage.ny61;
import defpackage.va90;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {
    public final va90 a;
    public View e;
    public int d = 0;
    public final jpb b = new jpb();
    public final ArrayList c = new ArrayList();

    public d(va90 va90Var) {
        this.a = va90Var;
    }

    public final void a(int i, View view, boolean z) {
        RecyclerView recyclerView = (RecyclerView) this.a.a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.f(childCount, z);
        if (z) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) this.a.a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.f(childCount, z);
        if (z) {
            i(view);
        }
        x0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.P() && !childViewHolderInt.U()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                ny61.g(b64.g(recyclerView, sb));
                return;
            } else {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                childViewHolderInt.C &= -257;
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            ny61.g(b64.g(recyclerView, sb2));
            return;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int f = f(i);
        this.b.g(f);
        RecyclerView recyclerView = (RecyclerView) this.a.a;
        View childAt = recyclerView.getChildAt(f);
        if (childAt != null) {
            x0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.P() && !childViewHolderInt.U()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(childViewHolderInt);
                    ny61.g(b64.g(recyclerView, sb));
                    return;
                } else {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.D(256);
                }
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(f);
            ny61.g(b64.g(recyclerView, sb2));
            return;
        }
        recyclerView.detachViewFromParent(f);
    }

    public final View d(int i) {
        return ((RecyclerView) this.a.a).getChildAt(f(i));
    }

    public final int e() {
        return ((RecyclerView) this.a.a).getChildCount() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) this.a.a).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            jpb jpbVar = this.b;
            int c = i - (i2 - jpbVar.c(i2));
            if (c == 0) {
                while (jpbVar.e(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += c;
        }
        return -1;
    }

    public final View g(int i) {
        return ((RecyclerView) this.a.a).getChildAt(i);
    }

    public final int h() {
        return ((RecyclerView) this.a.a).getChildCount();
    }

    public final void i(View view) {
        this.c.add(view);
        x0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            RecyclerView recyclerView = (RecyclerView) this.a.a;
            int i = childViewHolderInt.J;
            if (i != -1) {
                childViewHolderInt.I = i;
            } else {
                childViewHolderInt.I = childViewHolderInt.a.getImportantForAccessibility();
            }
            recyclerView.setChildImportantForAccessibilityInternal(childViewHolderInt, 4);
        }
    }

    public final int j(View view) {
        int indexOfChild = ((RecyclerView) this.a.a).indexOfChild(view);
        if (indexOfChild != -1) {
            jpb jpbVar = this.b;
            if (!jpbVar.e(indexOfChild)) {
                return indexOfChild - jpbVar.c(indexOfChild);
            }
        }
        return -1;
    }

    public final void k(int i) {
        va90 va90Var = this.a;
        int i2 = this.d;
        if (i2 == 1) {
            ny61.r("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i2 == 2) {
            ny61.r("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            int f = f(i);
            View childAt = ((RecyclerView) va90Var.a).getChildAt(f);
            if (childAt == null) {
                this.d = 0;
                this.e = null;
                return;
            }
            this.d = 1;
            this.e = childAt;
            if (this.b.g(f)) {
                l(childAt);
            }
            va90Var.l(f);
            this.d = 0;
            this.e = null;
        } catch (Throwable th) {
            this.d = 0;
            this.e = null;
            throw th;
        }
    }

    public final void l(View view) {
        x0 childViewHolderInt;
        if (!this.c.remove(view) || (childViewHolderInt = RecyclerView.getChildViewHolderInt(view)) == null) {
            return;
        }
        ((RecyclerView) this.a.a).setChildImportantForAccessibilityInternal(childViewHolderInt, childViewHolderInt.I);
        childViewHolderInt.I = 0;
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
