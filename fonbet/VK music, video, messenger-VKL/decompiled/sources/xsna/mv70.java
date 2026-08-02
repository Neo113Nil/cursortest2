package xsna;

import android.net.Uri;
import one.video.player.model.VideoContentType;

/* compiled from: OfflineVideoSource.kt */
/* loaded from: classes8.dex */
public final class mv70 extends sht0 {
    public final String d;
    public final sht0 e;
    public final boolean f;

    public mv70(String str, sht0 sht0Var, boolean z) {
        super(VideoContentType.OFFLINE, new Uri.Builder().scheme("offline").authority("offline").path(str).build(), false);
        this.d = str;
        this.e = sht0Var;
        this.f = z;
    }

    @Override // xsna.sht0
    public final sht0 d(String str) {
        sht0 sht0Var = this.e;
        return new mv70(this.d, sht0Var != null ? sht0Var.d(str) : null, this.f);
    }

    @Override // xsna.sht0
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            mv70 mv70Var = (mv70) obj;
            if (epx.f(this.d, mv70Var.d) && epx.f(this.e, mv70Var.e) && this.f == mv70Var.f) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.sht0
    public final int hashCode() {
        int a = urd0.a(super.hashCode() * 31, 31, this.d);
        sht0 sht0Var = this.e;
        return Boolean.hashCode(this.f) + ((a + (sht0Var != null ? sht0Var.hashCode() : 0)) * 31);
    }
}
