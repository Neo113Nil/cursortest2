package xsna;

import android.view.View;

/* compiled from: DialogsListReporter.kt */
/* loaded from: classes2.dex */
public interface ltm {
    public static final a a = a.a;

    default boolean isEnabled() {
        return false;
    }

    /* compiled from: DialogsListReporter.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final C3297a b = new C3297a();

        public static C3297a a() {
            return b;
        }

        /* compiled from: DialogsListReporter.kt */
        /* renamed from: xsna.ltm$a$a, reason: collision with other inner class name */
        public static final class C3297a implements ltm {
            @Override // xsna.ltm
            public final boolean isEnabled() {
                return false;
            }

            @Override // xsna.ltm
            public final void a() {
            }

            @Override // xsna.ltm
            public final void c() {
            }

            @Override // xsna.ltm
            public final void e() {
            }

            @Override // xsna.ltm
            public final void f() {
            }

            @Override // xsna.ltm
            public final void b(View view) {
            }

            @Override // xsna.ltm
            public final void d(boolean z) {
            }
        }
    }

    default void a() {
    }

    default void c() {
    }

    default void e() {
    }

    default void f() {
    }

    default void b(View view) {
    }

    default void d(boolean z) {
    }
}
