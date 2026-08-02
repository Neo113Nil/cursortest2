package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.platform.statusbar.a;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.utils.CustomImageSpan;
import skeletor.render.SkeletonContentView;

/* loaded from: classes11.dex */
public abstract class crb1 {
    /* JADX WARN: Removed duplicated region for block: B:105:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, wls wlsVar, to5 to5Var, wls wlsVar2, to5 to5Var2, wls wlsVar3, to5 to5Var3, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        to5 to5Var4;
        int i4;
        wls wlsVar4;
        int i5;
        to5 to5Var5;
        int i6;
        wls wlsVar5;
        int i7;
        to5 to5Var6;
        f530 f530Var3;
        to5 to5Var7;
        to5 to5Var8;
        aii0 v;
        to5 to5Var9 = x4c.E;
        bts btsVar = (bts) fidVar;
        btsVar.g0(310204966);
        dmw0 dmw0Var = btsVar.a;
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(wlsVar) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            to5Var4 = to5Var;
            i3 |= btsVar.k(to5Var4) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                wlsVar4 = wlsVar2;
                i3 |= btsVar.e(wlsVar4) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    to5Var5 = to5Var2;
                    i3 |= btsVar.k(to5Var5) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ImageMetadata.EDGE_MODE;
                        wlsVar5 = wlsVar3;
                    } else {
                        wlsVar5 = wlsVar3;
                        if ((i & ImageMetadata.EDGE_MODE) == 0) {
                            i3 |= btsVar.e(wlsVar5) ? 131072 : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        to5Var6 = to5Var3;
                    } else {
                        to5Var6 = to5Var3;
                        if ((i & 1572864) == 0) {
                            i3 |= btsVar.k(to5Var6) ? 1048576 : 524288;
                        }
                    }
                    if (btsVar.V(i3 & 1, (i3 & 599187) == 599186)) {
                        btsVar.Y();
                        f530Var3 = f530Var2;
                        to5Var7 = to5Var6;
                        to5Var8 = to5Var4;
                    } else {
                        c530 c530Var = c530.a;
                        if (i8 != 0) {
                            f530Var2 = c530Var;
                        }
                        if (i9 != 0) {
                            to5Var4 = to5Var9;
                        }
                        if (i4 != 0) {
                            ied.a.getClass();
                            wlsVar4 = ied.g;
                        }
                        if (i5 != 0) {
                            to5Var5 = to5Var9;
                        }
                        if (i6 != 0) {
                            ied.a.getClass();
                            wlsVar5 = ied.h;
                        }
                        if (i7 != 0) {
                            to5Var6 = to5Var9;
                        }
                        f530 h = ljs0.h(f530Var2, dsz0.c);
                        int i10 = 4194288 & i3;
                        boolean z = ((((57344 & i3) ^ HProv.ALG_CLASS_DATA_ENCRYPT) > 16384 && btsVar.k(to5Var5)) || (i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 16384) | ((((i3 & 896) ^ 384) > 256 && btsVar.k(to5Var4)) || (i3 & 384) == 256) | ((((3670016 & i3) ^ 1572864) > 1048576 && btsVar.k(to5Var6)) || (i3 & 1572864) == 1048576);
                        Object Q = btsVar.Q();
                        if (z || Q == did.a) {
                            Q = new m69(to5Var4, to5Var5, to5Var6);
                            btsVar.o0(Q);
                        }
                        z910 z910Var = (z910) Q;
                        f530Var3 = f530Var2;
                        int hashCode = Long.hashCode(btsVar.T);
                        r1b0 o = btsVar.o();
                        f530 d = b.d(btsVar, h);
                        ohd.G1.getClass();
                        sls slsVar = d.b;
                        if (dmw0Var == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar);
                        } else {
                            btsVar.r0();
                        }
                        wls wlsVar6 = d.f;
                        qje.W(btsVar, wlsVar6, z910Var);
                        wls wlsVar7 = d.e;
                        qje.W(btsVar, wlsVar7, o);
                        Integer valueOf = Integer.valueOf(hashCode);
                        wls wlsVar8 = d.g;
                        qje.W(btsVar, wlsVar8, valueOf);
                        tls tlsVar = d.h;
                        qje.M(btsVar, tlsVar);
                        wls wlsVar9 = d.d;
                        qje.W(btsVar, wlsVar9, d);
                        wlsVar.invoke(btsVar, Integer.valueOf((i10 >> 3) & 14));
                        f530 h2 = pj91.h(c530Var, "center");
                        z910 d2 = pi6.d(x4c.y, false);
                        to5 to5Var10 = to5Var6;
                        to5 to5Var11 = to5Var4;
                        int hashCode2 = Long.hashCode(btsVar.T);
                        r1b0 o2 = btsVar.o();
                        f530 d3 = b.d(btsVar, h2);
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar);
                        } else {
                            btsVar.r0();
                        }
                        qje.W(btsVar, wlsVar6, d2);
                        qje.W(btsVar, wlsVar7, o2);
                        vfc.v(hashCode2, btsVar, wlsVar8, btsVar, tlsVar);
                        qje.W(btsVar, wlsVar9, d3);
                        xvz.u((i10 >> 9) & 14, wlsVar4, btsVar, true);
                        xvz.u((i10 >> 15) & 14, wlsVar5, btsVar, true);
                        to5Var8 = to5Var11;
                        to5Var7 = to5Var10;
                    }
                    wls wlsVar10 = wlsVar4;
                    wls wlsVar11 = wlsVar5;
                    to5 to5Var12 = to5Var5;
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new bh6(f530Var3, wlsVar, to5Var8, wlsVar10, to5Var12, wlsVar11, to5Var7, i, i2, 2);
                        return;
                    }
                    return;
                }
                to5Var5 = to5Var2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if (btsVar.V(i3 & 1, (i3 & 599187) == 599186)) {
                }
                wls wlsVar102 = wlsVar4;
                wls wlsVar112 = wlsVar5;
                to5 to5Var122 = to5Var5;
                v = btsVar.v();
                if (v == null) {
                }
            }
            wlsVar4 = wlsVar2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            to5Var5 = to5Var2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if (btsVar.V(i3 & 1, (i3 & 599187) == 599186)) {
            }
            wls wlsVar1022 = wlsVar4;
            wls wlsVar1122 = wlsVar5;
            to5 to5Var1222 = to5Var5;
            v = btsVar.v();
            if (v == null) {
            }
        }
        to5Var4 = to5Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        wlsVar4 = wlsVar2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        to5Var5 = to5Var2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 599187) == 599186)) {
        }
        wls wlsVar10222 = wlsVar4;
        wls wlsVar11222 = wlsVar5;
        to5 to5Var12222 = to5Var5;
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f530 f530Var, wls wlsVar, to5 to5Var, wls wlsVar2, to5 to5Var2, wls wlsVar3, to5 to5Var3, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        wls wlsVar4;
        int i4;
        wls wlsVar5;
        int i5;
        wls wlsVar6;
        int i6;
        to5 to5Var4;
        to5 to5Var5;
        f530 f530Var3;
        to5 to5Var6;
        aii0 v;
        int i7;
        boolean z;
        to5 to5Var7 = x4c.E;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1465424380);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            wlsVar4 = wlsVar;
            i3 |= btsVar.e(wlsVar4) ? 32 : 16;
            int i10 = i3 | 384;
            i4 = i2 & 8;
            if (i4 == 0) {
                i10 = i3 | 3456;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                wlsVar5 = wlsVar2;
                i10 |= btsVar.e(wlsVar5) ? 2048 : 1024;
                int i11 = i10 | HProv.ALG_CLASS_DATA_ENCRYPT;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i11 = 221184 | i10;
                } else if ((196608 & i) == 0) {
                    wlsVar6 = wlsVar3;
                    i11 |= btsVar.e(wlsVar6) ? 131072 : 65536;
                    i6 = i11 | 1572864;
                    if (btsVar.V(i6 & 1, (599187 & i6) == 599186)) {
                        btsVar.Y();
                        to5Var4 = to5Var;
                        to5Var5 = to5Var3;
                        f530Var3 = f530Var2;
                        to5Var6 = to5Var2;
                    } else {
                        f530Var3 = i8 != 0 ? c530.a : f530Var2;
                        if (i9 != 0) {
                            ied.a.getClass();
                            wlsVar4 = ied.b;
                        }
                        if (i4 != 0) {
                            ied.a.getClass();
                            wlsVar5 = ied.c;
                        }
                        if (i5 != 0) {
                            ied.a.getClass();
                            wlsVar6 = ied.d;
                        }
                        boolean k = btsVar.k(sy2.a(btsVar));
                        Object Q = btsVar.Q();
                        if (k || Q == did.a) {
                            Q = null;
                            btsVar.o0(null);
                        }
                        csz0 csz0Var = (csz0) Q;
                        if (csz0Var == null) {
                            csz0Var = dsz0.a;
                        }
                        int i12 = esz0.a[csz0Var.c.ordinal()];
                        if (i12 == 1) {
                            i7 = 0;
                            btsVar.e0(-476425565);
                            z = ((ry2) btsVar.m(uy2.a)).b;
                            btsVar.t(false);
                        } else if (i12 == 2) {
                            i7 = 0;
                            btsVar.e0(-476424044);
                            z = !((ry2) btsVar.m(uy2.a)).b;
                            btsVar.t(false);
                        } else if (i12 == 3) {
                            i7 = 0;
                            btsVar.e0(-1884185292);
                            btsVar.t(false);
                            z = false;
                        } else {
                            if (i12 != 4) {
                                throw unr0.y(-476428207, btsVar, false);
                            }
                            btsVar.e0(-1884145649);
                            i7 = 0;
                            btsVar.t(false);
                            z = true;
                        }
                        a.a(z, btsVar, i7);
                        k2z.a(csz0Var.a, csz0Var.b, wwg.S(-1725969044, true, new zhb0(f530Var3, wlsVar4, wlsVar5, wlsVar6, 23), btsVar), btsVar, 384);
                        to5Var4 = to5Var7;
                        to5Var6 = to5Var4;
                        to5Var5 = to5Var6;
                    }
                    wls wlsVar7 = wlsVar5;
                    wls wlsVar8 = wlsVar6;
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new bh6(f530Var3, wlsVar4, to5Var4, wlsVar7, to5Var6, wlsVar8, to5Var5, i, i2, 1);
                        return;
                    }
                    return;
                }
                wlsVar6 = wlsVar3;
                i6 = i11 | 1572864;
                if (btsVar.V(i6 & 1, (599187 & i6) == 599186)) {
                }
                wls wlsVar72 = wlsVar5;
                wls wlsVar82 = wlsVar6;
                v = btsVar.v();
                if (v == null) {
                }
            }
            wlsVar5 = wlsVar2;
            int i112 = i10 | HProv.ALG_CLASS_DATA_ENCRYPT;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            wlsVar6 = wlsVar3;
            i6 = i112 | 1572864;
            if (btsVar.V(i6 & 1, (599187 & i6) == 599186)) {
            }
            wls wlsVar722 = wlsVar5;
            wls wlsVar822 = wlsVar6;
            v = btsVar.v();
            if (v == null) {
            }
        }
        wlsVar4 = wlsVar;
        int i102 = i3 | 384;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        wlsVar5 = wlsVar2;
        int i1122 = i102 | HProv.ALG_CLASS_DATA_ENCRYPT;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        wlsVar6 = wlsVar3;
        i6 = i1122 | 1572864;
        if (btsVar.V(i6 & 1, (599187 & i6) == 599186)) {
        }
        wls wlsVar7222 = wlsVar5;
        wls wlsVar8222 = wlsVar6;
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(f530 f530Var, wls wlsVar, to5 to5Var, wls wlsVar2, to5 to5Var2, wls wlsVar3, to5 to5Var3, fid fidVar, int i, int i2) {
        wls wlsVar4;
        int i3;
        to5 to5Var4;
        to5 to5Var5;
        to5 to5Var6;
        wls wlsVar5;
        aii0 v;
        wls wlsVar6;
        to5 to5Var7 = x4c.E;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1251703671);
        int i4 = i | 390;
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 = i | 3462;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar.e(wlsVar2) ? 2048 : 1024;
        }
        int i6 = i4 | HProv.ALG_CLASS_DATA_ENCRYPT;
        int i7 = i2 & 32;
        if (i7 != 0) {
            i6 = 221184 | i4;
        } else if ((196608 & i) == 0) {
            wlsVar4 = wlsVar3;
            i6 |= btsVar.e(wlsVar4) ? 131072 : 65536;
            i3 = i6 | 1572864;
            if (btsVar.V(i3 & 1, (599187 & i3) == 599186)) {
                btsVar.Y();
                to5Var4 = to5Var;
                to5Var5 = to5Var2;
                to5Var6 = to5Var3;
                wlsVar5 = wlsVar4;
            } else {
                if (i5 != 0) {
                    ied.a.getClass();
                    wlsVar2 = ied.e;
                }
                if (i7 != 0) {
                    ied.a.getClass();
                    wlsVar6 = ied.f;
                } else {
                    wlsVar6 = wlsVar4;
                }
                boolean k = btsVar.k(sy2.a(btsVar));
                Object Q = btsVar.Q();
                if (k || Q == did.a) {
                    Q = null;
                    btsVar.o0(null);
                }
                csz0 csz0Var = (csz0) Q;
                if (csz0Var == null) {
                    csz0Var = dsz0.a;
                }
                k2z.a(csz0Var.a, csz0Var.b, wwg.S(1823947495, true, new nvs0(wlsVar, wlsVar2, wlsVar6), btsVar), btsVar, 384);
                wlsVar5 = wlsVar6;
                f530Var = c530.a;
                to5Var4 = to5Var7;
                to5Var5 = to5Var4;
                to5Var6 = to5Var5;
            }
            wls wlsVar7 = wlsVar2;
            v = btsVar.v();
            if (v == null) {
                v.d = new bh6(f530Var, wlsVar, to5Var4, wlsVar7, to5Var5, wlsVar5, to5Var6, i, i2, 3);
                return;
            }
            return;
        }
        wlsVar4 = wlsVar3;
        i3 = i6 | 1572864;
        if (btsVar.V(i3 & 1, (599187 & i3) == 599186)) {
        }
        wls wlsVar72 = wlsVar2;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final Drawable d(Context context, int i, Integer num) {
        Drawable t = vng.t(i, context);
        t.setLayoutDirection(xw31.n(context) ? 1 : 0);
        int color = context.getColor(num.intValue());
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if ((color >> 24) == 0) {
            color = (int) (color | SkeletonContentView.HUNDRED_PERCENTS_ALPHA);
        }
        if (jl40.l(t.mutate(), t)) {
            t.setColorFilter(or2.c(color, mode));
            return t;
        }
        jst.e.c("Mutate returned different drawable!");
        return t;
    }

    public static final SpannableStringBuilder e(Drawable drawable, boolean z, Integer num, boolean z2) {
        if (drawable == null) {
            return null;
        }
        if (num != null) {
            mam.b(drawable, num.intValue(), z2);
        }
        return new SpannableStringBuilder().append(" ", new CustomImageSpan(drawable, 2, false, z, null, 20, null), 33);
    }

    public static SpannableStringBuilder f(Context context, Integer num, Integer num2, int i) {
        boolean z = (i & 2) != 0;
        if ((i & 4) != 0) {
            num2 = null;
        }
        Drawable t = vng.t(num.intValue(), context);
        t.setLayoutDirection(xw31.n(context) ? 1 : 0);
        return e(t, z, num2, false);
    }

    public static final nf70 g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new of70(((Number) it.next()).intValue()));
        }
        return new nf70(arrayList2);
    }

    public static final nf70 h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new qf70((String) it.next()));
        }
        return new nf70(arrayList2);
    }
}
