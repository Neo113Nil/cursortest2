package xsna;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class jcl implements avf {
    public static final jcl a = new jcl();
    public static waq b;

    @Override // xsna.avf
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // xsna.avf
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
