package defpackage;

import com.yandex.plus.pay.ui.yb.web.api.PlusPayYbWebException;

/* loaded from: classes2.dex */
public final class chd0 implements ehd0 {
    public final PlusPayYbWebException a;

    public chd0(PlusPayYbWebException plusPayYbWebException) {
        this.a = plusPayYbWebException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chd0) && this.a == ((chd0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.a + ')';
    }
}
