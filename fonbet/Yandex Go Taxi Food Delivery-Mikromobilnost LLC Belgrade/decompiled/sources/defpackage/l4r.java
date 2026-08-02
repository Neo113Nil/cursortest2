package defpackage;

import com.ybsdk.feature.pfm.internal.domain.entities.FilterInnerContentEntity$Date$SelectionMode;
import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class l4r implements s4r {
    public final ycb0 a;
    public final String b;
    public final Calendar c;
    public final FilterInnerContentEntity$Date$SelectionMode d;
    public final String e;
    public final Calendar f;
    public final Calendar g;
    public final boolean h;

    public l4r(ycb0 ycb0Var, String str, Calendar calendar, FilterInnerContentEntity$Date$SelectionMode filterInnerContentEntity$Date$SelectionMode, String str2, Calendar calendar2, Calendar calendar3, boolean z) {
        this.a = ycb0Var;
        this.b = str;
        this.c = calendar;
        this.d = filterInnerContentEntity$Date$SelectionMode;
        this.e = str2;
        this.f = calendar2;
        this.g = calendar3;
        this.h = z;
    }

    public static l4r a(l4r l4rVar, FilterInnerContentEntity$Date$SelectionMode filterInnerContentEntity$Date$SelectionMode, Calendar calendar, Calendar calendar2, int i) {
        ycb0 ycb0Var = l4rVar.a;
        String str = l4rVar.b;
        Calendar calendar3 = l4rVar.c;
        if ((i & 8) != 0) {
            filterInnerContentEntity$Date$SelectionMode = l4rVar.d;
        }
        String str2 = l4rVar.e;
        boolean z = l4rVar.h;
        l4rVar.getClass();
        return new l4r(ycb0Var, str, calendar3, filterInnerContentEntity$Date$SelectionMode, str2, calendar, calendar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4r)) {
            return false;
        }
        l4r l4rVar = (l4r) obj;
        return this.a.equals(l4rVar.a) && this.b.equals(l4rVar.b) && this.c.equals(l4rVar.c) && this.d == l4rVar.d && this.e.equals(l4rVar.e) && jl40.l(this.f, l4rVar.f) && jl40.l(this.g, l4rVar.g) && this.h == l4rVar.h;
    }

    public final int hashCode() {
        int b = unr0.b((this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
        Calendar calendar = this.f;
        int hashCode = (b + (calendar == null ? 0 : calendar.hashCode())) * 31;
        Calendar calendar2 = this.g;
        return Boolean.hashCode(this.h) + ((hashCode + (calendar2 != null ? calendar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Date(sheetTitle=" + this.a + ", associatedFilterId=" + tab0.a(this.b) + ", firstAvailableDate=" + this.c + ", selectionMode=" + this.d + ", fallbackSectionKey=" + rcb0.a(this.e) + ", startDate=" + this.f + ", endDate=" + this.g + ", isSelected=" + this.h + Extension.C_BRAKE;
    }
}
