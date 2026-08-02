package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.nzs;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/yandex/messaging/core/net/entities/RemoveDisplayRestrictionParams;", "", "value", "", "<init>", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RemoveDisplayRestrictionParams {
    private final boolean value;

    public RemoveDisplayRestrictionParams(@Json(name = "value") boolean z) {
        this.value = z;
    }

    public static /* synthetic */ RemoveDisplayRestrictionParams copy$default(RemoveDisplayRestrictionParams removeDisplayRestrictionParams, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = removeDisplayRestrictionParams.value;
        }
        return removeDisplayRestrictionParams.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    public final RemoveDisplayRestrictionParams copy(@Json(name = "value") boolean value) {
        return new RemoveDisplayRestrictionParams(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RemoveDisplayRestrictionParams) && this.value == ((RemoveDisplayRestrictionParams) other).value;
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        return Boolean.hashCode(this.value);
    }

    public String toString() {
        return nzs.b("RemoveDisplayRestrictionParams(value=", Extension.C_BRAKE, this.value);
    }
}
