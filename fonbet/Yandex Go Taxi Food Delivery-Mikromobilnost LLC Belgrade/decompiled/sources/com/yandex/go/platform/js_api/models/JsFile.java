package com.yandex.go.platform.js_api.models;

import defpackage.cw4;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.sls;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/platform/js_api/models/JsFile;", "", "Companion", "$serializer", "com/yandex/go/platform/js_api/models/h", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JsFile {
    public static final h Companion = new h();
    public final String a;
    public final String b;
    public final String c;
    public final i3y d;

    public /* synthetic */ JsFile(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, JsFile$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.js_api.models.JsFile.1
            @Override // defpackage.sls
            public final Object invoke() {
                return cw4.a(cw4.d, JsFile.this.a, 0, 6);
            }
        });
    }
}
