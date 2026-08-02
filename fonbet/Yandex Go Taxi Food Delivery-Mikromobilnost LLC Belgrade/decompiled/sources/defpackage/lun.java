package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import java.util.Arrays;
import kotlin.Pair;

/* loaded from: classes10.dex */
public class lun {
    public final Object A;
    public int a;
    public int b;
    public int c;
    public boolean w;
    public final Object x;
    public Object y;
    public Object z;

    public lun(ViewGroup viewGroup, ip31 ip31Var) {
        this.x = viewGroup;
        this.y = ip31Var;
        this.A = new yln(8, this);
    }

    public int a(int i) {
        SparseArray sparseArray = ((m920) this.y).a;
        m920 m920Var = sparseArray == null ? null : (m920) sparseArray.get(i);
        int i2 = 1;
        int i3 = 2;
        if (this.a == 2) {
            if (m920Var != null) {
                this.y = m920Var;
                this.c++;
            } else if (i == 65038) {
                k();
            } else if (i != 65039) {
                m920 m920Var2 = (m920) this.y;
                if (m920Var2.b != null) {
                    i3 = 3;
                    if (this.c != 1) {
                        this.z = m920Var2;
                        k();
                    } else if (l()) {
                        this.z = (m920) this.y;
                        k();
                    } else {
                        k();
                    }
                } else {
                    k();
                }
            }
            i2 = i3;
        } else if (m920Var == null) {
            k();
        } else {
            this.a = 2;
            this.y = m920Var;
            this.c = 1;
            i2 = i3;
        }
        this.b = i;
        return i2;
    }

    public void c() {
        if (this.w) {
            ((ip31) this.y).j((yln) this.A);
            ViewGroupOverlay overlay = ((ViewGroup) this.x).getOverlay();
            View view = (View) this.z;
            if (view == null) {
                view = null;
            }
            overlay.remove(view);
            this.w = false;
        }
    }

    public void g(int i, int i2) {
        this.a = 8388693;
        this.b = i;
        this.c = i2;
        View view = (View) this.z;
        if (view == null) {
            view = null;
        }
        view.setLayoutDirection(((ViewGroup) this.x).getLayoutDirection());
        ip31 ip31Var = (ip31) this.y;
        if (ip31Var.i() <= 0 || ip31Var.a.getHeight() <= 0) {
            return;
        }
        h(ip31Var.f(), ip31Var.a.getTop(), ip31Var.g(), ip31Var.a.getBottom());
    }

    public void h(int i, int i2, int i3, int i4) {
        ViewGroup viewGroup = (ViewGroup) this.x;
        Pair pair = new Pair(Integer.valueOf(i3 - i), Integer.valueOf(i4 - i2));
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        View view = (View) this.z;
        if (view == null) {
            view = null;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(makeMeasureSpec, makeMeasureSpec);
        Point point = new Point(view.getMeasuredWidth(), view.getMeasuredHeight());
        int i5 = point.x;
        int i6 = point.y;
        Rect rect = new Rect(0, 0, i5, i6);
        rect.offset(i, i2);
        int absoluteGravity = Gravity.getAbsoluteGravity(this.a, viewGroup.getLayoutDirection()) & 7;
        int i7 = this.a & 112;
        if (absoluteGravity == 1) {
            rect.offset(x4e.c(intValue, i5, 2, this.b), 0);
        } else if (absoluteGravity == 3) {
            rect.offset(-this.b, 0);
        } else if (absoluteGravity == 5) {
            rect.offset((intValue - i5) + this.b, 0);
        }
        if (i7 == 16) {
            rect.offset(0, x4e.c(intValue2, i6, 2, this.c));
        } else if (i7 == 80) {
            rect.offset(0, (intValue2 - i6) + this.c);
        }
        View view2 = (View) this.z;
        (view2 != null ? view2 : null).layout(rect.left, rect.top, rect.right, rect.bottom);
        viewGroup.invalidate();
    }

    public void k() {
        this.a = 1;
        this.y = (m920) this.x;
        this.c = 0;
    }

    public boolean l() {
        int[] iArr = (int[]) this.A;
        g920 d = ((m920) this.y).b.d();
        int a = d.a(6);
        if ((a == 0 || d.b.get(a + d.a) == 0) && this.b != 65039) {
            return this.w && (iArr == null || Arrays.binarySearch(iArr, ((m920) this.y).b.a(0)) < 0);
        }
        return true;
    }

    public void n() {
        yln ylnVar = (yln) this.A;
        ip31 ip31Var = (ip31) this.y;
        ViewGroup viewGroup = (ViewGroup) this.x;
        if (this.w) {
            return;
        }
        viewGroup.setClipChildren(false);
        ViewGroupOverlay overlay = viewGroup.getOverlay();
        View view = (View) this.z;
        if (view == null) {
            view = null;
        }
        overlay.add(view);
        ip31Var.j(ylnVar);
        ip31Var.c(ylnVar);
        this.w = true;
    }

    public lun(m920 m920Var, boolean z, int[] iArr) {
        this.a = 1;
        this.x = m920Var;
        this.y = m920Var;
        this.w = z;
        this.A = iArr;
    }
}
