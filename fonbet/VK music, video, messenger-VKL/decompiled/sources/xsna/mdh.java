package xsna;

import com.vk.toggle.features.ComFeatures;
import xsna.ddh;
import xsna.gwu;

/* compiled from: CommunityPriorityBlockGoodsItemModel.kt */
/* loaded from: classes5.dex */
public final class mdh extends s4h {
    public static final bpn0 e = new bpn0(new com.vk.movika.sdk.base.ui.v(12));
    public final gwu.a b;
    public final sbd0 c;
    public final rvw d;

    /* compiled from: CommunityPriorityBlockGoodsItemModel.kt */
    public static final class a {
        public static gwu.c a(kdh kdhVar) {
            String str;
            String str2;
            ddh.a b = kdhVar.b();
            if (b != null) {
                ComFeatures comFeatures = ComFeatures.COM_PB_GOODS_ALBUMS;
                comFeatures.getClass();
                if (com.vk.toggle.b.A.a(comFeatures) && (((str = b.d) != null && str.length() > 0) || ((str2 = b.e) != null && str2.length() > 0))) {
                    ddh.a b2 = kdhVar.b();
                    boolean z = (b2 != null ? b2.d : null) != null;
                    ddh.a b3 = kdhVar.b();
                    return new gwu.c(z, (b3 != null ? b3.e : null) != null, 2);
                }
            }
            return null;
        }
    }

    public mdh(gwu.a aVar, sbd0 sbd0Var, rvw rvwVar) {
        this.b = aVar;
        this.c = sbd0Var;
        this.d = rvwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdh)) {
            return false;
        }
        mdh mdhVar = (mdh) obj;
        return epx.f(this.b, mdhVar.b) && epx.f(this.c, mdhVar.c) && epx.f(this.d, mdhVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        rvw rvwVar = this.d;
        return hashCode + (rvwVar == null ? 0 : rvwVar.hashCode());
    }

    public final String toString() {
        return "CommunityPriorityBlockGoodsItemModel(title=" + this.b + ", content=" + this.c + ", infoBlock=" + this.d + ')';
    }
}
