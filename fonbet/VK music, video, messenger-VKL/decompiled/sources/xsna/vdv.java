package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;

/* compiled from: HorizontalGalleryUiDto.kt */
/* loaded from: classes4.dex */
public final class vdv extends ol60 {
    public final NewsEntry h;
    public final NewsEntry i;
    public final ArrayList j;
    public final float k;

    public vdv(NewsEntry newsEntry, NewsEntry newsEntry2, ArrayList arrayList, float f) {
        super(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = arrayList;
        this.k = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdv)) {
            return false;
        }
        vdv vdvVar = (vdv) obj;
        return epx.f(this.h, vdvVar.h) && epx.f(this.i, vdvVar.i) && epx.f(this.j, vdvVar.j) && Float.compare(this.k, vdvVar.k) == 0;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + io.reactivex.rxjava3.subjects.b.a(this.k, qr.a(this.j, e630.b(this.h.hashCode() * 31, 31, this.i), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalGalleryUiDto(entry=");
        sb.append(this.h);
        sb.append(", rootEntry=");
        sb.append(this.i);
        sb.append(", uiDtos=");
        sb.append(this.j);
        sb.append(", carouselRatio=");
        return shy.c(this.k, ", seqId=0)", sb);
    }
}
