package defpackage;

import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$IntRef;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public abstract class gi91 {
    public static final JSONArray a(JSONArray jSONArray, tls tlsVar) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        tlsVar.invoke(arrayList2);
        return new JSONArray((Collection) arrayList2);
    }

    public static final f530 b(f530 f530Var, yur yurVar) {
        return f530Var.k(new zur(yurVar));
    }

    public static final float c(View view) {
        float f = 0.0f;
        if (view.getVisibility() != 0 || view.getAlpha() == 0.0f || view.getRootView() == null || view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) {
            return 0.0f;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        if (i > displayMetrics.widthPixels || i2 > displayMetrics.heightPixels) {
            return 0.0f;
        }
        Rect rect = new Rect(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
        Rect rect2 = new Rect();
        Region region = new Region(rect);
        region.op(view.getRootView().getLeft(), view.getRootView().getTop(), view.getRootView().getRight(), view.getRootView().getBottom(), Region.Op.INTERSECT);
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = viewGroup != null ? viewGroup.indexOfChild(view) : -1;
        while (viewGroup != null) {
            if (viewGroup.getVisibility() != 0) {
                return 0.0f;
            }
            viewGroup.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            int paddingLeft = viewGroup.getPaddingLeft() + i3;
            int paddingTop = viewGroup.getPaddingTop() + i4;
            int measuredWidth = (viewGroup.getMeasuredWidth() + i3) - viewGroup.getPaddingRight();
            int measuredHeight = (viewGroup.getMeasuredHeight() + i4) - viewGroup.getPaddingBottom();
            Ref$IntRef ref$IntRef2 = ref$IntRef;
            region.op(paddingLeft, paddingTop, measuredWidth, measuredHeight, Region.Op.INTERSECT);
            Iterator it = new t5r(new i73(2, new jr31(viewGroup, 0)), true, new mj1(new l131(6, ref$IntRef2), 7)).iterator();
            while (it.hasNext()) {
                if (((View) ((hrv) it.next()).b).getGlobalVisibleRect(rect2)) {
                    region.op(rect2, Region.Op.DIFFERENCE);
                }
            }
            ViewParent parent2 = viewGroup.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            ref$IntRef2.element = viewGroup2 != null ? viewGroup2.indexOfChild(viewGroup) : -1;
            viewGroup = viewGroup2;
            ref$IntRef = ref$IntRef2;
        }
        while (new RegionIterator(region).next(new Rect())) {
            f += r1.height() * r1.width();
        }
        return f / (rect.height() * rect.width());
    }

    public static final boolean d(x4b0 x4b0Var) {
        if (x4b0Var == null) {
            return false;
        }
        for (w4b0 w4b0Var : x4b0Var.j) {
            if (w4b0Var.a == 7566151) {
                return true;
            }
        }
        return false;
    }
}
