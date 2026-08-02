package com.yandex.go.taxi.order.models.api.response.typed_experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.o3z;
import defpackage.xn11;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/LootBoxExperiment;", "Lxn11;", "Companion", "com/yandex/go/taxi/order/models/api/response/typed_experiments/b", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LootBoxExperiment implements xn11 {
    public static final b Companion = new b();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new o3z(18))};
    public static final LootBoxExperiment e = new LootBoxExperiment(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ LootBoxExperiment(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final LootBoxAnimationInfo a(String str) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((LootBoxAnimationInfo) obj).getA(), str)) {
                break;
            }
        }
        return (LootBoxAnimationInfo) obj;
    }

    public LootBoxExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public LootBoxExperiment() {
        this(0);
    }
}
