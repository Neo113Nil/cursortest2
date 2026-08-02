package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: GalvitaHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class z5t extends ol60 {
    public final NewsEntry h;
    public final NewsEntry i;
    public final List<v64<?>> j;
    public final int k;
    public final int l;

    /* JADX WARN: Multi-variable type inference failed */
    public z5t(NewsEntry newsEntry, NewsEntry newsEntry2, List<? extends v64<?>> list, int i, int i2) {
        super(PsExtractor.PRIVATE_STREAM_1, 0, i2, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = list;
        this.k = i;
        this.l = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5t)) {
            return false;
        }
        z5t z5tVar = (z5t) obj;
        return epx.f(this.h, z5tVar.h) && epx.f(this.i, z5tVar.i) && epx.f(this.j, z5tVar.j) && this.k == z5tVar.k && this.l == z5tVar.l;
    }

    @Override // xsna.ol60
    public final int f() {
        return this.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + shy.a(this.k, fw3.a(e630.b(this.h.hashCode() * 31, 31, this.i), 31, this.j), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalvitaHolderUiDto(entry=");
        sb.append(this.h);
        sb.append(", rootEntry=");
        sb.append(this.i);
        sb.append(", attachmentsUiDtos=");
        sb.append(this.j);
        sb.append(", itemsSize=");
        sb.append(this.k);
        sb.append(", seqId=");
        return vu5.b(sb, this.l, ')');
    }
}
