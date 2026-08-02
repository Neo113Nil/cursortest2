package xsna;

import com.vk.dto.common.Peer;
import java.util.List;

/* compiled from: DialogsFolderEditMergeTask.kt */
/* loaded from: classes2.dex */
public final class zpm extends b920 {
    public final int c;
    public final String d;
    public final List<Peer> e;
    public final List<Peer> f;
    public final Integer g;

    public zpm(List list, int i, List list2, String str, Integer num) {
        this.c = i;
        this.d = str;
        this.e = list;
        this.f = list2;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpm)) {
            return false;
        }
        zpm zpmVar = (zpm) obj;
        return this.c == zpmVar.c && epx.f(this.d, zpmVar.d) && epx.f(this.e, zpmVar.e) && epx.f(this.f, zpmVar.f) && epx.f(this.g, zpmVar.g);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.c) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Peer> list = this.e;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Peer> list2 = this.f;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.g;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        w2wVar.I0().u(new na7(13, w2wVar, this));
        return s3q0.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsFolderEditMergeTask(id=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", includedPeers=");
        sb.append(this.e);
        sb.append(", excludedPeers=");
        sb.append(this.f);
        sb.append(", flags=");
        return uqi.b(sb, this.g, ')');
    }
}
