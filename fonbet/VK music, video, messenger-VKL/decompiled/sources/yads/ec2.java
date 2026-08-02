package yads;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.e43;

/* loaded from: classes10.dex */
public final class ec2 {
    public static ArrayList a(View view) {
        ArrayList arrayList = new ArrayList();
        an3 an3Var = om3.a;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        View view2 = view;
        while (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int indexOfChild = viewGroup.indexOfChild(view2) + 1; indexOfChild < childCount; indexOfChild++) {
                arrayList.addAll(b(viewGroup.getChildAt(indexOfChild)));
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
        return arrayList2;
    }

    public static List b(View view) {
        ListBuilder e = e43.e();
        if (!om3.b(view)) {
            if (!(view instanceof ViewGroup)) {
                e.add(view);
            } else if (om3.c(view)) {
                e.add(view);
            } else {
                ViewGroup viewGroup = (ViewGroup) view;
                ListBuilder e2 = e43.e();
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    e2.addAll(b(viewGroup.getChildAt(i)));
                }
                e.addAll(e2.g());
            }
        }
        return e.g();
    }
}
