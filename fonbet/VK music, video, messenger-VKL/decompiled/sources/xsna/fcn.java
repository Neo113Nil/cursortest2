package xsna;

/* compiled from: Dismissed.kt */
/* loaded from: classes.dex */
public interface fcn {
    default boolean M4() {
        return true;
    }

    default boolean N8() {
        return false;
    }

    void b(boolean z);

    default void dismiss() {
        b(false);
    }

    default boolean v6() {
        return false;
    }
}
