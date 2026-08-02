package xsna;

import java.io.File;

/* compiled from: DownloadFileCall.kt */
/* loaded from: classes15.dex */
public final class o8o {
    public final String a;
    public final File b;
    public final boolean c;
    public final boolean d;

    public o8o(String str, File file, boolean z) {
        this.a = str;
        this.b = file;
        this.c = true;
        this.d = z;
        if (drm0.N(str)) {
            throw new IllegalArgumentException("Illegal url value: ".concat(str));
        }
    }

    public final File a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public /* synthetic */ o8o(String str, File file, boolean z, int i) {
        this(str, file, z);
    }
}
