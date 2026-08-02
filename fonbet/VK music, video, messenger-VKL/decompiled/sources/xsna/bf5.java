package xsna;

import com.vk.music.offline.api.model.config.MusicAutoDownloadTrigger;

/* compiled from: AutoDownloadConfig.kt */
/* loaded from: classes.dex */
public interface bf5 {

    /* compiled from: AutoDownloadConfig.kt */
    public static final class b implements bf5 {
        public final int a;
        public final MusicAutoDownloadTrigger b;

        public b() {
            this((Object) null);
        }

        @Override // xsna.bf5
        public final int a() {
            return 0;
        }

        @Override // xsna.bf5
        public final int b() {
            return this.a;
        }

        @Override // xsna.bf5
        public final MusicAutoDownloadTrigger c() {
            return this.b;
        }

        @Override // xsna.bf5
        public final int d() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Disabled(cleanupDelayMinutes="), this.a, ')');
        }

        public b(int i) {
            this.a = i;
            this.b = MusicAutoDownloadTrigger.DISABLED;
        }

        public /* synthetic */ b(Object obj) {
            this(10080);
        }
    }

    int a();

    int b();

    MusicAutoDownloadTrigger c();

    int d();

    /* compiled from: AutoDownloadConfig.kt */
    /* loaded from: classes3.dex */
    public static final class a implements bf5 {
        public final int a;
        public final MusicAutoDownloadTrigger b;
        public final int c;
        public final int d;

        public a(int i, MusicAutoDownloadTrigger musicAutoDownloadTrigger, int i2, int i3) {
            this.a = i;
            this.b = musicAutoDownloadTrigger;
            this.c = i2;
            this.d = i3;
        }

        @Override // xsna.bf5
        public final int a() {
            return this.a;
        }

        @Override // xsna.bf5
        public final int b() {
            return this.d;
        }

        @Override // xsna.bf5
        public final MusicAutoDownloadTrigger c() {
            return this.b;
        }

        @Override // xsna.bf5
        public final int d() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + shy.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Default(cacheSizeMb=");
            sb.append(this.a);
            sb.append(", trigger=");
            sb.append(this.b);
            sb.append(", percentDurationToBuffer=");
            sb.append(this.c);
            sb.append(", cleanupDelayMinutes=");
            return vu5.b(sb, this.d, ')');
        }

        public a() {
            this(512, MusicAutoDownloadTrigger.LISTENING, 50, 10080);
        }
    }
}
