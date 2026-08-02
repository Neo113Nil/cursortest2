package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.je2;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.php0;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c extends RecyclerView.g {
    public a a;
    public final ViewPager2 b;
    public final RecyclerView c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final php0 g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public c(ViewPager2 viewPager2) {
        this.b = viewPager2;
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        this.c = recyclerView;
        this.d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.g = new php0();
        c();
    }

    public final void a(int i) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.onPageSelected(i);
        }
    }

    public final void b(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        a aVar = this.a;
        if (aVar != null) {
            aVar.onPageScrollStateChanged(i);
        }
    }

    public final void c() {
        this.e = 0;
        this.f = 0;
        php0 php0Var = this.g;
        php0Var.a = -1;
        php0Var.b = 0.0f;
        php0Var.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.m = false;
        this.l = false;
    }

    public final void d(boolean z) {
        this.m = z;
        this.e = z ? 4 : 1;
        int i = this.i;
        if (i != -1) {
            this.h = i;
            this.i = -1;
        } else if (this.h == -1) {
            this.h = this.d.K1();
        }
        b(1);
    }

    public final void e() {
        int top;
        LinearLayoutManager linearLayoutManager = this.d;
        int K1 = linearLayoutManager.K1();
        php0 php0Var = this.g;
        php0Var.a = K1;
        if (K1 == -1) {
            php0Var.a = -1;
            php0Var.b = 0.0f;
            php0Var.c = 0;
            return;
        }
        View X = linearLayoutManager.X(K1);
        if (X == null) {
            php0Var.a = -1;
            php0Var.b = 0.0f;
            php0Var.c = 0;
            return;
        }
        int o0 = RecyclerView.e.o0(X);
        int t0 = RecyclerView.e.t0(X);
        int v0 = RecyclerView.e.v0(X);
        int b0 = RecyclerView.e.b0(X);
        ViewGroup.LayoutParams layoutParams = X.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            o0 += marginLayoutParams.leftMargin;
            t0 += marginLayoutParams.rightMargin;
            v0 += marginLayoutParams.topMargin;
            b0 += marginLayoutParams.bottomMargin;
        }
        int height = X.getHeight() + v0 + b0;
        int width = X.getWidth() + o0 + t0;
        int i = linearLayoutManager.J;
        RecyclerView recyclerView = this.c;
        if (i == 0) {
            top = (X.getLeft() - o0) - recyclerView.getPaddingLeft();
            if (this.b.isRtl()) {
                top = -top;
            }
            height = width;
        } else {
            top = (X.getTop() - v0) - recyclerView.getPaddingTop();
        }
        int i2 = -top;
        php0Var.c = i2;
        if (i2 >= 0) {
            php0Var.b = height != 0 ? i2 / height : 0.0f;
        } else if (new je2(linearLayoutManager).b()) {
            ny61.r("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            Locale locale = Locale.US;
            ny61.r(oyr.i(php0Var.c, "Page can only be offset by a positive amount, not by "));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        a aVar;
        int i2 = this.e;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            d(false);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.k) {
                b(2);
                this.j = true;
                return;
            }
            return;
        }
        php0 php0Var = this.g;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            e();
            if (!this.k) {
                int i3 = php0Var.a;
                if (i3 != -1 && (aVar = this.a) != null) {
                    aVar.onPageScrolled(i3, 0.0f, 0);
                }
            } else if (php0Var.c == 0) {
                int i4 = this.h;
                int i5 = php0Var.a;
                if (i4 != i5) {
                    a(i5);
                }
            }
            b(0);
            c();
        }
        if (this.e == 2 && i == 0 && this.l) {
            e();
            if (php0Var.c == 0) {
                int i6 = this.i;
                int i7 = php0Var.a;
                if (i6 != i7) {
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    a(i7);
                }
                b(0);
                c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r7 < 0) == r5.b.isRtl()) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        this.k = true;
        e();
        boolean z = this.j;
        php0 php0Var = this.g;
        if (z) {
            this.j = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                }
                i3 = php0Var.a;
                this.i = i3;
                if (this.h != i3) {
                    a(i3);
                }
            }
            if (php0Var.c != 0) {
                i3 = php0Var.a + 1;
                this.i = i3;
                if (this.h != i3) {
                }
            }
            i3 = php0Var.a;
            this.i = i3;
            if (this.h != i3) {
            }
        } else if (this.e == 0) {
            int i4 = php0Var.a;
            if (i4 == -1) {
                i4 = 0;
            }
            a(i4);
        }
        int i5 = php0Var.a;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = php0Var.b;
        int i6 = php0Var.c;
        a aVar = this.a;
        if (aVar != null) {
            aVar.onPageScrolled(i5, f, i6);
        }
        int i7 = php0Var.a;
        int i8 = this.i;
        if ((i7 == i8 || i8 == -1) && php0Var.c == 0 && this.f != 1) {
            b(0);
            c();
        }
    }
}
