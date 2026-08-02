package com.yandex.go.due.data.api.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ro1;
import java.util.Calendar;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due/data/api/dto/AllowedTimeInfo;", "", "Companion", "com/yandex/go/due/data/api/dto/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AllowedTimeInfo {
    public static final a Companion = new a();
    public static final i3y[] h = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ro1(11)), null, null, null, null};
    public static final AllowedTimeInfo i = new AllowedTimeInfo(0);
    public final int a;
    public final int b;
    public final List c;
    public final String d;
    public final PricePrefetch e;
    public final Calendar f;
    public final AsapTimeInfo g;

    public /* synthetic */ AllowedTimeInfo(int i2, int i3, int i4, List list, String str, PricePrefetch pricePrefetch, Calendar calendar, AsapTimeInfo asapTimeInfo) {
        this.a = (i2 & 1) == 0 ? 5 : i3;
        if ((i2 & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i4;
        }
        if ((i2 & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i2 & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = pricePrefetch;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = calendar;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = asapTimeInfo;
        }
    }

    public AllowedTimeInfo(int i2) {
        this.a = 5;
        this.b = 0;
        this.c = EmptyList.a;
        this.d = "";
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public AllowedTimeInfo() {
        this(0);
    }
}
