package defpackage;

import androidx.compose.foundation.lazy.grid.b;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* loaded from: classes10.dex */
public final class e4y extends v5y {
    public final b4y b;
    public final t5y c;
    public final int d;
    public final /* synthetic */ t5y e;
    public final /* synthetic */ b f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;

    public e4y(b4y b4yVar, t5y t5yVar, int i, b bVar, int i2, int i3, long j) {
        this.e = t5yVar;
        this.f = bVar;
        this.g = i2;
        this.h = i3;
        this.i = j;
        this.b = b4yVar;
        this.c = t5yVar;
        this.d = i;
    }

    @Override // defpackage.v5y
    public final u5y a(int i, int i2, long j, int i3) {
        return c(i, i2, i3, this.d, j);
    }

    public final j4y c(int i, int i2, int i3, int i4, long j) {
        int j2;
        b4y b4yVar = this.b;
        Object c = b4yVar.c(i);
        Object c2 = b4yVar.b.c(i);
        List b = b(this.c, i, j);
        if (n8e.g(j)) {
            j2 = n8e.k(j);
        } else {
            if (!n8e.f(j)) {
                lxv.a("does not have fixed height");
            }
            j2 = n8e.j(j);
        }
        LayoutDirection layoutDirection = this.e.b.getLayoutDirection();
        c cVar = this.f.m;
        return new j4y(i, c, j2, i4, layoutDirection, this.g, this.h, b, this.i, c2, cVar, j, i2, i3);
    }
}
