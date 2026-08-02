package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/PinIconStateDto$PinIconDto", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/o1;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/m1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PinIconStateDto$PinIconDto extends o1 {
    public static final m1 Companion = new m1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final k1 e;
    public final PinIconActionDto f;
    public final float g;
    public final String h;
    public final boolean i;

    public PinIconStateDto$PinIconDto(int i, String str, String str2, String str3, String str4, k1 k1Var, PinIconActionDto pinIconActionDto, float f, String str5, boolean z) {
        this.a = (i & 1) == 0 ? "icon" : str;
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
            this.e = null;
        } else {
            this.e = k1Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = pinIconActionDto;
        }
        if ((i & 64) == 0) {
            this.g = 1.0f;
        } else {
            this.g = f;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z;
        }
    }

    public PinIconStateDto$PinIconDto() {
        this.a = "icon";
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 1.0f;
        this.h = null;
        this.i = false;
    }
}
