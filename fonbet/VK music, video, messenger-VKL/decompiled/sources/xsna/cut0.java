package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;

/* compiled from: ColorSource.kt */
/* loaded from: classes.dex */
public interface cut0 {

    /* compiled from: ColorSource.kt */
    public static final class a {
        public static int a(cut0 cut0Var, Context context) {
            if (cut0Var instanceof x7g) {
                return krv0.m(((x7g) cut0Var).a, context);
            }
            if (cut0Var instanceof b8g) {
                return ((b8g) cut0Var).e();
            }
            if (!(cut0Var instanceof z7g)) {
                throw new NoWhenBranchMatchedException();
            }
            int a = ((z7g) cut0Var).a();
            e3m.a aVar = e3m.a;
            return context.getColor(a);
        }

        public static ColorStateList b(cut0 cut0Var, Context context) {
            if (cut0Var instanceof x7g) {
                return e3m.c(((x7g) cut0Var).a, context);
            }
            if (cut0Var instanceof b8g) {
                return ColorStateList.valueOf(((b8g) cut0Var).e());
            }
            if (!(cut0Var instanceof z7g)) {
                throw new NoWhenBranchMatchedException();
            }
            int a = ((z7g) cut0Var).a();
            e3m.a aVar = e3m.a;
            return ColorStateList.valueOf(context.getColor(a));
        }
    }

    int b(Context context);

    ColorStateList c(Context context);
}
