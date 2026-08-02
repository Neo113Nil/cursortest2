package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/SupportChatResponse;", "", "opened", "", "Lcom/ybsdk/network/dto/ChatShort;", "closed", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getOpened", "()Ljava/util/List;", "getClosed", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SupportChatResponse {
    private final List<ChatShort> closed;
    private final List<ChatShort> opened;

    public SupportChatResponse(@Json(name = "opened") List<ChatShort> list, @Json(name = "closed") List<ChatShort> list2) {
        this.opened = list;
        this.closed = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportChatResponse copy$default(SupportChatResponse supportChatResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = supportChatResponse.opened;
        }
        if ((i & 2) != 0) {
            list2 = supportChatResponse.closed;
        }
        return supportChatResponse.copy(list, list2);
    }

    public final List<ChatShort> component1() {
        return this.opened;
    }

    public final List<ChatShort> component2() {
        return this.closed;
    }

    public final SupportChatResponse copy(@Json(name = "opened") List<ChatShort> opened, @Json(name = "closed") List<ChatShort> closed) {
        return new SupportChatResponse(opened, closed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportChatResponse)) {
            return false;
        }
        SupportChatResponse supportChatResponse = (SupportChatResponse) other;
        return jl40.l(this.opened, supportChatResponse.opened) && jl40.l(this.closed, supportChatResponse.closed);
    }

    public final List<ChatShort> getClosed() {
        return this.closed;
    }

    public final List<ChatShort> getOpened() {
        return this.opened;
    }

    public int hashCode() {
        int hashCode = this.opened.hashCode() * 31;
        List<ChatShort> list = this.closed;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return xvz.l("SupportChatResponse(opened=", this.opened, ", closed=", this.closed, Extension.C_BRAKE);
    }
}
