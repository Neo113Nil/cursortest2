package xsna;

/* compiled from: ConcurrentLinkedList.kt */
@vby
/* loaded from: classes11.dex */
public final class h5i0 {
    public static cnj0 a;

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static final n4i0 b(Object obj) {
        if (obj != rwi.a) {
            return (n4i0) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final boolean c(Object obj) {
        return obj == rwi.a;
    }
}
