package xsna;

/* compiled from: StoriesSettingsController.kt */
/* loaded from: classes6.dex */
public interface evl0 {
    public static final a a = a.a;

    boolean a();

    void b(boolean z);

    boolean c();

    void clear();

    boolean d();

    boolean e();

    boolean f();

    void g(boolean z);

    /* compiled from: StoriesSettingsController.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final evl0 STUB = new C2837a();

        public final evl0 getSTUB() {
            return STUB;
        }

        /* compiled from: StoriesSettingsController.kt */
        /* renamed from: xsna.evl0$a$a, reason: collision with other inner class name */
        public static final class C2837a implements evl0 {
            public boolean b;
            public boolean c;

            @Override // xsna.evl0
            public final boolean a() {
                return this.b;
            }

            @Override // xsna.evl0
            public final void b(boolean z) {
                this.c = z;
            }

            @Override // xsna.evl0
            public final boolean c() {
                return true;
            }

            @Override // xsna.evl0
            public final boolean d() {
                return false;
            }

            @Override // xsna.evl0
            public final boolean e() {
                return this.c;
            }

            @Override // xsna.evl0
            public final boolean f() {
                return false;
            }

            @Override // xsna.evl0
            public final void g(boolean z) {
                this.b = z;
            }

            @Override // xsna.evl0
            public final void clear() {
            }
        }
    }
}
