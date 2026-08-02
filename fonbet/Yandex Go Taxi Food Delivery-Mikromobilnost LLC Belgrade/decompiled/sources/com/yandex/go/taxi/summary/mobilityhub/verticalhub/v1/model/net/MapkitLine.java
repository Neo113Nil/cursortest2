package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kr00;
import defpackage.qje;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MapkitLine;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/j0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MapkitLine {
    public static final j0 Companion = new j0();
    public static final i3y[] f = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(11)), null, null, null, null};
    public final List a;
    public final MapkitLineStyle b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ MapkitLine(int i, List list, MapkitLineStyle mapkitLineStyle, String str, String str2, String str3) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, MapkitLine$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = mapkitLineStyle;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public MapkitLine(List list, MapkitLineStyle mapkitLineStyle, String str, String str2, String str3) {
        this.a = list;
        this.b = mapkitLineStyle;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }
}
