package com.yandex.div.core.view2;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.j5g;

/* compiled from: ViewLocator.kt */
/* loaded from: classes7.dex */
public final class ViewLocator {
    public static final ViewLocator INSTANCE = new ViewLocator();

    private ViewLocator() {
    }

    public static final View findSingleViewWithTag(Div2View div2View, String str) {
        List<View> findViewsWithTag = findViewsWithTag(div2View, str);
        if (findViewsWithTag.isEmpty()) {
            return null;
        }
        if (findViewsWithTag.size() <= 1) {
            return (View) j5g.Y(findViewsWithTag);
        }
        DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Ambiguous scope id. There are " + findViewsWithTag.size() + " divs with id '" + str + '\''));
        return null;
    }

    public static final List<View> findViewsWithTag(Div2View div2View, String str) {
        return INSTANCE.findViewsWithTag((View) div2View.getView(), (Object) str);
    }

    private final List<View> findViewsWithTagTraversal(View view, Object obj, List<View> list) {
        if (epx.f(obj, view.getTag())) {
            list.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                findViewsWithTagTraversal(viewGroup.getChildAt(i), obj, list);
            }
        }
        return list;
    }

    private final List<View> findViewsWithTag(View view, Object obj) {
        if (obj == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        findViewsWithTagTraversal(view, obj, arrayList);
        return arrayList;
    }
}
