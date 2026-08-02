package com.yandex.mob;

import com.yandex.mob.MobMainInitializer;
import com.yandex.mob.domain.s;
import defpackage.ets;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.i3y;
import defpackage.in20;
import defpackage.jr20;
import defpackage.jse;
import defpackage.l8x;
import defpackage.ol20;
import defpackage.oo20;
import defpackage.rot;
import defpackage.tr20;
import defpackage.ur20;
import defpackage.vms;
import defpackage.xo20;
import defpackage.yo20;
import defpackage.zo20;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes8.dex */
public final class j implements ur20 {
    public final yo20 a;
    public final i3y b;
    public final i3y c;

    public j(yo20 yo20Var) {
        this.a = yo20Var;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.b = kotlin.a.b(lazyThreadSafetyMode, new ets(2, this));
        this.c = kotlin.a.b(lazyThreadSafetyMode, new zo20());
    }

    @Override // defpackage.ur20
    public final void b() {
        jr20 jr20Var;
        rot c;
        MobMainInitializer mobMainInitializer = (MobMainInitializer) this.c.getValue();
        AtomicReference atomicReference = mobMainInitializer.b;
        if (((MobMainInitializer.State) atomicReference.get()) == MobMainInitializer.State.NOT_INITIALIZED) {
            oo20 oo20Var = mobMainInitializer.d;
            if (oo20Var == null || (c = ((xo20) oo20Var).c()) == null) {
                return;
            }
            c.a("MobInitialization", new IllegalStateException("startBackgroundOperations() called before lightweightInit()"));
            return;
        }
        MobMainInitializer.State state = MobMainInitializer.State.LIGHTWEIGHT_INITIALIZED;
        MobMainInitializer.State state2 = MobMainInitializer.State.BACKGROUND_STARTED;
        while (!atomicReference.compareAndSet(state, state2)) {
            if (atomicReference.get() != state) {
                return;
            }
        }
        l8x l8xVar = (l8x) mobMainInitializer.e.get();
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        oo20 oo20Var2 = mobMainInitializer.d;
        if (oo20Var2 == null || (jr20Var = (jr20) mobMainInitializer.c.get()) == null) {
            return;
        }
        jr20.b(jr20Var, (jse) ((xo20) oo20Var2).H.getValue(), new MobMainInitializer$startBackgroundOperations$1$1(mobMainInitializer, oo20Var2, oo20Var2, null), 2);
    }

    @Override // defpackage.ur20
    public final void c() {
        tr20.a.set(new vms(4));
        MobMainInitializer mobMainInitializer = (MobMainInitializer) this.c.getValue();
        oo20 oo20Var = (oo20) this.b.getValue();
        AtomicReference atomicReference = mobMainInitializer.c;
        AtomicReference atomicReference2 = mobMainInitializer.b;
        MobMainInitializer.State state = MobMainInitializer.State.NOT_INITIALIZED;
        MobMainInitializer.State state2 = MobMainInitializer.State.LIGHTWEIGHT_INITIALIZED;
        while (!atomicReference2.compareAndSet(state, state2)) {
            if (atomicReference2.get() != state) {
                ((xo20) oo20Var).c().a("MobInitialization", new IllegalStateException("lightweightInit() already called, ignoring"));
                return;
            }
        }
        mobMainInitializer.d = oo20Var;
        fyc b = gwk0.b();
        mobMainInitializer.a.set(b);
        xo20 xo20Var = (xo20) oo20Var;
        atomicReference.set((jr20) xo20Var.G.getValue());
        jr20 jr20Var = (jr20) atomicReference.get();
        if (jr20Var != null) {
            jr20Var.a();
        }
        jr20 jr20Var2 = (jr20) atomicReference.get();
        if (jr20Var2 != null) {
            jr20.b(jr20Var2, (jse) xo20Var.H.getValue(), new MobMainInitializer$lightweightInit$1$1(oo20Var, mobMainInitializer, b, null), 2);
        }
    }

    @Override // defpackage.ur20
    public final m d() {
        return (m) ((xo20) ((oo20) this.b.getValue())).I.getValue();
    }

    @Override // defpackage.ur20
    public final in20 e(String str, ol20... ol20VarArr) {
        s sVar = (s) ((xo20) ((oo20) this.b.getValue())).B.getValue();
        ol20[] ol20VarArr2 = (ol20[]) Arrays.copyOf(ol20VarArr, ol20VarArr.length);
        sVar.b.d(str);
        return new in20(str, sVar.a.j(str, (ol20[]) Arrays.copyOf(ol20VarArr2, ol20VarArr2.length)));
    }
}
