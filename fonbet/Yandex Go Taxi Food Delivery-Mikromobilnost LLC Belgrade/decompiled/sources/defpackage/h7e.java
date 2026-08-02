package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.e;
import ru.yandex.taxi.scooters.presentation.common.ui.header.ScootersCardHeaderComponent;

/* loaded from: classes6.dex */
public final class h7e {
    public final e a;
    public final ScootersCardHeaderComponent b;

    public h7e(e eVar, ScootersCardHeaderComponent scootersCardHeaderComponent) {
        this.a = eVar;
        this.b = scootersCardHeaderComponent;
    }

    public final void a(Group group, g7e[] g7eVarArr) {
        group.setId(View.generateViewId());
        int length = g7eVarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = g7eVarArr[i].a;
        }
        group.setReferencedIds(iArr);
        this.b.addView(group);
    }

    public final int b(View view) {
        view.setId(View.generateViewId());
        this.b.addView(view);
        return view.getId();
    }

    public final void c(int i) {
        this.a.i(i, 7, 0, 7);
    }

    public final void d(int i, int i2) {
        this.a.k(i, i2);
    }

    public final void e(int i, int i2) {
        this.a.l(i, i2);
    }
}
