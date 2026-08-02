package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: ConstraintExt.kt */
/* loaded from: classes4.dex */
public final class w5j {
    public static final void a(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null) {
            if (bVar.k == -1 && bVar.l == i) {
                return;
            }
            bVar.k = -1;
            bVar.l = i;
            view.setLayoutParams(bVar);
        }
    }

    public static final void b(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null) {
            if (bVar.l == -1 && bVar.k == i) {
                return;
            }
            bVar.l = -1;
            bVar.k = i;
            view.setLayoutParams(bVar);
        }
    }

    public static final void c(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null) {
            if (bVar.i == -1 && bVar.j == i) {
                return;
            }
            bVar.i = -1;
            bVar.j = i;
            view.setLayoutParams(bVar);
        }
    }

    public static final void d(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null) {
            if (bVar.j == -1 && bVar.i == i) {
                return;
            }
            bVar.j = -1;
            bVar.i = i;
            view.setLayoutParams(bVar);
        }
    }
}
