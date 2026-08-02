package xsna;

import com.vk.dto.attaches.Attach;

/* compiled from: AttachDownloadEvent.kt */
/* loaded from: classes16.dex */
public abstract class q14 {

    /* compiled from: AttachDownloadEvent.kt */
    public static final class a extends q14 {
        public final Attach a;

        public a(Attach attach) {
            this.a = attach;
        }
    }

    /* compiled from: AttachDownloadEvent.kt */
    public static final class b extends q14 {
        public final Attach a;

        public b(Attach attach) {
            this.a = attach;
        }
    }

    /* compiled from: AttachDownloadEvent.kt */
    public static final class c extends q14 {
        public final Attach a;
        public final int b;
        public final int c;

        public c(Attach attach, int i, int i2) {
            this.a = attach;
            this.b = i;
            this.c = i2;
        }
    }
}
