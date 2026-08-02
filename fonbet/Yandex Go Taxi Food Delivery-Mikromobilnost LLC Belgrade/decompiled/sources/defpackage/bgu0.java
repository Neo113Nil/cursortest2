package defpackage;

import com.yandex.go.address.models.Address;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class bgu0 extends zfu0 {
    public final Address a;
    public final String b;
    public final String c;
    public final String d;

    public bgu0(Address address) {
        this.a = address;
        this.b = null;
        this.c = q5z.K(address);
        this.d = null;
    }

    @Override // defpackage.zfu0
    public final void a(ArrayList arrayList) {
        arrayList.add(this.a);
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
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgu0)) {
            return false;
        }
        return jl40.l(this.a, ((bgu0) obj).a);
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
        return this.a.hashCode();
    }

    public bgu0(Address address, String str, String str2, String str3) {
        this.a = address;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }
}
