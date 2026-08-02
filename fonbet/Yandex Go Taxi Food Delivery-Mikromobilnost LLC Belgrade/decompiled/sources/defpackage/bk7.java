package defpackage;

import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;

/* loaded from: classes5.dex */
public final class bk7 extends vfx {
    public static final bk7 a = new bk7();
    public static final asq0 b = d6z.f("ru.yandex.taxi.eatskit.dto.CallResultCustom", new SerialDescriptor[0], new wk6(13));

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        throw new SerializationException("CallResult do not support deserialize");
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        Object J;
        ck7 ck7Var = (ck7) obj;
        asq0 asq0Var = b;
        yjd b2 = vcxVar.b(asq0Var);
        Object obj2 = ck7Var.a;
        ug7 ug7Var = ck7Var.b;
        bk7 bk7Var = a;
        if (obj2 != null) {
            if (obj2.equals(zy11.a)) {
                J = new c(b.f());
            } else {
                KSerializer K = gtq0.K(qoi0.a(obj2.getClass()));
                if (K == null) {
                    yci0.m(g8e.o("CallResult do not support serialization ", qoi0.a(obj2.getClass()).c()));
                    return;
                } else {
                    sbx d = vcxVar.d();
                    d.getClass();
                    J = gwk0.J(d, obj2, K);
                }
            }
            bk7Var.getClass();
            b2.e(asq0Var, 0, kotlinx.serialization.json.b.Companion.serializer(), J);
        }
        if (ug7Var != null) {
            bk7Var.getClass();
            b2.e(asq0Var, 0, ug7.Companion.serializer(), ug7Var);
        }
        b2.c(asq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }
}
