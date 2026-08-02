package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubFilterDtoV2;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubFilterDtoV2 {
    public static final z Companion = new z();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final FilterStateDtoV2 f;
    public final FilterStateDtoV2 g;
    public final y h;
    public final ResetFilterAction i;

    public /* synthetic */ HubFilterDtoV2(int i, String str, String str2, String str3, String str4, boolean z, FilterStateDtoV2 filterStateDtoV2, FilterStateDtoV2 filterStateDtoV22, y yVar, ResetFilterAction resetFilterAction) {
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i & 32) == 0) {
            this.f = new FilterStateDtoV2(0);
        } else {
            this.f = filterStateDtoV2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = filterStateDtoV22;
        }
        if ((i & 128) == 0) {
            this.h = x.INSTANCE;
        } else {
            this.h = yVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = resetFilterAction;
        }
    }

    public HubFilterDtoV2() {
        FilterStateDtoV2 filterStateDtoV2 = new FilterStateDtoV2(0);
        x xVar = x.INSTANCE;
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = false;
        this.f = filterStateDtoV2;
        this.g = null;
        this.h = xVar;
        this.i = null;
    }
}
