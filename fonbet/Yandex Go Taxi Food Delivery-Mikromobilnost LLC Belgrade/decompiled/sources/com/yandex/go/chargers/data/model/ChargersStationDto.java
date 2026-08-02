package com.yandex.go.chargers.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/data/model/ChargersStationDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/data/model/t", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersStationDto {
    public static final t Companion = new t();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ ChargersStationDto(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChargersStationDto() {
        this(r0, r0, 7);
        String str = null;
    }

    public ChargersStationDto(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public /* synthetic */ ChargersStationDto(String str, String str2, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (String) null);
    }
}
