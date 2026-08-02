package xsna;

import androidx.annotation.NonNull;

/* compiled from: Operation.java */
/* loaded from: classes.dex */
public interface ts80 {
    public static final a.c a = new a.c();
    public static final a.b b = new a.b();

    /* compiled from: Operation.java */
    public static abstract class a {

        /* compiled from: Operation.java */
        /* renamed from: xsna.ts80$a$a, reason: collision with other inner class name */
        public static final class C3764a extends a {
            public final Throwable a;

            public C3764a(@NonNull Throwable th) {
                this.a = th;
            }

            @NonNull
            public final String toString() {
                return "FAILURE (" + this.a.getMessage() + ")";
            }
        }

        /* compiled from: Operation.java */
        public static final class b extends a {
            @NonNull
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* compiled from: Operation.java */
        public static final class c extends a {
            @NonNull
            public final String toString() {
                return "SUCCESS";
            }
        }
    }

    @NonNull
    androidx.lifecycle.n<a> getState();
}
