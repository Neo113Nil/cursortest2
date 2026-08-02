package xsna;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.k1u0;

/* compiled from: ThemeExt.kt */
/* loaded from: classes.dex */
public final class gpo0 {
    public static final void a(ImageView imageView) {
        imageView.setImageTintList(null);
        if (krv0.b != null) {
            dhr0.m(imageView, false);
        }
        imageView.clearColorFilter();
    }

    public static final Integer b(Context context) {
        if (context instanceof l7s) {
            int themeResId = ((l7s) context).getThemeResId();
            Integer valueOf = Integer.valueOf(themeResId);
            TypedValue typedValue = krv0.a;
            if (epx.f(krv0.h(themeResId), Boolean.TRUE)) {
                return valueOf;
            }
            return null;
        }
        if (context instanceof lpj) {
            TypedValue typedValue2 = krv0.a;
            Boolean h = krv0.h(((lpj) context).getThemeResId());
            Boolean bool = Boolean.TRUE;
            if (epx.f(h, bool)) {
                int themeResId2 = ((lpj) context).getThemeResId();
                Integer valueOf2 = Integer.valueOf(themeResId2);
                TypedValue typedValue3 = krv0.a;
                if (epx.f(krv0.h(themeResId2), bool)) {
                    return valueOf2;
                }
                return null;
            }
        }
        boolean z = false;
        if (context instanceof ContextThemeWrapper ? epx.f(krv0.h(npj.a((ContextWrapper) context)), Boolean.TRUE) : false) {
            int a = npj.a((ContextWrapper) context);
            Integer valueOf3 = Integer.valueOf(a);
            TypedValue typedValue4 = krv0.a;
            if (epx.f(krv0.h(a), Boolean.TRUE)) {
                return valueOf3;
            }
            return null;
        }
        if (context instanceof ContextWrapper) {
            int a2 = npj.a((ContextWrapper) context);
            TypedValue typedValue5 = krv0.a;
            z = epx.f(krv0.h(a2), Boolean.TRUE);
        }
        if (!z) {
            return null;
        }
        int a3 = npj.a((ContextWrapper) context);
        Integer valueOf4 = Integer.valueOf(a3);
        TypedValue typedValue6 = krv0.a;
        if (epx.f(krv0.h(a3), Boolean.TRUE)) {
            return valueOf4;
        }
        return null;
    }

    public static final boolean c(Context context) {
        if (context instanceof l7s) {
            return true;
        }
        if (context instanceof lpj) {
            TypedValue typedValue = krv0.a;
            if (epx.f(krv0.h(((lpj) context).getThemeResId()), Boolean.TRUE)) {
                return true;
            }
        }
        return context instanceof ContextThemeWrapper ? epx.f(krv0.h(npj.a((ContextWrapper) context)), Boolean.TRUE) : false;
    }

    public static final int d(int i, View view) {
        return krv0.m(i, view.getContext());
    }

    public static final void e(int i, View view) {
        if (c(view.getContext())) {
            view.setBackgroundColor(d(i, view));
        } else {
            krv0.n(i, view);
        }
    }

    public static final void f(ImageView imageView, Integer num) {
        imageView.setImageTintList(null);
        if (num == null || num.intValue() == 0) {
            if (krv0.b != null) {
                dhr0.m(imageView, false);
            }
            imageView.clearColorFilter();
        } else if (c(imageView.getContext())) {
            imageView.setColorFilter(d(num.intValue(), imageView));
        } else {
            TypedValue typedValue = krv0.a;
            krv0.o(imageView, num.intValue());
        }
    }

    public static final void g(ImageView imageView, cut0 cut0Var) {
        if (cut0Var instanceof x7g) {
            f(imageView, Integer.valueOf(((x7g) cut0Var).a));
            return;
        }
        if (cut0Var instanceof z7g) {
            Context context = imageView.getContext();
            int a = ((z7g) cut0Var).a();
            e3m.a aVar = e3m.a;
            imageView.setColorFilter(context.getColor(a));
            return;
        }
        if (cut0Var instanceof b8g) {
            imageView.setColorFilter(((b8g) cut0Var).e());
        } else {
            if (cut0Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            a(imageView);
        }
    }

    public static final void h(ImageView imageView, k1u0 k1u0Var, Integer num) {
        if (k1u0Var == null || (k1u0Var instanceof k1u0.c)) {
            a(imageView);
        } else if (k1u0Var instanceof k1u0.b) {
            f(imageView, num);
        } else {
            if (!(k1u0Var instanceof k1u0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            g(imageView, ((k1u0.a) k1u0Var).a());
        }
    }

    public static final void i(TextView textView, int i) {
        if (c(textView.getContext())) {
            textView.setTextColor(d(i, textView));
        } else {
            TypedValue typedValue = krv0.a;
            krv0.q(textView, i);
        }
    }
}
