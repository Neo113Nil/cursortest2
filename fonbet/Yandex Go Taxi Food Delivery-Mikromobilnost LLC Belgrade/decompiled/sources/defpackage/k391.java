package defpackage;

import android.app.PendingIntent;
import java.util.List;

/* loaded from: classes11.dex */
public final class k391 extends mvt0 {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final List f;
    public final List g;
    public final PendingIntent h;
    public final List i;

    public k391(int i, int i2, int i3, long j, long j2, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = list;
        this.g = list2;
        this.h = pendingIntent;
        this.i = list3;
    }

    @Override // defpackage.mvt0
    public final long a() {
        return this.d;
    }

    @Override // defpackage.mvt0
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mvt0)) {
            return false;
        }
        mvt0 mvt0Var = (mvt0) obj;
        if (this.a != mvt0Var.g() || this.b != mvt0Var.h() || this.c != mvt0Var.c() || this.d != mvt0Var.a() || this.e != mvt0Var.i()) {
            return false;
        }
        List list = this.f;
        if (list == null) {
            if (mvt0Var.k() != null) {
                return false;
            }
        } else if (!list.equals(mvt0Var.k())) {
            return false;
        }
        List list2 = this.g;
        if (list2 == null) {
            if (mvt0Var.j() != null) {
                return false;
            }
        } else if (!list2.equals(mvt0Var.j())) {
            return false;
        }
        PendingIntent pendingIntent = this.h;
        if (pendingIntent == null) {
            if (mvt0Var.f() != null) {
                return false;
            }
        } else if (!pendingIntent.equals(mvt0Var.f())) {
            return false;
        }
        List list3 = this.i;
        return list3 == null ? mvt0Var.l() == null : list3.equals(mvt0Var.l());
    }

    @Override // defpackage.mvt0
    public final PendingIntent f() {
        return this.h;
    }

    @Override // defpackage.mvt0
    public final int g() {
        return this.a;
    }

    @Override // defpackage.mvt0
    public final int h() {
        return this.b;
    }

    public final int hashCode() {
        int i = ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
        long j = this.d;
        long j2 = j ^ (j >>> 32);
        long j3 = this.e;
        long j4 = (j3 >>> 32) ^ j3;
        List list = this.f;
        int hashCode = ((((((i * 1000003) ^ ((int) j2)) * 1000003) ^ ((int) j4)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.g;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.h;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.i;
        return hashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // defpackage.mvt0
    public final long i() {
        return this.e;
    }

    @Override // defpackage.mvt0
    public final List j() {
        return this.g;
    }

    @Override // defpackage.mvt0
    public final List k() {
        return this.f;
    }

    @Override // defpackage.mvt0
    public final List l() {
        return this.i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.i);
        StringBuilder s = b64.s(this.a, this.b, "SplitInstallSessionState{sessionId=", ", status=", ", errorCode=");
        s.append(this.c);
        s.append(", bytesDownloaded=");
        s.append(this.d);
        x4e.A(this.e, ", totalBytesToDownload=", ", moduleNamesNullable=", s);
        g8e.D(s, valueOf, ", languagesNullable=", valueOf2, ", resolutionIntent=");
        return g8e.r(s, valueOf3, ", splitFileIntents=", valueOf4, "}");
    }
}
