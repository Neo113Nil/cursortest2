package com.ybsdk.feature.dashboard.internal.domain.entities;

import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.n;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class DashboardCardInfoEntity {
    public final int a;
    public final int b;
    public final String c;
    public final Themes d;
    public final String e;
    public final boolean f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/domain/entities/DashboardCardInfoEntity$CardStatus;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "CLOSED", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CardStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CardStatus[] $VALUES;
        public static final CardStatus LOADING = new CardStatus("LOADING", 0);
        public static final CardStatus CLOSED = new CardStatus("CLOSED", 1);

        private static final /* synthetic */ CardStatus[] $values() {
            return new CardStatus[]{LOADING, CLOSED};
        }

        static {
            CardStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private CardStatus(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static CardStatus valueOf(String str) {
            return (CardStatus) Enum.valueOf(CardStatus.class, str);
        }

        public static CardStatus[] values() {
            return (CardStatus[]) $VALUES.clone();
        }
    }

    public DashboardCardInfoEntity(int i, int i2, String str, Themes themes, String str2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = themes;
        this.e = str2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashboardCardInfoEntity)) {
            return false;
        }
        DashboardCardInfoEntity dashboardCardInfoEntity = (DashboardCardInfoEntity) obj;
        return this.a == dashboardCardInfoEntity.a && this.b == dashboardCardInfoEntity.b && jl40.l(this.c, dashboardCardInfoEntity.c) && jl40.l(this.d, dashboardCardInfoEntity.d) && jl40.l(this.e, dashboardCardInfoEntity.e) && this.f == dashboardCardInfoEntity.f;
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Themes themes = this.d;
        return Boolean.hashCode(this.f) + unr0.b((hashCode + (themes != null ? themes.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "DashboardCardInfoEntity(cardCount=", ", promoCount=", ", action=");
        n.B(s, this.c, ", image=", this.d, ", status=");
        return nnm.i(this.e, ", hasPlasticCard=", Extension.C_BRAKE, s, this.f);
    }

    public DashboardCardInfoEntity() {
        this(0, 0, null, null, "LOADING", false);
    }
}
