package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lo9i;", "", "Companion", "m9i", "n9i", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class o9i {
    public static final n9i Companion = new n9i();
    public final boolean a;
    public final boolean b;
    public final Integer c;
    public final z4w d;
    public final String e;
    public final Boolean f;
    public final Boolean g;

    public /* synthetic */ o9i(int i, boolean z, boolean z2, Integer num, z4w z4wVar, String str, Boolean bool, Boolean bool2) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = z4wVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9i)) {
            return false;
        }
        o9i o9iVar = (o9i) obj;
        return this.a == o9iVar.a && this.b == o9iVar.b && jl40.l(this.c, o9iVar.c) && jl40.l(this.d, o9iVar.d) && jl40.l(this.e, o9iVar.e) && jl40.l(this.f, o9iVar.f) && jl40.l(this.g, o9iVar.g);
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (e + (num == null ? 0 : num.hashCode())) * 31;
        z4w z4wVar = this.d;
        int hashCode2 = (hashCode + (z4wVar == null ? 0 : z4wVar.hashCode())) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.g;
        return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = qv10.u("DeliveryExtraDto(isBusinessAccountEnabled=", ", includesDeliveryIntervals=", ", rentalDuration=", this.a, this.b);
        u.append(this.c);
        u.append(", insurance=");
        u.append(this.d);
        u.append(", marketplaceChatId=");
        tse0.A(u, this.e, ", doorToDoor=", this.f, ", payOnDelivery=");
        return nzs.d(u, this.g, Extension.C_BRAKE);
    }

    public o9i(boolean z, boolean z2, Integer num, z4w z4wVar, String str, Boolean bool, Boolean bool2) {
        this.a = z;
        this.b = z2;
        this.c = num;
        this.d = z4wVar;
        this.e = str;
        this.f = bool;
        this.g = bool2;
    }

    public o9i() {
        this(false, false, null, null, null, null, null);
    }
}
