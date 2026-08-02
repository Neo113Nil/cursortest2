package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/PinIconAnnotationDto$TopLeadingAnnotation", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/k1;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/i1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PinIconAnnotationDto$TopLeadingAnnotation extends k1 {
    public static final i1 Companion = new i1();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public PinIconAnnotationDto$TopLeadingAnnotation(int i, String str, String str2, String str3, String str4) {
        this.a = (i & 1) == 0 ? "top_leading_annotation" : str;
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
    }

    public PinIconAnnotationDto$TopLeadingAnnotation() {
        this.a = "top_leading_annotation";
        this.b = "";
        this.c = null;
        this.d = null;
    }
}
