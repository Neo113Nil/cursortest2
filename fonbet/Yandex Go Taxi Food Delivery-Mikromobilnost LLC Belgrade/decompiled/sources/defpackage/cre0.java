package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes6.dex */
public final class cre0 {
    public String a;
    public ZoneAddress b;
    public Address c;
    public Calendar d;
    public String e;
    public String f;
    public boolean g;
    public String h;
    public Integer i;
    public List j;
    public String k;

    public final dre0 a() {
        String str = this.a;
        ZoneAddress zoneAddress = this.b;
        if (zoneAddress == null) {
            ny61.g("sourceAddress cannot be null");
            return null;
        }
        Address address = this.c;
        Calendar calendar = this.d;
        Integer num = this.i;
        String str2 = this.e;
        String str3 = this.f;
        boolean z = this.g;
        String str4 = this.h;
        if (str4 != null) {
            return new dre0(str, zoneAddress, address, calendar, num, str2, str3, z, str4, this.j, this.k);
        }
        ny61.g("reason cannot be null");
        return null;
    }

    public final void b(Address address) {
        this.c = address;
    }

    public final void c(boolean z) {
        this.g = z;
    }

    public final void d() {
        this.h = "show summary from order";
    }

    public final void e(String str) {
        this.a = str;
    }

    public final void f(ZoneAddress zoneAddress) {
        this.b = zoneAddress;
    }
}
