package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/ChatEventTypes;", "", "types", "", "version", "<init>", "(JJ)V", "getTypes", "()J", "getVersion", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ChatEventTypes {

    @xuf0(tag = 1)
    private final long types;

    @xuf0(tag = 2)
    private final long version;

    public ChatEventTypes(@Json(name = "types") long j, @Json(name = "version") long j2) {
        this.types = j;
        this.version = j2;
    }

    public static /* synthetic */ ChatEventTypes copy$default(ChatEventTypes chatEventTypes, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = chatEventTypes.types;
        }
        if ((i & 2) != 0) {
            j2 = chatEventTypes.version;
        }
        return chatEventTypes.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTypes() {
        return this.types;
    }

    /* renamed from: component2, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    public final ChatEventTypes copy(@Json(name = "types") long types, @Json(name = "version") long version) {
        return new ChatEventTypes(types, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEventTypes)) {
            return false;
        }
        ChatEventTypes chatEventTypes = (ChatEventTypes) other;
        return this.types == chatEventTypes.types && this.version == chatEventTypes.version;
    }

    public final long getTypes() {
        return this.types;
    }

    public final long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Long.hashCode(this.version) + (Long.hashCode(this.types) * 31);
    }

    public String toString() {
        return oyr.n(this.version, Extension.C_BRAKE, unr0.w(this.types, "ChatEventTypes(types=", ", version="));
    }
}
