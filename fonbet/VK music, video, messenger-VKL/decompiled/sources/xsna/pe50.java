package xsna;

import com.vk.toggle.data.MusicAutoDownloadTrigger;

/* compiled from: MusicVideoAutoDownloadConfig.kt */
/* loaded from: classes11.dex */
public interface pe50 {

    /* compiled from: MusicVideoAutoDownloadConfig.kt */
    public static final class a implements pe50 {
        public final int a;

        public a() {
            this(10080);
        }

        @Override // xsna.pe50
        public final int b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Disabled(cleanupDelayMinutes="), this.a, ')');
        }

        public a(int i) {
            this.a = i;
        }
    }

    int b();

    /* compiled from: MusicVideoAutoDownloadConfig.kt */
    public interface b extends pe50 {

        /* compiled from: MusicVideoAutoDownloadConfig.kt */
        /* renamed from: xsna.pe50$b$b, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C3509b implements b {
            public static final C3509b a = new C3509b();

            @Override // xsna.pe50.b
            public final int a() {
                return 512;
            }

            @Override // xsna.pe50
            public final int b() {
                return 10080;
            }

            @Override // xsna.pe50.b
            public final MusicAutoDownloadTrigger c() {
                return MusicAutoDownloadTrigger.LISTENING;
            }

            @Override // xsna.pe50.b
            public final int d() {
                return 50;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3509b);
            }

            public final int hashCode() {
                return 397203403;
            }

            public final String toString() {
                return "Default";
            }
        }

        int a();

        MusicAutoDownloadTrigger c();

        int d();

        /* compiled from: MusicVideoAutoDownloadConfig.kt */
        /* loaded from: classes6.dex */
        public static final class a implements b {
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

            @Override // xsna.pe50.b
            public final int a() {
                return this.a;
            }

            @Override // xsna.pe50
            public final int b() {
                return this.d;
            }

            @Override // xsna.pe50.b
            public final MusicAutoDownloadTrigger c() {
                return this.b;
            }

            @Override // xsna.pe50.b
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
                StringBuilder sb = new StringBuilder("Custom(cacheSizeMb=");
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
}
