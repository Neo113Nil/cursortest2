package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class c4q0 extends RecyclerView.d {
    public final j1u a;
    public final cfx b;

    public c4q0(j1u j1uVar, efx efxVar) {
        this.a = j1uVar;
        this.b = efxVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        boolean z;
        ViewGroup.LayoutParams layoutParams;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        cfx cfxVar = this.b;
        List f = cfxVar.f();
        if (childAdapterPosition < 0 || childAdapterPosition >= f.size()) {
            return;
        }
        u0x u0xVar = (u0x) f.get(childAdapterPosition);
        if (u0xVar instanceof aul) {
            x1q0 x1q0Var = ((aul) u0xVar).b;
            Integer num = x1q0Var.e;
            float f2 = x1q0Var.b;
            int i = x1q0Var.d;
            h1q0 h1q0Var = x1q0Var.c;
            if (num != null) {
                int u = rzo.u(num.intValue(), view);
                if ((recyclerView.getWidth() - ((((i - 1) * rzo.s(f2, view)) + rzo.s(h1q0Var.b, view)) + rzo.s(h1q0Var.d, view))) / i > u && (layoutParams = view.getLayoutParams()) != null && layoutParams.width != u) {
                    layoutParams.width = u;
                    view.setLayoutParams(layoutParams);
                }
            }
            j1u j1uVar = this.a;
            j1uVar.getItemCount();
            int o = j1uVar.o(childAdapterPosition);
            int l = j1uVar.l(childAdapterPosition);
            int s = rzo.s(h1q0Var.b, view);
            int s2 = rzo.s(h1q0Var.d, view);
            int s3 = rzo.s(f2, view);
            boolean z2 = true;
            int m = ((j1uVar.getM() - 1) * s3) + s + s2;
            int i2 = o + l;
            rect.left = (s3 * l) + (s - ((m * l) / j1uVar.getM()));
            rect.right = -g8e.d(i2, 1, s3, s - ((m * i2) / j1uVar.getM()));
            boolean f3 = f(childAdapterPosition);
            if (f3 && l == 0) {
                rect.left = 0;
            }
            if (f3 && i2 == j1uVar.getM()) {
                rect.right = 0;
            }
            Integer num2 = x1q0Var.e;
            if (num2 != null) {
                int u2 = rzo.u(num2.intValue(), view);
                int width = (recyclerView.getWidth() - ((i - 1) * s3)) / i;
                if (width > u2) {
                    int i3 = (width - u2) / 2;
                    rect.left += i3;
                    rect.right += i3;
                }
            }
            if (f3) {
                rect.top = 0;
                rect.bottom = 0;
            } else {
                int s4 = rzo.s(x1q0Var.a / 2.0f, view);
                Integer h = j1uVar.h(childAdapterPosition);
                if (h == null || !f(h.intValue())) {
                    rect.top = s4;
                } else {
                    rect.top = 0;
                }
                Integer f4 = j1uVar.f(childAdapterPosition);
                if (f4 == null || !f(f4.intValue())) {
                    rect.bottom = s4;
                } else {
                    rect.bottom = 0;
                }
            }
            Integer h2 = j1uVar.h(childAdapterPosition);
            if (h2 == null) {
                z = true;
            } else {
                List f5 = cfxVar.f();
                Object S = a.S(childAdapterPosition, f5);
                aul aulVar = S instanceof aul ? (aul) S : null;
                String str = aulVar != null ? aulVar.n : null;
                Object S2 = a.S(h2.intValue(), f5);
                aul aulVar2 = S2 instanceof aul ? (aul) S2 : null;
                z = !jl40.l(str, aulVar2 != null ? aulVar2.n : null);
            }
            if (z) {
                if (f3) {
                    rect.top = 0;
                } else {
                    rect.top = rzo.s(h1q0Var.a, view);
                }
            }
            Integer f6 = j1uVar.f(childAdapterPosition);
            if (f6 != null) {
                int intValue = f6.intValue();
                List f7 = cfxVar.f();
                Object S3 = a.S(childAdapterPosition, f7);
                aul aulVar3 = S3 instanceof aul ? (aul) S3 : null;
                String str2 = aulVar3 != null ? aulVar3.n : null;
                Object S4 = a.S(intValue, f7);
                aul aulVar4 = S4 instanceof aul ? (aul) S4 : null;
                z2 = true ^ jl40.l(str2, aulVar4 != null ? aulVar4.n : null);
            }
            if (z2) {
                if (f3) {
                    rect.bottom = 0;
                } else {
                    rect.bottom = rzo.s(h1q0Var.c, view);
                }
            }
        }
    }

    public final boolean f(int i) {
        List f = this.b.f();
        if (i < 0 || i >= f.size()) {
            return false;
        }
        u0x u0xVar = (u0x) f.get(i);
        if (u0xVar instanceof aul) {
            return ((aul) u0xVar).d.b;
        }
        return false;
    }
}
