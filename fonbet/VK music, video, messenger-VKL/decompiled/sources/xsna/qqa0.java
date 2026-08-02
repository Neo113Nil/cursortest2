package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;

/* compiled from: PlaceChipUiDto.kt */
/* loaded from: classes4.dex */
public final class qqa0 {
    public final String a;
    public final PostingPlaceDto b;

    public qqa0(String str, PostingPlaceDto postingPlaceDto) {
        this.a = str;
        this.b = postingPlaceDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqa0)) {
            return false;
        }
        qqa0 qqa0Var = (qqa0) obj;
        return epx.f(this.a, qqa0Var.a) && epx.f(this.b, qqa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceChipUiDto(title=" + this.a + ", place=" + this.b + ')';
    }
}
