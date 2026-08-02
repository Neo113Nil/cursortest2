package com.yandex.go.platform.js_api.models;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/platform/js_api/models/JsBindingData;", "", "Companion", "$serializer", "com/yandex/go/platform/js_api/models/d", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JsBindingData {
    public static final d Companion = new d();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ JsBindingData(int i, String str, String str2, String str3) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, JsBindingData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
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

    public JsBindingData() {
        this.a = "";
        this.b = null;
        this.c = null;
    }
}
