package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import kotlin.time.DurationUnit;
import xsna.zno;

/* compiled from: StatConfig.kt */
/* loaded from: classes8.dex */
public final class mrk0 {
    public final File a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;

    public mrk0(File file, String str, String str2, boolean z) {
        long j = 100 * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        long j2 = 10 * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        long j3 = 200 * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        zno.a aVar = zno.c;
        long e = zno.e(eoo.e(10, DurationUnit.SECONDS));
        long e2 = zno.e(eoo.e(1, DurationUnit.MINUTES));
        long e3 = zno.e(eoo.e(3, DurationUnit.DAYS));
        this.a = file;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = e;
        this.i = e2;
        this.j = e3;
        this.k = 16;
        this.l = 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrk0)) {
            return false;
        }
        mrk0 mrk0Var = (mrk0) obj;
        return epx.f(this.a, mrk0Var.a) && epx.f(this.b, mrk0Var.b) && epx.f(this.c, mrk0Var.c) && this.d == mrk0Var.d && this.e == mrk0Var.e && this.f == mrk0Var.f && this.g == mrk0Var.g && this.h == mrk0Var.h && this.i == mrk0Var.i && this.j == mrk0Var.j && this.k == mrk0Var.k && this.l == mrk0Var.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + shy.a(this.k, bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(qoy.b(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatConfig(filesDir=");
        sb.append(this.a);
        sb.append(", product=");
        sb.append(this.b);
        sb.append(", platform=");
        sb.append(this.c);
        sb.append(", forceSend=");
        sb.append(this.d);
        sb.append(", minAppendFileSizeToUpload=");
        sb.append(this.e);
        tj0.d(sb, ", maxFileSize=", this.f, ", maxSingleAllocationSize=");
        sb.append(this.g);
        tj0.d(sb, ", timeoutToSilenceUploadMs=", this.h, ", timeoutToSilenceDeleteExpiredFilesMs=");
        sb.append(this.i);
        tj0.d(sb, ", sessionExpirationTimeMs=", this.j, ", maxExpBackoffPower=");
        return rzl.a(this.k, this.l, ", minRetryTimeoutSec=", ")", sb);
    }
}
