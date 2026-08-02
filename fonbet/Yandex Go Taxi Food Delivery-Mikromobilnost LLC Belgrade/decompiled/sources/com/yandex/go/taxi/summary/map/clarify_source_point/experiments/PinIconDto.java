package com.yandex.go.taxi.summary.map.clarify_source_point.experiments;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/map/clarify_source_point/experiments/PinIconDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/map/clarify_source_point/experiments/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PinIconDto {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ PinIconDto(int i, String str, String str2, String str3) {
        this.a = (i & 1) == 0 ? "" : str;
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
    }

    public PinIconDto() {
        this.a = "";
        this.b = null;
        this.c = null;
    }
}
