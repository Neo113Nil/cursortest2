package com.yandex.delivery.utils.push.impl;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.u2g0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0007J\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"com/yandex/delivery/utils/push/impl/PushPayloadDto$JournalUpdated", "Lu2g0;", "", "type", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "Lcom/yandex/delivery/utils/push/impl/PushPayloadDto$JournalUpdated;", "copy", "(Ljava/lang/String;)Lcom/yandex/delivery/utils/push/impl/PushPayloadDto$JournalUpdated;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", Constants.PUSH}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PushPayloadDto$JournalUpdated extends u2g0 {
    private final String type;

    public PushPayloadDto$JournalUpdated(@Json(name = "type") String str) {
        this.type = str;
    }

    public static /* synthetic */ PushPayloadDto$JournalUpdated copy$default(PushPayloadDto$JournalUpdated pushPayloadDto$JournalUpdated, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushPayloadDto$JournalUpdated.type;
        }
        return pushPayloadDto$JournalUpdated.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final PushPayloadDto$JournalUpdated copy(@Json(name = "type") String type) {
        return new PushPayloadDto$JournalUpdated(type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PushPayloadDto$JournalUpdated) && jl40.l(this.type, ((PushPayloadDto$JournalUpdated) other).type);
    }

    @Override // defpackage.u2g0
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public String toString() {
        return oyr.p("JournalUpdated(type=", this.type, Extension.C_BRAKE);
    }
}
