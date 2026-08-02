package com.yandex.go.scooters.passes.data.model.actions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kr;
import defpackage.qje;
import defpackage.s3n0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/passes/data/model/actions/ScootersBroadcastAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/scooters/passes/data/model/actions/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersBroadcastAction extends kr {
    public static final b Companion = new b();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s3n0(0))};
    public final kr a;

    public /* synthetic */ ScootersBroadcastAction(int i, kr krVar) {
        if (1 == (i & 1)) {
            this.a = krVar;
        } else {
            qje.Z(i, 1, ScootersBroadcastAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
