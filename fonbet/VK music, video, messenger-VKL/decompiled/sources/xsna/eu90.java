package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PeersBlocksSearchResult.kt */
/* loaded from: classes2.dex */
public final class eu90 {
    public final List<PeersSearchBlock> a;
    public final ProfilesSimpleInfo b;
    public final boolean c;

    public eu90() {
        this(0);
    }

    public static eu90 a(eu90 eu90Var, ArrayList arrayList) {
        ProfilesSimpleInfo profilesSimpleInfo = eu90Var.b;
        boolean z = eu90Var.c;
        eu90Var.getClass();
        return new eu90(arrayList, profilesSimpleInfo, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu90)) {
            return false;
        }
        eu90 eu90Var = (eu90) obj;
        return epx.f(this.a, eu90Var.a) && epx.f(this.b, eu90Var.b) && this.c == eu90Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + io.reactivex.rxjava3.subjects.c.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeersBlocksSearchResult(blocks=");
        sb.append(this.a);
        sb.append(", profiles=");
        sb.append(this.b);
        sb.append(", isLocalOnly=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eu90(List<? extends PeersSearchBlock> list, ProfilesSimpleInfo profilesSimpleInfo, boolean z) {
        this.a = list;
        this.b = profilesSimpleInfo;
        this.c = z;
    }

    public eu90(int i) {
        this(EmptyList.b, new ProfilesSimpleInfo(), true);
    }
}
