package xsna;

/* compiled from: ObjectWrapper.kt */
/* loaded from: classes3.dex */
public abstract class aq70<T> {
    public abstract twf e();

    public final boolean equals(Object obj) {
        return obj instanceof aq70 ? epx.f(e(), ((aq70) obj).e()) : super.equals(obj);
    }

    public final int hashCode() {
        twf e = e();
        if (e != null) {
            return e.hashCode();
        }
        return 0;
    }
}
