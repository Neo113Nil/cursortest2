package com.yandex.passport.data.network;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.p53;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/data/network/q8;", "", "Companion", "com/yandex/passport/data/network/o8", "com/yandex/passport/data/network/p8", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class q8 {
    public static final p8 Companion = new p8();
    public static final KSerializer[] c = {new p53(auu0.a, 0), new p53(r8.a, 0)};
    public final List a;
    public final List b;

    public /* synthetic */ q8(List list, List list2, int i) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8)) {
            return false;
        }
        q8 q8Var = (q8) obj;
        return jl40.l(this.a, q8Var.a) && jl40.l(this.b, q8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(yaApps=");
        sb.append(this.a);
        sb.append(", ssoApps=");
        return unr0.t(sb, this.b, ')');
    }

    public q8() {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
    }
}
