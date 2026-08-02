package xsna;

import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: AndroidLogger.java */
/* loaded from: classes13.dex */
public final class sa2 extends q100 {
    public String a;

    @Override // xsna.q100
    public final void c(String str) {
        Log.e("isoparser", String.valueOf(this.a) + StringUtils.PROCESS_POSTFIX_DELIMITER + str);
    }

    @Override // xsna.q100
    public final void b(String str) {
    }

    @Override // xsna.q100
    public final void d(String str) {
    }
}
