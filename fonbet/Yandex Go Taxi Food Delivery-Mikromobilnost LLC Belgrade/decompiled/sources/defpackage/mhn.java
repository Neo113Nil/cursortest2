package defpackage;

import com.yandex.mapkit.geometry.Point;

/* loaded from: classes12.dex */
public final class mhn implements vj00 {
    public final String a;
    public final qhn b;
    public final String c;
    public final Point d;
    public final qhn e;
    public final lhn f;

    public mhn(String str, qhn qhnVar, String str2, Point point, qhn qhnVar2, lhn lhnVar) {
        this.a = str;
        this.b = qhnVar;
        this.c = str2;
        this.d = point;
        this.e = qhnVar2;
        this.f = lhnVar;
    }

    @Override // defpackage.vj00
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (mhn.class.equals(obj != null ? obj.getClass() : null)) {
            return jl40.l(this.a, ((mhn) obj).a);
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
