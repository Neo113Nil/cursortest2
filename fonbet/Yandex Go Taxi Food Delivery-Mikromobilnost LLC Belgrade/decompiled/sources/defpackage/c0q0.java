package defpackage;

import just.adapter.scroll.experimental.OptimizedPaginationTriggerFeatureConfig;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes9.dex */
public final class c0q0 {
    public static final b0q0 Companion = new b0q0();
    public static final i3y[] j = {null, null, null, null, null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new wrp0(9))};
    public final Boolean a;
    public final Boolean b;
    public final zzp0 c;
    public final Boolean d;
    public final wzp0 e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final OptimizedPaginationTriggerFeatureConfig i;

    public /* synthetic */ c0q0(int i, Boolean bool, Boolean bool2, zzp0 zzp0Var, Boolean bool3, wzp0 wzp0Var, Boolean bool4, Boolean bool5, Boolean bool6, OptimizedPaginationTriggerFeatureConfig optimizedPaginationTriggerFeatureConfig) {
        if (95 != (i & 95)) {
            qje.Z(i, 95, a0q0.a.getDescriptor());
            throw null;
        }
        this.a = bool;
        this.b = bool2;
        this.c = zzp0Var;
        this.d = bool3;
        this.e = wzp0Var;
        if ((i & 32) == 0) {
            this.f = Boolean.TRUE;
        } else {
            this.f = bool4;
        }
        this.g = bool5;
        if ((i & 128) == 0) {
            this.h = Boolean.FALSE;
        } else {
            this.h = bool6;
        }
        if ((i & 256) == 0) {
            this.i = OptimizedPaginationTriggerFeatureConfig.DISABLED;
        } else {
            this.i = optimizedPaginationTriggerFeatureConfig;
        }
    }

    public c0q0(Boolean bool, Boolean bool2, zzp0 zzp0Var, Boolean bool3, wzp0 wzp0Var, Boolean bool4, Boolean bool5, OptimizedPaginationTriggerFeatureConfig optimizedPaginationTriggerFeatureConfig) {
        Boolean bool6 = Boolean.FALSE;
        this.a = bool;
        this.b = bool2;
        this.c = zzp0Var;
        this.d = bool3;
        this.e = wzp0Var;
        this.f = bool4;
        this.g = bool5;
        this.h = bool6;
        this.i = optimizedPaginationTriggerFeatureConfig;
    }
}
