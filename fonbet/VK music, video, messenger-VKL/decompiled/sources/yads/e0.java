package yads;

/* loaded from: classes10.dex */
public abstract class e0 implements my1 {
    public transient c0 b;
    public transient q c;
    public transient d0 d;
    public transient n e;

    public abstract n a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof my1) {
            return ((i) this).a().equals(((i) ((my1) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().d.hashCode();
    }

    public final String toString() {
        return a().d.toString();
    }
}
