package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.yandex.taxi.masstransit.StopModalDto;
import ru.yandex.taxi.masstransit.model.g;

@gsq0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lk110;", "Lw96;", "Lc6z;", "Ly35;", "Companion", "j110", "i110", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class k110 extends w96 implements c6z, y35 {
    public static final j110 Companion = new j110();
    public static final i3y[] p;
    public static final k110 q;
    public final boolean b;
    public final Map c;
    public final long d;
    public final long e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final Map i;
    public final List j;
    public final StopModalDto k;
    public final int l;
    public final l9u m;
    public final long n;
    public final i3y o;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        p = new i3y[]{null, a.b(lazyThreadSafetyMode, new t5z(29)), null, null, null, null, null, a.b(lazyThreadSafetyMode, new g110(0)), a.b(lazyThreadSafetyMode, new g110(1)), null, null, null, null};
        q = new k110(8190);
    }

    public k110(int i, boolean z, Map map, long j, long j2, String str, boolean z2, boolean z3, Map map2, List list, StopModalDto stopModalDto, int i2, l9u l9uVar, long j3) {
        l9u l9uVar2;
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = 60L;
        } else {
            this.d = j;
        }
        if ((i & 8) == 0) {
            this.e = 30L;
        } else {
            this.e = j2;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str;
        }
        if ((i & 32) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
        if ((i & 64) == 0) {
            this.h = false;
        } else {
            this.h = z3;
        }
        if ((i & 128) == 0) {
            this.i = b.f();
        } else {
            this.i = map2;
        }
        if ((i & 256) == 0) {
            this.j = EmptyList.a;
        } else {
            this.j = list;
        }
        if ((i & 512) == 0) {
            this.k = null;
        } else {
            this.k = stopModalDto;
        }
        if ((i & 1024) == 0) {
            this.l = 0;
        } else {
            this.l = i2;
        }
        if ((i & 2048) == 0) {
            l9u.Companion.getClass();
            l9uVar2 = l9u.d;
        } else {
            l9uVar2 = l9uVar;
        }
        this.m = l9uVar2;
        this.n = (i & 4096) == 0 ? 2000L : j3;
        final int i3 = 1;
        this.o = a.a(new sls(this) { // from class: h110
            public final /* synthetic */ k110 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i3;
                k110 k110Var = this.b;
                switch (i4) {
                }
                return g.a(k110Var.i);
            }
        });
    }

    @Override // defpackage.y35
    /* renamed from: a, reason: from getter */
    public final String getE() {
        return this.f;
    }

    @Override // defpackage.y35
    public final Map b() {
        return (Map) this.o.getValue();
    }

    @Override // defpackage.y35
    /* renamed from: c, reason: from getter */
    public final List getI() {
        return this.j;
    }

    @Override // defpackage.y35
    /* renamed from: d, reason: from getter */
    public final boolean getG() {
        return this.h;
    }

    @Override // defpackage.y35
    /* renamed from: e, reason: from getter */
    public final Map getH() {
        return this.i;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public k110() {
        this(8191);
    }

    public k110(int i) {
        Map f = b.f();
        Map f2 = b.f();
        l9u.Companion.getClass();
        final int i2 = 0;
        this.b = false;
        this.c = f;
        this.d = 60L;
        this.e = 30L;
        this.f = "";
        this.g = false;
        this.h = false;
        this.i = f2;
        this.j = EmptyList.a;
        this.k = null;
        this.l = 0;
        this.m = l9u.d;
        this.n = 2000L;
        this.o = a.a(new sls(this) { // from class: h110
            public final /* synthetic */ k110 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i2;
                k110 k110Var = this.b;
                switch (i4) {
                }
                return g.a(k110Var.i);
            }
        });
    }
}
