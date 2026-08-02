package xsna;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;

/* compiled from: LazyStaggeredGridBeyondBoundsModifier.kt */
/* loaded from: classes11.dex */
public final class owy implements tsy {
    public final uxy a;

    public owy(uxy uxyVar) {
        this.a = uxyVar;
    }

    @Override // xsna.tsy
    public final int a() {
        return ((wak0) this.a.c.c).getIntValue();
    }

    @Override // xsna.tsy
    public final int b() {
        int i;
        uxy uxyVar = this.a;
        int i2 = 0;
        if (uxyVar.g().f().isEmpty()) {
            return 0;
        }
        cxy g = uxyVar.g();
        lxy lxyVar = mxy.a;
        int a = (int) (g.getOrientation() == Orientation.Vertical ? g.a() & 4294967295L : g.a() >> 32);
        cxy g2 = uxyVar.g();
        List<twy> f = g2.f();
        if (!f.isEmpty()) {
            int size = f.size();
            int i3 = 0;
            while (i2 < size) {
                twy twyVar = f.get(i2);
                i3 += (int) (g2.getOrientation() == Orientation.Vertical ? twyVar.a() & 4294967295L : twyVar.a() >> 32);
                i2++;
            }
            i2 = g2.e() + (i3 / f.size());
        }
        if (i2 != 0 && (i = a / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // xsna.tsy
    public final boolean c() {
        return !this.a.g().f().isEmpty();
    }

    @Override // xsna.tsy
    public final int d() {
        return ((twy) j5g.i0(this.a.g().f())).getIndex();
    }

    @Override // xsna.tsy
    public final int getItemCount() {
        return this.a.g().d();
    }
}
