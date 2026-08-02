package defpackage;

import android.view.View;
import com.yandex.div.legacy.view.DivView;

/* loaded from: classes11.dex */
public abstract class ggk {
    public abstract View a(DivView divView, n15 n15Var);

    public final View b(DivView divView, n15 n15Var, String str) {
        n15Var.b = n15.a(str, n15Var.getClass().getSimpleName());
        return a(divView, n15Var);
    }
}
