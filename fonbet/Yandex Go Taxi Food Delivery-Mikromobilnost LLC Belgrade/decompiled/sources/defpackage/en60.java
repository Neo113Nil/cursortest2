package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonEncodingException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;

/* loaded from: classes8.dex */
public final class en60 extends vfx {
    public static final en60 a = new en60();
    public static final o2f0 b = d6z.a("kotlin.Number", h2f0.j);

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        String a2 = qcx.n(ncxVar.t()).a();
        Long m = bvu0.m(10, a2);
        if (m == null) {
            return Double.valueOf(Double.parseDouble(a2));
        }
        long longValue = m.longValue();
        return (-2147483648L > longValue || longValue > 2147483647L) ? Long.valueOf(longValue) : Integer.valueOf((int) longValue);
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        b adxVar;
        String obj2 = ((Number) obj).toString();
        exv exvVar = qcx.a;
        if (obj2 == null) {
            adxVar = JsonNull.INSTANCE;
        } else {
            JsonNull.INSTANCE.getClass();
            if (obj2.equals("null")) {
                throw new JsonEncodingException("Creating a literal unquoted value of 'null' is forbidden.", null, "If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive", 2);
            }
            adxVar = new adx(obj2, false, qcx.a);
        }
        vcxVar.p(adxVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }
}
