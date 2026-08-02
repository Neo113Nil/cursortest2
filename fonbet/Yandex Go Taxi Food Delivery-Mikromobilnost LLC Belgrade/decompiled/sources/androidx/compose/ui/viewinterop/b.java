package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.j2m0;
import defpackage.l1m0;
import defpackage.l4z;
import defpackage.m390;
import defpackage.mvr;
import defpackage.n1m0;
import defpackage.n3z;
import defpackage.ohd;
import defpackage.pey;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sls;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.x4e;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public abstract class b {
    public static final tls a = null;

    public static final void a(final tls tlsVar, f530 f530Var, tls tlsVar2, fid fidVar, final int i, final int i2) {
        int i3;
        final f530 f530Var2;
        final tls tlsVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1783766393);
        if ((i & 6) == 0) {
            i3 = (btsVar.e(tlsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            f530 f530Var3 = f530Var;
            AndroidView_androidKt$NoOpUpdate$1 androidView_androidKt$NoOpUpdate$1 = AndroidView_androidKt$NoOpUpdate$1.w;
            tls tlsVar4 = i5 != 0 ? androidView_androidKt$NoOpUpdate$1 : tlsVar2;
            b(tlsVar, f530Var3, null, androidView_androidKt$NoOpUpdate$1, tlsVar4, btsVar, (i3 & 14) | HProv.ALG_TYPE_SECURECHANNEL | (i3 & 112) | (57344 & (i3 << 6)), 4);
            f530Var2 = f530Var3;
            tlsVar3 = tlsVar4;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            tlsVar3 = tlsVar2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    b.a(tls.this, f530Var2, tlsVar3, (fid) obj, vng.O(i | 1), i2);
                    return zy11.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final tls tlsVar, f530 f530Var, tls tlsVar2, tls tlsVar3, tls tlsVar4, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        tls tlsVar5;
        int i5;
        tls tlsVar6;
        int i6;
        tls tlsVar7;
        final f530 f530Var3;
        final tls tlsVar8;
        final tls tlsVar9;
        final tls tlsVar10;
        aii0 v;
        tls tlsVar11;
        tls tlsVar12;
        f530 f530Var4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-180024211);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i3 = (btsVar.e(tlsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                tlsVar5 = tlsVar2;
                i3 |= btsVar.e(tlsVar5) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    tlsVar6 = tlsVar3;
                    i3 |= btsVar.e(tlsVar6) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        tlsVar7 = tlsVar4;
                        i3 |= btsVar.e(tlsVar7) ? 16384 : 8192;
                        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
                            f530 f530Var5 = i7 != 0 ? c530.a : f530Var2;
                            tls tlsVar13 = i4 != 0 ? null : tlsVar5;
                            tls tlsVar14 = AndroidView_androidKt$NoOpUpdate$1.w;
                            if (i5 != 0) {
                                tlsVar6 = tlsVar14;
                            }
                            if (i6 == 0) {
                                tlsVar14 = tlsVar7;
                            }
                            int hashCode = Long.hashCode(btsVar.T);
                            f530 d = androidx.compose.ui.b.d(btsVar, f530Var5.k(e.a).k(mvr.a).k(g.a).k(f.a));
                            fwi fwiVar = (fwi) btsVar.m(j.h);
                            LayoutDirection layoutDirection = (LayoutDirection) btsVar.m(j.n);
                            r1b0 o = btsVar.o();
                            pey peyVar = (pey) btsVar.m(n3z.a);
                            j2m0 j2m0Var = (j2m0) btsVar.m(l4z.a);
                            if (tlsVar13 != null) {
                                btsVar.e0(1313917368);
                                sls d2 = d(tlsVar, btsVar, i3 & 14);
                                if (dmw0Var == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar.i0();
                                if (btsVar.S) {
                                    btsVar.n(d2);
                                } else {
                                    btsVar.r0();
                                }
                                tlsVar12 = tlsVar14;
                                tlsVar11 = tlsVar6;
                                e(btsVar, d, hashCode, fwiVar, peyVar, j2m0Var, layoutDirection, o);
                                qje.W(btsVar, AndroidView_androidKt$AndroidView$2$1.w, tlsVar13);
                                qje.W(btsVar, AndroidView_androidKt$AndroidView$2$2.w, tlsVar12);
                                qje.W(btsVar, AndroidView_androidKt$AndroidView$2$3.w, tlsVar11);
                                btsVar.t(true);
                                btsVar.t(false);
                                f530Var4 = f530Var5;
                            } else {
                                tlsVar11 = tlsVar6;
                                tlsVar12 = tlsVar14;
                                btsVar.e0(1314774735);
                                sls d3 = d(tlsVar, btsVar, i3 & 14);
                                if (dmw0Var == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                f530Var4 = f530Var5;
                                btsVar.Z(HProv.PP_DELETE_KEYSET, null, null, 1);
                                btsVar.r = true;
                                if (btsVar.S) {
                                    btsVar.n(d3);
                                } else {
                                    btsVar.r0();
                                }
                                e(btsVar, d, hashCode, fwiVar, peyVar, j2m0Var, layoutDirection, o);
                                qje.W(btsVar, AndroidView_androidKt$AndroidView$3$1.w, tlsVar12);
                                qje.W(btsVar, AndroidView_androidKt$AndroidView$3$2.w, tlsVar11);
                                btsVar.t(true);
                                btsVar.t(false);
                            }
                            tlsVar8 = tlsVar13;
                            f530Var3 = f530Var4;
                            tlsVar10 = tlsVar12;
                            tlsVar9 = tlsVar11;
                        } else {
                            btsVar.Y();
                            f530Var3 = f530Var2;
                            tlsVar8 = tlsVar5;
                            tlsVar9 = tlsVar6;
                            tlsVar10 = tlsVar7;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new wls() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Number) obj2).intValue();
                                    b.b(tls.this, f530Var3, tlsVar8, tlsVar9, tlsVar10, (fid) obj, vng.O(i | 1), i2);
                                    return zy11.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    tlsVar7 = tlsVar4;
                    if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                tlsVar6 = tlsVar3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                tlsVar7 = tlsVar4;
                if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            tlsVar5 = tlsVar2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            tlsVar6 = tlsVar3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            tlsVar7 = tlsVar4;
            if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        tlsVar5 = tlsVar2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        tlsVar6 = tlsVar3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        tlsVar7 = tlsVar4;
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final ViewFactoryHolder c(LayoutNode layoutNode) {
        AndroidViewHolder androidViewHolder = layoutNode.H;
        if (androidViewHolder != null) {
            return (ViewFactoryHolder) androidViewHolder;
        }
        throw x4e.v("Required value was null.");
    }

    public static final sls d(final tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        final int hashCode = Long.hashCode(btsVar.T);
        final Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
        final androidx.compose.runtime.c y0 = cma1.y0(btsVar);
        final l1m0 l1m0Var = (l1m0) btsVar.m(n1m0.a);
        final View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
        boolean e = ((((i & 14) ^ 6) > 4 && btsVar.k(tlsVar)) || (i & 6) == 4) | btsVar.e(context) | btsVar.e(y0) | btsVar.e(l1m0Var) | btsVar.c(hashCode) | btsVar.e(view);
        Object Q = btsVar.Q();
        if (e || Q == did.a) {
            sls slsVar = new sls() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    return new ViewFactoryHolder(context, tlsVar, y0, l1m0Var, hashCode, (m390) view).getLayoutNode();
                }
            };
            btsVar.o0(slsVar);
            Q = slsVar;
        }
        return (sls) Q;
    }

    public static final void e(fid fidVar, f530 f530Var, int i, fwi fwiVar, pey peyVar, j2m0 j2m0Var, LayoutDirection layoutDirection, r1b0 r1b0Var) {
        ohd.G1.getClass();
        qje.W(fidVar, androidx.compose.ui.node.d.e, r1b0Var);
        qje.W(fidVar, AndroidView_androidKt$updateViewHolderParams$1.w, f530Var);
        qje.W(fidVar, AndroidView_androidKt$updateViewHolderParams$2.w, fwiVar);
        qje.W(fidVar, AndroidView_androidKt$updateViewHolderParams$3.w, peyVar);
        qje.W(fidVar, AndroidView_androidKt$updateViewHolderParams$4.w, j2m0Var);
        qje.W(fidVar, AndroidView_androidKt$updateViewHolderParams$5.w, layoutDirection);
        qje.W(fidVar, androidx.compose.ui.node.d.g, Integer.valueOf(i));
    }
}
