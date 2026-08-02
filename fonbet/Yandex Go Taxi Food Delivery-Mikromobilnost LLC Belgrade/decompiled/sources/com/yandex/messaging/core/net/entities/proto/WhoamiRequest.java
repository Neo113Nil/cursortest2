package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/WhoamiRequest;", "", "guid", "", "commonFields", "Lcom/yandex/messaging/core/net/entities/proto/CommonRequestFields;", "<init>", "(Ljava/lang/String;Lcom/yandex/messaging/core/net/entities/proto/CommonRequestFields;)V", "getGuid", "()Ljava/lang/String;", "setGuid", "(Ljava/lang/String;)V", "getCommonFields", "()Lcom/yandex/messaging/core/net/entities/proto/CommonRequestFields;", "setCommonFields", "(Lcom/yandex/messaging/core/net/entities/proto/CommonRequestFields;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class WhoamiRequest {

    @xuf0(tag = 2)
    private CommonRequestFields commonFields;

    @xuf0(tag = 1)
    private String guid;

    public /* synthetic */ WhoamiRequest(String str, CommonRequestFields commonRequestFields, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : commonRequestFields);
    }

    public static /* synthetic */ WhoamiRequest copy$default(WhoamiRequest whoamiRequest, String str, CommonRequestFields commonRequestFields, int i, Object obj) {
        if ((i & 1) != 0) {
            str = whoamiRequest.guid;
        }
        if ((i & 2) != 0) {
            commonRequestFields = whoamiRequest.commonFields;
        }
        return whoamiRequest.copy(str, commonRequestFields);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* renamed from: component2, reason: from getter */
    public final CommonRequestFields getCommonFields() {
        return this.commonFields;
    }

    public final WhoamiRequest copy(@Json(name = "Guid") String guid, @Json(name = "CommonRequestFields") CommonRequestFields commonFields) {
        return new WhoamiRequest(guid, commonFields);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoamiRequest)) {
            return false;
        }
        WhoamiRequest whoamiRequest = (WhoamiRequest) other;
        return jl40.l(this.guid, whoamiRequest.guid) && jl40.l(this.commonFields, whoamiRequest.commonFields);
    }

    public final CommonRequestFields getCommonFields() {
        return this.commonFields;
    }

    public final String getGuid() {
        return this.guid;
    }

    public int hashCode() {
        String str = this.guid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CommonRequestFields commonRequestFields = this.commonFields;
        return hashCode + (commonRequestFields != null ? commonRequestFields.hashCode() : 0);
    }

    public final void setCommonFields(CommonRequestFields commonRequestFields) {
        this.commonFields = commonRequestFields;
    }

    public final void setGuid(String str) {
        this.guid = str;
    }

    public String toString() {
        return "WhoamiRequest(guid=" + this.guid + ", commonFields=" + this.commonFields + Extension.C_BRAKE;
    }

    public WhoamiRequest(@Json(name = "Guid") String str, @Json(name = "CommonRequestFields") CommonRequestFields commonRequestFields) {
        this.guid = str;
        this.commonFields = commonRequestFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WhoamiRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
