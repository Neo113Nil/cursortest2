package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.qv10;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/TooltipShownInfo;", "", "persistenceKey", "", "counter", "", "<init>", "(Ljava/lang/String;I)V", "getPersistenceKey", "()Ljava/lang/String;", "getCounter", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TooltipShownInfo {
    private final int counter;
    private final String persistenceKey;

    public TooltipShownInfo(@Json(name = "persistence_key") String str, @Json(name = "counter") int i) {
        this.persistenceKey = str;
        this.counter = i;
    }

    public static /* synthetic */ TooltipShownInfo copy$default(TooltipShownInfo tooltipShownInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tooltipShownInfo.persistenceKey;
        }
        if ((i2 & 2) != 0) {
            i = tooltipShownInfo.counter;
        }
        return tooltipShownInfo.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPersistenceKey() {
        return this.persistenceKey;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCounter() {
        return this.counter;
    }

    public final TooltipShownInfo copy(@Json(name = "persistence_key") String persistenceKey, @Json(name = "counter") int counter) {
        return new TooltipShownInfo(persistenceKey, counter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TooltipShownInfo)) {
            return false;
        }
        TooltipShownInfo tooltipShownInfo = (TooltipShownInfo) other;
        return jl40.l(this.persistenceKey, tooltipShownInfo.persistenceKey) && this.counter == tooltipShownInfo.counter;
    }

    public final int getCounter() {
        return this.counter;
    }

    public final String getPersistenceKey() {
        return this.persistenceKey;
    }

    public int hashCode() {
        return Integer.hashCode(this.counter) + (this.persistenceKey.hashCode() * 31);
    }

    public String toString() {
        return qv10.i(this.counter, "TooltipShownInfo(persistenceKey=", this.persistenceKey, ", counter=", Extension.C_BRAKE);
    }
}
