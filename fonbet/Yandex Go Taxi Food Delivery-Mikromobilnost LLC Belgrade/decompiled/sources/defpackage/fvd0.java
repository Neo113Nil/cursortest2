package defpackage;

import com.yandex.go.address.models.Address;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.video.m3.player.impl.tracking.StrmManagerImplKt;

/* loaded from: classes6.dex */
public final class fvd0 {
    public final String a;
    public final zzs b;
    public final String c;
    public final int d;
    public final String e;
    public final Address f;
    public final String g;

    public fvd0(String str, zzs zzsVar, String str2, int i, String str3, Address address, String str4) {
        this.a = str;
        this.b = zzsVar;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = address;
        this.g = str4;
    }

    public final Map a() {
        HashMap hashMap = new HashMap();
        String str = this.c;
        if (str != null) {
            hashMap.put("method", str);
        }
        int i = this.d;
        if (i != -1) {
            hashMap.put(StrmManagerImplKt.QUERY_PARAMETER_SOURCE_INDEX, Integer.valueOf(i));
        }
        String str2 = this.e;
        if (str2 != null) {
            Address address = this.f;
            if (address == null) {
                hashMap.put("action", str2);
            } else {
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                HashMap hashMap4 = new HashMap();
                HashMap hashMap5 = new HashMap();
                hashMap5.put("coordinate", vng.n(address.B()));
                hashMap4.put(address.getPickMethod(), hashMap5);
                hashMap3.put("originalAddress", hashMap4);
                hashMap2.put(str2, hashMap3);
                hashMap.put("action", hashMap2);
            }
        }
        zzs zzsVar = this.b;
        hashMap.put("coordinate", zzsVar == null ? null : vng.n(zzsVar));
        String str3 = this.g;
        if (str3 != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, str3);
        }
        return Collections.singletonMap(this.a, hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvd0)) {
            return false;
        }
        fvd0 fvd0Var = (fvd0) obj;
        return this.a.equals(fvd0Var.a) && jl40.l(this.b, fvd0Var.b) && jl40.l(this.c, fvd0Var.c) && this.d == fvd0Var.d && jl40.l(this.e, fvd0Var.e) && jl40.l(this.f, fvd0Var.f) && jl40.l(this.g, fvd0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zzs zzsVar = this.b;
        int hashCode2 = (hashCode + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31;
        String str = this.c;
        int b = oyr.b(this.d, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.e;
        int hashCode3 = (b + (str2 == null ? 0 : str2.hashCode())) * 961;
        Address address = this.f;
        int hashCode4 = (hashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        String str3 = this.g;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointSuggestAttribute(methodName=");
        sb.append(this.a);
        sb.append(", point=");
        sb.append(this.b);
        sb.append(", methodAlgorithm=");
        b64.A(this.d, this.c, ", position=", ", methodAction=", sb);
        sb.append(this.e);
        sb.append(", myLocation=null, originalAddress=");
        sb.append(this.f);
        sb.append(", screen=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
