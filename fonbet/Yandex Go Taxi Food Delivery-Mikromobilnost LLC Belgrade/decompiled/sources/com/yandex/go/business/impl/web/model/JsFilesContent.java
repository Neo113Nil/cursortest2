package com.yandex.go.business.impl.web.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ojw;
import defpackage.qje;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/business/impl/web/model/JsFilesContent;", "", "Companion", "$serializer", "com/yandex/go/business/impl/web/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class JsFilesContent {
    public static final b Companion = new b();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ojw(25))};
    public final List a;

    public /* synthetic */ JsFilesContent(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, JsFilesContent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public JsFilesContent() {
        this.a = EmptyList.a;
    }
}
