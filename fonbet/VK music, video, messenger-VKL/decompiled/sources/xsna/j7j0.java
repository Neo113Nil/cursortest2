package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import java.util.ArrayList;

/* compiled from: ShareDialogsResult.kt */
/* loaded from: classes5.dex */
public final class j7j0 {
    public final ArrayList a;
    public final ProfilesInfo b;
    public final boolean c;

    public j7j0(ArrayList arrayList, ProfilesInfo profilesInfo, boolean z) {
        this.a = arrayList;
        this.b = profilesInfo;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7j0)) {
            return false;
        }
        j7j0 j7j0Var = (j7j0) obj;
        return this.a.equals(j7j0Var.a) && this.b.equals(j7j0Var.b) && this.c == j7j0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ur.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareDialogsResult(dialogs=");
        sb.append(this.a);
        sb.append(", profiles=");
        sb.append(this.b);
        sb.append(", areDialogsFullyLoaded=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
