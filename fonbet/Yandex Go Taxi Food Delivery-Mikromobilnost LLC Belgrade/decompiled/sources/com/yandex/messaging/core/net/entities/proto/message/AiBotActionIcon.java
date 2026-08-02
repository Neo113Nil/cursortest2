package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.xuf0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/AiBotActionIcon;", "", "type", "", "value", "<init>", "(II)V", "getType", "()I", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AiBotActionIcon {

    @xuf0(tag = 1)
    private final int type;

    @xuf0(tag = 2)
    private final int value;

    public AiBotActionIcon(@Json(name = "Type") int i, @Json(name = "Value") int i2) {
        this.type = i;
        this.value = i2;
    }

    public static /* synthetic */ AiBotActionIcon copy$default(AiBotActionIcon aiBotActionIcon, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = aiBotActionIcon.type;
        }
        if ((i3 & 2) != 0) {
            i2 = aiBotActionIcon.value;
        }
        return aiBotActionIcon.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final AiBotActionIcon copy(@Json(name = "Type") int type, @Json(name = "Value") int value) {
        return new AiBotActionIcon(type, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiBotActionIcon)) {
            return false;
        }
        AiBotActionIcon aiBotActionIcon = (AiBotActionIcon) other;
        return this.type == aiBotActionIcon.type && this.value == aiBotActionIcon.value;
    }

    public final int getType() {
        return this.type;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value) + (Integer.hashCode(this.type) * 31);
    }

    public String toString() {
        return b64.d(this.type, this.value, "AiBotActionIcon(type=", ", value=", Extension.C_BRAKE);
    }
}
