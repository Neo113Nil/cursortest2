package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes2.dex */
public final class p090 {
    public static ListBuilder a(View view) {
        ListBuilder a = rcc.a();
        lx31 lx31Var = kw31.a;
        if (view.isShown() && view.getAlpha() != 0.0f) {
            if (view instanceof ViewGroup) {
                Drawable background = view.getBackground();
                if (background == null || background.getAlpha() == 0 || background.getOpacity() == -2) {
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
