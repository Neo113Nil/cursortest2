package xsna;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import xsna.m930;
import xsna.vl00;

/* compiled from: MapMaker.java */
/* loaded from: classes13.dex */
public final class ul00 {
    public boolean a;
    public int b = -1;
    public int c = -1;
    public vl00.o d;
    public vl00.o e;
    public tup<Object> f;

    public final <K, V> ConcurrentMap<K, V> a() {
        vl00.o oVar;
        vl00.o oVar2;
        vl00.o oVar3;
        if (!this.a) {
            int i = this.b;
            if (i == -1) {
                i = 16;
            }
            int i2 = this.c;
            if (i2 == -1) {
                i2 = 4;
            }
            return new ConcurrentHashMap(i, 0.75f, i2);
        }
        vl00.a aVar = vl00.i;
        vl00.o oVar4 = this.d;
        vl00.o oVar5 = vl00.o.STRONG;
        if (oVar4 != null) {
            oVar = oVar4;
        } else {
            if (oVar5 == null) {
                throw new NullPointerException("Both parameters are null");
            }
            oVar = oVar5;
        }
        if (oVar == oVar5) {
            vl00.o oVar6 = this.e;
            if (oVar6 == null) {
                if (oVar5 == null) {
                    throw new NullPointerException("Both parameters are null");
                }
                oVar6 = oVar5;
            }
            if (oVar6 == oVar5) {
                return new vl00(this, vl00.p.a.a);
            }
        }
        if (oVar4 != null) {
            oVar2 = oVar4;
        } else {
            if (oVar5 == null) {
                throw new NullPointerException("Both parameters are null");
            }
            oVar2 = oVar5;
        }
        if (oVar2 == oVar5) {
            vl00.o oVar7 = this.e;
            if (oVar7 == null) {
                if (oVar5 == null) {
                    throw new NullPointerException("Both parameters are null");
                }
                oVar7 = oVar5;
            }
            if (oVar7 == vl00.o.WEAK) {
                return new vl00(this, vl00.r.a.a);
            }
        }
        if (oVar4 != null) {
            oVar3 = oVar4;
        } else {
            if (oVar5 == null) {
                throw new NullPointerException("Both parameters are null");
            }
            oVar3 = oVar5;
        }
        vl00.o oVar8 = vl00.o.WEAK;
        if (oVar3 == oVar8) {
            vl00.o oVar9 = this.e;
            if (oVar9 == null) {
                if (oVar5 == null) {
                    throw new NullPointerException("Both parameters are null");
                }
                oVar9 = oVar5;
            }
            if (oVar9 == oVar5) {
                return new vl00(this, vl00.v.a.a);
            }
        }
        if (oVar4 == null) {
            if (oVar5 == null) {
                throw new NullPointerException("Both parameters are null");
            }
            oVar4 = oVar5;
        }
        if (oVar4 == oVar8) {
            vl00.o oVar10 = this.e;
            if (oVar10 != null) {
                oVar5 = oVar10;
            } else if (oVar5 == null) {
                throw new NullPointerException("Both parameters are null");
            }
            if (oVar5 == oVar8) {
                return new vl00(this, vl00.x.a.a);
            }
        }
        throw new AssertionError();
    }

    public final String toString() {
        m930 m930Var = new m930(ul00.class.getSimpleName());
        int i = this.b;
        if (i != -1) {
            String valueOf = String.valueOf(i);
            m930.a aVar = new m930.a();
            m930Var.c.c = aVar;
            m930Var.c = aVar;
            aVar.b = valueOf;
            aVar.a = "initialCapacity";
        }
        int i2 = this.c;
        if (i2 != -1) {
            String valueOf2 = String.valueOf(i2);
            m930.a aVar2 = new m930.a();
            m930Var.c.c = aVar2;
            m930Var.c = aVar2;
            aVar2.b = valueOf2;
            aVar2.a = "concurrencyLevel";
        }
        vl00.o oVar = this.d;
        if (oVar != null) {
            String u = o19.u(oVar.toString());
            m930.b bVar = new m930.b();
            m930Var.c.c = bVar;
            m930Var.c = bVar;
            bVar.b = u;
            bVar.a = "keyStrength";
        }
        vl00.o oVar2 = this.e;
        if (oVar2 != null) {
            String u2 = o19.u(oVar2.toString());
            m930.b bVar2 = new m930.b();
            m930Var.c.c = bVar2;
            m930Var.c = bVar2;
            bVar2.b = u2;
            bVar2.a = "valueStrength";
        }
        if (this.f != null) {
            m930.b bVar3 = new m930.b();
            m930Var.c.c = bVar3;
            m930Var.c = bVar3;
            bVar3.b = "keyEquivalence";
        }
        return m930Var.toString();
    }
}
