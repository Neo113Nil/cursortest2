package com.yandex.go.notifications.acknowledge.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.pmf0;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/notifications/acknowledge/data/model/PushAckParams;", "", "Companion", "$serializer", "com/yandex/go/notifications/acknowledge/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PushAckParams {
    public static final b Companion = new b();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pmf0(22))};
    public final Set a;

    public /* synthetic */ PushAckParams(int i, Set set) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = set;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PushAckParams) && jl40.l(this.a, ((PushAckParams) obj).a);
    }

    public final int hashCode() {
        Set set = this.a;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }

    public final String toString() {
        return "PushAckParams(params=" + this.a + Extension.C_BRAKE;
    }

    public PushAckParams(Set set) {
        this.a = set;
    }

    public PushAckParams() {
        this(null);
    }
}
