package com.yandex.go.platform.js_api.models;

import defpackage.gsq0;
import defpackage.p53;
import defpackage.qje;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/platform/js_api/models/JsFilesContent;", "", "Companion", "$serializer", "com/yandex/go/platform/js_api/models/i", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JsFilesContent {
    public static final i Companion = new i();
    public static final KSerializer[] b = {new p53(JsFile$$serializer.INSTANCE, 0)};
    public final List a;

    public /* synthetic */ JsFilesContent(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, JsFilesContent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
