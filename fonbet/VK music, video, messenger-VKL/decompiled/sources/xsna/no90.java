package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import java.util.List;

/* compiled from: PastBroadcastsPatch.kt */
/* loaded from: classes7.dex */
public interface no90 extends xl50 {

    /* compiled from: PastBroadcastsPatch.kt */
    public static abstract class a implements no90 {

        /* compiled from: PastBroadcastsPatch.kt */
        /* renamed from: xsna.no90$a$a, reason: collision with other inner class name */
        public static final class C3406a extends a {
            public final Throwable b;

            public C3406a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3406a) && epx.f(this.b, ((C3406a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: PastBroadcastsPatch.kt */
        public static final class b extends a {
            public final List<VideoFile> b;
            public final int c;
            public final boolean d;

            public b(int i, VKList vKList, boolean z) {
                this.b = vKList;
                this.c = i;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(videos=");
                sb.append(this.b);
                sb.append(", nextFrom=");
                sb.append(this.c);
                sb.append(", hasMore=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: PastBroadcastsPatch.kt */
        public static final class c extends a {
            public static final c b = new c();
        }
    }

    /* compiled from: PastBroadcastsPatch.kt */
    public static abstract class b implements no90 {

        /* compiled from: PastBroadcastsPatch.kt */
        public static final class a extends b {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: PastBroadcastsPatch.kt */
        /* renamed from: xsna.no90$b$b, reason: collision with other inner class name */
        public static final class C3407b extends b {
            public final List<VideoFile> b;
            public final int c;
            public final boolean d;

            public C3407b(int i, VKList vKList, boolean z) {
                this.b = vKList;
                this.c = i;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3407b)) {
                    return false;
                }
                C3407b c3407b = (C3407b) obj;
                return epx.f(this.b, c3407b.b) && this.c == c3407b.c && this.d == c3407b.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(videos=");
                sb.append(this.b);
                sb.append(", nextFrom=");
                sb.append(this.c);
                sb.append(", hasMore=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: PastBroadcastsPatch.kt */
        public static final class c extends b {
            public static final c b = new c();
        }
    }

    /* compiled from: PastBroadcastsPatch.kt */
    public static abstract class c implements no90 {

        /* compiled from: PastBroadcastsPatch.kt */
        public static final class a extends c {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: PastBroadcastsPatch.kt */
        public static final class b extends c {
            public final List<VideoFile> b;
            public final int c;
            public final boolean d;

            public b(int i, VKList vKList, boolean z) {
                this.b = vKList;
                this.c = i;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(videos=");
                sb.append(this.b);
                sb.append(", nextFrom=");
                sb.append(this.c);
                sb.append(", hasMore=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: PastBroadcastsPatch.kt */
        /* renamed from: xsna.no90$c$c, reason: collision with other inner class name */
        public static final class C3408c extends c {
            public static final C3408c b = new C3408c();
        }
    }

    /* compiled from: PastBroadcastsPatch.kt */
    public static final class d implements no90 {
        public final VideoFile b;

        public d(VideoFile videoFile) {
            this.b = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("RemoveSingeItem(item="), this.b, ')');
        }
    }

    /* compiled from: PastBroadcastsPatch.kt */
    public static final class e implements no90 {
        public final VideoFile b;

        public e(VideoFile videoFile) {
            this.b = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("UpdateSingeItem(item="), this.b, ')');
        }
    }
}
