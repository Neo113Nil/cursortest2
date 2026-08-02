package defpackage;

import com.yandex.div.json.expressions.Expression;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class pvk implements c4x {
    public Integer a;

    public final boolean a(pvk pvkVar, rvo rvoVar, rvo rvoVar2) {
        if (pvkVar != null) {
            if (this instanceof nvk) {
                nvk nvkVar = (nvk) this;
                qvk c = pvkVar.c();
                iqk iqkVar = c instanceof iqk ? (iqk) c : null;
                if (iqkVar != null) {
                    iqk iqkVar2 = nvkVar.b;
                    if (((Boolean) iqkVar2.a.a(rvoVar)).booleanValue() == ((Boolean) iqkVar.a.a(rvoVar2)).booleanValue() && jl40.l(iqkVar2.b.a(rvoVar), iqkVar.b.a(rvoVar2))) {
                        List list = iqkVar2.c;
                        List list2 = iqkVar.c;
                        if (list.size() == list2.size()) {
                            Iterator it = list.iterator();
                            int i = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    hqk hqkVar = (hqk) list2.get(i);
                                    hqk hqkVar2 = (hqk) next;
                                    if (hqkVar != null) {
                                        if (!jl40.l(hqkVar2.a.a(rvoVar), hqkVar.a.a(rvoVar2)) || !jl40.l(hqkVar2.b.a(rvoVar), hqkVar.b.a(rvoVar2))) {
                                            break;
                                        }
                                        Expression expression = hqkVar2.c;
                                        String str = expression != null ? (String) expression.a(rvoVar) : null;
                                        Expression expression2 = hqkVar.c;
                                        if (!jl40.l(str, expression2 != null ? (String) expression2.a(rvoVar2) : null)) {
                                            break;
                                        }
                                        i = i2;
                                    } else {
                                        hqkVar2.getClass();
                                        return false;
                                    }
                                } else if (jl40.l(iqkVar2.d, iqkVar.d)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else if (this instanceof mvk) {
                mvk mvkVar = (mvk) this;
                qvk c2 = pvkVar.c();
                xkk xkkVar = c2 instanceof xkk ? (xkk) c2 : null;
                if (xkkVar != null) {
                    xkk xkkVar2 = mvkVar.b;
                    Expression expression3 = xkkVar2.a;
                    String str2 = expression3 != null ? (String) expression3.a(rvoVar) : null;
                    Expression expression4 = xkkVar.a;
                    if (!jl40.l(str2, expression4 != null ? (String) expression4.a(rvoVar2) : null) || !jl40.l(xkkVar2.b, xkkVar.b)) {
                        break;
                    }
                    return true;
                }
            } else {
                if (!(this instanceof ovk)) {
                    w511.b();
                    return false;
                }
                ovk ovkVar = (ovk) this;
                qvk c3 = pvkVar.c();
                s3l s3lVar = c3 instanceof s3l ? (s3l) c3 : null;
                if (s3lVar != null) {
                    return jl40.l(ovkVar.b.a, s3lVar.a);
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        int hashCode;
        int i2;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = qoi0.a(getClass()).hashCode();
        if (this instanceof nvk) {
            iqk iqkVar = ((nvk) this).b;
            Integer num2 = iqkVar.e;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int hashCode3 = iqkVar.b.hashCode() + iqkVar.a.hashCode() + qoi0.a(iqk.class).hashCode();
                int i3 = 0;
                for (hqk hqkVar : iqkVar.c) {
                    Integer num3 = hqkVar.d;
                    if (num3 != null) {
                        i2 = num3.intValue();
                    } else {
                        int hashCode4 = hqkVar.b.hashCode() + hqkVar.a.hashCode() + qoi0.a(hqk.class).hashCode();
                        Expression expression = hqkVar.c;
                        int hashCode5 = hashCode4 + (expression != null ? expression.hashCode() : 0);
                        hqkVar.d = Integer.valueOf(hashCode5);
                        i2 = hashCode5;
                    }
                    i3 += i2;
                }
                hashCode = iqkVar.d.hashCode() + hashCode3 + i3;
                iqkVar.e = Integer.valueOf(hashCode);
                i = hashCode;
            }
        } else if (this instanceof mvk) {
            xkk xkkVar = ((mvk) this).b;
            Integer num4 = xkkVar.c;
            if (num4 != null) {
                i = num4.intValue();
            } else {
                int hashCode6 = qoi0.a(xkk.class).hashCode();
                Expression expression2 = xkkVar.a;
                hashCode = xkkVar.b.hashCode() + hashCode6 + (expression2 != null ? expression2.hashCode() : 0);
                xkkVar.c = Integer.valueOf(hashCode);
                i = hashCode;
            }
        } else {
            if (!(this instanceof ovk)) {
                w511.b();
                return 0;
            }
            s3l s3lVar = ((ovk) this).b;
            Integer num5 = s3lVar.b;
            if (num5 != null) {
                i = num5.intValue();
            } else {
                int hashCode7 = s3lVar.a.hashCode() + qoi0.a(s3l.class).hashCode();
                s3lVar.b = Integer.valueOf(hashCode7);
                i = hashCode7;
            }
        }
        int i4 = hashCode2 + i;
        this.a = Integer.valueOf(i4);
        return i4;
    }

    public final qvk c() {
        if (this instanceof nvk) {
            return ((nvk) this).b;
        }
        if (this instanceof mvk) {
            return ((mvk) this).b;
        }
        if (this instanceof ovk) {
            return ((ovk) this).b;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((rvk) ft6.b.D4.getValue()).b(ft6.a, this);
    }
}
