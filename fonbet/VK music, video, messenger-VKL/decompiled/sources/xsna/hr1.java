package xsna;

import com.vk.dto.common.GoodAlbum;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StorefrontState.kt */
/* loaded from: classes18.dex */
public final class hr1 {
    public final List<GoodAlbum> a;
    public final boolean b;
    public final int c;
    public final mpl0 d;

    public hr1() {
        throw null;
    }

    public hr1(ArrayList arrayList, boolean z, int i, mpl0 mpl0Var) {
        this.a = arrayList;
        this.b = z;
        this.c = i;
        this.d = mpl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr1)) {
            return false;
        }
        hr1 hr1Var = (hr1) obj;
        return epx.f(this.a, hr1Var.a) && this.b == hr1Var.b && this.c == hr1Var.c && epx.f(this.d, hr1Var.d);
    }

    public final int hashCode() {
        List<GoodAlbum> list = this.a;
        int a = shy.a(this.c, qoy.b((list == null ? 0 : list.hashCode()) * 31, 31, this.b), 31);
        mpl0 mpl0Var = this.d;
        return (a + (mpl0Var != null ? mpl0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "AlbumsStateData(albums=" + this.a + ", canEdit=" + this.b + ", totalAlbums=" + this.c + ", viewedGoods=" + this.d + ", viewedGoodsTooltip=null)";
    }
}
