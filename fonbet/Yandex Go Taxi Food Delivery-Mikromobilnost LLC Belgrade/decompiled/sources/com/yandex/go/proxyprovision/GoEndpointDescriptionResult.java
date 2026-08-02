package com.yandex.go.proxyprovision;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.sss;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/proxyprovision/GoEndpointDescriptionResult;", "", "Companion", "$serializer", "com/yandex/go/proxyprovision/e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GoEndpointDescriptionResult {
    public static final e Companion = new e();
    public static final i3y[] d;
    public final String a;
    public final List b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new sss(20)), kotlin.a.b(lazyThreadSafetyMode, new sss(21))};
    }

    public /* synthetic */ GoEndpointDescriptionResult(int i, String str, List list, List list2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, GoEndpointDescriptionResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public GoEndpointDescriptionResult(String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
    }
}
