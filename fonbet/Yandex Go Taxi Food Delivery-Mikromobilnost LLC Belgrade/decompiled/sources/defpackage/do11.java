package defpackage;

import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class do11 extends vfx {
    public final Map a = b.i(new Pair("plus_burns", m1d0.Companion.serializer()), new Pair("catching_up_cashback", g59.Companion.serializer()));
    public final SerialDescriptor b = c.Companion.serializer().getDescriptor();

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        String g;
        kotlinx.serialization.json.b bVar;
        KSerializer kSerializer;
        kotlinx.serialization.json.b t = ncxVar.t();
        if (!(t instanceof c)) {
            return null;
        }
        c cVar = (c) t;
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) cVar.get("type");
        if (bVar2 == null || (g = qcx.g(qcx.n(bVar2))) == null || (bVar = (kotlinx.serialization.json.b) cVar.get("payload")) == null || (kSerializer = (KSerializer) this.a.get(g)) == null) {
            return null;
        }
        try {
            return new fo11(g, (go11) ncxVar.d().a(kSerializer, bVar));
        } catch (MissingFieldException e) {
            jst.e.k(e, String.format("Failed to parse typed screen '%s'", Arrays.copyOf(new Object[]{g}, 1)));
            return null;
        } catch (SerializationException e2) {
            jst.e.x(e2, String.format("Failed to parse typed screen '%s'", Arrays.copyOf(new Object[]{g}, 1)));
            return null;
        }
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        throw new SerializationException("TypedScreenAdapterSerializer does not support serialize");
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }
}
