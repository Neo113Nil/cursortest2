package xsna;

/* compiled from: TagsListAction.kt */
/* loaded from: classes18.dex */
public final class c2o0 implements com.vk.dialogtags.impl.list.a {
    public final int b;

    public c2o0(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2o0) && this.b == ((c2o0) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("Unselect(id="), this.b, ')');
    }
}
