package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0(with = a.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhgh;", "", "Companion", "a", "ggh", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class hgh {
    public static final ggh Companion = new ggh();
    public final List a;

    public static final class a extends vfx {
        public final pf70 a = pf70.a;
        public final SerialDescriptor b = b.Companion.serializer().getDescriptor();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vfx
        public final Object a(ncx ncxVar) {
            ArrayList arrayList = new ArrayList();
            hgh hghVar = new hgh(arrayList);
            b t = ncxVar.t();
            boolean z = t instanceof kotlinx.serialization.json.a;
            pf70 pf70Var = this.a;
            if (z) {
                for (b bVar : (Iterable) t) {
                    pf70Var.getClass();
                    rf70 c = pf70.c(bVar);
                    if (c != null) {
                        arrayList.add(c);
                    }
                }
            } else {
                if (!(t instanceof d)) {
                    g8e.A(jst.e, "Unexpected json token for 'default' field");
                    return hghVar;
                }
                pf70Var.getClass();
                rf70 c2 = pf70.c(t);
                if (c2 != null) {
                    arrayList.add(c2);
                }
            }
            return hghVar;
        }

        @Override // defpackage.vfx
        public final void b(vcx vcxVar, Object obj) {
            throw new SerializationException("DefaultOptionValuesDto does not support serialization");
        }

        @Override // defpackage.myi
        public final SerialDescriptor getDescriptor() {
            return this.b;
        }
    }

    public hgh(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgh) && jl40.l(this.a, ((hgh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("DefaultOptionValuesDto(values=", Extension.C_BRAKE, this.a);
    }

    public hgh() {
        this(0);
    }

    public /* synthetic */ hgh(int i) {
        this(EmptyList.a);
    }
}
