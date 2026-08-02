package com.yandex.go.safety.center.api;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.tt4;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/safety/center/api/BaseTrustedContacts;", "", "Companion", "$serializer", "com/yandex/go/safety/center/api/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BaseTrustedContacts {
    public static final e Companion = new e();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tt4(16))};
    public final List a;

    public /* synthetic */ BaseTrustedContacts(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public BaseTrustedContacts(List list) {
        this.a = list;
    }

    public BaseTrustedContacts() {
        this(EmptyList.a);
    }
}
