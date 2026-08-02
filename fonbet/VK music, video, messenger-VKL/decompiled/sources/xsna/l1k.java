package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.Pair;
import xsna.o2k;
import xsna.q630;

/* compiled from: CoverContainer.kt */
/* loaded from: classes5.dex */
public final class l1k {
    public static final void a(final yk8 yk8Var, final lg90 lg90Var, final float f, final gzs gzsVar, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1254653034);
        int i2 = (M.J(yk8Var) ? 4 : 2) | i | (M.y(lg90Var) ? 32 : 16) | (M.n(f) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1254653034, i2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.cover.Cover (CoverContainer.kt:96)");
            }
            if (lg90Var != null) {
                M.K(-1731576142);
                int i3 = i2 >> 3;
                yhw.a(lg90Var, f, q630Var, M, 384 | (i3 & 112) | (i3 & 14) | 8);
                M.j();
            } else if (yk8Var != null) {
                M.K(-1731382020);
                ebu.a(yk8Var, q630Var, M, (i2 & 14) | 48);
                M.j();
            } else {
                M.K(-1731239730);
                boolean z = !((Boolean) gzsVar.invoke()).booleanValue();
                boolean z2 = (i2 & 57344) == 16384;
                Object x = M.x();
                if (z2 || x == a.C0011a.a) {
                    x = new b97(izsVar, 2);
                    M.R(x);
                }
                ofp.a(384, M, (gzs) x, q630Var, z);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(lg90Var, f, gzsVar, izsVar, q630Var, i) { // from class: xsna.k1k
                public final /* synthetic */ lg90 c;
                public final /* synthetic */ float d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ izs f;
                public final /* synthetic */ q630 g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(196673);
                    l1k.a(yk8.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final float f, final izs izsVar, final q630 q630Var, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, final o2k o2kVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1621751059);
        int i2 = i | (M.n(f) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.y(gzsVar2) ? 16384 : 8192) | (M.y(gzsVar3) ? 131072 : 65536) | (M.J(o2kVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1621751059, i2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.cover.CoverContainer (CoverContainer.kt:33)");
            }
            ua8.a(q630Var, null, false, kai.c(1410293117, new yzs() { // from class: xsna.i1k
                /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x01fc  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x01ea  */
                @Override // xsna.yzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a.C0011a.C0012a c0012a;
                    lg90 lg90Var;
                    lg90 s;
                    boolean J;
                    Object x;
                    boolean z;
                    q630.a aVar2;
                    gzs gzsVar4;
                    androidx.compose.runtime.a aVar3;
                    boolean J2;
                    Object x2;
                    boolean J3;
                    Object x3;
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar4.J(va8Var) ? 4 : 2;
                    }
                    if (aVar4.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1410293117, intValue, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.cover.CoverContainer.<anonymous> (CoverContainer.kt:35)");
                        }
                        boolean booleanValue = ((Boolean) gzs.this.invoke()).booleanValue();
                        q630.a aVar5 = q630.a.a;
                        if (booleanValue) {
                            aVar4.K(672188062);
                            atz.a(txj0.d(aVar5, 1.0f), aVar4, 6);
                            aVar4.j();
                        } else {
                            aVar4.K(672291013);
                            long a = wa8.a(va8Var);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-197100453, 0, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.cover.rememberCoverPainter (CoverContainer.kt:123)");
                            }
                            o2k o2kVar2 = o2kVar;
                            boolean z2 = o2kVar2 instanceof o2k.b;
                            a.C0011a.C0012a c0012a2 = a.C0011a.a;
                            gte0 gte0Var = null;
                            if (z2) {
                                aVar4.K(-599170032);
                                o2k.b bVar = (o2k.b) o2kVar2;
                                boolean J4 = aVar4.J(bVar.a);
                                Object x4 = aVar4.x();
                                if (J4 || x4 == c0012a2) {
                                    x4 = k9q0.d(bVar.a);
                                    aVar4.R(x4);
                                }
                                s = (rc7) x4;
                                aVar4.j();
                                c0012a = c0012a2;
                            } else if (o2kVar2 instanceof o2k.c.b) {
                                aVar4.K(-434966965);
                                o2k.c.b bVar2 = (o2k.c.b) o2kVar2;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1891698895, 0, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.cover.extractPhotoUrl (CoverContainer.kt:131)");
                                }
                                String str = bVar2.a.a.Fb((int) (a >> 32), false).d.d;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                c0012a = c0012a2;
                                s = xus.s(str, 0L, aVar4, 0, 2);
                                aVar4.j();
                            } else {
                                c0012a = c0012a2;
                                aVar4.K(-599010910);
                                aVar4.j();
                                lg90Var = null;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1505850301, 0, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.cover.rememberCoverBrush (CoverContainer.kt:70)");
                                }
                                float I0 = ((azl) aVar4.r(uvi.h)).I0(20);
                                J = aVar4.J(o2kVar2) | aVar4.p(a);
                                x = aVar4.x();
                                if (!J || x == c0012a) {
                                    if (o2kVar2 instanceof o2k.c.a) {
                                        z = false;
                                        aVar2 = aVar5;
                                    } else {
                                        z = false;
                                        aVar2 = aVar5;
                                        Pair[] pairArr = {new Pair(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new l5g(f870.c(((o2k.c.a) o2kVar2).a))), new Pair(Float.valueOf(1.0f), new l5g(f870.c(0)))};
                                        float max = Math.max((int) (a & 4294967295L), ((int) (a >> 32)) / 2);
                                        long floatToRawIntBits = (Float.floatToRawIntBits(r9 / 2.0f) << 32) | (Float.floatToRawIntBits(r4 - I0) & 4294967295L);
                                        ArrayList arrayList = new ArrayList(2);
                                        for (int i3 = 0; i3 < 2; i3++) {
                                            arrayList.add(new l5g(((l5g) pairArr[i3].j()).a));
                                        }
                                        ArrayList arrayList2 = new ArrayList(2);
                                        for (int i4 = 0; i4 < 2; i4++) {
                                            arrayList2.add(Float.valueOf(((Number) pairArr[i4].i()).floatValue()));
                                        }
                                        gte0Var = new gte0(arrayList, arrayList2, floatToRawIntBits, max);
                                    }
                                    gte0 gte0Var2 = gte0Var;
                                    aVar4.R(gte0Var2);
                                    x = gte0Var2;
                                } else {
                                    z = false;
                                    aVar2 = aVar5;
                                }
                                yk8 yk8Var = (yk8) x;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                q630.a aVar6 = aVar2;
                                q630 d = txj0.d(aVar6, 1.0f);
                                float f2 = f;
                                gzsVar4 = gzsVar;
                                izs izsVar2 = izsVar;
                                l1k.a(yk8Var, lg90Var, f2, gzsVar4, izsVar2, d, aVar4, 196672);
                                aVar3 = aVar4;
                                if (lg90Var == null || yk8Var != null) {
                                    aVar3.K(672793275);
                                    q630 D = s200.D(txj0.f(aVar6, 1.0f), 16);
                                    boolean z3 = (!((Boolean) gzsVar4.invoke()).booleanValue() || ((Boolean) gzsVar3.invoke()).booleanValue()) ? z : true;
                                    J2 = aVar3.J(izsVar2);
                                    x2 = aVar3.x();
                                    if (!J2 || x2 == c0012a) {
                                        x2 = new tq0(izsVar2, 3);
                                        aVar3.R(x2);
                                    }
                                    gzs gzsVar5 = (gzs) x2;
                                    J3 = aVar3.J(izsVar2);
                                    x3 = aVar3.x();
                                    if (!J3 || x3 == c0012a) {
                                        x3 = new a97(izsVar2, 1);
                                        aVar3.R(x3);
                                    }
                                    zzj.a(z3, gzsVar5, (gzs) x3, D, aVar3, 3072);
                                    aVar3 = aVar3;
                                } else {
                                    aVar3.K(670748453);
                                }
                                aVar3.j();
                                aVar3.j();
                            }
                            lg90Var = s;
                            if (androidx.compose.runtime.b.d()) {
                            }
                            if (androidx.compose.runtime.b.d()) {
                            }
                            float I02 = ((azl) aVar4.r(uvi.h)).I0(20);
                            J = aVar4.J(o2kVar2) | aVar4.p(a);
                            x = aVar4.x();
                            if (J) {
                            }
                            if (o2kVar2 instanceof o2k.c.a) {
                            }
                            gte0 gte0Var22 = gte0Var;
                            aVar4.R(gte0Var22);
                            x = gte0Var22;
                            yk8 yk8Var2 = (yk8) x;
                            if (androidx.compose.runtime.b.d()) {
                            }
                            q630.a aVar62 = aVar2;
                            q630 d2 = txj0.d(aVar62, 1.0f);
                            float f22 = f;
                            gzsVar4 = gzsVar;
                            izs izsVar22 = izsVar;
                            l1k.a(yk8Var2, lg90Var, f22, gzsVar4, izsVar22, d2, aVar4, 196672);
                            aVar3 = aVar4;
                            if (lg90Var == null) {
                            }
                            aVar3.K(672793275);
                            q630 D2 = s200.D(txj0.f(aVar62, 1.0f), 16);
                            if (((Boolean) gzsVar4.invoke()).booleanValue()) {
                            }
                            J2 = aVar3.J(izsVar22);
                            x2 = aVar3.x();
                            if (!J2) {
                            }
                            x2 = new tq0(izsVar22, 3);
                            aVar3.R(x2);
                            gzs gzsVar52 = (gzs) x2;
                            J3 = aVar3.J(izsVar22);
                            x3 = aVar3.x();
                            if (!J3) {
                            }
                            x3 = new a97(izsVar22, 1);
                            aVar3.R(x3);
                            zzj.a(z3, gzsVar52, (gzs) x3, D2, aVar3, 3072);
                            aVar3 = aVar3;
                            aVar3.j();
                            aVar3.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 >> 6) & 14) | 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f, izsVar, q630Var, gzsVar, gzsVar2, gzsVar3, o2kVar, i) { // from class: xsna.j1k
                public final /* synthetic */ float b;
                public final /* synthetic */ izs c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ gzs g;
                public final /* synthetic */ o2k h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    l1k.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
