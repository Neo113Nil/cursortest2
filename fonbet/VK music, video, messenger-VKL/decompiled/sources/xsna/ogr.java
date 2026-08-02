package xsna;

import com.vk.ecomm.storefrontservices.impl.presentation.feature.ServicesSort;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.tlo0;

/* compiled from: StorefrontServicesViewState.kt */
/* loaded from: classes18.dex */
public final class ogr {
    public final ServicesSort a;
    public final tlo0.g b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final Map f;

    public ogr(ServicesSort servicesSort, tlo0.g gVar, Integer num, Integer num2, String str, LinkedHashMap linkedHashMap) {
        this.a = servicesSort;
        this.b = gVar;
        this.c = num;
        this.d = num2;
        this.e = str;
        this.f = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof ogr) {
                ogr ogrVar = (ogr) obj;
                if (this.a == ogrVar.a && this.b.equals(ogrVar.b) && epx.f(this.c, ogrVar.c) && epx.f(this.d, ogrVar.d) && epx.f(this.e, ogrVar.e)) {
                    Map map = ogrVar.f;
                    Map map2 = this.f;
                    if (map2 == null) {
                        if (map == null) {
                            equals = true;
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (map != null) {
                            equals = map2.equals(map);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FiltersViewState(sort=");
        sb.append(this.a);
        sb.append(", priceTitle=");
        sb.append(this.b);
        sb.append(", fromPrice=");
        sb.append(this.c);
        sb.append(", toPrice=");
        sb.append(this.d);
        sb.append(", sectionId=");
        sb.append(this.e);
        sb.append(", sectionsIdTitle=");
        Map map = this.f;
        return tq.f(sb, map == null ? "null" : bpw.a(map), ')');
    }
}
