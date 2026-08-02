package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class pe21 implements s3c {
    @Override // defpackage.s3c
    public final long getTime() {
        return SystemClock.elapsedRealtime();
    }
}
