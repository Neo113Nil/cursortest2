package com.yandex.div.legacy.dagger;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.yandex.div.legacy.dagger.DivComponent;
import com.yandex.div.legacy.view.a;
import defpackage.atk;
import defpackage.cee;
import defpackage.ck91;
import defpackage.d820;
import defpackage.eq31;
import defpackage.g3y;
import defpackage.gtk;
import defpackage.h0w;
import defpackage.h2b;
import defpackage.h9p;
import defpackage.hdu;
import defpackage.i57;
import defpackage.jz11;
import defpackage.k9y;
import defpackage.mrq0;
import defpackage.n0i0;
import defpackage.pzf;
import defpackage.ryk;
import defpackage.syk;
import defpackage.szr;
import defpackage.trs;
import defpackage.ut31;
import defpackage.w801;
import defpackage.yol;
import defpackage.z5x0;
import defpackage.zch;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;

/* loaded from: classes11.dex */
public final class Yatagan$DivComponent implements DivComponent {
    public pzf a;
    public hdu b;
    public yol c;
    public cee d;
    public ContextThemeWrapper e;
    public ut31 f;
    public syk g;
    public final ContextThemeWrapper h;
    public final ryk i;

    public static final class CachingProviderImpl implements g3y {
        public final Yatagan$DivComponent a;
        public Object b;

        public CachingProviderImpl(Yatagan$DivComponent yatagan$DivComponent) {
            this.a = yatagan$DivComponent;
        }

        @Override // defpackage.yvf0
        public final Object get() {
            Object obj = this.b;
            if (obj != null) {
                return obj;
            }
            IReporter reporter = AppMetrica.getReporter(this.a.h.getApplicationContext(), "e48dd638-f5ba-4cb8-b272-53b6d275062f");
            reporter.putAppEnvironmentValue("AliceKitVersion", "250600.0");
            this.b = reporter;
            return reporter;
        }
    }

    public static final class ComponentFactoryImpl implements DivComponent.Builder {
        public ContextThemeWrapper a;
        public ryk b;

        @Override // com.yandex.div.legacy.dagger.DivComponent.Builder
        public final DivComponent.Builder a(ContextThemeWrapper contextThemeWrapper) {
            this.a = contextThemeWrapper;
            return this;
        }

        @Override // com.yandex.div.legacy.dagger.DivComponent.Builder
        public final DivComponent.Builder b(ryk rykVar) {
            this.b = rykVar;
            return this;
        }

        @Override // com.yandex.div.legacy.dagger.DivComponent.Builder
        public final Yatagan$DivComponent build() {
            return new Yatagan$DivComponent(this.a, this.b);
        }
    }

    public static final class ProviderImpl implements g3y {
        public final Yatagan$DivComponent a;

        public ProviderImpl(Yatagan$DivComponent yatagan$DivComponent) {
            this.a = yatagan$DivComponent;
        }

        @Override // defpackage.yvf0
        public final Object get() {
            return this.a.h();
        }
    }

    public Yatagan$DivComponent(ContextThemeWrapper contextThemeWrapper, ryk rykVar) {
        this.h = contextThemeWrapper;
        this.i = rykVar;
    }

    public static DivComponent.Builder builder() {
        return new ComponentFactoryImpl();
    }

    @Override // com.yandex.div.legacy.dagger.DivComponent
    public final void a() {
        this.i.getClass();
    }

    @Override // com.yandex.div.legacy.dagger.DivComponent
    public final k9y b() {
        return this.i.b;
    }

    @Override // com.yandex.div.legacy.dagger.DivComponent
    public final yol c() {
        return h();
    }

    @Override // com.yandex.div.legacy.dagger.DivComponent
    public final gtk d() {
        return this.i.a;
    }

    @Override // com.yandex.div.legacy.dagger.DivComponent
    public final void e() {
        this.i.getClass();
    }

    public final cee f() {
        cee ceeVar = this.d;
        if (ceeVar != null) {
            return ceeVar;
        }
        cee ceeVar2 = new cee(this.h, j(), this.i.a, new ProviderImpl(this));
        this.d = ceeVar2;
        return ceeVar2;
    }

    public final pzf g() {
        pzf pzfVar = this.a;
        if (pzfVar != null) {
            return pzfVar;
        }
        pzf pzfVar2 = new pzf(new d820(this.h, 1));
        this.a = pzfVar2;
        return pzfVar2;
    }

    @Override // com.yandex.div.legacy.dagger.DivComponent
    public final hdu getStateManager() {
        hdu hduVar = this.b;
        if (hduVar != null) {
            return hduVar;
        }
        hdu hduVar2 = new hdu(this.i.d);
        this.b = hduVar2;
        return hduVar2;
    }

    public final yol h() {
        yol yolVar = this.c;
        if (yolVar != null) {
            return yolVar;
        }
        Context i = i();
        ut31 j = j();
        ryk rykVar = this.i;
        h2b h2bVar = rykVar.a;
        h2b h2bVar2 = rykVar.a;
        i57 i57Var = new i57(i, j, h2bVar, g());
        cee f = f();
        Context i2 = i();
        ut31 j2 = j();
        pzf g = g();
        syk sykVar = this.g;
        if (sykVar == null) {
            sykVar = new syk();
            this.g = sykVar;
        }
        szr szrVar = new szr(i2, j2, h2bVar2, g, sykVar);
        trs trsVar = new trs(this.h, j(), h2bVar2, g(), f());
        atk atkVar = new atk(i(), j(), h2bVar2);
        mrq0 mrq0Var = new mrq0();
        a aVar = new a(i(), j(), h2bVar2, g());
        z5x0 z5x0Var = new z5x0(i(), j(), g(), f());
        Context i3 = i();
        ut31 j3 = j();
        pzf g2 = g();
        syk sykVar2 = this.g;
        if (sykVar2 == null) {
            sykVar2 = new syk();
            this.g = sykVar2;
        }
        szr szrVar2 = new szr(i3, j3, g2, sykVar2);
        i();
        w801 w801Var = new w801();
        Context i4 = i();
        ut31 j4 = j();
        pzf g3 = g();
        syk sykVar3 = this.g;
        if (sykVar3 == null) {
            sykVar3 = new syk();
            this.g = sykVar3;
        }
        yol yolVar2 = new yol(i57Var, f, szrVar, trsVar, atkVar, mrq0Var, aVar, z5x0Var, szrVar2, w801Var, new jz11(this.h, i4, j4, h2bVar2, g3, sykVar3), new zch(new CachingProviderImpl(this)));
        this.c = yolVar2;
        return yolVar2;
    }

    public final Context i() {
        ContextThemeWrapper contextThemeWrapper = this.e;
        if (contextThemeWrapper != null) {
            return contextThemeWrapper;
        }
        ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(this.h, n0i0.Legacy_Theme);
        this.e = contextThemeWrapper2;
        return contextThemeWrapper2;
    }

    public final ut31 j() {
        ut31 ut31Var = this.f;
        if (ut31Var == null) {
            ut31Var = this.i.c.a(ck91.a) ? new h0w(new eq31()) : new h9p();
            this.f = ut31Var;
        }
        return ut31Var;
    }
}
