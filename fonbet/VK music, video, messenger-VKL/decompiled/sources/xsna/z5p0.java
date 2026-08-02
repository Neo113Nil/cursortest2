package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import xsna.ktv0;

/* compiled from: VkTooltip.kt */
/* loaded from: classes17.dex */
public final class z5p0 implements fxb0 {
    public final azl b;
    public final ktv0 c;
    public final float d;
    public final boolean e;
    public final gyo0 f;
    public final y2x g;
    public final int h;

    public z5p0() {
        throw null;
    }

    public z5p0(azl azlVar, ktv0 ktv0Var, float f, boolean z, gyo0 gyo0Var, y2x y2xVar, int i) {
        this.b = azlVar;
        this.c = ktv0Var;
        this.d = f;
        this.e = z;
        this.f = gyo0Var;
        this.g = y2xVar;
        this.h = i;
    }

    @Override // xsna.fxb0
    public final long b(l9x l9xVar, long j, LayoutDirection layoutDirection, long j2) {
        ktv0 ktv0Var;
        ArrayList o;
        Object obj;
        ktv0 ktv0Var2 = this.c;
        ktv0Var2.getClass();
        if (this.e) {
            ktv0.e eVar = ktv0.e.a;
            if (ktv0Var2.equals(eVar)) {
                o = e43.o(eVar, ktv0.a.a, ktv0.c.a, ktv0.d.a);
            } else {
                ktv0.a aVar = ktv0.a.a;
                if (ktv0Var2.equals(aVar)) {
                    o = e43.o(aVar, eVar, ktv0.c.a, ktv0.d.a);
                } else {
                    ktv0.c cVar = ktv0.c.a;
                    if (ktv0Var2.equals(cVar)) {
                        o = e43.o(cVar, ktv0.d.a, eVar, aVar);
                    } else {
                        ktv0.d dVar = ktv0.d.a;
                        o = ktv0Var2.equals(dVar) ? e43.o(dVar, cVar, eVar, aVar) : e43.o(eVar, aVar, cVar, dVar);
                    }
                }
            }
            Iterator it = o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ktv0 ktv0Var3 = (ktv0) obj;
                if (!(ktv0Var3 instanceof ktv0.e)) {
                    if (!(ktv0Var3 instanceof ktv0.a)) {
                        if (!(ktv0Var3 instanceof ktv0.c)) {
                            if ((ktv0Var3 instanceof ktv0.d) && l9xVar.c + ((int) (j2 >> 32)) <= ((int) (j >> 32))) {
                                break;
                            }
                        } else if (l9xVar.a - ((int) (j2 >> 32)) >= 0) {
                            break;
                        }
                    } else if (l9xVar.d + ((int) (j2 & 4294967295L)) <= ((int) (j & 4294967295L))) {
                        break;
                    }
                } else if (l9xVar.b - ((int) (j2 & 4294967295L)) >= 0) {
                    break;
                }
                this.f.invoke(ktv0Var);
                Pair<h9x, Float> b = ktv0Var.b(this.b, j, this.d, l9xVar, j2, this.h);
                long j3 = b.d().a;
                this.g.invoke(Float.valueOf(b.g().floatValue()));
                return j3;
            }
            ktv0 ktv0Var4 = (ktv0) obj;
            if (ktv0Var4 != null) {
                ktv0Var = ktv0Var4;
                this.f.invoke(ktv0Var);
                Pair<h9x, Float> b2 = ktv0Var.b(this.b, j, this.d, l9xVar, j2, this.h);
                long j32 = b2.d().a;
                this.g.invoke(Float.valueOf(b2.g().floatValue()));
                return j32;
            }
        }
        ktv0Var = ktv0Var2;
        this.f.invoke(ktv0Var);
        Pair<h9x, Float> b22 = ktv0Var.b(this.b, j, this.d, l9xVar, j2, this.h);
        long j322 = b22.d().a;
        this.g.invoke(Float.valueOf(b22.g().floatValue()));
        return j322;
    }
}
