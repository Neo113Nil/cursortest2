package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.shortcuts.dto.response.ProductsResponse;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ezs implements dzs {
    public static final ezs f;
    public static final ezs g;
    public static final ezs h = new ezs(15);
    public final Address a;
    public final ProductsResponse b;
    public final yaf0 c;
    public final zzs d;
    public final f1z e;

    static {
        int i = 31;
        f = new ezs(i);
        g = new ezs(i);
    }

    public /* synthetic */ ezs(int i) {
        this(null, ProductsResponse.h, null, zzs.f, (i & 16) != 0 ? e1z.a : c1z.a);
    }

    @Override // defpackage.dzs
    public final yaf0 a() {
        return this.c;
    }

    @Override // defpackage.dzs
    public final r9f0 b() {
        return this.b;
    }

    public final ProductsResponse c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezs)) {
            return false;
        }
        ezs ezsVar = (ezs) obj;
        return jl40.l(this.a, ezsVar.a) && jl40.l(this.b, ezsVar.b) && jl40.l(this.c, ezsVar.c) && jl40.l(this.d, ezsVar.d) && jl40.l(this.e, ezsVar.e);
    }

    public final int hashCode() {
        Address address = this.a;
        int hashCode = (this.b.hashCode() + ((address == null ? 0 : address.hashCode()) * 31)) * 31;
        yaf0 yaf0Var = this.c;
        return this.e.hashCode() + nnm.b(this.d, (hashCode + (yaf0Var != null ? yaf0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "GeoDependentProducts(address=" + this.a + ", productsResponse=" + this.b + ", screenType=" + this.c + ", taxiSrcPoint=" + this.d + ", loadingState=" + this.e + Extension.C_BRAKE;
    }

    public ezs(Address address, ProductsResponse productsResponse, yaf0 yaf0Var, zzs zzsVar, f1z f1zVar) {
        this.a = address;
        this.b = productsResponse;
        this.c = yaf0Var;
        this.d = zzsVar;
        this.e = f1zVar;
    }

    public ezs() {
        this(31);
    }
}
