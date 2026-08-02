package xsna;

/* compiled from: AnimatedItem.kt */
/* loaded from: classes18.dex */
public interface zk2 {
    public static final a d7 = a.a;

    /* compiled from: AnimatedItem.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final C4182a b = new C4182a();

        /* compiled from: AnimatedItem.kt */
        /* renamed from: xsna.zk2$a$a, reason: collision with other inner class name */
        public static final class C4182a implements zk2 {
            @Override // xsna.zk2
            public final boolean V0() {
                return false;
            }

            @Override // xsna.zk2
            public final String a(boolean z) {
                return "";
            }

            @Override // xsna.zk2
            public final String b(boolean z) {
                return "";
            }
        }
    }

    default boolean V0() {
        return false;
    }

    default String a(boolean z) {
        return "";
    }

    default String b(boolean z) {
        return "";
    }
}
