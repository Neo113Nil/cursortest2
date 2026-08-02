package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.cex;
import defpackage.jl40;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/StaffUserDataData;", "", "user", "Lcom/yandex/messaging/core/net/entities/UserData;", "<init>", "(Lcom/yandex/messaging/core/net/entities/UserData;)V", "getUser", "()Lcom/yandex/messaging/core/net/entities/UserData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class StaffUserDataData {

    @cex
    private final UserData user;

    public StaffUserDataData(@Json(name = "user") UserData userData) {
        this.user = userData;
    }

    public static /* synthetic */ StaffUserDataData copy$default(StaffUserDataData staffUserDataData, UserData userData, int i, Object obj) {
        if ((i & 1) != 0) {
            userData = staffUserDataData.user;
        }
        return staffUserDataData.copy(userData);
    }

    /* renamed from: component1, reason: from getter */
    public final UserData getUser() {
        return this.user;
    }

    public final StaffUserDataData copy(@Json(name = "user") UserData user) {
        return new StaffUserDataData(user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StaffUserDataData) && jl40.l(this.user, ((StaffUserDataData) other).user);
    }

    public final UserData getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.user.hashCode();
    }

    public String toString() {
        return "StaffUserDataData(user=" + this.user + Extension.C_BRAKE;
    }
}
