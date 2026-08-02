package defpackage;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.dto.response.nestedbutton.NestedButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public final class lsy implements ga5 {
    public final String a;
    public final ea5 b;
    public final tbu c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final ProductMode$Taxi.SectionType i;
    public final NestedButton j;
    public final sl4 k;
    public final ArrayList l;

    public lsy(String str, ea5 ea5Var, tbu tbuVar, String str2, String str3, String str4, boolean z, boolean z2, ProductMode$Taxi.SectionType sectionType) {
        this.a = str;
        this.b = ea5Var;
        this.c = tbuVar;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = z2;
        this.i = sectionType;
        this.j = (NestedButton) a.R(ea5Var.p);
        List list = ea5Var.l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof sl4) {
                arrayList.add(obj);
            }
        }
        this.k = (sl4) a.R(arrayList);
        List list2 = this.b.l;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof tl4) {
                arrayList2.add(obj2);
            }
        }
        this.l = arrayList2;
    }

    public static lsy v(lsy lsyVar, String str, String str2, boolean z, boolean z2, ProductMode$Taxi.SectionType sectionType, int i) {
        if ((i & 1) != 0) {
            str = lsyVar.a;
        }
        String str3 = str;
        ea5 ea5Var = lsyVar.b;
        tbu tbuVar = lsyVar.c;
        String str4 = lsyVar.d;
        String str5 = lsyVar.e;
        if ((i & 32) != 0) {
            str2 = lsyVar.f;
        }
        return new lsy(str3, ea5Var, tbuVar, str4, str5, str2, (i & 64) != 0 ? lsyVar.g : z, (i & 128) != 0 ? lsyVar.h : z2, (i & 256) != 0 ? lsyVar.i : sectionType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsy)) {
            return false;
        }
        lsy lsyVar = (lsy) obj;
        return jl40.l(this.a, lsyVar.a) && this.b.equals(lsyVar.b) && this.c.equals(lsyVar.c) && jl40.l(this.d, lsyVar.d) && jl40.l(this.e, lsyVar.e) && jl40.l(this.f, lsyVar.f) && this.g == lsyVar.g && this.h == lsyVar.h && this.i == lsyVar.i;
    }

    @Override // defpackage.ga5
    public final ea5 getBase() {
        return this.b;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int e = unr0.e(unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h);
        ProductMode$Taxi.SectionType sectionType = this.i;
        return e + (sectionType != null ? sectionType.hashCode() : 0);
    }

    @Override // defpackage.ga5
    public final ga5 r(boolean z, ProductMode$Taxi.SectionType sectionType) {
        return v(this, this.a, null, false, z, sectionType, HProv.PP_DELETE_SAVED_PASSWD);
    }

    @Override // defpackage.ga5
    public final boolean t() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListItemShortcutModel(id=");
        sb.append(this.a);
        sb.append(", base=");
        sb.append(this.b);
        sb.append(", service=");
        sb.append(this.c);
        sb.append(", iconTag=");
        sb.append(this.d);
        sb.append(", iconBackground=");
        g8e.D(sb, this.e, ", trailText=", this.f, ", hideDivider=");
        nnm.v(", useNavWidth=", ", sectionType=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public final tbu w() {
        return this.c;
    }
}
