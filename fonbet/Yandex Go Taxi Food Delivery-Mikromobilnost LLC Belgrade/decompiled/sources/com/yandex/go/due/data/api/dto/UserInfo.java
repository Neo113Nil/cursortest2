package com.yandex.go.due.data.api.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.z121;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due/data/api/dto/UserInfo;", "", "Companion", "com/yandex/go/due/data/api/dto/w", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserInfo {
    public static final w Companion = new w();
    public static final i3y[] e;
    public static final UserInfo f;
    public final List a;
    public final List b;
    public final ScheduledOrderButtons c;
    public final ScheduledOrderButtons d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new z121(28)), kotlin.a.b(lazyThreadSafetyMode, new z121(29)), null, null};
        f = new UserInfo(0);
    }

    public UserInfo(int i, List list, List list2, ScheduledOrderButtons scheduledOrderButtons, ScheduledOrderButtons scheduledOrderButtons2) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
        int i3 = i & 4;
        ScheduledOrderButtons scheduledOrderButtons3 = ScheduledOrderButtons.c;
        if (i3 == 0) {
            ScheduledOrderButtons.Companion.getClass();
            this.c = scheduledOrderButtons3;
        } else {
            this.c = scheduledOrderButtons;
        }
        if ((i & 8) != 0) {
            this.d = scheduledOrderButtons2;
        } else {
            ScheduledOrderButtons.Companion.getClass();
            this.d = scheduledOrderButtons3;
        }
    }

    public UserInfo() {
        this(0);
    }

    public UserInfo(int i) {
        s sVar = ScheduledOrderButtons.Companion;
        sVar.getClass();
        sVar.getClass();
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
        ScheduledOrderButtons scheduledOrderButtons = ScheduledOrderButtons.c;
        this.c = scheduledOrderButtons;
        this.d = scheduledOrderButtons;
    }
}
