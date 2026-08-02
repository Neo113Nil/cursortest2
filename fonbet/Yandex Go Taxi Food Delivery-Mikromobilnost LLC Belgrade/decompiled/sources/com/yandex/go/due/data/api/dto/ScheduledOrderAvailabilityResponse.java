package com.yandex.go.due.data.api.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.v4m0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due/data/api/dto/ScheduledOrderAvailabilityResponse;", "", "Companion", "$serializer", "com/yandex/go/due/data/api/dto/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScheduledOrderAvailabilityResponse {
    public static final o Companion = new o();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v4m0(20)), null, null};
    public final String a;
    public final List b;
    public final UserInfo c;
    public final TimetableInfo d;

    public ScheduledOrderAvailabilityResponse(int i, String str, List list, UserInfo userInfo, TimetableInfo timetableInfo) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            UserInfo.Companion.getClass();
            this.c = UserInfo.f;
        } else {
            this.c = userInfo;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = timetableInfo;
        }
    }

    public ScheduledOrderAvailabilityResponse() {
        UserInfo.Companion.getClass();
        UserInfo userInfo = UserInfo.f;
        this.a = "";
        this.b = EmptyList.a;
        this.c = userInfo;
        this.d = null;
    }
}
