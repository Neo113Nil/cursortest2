package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSizeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bcl implements c4x {
    public final Expression a;
    public final gcl b;
    public final Expression c;
    public final Expression d;
    public Integer e;

    static {
        new pcl();
        ngd0.m(DivSizeUnit.DP);
        ngd0.m(Double.valueOf(1.0d));
    }

    public bcl(Expression expression, gcl gclVar, Expression expression2, Expression expression3) {
        this.a = expression;
        this.b = gclVar;
        this.c = expression2;
        this.d = expression3;
    }

    public final boolean a(bcl bclVar, rvo rvoVar, rvo rvoVar2) {
        c4x c4xVar;
        boolean a;
        c4x c4xVar2;
        if (bclVar != null && ((Number) this.a.a(rvoVar)).intValue() == ((Number) bclVar.a.a(rvoVar2)).intValue()) {
            gcl gclVar = bclVar.b;
            gcl gclVar2 = this.b;
            gclVar2.getClass();
            if (gclVar != null) {
                if (gclVar2 instanceof fcl) {
                    if (gclVar instanceof fcl) {
                        c4xVar2 = ((fcl) gclVar).b;
                    } else {
                        if (!(gclVar instanceof ecl)) {
                            w511.b();
                            return false;
                        }
                        c4xVar2 = ((ecl) gclVar).b;
                    }
                    if ((c4xVar2 instanceof pcl ? (pcl) c4xVar2 : null) != null) {
                        a = true;
                    }
                } else if (gclVar2 instanceof ecl) {
                    if (gclVar instanceof fcl) {
                        c4xVar = ((fcl) gclVar).b;
                    } else {
                        if (!(gclVar instanceof ecl)) {
                            w511.b();
                            return false;
                        }
                        c4xVar = ((ecl) gclVar).b;
                    }
                    a = hcl.a(c4xVar instanceof hcl ? (hcl) c4xVar : null);
                } else {
                    w511.b();
                }
                if (!a && this.c.a(rvoVar) == bclVar.c.a(rvoVar2) && ((Number) this.d.a(rvoVar)).doubleValue() == ((Number) bclVar.d.a(rvoVar2)).doubleValue()) {
                    return true;
                }
            }
            a = false;
            if (!a) {
            }
        }
        return false;
    }

    public final int b() {
        int i;
        int b;
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(bcl.class).hashCode();
        gcl gclVar = this.b;
        Integer num2 = gclVar.a;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            int hashCode2 = qoi0.a(gclVar.getClass()).hashCode();
            if (gclVar instanceof fcl) {
                pcl pclVar = ((fcl) gclVar).b;
                Integer num3 = pclVar.a;
                if (num3 != null) {
                    b = num3.intValue();
                } else {
                    int hashCode3 = qoi0.a(pcl.class).hashCode();
                    pclVar.a = Integer.valueOf(hashCode3);
                    b = hashCode3;
                }
            } else if (gclVar instanceof ecl) {
                b = ((ecl) gclVar).b.b();
            } else {
                w511.b();
                i = 0;
            }
            int i2 = hashCode2 + b;
            gclVar.a = Integer.valueOf(i2);
            i = i2;
        }
        int hashCode4 = this.d.hashCode() + this.c.hashCode() + i + hashCode;
        this.e = Integer.valueOf(hashCode4);
        return hashCode4;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((ccl) ft6.b.Y7.getValue()).b(ft6.a, this);
    }
}
