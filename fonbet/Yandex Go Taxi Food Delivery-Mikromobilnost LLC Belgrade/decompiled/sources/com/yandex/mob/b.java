package com.yandex.mob;

import android.content.Context;
import com.yandex.mob.api.model.MobEnvironment;
import defpackage.al20;
import defpackage.bl20;
import defpackage.cl20;
import defpackage.ets;
import defpackage.fl20;
import defpackage.i3y;
import defpackage.in20;
import defpackage.jr20;
import defpackage.jse;
import defpackage.kl20;
import defpackage.mdh;
import defpackage.mm20;
import defpackage.nm20;
import defpackage.npt;
import defpackage.ol20;
import defpackage.sjh;
import defpackage.uyj;
import defpackage.yn20;
import defpackage.zn20;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes8.dex */
public final class b implements kl20 {
    public final Context a;
    public final MobEnvironment b;
    public final jse c;
    public final i3y d;
    public final i3y e;
    public final i3y f;
    public final i3y g;
    public final i3y h;
    public final i3y i;
    public final i3y j;
    public final i3y k;
    public final i3y l;
    public final i3y m;
    public final i3y n;
    public final i3y o;

    public b(Context context, MobEnvironment mobEnvironment, yn20 yn20Var, zn20 zn20Var, npt nptVar) {
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        this.a = context;
        this.b = mobEnvironment;
        this.c = mdhVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.d = kotlin.a.b(lazyThreadSafetyMode, new ets(1, zn20Var));
        this.e = kotlin.a.b(lazyThreadSafetyMode, new al20(this, 7));
        this.f = kotlin.a.b(lazyThreadSafetyMode, new al20(this, 8));
        this.g = kotlin.a.b(lazyThreadSafetyMode, new al20(this, 9));
        this.h = kotlin.a.b(lazyThreadSafetyMode, new al20(this, 10));
        this.i = kotlin.a.b(lazyThreadSafetyMode, new al20(this, 11));
        this.j = kotlin.a.b(lazyThreadSafetyMode, new cl20(this, yn20Var, 1));
        this.k = kotlin.a.b(lazyThreadSafetyMode, new c(this, 2));
        this.l = kotlin.a.b(lazyThreadSafetyMode, new al20(this, 12));
        this.m = kotlin.a.b(lazyThreadSafetyMode, new bl20());
        this.n = kotlin.a.b(lazyThreadSafetyMode, new al20(this, 6));
        this.o = kotlin.a.b(lazyThreadSafetyMode, new cl20(this, yn20Var, 0));
    }

    @Override // defpackage.kl20
    public final fl20 a() {
        return null;
    }

    @Override // defpackage.ur20
    public final void b() {
    }

    @Override // defpackage.ur20
    public final void c() {
        f();
    }

    @Override // defpackage.ur20
    public final m d() {
        return ((nm20) this.o.getValue()).d();
    }

    @Override // defpackage.ur20
    public final in20 e(String str, ol20... ol20VarArr) {
        return ((nm20) this.o.getValue()).e(str, (ol20[]) Arrays.copyOf(ol20VarArr, ol20VarArr.length));
    }

    public final void f() {
        mm20 mm20Var = (mm20) ((nm20) this.o.getValue()).a.getValue();
        ((jr20) mm20Var.f.getValue()).a();
        i3y i3yVar = mm20Var.f;
        jr20.b((jr20) i3yVar.getValue(), null, new MobChildProcess$init$1$1(mm20Var, null), 3);
        jr20.b((jr20) i3yVar.getValue(), null, new MobChildProcess$init$1$2(mm20Var, null), 3);
        jr20.b((jr20) i3yVar.getValue(), null, new MobChildProcess$init$1$3(mm20Var, null), 3);
    }
}
