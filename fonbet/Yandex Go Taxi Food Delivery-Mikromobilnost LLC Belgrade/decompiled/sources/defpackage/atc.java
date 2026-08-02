package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.promotions.model.Promotion;

@gsq0
/* loaded from: classes5.dex */
public final class atc {
    public static final zsc Companion = new zsc();
    public static final i3y[] e = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(24)), null, null};
    public final String a;
    public final Promotion.Type b;
    public final String c;
    public final String d;

    public /* synthetic */ atc(int i, String str, Promotion.Type type, String str2, String str3) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, ysc.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = type;
        this.c = str2;
        this.d = str3;
    }

    public static final /* synthetic */ void b(atc atcVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
        yjdVar.o(serialDescriptor, 0, atcVar.a);
        yjdVar.e(serialDescriptor, 1, (KSerializer) e[1].getValue(), atcVar.b);
        yjdVar.o(serialDescriptor, 2, atcVar.c);
        yjdVar.o(serialDescriptor, 3, atcVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atc)) {
            return false;
        }
        atc atcVar = (atc) obj;
        return jl40.l(this.a, atcVar.a) && this.b == atcVar.b && jl40.l(this.c, atcVar.c) && jl40.l(this.d, atcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunicationSeenEvent(communicationId=");
        sb.append(this.a);
        sb.append(", communicationType=");
        sb.append(this.b);
        sb.append(", screen=");
        return g8e.r(sb, this.c, ", utcEventDttm=", this.d, Extension.C_BRAKE);
    }

    public atc(String str, Promotion.Type type, String str2, String str3) {
        this.a = str;
        this.b = type;
        this.c = str2;
        this.d = str3;
    }
}
