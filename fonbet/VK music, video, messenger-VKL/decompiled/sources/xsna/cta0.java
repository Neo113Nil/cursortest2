package xsna;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;

/* compiled from: PlannedExerciseSessionRecord.kt */
/* loaded from: classes12.dex */
public final class cta0 implements oox {
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final hi20 e;
    public final boolean f;
    public final int g;
    public final String h;
    public final ArrayList i;
    public final String j;
    public final String k;

    public cta0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, hi20 hi20Var, boolean z, int i, String str, ArrayList arrayList, String str2, String str3) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = hi20Var;
        this.f = z;
        this.g = i;
        this.h = str;
        this.i = arrayList;
        this.j = str2;
        this.k = str3;
        if (!instant.isBefore(instant2)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // xsna.oox
    public final Instant a() {
        return this.a;
    }

    @Override // xsna.oox
    public final Instant b() {
        return this.c;
    }

    @Override // xsna.oox
    public final ZoneOffset c() {
        return this.d;
    }

    @Override // xsna.oox
    public final ZoneOffset d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cta0)) {
            return false;
        }
        cta0 cta0Var = (cta0) obj;
        return epx.f(this.a, cta0Var.a) && epx.f(this.b, cta0Var.b) && epx.f(this.c, cta0Var.c) && epx.f(this.d, cta0Var.d) && this.f == cta0Var.f && this.i.equals(cta0Var.i) && epx.f(this.j, cta0Var.j) && epx.f(this.k, cta0Var.k) && this.g == cta0Var.g && this.e.equals(cta0Var.e);
    }

    @Override // xsna.zef0
    public final hi20 getMetadata() {
        throw null;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZoneOffset zoneOffset = this.b;
        int c = w11.c(this.c, (hashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        int a = qr.a(this.i, qoy.b((c + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.f), 31);
        String str = this.j;
        int hashCode2 = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.k;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.g) * 31;
        String str3 = this.h;
        return this.e.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlannedExerciseSessionRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", hasExplicitTime=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.j);
        sb.append(", notes=");
        sb.append(this.k);
        sb.append(", exerciseType=");
        sb.append(this.g);
        sb.append(", completedExerciseSessionId=");
        sb.append(this.h);
        sb.append(", metadata=");
        sb.append(this.e);
        sb.append(", blocks=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.i);
    }
}
