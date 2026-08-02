package com.yandex.go.business.impl.web.model;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/business/impl/web/model/JsTextContent;", "", "Companion", "$serializer", "com/yandex/go/business/impl/web/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JsTextContent {
    public static final c Companion = new c();
    public final String a;

    public /* synthetic */ JsTextContent(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, JsTextContent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public JsTextContent() {
        this.a = "";
    }
}
