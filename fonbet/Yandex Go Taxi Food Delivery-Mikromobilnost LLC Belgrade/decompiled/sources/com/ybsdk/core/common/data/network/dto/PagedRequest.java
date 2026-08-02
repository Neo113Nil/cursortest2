package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/PagedRequest;", "", "pageSize", "", "cursor", "", "<init>", "(ILjava/lang/String;)V", "getPageSize", "()I", "getCursor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PagedRequest {
    private final String cursor;
    private final int pageSize;

    public /* synthetic */ PagedRequest(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str);
    }

    public static /* synthetic */ PagedRequest copy$default(PagedRequest pagedRequest, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pagedRequest.pageSize;
        }
        if ((i2 & 2) != 0) {
            str = pagedRequest.cursor;
        }
        return pagedRequest.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    public final PagedRequest copy(@Json(name = "page_size") int pageSize, @Json(name = "cursor") String cursor) {
        return new PagedRequest(pageSize, cursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PagedRequest)) {
            return false;
        }
        PagedRequest pagedRequest = (PagedRequest) other;
        return this.pageSize == pagedRequest.pageSize && jl40.l(this.cursor, pagedRequest.cursor);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.pageSize) * 31;
        String str = this.cursor;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return oyr.l(this.pageSize, "PagedRequest(pageSize=", ", cursor=", this.cursor, Extension.C_BRAKE);
    }

    public PagedRequest(@Json(name = "page_size") int i, @Json(name = "cursor") String str) {
        this.pageSize = i;
        this.cursor = str;
    }
}
