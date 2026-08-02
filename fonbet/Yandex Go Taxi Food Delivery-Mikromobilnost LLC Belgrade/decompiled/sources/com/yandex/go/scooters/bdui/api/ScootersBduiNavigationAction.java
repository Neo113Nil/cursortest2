package com.yandex.go.scooters.bdui.api;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kr;
import defpackage.n0n0;
import defpackage.qje;
import defpackage.vnm0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/bdui/api/ScootersBduiNavigationAction;", "Lkr;", "Companion", "n0n0", "$serializer", "com/yandex/go/scooters/bdui/api/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersBduiNavigationAction extends kr {
    public static final a Companion = new a();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(25)), null, null};
    public final n0n0 a;
    public final boolean b;
    public final ScootersBduiNavigationAction c;

    public /* synthetic */ ScootersBduiNavigationAction(int i, n0n0 n0n0Var, boolean z, ScootersBduiNavigationAction scootersBduiNavigationAction) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ScootersBduiNavigationAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = n0n0Var;
        this.b = z;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = scootersBduiNavigationAction;
        }
    }
}
