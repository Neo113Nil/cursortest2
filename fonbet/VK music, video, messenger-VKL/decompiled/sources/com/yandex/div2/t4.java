package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.u4;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.rln;

/* compiled from: DivFunction.kt */
/* loaded from: classes8.dex */
public final class t4 implements JSONSerializable, Hashable {
    public final List<rln> a;
    public final String b;
    public final String c;
    public final DivEvaluableType d;
    public Integer e;

    public t4(List<rln> list, String str, String str2, DivEvaluableType divEvaluableType) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = divEvaluableType;
    }

    public final boolean a(t4 t4Var) {
        if (t4Var != null) {
            List<rln> list = t4Var.a;
            List<rln> list2 = this.a;
            if (list2.size() == list.size()) {
                Iterator<T> it = list2.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        if (!epx.f(this.b, t4Var.b) || !epx.f(this.c, t4Var.c) || this.d != t4Var.d) {
                            break;
                        }
                        return true;
                    }
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    rln rlnVar = list.get(i);
                    rln rlnVar2 = (rln) next;
                    if (rlnVar != null) {
                        if (!epx.f(rlnVar2.a, rlnVar.a) || rlnVar2.b != rlnVar.b) {
                            break;
                        }
                        i = i2;
                    } else {
                        rlnVar2.getClass();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public final int hash() {
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = fpf0.a(t4.class).hashCode();
        Iterator<T> it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((rln) it.next()).hash();
        }
        int hashCode2 = this.d.hashCode() + this.c.hashCode() + this.b.hashCode() + hashCode + i;
        this.e = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public final JSONObject writeToJSON() {
        return ((u4.a) BuiltInParserKt.getBuiltInParserComponent().I3.getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
