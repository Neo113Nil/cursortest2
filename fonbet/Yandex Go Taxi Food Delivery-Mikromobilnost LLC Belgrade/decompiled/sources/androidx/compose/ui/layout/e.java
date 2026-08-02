package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.e1y;
import defpackage.f530;
import defpackage.fid;
import defpackage.gns0;
import defpackage.hay;
import defpackage.hz40;
import defpackage.ohd;
import defpackage.p8e;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.s0y;
import defpackage.sls;
import defpackage.uz40;
import defpackage.vng;
import defpackage.wls;
import defpackage.x910;
import defpackage.z0y;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;
import java.util.List;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes10.dex */
public abstract class e {
    public static final hay a = new hay(14);
    public static final Object b = new Object();

    public static final void a(final f530 f530Var, wls wlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        final wls wlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(wlsVar) ? 32 : 16;
        }
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            f530 f530Var2 = f530Var;
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new t();
                btsVar.o0(Q);
            }
            wlsVar2 = wlsVar;
            b((t) Q, f530Var2, wlsVar2, btsVar, (i3 << 3) & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND, 0);
            f530Var = f530Var2;
        } else {
            wlsVar2 = wlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    e.a(f530.this, wlsVar2, (fid) obj, vng.O(i | 1), i2);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(final t tVar, f530 f530Var, final wls wlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-511989831);
        if ((i & 6) == 0) {
            i3 = (btsVar.e(tVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.e(wlsVar) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            int hashCode = Long.hashCode(btsVar.T);
            androidx.compose.runtime.c y0 = cma1.y0(btsVar);
            f530 d = androidx.compose.ui.b.d(btsVar, f530Var);
            r1b0 o = btsVar.o();
            z0y z0yVar = LayoutNode.m0;
            sls a2 = androidx.compose.ui.node.h.a();
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(a2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, tVar.c, tVar);
            qje.W(btsVar, tVar.d, y0);
            qje.W(btsVar, tVar.e, wlsVar);
            ohd.G1.getClass();
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            btsVar.t(true);
            if (btsVar.E()) {
                btsVar.e0(-1259187287);
                btsVar.t(false);
            } else {
                btsVar.e0(-1259245908);
                boolean e = btsVar.e(tVar);
                Object Q = btsVar.Q();
                if (e || Q == did.a) {
                    Q = new sls() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            i a3 = t.this.a();
                            LayoutNode layoutNode = a3.a;
                            if (a3.G != ((uz40) layoutNode.l()).a.c) {
                                hz40 hz40Var = a3.y;
                                Object[] objArr = hz40Var.c;
                                long[] jArr = hz40Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i5 = 0;
                                    while (true) {
                                        long j = jArr[i5];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                                            for (int i7 = 0; i7 < i6; i7++) {
                                                if ((255 & j) < 128) {
                                                    ((e1y) objArr[(i5 << 3) + i7]).d = true;
                                                }
                                                j >>= 8;
                                            }
                                            if (i6 != 8) {
                                                break;
                                            }
                                        }
                                        if (i5 == length) {
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                                if (layoutNode.A != null) {
                                    if (!layoutNode.b0.e) {
                                        LayoutNode.R(layoutNode, false, 7);
                                    }
                                } else if (!layoutNode.o()) {
                                    LayoutNode.T(layoutNode, false, 7);
                                }
                            }
                            return zy11.a;
                        }
                    };
                    btsVar.o0(Q);
                }
                zpn.i((sls) Q, btsVar);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        final f530 f530Var2 = f530Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    e.b(t.this, f530Var2, wlsVar, (fid) obj, vng.O(i | 1), i2);
                    return zy11.a;
                }
            };
        }
    }

    public static final androidx.compose.runtime.internal.a c(final List list) {
        return new androidx.compose.runtime.internal.a(1271844412, new wls() { // from class: androidx.compose.ui.layout.LayoutKt$combineAsVirtualLayouts$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                fid fidVar = (fid) obj;
                int intValue = ((Number) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    List<wls> list2 = list;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        wls wlsVar = list2.get(i);
                        int hashCode = Long.hashCode(btsVar.T);
                        ohd.G1.getClass();
                        sls slsVar = androidx.compose.ui.node.d.c;
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
                        qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                        wlsVar.invoke(btsVar, 0);
                        btsVar.t(true);
                    }
                } else {
                    btsVar.Y();
                }
                return zy11.a;
            }
        }, true);
    }

    public static int d(s0y s0yVar, LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return s0yVar.e(new d(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), new l(x910Var, MeasuringIntrinsics$IntrinsicMinMax.Max, MeasuringIntrinsics$IntrinsicWidthHeight.Height), p8e.b(0, i, 0, 0, 13)).getHeight();
    }

    public static int e(s0y s0yVar, LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return s0yVar.e(new d(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), new l(x910Var, MeasuringIntrinsics$IntrinsicMinMax.Max, MeasuringIntrinsics$IntrinsicWidthHeight.Width), p8e.b(0, 0, 0, i, 7)).getWidth();
    }

    public static int f(s0y s0yVar, LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return s0yVar.e(new d(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), new l(x910Var, MeasuringIntrinsics$IntrinsicMinMax.Min, MeasuringIntrinsics$IntrinsicWidthHeight.Height), p8e.b(0, i, 0, 0, 13)).getHeight();
    }

    public static int g(s0y s0yVar, LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        return s0yVar.e(new d(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), new l(x910Var, MeasuringIntrinsics$IntrinsicMinMax.Min, MeasuringIntrinsics$IntrinsicWidthHeight.Width), p8e.b(0, 0, 0, i, 7)).getWidth();
    }

    public static final androidx.compose.runtime.internal.a h(final f530 f530Var) {
        return new androidx.compose.runtime.internal.a(-511438721, new zls() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOf$1
            {
                super(3);
            }

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                bts btsVar = ((gns0) obj).a;
                fid fidVar = (fid) obj2;
                ((Number) obj3).intValue();
                int hashCode = Long.hashCode(((bts) fidVar).T);
                f530 d = androidx.compose.ui.b.d(fidVar, f530.this);
                btsVar.f0(509942095);
                ohd.G1.getClass();
                qje.W(btsVar, androidx.compose.ui.node.d.d, d);
                qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                btsVar.t(false);
                return zy11.a;
            }
        }, true);
    }
}
