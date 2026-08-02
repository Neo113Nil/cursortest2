package com.yandex.go.xiva.data;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/xiva/data/XivaTokenChannel;", "", "Companion", "$serializer", "com/yandex/go/xiva/data/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class XivaTokenChannel {
    public static final b Companion = new b();
    public final String a;

    public /* synthetic */ XivaTokenChannel(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "xiva_websocket";
        } else {
            this.a = str;
        }
    }

    public XivaTokenChannel(int i) {
        this.a = "xiva_websocket";
    }

    public XivaTokenChannel() {
        this(0);
    }
}
