package defpackage;

import android.graphics.PointF;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.collider.PinCollider$PlacedLabel;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

/* loaded from: classes7.dex */
public final class jvb0 {
    public final qzb0 a;
    public final Map b;
    public final Map c;
    public final boolean d;
    public final PointF e;
    public PinCollider$PlacedLabel f;
    public c3c0 g;
    public final nub0 h;

    public jvb0(qzb0 qzb0Var, Map map, Map map2, boolean z, PointF pointF, PinCollider$PlacedLabel pinCollider$PlacedLabel, c3c0 c3c0Var, nub0 nub0Var) {
        this.a = qzb0Var;
        this.b = map;
        this.c = map2;
        this.d = z;
        this.e = pointF;
        this.f = pinCollider$PlacedLabel;
        this.g = c3c0Var;
        this.h = nub0Var;
    }

    public final PointF a(PlacemarkType placemarkType, c3c0 c3c0Var) {
        Map map = this.c;
        Object obj = map.get(placemarkType);
        if (obj == null) {
            obj = new LinkedHashMap();
            map.put(placemarkType, obj);
        }
        Map map2 = (Map) obj;
        Object obj2 = map2.get(c3c0Var);
        if (obj2 == null) {
            obj2 = this.h.a(this.a.a, placemarkType, c3c0Var);
            map2.put(c3c0Var, obj2);
        }
        return (PointF) obj2;
    }

    public final i2c0 b(PlacemarkType placemarkType, c3c0 c3c0Var) {
        Map map = this.b;
        Object obj = map.get(placemarkType);
        if (obj == null) {
            obj = new LinkedHashMap();
            map.put(placemarkType, obj);
        }
        Map map2 = (Map) obj;
        Object obj2 = map2.get(c3c0Var);
        if (obj2 == null) {
            obj2 = this.h.c(this.a.a, placemarkType, c3c0Var);
            map2.put(c3c0Var, obj2);
        }
        return (i2c0) obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvb0)) {
            return false;
        }
        jvb0 jvb0Var = (jvb0) obj;
        return jl40.l(this.a, jvb0Var.a) && this.b.equals(jvb0Var.b) && this.c.equals(jvb0Var.c) && this.d == jvb0Var.d && this.e.equals(jvb0Var.e) && this.f == jvb0Var.f && jl40.l(this.g, jvb0Var.g) && this.h.equals(jvb0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + unr0.e(unr0.d(unr0.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31;
        c3c0 c3c0Var = this.g;
        return this.h.hashCode() + ((hashCode + (c3c0Var == null ? 0 : c3c0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Descriptor(seed=" + this.a + ", sizes=" + this.b + ", anchors=" + this.c + ", wantsLabelM=" + this.d + ", screenPoint=" + this.e + ", placedLabel=" + this.f + ", variation=" + this.g + ", assets=" + this.h + Extension.C_BRAKE;
    }
}
