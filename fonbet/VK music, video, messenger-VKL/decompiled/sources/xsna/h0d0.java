package xsna;

import android.os.Build;
import java.util.Locale;
import xsna.vzc0;

/* compiled from: PrefetchScheduler.android.kt */
/* loaded from: classes11.dex */
public final class h0d0 {
    public static final a a;

    static {
        String str = Build.FINGERPRINT;
        a = (str == null || !str.toLowerCase(Locale.ROOT).equals("robolectric")) ? null : new a();
    }

    /* compiled from: PrefetchScheduler.android.kt */
    public static final class a implements g0d0 {
        @Override // xsna.g0d0
        public final void a(vzc0.a aVar) {
        }
    }
}
