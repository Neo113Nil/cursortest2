package defpackage;

import com.yandex.delivery.mapper.model.PointType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class aki implements bki {
    public final PointType a;
    public final doe b;
    public final boolean c;
    public final mm91 d;

    public aki(PointType pointType, doe doeVar, boolean z, mm91 mm91Var) {
        this.a = pointType;
        this.b = doeVar;
        this.c = z;
        this.d = mm91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aki)) {
            return false;
        }
        aki akiVar = (aki) obj;
        return this.a == akiVar.a && this.b.equals(akiVar.b) && this.c == akiVar.c && this.d.equals(akiVar.d);
    }

    @Override // defpackage.bki
    public final doe getCoordinates() {
        return this.b;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    @Override // defpackage.bki
    public final boolean isActive() {
        return this.c;
    }

    public final String toString() {
        return "OrderPoint(type=" + this.a + ", coordinates=" + this.b + ", isActive=" + this.c + ", pinModel=" + this.d + Extension.C_BRAKE;
    }
}
