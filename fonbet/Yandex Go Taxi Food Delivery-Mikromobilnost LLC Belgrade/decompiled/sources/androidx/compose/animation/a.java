package androidx.compose.animation;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.ar.core.ImageMetadata;
import defpackage.aa10;
import defpackage.aii0;
import defpackage.bf2;
import defpackage.bms;
import defpackage.bts;
import defpackage.bvf0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cmm0;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.fw0;
import defpackage.gl11;
import defpackage.gtq0;
import defpackage.hz40;
import defpackage.i2t0;
import defpackage.j73;
import defpackage.jl40;
import defpackage.jt1;
import defpackage.kp50;
import defpackage.m2k0;
import defpackage.m3u0;
import defpackage.mg2;
import defpackage.n8e;
import defpackage.ng2;
import defpackage.o430;
import defpackage.ohd;
import defpackage.ox01;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qar;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sb2;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tx01;
import defpackage.ujs0;
import defpackage.v2o;
import defpackage.vng;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.x910;
import defpackage.ycc;
import defpackage.ye2;
import defpackage.ymb1;
import defpackage.ymo;
import defpackage.z910;
import defpackage.ze2;
import defpackage.zls;
import defpackage.zmo;
import defpackage.zpn;
import defpackage.zx01;
import defpackage.zy11;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final zx01 zx01Var, f530 f530Var, tls tlsVar, jt1 jt1Var, tls tlsVar2, final bms bmsVar, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        tls tlsVar3;
        int i5;
        jt1 jt1Var2;
        int i6;
        tls tlsVar4;
        bms bmsVar2;
        bts btsVar;
        final f530 f530Var3;
        aii0 v;
        tls tlsVar5;
        Object obj;
        SnapshotStateList snapshotStateList;
        hz40 hz40Var;
        e eVar;
        Throwable th;
        e eVar2;
        oz40 oz40Var;
        SnapshotStateList snapshotStateList2;
        ox01 ox01Var;
        boolean z;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(511725103);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(zx01Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                tlsVar3 = tlsVar;
                i3 |= btsVar2.e(tlsVar3) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    jt1Var2 = jt1Var;
                    i3 |= btsVar2.k(jt1Var2) ? 2048 : 1024;
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        tlsVar4 = tlsVar2;
                        i3 |= btsVar2.e(tlsVar4) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            bmsVar2 = bmsVar;
                            i3 |= btsVar2.e(bmsVar2) ? 131072 : 65536;
                        } else {
                            bmsVar2 = bmsVar;
                        }
                        if (btsVar2.V(i3 & 1, (74899 & i3) != 74898)) {
                            f530 f530Var4 = c530.a;
                            f530 f530Var5 = i7 != 0 ? f530Var4 : f530Var2;
                            Object obj2 = did.a;
                            if (i4 != 0) {
                                Object Q = btsVar2.Q();
                                if (Q == obj2) {
                                    Q = AnimatedContentKt$AnimatedContent$4$1.w;
                                    btsVar2.o0(Q);
                                }
                                tlsVar5 = (tls) Q;
                            } else {
                                tlsVar5 = tlsVar3;
                            }
                            if (i5 != 0) {
                                jt1Var2 = x4c.b;
                            }
                            if (i6 != 0) {
                                Object Q2 = btsVar2.Q();
                                if (Q2 == obj2) {
                                    Q2 = AnimatedContentKt$AnimatedContent$5$1.w;
                                    btsVar2.o0(Q2);
                                }
                                tlsVar4 = (tls) Q2;
                            }
                            LayoutDirection layoutDirection = (LayoutDirection) btsVar2.m(androidx.compose.ui.platform.j.n);
                            int i8 = i3 & 14;
                            boolean z2 = i8 == 4;
                            Object Q3 = btsVar2.Q();
                            if (z2 || Q3 == obj2) {
                                Q3 = new e(zx01Var, jt1Var2, layoutDirection);
                                btsVar2.o0(Q3);
                            }
                            e eVar3 = (e) Q3;
                            boolean z3 = i8 == 4;
                            Object Q4 = btsVar2.Q();
                            Object obj3 = Q4;
                            if (z3 || Q4 == obj2) {
                                Object[] objArr = {zx01Var.c()};
                                SnapshotStateList snapshotStateList3 = new SnapshotStateList();
                                snapshotStateList3.addAll(j73.d0(objArr));
                                btsVar2.o0(snapshotStateList3);
                                obj3 = snapshotStateList3;
                            }
                            SnapshotStateList snapshotStateList4 = (SnapshotStateList) obj3;
                            boolean z4 = i8 == 4;
                            Object Q5 = btsVar2.Q();
                            if (z4 || Q5 == obj2) {
                                Q5 = cmm0.b();
                                btsVar2.o0(Q5);
                            }
                            hz40 hz40Var2 = (hz40) Q5;
                            Object c = zx01Var.c();
                            oz40 oz40Var2 = zx01Var.d;
                            if (!snapshotStateList4.contains(c)) {
                                snapshotStateList4.clear();
                                snapshotStateList4.add(zx01Var.c());
                            }
                            if (jl40.l(zx01Var.c(), oz40Var2.getValue())) {
                                if (snapshotStateList4.size() != 1 || !jl40.l(snapshotStateList4.get(0), zx01Var.c())) {
                                    snapshotStateList4.clear();
                                    snapshotStateList4.add(zx01Var.c());
                                }
                                if (hz40Var2.e != 1 || hz40Var2.b(zx01Var.c())) {
                                    hz40Var2.h();
                                }
                                eVar3.b = jt1Var2;
                                eVar3.c = layoutDirection;
                            }
                            if (!jl40.l(zx01Var.c(), oz40Var2.getValue()) && !snapshotStateList4.contains(oz40Var2.getValue())) {
                                Iterator it = snapshotStateList4.iterator();
                                int i9 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i9 = -1;
                                        break;
                                    }
                                    Iterator it2 = it;
                                    if (jl40.l(tlsVar4.invoke(it.next()), tlsVar4.invoke(oz40Var2.getValue()))) {
                                        break;
                                    }
                                    i9++;
                                    it = it2;
                                }
                                if (i9 == -1) {
                                    snapshotStateList4.add(oz40Var2.getValue());
                                } else {
                                    snapshotStateList4.set(i9, oz40Var2.getValue());
                                }
                            }
                            if (hz40Var2.b(oz40Var2.getValue()) && hz40Var2.b(zx01Var.c())) {
                                btsVar2.e0(1968995539);
                                btsVar2.t(false);
                                obj = obj2;
                                tlsVar3 = tlsVar5;
                                snapshotStateList = snapshotStateList4;
                                hz40Var = hz40Var2;
                                eVar = eVar3;
                            } else {
                                boolean z5 = false;
                                btsVar2.e0(1966410449);
                                hz40Var2.h();
                                int size = snapshotStateList4.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    int i11 = size;
                                    final Object obj4 = snapshotStateList4.get(i10);
                                    hz40 hz40Var3 = hz40Var2;
                                    int i12 = i10;
                                    final SnapshotStateList snapshotStateList5 = snapshotStateList4;
                                    final bms bmsVar3 = bmsVar2;
                                    Object obj5 = obj2;
                                    final tls tlsVar6 = tlsVar5;
                                    final e eVar4 = eVar3;
                                    hz40Var3.o(obj4, wwg.S(-23915175, true, new wls() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // defpackage.wls
                                        public final Object invoke(Object obj6, Object obj7) {
                                            fid fidVar2 = (fid) obj6;
                                            int intValue = ((Number) obj7).intValue();
                                            bts btsVar3 = (bts) fidVar2;
                                            if (btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                                tls tlsVar7 = tlsVar6;
                                                e eVar5 = eVar4;
                                                Object Q6 = btsVar3.Q();
                                                Object obj8 = did.a;
                                                if (Q6 == obj8) {
                                                    Q6 = (i) tlsVar7.invoke(eVar5);
                                                    btsVar3.o0(Q6);
                                                }
                                                final i iVar = (i) Q6;
                                                boolean a = btsVar3.a(jl40.l(zx01.this.f().b(), obj4));
                                                zx01 zx01Var2 = zx01.this;
                                                Object obj9 = obj4;
                                                tls tlsVar8 = tlsVar6;
                                                e eVar6 = eVar4;
                                                Object Q7 = btsVar3.Q();
                                                if (a || Q7 == obj8) {
                                                    Q7 = jl40.l(zx01Var2.f().b(), obj9) ? ymo.a : ((i) tlsVar8.invoke(eVar6)).b;
                                                    btsVar3.o0(Q7);
                                                }
                                                final ymo ymoVar = (ymo) Q7;
                                                Object obj10 = obj4;
                                                zx01 zx01Var3 = zx01.this;
                                                Object Q8 = btsVar3.Q();
                                                if (Q8 == obj8) {
                                                    Q8 = new bf2(jl40.l(obj10, zx01Var3.d.getValue()));
                                                    btsVar3.o0(Q8);
                                                }
                                                bf2 bf2Var = (bf2) Q8;
                                                v2o v2oVar = iVar.a;
                                                boolean e = btsVar3.e(iVar);
                                                Object Q9 = btsVar3.Q();
                                                if (e || Q9 == obj8) {
                                                    Q9 = new zls() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // defpackage.zls
                                                        public final Object invoke(Object obj11, Object obj12, Object obj13) {
                                                            aa10 w;
                                                            final o l0 = ((x910) obj12).l0(((n8e) obj13).a);
                                                            int i13 = l0.a;
                                                            int i14 = l0.b;
                                                            final i iVar2 = i.this;
                                                            w = ((androidx.compose.ui.layout.k) obj11).w(i13, i14, kotlin.collections.b.f(), new tls() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // defpackage.tls
                                                                public final Object invoke(Object obj14) {
                                                                    ((o.a) obj14).g(o.this, 0, 0, iVar2.c.getFloatValue());
                                                                    return zy11.a;
                                                                }
                                                            });
                                                            return w;
                                                        }
                                                    };
                                                    btsVar3.o0(Q9);
                                                }
                                                f530 F = kp50.F(c530.a, (zls) Q9);
                                                bf2Var.a.setValue(Boolean.valueOf(jl40.l(obj4, zx01.this.d.getValue())));
                                                f530 k = F.k(bf2Var);
                                                zx01 zx01Var4 = zx01.this;
                                                boolean e2 = btsVar3.e(obj4);
                                                final Object obj11 = obj4;
                                                Object Q10 = btsVar3.Q();
                                                if (e2 || Q10 == obj8) {
                                                    Q10 = new tls() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // defpackage.tls
                                                        public final Object invoke(Object obj12) {
                                                            return Boolean.valueOf(jl40.l(obj12, obj11));
                                                        }
                                                    };
                                                    btsVar3.o0(Q10);
                                                }
                                                tls tlsVar9 = (tls) Q10;
                                                boolean k2 = btsVar3.k(ymoVar);
                                                Object Q11 = btsVar3.Q();
                                                if (k2 || Q11 == obj8) {
                                                    Q11 = new wls() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // defpackage.wls
                                                        public final Object invoke(Object obj12, Object obj13) {
                                                            EnterExitState enterExitState = (EnterExitState) obj12;
                                                            EnterExitState enterExitState2 = (EnterExitState) obj13;
                                                            EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                            return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !((zmo) ymo.this).c.e);
                                                        }
                                                    };
                                                    btsVar3.o0(Q11);
                                                }
                                                wls wlsVar = (wls) Q11;
                                                final SnapshotStateList<Object> snapshotStateList6 = snapshotStateList5;
                                                final Object obj12 = obj4;
                                                final e eVar7 = eVar4;
                                                final bms bmsVar4 = bmsVar3;
                                                g.a(zx01Var4, tlsVar9, k, v2oVar, ymoVar, wlsVar, wwg.S(-143346359, true, new zls() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // defpackage.zls
                                                    public final Object invoke(Object obj13, Object obj14, Object obj15) {
                                                        mg2 mg2Var = (mg2) obj13;
                                                        fid fidVar3 = (fid) obj14;
                                                        int intValue2 = ((Number) obj15).intValue();
                                                        if ((intValue2 & 6) == 0) {
                                                            intValue2 |= (intValue2 & 8) == 0 ? ((bts) fidVar3).k(mg2Var) : fidVar3.e(mg2Var) ? 4 : 2;
                                                        }
                                                        bts btsVar4 = (bts) fidVar3;
                                                        if (btsVar4.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                            boolean k3 = btsVar4.k(SnapshotStateList.this) | btsVar4.e(obj12) | btsVar4.e(eVar7);
                                                            final SnapshotStateList<Object> snapshotStateList7 = SnapshotStateList.this;
                                                            final Object obj16 = obj12;
                                                            final e eVar8 = eVar7;
                                                            Object Q12 = btsVar4.Q();
                                                            o430 o430Var = did.a;
                                                            if (k3 || Q12 == o430Var) {
                                                                Q12 = new tls() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // defpackage.tls
                                                                    public final Object invoke(Object obj17) {
                                                                        return new ye2(0, SnapshotStateList.this, obj16, eVar8);
                                                                    }
                                                                };
                                                                btsVar4.o0(Q12);
                                                            }
                                                            zpn.a(mg2Var, (tls) Q12, btsVar4);
                                                            eVar7.e.o(obj12, ((ng2) mg2Var).b);
                                                            Object Q13 = btsVar4.Q();
                                                            if (Q13 == o430Var) {
                                                                Q13 = new ze2(mg2Var);
                                                                btsVar4.o0(Q13);
                                                            }
                                                            bmsVar4.invoke((ze2) Q13, obj12, btsVar4, 0);
                                                        } else {
                                                            btsVar4.Y();
                                                        }
                                                        return zy11.a;
                                                    }
                                                }, btsVar3), btsVar3, 12582912, 64);
                                            } else {
                                                btsVar3.Y();
                                            }
                                            return zy11.a;
                                        }
                                    }, btsVar2));
                                    eVar3 = eVar4;
                                    tlsVar5 = tlsVar6;
                                    hz40Var2 = hz40Var3;
                                    size = i11;
                                    obj2 = obj5;
                                    bmsVar2 = bmsVar;
                                    snapshotStateList4 = snapshotStateList5;
                                    i10 = i12 + 1;
                                    z5 = false;
                                }
                                obj = obj2;
                                tlsVar3 = tlsVar5;
                                snapshotStateList = snapshotStateList4;
                                hz40Var = hz40Var2;
                                eVar = eVar3;
                                btsVar2.t(z5);
                            }
                            boolean k = btsVar2.k(zx01Var.f()) | btsVar2.k(eVar);
                            Object Q6 = btsVar2.Q();
                            Object obj6 = obj;
                            if (k || Q6 == obj6) {
                                Q6 = (i) tlsVar3.invoke(eVar);
                                btsVar2.o0(Q6);
                            }
                            i iVar = (i) Q6;
                            zx01 zx01Var2 = eVar.a;
                            boolean k2 = btsVar2.k(eVar);
                            Object Q7 = btsVar2.Q();
                            if (k2 || Q7 == obj6) {
                                Q7 = androidx.compose.runtime.f.j(Boolean.FALSE);
                                btsVar2.o0(Q7);
                            }
                            oz40 oz40Var3 = (oz40) Q7;
                            oz40 n = androidx.compose.runtime.f.n(iVar.d, btsVar2);
                            if (jl40.l(zx01Var2.c(), zx01Var2.d.getValue())) {
                                oz40Var3.setValue(Boolean.FALSE);
                            } else if (n.getValue() != null) {
                                oz40Var3.setValue(Boolean.TRUE);
                            }
                            if (((Boolean) oz40Var3.getValue()).booleanValue()) {
                                btsVar2.e0(1353077497);
                                e eVar5 = eVar;
                                snapshotStateList2 = snapshotStateList;
                                oz40Var = n;
                                th = null;
                                btsVar = btsVar2;
                                eVar2 = eVar5;
                                ox01Var = bvf0.r(eVar5.a, gtq0.m, null, btsVar, 0, 2);
                                boolean k3 = btsVar.k(ox01Var);
                                Object Q8 = btsVar.Q();
                                if (k3 || Q8 == obj6) {
                                    ujs0 ujs0Var = (ujs0) oz40Var.getValue();
                                    if (ujs0Var == null || ujs0Var.a) {
                                        f530Var4 = ymb1.m(f530Var4);
                                    }
                                    btsVar.o0(f530Var4);
                                    Q8 = f530Var4;
                                }
                                f530Var4 = (f530) Q8;
                                btsVar.t(false);
                            } else {
                                th = null;
                                btsVar = btsVar2;
                                eVar2 = eVar;
                                oz40Var = n;
                                snapshotStateList2 = snapshotStateList;
                                btsVar.e0(1353343539);
                                btsVar.t(false);
                                eVar2.f = null;
                                ox01Var = null;
                            }
                            f530 k4 = f530Var5.k(f530Var4.k(new c(ox01Var, oz40Var, eVar2)));
                            Object Q9 = btsVar.Q();
                            if (Q9 == obj6) {
                                Q9 = new b(eVar2);
                                btsVar.o0(Q9);
                            }
                            b bVar = (b) Q9;
                            int hashCode = Long.hashCode(btsVar.T);
                            r1b0 o = btsVar.o();
                            f530 d = androidx.compose.ui.b.d(btsVar, k4);
                            ohd.G1.getClass();
                            sls slsVar = androidx.compose.ui.node.d.b;
                            if (btsVar.a == null) {
                                cma1.b0();
                                throw th;
                            }
                            btsVar.i0();
                            if (btsVar.S) {
                                btsVar.n(slsVar);
                            } else {
                                btsVar.r0();
                            }
                            qje.W(btsVar, androidx.compose.ui.node.d.f, bVar);
                            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
                            qje.y(btsVar, Integer.valueOf(hashCode), androidx.compose.ui.node.d.g);
                            qje.M(btsVar, androidx.compose.ui.node.d.h);
                            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
                            btsVar.e0(-860173498);
                            int size2 = snapshotStateList2.size();
                            int i13 = 0;
                            while (i13 < size2) {
                                SnapshotStateList snapshotStateList6 = snapshotStateList2;
                                Object obj7 = snapshotStateList6.get(i13);
                                btsVar.c0(-2026002954, tlsVar4.invoke(obj7));
                                wls wlsVar = (wls) hz40Var.d(obj7);
                                if (wlsVar == null) {
                                    btsVar.e0(1618454323);
                                    z = false;
                                } else {
                                    z = false;
                                    btsVar.e0(-2026001778);
                                    wlsVar.invoke(btsVar, 0);
                                }
                                btsVar.t(z);
                                btsVar.t(z);
                                i13++;
                                snapshotStateList2 = snapshotStateList6;
                            }
                            btsVar.t(false);
                            btsVar.t(true);
                            f530Var3 = f530Var5;
                        } else {
                            btsVar = btsVar2;
                            btsVar.Y();
                            f530Var3 = f530Var2;
                        }
                        bts btsVar3 = btsVar;
                        final tls tlsVar7 = tlsVar3;
                        final jt1 jt1Var3 = jt1Var2;
                        final tls tlsVar8 = tlsVar4;
                        v = btsVar3.v();
                        if (v != null) {
                            v.d = new wls() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj8, Object obj9) {
                                    ((Number) obj9).intValue();
                                    a.a(zx01.this, f530Var3, tlsVar7, jt1Var3, tlsVar8, bmsVar, (fid) obj8, vng.O(i | 1), i2);
                                    return zy11.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    tlsVar4 = tlsVar2;
                    if ((196608 & i) == 0) {
                    }
                    if (btsVar2.V(i3 & 1, (74899 & i3) != 74898)) {
                    }
                    bts btsVar32 = btsVar;
                    final tls tlsVar72 = tlsVar3;
                    final jt1 jt1Var32 = jt1Var2;
                    final tls tlsVar82 = tlsVar4;
                    v = btsVar32.v();
                    if (v != null) {
                    }
                }
                jt1Var2 = jt1Var;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                tlsVar4 = tlsVar2;
                if ((196608 & i) == 0) {
                }
                if (btsVar2.V(i3 & 1, (74899 & i3) != 74898)) {
                }
                bts btsVar322 = btsVar;
                final tls tlsVar722 = tlsVar3;
                final jt1 jt1Var322 = jt1Var2;
                final tls tlsVar822 = tlsVar4;
                v = btsVar322.v();
                if (v != null) {
                }
            }
            tlsVar3 = tlsVar;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            jt1Var2 = jt1Var;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            tlsVar4 = tlsVar2;
            if ((196608 & i) == 0) {
            }
            if (btsVar2.V(i3 & 1, (74899 & i3) != 74898)) {
            }
            bts btsVar3222 = btsVar;
            final tls tlsVar7222 = tlsVar3;
            final jt1 jt1Var3222 = jt1Var2;
            final tls tlsVar8222 = tlsVar4;
            v = btsVar3222.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        tlsVar3 = tlsVar;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        jt1Var2 = jt1Var;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        tlsVar4 = tlsVar2;
        if ((196608 & i) == 0) {
        }
        if (btsVar2.V(i3 & 1, (74899 & i3) != 74898)) {
        }
        bts btsVar32222 = btsVar;
        final tls tlsVar72222 = tlsVar3;
        final jt1 jt1Var32222 = jt1Var2;
        final tls tlsVar82222 = tlsVar4;
        v = btsVar32222.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final Object obj, f530 f530Var, tls tlsVar, jt1 jt1Var, String str, tls tlsVar2, final bms bmsVar, fid fidVar, final int i, final int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        tls tlsVar3;
        int i5;
        jt1 jt1Var2;
        int i6;
        int i7;
        final tls tlsVar4;
        final f530 f530Var3;
        final tls tlsVar5;
        final jt1 jt1Var3;
        final String str2;
        aii0 v;
        int i8;
        tls tlsVar6;
        tls tlsVar7;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1501828832);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? btsVar.k(obj) : btsVar.e(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                tlsVar3 = tlsVar;
                i3 |= btsVar.e(tlsVar3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    jt1Var2 = jt1Var;
                    i3 |= btsVar.k(jt1Var2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        i3 |= btsVar.k(str) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ImageMetadata.EDGE_MODE;
                        } else if ((196608 & i) == 0) {
                            i3 |= btsVar.e(tlsVar2) ? 131072 : 65536;
                            if ((1572864 & i) == 0) {
                                i3 |= btsVar.e(bmsVar) ? 1048576 : 524288;
                            }
                            if (btsVar.V(i3 & 1, (599187 & i3) == 599186)) {
                                btsVar.Y();
                                tlsVar4 = tlsVar2;
                                f530Var3 = f530Var2;
                                tlsVar5 = tlsVar3;
                                jt1Var3 = jt1Var2;
                                str2 = str;
                            } else {
                                f530 f530Var4 = i9 != 0 ? c530.a : f530Var2;
                                Object obj2 = did.a;
                                if (i4 != 0) {
                                    Object Q = btsVar.Q();
                                    if (Q == obj2) {
                                        Q = AnimatedContentKt$AnimatedContent$1$1.w;
                                        btsVar.o0(Q);
                                    }
                                    tlsVar6 = (tls) Q;
                                    i8 = i7;
                                } else {
                                    i8 = i7;
                                    tlsVar6 = tlsVar3;
                                }
                                jt1 jt1Var4 = i5 != 0 ? x4c.b : jt1Var2;
                                String str3 = i6 != 0 ? "AnimatedContent" : str;
                                if (i8 != 0) {
                                    Object Q2 = btsVar.Q();
                                    if (Q2 == obj2) {
                                        Q2 = AnimatedContentKt$AnimatedContent$2$1.w;
                                        btsVar.o0(Q2);
                                    }
                                    tlsVar7 = (tls) Q2;
                                } else {
                                    tlsVar7 = tlsVar2;
                                }
                                zx01 a0 = bvf0.a0(obj, str3, btsVar, (i3 & 14) | ((i3 >> 9) & 112));
                                int i10 = i3 & 8176;
                                int i11 = i3 >> 3;
                                a(a0, f530Var4, tlsVar6, jt1Var4, tlsVar7, bmsVar, btsVar, i10 | (57344 & i11) | (i11 & ImageMetadata.JPEG_GPS_COORDINATES), 0);
                                str2 = str3;
                                f530Var3 = f530Var4;
                                tlsVar5 = tlsVar6;
                                jt1Var3 = jt1Var4;
                                tlsVar4 = tlsVar7;
                            }
                            v = btsVar.v();
                            if (v == null) {
                                v.d = new wls() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj3, Object obj4) {
                                        ((Number) obj4).intValue();
                                        a.b(obj, f530Var3, tlsVar5, jt1Var3, str2, tlsVar4, bmsVar, (fid) obj3, vng.O(i | 1), i2);
                                        return zy11.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        if ((1572864 & i) == 0) {
                        }
                        if (btsVar.V(i3 & 1, (599187 & i3) == 599186)) {
                        }
                        v = btsVar.v();
                        if (v == null) {
                        }
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    if (btsVar.V(i3 & 1, (599187 & i3) == 599186)) {
                    }
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                jt1Var2 = jt1Var;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if (btsVar.V(i3 & 1, (599187 & i3) == 599186)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            tlsVar3 = tlsVar;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            jt1Var2 = jt1Var;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (btsVar.V(i3 & 1, (599187 & i3) == 599186)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        tlsVar3 = tlsVar;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        jt1Var2 = jt1Var;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (btsVar.V(i3 & 1, (599187 & i3) == 599186)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final zx01 zx01Var, f530 f530Var, qar qarVar, tls tlsVar, final zls zlsVar, fid fidVar, final int i, final int i2) {
        f530 f530Var2;
        int i3;
        qar qarVar2;
        int i4;
        tls tlsVar2;
        final f530 f530Var3;
        final qar qarVar3;
        final tls tlsVar3;
        aii0 v;
        tls tlsVar4;
        boolean z;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1877370462);
        int i5 = (i & 6) == 0 ? (btsVar.k(zx01Var) ? 4 : 2) | i : i;
        int i6 = i2 & 1;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i5 |= btsVar.k(f530Var2) ? 32 : 16;
            i3 = i2 & 2;
            if (i3 == 0) {
                i5 |= 384;
            } else if ((i & 384) == 0) {
                qarVar2 = qarVar;
                i5 |= btsVar.e(qarVar2) ? 256 : 128;
                i4 = i2 & 4;
                if (i4 != 0) {
                    i5 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    tlsVar2 = tlsVar;
                    i5 |= btsVar.e(tlsVar2) ? 2048 : 1024;
                    if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        i5 |= btsVar.e(zlsVar) ? 16384 : 8192;
                    }
                    if (btsVar.V(i5 & 1, (i5 & 9363) == 9362)) {
                        btsVar.Y();
                        f530Var3 = f530Var2;
                        qarVar3 = qarVar2;
                        tlsVar3 = tlsVar2;
                    } else {
                        f530 f530Var4 = i6 != 0 ? c530.a : f530Var2;
                        final qar K = i3 != 0 ? sb2.K(0, 0, null, 7) : qarVar2;
                        o430 o430Var = did.a;
                        if (i4 != 0) {
                            Object Q = btsVar.Q();
                            if (Q == o430Var) {
                                Q = CrossfadeKt$Crossfade$3$1.w;
                                btsVar.o0(Q);
                            }
                            tlsVar4 = (tls) Q;
                        } else {
                            tlsVar4 = tlsVar2;
                        }
                        Object Q2 = btsVar.Q();
                        Object obj = Q2;
                        if (Q2 == o430Var) {
                            SnapshotStateList snapshotStateList = new SnapshotStateList();
                            snapshotStateList.add(zx01Var.c());
                            btsVar.o0(snapshotStateList);
                            obj = snapshotStateList;
                        }
                        SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj;
                        Object Q3 = btsVar.Q();
                        if (Q3 == o430Var) {
                            Q3 = cmm0.b();
                            btsVar.o0(Q3);
                        }
                        hz40 hz40Var = (hz40) Q3;
                        Object c = zx01Var.c();
                        oz40 oz40Var = zx01Var.d;
                        if (jl40.l(c, oz40Var.getValue())) {
                            btsVar.e0(321145192);
                            if (snapshotStateList2.size() == 1 && jl40.l(snapshotStateList2.get(0), oz40Var.getValue())) {
                                btsVar.e0(321469824);
                                btsVar.t(false);
                            } else {
                                btsVar.e0(321279546);
                                boolean z3 = (i5 & 14) == 4;
                                Object Q4 = btsVar.Q();
                                if (z3 || Q4 == o430Var) {
                                    Q4 = new tls() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                        {
                                            super(1);
                                        }

                                        @Override // defpackage.tls
                                        public final Object invoke(Object obj2) {
                                            return Boolean.valueOf(!jl40.l(obj2, zx01.this.d.getValue()));
                                        }
                                    };
                                    btsVar.o0(Q4);
                                }
                                ycc.w(snapshotStateList2, (tls) Q4, true);
                                hz40Var.h();
                                btsVar.t(false);
                            }
                            btsVar.t(false);
                        } else {
                            btsVar.e0(321475776);
                            btsVar.t(false);
                        }
                        if (hz40Var.a(oz40Var.getValue())) {
                            z = false;
                            btsVar.e0(322279296);
                            btsVar.t(false);
                        } else {
                            btsVar.e0(321536443);
                            Iterator<T> it = snapshotStateList2.iterator();
                            int i7 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i7 = -1;
                                    break;
                                } else if (jl40.l(tlsVar4.invoke(it.next()), tlsVar4.invoke(oz40Var.getValue()))) {
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                            if (i7 == -1) {
                                snapshotStateList2.add(oz40Var.getValue());
                            } else {
                                snapshotStateList2.set(i7, oz40Var.getValue());
                            }
                            hz40Var.h();
                            int size = snapshotStateList2.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                final Object obj2 = snapshotStateList2.get(i8);
                                hz40Var.o(obj2, wwg.S(-934471669, true, new wls() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj3, Object obj4) {
                                        Object c2;
                                        fid fidVar2 = (fid) obj3;
                                        int intValue = ((Number) obj4).intValue();
                                        bts btsVar2 = (bts) fidVar2;
                                        if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                            zx01 zx01Var2 = zx01.this;
                                            final qar qarVar4 = K;
                                            zls zlsVar2 = new zls() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
                                                {
                                                    super(3);
                                                }

                                                @Override // defpackage.zls
                                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                    ((Number) obj7).intValue();
                                                    bts btsVar3 = (bts) ((fid) obj6);
                                                    btsVar3.e0(955869654);
                                                    qar qarVar5 = qar.this;
                                                    btsVar3.t(false);
                                                    return qarVar5;
                                                }
                                            };
                                            Object obj5 = obj2;
                                            gl11 gl11Var = gtq0.f;
                                            boolean g = zx01Var2.g();
                                            o430 o430Var2 = did.a;
                                            if (g) {
                                                btsVar2.e0(1666827533);
                                                btsVar2.t(false);
                                                c2 = zx01Var2.c();
                                            } else {
                                                btsVar2.e0(1666573488);
                                                boolean k = btsVar2.k(zx01Var2);
                                                c2 = btsVar2.Q();
                                                if (k || c2 == o430Var2) {
                                                    i2t0 D = tje.D();
                                                    tls e = D != null ? D.e() : null;
                                                    i2t0 O = tje.O(D);
                                                    try {
                                                        Object c3 = zx01Var2.c();
                                                        tje.W(D, O, e);
                                                        btsVar2.o0(c3);
                                                        c2 = c3;
                                                    } catch (Throwable th) {
                                                        tje.W(D, O, e);
                                                        throw th;
                                                    }
                                                }
                                                btsVar2.t(false);
                                            }
                                            btsVar2.e0(1378811975);
                                            float f = jl40.l(c2, obj5) ? 1.0f : 0.0f;
                                            btsVar2.t(false);
                                            Float valueOf = Float.valueOf(f);
                                            boolean k2 = btsVar2.k(zx01Var2);
                                            Object Q5 = btsVar2.Q();
                                            if (k2 || Q5 == o430Var2) {
                                                Q5 = androidx.compose.runtime.f.d(new fw0(zx01Var2, 2));
                                                btsVar2.o0(Q5);
                                            }
                                            Object value = ((m3u0) Q5).getValue();
                                            btsVar2.e0(1378811975);
                                            float f2 = jl40.l(value, obj5) ? 1.0f : 0.0f;
                                            btsVar2.t(false);
                                            Float valueOf2 = Float.valueOf(f2);
                                            boolean k3 = btsVar2.k(zx01Var2);
                                            Object Q6 = btsVar2.Q();
                                            if (k3 || Q6 == o430Var2) {
                                                Q6 = androidx.compose.runtime.f.d(new fw0(zx01Var2, 3));
                                                btsVar2.o0(Q6);
                                            }
                                            final tx01 s = bvf0.s(zx01Var2, valueOf, valueOf2, (qar) zlsVar2.invoke(((m3u0) Q6).getValue(), btsVar2, 0), gl11Var, btsVar2, 0);
                                            boolean k4 = btsVar2.k(s);
                                            Object Q7 = btsVar2.Q();
                                            if (k4 || Q7 == o430Var2) {
                                                Q7 = new tls() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // defpackage.tls
                                                    public final Object invoke(Object obj6) {
                                                        ((m2k0) obj6).b(((Number) s.getValue()).floatValue());
                                                        return zy11.a;
                                                    }
                                                };
                                                btsVar2.o0(Q7);
                                            }
                                            f530 a = androidx.compose.ui.graphics.d.a(c530.a, (tls) Q7);
                                            zls zlsVar3 = zlsVar;
                                            Object obj6 = obj2;
                                            z910 d = pi6.d(x4c.b, false);
                                            int hashCode = Long.hashCode(btsVar2.T);
                                            r1b0 o = btsVar2.o();
                                            f530 d2 = androidx.compose.ui.b.d(btsVar2, a);
                                            ohd.G1.getClass();
                                            sls slsVar = androidx.compose.ui.node.d.b;
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
                                            qje.W(btsVar2, androidx.compose.ui.node.d.f, d);
                                            qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
                                            qje.y(btsVar2, Integer.valueOf(hashCode), androidx.compose.ui.node.d.g);
                                            qje.M(btsVar2, androidx.compose.ui.node.d.h);
                                            qje.W(btsVar2, androidx.compose.ui.node.d.d, d2);
                                            zlsVar3.invoke(obj6, btsVar2, 0);
                                            btsVar2.t(true);
                                        } else {
                                            btsVar2.Y();
                                        }
                                        return zy11.a;
                                    }
                                }, btsVar));
                            }
                            z = false;
                            btsVar.t(false);
                        }
                        z910 d = pi6.d(x4c.b, z);
                        int hashCode = Long.hashCode(btsVar.T);
                        r1b0 o = btsVar.o();
                        f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var4);
                        ohd.G1.getClass();
                        sls slsVar = androidx.compose.ui.node.d.b;
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
                        qje.W(btsVar, androidx.compose.ui.node.d.f, d);
                        qje.W(btsVar, androidx.compose.ui.node.d.e, o);
                        qje.y(btsVar, Integer.valueOf(hashCode), androidx.compose.ui.node.d.g);
                        qje.M(btsVar, androidx.compose.ui.node.d.h);
                        qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
                        btsVar.e0(-1312707512);
                        int size2 = snapshotStateList2.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            Object obj3 = snapshotStateList2.get(i9);
                            btsVar.c0(1171574969, tlsVar4.invoke(obj3));
                            wls wlsVar = (wls) hz40Var.d(obj3);
                            if (wlsVar == null) {
                                btsVar.e0(1959122128);
                                z2 = false;
                            } else {
                                z2 = false;
                                btsVar.e0(1171576145);
                                wlsVar.invoke(btsVar, 0);
                            }
                            btsVar.t(z2);
                            btsVar.t(z2);
                        }
                        btsVar.t(false);
                        btsVar.t(true);
                        f530Var3 = f530Var4;
                        qarVar3 = K;
                        tlsVar3 = tlsVar4;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new wls() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj4, Object obj5) {
                                ((Number) obj5).intValue();
                                a.c(zx01.this, f530Var3, qarVar3, tlsVar3, zlsVar, (fid) obj4, vng.O(i | 1), i2);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                tlsVar2 = tlsVar;
                if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                }
                if (btsVar.V(i5 & 1, (i5 & 9363) == 9362)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            qarVar2 = qarVar;
            i4 = i2 & 4;
            if (i4 != 0) {
            }
            tlsVar2 = tlsVar;
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            if (btsVar.V(i5 & 1, (i5 & 9363) == 9362)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i3 = i2 & 2;
        if (i3 == 0) {
        }
        qarVar2 = qarVar;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        tlsVar2 = tlsVar;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if (btsVar.V(i5 & 1, (i5 & 9363) == 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final Object obj, f530 f530Var, qar qarVar, String str, final zls zlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        final f530 f530Var2;
        int i4;
        qar qarVar2;
        int i5;
        String str2;
        final qar qarVar3;
        final String str3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-513216493);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? btsVar.k(obj) : btsVar.e(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                qarVar2 = qarVar;
                i3 |= btsVar.e(qarVar2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    str2 = str;
                    i3 |= btsVar.k(str2) ? 2048 : 1024;
                    if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        i3 |= btsVar.e(zlsVar) ? 16384 : 8192;
                    }
                    if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
                        btsVar.Y();
                        qarVar3 = qarVar2;
                        str3 = str2;
                    } else {
                        f530 f530Var3 = i6 != 0 ? c530.a : f530Var2;
                        qar K = i4 != 0 ? sb2.K(0, 0, null, 7) : qarVar2;
                        String str4 = i5 != 0 ? "Crossfade" : str2;
                        c(bvf0.a0(obj, str4, btsVar, (i3 & 14) | ((i3 >> 6) & 112)), f530Var3, K, null, zlsVar, btsVar, i3 & 58352, 4);
                        str3 = str4;
                        f530Var2 = f530Var3;
                        qarVar3 = K;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new wls() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Number) obj3).intValue();
                                a.d(obj, f530Var2, qarVar3, str3, zlsVar, (fid) obj2, vng.O(i | 1), i2);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                str2 = str;
                if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                }
                if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            qarVar2 = qarVar;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str2 = str;
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        qarVar2 = qarVar;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str2 = str;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }
}
