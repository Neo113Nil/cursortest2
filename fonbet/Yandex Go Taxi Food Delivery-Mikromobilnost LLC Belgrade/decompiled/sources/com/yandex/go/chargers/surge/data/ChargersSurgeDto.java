package com.yandex.go.chargers.surge.data;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/surge/data/ChargersSurgeDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/surge/data/a", "surge"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersSurgeDto {
    public static final a Companion = new a();
    public final int a;
    public final String b;
    public final String c;
    public final ChargersSurgeModalDto d;

    public /* synthetic */ ChargersSurgeDto(int i, int i2, String str, String str2, ChargersSurgeModalDto chargersSurgeModalDto) {
        this.a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = chargersSurgeModalDto;
        }
    }

    public ChargersSurgeDto() {
        this.a = 0;
        this.b = "";
        this.c = "";
        this.d = null;
    }
}
