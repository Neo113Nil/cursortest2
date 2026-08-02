package com.yandex.go.support.web;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.z2c;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/support/web/CommonSupportCallJsInterfaceFactory$ConfigResult", "", "Companion", "$serializer", "com/yandex/go/support/web/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CommonSupportCallJsInterfaceFactory$ConfigResult {
    public static final a Companion = new a();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(22))};
    public final List a;

    public /* synthetic */ CommonSupportCallJsInterfaceFactory$ConfigResult(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, CommonSupportCallJsInterfaceFactory$ConfigResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public CommonSupportCallJsInterfaceFactory$ConfigResult(List list) {
        this.a = list;
    }
}
