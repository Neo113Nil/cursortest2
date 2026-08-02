package com.yandex.urbanads.internal.visibility;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.bh11;
import defpackage.ix31;
import defpackage.j090;
import defpackage.k090;
import defpackage.kw31;
import defpackage.lx31;
import defpackage.mx31;
import defpackage.p090;
import defpackage.rw31;
import defpackage.sls;
import defpackage.tx31;
import defpackage.uid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public final class a {
    public final View a;
    public final ArrayList b;
    public final ArrayList c;
    public final long d;
    public final sls e;
    public boolean f;
    public final Handler g;
    public final ArrayList h;
    public final ArrayList i;
    public uid j;
    public long k;
    public bh11 l;

    public a(View view, ArrayList arrayList, ArrayList arrayList2, long j) {
        ViewVisibilityTracker$1 viewVisibilityTracker$1 = ViewVisibilityTracker$1.b;
        this.a = view;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = j;
        this.e = viewVisibilityTracker$1;
        this.g = new Handler(Looper.getMainLooper());
        this.h = new ArrayList();
        this.i = new ArrayList();
    }

    public final void a(rw31 rw31Var) {
        bh11 bh11Var = rw31Var.b;
        if (bh11Var != null) {
            this.g.removeCallbacks(bh11Var);
            rw31Var.b = null;
        }
    }

    public final void b() {
        if (this.f && this.a.isAttachedToWindow()) {
            long j = this.d;
            if (j > 0) {
                long longValue = ((Number) this.e.invoke()).longValue();
                long j2 = longValue - this.k;
                if (j2 < j) {
                    if (this.l == null) {
                        bh11 bh11Var = new bh11(28, this);
                        this.l = bh11Var;
                        this.g.postDelayed(bh11Var, j - j2);
                        return;
                    }
                    return;
                }
                this.k = longValue;
            }
            c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c0, code lost:
    
        if (r8.intersect(r5) != false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0393  */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        int i;
        Iterator it;
        Iterator it2;
        Rect rect;
        mx31 mx31Var;
        if (this.f) {
            View view = this.a;
            byte b = 1;
            if (view.hasWindowFocus()) {
                lx31 lx31Var = kw31.a;
                if (view.isShown() && view.getAlpha() != 0.0f && view.isShown()) {
                    lx31 lx31Var2 = kw31.a;
                    lx31Var2.getClass();
                    if (!view.isShown()) {
                        int visibility = view.getVisibility();
                        String str = visibility != 0 ? visibility != 4 ? visibility != 8 ? "UNKNOWN" : "GONE" : "INVISIBLE" : "VISIBLE";
                        mx31Var = new mx31(0, "view is not shown: visibility=" + str + ", attached=" + view.isAttachedToWindow());
                    } else if (view.getAlpha() == 0.0f) {
                        mx31Var = new mx31(0, "view is transparent");
                    } else {
                        tx31 tx31Var = lx31Var2.b;
                        tx31Var.getClass();
                        Rect rect2 = new Rect();
                        if (view.getGlobalVisibleRect(rect2)) {
                            tx31Var.a.getClass();
                            Rect rect3 = new Rect();
                            try {
                                view.getWindowVisibleDisplayFrame(rect3);
                            } catch (NullPointerException unused) {
                            }
                            int[] iArr = {r10, r11};
                            view.getRootView().getLocationOnScreen(iArr);
                            int i2 = -iArr[0];
                            int i3 = -iArr[1];
                            rect3.offset(i2, i3);
                            rect = new Rect(rect2);
                        }
                        rect = null;
                        if (rect == null) {
                            mx31Var = new mx31(0, "view rect is null: ".concat(!view.isAttachedToWindow() ? "not attached" : (view.getWidth() <= 0 || view.getHeight() <= 0) ? "zero size" : "scrolled off"));
                        } else {
                            int height = rect.height() * rect.width();
                            k090 k090Var = lx31Var2.a;
                            k090Var.a.getClass();
                            ArrayList arrayList = new ArrayList();
                            ViewParent parent = view.getParent();
                            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                            View view2 = view;
                            while (viewGroup != null) {
                                int childCount = viewGroup.getChildCount();
                                for (int indexOfChild = viewGroup.indexOfChild(view2) + 1; indexOfChild < childCount; indexOfChild++) {
                                    arrayList.addAll(p090.a(viewGroup.getChildAt(indexOfChild)));
                                }
                                ViewParent parent2 = viewGroup.getParent();
                                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                                view2 = viewGroup;
                                viewGroup = viewGroup2;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                if (view.getZ() <= ((View) next).getZ()) {
                                    arrayList2.add(next);
                                }
                            }
                            k090Var.b.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                View view3 = (View) it4.next();
                                Rect rect4 = new Rect();
                                if (view3.getGlobalVisibleRect(rect4)) {
                                    arrayList3.add(rect4);
                                }
                            }
                            Iterator it5 = arrayList3.iterator();
                            while (it5.hasNext()) {
                                Rect rect5 = (Rect) it5.next();
                                int i4 = rect5.left;
                                int i5 = rect.left;
                                int i6 = rect.right;
                                if (i4 < i5) {
                                    i4 = i5;
                                }
                                if (i4 > i6) {
                                    i4 = i6;
                                }
                                rect5.left = i4;
                                int i7 = rect5.top;
                                int i8 = rect.top;
                                int i9 = rect.bottom;
                                if (i7 < i8) {
                                    i7 = i8;
                                }
                                if (i7 > i9) {
                                    i7 = i9;
                                }
                                rect5.top = i7;
                                int i10 = rect5.right;
                                int i11 = rect.left;
                                if (i10 < i11) {
                                    i10 = i11;
                                }
                                if (i10 <= i6) {
                                    i6 = i10;
                                }
                                rect5.right = i6;
                                int i12 = rect5.bottom;
                                int i13 = rect.top;
                                if (i12 < i13) {
                                    i12 = i13;
                                }
                                if (i12 <= i9) {
                                    i9 = i12;
                                }
                                rect5.bottom = i9;
                            }
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it6 = arrayList3.iterator();
                            while (it6.hasNext()) {
                                Object next2 = it6.next();
                                Rect rect6 = (Rect) next2;
                                if (rect6.width() > 0 && rect6.height() > 0) {
                                    arrayList4.add(next2);
                                }
                            }
                            int size = arrayList4.size();
                            ArrayList<Rect> arrayList5 = arrayList4;
                            if (size > 100) {
                                arrayList5 = arrayList4.subList(0, 100);
                            }
                            k090Var.c.getClass();
                            TreeSet treeSet = new TreeSet();
                            treeSet.add(Integer.valueOf(rect.left));
                            treeSet.add(Integer.valueOf(rect.right));
                            for (Rect rect7 : arrayList5) {
                                treeSet.add(Integer.valueOf(rect7.left));
                                treeSet.add(Integer.valueOf(rect7.right));
                            }
                            ArrayList arrayList6 = new ArrayList(treeSet);
                            TreeSet treeSet2 = new TreeSet();
                            treeSet2.add(Integer.valueOf(rect.top));
                            treeSet2.add(Integer.valueOf(rect.bottom));
                            for (Rect rect8 : arrayList5) {
                                treeSet2.add(Integer.valueOf(rect8.top));
                                treeSet2.add(Integer.valueOf(rect8.bottom));
                            }
                            ArrayList arrayList7 = new ArrayList(treeSet2);
                            j090.a(rect, arrayList6, arrayList7);
                            Iterator it7 = arrayList5.iterator();
                            while (it7.hasNext()) {
                                j090.a((Rect) it7.next(), arrayList6, arrayList7);
                            }
                            int size2 = arrayList6.size() - 1;
                            byte[][] bArr = new byte[size2][];
                            for (int i14 = 0; i14 < size2; i14++) {
                                bArr[i14] = new byte[arrayList7.size() - 1];
                            }
                            for (Rect rect9 : arrayList5) {
                                int i15 = rect9.right;
                                for (int i16 = rect9.left; i16 < i15; i16++) {
                                    int i17 = rect9.bottom;
                                    for (int i18 = rect9.top; i18 < i17; i18++) {
                                        bArr[i16][i18] = 1;
                                    }
                                }
                            }
                            int size3 = arrayList6.size() - 1;
                            int i19 = 0;
                            int i20 = 0;
                            while (i19 < size3) {
                                int size4 = arrayList7.size() - b;
                                int i21 = 0;
                                while (i21 < size4) {
                                    if (bArr[i19][i21] == b) {
                                        i20 = ((((Number) arrayList7.get(i21 + 1)).intValue() - ((Number) arrayList7.get(i21)).intValue()) * (((Number) arrayList6.get(i19 + 1)).intValue() - ((Number) arrayList6.get(i19)).intValue())) + i20;
                                    }
                                    i21++;
                                    b = 1;
                                }
                                i19++;
                                b = 1;
                            }
                            int i22 = height - i20;
                            mx31Var = new mx31(i22, i22 <= 0 ? "no visible area" : null);
                        }
                    }
                    int i23 = mx31Var.a;
                    if (i23 > 0) {
                        int width = view.getLayoutParams().width > 0 ? view.getLayoutParams().width : view.getWidth();
                        int height2 = view.getLayoutParams().height > 0 ? view.getLayoutParams().height : view.getHeight();
                        if (height2 > 0 && width > 0) {
                            i = (i23 * 100) / (height2 * width);
                            it = this.h.iterator();
                            while (it.hasNext()) {
                                rw31 rw31Var = (rw31) it.next();
                                d(rw31Var, i >= rw31Var.a.a);
                            }
                            it2 = this.i.iterator();
                            while (it2.hasNext()) {
                                rw31 rw31Var2 = (rw31) it2.next();
                                d(rw31Var2, i < rw31Var2.a.a);
                            }
                        }
                    }
                }
            }
            i = 0;
            it = this.h.iterator();
            while (it.hasNext()) {
            }
            it2 = this.i.iterator();
            while (it2.hasNext()) {
            }
        }
    }

    public final void d(rw31 rw31Var, boolean z) {
        ix31 ix31Var = rw31Var.a;
        if (!z || rw31Var.d) {
            if (z || !rw31Var.d) {
                return;
            }
            a(rw31Var);
            rw31Var.d = false;
            return;
        }
        if (rw31Var.b == null) {
            int i = ix31Var.c;
            if (i > 0 && rw31Var.c >= i) {
                return;
            }
            a(rw31Var);
            rw31Var.d = true;
            bh11 bh11Var = new bh11(this, rw31Var);
            rw31Var.b = bh11Var;
            this.g.postDelayed(bh11Var, ix31Var.b);
        }
    }
}
