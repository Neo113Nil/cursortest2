package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.shortcuts.dto.response.ProductsScreenResponse;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hzs implements dzs {
    public static final hzs f = new hzs(null, 31);
    public static final hzs g;
    public static final hzs h;
    public final Address a;
    public final ProductsScreenResponse b;
    public final yaf0 c;
    public final zzs d;
    public final f1z e;

    static {
        int i = 15;
        g = new hzs(e1z.a, i);
        h = new hzs(c1z.a, i);
    }

    public /* synthetic */ hzs(f1z f1zVar, int i) {
        this(null, ProductsScreenResponse.i, null, zzs.f, (i & 16) != 0 ? e1z.a : f1zVar);
    }

    @Override // defpackage.dzs
    public final yaf0 a() {
        return this.c;
    }

    @Override // defpackage.dzs
    public final r9f0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzs)) {
            return false;
        }
        hzs hzsVar = (hzs) obj;
        return jl40.l(this.a, hzsVar.a) && jl40.l(this.b, hzsVar.b) && jl40.l(this.c, hzsVar.c) && jl40.l(this.d, hzsVar.d) && jl40.l(this.e, hzsVar.e);
    }

    public final int hashCode() {
        Address address = this.a;
        int hashCode = (this.b.hashCode() + ((address == null ? 0 : address.hashCode()) * 31)) * 31;
        yaf0 yaf0Var = this.c;
        return this.e.hashCode() + nnm.b(this.d, (hashCode + (yaf0Var != null ? yaf0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "GeoDependentScreenProducts(address=" + this.a + ", productsResponse=" + this.b + ", screenType=" + this.c + ", taxiSrcPoint=" + this.d + ", loadingState=" + this.e + Extension.C_BRAKE;
    }

    public hzs(Address address, ProductsScreenResponse productsScreenResponse, yaf0 yaf0Var, zzs zzsVar, f1z f1zVar) {
        this.a = address;
        this.b = productsScreenResponse;
        this.c = yaf0Var;
        this.d = zzsVar;
        this.e = f1zVar;
    }

    public hzs() {
        this(null, 31);
    }
}
