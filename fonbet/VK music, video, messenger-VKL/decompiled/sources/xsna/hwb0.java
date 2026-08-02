package xsna;

import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;

/* compiled from: PopupConfig.kt */
/* loaded from: classes5.dex */
public final class hwb0 {
    public final ExtendedUserProfile a;
    public final i0u0 b;
    public final ArrayList c;

    public hwb0(ExtendedUserProfile extendedUserProfile, i0u0 i0u0Var, ArrayList arrayList) {
        this.a = extendedUserProfile;
        this.b = i0u0Var;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwb0)) {
            return false;
        }
        hwb0 hwb0Var = (hwb0) obj;
        return epx.f(this.a, hwb0Var.a) && epx.f(this.b, hwb0Var.b) && this.c.equals(hwb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopupConfig(profile=");
        sb.append(this.a);
        sb.append(", viewProvider=");
        sb.append(this.b);
        sb.append(", items=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
    }
}
