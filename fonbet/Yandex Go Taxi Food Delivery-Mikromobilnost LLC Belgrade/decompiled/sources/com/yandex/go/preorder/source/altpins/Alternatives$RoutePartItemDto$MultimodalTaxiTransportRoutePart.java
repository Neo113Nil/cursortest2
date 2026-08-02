package com.yandex.go.preorder.source.altpins;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ly1;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/preorder/source/altpins/Alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart", "Lcom/yandex/go/preorder/source/altpins/f1;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/c1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart extends f1 {
    public static final c1 Companion = new c1();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ly1(1)), null, null};
    public final String a;
    public final List b;
    public final String c;
    public final String d;

    public Alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart(String str, int i, String str2, String str3, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public Alternatives$RoutePartItemDto$MultimodalTaxiTransportRoutePart() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
