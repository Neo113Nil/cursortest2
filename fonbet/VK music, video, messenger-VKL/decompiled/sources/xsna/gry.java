package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* compiled from: LazyGrid.kt */
/* loaded from: classes11.dex */
public final class gry extends z46 {
    public final yqy d;
    public final qty e;
    public final int f;
    public final /* synthetic */ qty g;
    public final /* synthetic */ dsy h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gry(yqy yqyVar, qty qtyVar, int i, dsy dsyVar, boolean z, int i2, int i3, long j) {
        super(3);
        this.g = qtyVar;
        this.h = dsyVar;
        this.i = z;
        this.j = i2;
        this.k = i3;
        this.l = j;
        this.d = yqyVar;
        this.e = qtyVar;
        this.f = i;
    }

    public final nry w0(int i, int i2, int i3, int i4, long j) {
        int j2;
        yqy yqyVar = this.d;
        Object h = yqyVar.h(i);
        Object g = yqyVar.g(i);
        List F = F(this.e, i, j);
        if (o6j.g(j)) {
            j2 = o6j.k(j);
        } else {
            if (!o6j.f(j)) {
                xzw.a("does not have fixed height");
            }
            j2 = o6j.j(j);
        }
        LayoutDirection layoutDirection = this.g.c.getLayoutDirection();
        bty<nry> btyVar = this.h.m;
        int i5 = this.k;
        long j3 = this.l;
        return new nry(i, h, this.i, j2, i4, layoutDirection, this.j, i5, F, j3, g, btyVar, j, i2, i3);
    }

    @Override // xsna.z46
    public final rty x(int i, int i2, int i3, long j) {
        return w0(i, i2, i3, this.f, j);
    }
}
