package xsna;

import java.util.List;

/* compiled from: CommunityCheckListCategoryItem.kt */
/* loaded from: classes18.dex */
public final class uvg implements hfz {
    public final String b;
    public final List<hfz> c;

    /* JADX WARN: Multi-variable type inference failed */
    public uvg(String str, List<? extends hfz> list) {
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvg)) {
            return false;
        }
        uvg uvgVar = (uvg) obj;
        return epx.f(this.b, uvgVar.b) && epx.f(this.c, uvgVar.c);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityCheckListCategoryItem(name=");
        sb.append(this.b);
        sb.append(", items=");
        return ms9.a(')', sb, this.c);
    }
}
