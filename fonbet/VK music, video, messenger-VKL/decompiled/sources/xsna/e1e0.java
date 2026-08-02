package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import java.util.Collection;

/* compiled from: ProfilesGetCmdArgs.kt */
/* loaded from: classes2.dex */
public final class e1e0 {
    public final Collection<Peer> a;
    public final Source b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public e1e0(Collection<? extends Peer> collection, Source source, boolean z) {
        this.a = collection;
        this.b = source;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1e0)) {
            return false;
        }
        e1e0 e1e0Var = (e1e0) obj;
        return epx.f(this.a, e1e0Var.a) && this.b == e1e0Var.b && this.c == e1e0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + io.reactivex.rxjava3.internal.operators.mixed.k.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfilesGetCmdArgs(members=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
