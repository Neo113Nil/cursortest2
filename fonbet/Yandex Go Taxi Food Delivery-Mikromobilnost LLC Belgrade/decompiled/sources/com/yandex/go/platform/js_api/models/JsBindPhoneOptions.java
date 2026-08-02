package com.yandex.go.platform.js_api.models;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/platform/js_api/models/JsBindPhoneOptions;", "", "Companion", "$serializer", "com/yandex/go/platform/js_api/models/c", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JsBindPhoneOptions {
    public static final c Companion = new c();
    public final String a;
    public final boolean b;

    public /* synthetic */ JsBindPhoneOptions(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public JsBindPhoneOptions() {
        this.a = "";
        this.b = false;
    }
}
