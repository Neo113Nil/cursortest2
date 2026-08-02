package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.xuf0;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/PrivateChatInfoFromTransport;", "", "organizationIds", "", "version", "", "federative", "", "hasGuests", "<init>", "([JJZZ)V", "getOrganizationIds", "()[J", "getVersion", "()J", "getFederative", "()Z", "getHasGuests", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PrivateChatInfoFromTransport {

    @xuf0(tag = 3)
    private final boolean federative;

    @xuf0(tag = 4)
    private final boolean hasGuests;

    @xuf0(tag = 1)
    private final long[] organizationIds;

    @xuf0(tag = 2)
    private final long version;

    public PrivateChatInfoFromTransport(@Json(name = "OrganizationIds") long[] jArr, @Json(name = "Version") long j, @Json(name = "Federative") boolean z, @Json(name = "HasGuests") boolean z2) {
        this.organizationIds = jArr;
        this.version = j;
        this.federative = z;
        this.hasGuests = z2;
    }

    public final boolean getFederative() {
        return this.federative;
    }

    public final boolean getHasGuests() {
        return this.hasGuests;
    }

    public final long[] getOrganizationIds() {
        return this.organizationIds;
    }

    public final long getVersion() {
        return this.version;
    }
}
