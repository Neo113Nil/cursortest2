package com.yandex.go.superapp.impl.signals;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.nnm;
import defpackage.sss;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/superapp/impl/signals/GetPermissionsSignalFactory$Result", "", "Companion", "$serializer", "com/yandex/go/superapp/impl/signals/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetPermissionsSignalFactory$Result {
    public static final d Companion = new d();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sss(11))};
    public final Map a;

    public /* synthetic */ GetPermissionsSignalFactory$Result(int i, Map map) {
        if ((i & 1) == 0) {
            this.a = kotlin.collections.b.f();
        } else {
            this.a = map;
        }
    }

    public final String toString() {
        return nnm.j("Result(permissions=", Extension.C_BRAKE, this.a);
    }

    public GetPermissionsSignalFactory$Result(Map map) {
        this.a = map;
    }

    public GetPermissionsSignalFactory$Result() {
        this(kotlin.collections.b.f());
    }
}
