package defpackage;

import com.yandex.mapkit.geometry.Point;

/* loaded from: classes12.dex */
public final class ohn implements vj00 {
    public final String a;
    public final qhn b;
    public final String c;
    public final Point d;

    public ohn(String str, qhn qhnVar, String str2, Point point) {
        this.a = str;
        this.b = qhnVar;
        this.c = str2;
        this.d = point;
    }

    @Override // defpackage.vj00
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (ohn.class.equals(obj != null ? obj.getClass() : null)) {
            return this.a.equals(((ohn) obj).a);
        }
        return false;
    }

    @Override // defpackage.vj00
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
