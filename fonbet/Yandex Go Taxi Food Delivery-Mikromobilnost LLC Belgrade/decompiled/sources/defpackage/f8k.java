package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class f8k implements c4x {
    public final Expression a;
    public final v7k b;
    public final Expression c;
    public Integer d;

    static {
        new kvo(Boolean.TRUE);
    }

    public f8k(Expression expression, v7k v7kVar, Expression expression2) {
        this.a = expression;
        this.b = v7kVar;
        this.c = expression2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (((java.lang.Number) r2.a.a(r8)).longValue() != ((java.lang.Number) r5.a.a(r9)).longValue()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (((java.lang.Number) r2.a.a(r8)).longValue() != ((java.lang.Number) r5.a.a(r9)).longValue()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if ((r1 instanceof defpackage.s0u0 ? (defpackage.s0u0) r1 : null) != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
    
        if ((r1 instanceof defpackage.zzn ? (defpackage.zzn) r1 : null) != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(f8k f8kVar, rvo rvoVar, rvo rvoVar2) {
        boolean l;
        if (f8kVar != null && ((Boolean) this.a.a(rvoVar)).booleanValue() == ((Boolean) f8kVar.a.a(rvoVar2)).booleanValue()) {
            v7k v7kVar = f8kVar.b;
            v7k v7kVar2 = this.b;
            v7kVar2.getClass();
            if (v7kVar != null) {
                if (v7kVar2 instanceof t7k) {
                    xu60 xu60Var = ((t7k) v7kVar2).b;
                    Object a = v7kVar.a();
                    xu60 xu60Var2 = a instanceof xu60 ? (xu60) a : null;
                    if (xu60Var2 != null) {
                    }
                } else if (v7kVar2 instanceof r7k) {
                    zqv zqvVar = ((r7k) v7kVar2).b;
                    Object a2 = v7kVar.a();
                    zqv zqvVar2 = a2 instanceof zqv ? (zqv) a2 : null;
                    if (zqvVar2 != null) {
                    }
                } else if (v7kVar2 instanceof u7k) {
                    Object a3 = v7kVar.a();
                } else if (v7kVar2 instanceof q7k) {
                    Object a4 = v7kVar.a();
                } else if (v7kVar2 instanceof s7k) {
                    e2x e2xVar = ((s7k) v7kVar2).b;
                    Object a5 = v7kVar.a();
                    e2x e2xVar2 = a5 instanceof e2x ? (e2x) a5 : null;
                    if (e2xVar2 != null) {
                        l = jl40.l(e2xVar.a.a(rvoVar), e2xVar2.a.a(rvoVar2));
                    }
                } else {
                    w511.b();
                }
                if (!l && jl40.l(this.c.a(rvoVar), f8kVar.c.a(rvoVar2))) {
                    return true;
                }
            }
            l = false;
            if (!l) {
            }
        }
        return false;
    }

    public final int b() {
        int i;
        int hashCode;
        int intValue;
        int hashCode2;
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode3 = this.a.hashCode() + qoi0.a(f8k.class).hashCode();
        v7k v7kVar = this.b;
        Integer num2 = v7kVar.a;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            int hashCode4 = qoi0.a(v7kVar.getClass()).hashCode();
            if (v7kVar instanceof t7k) {
                xu60 xu60Var = ((t7k) v7kVar).b;
                Integer num3 = xu60Var.b;
                if (num3 != null) {
                    intValue = num3.intValue();
                    int i2 = hashCode4 + intValue;
                    v7kVar.a = Integer.valueOf(i2);
                    i = i2;
                } else {
                    hashCode2 = qoi0.a(xu60.class).hashCode() + xu60Var.a.hashCode();
                    xu60Var.b = Integer.valueOf(hashCode2);
                    intValue = hashCode2;
                    int i22 = hashCode4 + intValue;
                    v7kVar.a = Integer.valueOf(i22);
                    i = i22;
                }
            } else if (v7kVar instanceof r7k) {
                zqv zqvVar = ((r7k) v7kVar).b;
                Integer num4 = zqvVar.b;
                if (num4 != null) {
                    intValue = num4.intValue();
                    int i222 = hashCode4 + intValue;
                    v7kVar.a = Integer.valueOf(i222);
                    i = i222;
                } else {
                    hashCode = zqvVar.a.hashCode() + qoi0.a(zqv.class).hashCode();
                    zqvVar.b = Integer.valueOf(hashCode);
                    intValue = hashCode;
                    int i2222 = hashCode4 + intValue;
                    v7kVar.a = Integer.valueOf(i2222);
                    i = i2222;
                }
            } else if (v7kVar instanceof u7k) {
                s0u0 s0u0Var = ((u7k) v7kVar).b;
                Integer num5 = s0u0Var.a;
                if (num5 != null) {
                    intValue = num5.intValue();
                    int i22222 = hashCode4 + intValue;
                    v7kVar.a = Integer.valueOf(i22222);
                    i = i22222;
                } else {
                    hashCode2 = qoi0.a(s0u0.class).hashCode();
                    s0u0Var.a = Integer.valueOf(hashCode2);
                    intValue = hashCode2;
                    int i222222 = hashCode4 + intValue;
                    v7kVar.a = Integer.valueOf(i222222);
                    i = i222222;
                }
            } else {
                if (v7kVar instanceof q7k) {
                    zzn zznVar = ((q7k) v7kVar).b;
                    Integer num6 = zznVar.a;
                    if (num6 != null) {
                        intValue = num6.intValue();
                    } else {
                        hashCode2 = qoi0.a(zzn.class).hashCode();
                        zznVar.a = Integer.valueOf(hashCode2);
                        intValue = hashCode2;
                    }
                } else if (v7kVar instanceof s7k) {
                    e2x e2xVar = ((s7k) v7kVar).b;
                    Integer num7 = e2xVar.b;
                    if (num7 != null) {
                        intValue = num7.intValue();
                    } else {
                        hashCode = e2xVar.a.hashCode() + qoi0.a(e2x.class).hashCode();
                        e2xVar.b = Integer.valueOf(hashCode);
                        intValue = hashCode;
                    }
                } else {
                    w511.b();
                    i = 0;
                }
                int i2222222 = hashCode4 + intValue;
                v7kVar.a = Integer.valueOf(i2222222);
                i = i2222222;
            }
        }
        int hashCode5 = this.c.hashCode() + i + hashCode3;
        this.d = Integer.valueOf(hashCode5);
        return hashCode5;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((g8k) ft6.b.D0.getValue()).b(ft6.a, this);
    }
}
