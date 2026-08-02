package xsna;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import com.vk.superapp.ui.SuperAppLayoutManager;
import com.vk.superapp.ui.widgets.SuperAppWidgetSize;

/* compiled from: SuperAppLayoutManager.kt */
/* loaded from: classes6.dex */
public final class j9n0 extends GridLayoutManager.c {
    public final /* synthetic */ SuperAppLayoutManager d;
    public final /* synthetic */ Context e;

    public j9n0(SuperAppLayoutManager superAppLayoutManager, Context context) {
        this.d = superAppLayoutManager;
        this.e = context;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        SuperAppLayoutManager superAppLayoutManager = this.d;
        g8n0 g8n0Var = superAppLayoutManager.C;
        f540 f540Var = superAppLayoutManager.B;
        zif0 zif0Var = (zif0) ((c7n0) f540Var.invoke()).c.c(i);
        if (zif0Var instanceof lbn0) {
            return superAppLayoutManager.s;
        }
        if (zif0Var instanceof a9n0) {
            int R0 = ((c7n0) f540Var.invoke()).R0();
            if (i != ((c7n0) f540Var.invoke()).S0()) {
                return superAppLayoutManager.s / ((Number) g8n0Var.invoke()).intValue();
            }
            int intValue = (i - R0) % ((Number) g8n0Var.invoke()).intValue();
            int i2 = superAppLayoutManager.s;
            return i2 - ((i2 / ((Number) g8n0Var.invoke()).intValue()) * intValue);
        }
        int i3 = 2;
        if ((zif0Var instanceof z8n0) && ((z8n0) zif0Var).a == SuperAppWidgetSize.COMPACT) {
            return superAppLayoutManager.s / 2;
        }
        if (!(zif0Var instanceof e9n0) && !(zif0Var instanceof pen0)) {
            return superAppLayoutManager.s;
        }
        int i4 = superAppLayoutManager.s;
        Context context = this.e;
        boolean z = !iah0.s(context) || fnj.b(context);
        int i5 = context.getResources().getConfiguration().screenWidthDp;
        if (z && i5 > 740) {
            i3 = 4;
        }
        return i4 / i3;
    }
}
