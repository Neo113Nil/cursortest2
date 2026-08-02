package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class ewk implements c4x {
    public Integer a;

    public final boolean a(ewk ewkVar, rvo rvoVar, rvo rvoVar2) {
        c4x c4xVar;
        c4x c4xVar2;
        if (ewkVar != null) {
            if (this instanceof dwk) {
                dwk dwkVar = (dwk) this;
                if (ewkVar instanceof dwk) {
                    c4xVar2 = ((dwk) ewkVar).b;
                } else {
                    if (!(ewkVar instanceof cwk)) {
                        w511.b();
                        return false;
                    }
                    c4xVar2 = ((cwk) ewkVar).b;
                }
                twk twkVar = c4xVar2 instanceof twk ? (twk) c4xVar2 : null;
                if (twkVar != null) {
                    twk twkVar2 = dwkVar.b;
                    if (((Boolean) twkVar2.a.a(rvoVar)).booleanValue() == ((Boolean) twkVar.a.a(rvoVar2)).booleanValue() && jl40.l(twkVar2.b.a(rvoVar), twkVar.b.a(rvoVar2)) && jl40.l(twkVar2.c.a(rvoVar), twkVar.c.a(rvoVar2)) && jl40.l(twkVar2.d, twkVar.d)) {
                        return true;
                    }
                }
            } else {
                if (!(this instanceof cwk)) {
                    w511.b();
                    return false;
                }
                cwk cwkVar = (cwk) this;
                if (ewkVar instanceof dwk) {
                    c4xVar = ((dwk) ewkVar).b;
                } else {
                    if (!(ewkVar instanceof cwk)) {
                        w511.b();
                        return false;
                    }
                    c4xVar = ((cwk) ewkVar).b;
                }
                kwk kwkVar = c4xVar instanceof kwk ? (kwk) c4xVar : null;
                if (kwkVar != null) {
                    kwk kwkVar2 = cwkVar.b;
                    if (((Boolean) kwkVar2.a.a(rvoVar)).booleanValue() == ((Boolean) kwkVar.a.a(rvoVar2)).booleanValue() && ((Boolean) kwkVar2.b.a(rvoVar)).booleanValue() == ((Boolean) kwkVar.b.a(rvoVar2)).booleanValue() && jl40.l(kwkVar2.c.a(rvoVar), kwkVar.c.a(rvoVar2)) && jl40.l(kwkVar2.d, kwkVar.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int hashCode;
        int intValue;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = qoi0.a(getClass()).hashCode();
        if (this instanceof dwk) {
            twk twkVar = ((dwk) this).b;
            Integer num2 = twkVar.e;
            if (num2 != null) {
                intValue = num2.intValue();
            } else {
                hashCode = twkVar.d.hashCode() + twkVar.c.hashCode() + twkVar.b.hashCode() + twkVar.a.hashCode() + qoi0.a(twk.class).hashCode();
                twkVar.e = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        } else {
            if (!(this instanceof cwk)) {
                w511.b();
                return 0;
            }
            kwk kwkVar = ((cwk) this).b;
            Integer num3 = kwkVar.e;
            if (num3 != null) {
                intValue = num3.intValue();
            } else {
                hashCode = kwkVar.d.hashCode() + kwkVar.c.hashCode() + kwkVar.b.hashCode() + kwkVar.a.hashCode() + qoi0.a(kwk.class).hashCode();
                kwkVar.e = Integer.valueOf(hashCode);
                intValue = hashCode;
            }
        }
        int i = hashCode2 + intValue;
        this.a = Integer.valueOf(i);
        return i;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((qwk) ft6.b.O4.getValue()).b(ft6.a, this);
    }
}
