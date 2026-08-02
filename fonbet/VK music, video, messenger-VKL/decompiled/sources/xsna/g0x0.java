package xsna;

import java.util.ArrayList;

/* compiled from: VoipSelectVideoPlaylistPatch.kt */
/* loaded from: classes7.dex */
public abstract class g0x0 implements xl50 {

    /* compiled from: VoipSelectVideoPlaylistPatch.kt */
    public static abstract class a extends g0x0 {

        /* compiled from: VoipSelectVideoPlaylistPatch.kt */
        /* renamed from: xsna.g0x0$a$a, reason: collision with other inner class name */
        public static final class C2905a extends a {
            public static final C2905a b = new C2905a();
        }

        /* compiled from: VoipSelectVideoPlaylistPatch.kt */
        public static final class b extends a {
            public final Throwable b;

            public b(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: VoipSelectVideoPlaylistPatch.kt */
        public static abstract class c extends a {

            /* compiled from: VoipSelectVideoPlaylistPatch.kt */
            /* renamed from: xsna.g0x0$a$c$a, reason: collision with other inner class name */
            public static final class C2906a extends c {
                public final Throwable b;

                public C2906a(Throwable th) {
                    this.b = th;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2906a) && epx.f(this.b, ((C2906a) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
                }
            }

            /* compiled from: VoipSelectVideoPlaylistPatch.kt */
            public static final class b extends c {
                public static final b b = new b();
            }

            /* compiled from: VoipSelectVideoPlaylistPatch.kt */
            /* renamed from: xsna.g0x0$a$c$c, reason: collision with other inner class name */
            public static final class C2907c extends c {
                public final ArrayList b;
                public final int c;
                public final boolean d;

                public C2907c(ArrayList arrayList, int i, boolean z) {
                    this.b = arrayList;
                    this.c = i;
                    this.d = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2907c)) {
                        return false;
                    }
                    C2907c c2907c = (C2907c) obj;
                    return epx.f(this.b, c2907c.b) && this.c == c2907c.c && this.d == c2907c.d;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Result(playlistsResult=");
                    sb.append(this.b);
                    sb.append(", nextFrom=");
                    sb.append(this.c);
                    sb.append(", hasMore=");
                    return defpackage.q0.a(sb, this.d, ')');
                }
            }
        }

        /* compiled from: VoipSelectVideoPlaylistPatch.kt */
        public static final class d extends a {
            public final boolean b = true;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.b == ((d) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Loading(isLoading="), this.b, ')');
            }
        }

        /* compiled from: VoipSelectVideoPlaylistPatch.kt */
        public static final class e extends a {
            public final ArrayList b;
            public final int c;
            public final boolean d;

            public e(ArrayList arrayList, int i, boolean z) {
                this.b = arrayList;
                this.c = i;
                this.d = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.b, eVar.b) && this.c == eVar.c && this.d == eVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(items=");
                sb.append(this.b);
                sb.append(", nextFrom=");
                sb.append(this.c);
                sb.append(", hasMore=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: VoipSelectVideoPlaylistPatch.kt */
        public static final class f extends a {
            public final boolean b;

            public f(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.b == ((f) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("SwrLoading(isLoading="), this.b, ')');
            }
        }
    }
}
