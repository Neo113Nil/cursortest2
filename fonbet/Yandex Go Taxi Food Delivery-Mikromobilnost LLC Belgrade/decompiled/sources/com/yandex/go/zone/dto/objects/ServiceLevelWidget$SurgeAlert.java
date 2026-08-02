package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/zone/dto/objects/ServiceLevelWidget$SurgeAlert", "Lcom/yandex/go/zone/dto/objects/f5;", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/c5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ServiceLevelWidget$SurgeAlert extends f5 {
    public static final c5 Companion = new c5();
    public final SurgeAlertContent a;
    public final SurgeBalanceAccessibilityInfo b;
    public final kotlinx.serialization.json.b c;

    public ServiceLevelWidget$SurgeAlert(int i, SurgeAlertContent surgeAlertContent, SurgeBalanceAccessibilityInfo surgeBalanceAccessibilityInfo, kotlinx.serialization.json.b bVar) {
        this.a = (i & 1) == 0 ? new SurgeAlertContent(0) : surgeAlertContent;
        if ((i & 2) == 0) {
            this.b = new SurgeBalanceAccessibilityInfo(0);
        } else {
            this.b = surgeBalanceAccessibilityInfo;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceLevelWidget$SurgeAlert)) {
            return false;
        }
        ServiceLevelWidget$SurgeAlert serviceLevelWidget$SurgeAlert = (ServiceLevelWidget$SurgeAlert) obj;
        return jl40.l(this.a, serviceLevelWidget$SurgeAlert.a) && jl40.l(this.b, serviceLevelWidget$SurgeAlert.b) && jl40.l(this.c, serviceLevelWidget$SurgeAlert.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        kotlinx.serialization.json.b bVar = this.c;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "SurgeAlert(content=" + this.a + ", accessibilityInfo=" + this.b + ", payload=" + this.c + Extension.C_BRAKE;
    }

    public ServiceLevelWidget$SurgeAlert() {
        SurgeAlertContent surgeAlertContent = new SurgeAlertContent(0);
        SurgeBalanceAccessibilityInfo surgeBalanceAccessibilityInfo = new SurgeBalanceAccessibilityInfo(0);
        this.a = surgeAlertContent;
        this.b = surgeBalanceAccessibilityInfo;
        this.c = null;
    }
}
