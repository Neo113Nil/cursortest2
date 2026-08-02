package com.yandex.go.flex.main_screen.shared_data;

import defpackage.bnr0;
import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/shared_data/MainScreenResolvedPosition;", "Lbnr0;", "Companion", "com/yandex/go/flex/main_screen/shared_data/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainScreenResolvedPosition implements bnr0 {
    public static final c Companion = new c();
    public final double a;
    public final double b;
    public final long c;

    public /* synthetic */ MainScreenResolvedPosition(int i, double d, double d2, long j) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, MainScreenResolvedPosition$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = d2;
        this.c = j;
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        MainScreenResolvedPosition mainScreenResolvedPosition = bnr0Var instanceof MainScreenResolvedPosition ? (MainScreenResolvedPosition) bnr0Var : null;
        return mainScreenResolvedPosition != null ? mainScreenResolvedPosition : this;
    }

    public MainScreenResolvedPosition(double d, double d2, long j) {
        this.a = d;
        this.b = d2;
        this.c = j;
    }
}
