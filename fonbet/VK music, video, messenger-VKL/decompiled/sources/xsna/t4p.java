package xsna;

import com.vk.mediastore.system.MediaStoreEntry;

/* compiled from: EditorScreenDelegate.kt */
/* loaded from: classes16.dex */
public interface t4p {

    /* compiled from: EditorScreenDelegate.kt */
    public interface a {

        /* compiled from: EditorScreenDelegate.kt */
        /* renamed from: xsna.t4p$a$a, reason: collision with other inner class name */
        public static final class C3718a implements a {
            public final f a;

            public C3718a(f fVar) {
                this.a = fVar;
            }
        }

        /* compiled from: EditorScreenDelegate.kt */
        public static final class b implements a {
            public final MediaStoreEntry a;
            public final Object b;
            public final f c;

            public b(MediaStoreEntry mediaStoreEntry, r4p r4pVar, f fVar) {
                this.a = mediaStoreEntry;
                this.b = r4pVar;
                this.c = fVar;
            }
        }

        /* compiled from: EditorScreenDelegate.kt */
        public static final class c implements a {
            public static final c a = new c();
        }

        /* compiled from: EditorScreenDelegate.kt */
        public static final class d implements a {
            public static final d a = new d();
        }

        /* compiled from: EditorScreenDelegate.kt */
        public static final class e implements a {
            public static final e a = new e();
        }

        /* compiled from: EditorScreenDelegate.kt */
        public static final class f {
            public final boolean a;
            public final boolean b;

            public f() {
                this(false, false);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.a == fVar.a && this.b == fVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Spoiler(isSpoiled=");
                sb.append(this.a);
                sb.append(", isDonut=");
                return defpackage.q0.a(sb, this.b, ')');
            }

            public f(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
            }
        }
    }

    void a(a aVar);

    default boolean b() {
        return true;
    }
}
