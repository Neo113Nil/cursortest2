package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ironsource.InterfaceC4413l1;
import com.vk.newsfeed.common.prefetch.ClipsPrefetchHelper;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: PrefetchHelperFactoryImpl.kt */
/* loaded from: classes.dex */
public final class yzc0 implements wzc0, w8i {
    public static final bpn0 A;
    public static final bpn0 B;
    public static final bpn0 C;
    public static final bpn0 D;
    public static final bpn0 E;
    public static final bpn0 F;
    public static final bpn0 G;
    public static final bpn0 H;
    public static final bpn0 I;
    public static final bpn0 J;
    public static final bpn0 K;
    public static final bpn0 L;
    public static final bpn0 M;
    public static final bpn0 N;
    public static final bpn0 O;
    public static final bpn0 P;
    public static final yzc0 b = new yzc0();
    public static final bpn0 c = new bpn0(new er6(7));
    public static final bpn0 d = new bpn0(new qo(8));
    public static final bpn0 e = new bpn0(new aqi(6));
    public static final bpn0 f = new bpn0(new y45(9));
    public static final bpn0 g = new bpn0(new yp6(11));
    public static final Object h = msy.a(LazyThreadSafetyMode.NONE, new s65(10));
    public static final bpn0 i = new bpn0(new c24(10));
    public static final bpn0 j = new bpn0(new l67(7));
    public static final bpn0 k = new bpn0(new mb8(7));
    public static final bpn0 l = new bpn0(new nb8(13));
    public static final bpn0 m = new bpn0(new jvg(8));
    public static final bpn0 n = new bpn0(new ag7(5));
    public static final bpn0 o;
    public static final bpn0 p;
    public static final bpn0 q;
    public static final bpn0 r;
    public static final bpn0 s;
    public static final bpn0 t;
    public static final bpn0 u;
    public static final bpn0 v;
    public static final bpn0 w;
    public static final bpn0 x;
    public static final bpn0 y;
    public static final bpn0 z;

    /* compiled from: PrefetchHelperFactoryImpl.kt */
    /* loaded from: classes4.dex */
    public static final class a implements bin0, g0t {
        public final /* synthetic */ y84 b;

        public a(y84 y84Var) {
            this.b = y84Var;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof bin0) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.bin0
        public final /* synthetic */ Object get() {
            return this.b.invoke();
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    static {
        new bpn0(new jbw(6));
        o = new bpn0(new qb8(6));
        p = new bpn0(new k03(10));
        q = new bpn0(new vv8(5));
        r = new bpn0(new wv8(6));
        new bpn0(new l03(8));
        s = new bpn0(new m03(7));
        t = new bpn0(new fr6(11));
        u = new bpn0(new dw9(8));
        v = new bpn0(new ib3(11));
        w = new bpn0(new mn8(9));
        x = new bpn0(new kb3(9));
        y = new bpn0(new q57(10));
        z = new bpn0(new xu2(9));
        A = new bpn0(new mb3(13));
        B = new bpn0(new ox4(6));
        C = new bpn0(new s3a(6));
        D = new bpn0(new aq0(7));
        E = new bpn0(new wb3(4));
        F = new bpn0(new xb3(9));
        G = new bpn0(new xh6(11));
        H = new bpn0(new y56(5));
        I = new bpn0(new kb0(7));
        J = new bpn0(new ihg(6));
        K = new bpn0(new exw(3));
        L = new bpn0(new wfl(3));
        M = new bpn0(new rwe(9));
        N = new bpn0(new hb8(8));
        O = new bpn0(new zfl(6));
        P = new bpn0(new m(9));
    }

    public static de b(int i2) {
        return i2 != 13 ? i2 != 26 ? i2 != 32 ? i2 != 37 ? i2 != 44 ? i2 != 63 ? i2 != 68 ? i2 != 70 ? (sno) v.getValue() : (hto) r.getValue() : (cib) q.getValue() : (h9t) J.getValue() : (psd0) C.getValue() : (a350) K.getValue() : (nqu) p.getValue() : (tq20) I.getValue() : (bss) o.getValue();
    }

    @Override // xsna.wzc0
    public final de a(u1c0 u1c0Var) {
        if (u1c0Var instanceof k5i) {
            return (l5i) j.getValue();
        }
        if (u1c0Var instanceof r74) {
            return ((r74) u1c0Var).f() == 49 ? (j3d0) i.getValue() : (s74) k.getValue();
        }
        if (u1c0Var instanceof w84) {
            return (vfw) l.getValue();
        }
        switch (u1c0Var.f()) {
            case 1:
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
            case 341:
                return (y6s) B.getValue();
            case 13:
                return (bss) o.getValue();
            case 18:
                return (na0) n.getValue();
            case 19:
                return (g90) m.getValue();
            case 30:
                return (jmy) t.getValue();
            case 32:
                return (r4e0) u.getValue();
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
                return (eym) x.getValue();
            case 87:
                return (kym) w.getValue();
            case 102:
                return (dhv) y.getValue();
            case ASSET_WRITE_ERROR_VALUE:
            case 291:
            case 363:
            case 370:
                return (ClipsPrefetchHelper) E.getValue();
            case 116:
                return (nqu) p.getValue();
            case ASSET_FAILED_STATUS_CODE_VALUE:
                return (cib) q.getValue();
            case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                return (udv) A.getValue();
            case 127:
                return (tq20) I.getValue();
            case 141:
                return (a350) K.getValue();
            case 165:
                return (psd0) C.getValue();
            case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                return (fhv) z.getValue();
            case 233:
                return (m4n) G.getValue();
            case 247:
                return (s4n) H.getValue();
            case 284:
                return (mx3) L.getValue();
            case 302:
                return (y3c0) s.getValue();
            case MRAID_JS_CALL_EMPTY_VALUE:
                return b(u1c0Var.a.zb());
            case AD_CLOSED_MISSING_HEARTBEAT_VALUE:
                return (e6n0) D.getValue();
            case 320:
                return (h9t) J.getValue();
            case MRAID_UNRECOGNIZED_COMMAND_VALUE:
                return (bfx) F.getValue();
            case 355:
                return (cs50) M.getValue();
            case 360:
                return (tt80) N.getValue();
            case 361:
            case 362:
                return (adf0) P.getValue();
            case InterfaceC4413l1.a.b.g /* 407 */:
                return (h5y0) O.getValue();
            case ApiInvocationException.ErrorCodes.UNAUTHORIZED_RESTRICTION /* 457 */:
                return (hto) r.getValue();
            default:
                return (sno) v.getValue();
        }
    }
}
