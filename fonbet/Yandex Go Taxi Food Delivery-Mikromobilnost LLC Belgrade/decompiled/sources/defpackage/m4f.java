package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m4f {
    public final String a;
    public final UUID b;
    public final String c;
    public final k6i d;
    public final List e;
    public final n4f f;
    public final List g;
    public final l6i h;
    public final doe i;

    public m4f(String str, UUID uuid, String str2, k6i k6iVar, List list, n4f n4fVar, ArrayList arrayList, l6i l6iVar, doe doeVar) {
        this.a = str;
        this.b = uuid;
        this.c = str2;
        this.d = k6iVar;
        this.e = list;
        this.f = n4fVar;
        this.g = arrayList;
        this.h = l6iVar;
        this.i = doeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4f)) {
            return false;
        }
        m4f m4fVar = (m4f) obj;
        return jl40.l(this.a, m4fVar.a) && jl40.l(this.b, m4fVar.b) && jl40.l(this.c, m4fVar.c) && jl40.l(this.d, m4fVar.d) && jl40.l(this.e, m4fVar.e) && jl40.l(this.f, m4fVar.f) && jl40.l(this.g, m4fVar.g) && jl40.l(this.h, m4fVar.h) && this.i.equals(m4fVar.i);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + unr0.c((this.d.hashCode() + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31, this.e)) * 31;
        List list = this.g;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 961;
        l6i l6iVar = this.h;
        return this.i.hashCode() + ((hashCode2 + (l6iVar != null ? l6iVar.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DraftSnapshot(offerId=" + this.a + ", localUUID=" + this.b + ", comment=" + this.c + ", srcPoint=" + this.d + ", dstPoints=" + this.e + ", paymentInfoSnapshot=" + this.f + ", costCenters=" + this.g + ", paymentPointId=null, fallbackData=" + this.h + ", userCurrentLocation=" + this.i + Extension.C_BRAKE;
    }
}
