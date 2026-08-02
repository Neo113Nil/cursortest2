package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.txu;
import defpackage.uxu;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubFilterDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubFilterDto {
    public static final m Companion = new m();
    public final String a;
    public final String b;
    public final String c;
    public final FilterStateDto d;
    public final FilterStateDto e;
    public final boolean f;
    public final uxu g;

    public /* synthetic */ HubFilterDto(int i, String str, String str2, String str3, FilterStateDto filterStateDto, FilterStateDto filterStateDto2, boolean z, uxu uxuVar) {
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
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = new FilterStateDto(0);
        } else {
            this.d = filterStateDto;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = filterStateDto2;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = txu.INSTANCE;
        } else {
            this.g = uxuVar;
        }
    }

    public HubFilterDto() {
        FilterStateDto filterStateDto = new FilterStateDto(0);
        txu txuVar = txu.INSTANCE;
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = filterStateDto;
        this.e = null;
        this.f = false;
        this.g = txuVar;
    }
}
