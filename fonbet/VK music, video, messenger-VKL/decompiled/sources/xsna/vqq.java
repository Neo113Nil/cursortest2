package xsna;

import com.vk.fave.entities.FavePage;
import java.util.List;

/* compiled from: FavePagesHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class vqq extends ol60 {
    public final List<FavePage> h;
    public final int i;

    public vqq(List<FavePage> list, int i) {
        super(1107, 0, i, 6, null);
        this.h = list;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqq)) {
            return false;
        }
        vqq vqqVar = (vqq) obj;
        return epx.f(this.h, vqqVar.h) && this.i == vqqVar.i;
    }

    @Override // xsna.ol60
    public final int f() {
        return this.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + (this.h.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavePagesHolderUiDto(pages=");
        sb.append(this.h);
        sb.append(", seqId=");
        return vu5.b(sb, this.i, ')');
    }
}
