package xsna;

import com.vk.dto.shortvideo.ClipGridParams;

/* compiled from: AudioToFavoriteDelegate.kt */
/* loaded from: classes17.dex */
public final class ty4 {
    public final ngj0 a;
    public final i50 b;
    public io.reactivex.rxjava3.disposables.c c;
    public final io.reactivex.rxjava3.subjects.f<a> d = new io.reactivex.rxjava3.subjects.f<>();

    /* compiled from: AudioToFavoriteDelegate.kt */
    public static final class a {
        public final boolean a;
        public final ClipGridParams.Data.Music b;

        public a(boolean z, ClipGridParams.Data.Music music) {
            this.a = z;
            this.b = music;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "FavoriteAction(add=" + this.a + ", data=" + this.b + ')';
        }
    }

    /* compiled from: AudioToFavoriteDelegate.kt */
    public static abstract class b {

        /* compiled from: AudioToFavoriteDelegate.kt */
        public static final class a extends b {
            public final Throwable a;
            public final ClipGridParams.Data.Music b;

            public a(Throwable th, ClipGridParams.Data.Music music) {
                this.a = th;
                this.b = music;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Error(th=" + this.a + ", data=" + this.b + ')';
            }
        }

        /* compiled from: AudioToFavoriteDelegate.kt */
        /* renamed from: xsna.ty4$b$b, reason: collision with other inner class name */
        public static final class C3778b extends b {
            public final ClipGridParams.Data.Music a;

            public C3778b(ClipGridParams.Data.Music music) {
                this.a = music;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3778b) && epx.f(this.a, ((C3778b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "RequestFailed(data=" + this.a + ')';
            }
        }
    }

    public ty4(ngj0 ngj0Var, i50 i50Var) {
        this.a = ngj0Var;
        this.b = i50Var;
    }
}
