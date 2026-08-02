package defpackage;

/* loaded from: classes9.dex */
public interface lqn {
    default Object a() {
        if (this instanceof jqn) {
            return ((jqn) this).b();
        }
        return null;
    }
}
