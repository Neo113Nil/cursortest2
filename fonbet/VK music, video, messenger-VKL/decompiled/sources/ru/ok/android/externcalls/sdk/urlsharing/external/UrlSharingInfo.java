package ru.ok.android.externcalls.sdk.urlsharing.external;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.epx;

/* compiled from: UrlSharingInfo.kt */
/* loaded from: classes9.dex */
public final class UrlSharingInfo {
    private final ParticipantId initiatorId;
    private final String url;

    public UrlSharingInfo(String str, ParticipantId participantId) {
        this.url = str;
        this.initiatorId = participantId;
    }

    public static /* synthetic */ UrlSharingInfo copy$default(UrlSharingInfo urlSharingInfo, String str, ParticipantId participantId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urlSharingInfo.url;
        }
        if ((i & 2) != 0) {
            participantId = urlSharingInfo.initiatorId;
        }
        return urlSharingInfo.copy(str, participantId);
    }

    public final String component1() {
        return this.url;
    }

    public final ParticipantId component2() {
        return this.initiatorId;
    }

    public final UrlSharingInfo copy(String str, ParticipantId participantId) {
        return new UrlSharingInfo(str, participantId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlSharingInfo)) {
            return false;
        }
        UrlSharingInfo urlSharingInfo = (UrlSharingInfo) obj;
        return epx.f(this.url, urlSharingInfo.url) && epx.f(this.initiatorId, urlSharingInfo.initiatorId);
    }

    public final ParticipantId getInitiatorId() {
        return this.initiatorId;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        ParticipantId participantId = this.initiatorId;
        return hashCode + (participantId == null ? 0 : participantId.hashCode());
    }

    public String toString() {
        return "UrlSharingInfo(url=" + this.url + ", initiatorId=" + this.initiatorId + ")";
    }
}
