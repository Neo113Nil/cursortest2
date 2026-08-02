package defpackage;

import com.yandex.delivery.mapper.model.PointType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kei {
    public static final kei e;
    public static final kei f;
    public final PointType a;
    public final oo0 b;
    public final s9e c;
    public final List d;

    static {
        PointType pointType = PointType.SOURCE;
        EmptyList emptyList = EmptyList.a;
        e = new kei(pointType, null, null, emptyList);
        f = new kei(PointType.DESTINATION, null, null, emptyList);
    }

    public kei(PointType pointType, oo0 oo0Var, s9e s9eVar, List list) {
        this.a = pointType;
        this.b = oo0Var;
        this.c = s9eVar;
        this.d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    public static kei a(kei keiVar, oo0 oo0Var, s9e s9eVar, ArrayList arrayList, int i) {
        PointType pointType = keiVar.a;
        if ((i & 2) != 0) {
            oo0Var = keiVar.b;
        }
        if ((i & 4) != 0) {
            s9eVar = keiVar.c;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            arrayList2 = keiVar.d;
        }
        keiVar.getClass();
        return new kei(pointType, oo0Var, s9eVar, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kei)) {
            return false;
        }
        kei keiVar = (kei) obj;
        return this.a == keiVar.a && jl40.l(this.b, keiVar.b) && jl40.l(this.c, keiVar.c) && this.d.equals(keiVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        oo0 oo0Var = this.b;
        int hashCode2 = (hashCode + (oo0Var == null ? 0 : oo0Var.hashCode())) * 31;
        s9e s9eVar = this.c;
        return this.d.hashCode() + ((hashCode2 + (s9eVar != null ? s9eVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DeliveryNddAddressPoint(type=" + this.a + ", address=" + this.b + ", contact=" + this.c + ", photoCommentItems=" + this.d + Extension.C_BRAKE;
    }
}
