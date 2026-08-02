package xsna;

import java.util.List;

/* compiled from: NewUsersItemItem.kt */
/* loaded from: classes2.dex */
public final class f960 implements hfz {
    public final List<qtd0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public f960(List<? extends qtd0> list) {
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f960) && epx.f(this.b, ((f960) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("NewUsersItem(profiles="), this.b);
    }
}
