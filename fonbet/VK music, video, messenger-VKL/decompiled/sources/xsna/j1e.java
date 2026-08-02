package xsna;

import java.security.SecureRandom;

/* compiled from: ClipsEntryPointAnalyticsDelegate.kt */
/* loaded from: classes16.dex */
public final class j1e {
    public int a = -1;

    public final int a() {
        if (this.a == -1) {
            this.a = new SecureRandom().nextInt(Integer.MAX_VALUE);
        }
        return this.a;
    }
}
