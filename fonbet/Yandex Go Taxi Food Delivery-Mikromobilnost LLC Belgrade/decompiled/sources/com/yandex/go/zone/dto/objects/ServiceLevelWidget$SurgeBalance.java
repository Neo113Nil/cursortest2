package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/zone/dto/objects/ServiceLevelWidget$SurgeBalance", "Lcom/yandex/go/zone/dto/objects/f5;", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/d5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ServiceLevelWidget$SurgeBalance extends f5 {
    public static final d5 Companion = new d5();
    public final SurgeBalanceContent a;
    public final SurgeBalanceAccessibilityInfo b;
    public final kotlinx.serialization.json.b c;

    public ServiceLevelWidget$SurgeBalance(int i, SurgeBalanceContent surgeBalanceContent, SurgeBalanceAccessibilityInfo surgeBalanceAccessibilityInfo, kotlinx.serialization.json.b bVar) {
        this.a = (i & 1) == 0 ? new SurgeBalanceContent(0) : surgeBalanceContent;
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
        if (!(obj instanceof ServiceLevelWidget$SurgeBalance)) {
            return false;
        }
        ServiceLevelWidget$SurgeBalance serviceLevelWidget$SurgeBalance = (ServiceLevelWidget$SurgeBalance) obj;
        return jl40.l(this.a, serviceLevelWidget$SurgeBalance.a) && jl40.l(this.b, serviceLevelWidget$SurgeBalance.b) && jl40.l(this.c, serviceLevelWidget$SurgeBalance.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        kotlinx.serialization.json.b bVar = this.c;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "SurgeBalance(content=" + this.a + ", accessibilityInfo=" + this.b + ", payload=" + this.c + Extension.C_BRAKE;
    }

    public ServiceLevelWidget$SurgeBalance() {
        SurgeBalanceContent surgeBalanceContent = new SurgeBalanceContent(0);
        SurgeBalanceAccessibilityInfo surgeBalanceAccessibilityInfo = new SurgeBalanceAccessibilityInfo(0);
        this.a = surgeBalanceContent;
        this.b = surgeBalanceAccessibilityInfo;
        this.c = null;
    }
}
