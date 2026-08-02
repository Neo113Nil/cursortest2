package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: FirebaseRemoteConfigValueImpl.java */
/* loaded from: classes13.dex */
public final class dkr implements ckr {
    public final String a;
    public final int b;

    public dkr(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // xsna.ckr
    public final long e() {
        if (this.b == 0) {
            return 0L;
        }
        String trim = f().trim();
        try {
            return Long.valueOf(trim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(zr.a("[Value: ", trim, "] cannot be converted to a long."), e);
        }
    }

    @Override // xsna.ckr
    public final String f() {
        return this.b == 0 ? "" : this.a;
    }

    @Override // xsna.ckr
    public final boolean g() throws IllegalArgumentException {
        if (this.b == 0) {
            return false;
        }
        String trim = f().trim();
        if (pxi.e.matcher(trim).matches()) {
            return true;
        }
        if (pxi.f.matcher(trim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(zr.a("[Value: ", trim, "] cannot be converted to a boolean."));
    }

    @Override // xsna.ckr
    public final double h() {
        if (this.b == 0) {
            return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        }
        String trim = f().trim();
        try {
            return Double.valueOf(trim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(zr.a("[Value: ", trim, "] cannot be converted to a double."), e);
        }
    }

    @Override // xsna.ckr
    public final int t() {
        return this.b;
    }
}
