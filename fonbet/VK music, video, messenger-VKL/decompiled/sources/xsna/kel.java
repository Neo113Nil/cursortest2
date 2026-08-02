package xsna;

import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import ru.ok.proto.PublisherConfiguration;

/* compiled from: DefaultEncodingQuality.kt */
/* loaded from: classes3.dex */
public abstract class kel {
    public final d a;

    /* compiled from: DefaultEncodingQuality.kt */
    public static final class a extends kel {
        public static final a b = new a(new d(1080, 1920, 30));
    }

    /* compiled from: DefaultEncodingQuality.kt */
    public static final class b extends kel {
        public static final b b = new b(new d(480, 640, 24));
    }

    /* compiled from: DefaultEncodingQuality.kt */
    public static final class c extends kel {
        public static final c b = new c(new d(PublisherConfiguration.DEFAULT_MAX_RES, CoverVideoUploadTask.y, 30));
    }

    /* compiled from: DefaultEncodingQuality.kt */
    public static final class d {
        public final int a;
        public final int b;
        public final int c;

        public d(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DefaultEncodingQuality.Video(");
            sb.append(this.a);
            sb.append('x');
            sb.append(this.b);
            sb.append('@');
            return vu5.b(sb, this.c, ')');
        }
    }

    public kel(d dVar) {
        this.a = dVar;
    }
}
