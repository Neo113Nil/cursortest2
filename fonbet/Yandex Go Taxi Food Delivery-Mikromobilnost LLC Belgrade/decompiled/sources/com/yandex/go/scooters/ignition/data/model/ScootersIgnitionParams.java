package com.yandex.go.scooters.ignition.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.s3n0;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionParams;", "", "Companion", "Beacon", "$serializer", "com/yandex/go/scooters/ignition/data/model/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersIgnitionParams {
    public static final v Companion = new v();
    public static final i3y[] c;
    public final List a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new s3n0(24)), kotlin.a.b(lazyThreadSafetyMode, new s3n0(25))};
    }

    public /* synthetic */ ScootersIgnitionParams(List list, List list2, int i) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ScootersIgnitionParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public ScootersIgnitionParams(ArrayList arrayList, List list) {
        this.a = list;
        this.b = arrayList;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionParams$Beacon;", "", "Companion", "$serializer", "com/yandex/go/scooters/ignition/data/model/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Beacon {
        public static final u Companion = new u();
        public final String a;
        public final int b;
        public final int c;
        public final int d;

        public /* synthetic */ Beacon(int i, int i2, int i3, int i4, String str) {
            if (15 != (i & 15)) {
                qje.Z(i, 15, ScootersIgnitionParams$Beacon$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public Beacon(String str, int i, int i2, int i3) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }
}
