package xsna;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;

/* compiled from: LazyGridScrollScope.kt */
/* renamed from: xsna.try, reason: invalid class name */
/* loaded from: classes11.dex */
public final class Ctry implements guy, ggh0 {
    public final /* synthetic */ ggh0 a;
    public final /* synthetic */ dsy b;

    public Ctry(ggh0 ggh0Var, dsy dsyVar) {
        this.b = dsyVar;
        this.a = ggh0Var;
    }

    @Override // xsna.guy
    public final int a() {
        return this.b.h();
    }

    @Override // xsna.guy
    public final int b() {
        return this.b.g();
    }

    @Override // xsna.guy
    public final int c() {
        xqy xqyVar = (xqy) j5g.k0(this.b.i().f());
        if (xqyVar != null) {
            return xqyVar.getIndex();
        }
        return 0;
    }

    @Override // xsna.guy
    public final void d(int i, int i2) {
        this.b.k(i, i2, true);
    }

    @Override // xsna.guy
    public final int e(int i) {
        Integer num;
        xqy xqyVar;
        dsy dsyVar = this.b;
        kry i2 = dsyVar.i();
        if (!i2.f().isEmpty()) {
            int g = dsyVar.g();
            if (i > c() || g > i) {
                int i3 = ((mry) ((zak0) dsyVar.e).getValue()).j;
                return (((((i3 - 1) * (i < dsyVar.g() ? -1 : 1)) + (i - dsyVar.g())) / i3) * kn4.p(i2)) - dsyVar.h();
            }
            List<xqy> f = i2.f();
            int size = f.size();
            int i4 = 0;
            while (true) {
                num = null;
                if (i4 >= size) {
                    xqyVar = null;
                    break;
                }
                xqyVar = f.get(i4);
                if (xqyVar.getIndex() == i) {
                    break;
                }
                i4++;
            }
            xqy xqyVar2 = xqyVar;
            if (i2.getOrientation() == Orientation.Vertical) {
                if (xqyVar2 != null) {
                    num = Integer.valueOf((int) (xqyVar2.e() & 4294967295L));
                }
            } else if (xqyVar2 != null) {
                num = Integer.valueOf((int) (xqyVar2.e() >> 32));
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return 0;
    }

    @Override // xsna.ggh0
    public final float f(float f) {
        return this.a.f(f);
    }

    @Override // xsna.guy
    public final int getItemCount() {
        return this.b.i().d();
    }
}
