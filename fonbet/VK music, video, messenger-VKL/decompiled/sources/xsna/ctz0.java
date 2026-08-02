package xsna;

import com.google.android.play.core.install.InstallState;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public final class ctz0 extends InstallState {
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;

    public ctz0(int i, String str, long j, long j2, int i2) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = i2;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long a() {
        return this.b;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int b() {
        return this.d;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int c() {
        return this.a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String d() {
        return this.e;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallState)) {
            return false;
        }
        InstallState installState = (InstallState) obj;
        return this.a == installState.c() && this.b == installState.a() && this.c == installState.e() && this.d == installState.b() && this.e.equals(installState.d());
    }

    public final int hashCode() {
        int i = this.a ^ 1000003;
        long j = this.b;
        long j2 = this.c;
        return (((((((i * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder b = jr.b(this.a, "InstallState{installStatus=", ", bytesDownloaded=", this.b);
        tj0.d(b, ", totalBytesToDownload=", this.c, ", installErrorCode=");
        b.append(this.d);
        b.append(", packageName=");
        b.append(this.e);
        b.append("}");
        return b.toString();
    }
}
