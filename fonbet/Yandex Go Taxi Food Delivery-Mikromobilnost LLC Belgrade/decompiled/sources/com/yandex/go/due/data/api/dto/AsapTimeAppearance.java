package com.yandex.go.due.data.api.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.p73;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due/data/api/dto/AsapTimeAppearance;", "", "Companion", "$serializer", "com/yandex/go/due/data/api/dto/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AsapTimeAppearance {
    public static final b Companion = new b();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new p73(2)), null};
    public final String a;
    public final List b;
    public final RideInfo c;

    public /* synthetic */ AsapTimeAppearance(int i, String str, List list, RideInfo rideInfo) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = rideInfo;
        }
    }

    public AsapTimeAppearance() {
        this.a = null;
        this.b = EmptyList.a;
        this.c = null;
    }
}
