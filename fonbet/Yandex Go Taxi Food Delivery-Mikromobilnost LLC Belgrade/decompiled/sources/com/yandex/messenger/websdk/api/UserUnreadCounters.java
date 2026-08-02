package com.yandex.messenger.websdk.api;

import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messenger/websdk/api/UserUnreadCounters;", "", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class UserUnreadCounters {
    public final int a;
    public final int b;
    public final Integer c;
    public final Map d;
    public final Map e;

    public UserUnreadCounters(int i, int i2, Integer num, Map map, Map map2) {
        this.a = i;
        this.b = i2;
        this.c = num;
        this.d = map;
        this.e = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserUnreadCounters)) {
            return false;
        }
        UserUnreadCounters userUnreadCounters = (UserUnreadCounters) obj;
        return this.a == userUnreadCounters.a && this.b == userUnreadCounters.b && jl40.l(this.c, userUnreadCounters.c) && jl40.l(this.d, userUnreadCounters.d) && jl40.l(this.e, userUnreadCounters.e);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
        Integer num = this.c;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Map map = this.d;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.e;
        return hashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "UserUnreadCounters(messageCount=", ", chatCount=", ", messageCountInChat=");
        s.append(this.c);
        s.append(", messageCountForNamespaces=");
        s.append(this.d);
        s.append(", messageCountForBots=");
        return b64.r(s, this.e, Extension.C_BRAKE);
    }
}
