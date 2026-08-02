package com.yandex.messaging.core.net.entities.proto.telemost;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.xuf0;
import java.util.Arrays;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ*\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingEndRingingMessage;", "", CRLReasonCodeExtension.REASON, "", "supportedFeatures", "", "<init>", "(I[Ljava/lang/Integer;)V", "getReason", "()I", "getSupportedFeatures", "()[Ljava/lang/Integer;", "[Ljava/lang/Integer;", "component1", "component2", "copy", "(I[Ljava/lang/Integer;)Lcom/yandex/messaging/core/net/entities/proto/telemost/MeetingEndRingingMessage;", "equals", "", "other", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MeetingEndRingingMessage {

    @xuf0(tag = 1)
    private final int reason;

    @xuf0(tag = 2)
    private final Integer[] supportedFeatures;

    public MeetingEndRingingMessage(@Json(name = "Reason") int i, @Json(name = "SupportedFeatures") Integer[] numArr) {
        this.reason = i;
        this.supportedFeatures = numArr;
    }

    public static /* synthetic */ MeetingEndRingingMessage copy$default(MeetingEndRingingMessage meetingEndRingingMessage, int i, Integer[] numArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = meetingEndRingingMessage.reason;
        }
        if ((i2 & 2) != 0) {
            numArr = meetingEndRingingMessage.supportedFeatures;
        }
        return meetingEndRingingMessage.copy(i, numArr);
    }

    /* renamed from: component1, reason: from getter */
    public final int getReason() {
        return this.reason;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer[] getSupportedFeatures() {
        return this.supportedFeatures;
    }

    public final MeetingEndRingingMessage copy(@Json(name = "Reason") int reason, @Json(name = "SupportedFeatures") Integer[] supportedFeatures) {
        return new MeetingEndRingingMessage(reason, supportedFeatures);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeetingEndRingingMessage)) {
            return false;
        }
        MeetingEndRingingMessage meetingEndRingingMessage = (MeetingEndRingingMessage) other;
        return this.reason == meetingEndRingingMessage.reason && jl40.l(this.supportedFeatures, meetingEndRingingMessage.supportedFeatures);
    }

    public final int getReason() {
        return this.reason;
    }

    public final Integer[] getSupportedFeatures() {
        return this.supportedFeatures;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.reason) * 31;
        Integer[] numArr = this.supportedFeatures;
        return hashCode + (numArr == null ? 0 : Arrays.hashCode(numArr));
    }

    public String toString() {
        return oyr.l(this.reason, "MeetingEndRingingMessage(reason=", ", supportedFeatures=", Arrays.toString(this.supportedFeatures), Extension.C_BRAKE);
    }
}
