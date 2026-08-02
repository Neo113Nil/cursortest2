package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: classes7.dex */
public final class am81 {
    public final cv71 a;
    public final ts81 b;

    public am81() {
        cv71 cv71Var = new cv71();
        ts81 ts81Var = new ts81();
        this.a = cv71Var;
        this.b = ts81Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lp81 a(View view) {
        a081 a081Var;
        a081 a081Var2;
        int i = 0;
        if (!view.isShown()) {
            int visibility = view.getVisibility();
            return new lp81(0, "view is not shown: visibility=" + (visibility != 0 ? visibility != 4 ? visibility != 8 ? "UNKNOWN" : "GONE" : "INVISIBLE" : "VISIBLE") + ", attached=" + view.isAttachedToWindow());
        }
        if (view.getAlpha() == 0.0f) {
            return new lp81(0, "view is transparent");
        }
        s281 s281Var = this.b.a;
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            Context context = view.getContext();
            a081 a081Var3 = a081.g;
            if (a081Var3 == null) {
                synchronized (a081.f) {
                    a081Var2 = a081.g;
                    if (a081Var2 == null) {
                        a081Var2 = new a081();
                        a081.g = a081Var2;
                    }
                }
                a081Var3 = a081Var2;
            }
            gg81 a = a081Var3.a(context);
            if (a != null && a.n) {
                Rect rect2 = new Rect();
                try {
                    view.getWindowVisibleDisplayFrame(rect2);
                } catch (NullPointerException unused) {
                }
                int[] iArr = {r6, r7};
                view.getRootView().getLocationOnScreen(iArr);
                int i2 = -iArr[0];
                int i3 = -iArr[1];
                rect2.offset(i2, i3);
                Rect rect3 = new Rect(rect);
                if (rect3.intersect(rect2)) {
                    rect = rect3;
                }
            }
            if (rect != null) {
                return new lp81(0, "view rect is null: ".concat(!view.isAttachedToWindow() ? "not attached" : (view.getWidth() <= 0 || view.getHeight() <= 0) ? "zero size" : "scrolled off"));
            }
            int height = rect.height() * rect.width();
            this.a.getClass();
            a081 a081Var4 = a081.g;
            if (a081Var4 == null) {
                synchronized (a081.f) {
                    a081Var = a081.g;
                    if (a081Var == null) {
                        a081Var = new a081();
                        a081.g = a081Var;
                    }
                }
                a081Var4 = a081Var;
            }
            gg81 a2 = a081Var4.a(view.getContext());
            if (a2 != null && a2.m) {
                ArrayList arrayList = new ArrayList();
                am81 am81Var = sj71.a;
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                View view2 = view;
                while (viewGroup != null) {
                    int childCount = viewGroup.getChildCount();
                    for (int indexOfChild = viewGroup.indexOfChild(view2) + 1; indexOfChild < childCount; indexOfChild++) {
                        arrayList.addAll(m181.a(viewGroup.getChildAt(indexOfChild)));
                    }
                    ViewParent parent2 = viewGroup.getParent();
                    ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    view2 = viewGroup;
                    viewGroup = viewGroup2;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (view.getZ() <= ((View) next).getZ()) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    View view3 = (View) it2.next();
                    Rect rect4 = new Rect();
                    if (view3.getGlobalVisibleRect(rect4)) {
                        arrayList3.add(rect4);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Rect rect5 = (Rect) it3.next();
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
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
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
                rect.left = Collections.binarySearch(arrayList6, Integer.valueOf(rect.left));
                rect.top = Collections.binarySearch(arrayList7, Integer.valueOf(rect.top));
                rect.right = Collections.binarySearch(arrayList6, Integer.valueOf(rect.right));
                rect.bottom = Collections.binarySearch(arrayList7, Integer.valueOf(rect.bottom));
                for (Rect rect9 : arrayList5) {
                    rect9.left = Collections.binarySearch(arrayList6, Integer.valueOf(rect9.left));
                    rect9.top = Collections.binarySearch(arrayList7, Integer.valueOf(rect9.top));
                    rect9.right = Collections.binarySearch(arrayList6, Integer.valueOf(rect9.right));
                    rect9.bottom = Collections.binarySearch(arrayList7, Integer.valueOf(rect9.bottom));
                }
                int size2 = arrayList6.size() - 1;
                byte[][] bArr = new byte[size2][];
                for (int i14 = 0; i14 < size2; i14++) {
                    bArr[i14] = new byte[arrayList7.size() - 1];
                }
                for (Rect rect10 : arrayList5) {
                    int i15 = rect10.right;
                    for (int i16 = rect10.left; i16 < i15; i16++) {
                        int i17 = rect10.bottom;
                        for (int i18 = rect10.top; i18 < i17; i18++) {
                            bArr[i16][i18] = 1;
                        }
                    }
                }
                int size3 = arrayList6.size() - 1;
                int i19 = 0;
                for (int i20 = 0; i20 < size3; i20++) {
                    int size4 = arrayList7.size() - 1;
                    for (int i21 = 0; i21 < size4; i21++) {
                        if (bArr[i20][i21] == 1) {
                            i19 = ((((Number) arrayList7.get(i21 + 1)).intValue() - ((Number) arrayList7.get(i21)).intValue()) * (((Number) arrayList6.get(i20 + 1)).intValue() - ((Number) arrayList6.get(i20)).intValue())) + i19;
                        }
                    }
                }
                i = i19;
            }
            int i22 = height - i;
            return new lp81(i22, i22 <= 0 ? "no visible area" : null);
        }
        rect = null;
        if (rect != null) {
        }
    }
}
