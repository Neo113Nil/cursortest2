package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/PagingData;", "", "limit", "", "cursor", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCursor", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/ybsdk/feature/dashboard/internal/data/dto/PagingData;", "equals", "", "other", "hashCode", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PagingData {
    private final String cursor;
    private final Integer limit;

    public PagingData(@Json(name = "limit") Integer num, @Json(name = "cursor") String str) {
        this.limit = num;
        this.cursor = str;
    }

    public static /* synthetic */ PagingData copy$default(PagingData pagingData, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = pagingData.limit;
        }
        if ((i & 2) != 0) {
            str = pagingData.cursor;
        }
        return pagingData.copy(num, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    public final PagingData copy(@Json(name = "limit") Integer limit, @Json(name = "cursor") String cursor) {
        return new PagingData(limit, cursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PagingData)) {
            return false;
        }
        PagingData pagingData = (PagingData) other;
        return jl40.l(this.limit, pagingData.limit) && jl40.l(this.cursor, pagingData.cursor);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public int hashCode() {
        Integer num = this.limit;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.cursor;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PagingData(limit=" + this.limit + ", cursor=" + this.cursor + Extension.C_BRAKE;
    }
}
