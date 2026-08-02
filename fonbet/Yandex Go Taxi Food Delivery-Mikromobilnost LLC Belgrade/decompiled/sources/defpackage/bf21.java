package defpackage;

import com.yandex.urbanads.UrbanAdsCreativeParams$Format;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class bf21 {
    public static final ze21 Companion = new ze21();
    public static final i3y[] h;
    public final UrbanAdsCreativeParams$Format a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Map f;
    public final boolean g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{a.b(lazyThreadSafetyMode, new z121(15)), null, null, null, null, a.b(lazyThreadSafetyMode, new z121(16)), null};
    }

    public /* synthetic */ bf21(int i, UrbanAdsCreativeParams$Format urbanAdsCreativeParams$Format, String str, Integer num, Integer num2, Integer num3, Map map, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ye21.a.getDescriptor());
            throw null;
        }
        this.a = urbanAdsCreativeParams$Format;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = map;
        }
        if ((i & 64) == 0) {
            this.g = true;
        } else {
            this.g = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf21)) {
            return false;
        }
        bf21 bf21Var = (bf21) obj;
        return this.a == bf21Var.a && jl40.l(this.b, bf21Var.b) && jl40.l(this.c, bf21Var.c) && jl40.l(this.d, bf21Var.d) && jl40.l(this.e, bf21Var.e) && jl40.l(this.f, bf21Var.f) && this.g == bf21Var.g;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Map map = this.f;
        return Boolean.hashCode(this.g) + ((hashCode3 + (map != null ? map.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UrbanAdsCreativeParams(format=");
        sb.append(this.a);
        sb.append(", page=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(this.c);
        sb.append(", row=");
        sb.append(this.d);
        sb.append(", column=");
        sb.append(this.e);
        sb.append(", overrides=");
        sb.append(this.f);
        sb.append(", animateChanges=");
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }

    public bf21(UrbanAdsCreativeParams$Format urbanAdsCreativeParams$Format, String str, LinkedHashMap linkedHashMap) {
        this.a = urbanAdsCreativeParams$Format;
        this.b = str;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = linkedHashMap;
        this.g = true;
    }
}
