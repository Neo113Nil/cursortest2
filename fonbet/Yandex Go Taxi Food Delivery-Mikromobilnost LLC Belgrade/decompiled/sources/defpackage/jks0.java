package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class jks0 extends y8 {
    public static final jks0 a = new jks0();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        KSerializer serializer = iks0.Companion.serializer();
        b = serializer;
        c = serializer.getDescriptor();
    }

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        sbxVar.getClass();
        iks0 iks0Var = (iks0) sbxVar.a(iks0.Companion.serializer(), bVar);
        String str = iks0Var.a;
        gks0 gks0Var = iks0Var.b;
        return new aks0(str, gks0Var != null ? new zjs0(gks0Var.a()) : null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }
}
