package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: ViewUtils.kt */
/* loaded from: classes17.dex */
public final class g2u0 {
    public static final int a(int i, View view) {
        return view.getContext().getColor(i);
    }

    public static final Drawable b(int i, View view) {
        return m33.a(i, view.getContext());
    }

    public static final Activity c(View view) {
        Context context;
        Activity h;
        do {
            ViewParent parent = view.getParent();
            boolean z = parent instanceof ViewGroup;
            ViewGroup viewGroup = z ? (ViewGroup) parent : null;
            if (viewGroup != null && (context = viewGroup.getContext()) != null && (h = e3m.h(context)) != null) {
                return h;
            }
            view = z ? (ViewGroup) parent : null;
        } while (view != null);
        return null;
    }

    public static final void d(View view, izs<? super View, s3q0> izsVar) {
        ViewGroup viewGroup;
        int childCount;
        izsVar.invoke(view);
        if (!(view instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) view).getChildCount()) < 0) {
            return;
        }
        int i = 0;
        while (true) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                d(childAt, izsVar);
            }
            if (i == childCount) {
                return;
            } else {
                i++;
            }
        }
    }
}
