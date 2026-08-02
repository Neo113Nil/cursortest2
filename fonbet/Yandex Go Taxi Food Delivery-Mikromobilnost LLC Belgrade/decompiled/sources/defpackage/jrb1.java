package defpackage;

import androidx.compose.runtime.f;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.summary.ui.compose.common.tooltip.a;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes11.dex */
public abstract class jrb1 {
    public static final void a(f530 f530Var, cme cmeVar, boolean z, fid fidVar, int i) {
        int i2;
        f530 f530Var2 = f530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-210512227);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (btsVar.k(cmeVar) ? 32 : 16) | (btsVar.a(z) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = cmeVar instanceof ame;
            xw91 xw91Var = mhe.e;
            c36 c36Var = null;
            if (z2) {
                btsVar.e0(-717296617);
                pa90 m = mt71.m(((ame) cmeVar).a, 0, btsVar);
                if (z) {
                    btsVar.e0(-438776169);
                    c36Var = tse0.e(tje.n(AppColor$Palette.Text, btsVar), 5, btsVar, false);
                } else {
                    btsVar.e0(-717128288);
                    btsVar.t(false);
                }
                o4b1.b(m, null, f530Var, null, xw91Var, 0.0f, c36Var, btsVar, 24632 | ((i3 << 6) & 896), 40);
                btsVar.t(false);
                f530Var2 = f530Var;
            } else {
                if (!(cmeVar instanceof bme)) {
                    throw unr0.y(-438782325, btsVar, false);
                }
                btsVar.e0(-716967056);
                ovi0 a = mja1.a(((bme) cmeVar).a, null, 6);
                jfv jfvVar = z ? new jfv(AppColor$Palette.Text) : null;
                e6d.a.getClass();
                f530Var2 = f530Var;
                v0b1.a(a, f530Var2, null, null, e6d.b, jfvVar, null, xw91Var, 0.0f, 0, btsVar, ((i3 << 3) & 112) | 12607488, 844);
                btsVar = btsVar;
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(f530Var2, cmeVar, z, i);
        }
    }

    public static final void b(final String str, final m3u0 m3u0Var, final zls zlsVar, fid fidVar, final int i) {
        int i2;
        final m3u0 m3u0Var2;
        final zls zlsVar2;
        String str2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1421262711);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(m3u0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(zlsVar) ? 256 : 128;
        }
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            ypv0 ypv0Var = (ypv0) btsVar2.m(a.a);
            if (ypv0Var == null) {
                aii0 v = btsVar2.v();
                if (v != null) {
                    final int i4 = 0;
                    v.d = new wls() { // from class: fvz0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            zls zlsVar3 = zlsVar;
                            m3u0 m3u0Var3 = m3u0Var;
                            String str3 = str;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).intValue();
                            switch (i5) {
                                case 0:
                                    jrb1.b(str3, m3u0Var3, zlsVar3, fidVar2, vng.O(i6 | 1));
                                    break;
                                case 1:
                                    jrb1.b(str3, m3u0Var3, zlsVar3, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    jrb1.b(str3, m3u0Var3, zlsVar3, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            zlsVar2 = zlsVar;
            bts btsVar3 = btsVar2;
            zpv0 zpv0Var = (zpv0) ypv0Var.b.get(str);
            if (zpv0Var == null) {
                aii0 v2 = btsVar3.v();
                if (v2 != null) {
                    final int i5 = 1;
                    v2.d = new wls() { // from class: fvz0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i52 = i5;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            zls zlsVar3 = zlsVar2;
                            m3u0 m3u0Var3 = m3u0Var;
                            String str3 = str;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).intValue();
                            switch (i52) {
                                case 0:
                                    jrb1.b(str3, m3u0Var3, zlsVar3, fidVar2, vng.O(i6 | 1));
                                    break;
                                case 1:
                                    jrb1.b(str3, m3u0Var3, zlsVar3, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    jrb1.b(str3, m3u0Var3, zlsVar3, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            str2 = str;
            i = i;
            boolean e = btsVar3.e(ypv0Var) | btsVar3.k(zpv0Var);
            Object Q = btsVar3.Q();
            if (e || Q == did.a) {
                Q = new rmy0(i3, ypv0Var, zpv0Var);
                btsVar3.o0(Q);
            }
            xpv0.a(zpv0Var, m3u0Var, (tls) Q, null, zlsVar2, btsVar3, (i2 & 112) | ((i2 << 6) & HProv.ALG_CLASS_ALL));
            m3u0Var2 = m3u0Var;
            btsVar = btsVar3;
        } else {
            m3u0Var2 = m3u0Var;
            zlsVar2 = zlsVar;
            str2 = str;
            bts btsVar4 = btsVar2;
            btsVar4.Y();
            btsVar = btsVar4;
        }
        aii0 v3 = btsVar.v();
        if (v3 != null) {
            final int i6 = 2;
            final String str3 = str2;
            final int i7 = i;
            v3.d = new wls() { // from class: fvz0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i6;
                    zy11 zy11Var = zy11.a;
                    int i62 = i7;
                    zls zlsVar3 = zlsVar2;
                    m3u0 m3u0Var3 = m3u0Var2;
                    String str32 = str3;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).intValue();
                    switch (i52) {
                        case 0:
                            jrb1.b(str32, m3u0Var3, zlsVar3, fidVar2, vng.O(i62 | 1));
                            break;
                        case 1:
                            jrb1.b(str32, m3u0Var3, zlsVar3, fidVar2, vng.O(i62 | 1));
                            break;
                        default:
                            jrb1.b(str32, m3u0Var3, zlsVar3, fidVar2, vng.O(i62 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    public static final void c(final m3u0 m3u0Var, final zls zlsVar, fid fidVar, final int i) {
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-330688601);
        int i2 = (btsVar.e(zlsVar) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ypv0 ypv0Var = (ypv0) btsVar.m(a.a);
            if (ypv0Var == null) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(m3u0Var, zlsVar, i, i3) { // from class: evz0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ m3u0 b;
                        public final /* synthetic */ zls c;

                        {
                            this.a = i3;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            zy11 zy11Var = zy11.a;
                            zls zlsVar2 = this.c;
                            m3u0 m3u0Var2 = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    jrb1.c(m3u0Var2, zlsVar2, fidVar2, vng.O(7));
                                    break;
                                default:
                                    jrb1.c(m3u0Var2, zlsVar2, fidVar2, vng.O(7));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            Iterator it = ypv0Var.b.c.iterator();
            while (((c5u0) it).hasNext()) {
                String str = (String) ((c5u0) it).next();
                btsVar.c0(-713725266, str);
                b(str, m3u0Var, zlsVar, btsVar, (i2 << 3) & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(m3u0Var, zlsVar, i, i4) { // from class: evz0
                public final /* synthetic */ int a;
                public final /* synthetic */ m3u0 b;
                public final /* synthetic */ zls c;

                {
                    this.a = i4;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.a;
                    zy11 zy11Var = zy11.a;
                    zls zlsVar2 = this.c;
                    m3u0 m3u0Var2 = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            jrb1.c(m3u0Var2, zlsVar2, fidVar2, vng.O(7));
                            break;
                        default:
                            jrb1.c(m3u0Var2, zlsVar2, fidVar2, vng.O(7));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void d(f530 f530Var, zls zlsVar, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-469235977);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(zlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(aVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(new wu60(0L));
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new ypv0();
                btsVar.o0(Q2);
            }
            sb2.b(a.a.a((ypv0) Q2), wwg.S(637307831, true, new zhb0(f530Var, oz40Var, aVar, zlsVar, 27), btsVar), btsVar, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(f530Var, zlsVar, aVar, i, 3);
        }
    }
}
