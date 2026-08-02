package com.yandex.go.safety.center.api;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jg11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/safety/center/api/TrustedContacts;", "", "Companion", "$serializer", "com/yandex/go/safety/center/api/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TrustedContacts {
    public static final o Companion = new o();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jg11(0)), null};
    public final List a;
    public final int b;

    public /* synthetic */ TrustedContacts(int i, int i2, List list) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
    }

    public TrustedContacts(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public TrustedContacts() {
        this(EmptyList.a, 0);
    }
}
