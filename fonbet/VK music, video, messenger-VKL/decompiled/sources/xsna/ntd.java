package xsna;

import java.io.File;

/* compiled from: ClipsDraftProvider.kt */
/* loaded from: classes17.dex */
public final class ntd implements mtd {
    public final a a = new a();

    /* compiled from: ClipsDraftProvider.kt */
    public static final class a implements osd {
        public final File a = new File("");
        public final File b = new File("");
        public final File c = new File("");

        @Override // xsna.osd
        public final File a() {
            return this.c;
        }

        @Override // xsna.osd
        public final File b() {
            return this.a;
        }

        @Override // xsna.osd
        public final File c() {
            return this.b;
        }
    }

    /* compiled from: ClipsDraftProvider.kt */
    public static final class b {
    }

    /* compiled from: ClipsDraftProvider.kt */
    public static final class c {
    }

    @Override // xsna.mtd
    public final osd a() {
        return this.a;
    }
}
