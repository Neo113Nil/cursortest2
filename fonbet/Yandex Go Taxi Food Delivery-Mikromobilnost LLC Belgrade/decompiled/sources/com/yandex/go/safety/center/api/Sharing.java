package com.yandex.go.safety.center.api;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.mkr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/safety/center/api/Sharing;", "", "Companion", "$serializer", "com/yandex/go/safety/center/api/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Sharing {
    public static final m Companion = new m();
    public static final i3y[] d;
    public final List a;
    public final int b;
    public final SharingType c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new mkr0(12)), null, kotlin.a.b(lazyThreadSafetyMode, new mkr0(13))};
    }

    public /* synthetic */ Sharing(int i, List list, int i2, SharingType sharingType) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = SharingType.UNKNOWN;
        } else {
            this.c = sharingType;
        }
    }

    public Sharing() {
        this(0);
    }

    public Sharing(int i) {
        SharingType sharingType = SharingType.UNKNOWN;
        this.a = EmptyList.a;
        this.b = 0;
        this.c = sharingType;
    }
}
