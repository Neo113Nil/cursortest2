package defpackage;

import com.yandex.plus.core.graphql.type.PLAQUE_CLICKED_STATUS;

/* loaded from: classes2.dex */
public final class b3j0 implements za70 {
    public final PLAQUE_CLICKED_STATUS a;

    public b3j0(PLAQUE_CLICKED_STATUS plaque_clicked_status) {
        this.a = plaque_clicked_status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3j0) && this.a == ((b3j0) obj).a;
    }

    public final int hashCode() {
        PLAQUE_CLICKED_STATUS plaque_clicked_status = this.a;
        if (plaque_clicked_status == null) {
            return 0;
        }
        return plaque_clicked_status.hashCode();
    }

    public final String toString() {
        return "Data(plaqueClicked=" + this.a + ')';
    }
}
