package defpackage;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersLocationCardButtonNameV3;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersLocationCardCloseReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersLocationCardOpenReasonV2;
import com.yandex.go.chargers.station.api.ChargersStationOpenReason;

/* loaded from: classes12.dex */
public final class jra {
    public final em9 a;
    public ChargersAnalytics$ChargersLocationCardCloseReason b;
    public String c;
    public boolean d;

    public jra(em9 em9Var) {
        this.a = em9Var;
    }

    public static ChargersAnalytics$ChargersLocationCardOpenReasonV2 b(ChargersStationOpenReason chargersStationOpenReason) {
        int i = ira.a[chargersStationOpenReason.ordinal()];
        if (i == 1) {
            return ChargersAnalytics$ChargersLocationCardOpenReasonV2.Map;
        }
        if (i == 2) {
            return ChargersAnalytics$ChargersLocationCardOpenReasonV2.BackFromCamera;
        }
        if (i == 3) {
            return ChargersAnalytics$ChargersLocationCardOpenReasonV2.Deeplink;
        }
        if (i == 4) {
            return ChargersAnalytics$ChargersLocationCardOpenReasonV2.BLEPush;
        }
        if (i == 5) {
            return ChargersAnalytics$ChargersLocationCardOpenReasonV2.DiscountsAndPromocodes;
        }
        w511.b();
        return null;
    }

    public final void a(ChargersAnalytics$ChargersLocationCardButtonNameV3 chargersAnalytics$ChargersLocationCardButtonNameV3) {
        this.a.m(chargersAnalytics$ChargersLocationCardButtonNameV3, this.d, null, this.c);
    }
}
