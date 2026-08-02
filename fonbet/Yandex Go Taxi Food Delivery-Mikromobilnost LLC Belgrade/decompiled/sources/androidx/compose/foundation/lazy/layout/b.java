package androidx.compose.foundation.lazy.layout;

import defpackage.gtq0;
import defpackage.l0u;
import defpackage.oz40;
import defpackage.qar;
import defpackage.tje;
import defpackage.tse;
import defpackage.yow;
import defpackage.z5w;

/* loaded from: classes10.dex */
public final class b {
    public final tse a;
    public final l0u b;
    public final yow c;
    public qar d;
    public qar e;
    public qar f;
    public boolean g;
    public final oz40 h;
    public final oz40 i;
    public final oz40 j;
    public final oz40 k;
    public long l;
    public long m;
    public androidx.compose.ui.graphics.layer.a n;
    public final androidx.compose.animation.core.a o;
    public final androidx.compose.animation.core.a p;
    public final oz40 q;
    public long r;

    public b(tse tseVar, l0u l0uVar, yow yowVar) {
        this.a = tseVar;
        this.b = l0uVar;
        this.c = yowVar;
        Boolean bool = Boolean.FALSE;
        this.h = androidx.compose.runtime.f.j(bool);
        this.i = androidx.compose.runtime.f.j(bool);
        this.j = androidx.compose.runtime.f.j(bool);
        this.k = androidx.compose.runtime.f.j(bool);
        this.l = 9223372034707292159L;
        this.m = 0L;
        Object obj = null;
        this.n = l0uVar != null ? l0uVar.a() : null;
        int i = 12;
        this.o = new androidx.compose.animation.core.a(new z5w(0L), gtq0.l, obj, i);
        this.p = new androidx.compose.animation.core.a(Float.valueOf(1.0f), gtq0.f, obj, i);
        this.q = androidx.compose.runtime.f.j(new z5w(0L));
        this.r = 9223372034707292159L;
    }

    public final void a() {
        androidx.compose.ui.graphics.layer.a aVar = this.n;
        qar qarVar = this.d;
        oz40 oz40Var = this.i;
        boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
        tse tseVar = this.a;
        if (booleanValue || qarVar == null || aVar == null) {
            if (c()) {
                if (aVar != null) {
                    aVar.g(1.0f);
                }
                tje.N(tseVar, null, null, new LazyLayoutItemAnimation$animateAppearance$1(this, null), 3);
                return;
            }
            return;
        }
        oz40Var.setValue(Boolean.TRUE);
        boolean c = c();
        boolean z = !c;
        if (!c) {
            aVar.g(0.0f);
        }
        tje.N(tseVar, null, null, new LazyLayoutItemAnimation$animateAppearance$2(z, this, qarVar, aVar, null), 3);
    }

    public final void b() {
        if (((Boolean) this.h.getValue()).booleanValue()) {
            tje.N(this.a, null, null, new LazyLayoutItemAnimation$cancelPlacementAnimation$1(this, null), 3);
        }
    }

    public final boolean c() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void d() {
        l0u l0uVar;
        oz40 oz40Var = this.h;
        boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
        tse tseVar = this.a;
        if (booleanValue) {
            oz40Var.setValue(Boolean.FALSE);
            tje.N(tseVar, null, null, new LazyLayoutItemAnimation$release$1(this, null), 3);
        }
        oz40 oz40Var2 = this.i;
        if (((Boolean) oz40Var2.getValue()).booleanValue()) {
            oz40Var2.setValue(Boolean.FALSE);
            tje.N(tseVar, null, null, new LazyLayoutItemAnimation$release$2(this, null), 3);
        }
        if (c()) {
            this.j.setValue(Boolean.FALSE);
            tje.N(tseVar, null, null, new LazyLayoutItemAnimation$release$3(this, null), 3);
        }
        this.g = false;
        e(0L);
        this.l = 9223372034707292159L;
        androidx.compose.ui.graphics.layer.a aVar = this.n;
        if (aVar != null && (l0uVar = this.b) != null) {
            l0uVar.b(aVar);
        }
        this.n = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void e(long j) {
        this.q.setValue(new z5w(j));
    }
}
