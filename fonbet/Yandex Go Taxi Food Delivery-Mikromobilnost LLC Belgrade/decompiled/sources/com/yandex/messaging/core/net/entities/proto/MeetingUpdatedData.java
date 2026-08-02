package com.yandex.messaging.core.net.entities.proto;

import com.yandex.messaging.core.net.entities.StateSyncDiff;
import com.yandex.messaging.core.net.entities.proto.telemost.MeetingInfoRegistryResponse;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/MeetingUpdatedData;", "Lcom/yandex/messaging/core/net/entities/StateSyncDiff;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MeetingUpdatedData implements StateSyncDiff {
    public final MeetingInfoRegistryResponse a;

    public MeetingUpdatedData(MeetingInfoRegistryResponse meetingInfoRegistryResponse) {
        this.a = meetingInfoRegistryResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MeetingUpdatedData) && this.a == ((MeetingUpdatedData) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.yandex.messaging.core.net.entities.StateSyncDiff
    public final void sync(StateSyncDiff.Handler handler) {
        handler.c(this);
    }

    public final String toString() {
        return "MeetingUpdatedData(meetingInfo=" + this.a + Extension.C_BRAKE;
    }
}
