package yads;

import android.graphics.Rect;
import android.view.View;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: classes10.dex */
public final class an3 {
    public final cc2 a;
    public final cn3 b;

    public an3(cc2 cc2Var, cn3 cn3Var) {
        this.a = cc2Var;
        this.b = cn3Var;
    }

    public static String b(View view) {
        int visibility = view.getVisibility();
        return "view is not shown: visibility=" + (visibility != 0 ? visibility != 4 ? visibility != 8 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "GONE" : "INVISIBLE" : "VISIBLE") + ", attached=" + view.isAttachedToWindow();
    }

    public static String c(View view) {
        return "view rect is null: ".concat(!view.isAttachedToWindow() ? "not attached" : (view.getWidth() <= 0 || view.getHeight() <= 0) ? "zero size" : "scrolled off");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bn3 a(View view) {
        int i = 0;
        if (!view.isShown()) {
            return new bn3(0, b(view));
        }
        if (view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return new bn3(0, "view is transparent");
        }
        cn3 cn3Var = this.b;
        cn3Var.getClass();
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            qu2 a = gx2.a().a(view.getContext());
            if (a != null && a.n) {
                cn3Var.a.getClass();
                Rect a2 = aq3.a(view);
                Rect rect2 = new Rect(rect);
                if (rect2.intersect(a2)) {
                    rect = rect2;
                }
            }
            if (rect != null) {
                return new bn3(0, c(view));
            }
            int height = rect.height() * rect.width();
            cc2 cc2Var = this.a;
            cc2Var.getClass();
            qu2 a3 = gx2.a().a(view.getContext());
            if (a3 != null && a3.m) {
                cc2Var.a.getClass();
                ArrayList a4 = ec2.a(view);
                cc2Var.b.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = a4.iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    Rect rect3 = new Rect();
                    if (view2.getGlobalVisibleRect(rect3)) {
                        arrayList.add(rect3);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Rect rect4 = (Rect) it2.next();
                    int i2 = rect4.left;
                    int i3 = rect.left;
                    int i4 = rect.right;
                    if (i2 < i3) {
                        i2 = i3;
                    }
                    if (i2 > i4) {
                        i2 = i4;
                    }
                    rect4.left = i2;
                    int i5 = rect4.top;
                    int i6 = rect.top;
                    int i7 = rect.bottom;
                    if (i5 < i6) {
                        i5 = i6;
                    }
                    if (i5 > i7) {
                        i5 = i7;
                    }
                    rect4.top = i5;
                    int i8 = rect4.right;
                    int i9 = rect.left;
                    if (i8 < i9) {
                        i8 = i9;
                    }
                    if (i8 <= i4) {
                        i4 = i8;
                    }
                    rect4.right = i4;
                    int i10 = rect4.bottom;
                    int i11 = rect.top;
                    if (i10 < i11) {
                        i10 = i11;
                    }
                    if (i10 <= i7) {
                        i7 = i10;
                    }
                    rect4.bottom = i7;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    Rect rect5 = (Rect) next;
                    if (rect5.width() > 0 && rect5.height() > 0) {
                        arrayList2.add(next);
                    }
                }
                int size = arrayList2.size();
                ArrayList<Rect> arrayList3 = arrayList2;
                if (size > 100) {
                    arrayList3 = arrayList2.subList(0, 100);
                }
                cc2Var.c.getClass();
                TreeSet treeSet = new TreeSet();
                treeSet.add(Integer.valueOf(rect.left));
                treeSet.add(Integer.valueOf(rect.right));
                for (Rect rect6 : arrayList3) {
                    treeSet.add(Integer.valueOf(rect6.left));
                    treeSet.add(Integer.valueOf(rect6.right));
                }
                ArrayList arrayList4 = new ArrayList(treeSet);
                TreeSet treeSet2 = new TreeSet();
                treeSet2.add(Integer.valueOf(rect.top));
                treeSet2.add(Integer.valueOf(rect.bottom));
                for (Rect rect7 : arrayList3) {
                    treeSet2.add(Integer.valueOf(rect7.top));
                    treeSet2.add(Integer.valueOf(rect7.bottom));
                }
                ArrayList arrayList5 = new ArrayList(treeSet2);
                rect.left = Collections.binarySearch(arrayList4, Integer.valueOf(rect.left));
                rect.top = Collections.binarySearch(arrayList5, Integer.valueOf(rect.top));
                rect.right = Collections.binarySearch(arrayList4, Integer.valueOf(rect.right));
                rect.bottom = Collections.binarySearch(arrayList5, Integer.valueOf(rect.bottom));
                for (Rect rect8 : arrayList3) {
                    rect8.left = Collections.binarySearch(arrayList4, Integer.valueOf(rect8.left));
                    rect8.top = Collections.binarySearch(arrayList5, Integer.valueOf(rect8.top));
                    rect8.right = Collections.binarySearch(arrayList4, Integer.valueOf(rect8.right));
                    rect8.bottom = Collections.binarySearch(arrayList5, Integer.valueOf(rect8.bottom));
                }
                int size2 = arrayList4.size() - 1;
                byte[][] bArr = new byte[size2][];
                for (int i12 = 0; i12 < size2; i12++) {
                    bArr[i12] = new byte[arrayList5.size() - 1];
                }
                for (Rect rect9 : arrayList3) {
                    int i13 = rect9.right;
                    for (int i14 = rect9.left; i14 < i13; i14++) {
                        int i15 = rect9.bottom;
                        for (int i16 = rect9.top; i16 < i15; i16++) {
                            bArr[i14][i16] = 1;
                        }
                    }
                }
                int size3 = arrayList4.size() - 1;
                int i17 = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    int size4 = arrayList5.size() - 1;
                    for (int i19 = 0; i19 < size4; i19++) {
                        if (bArr[i18][i19] == 1) {
                            i17 = ((((Number) arrayList5.get(i19 + 1)).intValue() - ((Number) arrayList5.get(i19)).intValue()) * (((Number) arrayList4.get(i18 + 1)).intValue() - ((Number) arrayList4.get(i18)).intValue())) + i17;
                        }
                    }
                }
                i = i17;
            }
            int i20 = height - i;
            return new bn3(i20, i20 <= 0 ? "no visible area" : null);
        }
        rect = null;
        if (rect != null) {
        }
    }
}
