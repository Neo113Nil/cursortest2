package com.yandex.go.chargers.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.xn11;
import defpackage.y99;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/data/model/ChargersSupportedHostsExperiment;", "Lxn11;", "Companion", "com/yandex/go/chargers/data/model/v", "$serializer", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChargersSupportedHostsExperiment implements xn11 {
    public static final v Companion = new v();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y99(11))};
    public static final ChargersSupportedHostsExperiment e = new ChargersSupportedHostsExperiment(0);
    public final boolean b;
    public final Set c;

    public /* synthetic */ ChargersSupportedHostsExperiment(int i, boolean z, Set set) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptySet.a;
        } else {
            this.c = set;
        }
    }

    public ChargersSupportedHostsExperiment(int i) {
        this.b = false;
        this.c = EmptySet.a;
    }

    public ChargersSupportedHostsExperiment() {
        this(0);
    }
}
