package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import java.util.AbstractCollection;
import java.util.Collection;
import kotlin.collections.EmptyList;

/* compiled from: MentionSuggestion.kt */
/* loaded from: classes2.dex */
public final class m420 {
    public final Collection<k320> a;
    public final ProfilesInfo b;
    public final boolean c;
    public final int d;

    public m420() {
        this((AbstractCollection) null, (ProfilesInfo) null, false, 15);
    }

    public static m420 a(m420 m420Var, boolean z, int i, int i2) {
        Collection<k320> collection = m420Var.a;
        ProfilesInfo profilesInfo = m420Var.b;
        if ((i2 & 4) != 0) {
            z = m420Var.c;
        }
        if ((i2 & 8) != 0) {
            i = m420Var.d;
        }
        m420Var.getClass();
        return new m420(collection, profilesInfo, z, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m420.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m420 m420Var = (m420) obj;
        return epx.f(this.a, m420Var.a) && this.c == m420Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MentionSuggestion(mentions=");
        sb.append(this.a);
        sb.append(", info=");
        sb.append(this.b);
        sb.append(", isFull=");
        sb.append(this.c);
        sb.append(", lastSuggestSize=");
        return vu5.b(sb, this.d, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m420(Collection<? extends k320> collection, ProfilesInfo profilesInfo, boolean z, int i) {
        this.a = collection;
        this.b = profilesInfo;
        this.c = z;
        this.d = i;
    }

    public m420(AbstractCollection abstractCollection, ProfilesInfo profilesInfo, boolean z, int i) {
        this((Collection<? extends k320>) ((i & 1) != 0 ? EmptyList.b : abstractCollection), (i & 2) != 0 ? new ProfilesInfo() : profilesInfo, (i & 4) != 0 ? true : z, 0);
    }
}
