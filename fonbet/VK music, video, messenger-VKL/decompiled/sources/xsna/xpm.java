package xsna;

import com.vk.dto.common.Peer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DialogsFolderEditLpTask.kt */
/* loaded from: classes2.dex */
public final class xpm {
    public final int a;
    public final String b;
    public final List<Peer> c;
    public final List<Peer> d;
    public final Integer e;

    public xpm() {
        throw null;
    }

    public xpm(int i, String str, ArrayList arrayList, ArrayList arrayList2, Integer num, int i2) {
        str = (i2 & 2) != 0 ? null : str;
        arrayList = (i2 & 4) != 0 ? null : arrayList;
        arrayList2 = (i2 & 8) != 0 ? null : arrayList2;
        num = (i2 & 16) != 0 ? null : num;
        this.a = i;
        this.b = str;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpm)) {
            return false;
        }
        xpm xpmVar = (xpm) obj;
        return this.a == xpmVar.a && epx.f(this.b, xpmVar.b) && epx.f(this.c, xpmVar.c) && epx.f(this.d, xpmVar.d) && epx.f(this.e, xpmVar.e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Peer> list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Peer> list2 = this.d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.e;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsFolderEditLpData(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", includedPeers=");
        sb.append(this.c);
        sb.append(", excludedPeers=");
        sb.append(this.d);
        sb.append(", flags=");
        return uqi.b(sb, this.e, ')');
    }
}
