package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class aok implements c4x {
    public Integer a;

    public final boolean a(aok aokVar, rvo rvoVar, rvo rvoVar2) {
        if (aokVar != null) {
            if (!(this instanceof znk)) {
                w511.b();
                return false;
            }
            znk znkVar = (znk) this;
            if (!(aokVar instanceof znk)) {
                w511.b();
                return false;
            }
            u8l u8lVar = ((znk) aokVar).b;
            u8l u8lVar2 = znkVar.b;
            if (((Number) u8lVar2.a.a(rvoVar)).intValue() == ((Number) u8lVar.a.a(rvoVar2)).intValue() && u8lVar2.b.a(u8lVar.b, rvoVar, rvoVar2)) {
                bcl bclVar = u8lVar2.c;
                bcl bclVar2 = u8lVar.c;
                if (bclVar != null ? bclVar.a(bclVar2, rvoVar, rvoVar2) : bclVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(getClass()).hashCode();
        if (!(this instanceof znk)) {
            w511.b();
            return 0;
        }
        u8l u8lVar = ((znk) this).b;
        Integer num2 = u8lVar.d;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            int b = u8lVar.b.b() + u8lVar.a.hashCode() + qoi0.a(u8l.class).hashCode();
            bcl bclVar = u8lVar.c;
            int b2 = (bclVar != null ? bclVar.b() : 0) + b;
            u8lVar.d = Integer.valueOf(b2);
            i = b2;
        }
        int i2 = i + hashCode;
        this.a = Integer.valueOf(i2);
        return i2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((bok) ft6.b.d3.getValue()).b(ft6.a, this);
    }
}
