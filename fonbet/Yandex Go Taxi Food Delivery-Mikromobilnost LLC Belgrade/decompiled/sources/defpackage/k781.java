package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class k781 implements ri81 {
    public final String A;
    public final int B;
    public final String C;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList w;
    public final hn71 x;
    public final String y;
    public final mf1 z;

    public k781(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, hn71 hn71Var, String str, mf1 mf1Var, String str2, int i, String str3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.w = arrayList4;
        this.x = hn71Var;
        this.y = str;
        this.z = mf1Var;
        this.A = str2;
        this.B = i;
        this.C = str3;
    }

    @Override // defpackage.ri81
    public final Map a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            tz61 tz61Var = (tz61) it.next();
            String str = tz61Var.a;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = qv10.w(str, linkedHashMap);
            }
            ((List) obj).add(tz61Var.b);
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k781)) {
            return false;
        }
        k781 k781Var = (k781) obj;
        return this.a.equals(k781Var.a) && this.b.equals(k781Var.b) && this.c.equals(k781Var.c) && this.w.equals(k781Var.w) && jl40.l(this.x, k781Var.x) && jl40.l(this.y, k781Var.y) && jl40.l(this.z, k781Var.z) && jl40.l(this.A, k781Var.A) && this.B == k781Var.B && jl40.l(this.C, k781Var.C);
    }

    public final int hashCode() {
        int b = ly3.b(ly3.b(ly3.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.w);
        hn71 hn71Var = this.x;
        int hashCode = (b + (hn71Var == null ? 0 : hn71Var.hashCode())) * 31;
        String str = this.y;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        mf1 mf1Var = this.z;
        int hashCode3 = (hashCode2 + (mf1Var == null ? 0 : mf1Var.hashCode())) * 31;
        String str2 = this.A;
        int b2 = fia1.b(this.B, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.C;
        return b2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Creative(mediaFiles=");
        sb.append(this.a);
        sb.append(", interactiveCreativeFiles=");
        sb.append(this.b);
        sb.append(", icons=");
        sb.append(this.c);
        sb.append(", trackingEventsList=");
        sb.append(this.w);
        sb.append(", creativeExtensions=");
        sb.append(this.x);
        sb.append(", clickThroughUrl=");
        sb.append(this.y);
        sb.append(", skipOffset=");
        sb.append(this.z);
        sb.append(", id=");
        sb.append(this.A);
        sb.append(", durationMillis=");
        return xvz.h(this.B, ", adParameters=", this.C, Extension.C_BRAKE, sb);
    }
}
