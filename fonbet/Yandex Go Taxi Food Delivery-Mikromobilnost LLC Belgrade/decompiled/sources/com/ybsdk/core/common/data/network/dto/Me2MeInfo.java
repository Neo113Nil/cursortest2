package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/Me2MeInfo;", "", "partnerId", "", "<init>", "(Ljava/lang/String;)V", "getPartnerId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Me2MeInfo {
    private final String partnerId;

    public Me2MeInfo(@Json(name = "JSON_FIELD_MEMBER_ID") String str) {
        this.partnerId = str;
    }

    public static /* synthetic */ Me2MeInfo copy$default(Me2MeInfo me2MeInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = me2MeInfo.partnerId;
        }
        return me2MeInfo.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPartnerId() {
        return this.partnerId;
    }

    public final Me2MeInfo copy(@Json(name = "JSON_FIELD_MEMBER_ID") String partnerId) {
        return new Me2MeInfo(partnerId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Me2MeInfo) && jl40.l(this.partnerId, ((Me2MeInfo) other).partnerId);
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public int hashCode() {
        return this.partnerId.hashCode();
    }

    public String toString() {
        return oyr.p("Me2MeInfo(partnerId=", this.partnerId, Extension.C_BRAKE);
    }
}
