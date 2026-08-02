package xsna;

import com.vk.dto.stories.model.DiscoverBlockType;
import java.util.ArrayList;

/* compiled from: InterestingStoriesBlock.kt */
/* loaded from: classes18.dex */
public final class tdx {
    public final String a;
    public final int b;
    public final ArrayList c;
    public final ArrayList d;
    public final DiscoverBlockType e;
    public final String f;
    public final String g;

    public tdx(String str, int i, ArrayList arrayList, ArrayList arrayList2, DiscoverBlockType discoverBlockType, String str2, String str3) {
        this.a = str;
        this.b = i;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = discoverBlockType;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdx)) {
            return false;
        }
        tdx tdxVar = (tdx) obj;
        return epx.f(this.a, tdxVar.a) && this.b == tdxVar.b && this.c.equals(tdxVar.c) && this.d.equals(tdxVar.d) && this.e == tdxVar.e && epx.f(this.f, tdxVar.f) && epx.f(this.g, tdxVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.e.hashCode() + qr.a(this.d, qr.a(this.c, shy.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31)) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InterestingStoriesBlock(title=");
        sb.append(this.a);
        sb.append(", count=");
        sb.append(this.b);
        sb.append(", items=");
        sb.append(this.c);
        sb.append(", containers=");
        sb.append(this.d);
        sb.append(", blockType=");
        sb.append(this.e);
        sb.append(", trackCode=");
        sb.append(this.f);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.g, ')');
    }
}
