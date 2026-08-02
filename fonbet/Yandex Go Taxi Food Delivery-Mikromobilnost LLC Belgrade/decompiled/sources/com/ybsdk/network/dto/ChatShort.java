package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.kju0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/ybsdk/network/dto/ChatShort;", "", "name", "", "created", "chatName", "handlerType", Constants.KEY_SERVICE, kju0.j, "Lcom/ybsdk/network/dto/ChatMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/network/dto/ChatMetadata;)V", "getName", "()Ljava/lang/String;", "getCreated", "getChatName", "getHandlerType", "getService", "getMetadata", "()Lcom/ybsdk/network/dto/ChatMetadata;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChatShort {
    private final String chatName;
    private final String created;
    private final String handlerType;
    private final ChatMetadata metadata;
    private final String name;
    private final String service;

    public ChatShort(@Json(name = "chat_id") String str, @Json(name = "created") String str2, @Json(name = "chat_name") String str3, @Json(name = "handler_type") String str4, @Json(name = "service") String str5, @Json(name = "metadata") ChatMetadata chatMetadata) {
        this.name = str;
        this.created = str2;
        this.chatName = str3;
        this.handlerType = str4;
        this.service = str5;
        this.metadata = chatMetadata;
    }

    public static /* synthetic */ ChatShort copy$default(ChatShort chatShort, String str, String str2, String str3, String str4, String str5, ChatMetadata chatMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatShort.name;
        }
        if ((i & 2) != 0) {
            str2 = chatShort.created;
        }
        if ((i & 4) != 0) {
            str3 = chatShort.chatName;
        }
        if ((i & 8) != 0) {
            str4 = chatShort.handlerType;
        }
        if ((i & 16) != 0) {
            str5 = chatShort.service;
        }
        if ((i & 32) != 0) {
            chatMetadata = chatShort.metadata;
        }
        String str6 = str5;
        ChatMetadata chatMetadata2 = chatMetadata;
        return chatShort.copy(str, str2, str3, str4, str6, chatMetadata2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCreated() {
        return this.created;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChatName() {
        return this.chatName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHandlerType() {
        return this.handlerType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getService() {
        return this.service;
    }

    /* renamed from: component6, reason: from getter */
    public final ChatMetadata getMetadata() {
        return this.metadata;
    }

    public final ChatShort copy(@Json(name = "chat_id") String name, @Json(name = "created") String created, @Json(name = "chat_name") String chatName, @Json(name = "handler_type") String handlerType, @Json(name = "service") String service, @Json(name = "metadata") ChatMetadata metadata) {
        return new ChatShort(name, created, chatName, handlerType, service, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatShort)) {
            return false;
        }
        ChatShort chatShort = (ChatShort) other;
        return jl40.l(this.name, chatShort.name) && jl40.l(this.created, chatShort.created) && jl40.l(this.chatName, chatShort.chatName) && jl40.l(this.handlerType, chatShort.handlerType) && jl40.l(this.service, chatShort.service) && jl40.l(this.metadata, chatShort.metadata);
    }

    public final String getChatName() {
        return this.chatName;
    }

    public final String getCreated() {
        return this.created;
    }

    public final String getHandlerType() {
        return this.handlerType;
    }

    public final ChatMetadata getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final String getService() {
        return this.service;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.created;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chatName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.handlerType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.service;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ChatMetadata chatMetadata = this.metadata;
        return hashCode5 + (chatMetadata != null ? chatMetadata.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.created;
        String str3 = this.chatName;
        String str4 = this.handlerType;
        String str5 = this.service;
        ChatMetadata chatMetadata = this.metadata;
        StringBuilder v = b64.v("ChatShort(name=", str, ", created=", str2, ", chatName=");
        g8e.D(v, str3, ", handlerType=", str4, ", service=");
        v.append(str5);
        v.append(", metadata=");
        v.append(chatMetadata);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
