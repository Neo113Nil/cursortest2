package defpackage;

import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse;

/* loaded from: classes9.dex */
public final class i540 {
    public static final /* synthetic */ int b = 0;
    public final MtSummaryCommunicationsResponse a;

    static {
        c540 c540Var = MtSummaryCommunicationsResponse.Companion;
    }

    public i540(MtSummaryCommunicationsResponse mtSummaryCommunicationsResponse) {
        this.a = mtSummaryCommunicationsResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i540) && jl40.l(this.a, ((i540) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "MtSummaryPromotionsInfoDto(response=" + this.a + ", isDataLoading=false)";
    }
}
