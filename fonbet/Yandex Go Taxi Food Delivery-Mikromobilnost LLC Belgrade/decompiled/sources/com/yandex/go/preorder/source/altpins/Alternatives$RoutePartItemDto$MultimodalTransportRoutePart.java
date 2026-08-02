package com.yandex.go.preorder.source.altpins;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ly1;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/preorder/source/altpins/Alternatives$RoutePartItemDto$MultimodalTransportRoutePart", "Lcom/yandex/go/preorder/source/altpins/f1;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/d1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Alternatives$RoutePartItemDto$MultimodalTransportRoutePart extends f1 {
    public static final d1 Companion = new d1();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ly1(2))};
    public final String a;
    public final List b;

    public Alternatives$RoutePartItemDto$MultimodalTransportRoutePart(int i, String str, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public Alternatives$RoutePartItemDto$MultimodalTransportRoutePart() {
        this.a = "";
        this.b = null;
    }
}
