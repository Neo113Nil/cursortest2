package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaCodecInfo;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.common.a;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.google.common.collect.ImmutableList;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.List;
import kotlin.Pair;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes11.dex */
public abstract class akb1 {
    public static final void a(final wwa wwaVar, final tls tlsVar, final tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1408886223);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(wwaVar) : btsVar.e(wwaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            float f = wwaVar.g ? 40.0f : 32.0f;
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            if (wwaVar.g) {
                btsVar.e0(361403445);
                yrl.b(6, 6, btsVar, an91.m(ljs0.c(c530Var, 1.0f), 8.0f, 0.0f, 2));
                ly3.B(c530Var, 2.0f, btsVar, false);
            } else {
                btsVar.e0(361549517);
                btsVar.t(false);
            }
            ydb1.a(ljs0.b(c530Var, 0.0f, f, 1), null, wwg.S(-74745370, true, new zls() { // from class: cya
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    o430 o430Var = did.a;
                    tls tlsVar3 = tlsVar;
                    wwa wwaVar2 = wwaVar;
                    switch (i5) {
                        case 0:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                CharSequence charSequence = wwaVar2.b;
                                CharSequence charSequence2 = wwaVar2.c;
                                boolean z = wwaVar2.f != null;
                                boolean e = btsVar2.e(wwaVar2) | btsVar2.k(tlsVar3);
                                Object Q = btsVar2.Q();
                                if (e || Q == o430Var) {
                                    Q = new dya(wwaVar2, tlsVar3);
                                    btsVar2.o0(Q);
                                }
                                akb1.c(ebp0Var, charSequence, charSequence2, z, (sls) Q, btsVar2, intValue & 14);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                CharSequence charSequence3 = wwaVar2.d;
                                if (charSequence3 != null) {
                                    btsVar3.e0(416471060);
                                    boolean z2 = wwaVar2.e != null;
                                    boolean k = btsVar3.k(tlsVar3) | btsVar3.e(wwaVar2);
                                    Object Q2 = btsVar3.Q();
                                    if (k || Q2 == o430Var) {
                                        Q2 = new dya(tlsVar3, wwaVar2);
                                        btsVar3.o0(Q2);
                                    }
                                    akb1.b(charSequence3, z2, (sls) Q2, btsVar3, 0);
                                    btsVar3.t(false);
                                    break;
                                } else {
                                    btsVar3.e0(416471059);
                                    btsVar3.t(false);
                                    break;
                                }
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, wwg.S(-889658848, true, new zls() { // from class: cya
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    o430 o430Var = did.a;
                    tls tlsVar3 = tlsVar2;
                    wwa wwaVar2 = wwaVar;
                    switch (i5) {
                        case 0:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                CharSequence charSequence = wwaVar2.b;
                                CharSequence charSequence2 = wwaVar2.c;
                                boolean z = wwaVar2.f != null;
                                boolean e = btsVar2.e(wwaVar2) | btsVar2.k(tlsVar3);
                                Object Q = btsVar2.Q();
                                if (e || Q == o430Var) {
                                    Q = new dya(wwaVar2, tlsVar3);
                                    btsVar2.o0(Q);
                                }
                                akb1.c(ebp0Var, charSequence, charSequence2, z, (sls) Q, btsVar2, intValue & 14);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                CharSequence charSequence3 = wwaVar2.d;
                                if (charSequence3 != null) {
                                    btsVar3.e0(416471060);
                                    boolean z2 = wwaVar2.e != null;
                                    boolean k = btsVar3.k(tlsVar3) | btsVar3.e(wwaVar2);
                                    Object Q2 = btsVar3.Q();
                                    if (k || Q2 == o430Var) {
                                        Q2 = new dya(tlsVar3, wwaVar2);
                                        btsVar3.o0(Q2);
                                    }
                                    akb1.b(charSequence3, z2, (sls) Q2, btsVar3, 0);
                                    btsVar3.t(false);
                                    break;
                                } else {
                                    btsVar3.e0(416471059);
                                    btsVar3.t(false);
                                    break;
                                }
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, null, false, btsVar, 24960, MSException.ERROR_MORE_DATA);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09((Object) wwaVar, (Object) tlsVar, (Object) tlsVar2, i, 11);
        }
    }

    public static final void b(CharSequence charSequence, boolean z, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(59669038);
        int i2 = i | (btsVar2.k(charSequence) ? 4 : 2) | (btsVar2.a(z) ? 32 : 16) | (btsVar2.e(slsVar) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = ly3.i(btsVar2);
            }
            btsVar = btsVar2;
            qgy.b(charSequence, null, an91.m(q791.b(c530.a, (zx40) Q, null, z, null, null, slsVar, 24), 16.0f, 0.0f, 2), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar, i2 & 14, 0, 16378);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(charSequence, z, slsVar, i, 4);
        }
    }

    public static final void c(ebp0 ebp0Var, CharSequence charSequence, CharSequence charSequence2, boolean z, sls slsVar, fid fidVar, int i) {
        ebp0 ebp0Var2;
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(899356826);
        if ((i & 6) == 0) {
            ebp0Var2 = ebp0Var;
            i2 = (btsVar2.k(ebp0Var2) ? 4 : 2) | i;
        } else {
            ebp0Var2 = ebp0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar2.k(charSequence) : btsVar2.e(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar2.k(charSequence2) : btsVar2.e(charSequence2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.a(z) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.e(slsVar) ? 16384 : 8192;
        }
        if (btsVar2.V(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b);
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = ly3.i(btsVar2);
            }
            zx40 zx40Var = (zx40) Q;
            Pair pair = z ? new Pair(umb1.a(charSequence, tje.y(o1h0.ic_chargers_info, context)), Boolean.TRUE) : new Pair(charSequence, Boolean.FALSE);
            btsVar = btsVar2;
            m9b1.b(ebp0Var2, (CharSequence) pair.getFirst(), q791.b(c530.a, zx40Var, null, ((Boolean) pair.getSecond()).booleanValue(), null, null, slsVar, 24), null, xya1.e(btsVar2).f.c, 0, 0, charSequence2 == null ? "" : charSequence2, null, xya1.e(btsVar2).i.a, 0, 0, null, btsVar, i2 & 14, 0, 32116);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(ebp0Var, charSequence, charSequence2, z, slsVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int d(boolean z) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            f7s f7sVar = new f7s();
            f7sVar.m = eh20.q("video/avc");
            a aVar = new a(f7sVar);
            String str = aVar.n;
            if (str != null) {
                List e = fd10.e(str, z, false);
                String b = fd10.b(aVar);
                Iterable p = b == null ? ImmutableList.p() : fd10.e(b, z, false);
                piv pivVar = ImmutableList.b;
                ImmutableList.a aVar2 = new ImmutableList.a();
                aVar2.d(e);
                aVar2.d(p);
                ImmutableList g = aVar2.g();
                for (int i = 0; i < g.size(); i++) {
                    if (((sb10) g.get(i)).d != null && ((sb10) g.get(i)).d.getVideoCapabilities() != null && (supportedPerformancePoints = ((sb10) g.get(i)).d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (supportedPerformancePoints.get(i2).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (MediaCodecUtil$DecoderQueryException unused) {
        }
        return 0;
    }

    public static final int e(Context context, String str) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "dimen", ConstantDeviceInfo.APP_PLATFORM);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final int f(Context context) {
        return e(context, "navigation_bar_height");
    }
}
