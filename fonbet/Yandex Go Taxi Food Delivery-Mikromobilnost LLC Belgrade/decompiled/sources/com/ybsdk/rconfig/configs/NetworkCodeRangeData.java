package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/rconfig/configs/NetworkCodeRangeData;", "", "lowerBound", "", "upperBound", "<init>", "(II)V", "getLowerBound", "()I", "getUpperBound", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NetworkCodeRangeData {

    @Json(name = "lower_bound")
    private final int lowerBound;

    @Json(name = "upper_bound")
    private final int upperBound;

    public NetworkCodeRangeData(int i, int i2) {
        this.lowerBound = i;
        this.upperBound = i2;
    }

    public static /* synthetic */ NetworkCodeRangeData copy$default(NetworkCodeRangeData networkCodeRangeData, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = networkCodeRangeData.lowerBound;
        }
        if ((i3 & 2) != 0) {
            i2 = networkCodeRangeData.upperBound;
        }
        return networkCodeRangeData.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLowerBound() {
        return this.lowerBound;
    }

    /* renamed from: component2, reason: from getter */
    public final int getUpperBound() {
        return this.upperBound;
    }

    public final NetworkCodeRangeData copy(int lowerBound, int upperBound) {
        return new NetworkCodeRangeData(lowerBound, upperBound);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkCodeRangeData)) {
            return false;
        }
        NetworkCodeRangeData networkCodeRangeData = (NetworkCodeRangeData) other;
        return this.lowerBound == networkCodeRangeData.lowerBound && this.upperBound == networkCodeRangeData.upperBound;
    }

    public final int getLowerBound() {
        return this.lowerBound;
    }

    public final int getUpperBound() {
        return this.upperBound;
    }

    public int hashCode() {
        return Integer.hashCode(this.upperBound) + (Integer.hashCode(this.lowerBound) * 31);
    }

    public String toString() {
        return b64.d(this.lowerBound, this.upperBound, "NetworkCodeRangeData(lowerBound=", ", upperBound=", Extension.C_BRAKE);
    }
}
