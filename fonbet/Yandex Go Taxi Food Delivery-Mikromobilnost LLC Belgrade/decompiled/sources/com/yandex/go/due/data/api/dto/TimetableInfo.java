package com.yandex.go.due.data.api.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.x1z0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due/data/api/dto/TimetableInfo;", "", "Companion", "$serializer", "com/yandex/go/due/data/api/dto/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimetableInfo {
    public static final v Companion = new v();
    public static final i3y[] j = {null, null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(23))};
    public final String a;
    public final String b;
    public final String c;
    public final TariffOverride d;
    public final TariffOverride e;
    public final Boolean f;
    public final Boolean g;
    public final RideInfo h;
    public final List i;

    public /* synthetic */ TimetableInfo(int i, String str, String str2, String str3, TariffOverride tariffOverride, TariffOverride tariffOverride2, Boolean bool, Boolean bool2, RideInfo rideInfo, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = tariffOverride;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = tariffOverride2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = rideInfo;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list;
        }
    }

    public TimetableInfo() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
}
