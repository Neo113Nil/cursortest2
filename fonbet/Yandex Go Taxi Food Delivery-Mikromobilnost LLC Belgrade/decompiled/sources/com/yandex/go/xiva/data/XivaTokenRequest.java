package com.yandex.go.xiva.data;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/xiva/data/XivaTokenRequest;", "", "Companion", "$serializer", "com/yandex/go/xiva/data/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class XivaTokenRequest {
    public static final d Companion = new d();
    public final String a;
    public final XivaTokenClient b;
    public final XivaTokenChannel c;
    public final String d;

    public /* synthetic */ XivaTokenRequest(int i, String str, XivaTokenClient xivaTokenClient, XivaTokenChannel xivaTokenChannel, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, XivaTokenRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = xivaTokenClient;
        if ((i & 4) == 0) {
            this.c = new XivaTokenChannel(0);
        } else {
            this.c = xivaTokenChannel;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public XivaTokenRequest(String str, XivaTokenClient xivaTokenClient) {
        XivaTokenChannel xivaTokenChannel = new XivaTokenChannel(0);
        this.a = str;
        this.b = xivaTokenClient;
        this.c = xivaTokenChannel;
        this.d = null;
    }
}
