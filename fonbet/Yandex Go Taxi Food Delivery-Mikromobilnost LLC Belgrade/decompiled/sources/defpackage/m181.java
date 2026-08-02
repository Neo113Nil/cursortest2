package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes7.dex */
public final class m181 {
    public static ListBuilder a(View view) {
        ListBuilder a = rcc.a();
        if (!sj71.e(view)) {
            if (view instanceof ViewGroup) {
                if (view.getBackground() == null || r1.getAlpha() == 0.0f) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    ListBuilder a2 = rcc.a();
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        a2.addAll(a(viewGroup.getChildAt(i)));
                    }
                    a.addAll(a2.j());
                } else {
                    a.add(view);
                }
            } else {
                a.add(view);
            }
        }
        return a.j();
    }
}
