package androidx.compose.animation;

import defpackage.ck11;
import defpackage.gl11;
import defpackage.hy01;
import defpackage.jl40;
import defpackage.jw01;
import defpackage.jx31;
import defpackage.k6w;
import defpackage.qar;
import defpackage.rf9;
import defpackage.sb2;
import defpackage.sns0;
import defpackage.so5;
import defpackage.tkm0;
import defpackage.tls;
import defpackage.to5;
import defpackage.twt0;
import defpackage.uo5;
import defpackage.w2o;
import defpackage.x4c;
import defpackage.z5w;
import defpackage.z7p;
import defpackage.zmo;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public abstract class k {
    public static final gl11 a = new gl11(EnterExitTransitionKt$TransformOriginVectorConverter$1.w, EnterExitTransitionKt$TransformOriginVectorConverter$2.w);
    public static final twt0 b = sb2.G(0.0f, 400.0f, 5, null);
    public static final twt0 c;
    public static final twt0 d;

    static {
        sb2.G(0.0f, 400.0f, 5, null);
        Map map = jx31.a;
        c = sb2.G(0.0f, 400.0f, 1, new z5w(4294967297L));
        d = sb2.G(0.0f, 400.0f, 1, new k6w(4294967297L));
    }

    public static w2o a(ck11 ck11Var, so5 so5Var, int i) {
        so5 so5Var2 = x4c.I;
        qar qarVar = ck11Var;
        if ((i & 1) != 0) {
            Map map = jx31.a;
            qarVar = sb2.G(0.0f, 400.0f, 1, new k6w(4294967297L));
        }
        if ((i & 2) != 0) {
            so5Var = so5Var2;
        }
        return b(jl40.l(so5Var, x4c.G) ? x4c.x : jl40.l(so5Var, so5Var2) ? x4c.z : x4c.y, qarVar, new tls() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
            final /* synthetic */ tls $initialWidth = EnterExitTransitionKt$expandHorizontally$1.w;

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                long j = ((k6w) obj).a;
                return new k6w((((Number) this.$initialWidth.invoke(Integer.valueOf((int) (j >> 32)))).intValue() << 32) | (((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            }
        }, true);
    }

    public static final w2o b(uo5 uo5Var, qar qarVar, tls tlsVar, boolean z) {
        return new w2o(new hy01((z7p) null, (sns0) null, new rf9(uo5Var, qarVar, tlsVar, z), (tkm0) null, (LinkedHashMap) null, HProv.PP_PASSWD_TERM));
    }

    public static /* synthetic */ w2o c(ck11 ck11Var, int i) {
        qar qarVar = ck11Var;
        if ((i & 1) != 0) {
            Map map = jx31.a;
            qarVar = sb2.G(0.0f, 400.0f, 1, new k6w(4294967297L));
        }
        return b(x4c.C, qarVar, EnterExitTransitionKt$expandIn$1.w, true);
    }

    public static w2o d(qar qarVar, final tls tlsVar, int i) {
        to5 to5Var = x4c.F;
        to5 to5Var2 = x4c.D;
        if ((i & 1) != 0) {
            Map map = jx31.a;
            qarVar = sb2.G(0.0f, 400.0f, 1, new k6w(4294967297L));
        }
        to5 to5Var3 = (i & 2) != 0 ? to5Var : to5Var2;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            tlsVar = EnterExitTransitionKt$expandVertically$1.w;
        }
        return b(jl40.l(to5Var3, to5Var2) ? x4c.c : jl40.l(to5Var3, to5Var) ? x4c.B : x4c.y, qarVar, new tls() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return new k6w((((Number) tls.this.invoke(Integer.valueOf((int) (r0 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)))).intValue() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((int) (((k6w) obj).a >> 32)) << 32));
            }
        }, z);
    }

    public static w2o e(ck11 ck11Var, int i) {
        qar qarVar = ck11Var;
        if ((i & 1) != 0) {
            qarVar = sb2.G(0.0f, 400.0f, 5, null);
        }
        return new w2o(new hy01(new z7p(0.0f, qarVar), (sns0) null, (rf9) null, (tkm0) null, (LinkedHashMap) null, HProv.PP_DELETE_SAVED_PASSWD));
    }

    public static zmo f(ck11 ck11Var, int i) {
        qar qarVar = ck11Var;
        if ((i & 1) != 0) {
            qarVar = sb2.G(0.0f, 400.0f, 5, null);
        }
        return new zmo(new hy01(new z7p(0.0f, qarVar), (sns0) null, (rf9) null, (tkm0) null, (LinkedHashMap) null, HProv.PP_DELETE_SAVED_PASSWD));
    }

    public static w2o g(qar qarVar, float f, int i) {
        if ((i & 1) != 0) {
            qarVar = sb2.G(0.0f, 400.0f, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new w2o(new hy01((z7p) null, (sns0) null, (rf9) null, new tkm0(f, jw01.b, qarVar), (LinkedHashMap) null, 119));
    }

    public static zmo h(ck11 ck11Var, float f, int i) {
        qar qarVar = ck11Var;
        if ((i & 1) != 0) {
            qarVar = sb2.G(0.0f, 400.0f, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new zmo(new hy01((z7p) null, (sns0) null, (rf9) null, new tkm0(f, jw01.b, qarVar), (LinkedHashMap) null, 119));
    }

    public static zmo i(ck11 ck11Var, so5 so5Var, int i) {
        so5 so5Var2 = x4c.I;
        qar qarVar = ck11Var;
        if ((i & 1) != 0) {
            Map map = jx31.a;
            qarVar = sb2.G(0.0f, 400.0f, 1, new k6w(4294967297L));
        }
        if ((i & 2) != 0) {
            so5Var = so5Var2;
        }
        return j(jl40.l(so5Var, x4c.G) ? x4c.x : jl40.l(so5Var, so5Var2) ? x4c.z : x4c.y, qarVar, new tls() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2
            final /* synthetic */ tls $targetWidth = EnterExitTransitionKt$shrinkHorizontally$1.w;

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                long j = ((k6w) obj).a;
                return new k6w((((Number) this.$targetWidth.invoke(Integer.valueOf((int) (j >> 32)))).intValue() << 32) | (((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            }
        }, true);
    }

    public static final zmo j(uo5 uo5Var, qar qarVar, tls tlsVar, boolean z) {
        return new zmo(new hy01((z7p) null, (sns0) null, new rf9(uo5Var, qarVar, tlsVar, z), (tkm0) null, (LinkedHashMap) null, HProv.PP_PASSWD_TERM));
    }

    public static /* synthetic */ zmo k(ck11 ck11Var, int i) {
        qar qarVar = ck11Var;
        if ((i & 1) != 0) {
            Map map = jx31.a;
            qarVar = sb2.G(0.0f, 400.0f, 1, new k6w(4294967297L));
        }
        return j(x4c.C, qarVar, EnterExitTransitionKt$shrinkOut$1.w, true);
    }

    public static zmo l(qar qarVar, final tls tlsVar, int i) {
        to5 to5Var = x4c.F;
        to5 to5Var2 = x4c.D;
        if ((i & 1) != 0) {
            Map map = jx31.a;
            qarVar = sb2.G(0.0f, 400.0f, 1, new k6w(4294967297L));
        }
        to5 to5Var3 = (i & 2) != 0 ? to5Var : to5Var2;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            tlsVar = EnterExitTransitionKt$shrinkVertically$1.w;
        }
        return j(jl40.l(to5Var3, to5Var2) ? x4c.c : jl40.l(to5Var3, to5Var) ? x4c.B : x4c.y, qarVar, new tls() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return new k6w((((Number) tls.this.invoke(Integer.valueOf((int) (r0 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)))).intValue() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((int) (((k6w) obj).a >> 32)) << 32));
            }
        }, z);
    }

    public static final w2o m(qar qarVar, tls tlsVar) {
        return new w2o(new hy01((z7p) null, new sns0(qarVar, tlsVar), (rf9) null, (tkm0) null, (LinkedHashMap) null, HProv.PP_DELETE_KEYSET));
    }

    public static final w2o n(qar qarVar, final tls tlsVar) {
        return m(qarVar, new tls() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return new z5w(((Number) tls.this.invoke(Integer.valueOf((int) (((k6w) obj).a >> 32)))).intValue() << 32);
            }
        });
    }

    public static /* synthetic */ w2o o(int i, tls tlsVar, ck11 ck11Var) {
        qar qarVar = ck11Var;
        if ((i & 1) != 0) {
            Map map = jx31.a;
            qarVar = sb2.G(0.0f, 400.0f, 1, new z5w(4294967297L));
        }
        if ((i & 2) != 0) {
            tlsVar = EnterExitTransitionKt$slideInHorizontally$1.w;
        }
        return n(qarVar, tlsVar);
    }

    public static final w2o p(qar qarVar, final tls tlsVar) {
        return m(qarVar, new tls() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return new z5w(((Number) tls.this.invoke(Integer.valueOf((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)))).intValue() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            }
        });
    }

    public static /* synthetic */ w2o q(int i, tls tlsVar, ck11 ck11Var) {
        qar qarVar = ck11Var;
        if ((i & 1) != 0) {
            Map map = jx31.a;
            qarVar = sb2.G(0.0f, 400.0f, 1, new z5w(4294967297L));
        }
        if ((i & 2) != 0) {
            tlsVar = EnterExitTransitionKt$slideInVertically$1.w;
        }
        return p(qarVar, tlsVar);
    }

    public static final zmo r(qar qarVar, tls tlsVar) {
        return new zmo(new hy01((z7p) null, new sns0(qarVar, tlsVar), (rf9) null, (tkm0) null, (LinkedHashMap) null, HProv.PP_DELETE_KEYSET));
    }

    public static final zmo s(qar qarVar, final tls tlsVar) {
        return r(qarVar, new tls() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return new z5w(((Number) tls.this.invoke(Integer.valueOf((int) (((k6w) obj).a >> 32)))).intValue() << 32);
            }
        });
    }

    public static /* synthetic */ zmo t(int i, tls tlsVar, ck11 ck11Var) {
        qar qarVar = ck11Var;
        if ((i & 1) != 0) {
            Map map = jx31.a;
            qarVar = sb2.G(0.0f, 400.0f, 1, new z5w(4294967297L));
        }
        if ((i & 2) != 0) {
            tlsVar = EnterExitTransitionKt$slideOutHorizontally$1.w;
        }
        return s(qarVar, tlsVar);
    }

    public static final zmo u(qar qarVar, final tls tlsVar) {
        return r(qarVar, new tls() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return new z5w(((Number) tls.this.invoke(Integer.valueOf((int) (((k6w) obj).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)))).intValue() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            }
        });
    }

    public static /* synthetic */ zmo v(int i, tls tlsVar, ck11 ck11Var) {
        qar qarVar = ck11Var;
        if ((i & 1) != 0) {
            Map map = jx31.a;
            qarVar = sb2.G(0.0f, 400.0f, 1, new z5w(4294967297L));
        }
        if ((i & 2) != 0) {
            tlsVar = EnterExitTransitionKt$slideOutVertically$1.w;
        }
        return u(qarVar, tlsVar);
    }
}
