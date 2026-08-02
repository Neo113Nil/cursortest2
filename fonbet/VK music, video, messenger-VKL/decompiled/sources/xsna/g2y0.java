package xsna;

import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.WriteMode;
import xsna.gmi0;
import xsna.prm0;

/* compiled from: WriteMode.kt */
/* loaded from: classes8.dex */
public final class g2y0 {
    public static final SerialDescriptor a(SerialDescriptor serialDescriptor, de deVar) {
        SerialDescriptor a;
        KSerializer X;
        if (!epx.f(serialDescriptor.getKind(), gmi0.a.a)) {
            return serialDescriptor.isInline() ? a(serialDescriptor.h(0), deVar) : serialDescriptor;
        }
        dcy s = zq70.s(serialDescriptor);
        SerialDescriptor serialDescriptor2 = null;
        if (s != null && (X = deVar.X(s, EmptyList.b)) != null) {
            serialDescriptor2 = X.getDescriptor();
        }
        return (serialDescriptor2 == null || (a = a(serialDescriptor2, deVar)) == null) ? serialDescriptor : a;
    }

    public static final WriteMode b(SerialDescriptor serialDescriptor, j8y j8yVar) {
        gmi0 kind = serialDescriptor.getKind();
        if (kind instanceof rub0) {
            return WriteMode.POLY_OBJ;
        }
        if (epx.f(kind, prm0.b.a)) {
            return WriteMode.LIST;
        }
        if (!epx.f(kind, prm0.c.a)) {
            return WriteMode.OBJ;
        }
        SerialDescriptor a = a(serialDescriptor.h(0), j8yVar.b);
        gmi0 kind2 = a.getKind();
        if ((kind2 instanceof gbd0) || epx.f(kind2, gmi0.b.a)) {
            return WriteMode.MAP;
        }
        if (j8yVar.a.d) {
            return WriteMode.LIST;
        }
        throw ne7.b(a);
    }
}
