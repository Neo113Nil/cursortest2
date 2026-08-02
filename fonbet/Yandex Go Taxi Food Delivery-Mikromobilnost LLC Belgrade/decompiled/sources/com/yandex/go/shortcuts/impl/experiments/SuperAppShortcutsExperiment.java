package com.yandex.go.shortcuts.impl.experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w5w0;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/impl/experiments/SuperAppShortcutsExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/shortcuts/impl/experiments/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperAppShortcutsExperiment extends w96 implements c6z {
    public static final c Companion = new c();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w5w0(6))};
    public static final SuperAppShortcutsExperiment d = new SuperAppShortcutsExperiment(0);
    public final Map b;

    public /* synthetic */ SuperAppShortcutsExperiment(int i, Map map) {
        if ((i & 1) == 0) {
            this.b = kotlin.collections.b.f();
        } else {
            this.b = map;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    @Override // defpackage.w96
    /* renamed from: g */
    public final boolean getB() {
        return true;
    }

    public SuperAppShortcutsExperiment() {
        this(0);
    }

    public SuperAppShortcutsExperiment(int i) {
        this.b = kotlin.collections.b.f();
    }
}
