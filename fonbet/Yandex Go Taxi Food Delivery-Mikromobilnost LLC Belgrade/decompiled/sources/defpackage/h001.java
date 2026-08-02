package defpackage;

import java.util.Date;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.net.tracker.models.TrackPoint$Remote$Source;

/* loaded from: classes6.dex */
public final class h001 implements j001 {
    public final zzs a;
    public final double b;
    public final Date c;
    public final Long d;
    public final TrackPoint$Remote$Source e;

    public h001(zzs zzsVar, double d, Date date, Long l, TrackPoint$Remote$Source trackPoint$Remote$Source) {
        this.a = zzsVar;
        this.b = d;
        this.c = date;
        this.d = l;
        this.e = trackPoint$Remote$Source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h001)) {
            return false;
        }
        h001 h001Var = (h001) obj;
        return jl40.l(this.a, h001Var.a) && Double.compare(this.b, h001Var.b) == 0 && jl40.l(this.c, h001Var.c) && jl40.l(this.d, h001Var.d) && this.e == h001Var.e;
    }

    @Override // defpackage.j001
    public final zzs getCoordinates() {
        return this.a;
    }

    @Override // defpackage.j001
    public final double getDirection() {
        return this.b;
    }

    @Override // defpackage.j001
    public final Date getTimestamp() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.a(this.a.hashCode() * 31, 31, this.b)) * 31;
        Long l = this.d;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        TrackPoint$Remote$Source trackPoint$Remote$Source = this.e;
        return hashCode2 + (trackPoint$Remote$Source != null ? trackPoint$Remote$Source.hashCode() : 0);
    }

    public final String toString() {
        return "Remote(coordinates=" + this.a + ", direction=" + this.b + ", timestamp=" + this.c + ", receivedTimestamp=" + this.d + ", source=" + this.e + Extension.C_BRAKE;
    }
}
