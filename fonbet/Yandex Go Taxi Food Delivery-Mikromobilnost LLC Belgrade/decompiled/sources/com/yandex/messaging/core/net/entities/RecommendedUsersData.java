package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ \u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R \u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/RecommendedUsersData;", "", CSPDirectoryConstants.SUBDIRECTORY_USERS, "", "Lcom/yandex/messaging/core/net/entities/RecommendedUser;", "<init>", "([Lcom/yandex/messaging/core/net/entities/RecommendedUser;)V", "getUsers", "()[Lcom/yandex/messaging/core/net/entities/RecommendedUser;", "[Lcom/yandex/messaging/core/net/entities/RecommendedUser;", "component1", "copy", "([Lcom/yandex/messaging/core/net/entities/RecommendedUser;)Lcom/yandex/messaging/core/net/entities/RecommendedUsersData;", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RecommendedUsersData {

    @Json(name = CSPDirectoryConstants.SUBDIRECTORY_USERS)
    private final RecommendedUser[] users;

    public RecommendedUsersData(RecommendedUser[] recommendedUserArr) {
        this.users = recommendedUserArr;
    }

    public static /* synthetic */ RecommendedUsersData copy$default(RecommendedUsersData recommendedUsersData, RecommendedUser[] recommendedUserArr, int i, Object obj) {
        if ((i & 1) != 0) {
            recommendedUserArr = recommendedUsersData.users;
        }
        return recommendedUsersData.copy(recommendedUserArr);
    }

    /* renamed from: component1, reason: from getter */
    public final RecommendedUser[] getUsers() {
        return this.users;
    }

    public final RecommendedUsersData copy(RecommendedUser[] users) {
        return new RecommendedUsersData(users);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RecommendedUsersData) && jl40.l(this.users, ((RecommendedUsersData) other).users);
    }

    public final RecommendedUser[] getUsers() {
        return this.users;
    }

    public int hashCode() {
        RecommendedUser[] recommendedUserArr = this.users;
        if (recommendedUserArr == null) {
            return 0;
        }
        return Arrays.hashCode(recommendedUserArr);
    }

    public String toString() {
        return oyr.p("RecommendedUsersData(users=", Arrays.toString(this.users), Extension.C_BRAKE);
    }
}
