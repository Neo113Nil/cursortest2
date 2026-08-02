package defpackage;

import android.net.Uri;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class dta1 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, boolean z, qor qorVar, boolean z2, boolean z3, final a aVar, fid fidVar, final int i, final int i2) {
        f530 f530Var2;
        int i3;
        boolean z4;
        int i4;
        qor qorVar2;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        a aVar2;
        final f530 f530Var3;
        final boolean z7;
        final qor qorVar3;
        final boolean z8;
        final boolean z9;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-770671132);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z4 = z;
            i3 |= btsVar.a(z4) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                qorVar2 = qorVar;
                i3 |= btsVar.k(qorVar2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    z5 = z2;
                    i3 |= btsVar.a(z5) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        z6 = z3;
                        i3 |= btsVar.a(z6) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            aVar2 = aVar;
                            i3 |= btsVar.e(aVar2) ? 131072 : 65536;
                        } else {
                            aVar2 = aVar;
                        }
                        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
                            f530 f530Var4 = c530.a;
                            final f530 f530Var5 = i7 != 0 ? f530Var4 : f530Var2;
                            if (i8 != 0) {
                                z4 = true;
                            }
                            final qor qorVar4 = i4 != 0 ? null : qorVar2;
                            final boolean z10 = i5 != 0 ? true : z5;
                            final boolean z11 = i6 != 0 ? true : z6;
                            ((nx2) btsVar.m(uy2.c)).getClass();
                            final byk0 e = cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12);
                            if (z4) {
                                f530Var4 = ymb1.l(f530Var4, e);
                            }
                            final f530 f530Var6 = f530Var4;
                            final a aVar3 = aVar2;
                            k2z.a(AppColor$Palette.BgFloating, AppColor$Palette.Text, wwg.S(-899107724, true, new wls() { // from class: f0s
                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    fid fidVar2 = (fid) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    bts btsVar2 = (bts) fidVar2;
                                    boolean V = btsVar2.V(intValue & 1, (intValue & 3) != 2);
                                    zy11 zy11Var = zy11.a;
                                    if (!V) {
                                        btsVar2.Y();
                                        return zy11Var;
                                    }
                                    f530 k = m4m0.b(hbb1.c(ljs0.c(f530.this, 1.0f), dbb1.c(btsVar2), false, 24.0f, qorVar4, 2), ((ldc) btsVar2.m(k2z.b)).a, e).k(f530Var6);
                                    Object Q = btsVar2.Q();
                                    if (Q == did.a) {
                                        Q = a12.g;
                                        btsVar2.o0(Q);
                                    }
                                    f530 o = an91.o(exw0.a(k, zy11Var, (PointerInputEventHandler) Q), 0.0f, 4.0f, 0.0f, 8.0f, 5);
                                    f530 f530Var7 = c530.a;
                                    f530 k2 = o.k(z10 ? i9a1.d(f530Var7) : f530Var7);
                                    if (z11) {
                                        f530Var7 = i9a1.c(f530Var7);
                                    }
                                    f530 k3 = k2.k(f530Var7);
                                    z910 d = pi6.d(x4c.b, false);
                                    int hashCode = Long.hashCode(btsVar2.T);
                                    r1b0 o2 = btsVar2.o();
                                    f530 d2 = b.d(btsVar2, k3);
                                    ohd.G1.getClass();
                                    sls slsVar = d.b;
                                    if (btsVar2.a == null) {
                                        cma1.b0();
                                        throw null;
                                    }
                                    btsVar2.i0();
                                    if (btsVar2.S) {
                                        btsVar2.n(slsVar);
                                    } else {
                                        btsVar2.r0();
                                    }
                                    qje.W(btsVar2, d.f, d);
                                    qje.W(btsVar2, d.e, o2);
                                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                                    qje.M(btsVar2, d.h);
                                    qje.W(btsVar2, d.d, d2);
                                    aVar3.invoke(cj6.a, btsVar2, 6);
                                    btsVar2.t(true);
                                    return zy11Var;
                                }
                            }, btsVar), btsVar, 438);
                            z7 = z4;
                            f530Var3 = f530Var5;
                            qorVar3 = qorVar4;
                            z8 = z10;
                            z9 = z11;
                        } else {
                            btsVar.Y();
                            f530Var3 = f530Var2;
                            z7 = z4;
                            qorVar3 = qorVar2;
                            z8 = z5;
                            z9 = z6;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new wls() { // from class: g0s
                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    dta1.a(f530.this, z7, qorVar3, z8, z9, aVar, (fid) obj, vng.O(i | 1), i2);
                                    return zy11.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    z6 = z3;
                    if ((196608 & i) == 0) {
                    }
                    if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                z5 = z2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                z6 = z3;
                if ((196608 & i) == 0) {
                }
                if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            qorVar2 = qorVar;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z5 = z2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            z6 = z3;
            if ((196608 & i) == 0) {
            }
            if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        z4 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        qorVar2 = qorVar;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z5 = z2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        z6 = z3;
        if ((196608 & i) == 0) {
        }
        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final boolean b(Uri uri) {
        String scheme = uri.getScheme();
        String host = uri.getHost();
        return (scheme == null || evu0.J(scheme) || host == null || evu0.J(host)) ? false : true;
    }

    public static final LinkedHashMap c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                linkedHashMap.put(next, jSONObject.get(next));
            }
            return linkedHashMap;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final s3l0 d(r3l0 r3l0Var, txl txlVar) {
        return new s3l0(r3l0Var, txlVar);
    }

    public static int e(Object obj) {
        return (int) (Integer.rotateLeft((int) ((obj == null ? 0 : obj.hashCode()) * (-862048943)), 15) * 461845907);
    }
}
