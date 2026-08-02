package xsna;

import android.app.PendingIntent;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class gtz0 extends olk0 {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final List f;
    public final List g;
    public final PendingIntent h;
    public final List i;

    public gtz0(int i, int i2, int i3, long j, long j2, @Nullable List list, @Nullable List list2, @Nullable PendingIntent pendingIntent, @Nullable List list3) {
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

    @Override // xsna.olk0
    public final long a() {
        return this.d;
    }

    @Override // xsna.olk0
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof olk0)) {
            return false;
        }
        olk0 olk0Var = (olk0) obj;
        if (this.a != olk0Var.g() || this.b != olk0Var.h() || this.c != olk0Var.c() || this.d != olk0Var.a() || this.e != olk0Var.i()) {
            return false;
        }
        List list = this.f;
        if (list == null) {
            if (olk0Var.k() != null) {
                return false;
            }
        } else if (!list.equals(olk0Var.k())) {
            return false;
        }
        List list2 = this.g;
        if (list2 == null) {
            if (olk0Var.j() != null) {
                return false;
            }
        } else if (!list2.equals(olk0Var.j())) {
            return false;
        }
        PendingIntent pendingIntent = this.h;
        if (pendingIntent == null) {
            if (olk0Var.f() != null) {
                return false;
            }
        } else if (!pendingIntent.equals(olk0Var.f())) {
            return false;
        }
        List list3 = this.i;
        return list3 == null ? olk0Var.l() == null : list3.equals(olk0Var.l());
    }

    @Override // xsna.olk0
    @Nullable
    @Deprecated
    public final PendingIntent f() {
        return this.h;
    }

    @Override // xsna.olk0
    public final int g() {
        return this.a;
    }

    @Override // xsna.olk0
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

    @Override // xsna.olk0
    public final long i() {
        return this.e;
    }

    @Override // xsna.olk0
    @Nullable
    public final List j() {
        return this.g;
    }

    @Override // xsna.olk0
    @Nullable
    public final List k() {
        return this.f;
    }

    @Override // xsna.olk0
    @Nullable
    public final List l() {
        return this.i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.i);
        StringBuilder a = odj.a(this.a, this.b, "SplitInstallSessionState{sessionId=", ", status=", ", errorCode=");
        a.append(this.c);
        a.append(", bytesDownloaded=");
        a.append(this.d);
        tj0.d(a, ", totalBytesToDownload=", this.e, ", moduleNamesNullable=");
        n6j.b(a, valueOf, ", languagesNullable=", valueOf2, ", resolutionIntent=");
        return h5s.d(a, valueOf3, ", splitFileIntents=", valueOf4, "}");
    }
}
