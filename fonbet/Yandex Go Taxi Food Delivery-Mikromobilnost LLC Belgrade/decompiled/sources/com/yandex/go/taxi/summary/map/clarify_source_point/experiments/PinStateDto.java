package com.yandex.go.taxi.summary.map.clarify_source_point.experiments;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/map/clarify_source_point/experiments/PinStateDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/map/clarify_source_point/experiments/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PinStateDto {
    public static final c Companion = new c();
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final PinIconDto f;

    public /* synthetic */ PinStateDto(int i, String str, String str2, boolean z, boolean z2, String str3, PinIconDto pinIconDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = pinIconDto;
        }
    }

    public PinStateDto() {
        this.a = "";
        this.b = null;
        this.c = false;
        this.d = false;
        this.e = null;
        this.f = null;
    }
}
