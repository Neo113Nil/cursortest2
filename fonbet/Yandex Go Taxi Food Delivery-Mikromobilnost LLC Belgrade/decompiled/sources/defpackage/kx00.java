package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kx00 implements e6v {
    public final String a;
    public final ArrayList b;
    public final kl3 c;

    public kx00(String str, ArrayList arrayList, kl3 kl3Var) {
        this.a = str;
        this.b = arrayList;
        this.c = kl3Var;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (e6v e6vVar : this.b) {
            if (e6vVar instanceof ex00) {
                ex00 ex00Var = (ex00) e6vVar;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : ex00Var.i) {
                    if (obj instanceof yyr0) {
                        arrayList2.add(obj);
                    }
                }
                for (Object obj2 : ex00Var.j) {
                    if (obj2 instanceof yyr0) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList.addAll(arrayList2);
            } else if (e6vVar instanceof yyr0) {
                arrayList.add(e6vVar);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx00)) {
            return false;
        }
        kx00 kx00Var = (kx00) obj;
        return this.a.equals(kx00Var.a) && this.b.equals(kx00Var.b) && this.c.equals(kx00Var.c);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = x4e.m("MarketRecommendationsSectionModel(id=", this.a, ", marketRecommendations=", ", itemSize=", this.b);
        m.append(this.c);
        m.append(Extension.C_BRAKE);
        return m.toString();
    }
}
