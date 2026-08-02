package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.suggest.DestinationSuggest;
import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

/* loaded from: classes12.dex */
public final class j0j extends vfx {
    public static final j0j a = new j0j();
    public static final s43 b = new s43(Address.Companion.serializer().getDescriptor(), 1);

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        a l = qcx.l(ncxVar.t());
        ListBuilder a2 = rcc.a();
        Iterator it = l.a.iterator();
        while (it.hasNext()) {
            c m = qcx.m((b) it.next());
            b bVar = (b) m.get("place_type");
            if (bVar != null && !bVar.equals(JsonNull.INSTANCE)) {
                a.getClass();
                if (!m.containsKey(IssuingDistributionPointExtension.POINT) && !m.containsKey("geopoint")) {
                    b bVar2 = (b) m.get("address");
                    c m2 = bVar2 != null ? qcx.m(bVar2) : null;
                    if (m2 != null) {
                        if (!m2.containsKey(IssuingDistributionPointExtension.POINT) && !m2.containsKey("geopoint")) {
                        }
                    }
                }
            }
            a2.add(ncxVar.d().a(Address.Companion.serializer(), m));
        }
        return new k0j(a2.j());
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        KSerializer serializer = Address.Companion.serializer();
        s43 s43Var = b;
        yjd b2 = vcxVar.b(s43Var);
        int i = 0;
        for (DestinationSuggest destinationSuggest : ((k0j) obj).a) {
            if (destinationSuggest instanceof Address) {
                a.getClass();
                b2.e(s43Var, i, serializer, destinationSuggest);
                i++;
            }
        }
        b2.c(s43Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }
}
