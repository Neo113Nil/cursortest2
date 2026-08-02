package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes11.dex */
public abstract class cib1 {
    public static final void a(tn9 tn9Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1066760175);
        if ((i & 6) == 0) {
            i2 = (btsVar2.e(tn9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            long d = rzo.d(tn9Var.b);
            int i3 = up2.c;
            btsVar = btsVar2;
            qgy.b(tn9Var.a, null, an91.l(bzk0.c(c530.a, new up2(d), cyk0.a), 6.0f, 2.0f), AppColor$Palette.EverFront, 0L, 0L, null, 0L, 0, 1, 0, xya1.e(btsVar).i.b, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6, 11250);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(tn9Var, i, 6);
        }
    }

    public static final void b(CharSequence charSequence, tn9 tn9Var, fid fidVar, int i) {
        int i2;
        tn9 tn9Var2;
        bts btsVar;
        boolean z;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-892752156);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? btsVar2.k(charSequence) : btsVar2.e(charSequence) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tn9Var) ? 32 : 16;
        }
        int i3 = i2;
        if (btsVar2.V(i3 & 1, (i3 & 19) != 18)) {
            lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.E, btsVar2, 54);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, c530.a);
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
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            if (charSequence == null) {
                btsVar2.e0(1123432884);
                btsVar2.t(false);
                tn9Var2 = tn9Var;
                btsVar = btsVar2;
                z = false;
            } else {
                btsVar2.e0(1123432885);
                qgy.b(charSequence, null, new x2y(1.0f, false), AppColor$Palette.EverFront, 0L, 0L, null, 0L, 2, 1, 0, xya1.e(btsVar2).g.b, null, btsVar2, (i3 & 14) | 805309440, 6, 10738);
                btsVar = btsVar2;
                z = false;
                btsVar.t(false);
                tn9Var2 = tn9Var;
            }
            if (tn9Var2 == null) {
                btsVar.e0(1123709404);
                btsVar.t(z);
            } else {
                btsVar.e0(1123709405);
                a(tn9Var2, btsVar, (i3 >> 3) & 14);
                btsVar.t(z);
            }
            btsVar.t(true);
        } else {
            tn9Var2 = tn9Var;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(charSequence, tn9Var2, i, 21);
        }
    }

    public static final void c(f530 f530Var, CharSequence charSequence, CharSequence charSequence2, tn9 tn9Var, fid fidVar, int i) {
        bts btsVar;
        boolean z;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1791423364);
        int i2 = i | (btsVar2.k(f530Var) ? 4 : 2) | (btsVar2.k(charSequence) ? 32 : 16) | (btsVar2.k(charSequence2) ? 256 : 128) | (btsVar2.e(tn9Var) ? 2048 : 1024);
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, f530Var);
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
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            int i3 = (i2 >> 3) & 14;
            int i4 = i2 >> 6;
            b(charSequence, tn9Var, btsVar2, i3 | (i4 & 112));
            if (charSequence2 == null) {
                btsVar2.e0(-1184264883);
                btsVar2.t(false);
                btsVar = btsVar2;
                z = true;
            } else {
                btsVar2.e0(-1184264882);
                oeb1.c(btsVar2, ljs0.q(c530.a, 4.0f));
                qgy.b(charSequence2, null, null, AppColor$Palette.TextInvert, 0L, 0L, null, 0L, 2, 2, 0, xya1.e(btsVar2).h.a, null, btsVar2, (i4 & 14) | 805309440, 6, 10742);
                btsVar = btsVar2;
                btsVar.t(false);
                z = true;
            }
            btsVar.t(z);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0(f530Var, charSequence, charSequence2, tn9Var, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final String str, f530 f530Var, final dty0 dty0Var, sjy0 sjy0Var, int i, int i2, fid fidVar, final int i3, final int i4) {
        f530 f530Var2;
        int i5;
        sjy0 sjy0Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        bts btsVar;
        final f530 f530Var3;
        final sjy0 sjy0Var3;
        final int i10;
        final int i11;
        aii0 v;
        int i12;
        f530 f530Var4;
        long j;
        sty0 sty0Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1361592329);
        int i13 = (btsVar2.k(str) ? 4 : 2) | i3;
        int i14 = i4 & 2;
        if (i14 != 0) {
            i5 = i13 | 48;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i5 = i13 | (btsVar2.k(f530Var2) ? 32 : 16);
        }
        int i15 = i5 | (btsVar2.k(dty0Var) ? 256 : 128);
        int i16 = i4 & 8;
        if (i16 != 0) {
            i6 = i15 | HProv.ALG_TYPE_SECURECHANNEL;
            sjy0Var2 = sjy0Var;
        } else {
            sjy0Var2 = sjy0Var;
            i6 = i15 | (btsVar2.k(sjy0Var2) ? 2048 : 1024);
        }
        int i17 = i4 & 16;
        if (i17 != 0) {
            i6 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i7 = i;
            i6 |= btsVar2.c(i7) ? 16384 : 8192;
            i8 = i4 & 32;
            if (i8 == 0) {
                i6 |= ImageMetadata.EDGE_MODE;
            } else if ((196608 & i3) == 0) {
                i9 = i2;
                i6 |= btsVar2.c(i9) ? 131072 : 65536;
                if (btsVar2.V(i6 & 1, (74899 & i6) != 74898)) {
                    if (i14 != 0) {
                        f530Var4 = c530.a;
                        i12 = i17;
                    } else {
                        i12 = i17;
                        f530Var4 = f530Var2;
                    }
                    sjy0 sjy0Var4 = i16 != 0 ? null : sjy0Var2;
                    int i18 = i12 != 0 ? Integer.MAX_VALUE : i7;
                    int i19 = i8 != 0 ? 1 : i9;
                    long j2 = (dty0Var == null || (sty0Var = dty0Var.a) == null) ? sty0.c : sty0Var.a;
                    lzr lzrVar = dty0Var != null ? dty0Var.b : null;
                    ldc ldcVar = dty0Var != null ? dty0Var.c : null;
                    if (ldcVar == null) {
                        btsVar2.e0(1474810655);
                        j = ((el51) btsVar2.m(gl51.a)).n();
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(1474809570);
                        btsVar2.t(false);
                        j = ldcVar.a;
                    }
                    btsVar = btsVar2;
                    wqy0.b(str, f530Var4, j, j2, null, lzrVar, null, 0L, null, sjy0Var4, 0L, i19, false, i18, 0, null, null, btsVar, (i6 & HProv.PP_DELETE_SAVED_PASSWD) | ((i6 << 18) & 1879048192), ((i6 >> 12) & 112) | ((i6 >> 3) & 7168), 120272);
                    f530Var3 = f530Var4;
                    sjy0Var3 = sjy0Var4;
                    i11 = i19;
                    i10 = i18;
                } else {
                    btsVar = btsVar2;
                    btsVar.Y();
                    f530Var3 = f530Var2;
                    sjy0Var3 = sjy0Var2;
                    i10 = i7;
                    i11 = i9;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: byu0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            cib1.d(str, f530Var3, dty0Var, sjy0Var3, i10, i11, (fid) obj, vng.O(i3 | 1), i4);
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            i9 = i2;
            if (btsVar2.V(i6 & 1, (74899 & i6) != 74898)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        i7 = i;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i2;
        if (btsVar2.V(i6 & 1, (74899 & i6) != 74898)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final MotionEvent e(x920 x920Var, Rect rect) {
        Number number;
        Long valueOf = (x920Var.c(RemoteBioParameters.TIME) && (number = (Number) x920Var.a(RemoteBioParameters.TIME)) != null) ? Long.valueOf(number.longValue()) : null;
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            Integer d = klb1.d(x920Var, "type");
            Integer num = (d != null && d.intValue() == 0) ? 0 : (d != null && d.intValue() == 1) ? 2 : (d != null && d.intValue() == 2) ? 1 : (d != null && d.intValue() == 3) ? 3 : null;
            if (num != null) {
                int intValue = num.intValue();
                List list = (List) klb1.a(x920Var, "events");
                if (list != null) {
                    int size = list.size();
                    MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[size];
                    for (int i = 0; i < size; i++) {
                        Map map = (Map) list.get(i);
                        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                        float f = 0.0f;
                        pointerCoords.x = ((Number) map.get(RemoteBioParameters.X)).floatValue() - (rect != null ? rect.left : 0.0f);
                        float floatValue = ((Number) map.get(RemoteBioParameters.Y)).floatValue();
                        if (rect != null) {
                            f = rect.top;
                        }
                        pointerCoords.y = floatValue - f;
                        pointerCoordsArr[i] = pointerCoords;
                    }
                    int size2 = list.size();
                    MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[size2];
                    for (int i2 = 0; i2 < size2; i2++) {
                        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
                        pointerProperties.id = ((Number) ((Map) list.get(i2)).get("index")).intValue();
                        pointerPropertiesArr[i2] = pointerProperties;
                    }
                    return MotionEvent.obtain(longValue, longValue, intValue, list.size(), pointerPropertiesArr, pointerCoordsArr, 0, 0, 1.0f, 1.0f, 0, 0, 0, 0);
                }
            }
        }
        return null;
    }

    public static final yr00 f(x920 x920Var) {
        Integer d = klb1.d(x920Var, "width");
        if (d == null) {
            return null;
        }
        int intValue = d.intValue();
        Integer d2 = klb1.d(x920Var, "height");
        if (d2 != null) {
            return new yr00(intValue, d2.intValue());
        }
        return null;
    }
}
