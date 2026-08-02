package defpackage;

import com.yandex.go.address.models.Address;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class cgu0 extends zfu0 {
    public final Address a;
    public final String b;
    public final String c;
    public final String d;

    public cgu0(Address address, String str) {
        this.a = address;
        this.b = str;
        this.c = q5z.K(address);
        this.d = str;
    }

    @Override // defpackage.zfu0
    public final void a(ArrayList arrayList) {
    }

    @Override // defpackage.zfu0
    public final Address b() {
        return this.a;
    }

    @Override // defpackage.zfu0
    public final boolean c() {
        return false;
    }

    @Override // defpackage.zfu0
    public final boolean d() {
        return false;
    }

    @Override // defpackage.zfu0
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cgu0);
    }

    @Override // defpackage.zfu0
    public final String f() {
        return this.b;
    }

    @Override // defpackage.zfu0
    public final String g() {
        return this.d;
    }

    @Override // defpackage.zfu0
    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        return cgu0.class.hashCode();
    }
}
