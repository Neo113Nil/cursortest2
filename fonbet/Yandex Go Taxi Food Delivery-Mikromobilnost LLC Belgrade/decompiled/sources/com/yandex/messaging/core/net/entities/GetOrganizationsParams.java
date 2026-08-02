package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetOrganizationsParams;", "", "ids", "", "", "chatId", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getIds", "()Ljava/util/List;", "getChatId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GetOrganizationsParams {
    private final String chatId;
    private final List<Long> ids;

    public GetOrganizationsParams(@Json(name = "organization_ids") List<Long> list, @Json(name = "chat_id") String str) {
        this.ids = list;
        this.chatId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetOrganizationsParams copy$default(GetOrganizationsParams getOrganizationsParams, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getOrganizationsParams.ids;
        }
        if ((i & 2) != 0) {
            str = getOrganizationsParams.chatId;
        }
        return getOrganizationsParams.copy(list, str);
    }

    public final List<Long> component1() {
        return this.ids;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    public final GetOrganizationsParams copy(@Json(name = "organization_ids") List<Long> ids, @Json(name = "chat_id") String chatId) {
        return new GetOrganizationsParams(ids, chatId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetOrganizationsParams)) {
            return false;
        }
        GetOrganizationsParams getOrganizationsParams = (GetOrganizationsParams) other;
        return jl40.l(this.ids, getOrganizationsParams.ids) && jl40.l(this.chatId, getOrganizationsParams.chatId);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final List<Long> getIds() {
        return this.ids;
    }

    public int hashCode() {
        int hashCode = this.ids.hashCode() * 31;
        String str = this.chatId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return xvz.i("GetOrganizationsParams(ids=", ", chatId=", this.chatId, Extension.C_BRAKE, this.ids);
    }
}
