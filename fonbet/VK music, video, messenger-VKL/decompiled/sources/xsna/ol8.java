package xsna;

/* compiled from: ChatListInterfaces.kt */
/* loaded from: classes2.dex */
public interface ol8 {
    default boolean C() {
        oh30 M0 = M0();
        if (M0 != null) {
            return M0.h;
        }
        return false;
    }

    default oh30 M0() {
        return null;
    }

    default boolean p0() {
        oh30 M0 = M0();
        boolean z = false;
        if (M0 != null && M0.f) {
            z = true;
        }
        return !z;
    }
}
