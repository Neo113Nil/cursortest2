package xsna;

import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ImTmpFileCache.kt */
/* loaded from: classes11.dex */
public final class vdw implements b0p0 {
    public static final vdw a = new vdw();
    public static final AtomicLong b = new AtomicLong(System.currentTimeMillis());

    @Override // xsna.b0p0
    public final File a() {
        PrivateFiles.a b2;
        b2 = e8r.a.b(r1, PrivateSubdir.IM.h(), true);
        return b2.a;
    }

    @Override // xsna.b0p0
    public final void b() {
        e8r.b.a(false);
    }

    @Override // xsna.b0p0
    public final File c(String str) {
        return new File(a(), String.format(Locale.US, "%d.%s", Arrays.copyOf(new Object[]{Long.valueOf(b.getAndIncrement()), str}, 2)));
    }

    public final void d() {
        e8r.b.a(true);
    }
}
