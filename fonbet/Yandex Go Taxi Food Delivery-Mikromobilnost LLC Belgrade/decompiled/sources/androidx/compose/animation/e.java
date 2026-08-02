package androidx.compose.animation;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ck11;
import defpackage.cmm0;
import defpackage.hz40;
import defpackage.jt1;
import defpackage.k6w;
import defpackage.m3u0;
import defpackage.nx01;
import defpackage.oz40;
import defpackage.rx01;
import defpackage.tls;
import defpackage.v2o;
import defpackage.w2o;
import defpackage.ymo;
import defpackage.zmo;
import defpackage.zx01;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class e implements rx01 {
    public final zx01 a;
    public jt1 b;
    public LayoutDirection c;
    public final oz40 d = androidx.compose.runtime.f.j(new k6w(0));
    public final hz40 e = cmm0.b();
    public nx01 f;

    public e(zx01 zx01Var, jt1 jt1Var, LayoutDirection layoutDirection) {
        this.a = zx01Var;
        this.b = jt1Var;
        this.c = layoutDirection;
    }

    public static final long d(e eVar, long j, long j2) {
        return eVar.b.a(j, j2, LayoutDirection.Ltr);
    }

    public static final long e(e eVar) {
        nx01 nx01Var = eVar.f;
        return nx01Var != null ? ((k6w) nx01Var.getValue()).a : ((k6w) eVar.d.getValue()).a;
    }

    @Override // defpackage.rx01
    public final Object b() {
        return this.a.f().b();
    }

    @Override // defpackage.rx01
    public final Object c() {
        return this.a.f().c();
    }

    public final w2o f(int i, final tls tlsVar, ck11 ck11Var) {
        return (i == 0 || (i == 4 && this.c == LayoutDirection.Ltr) || (i == 5 && this.c == LayoutDirection.Rtl)) ? k.n(ck11Var, new tls() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                tls tlsVar2 = tls.this;
                int e = (int) (e.e(this) >> 32);
                e eVar = this;
                long j = intValue;
                return (Integer) tlsVar2.invoke(Integer.valueOf(e - ((int) (e.d(eVar, (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (j << 32), e.e(eVar)) >> 32))));
            }
        }) : (i == 1 || (i == 4 && this.c == LayoutDirection.Rtl) || (i == 5 && this.c == LayoutDirection.Ltr)) ? k.n(ck11Var, new tls() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                tls tlsVar2 = tls.this;
                e eVar = this;
                long j = intValue;
                return (Integer) tlsVar2.invoke(Integer.valueOf((-((int) (e.d(eVar, (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (j << 32), e.e(eVar)) >> 32))) - intValue));
            }
        }) : i == 2 ? k.p(ck11Var, new tls() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                tls tlsVar2 = tls.this;
                int e = (int) (e.e(this) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                e eVar = this;
                long j = intValue;
                return (Integer) tlsVar2.invoke(Integer.valueOf(e - ((int) (e.d(eVar, (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (j << 32), e.e(eVar)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
            }
        }) : i == 3 ? k.p(ck11Var, new tls() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                tls tlsVar2 = tls.this;
                e eVar = this;
                long j = intValue;
                return (Integer) tlsVar2.invoke(Integer.valueOf((-((int) (e.d(eVar, (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (j << 32), e.e(eVar)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) - intValue));
            }
        }) : v2o.a;
    }

    public final zmo h(int i, final tls tlsVar, ck11 ck11Var) {
        return (i == 0 || (i == 4 && this.c == LayoutDirection.Ltr) || (i == 5 && this.c == LayoutDirection.Rtl)) ? k.s(ck11Var, new tls() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                e eVar = this;
                m3u0 m3u0Var = (m3u0) eVar.e.d(eVar.a.d.getValue());
                long j = intValue;
                return (Integer) tlsVar.invoke(Integer.valueOf((-((int) (e.d(this, (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (j << 32), m3u0Var != null ? ((k6w) m3u0Var.getValue()).a : 0L) >> 32))) - intValue));
            }
        }) : (i == 1 || (i == 4 && this.c == LayoutDirection.Rtl) || (i == 5 && this.c == LayoutDirection.Ltr)) ? k.s(ck11Var, new tls() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                e eVar = this;
                m3u0 m3u0Var = (m3u0) eVar.e.d(eVar.a.d.getValue());
                long j = m3u0Var != null ? ((k6w) m3u0Var.getValue()).a : 0L;
                long j2 = intValue;
                return (Integer) tlsVar.invoke(Integer.valueOf((-((int) (e.d(this, (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (j2 << 32), j) >> 32))) + ((int) (j >> 32))));
            }
        }) : i == 2 ? k.u(ck11Var, new tls() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                e eVar = this;
                m3u0 m3u0Var = (m3u0) eVar.e.d(eVar.a.d.getValue());
                long j = intValue;
                return (Integer) tlsVar.invoke(Integer.valueOf((-((int) (e.d(this, (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (j << 32), m3u0Var != null ? ((k6w) m3u0Var.getValue()).a : 0L) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) - intValue));
            }
        }) : i == 3 ? k.u(ck11Var, new tls() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int intValue = ((Number) obj).intValue();
                e eVar = this;
                m3u0 m3u0Var = (m3u0) eVar.e.d(eVar.a.d.getValue());
                long j = m3u0Var != null ? ((k6w) m3u0Var.getValue()).a : 0L;
                long j2 = intValue;
                return (Integer) tlsVar.invoke(Integer.valueOf((-((int) (e.d(this, (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (j2 << 32), j) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) + ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
            }
        }) : ymo.a;
    }
}
