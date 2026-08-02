package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class p4t0 extends y8 {
    public static final p4t0 a = new p4t0();

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        o4t0 o4t0Var = (o4t0) sbxVar.a(o4t0.Companion.serializer(), bVar);
        d2t0 d2t0Var = o4t0Var.b;
        t1t0 t1t0Var = o4t0Var.d;
        d2t0 d2t0Var2 = o4t0Var.c;
        if (d2t0Var != null || d2t0Var2 != null) {
            return new l4t0(d2t0Var, d2t0Var2, t1t0Var);
        }
        Float f = o4t0Var.a;
        float floatValue = f != null ? f.floatValue() : 0.5f;
        return new l4t0(new d2t0(new y1t0(new ruw(7, Float.valueOf(floatValue)), new ruw(7, Float.valueOf(-1.0f))), new y1t0(new ruw(7, Float.valueOf(0.0f)), new ruw(7, Float.valueOf((-1.0f) - floatValue)))), null, t1t0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return o4t0.Companion.serializer().getDescriptor();
    }
}
