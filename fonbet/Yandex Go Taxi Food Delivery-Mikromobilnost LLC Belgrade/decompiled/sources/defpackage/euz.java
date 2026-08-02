package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class euz {
    public final nsz a;
    public final Throwable b;

    public euz(nsz nszVar) {
        this.a = nszVar;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euz)) {
            return false;
        }
        euz euzVar = (euz) obj;
        nsz nszVar = this.a;
        if (nszVar != null && nszVar.equals(euzVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || euzVar.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public euz(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
