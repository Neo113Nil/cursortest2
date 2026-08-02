package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ImageCropper.kt */
/* loaded from: classes5.dex */
public final class iiw {
    public static final void a(final long j, final agw agwVar, final q630 q630Var, final q630 q630Var2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-1188089564);
        int i2 = i | (M.p(j) ? 4 : 2) | (M.y(agwVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.J(q630Var2) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1188089564, i2, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.cropper.CropImage (ImageCropper.kt:164)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 d3 = txj0.d(q630Var2, 1.0f);
            boolean y = M.y(agwVar) | ((i2 & 14) == 4);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new izs() { // from class: xsna.biw
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        agw agwVar2 = agwVar;
                        oio oioVar = (oio) obj;
                        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() >> 32)) / 2.0f;
                        long j2 = j;
                        float intBitsToFloat2 = intBitsToFloat - (Float.intBitsToFloat((int) (j2 >> 32)) / 2.0f);
                        float intBitsToFloat3 = (Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) / 2.0f) - (Float.intBitsToFloat((int) (j2 & 4294967295L)) / 2.0f);
                        oioVar.a0().a.l(intBitsToFloat2, intBitsToFloat3);
                        try {
                            oio.R(oioVar, agwVar2, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 62);
                            oioVar.a0().a.l(-intBitsToFloat2, -intBitsToFloat3);
                            return s3q0.a;
                        } catch (Throwable th) {
                            oioVar.a0().a.l(-intBitsToFloat2, -intBitsToFloat3);
                            throw th;
                        }
                    }
                };
                M.R(x);
            }
            xa4.i(0, M, (izs) x, d3);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, agwVar, q630Var, q630Var2, i) { // from class: xsna.ciw
                public final /* synthetic */ long b;
                public final /* synthetic */ agw c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    iiw.a(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final agw agwVar, final ajk ajkVar, final rek0 rek0Var, final wzs wzsVar, final izs izsVar, final q630 q630Var, final q630 q630Var2, final q630 q630Var3, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, final boolean z, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        izs izsVar2;
        q630 q630Var4;
        q630 q630Var5;
        int i4;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1485575098);
        if ((i & 6) == 0) {
            i3 = (M.y(agwVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(ajkVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(rek0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.y(wzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            izsVar2 = izsVar;
            i3 |= M.y(izsVar2) ? 16384 : 8192;
        } else {
            izsVar2 = izsVar;
        }
        if ((196608 & i) == 0) {
            i3 |= M.J(q630Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            q630Var4 = q630Var2;
            i3 |= M.J(q630Var4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            q630Var4 = q630Var2;
        }
        if ((12582912 & i) == 0) {
            q630Var5 = q630Var3;
            i3 |= M.J(q630Var5) ? 8388608 : 4194304;
        } else {
            q630Var5 = q630Var3;
        }
        if ((i & 100663296) == 0) {
            i3 |= M.y(gzsVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= M.y(gzsVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (M.y(gzsVar3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.l(z) ? 32 : 16;
        }
        int i5 = i4;
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1485575098, i3, i5, "com.vk.profile.user.impl.ui.edit.cover.crop.cropper.ImageCropper (ImageCropper.kt:75)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            final izs izsVar3 = izsVar2;
            int i6 = i3;
            aVar2 = M;
            ua8.a(q630Var4, null, false, kai.c(-1536723990, new yzs() { // from class: xsna.eiw
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar4.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1536723990, intValue, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.cropper.ImageCropper.<anonymous>.<anonymous> (ImageCropper.kt:80)");
                        }
                        final gzs gzsVar4 = gzs.this;
                        Object invoke = gzsVar4.invoke();
                        boolean J = aVar4.J(gzsVar4);
                        final ajk ajkVar2 = ajkVar;
                        boolean J2 = J | aVar4.J(ajkVar2);
                        izs izsVar4 = izsVar3;
                        boolean J3 = J2 | aVar4.J(izsVar4);
                        Object x = aVar4.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (J3 || x == c0012a) {
                            x = new giw(gzsVar4, ajkVar2, izsVar4, null);
                            aVar4.R(x);
                        }
                        bap.g(invoke, (wzs) x, aVar4, 0);
                        q630.a aVar5 = q630.a.a;
                        q630 d2 = txj0.d(aVar5, 1.0f);
                        boolean J4 = aVar4.J(ajkVar2);
                        boolean z2 = z;
                        boolean l = J4 | aVar4.l(z2);
                        Object x2 = aVar4.x();
                        if (l || x2 == c0012a) {
                            x2 = new zhw(ajkVar2, z2, 0);
                            aVar4.R(x2);
                        }
                        q630 a = rdu.a(d2, (izs) x2);
                        boolean J5 = aVar4.J(gzsVar4);
                        final gzs gzsVar5 = gzsVar3;
                        boolean J6 = J5 | aVar4.J(gzsVar5) | aVar4.J(ajkVar2);
                        Object x3 = aVar4.x();
                        if (J6 || x3 == c0012a) {
                            x3 = new hiw(gzsVar4, gzsVar5, ajkVar2);
                            aVar4.R(x3);
                        }
                        agw agwVar2 = agwVar;
                        q630 b = skn0.b(aVar5, agwVar2, (PointerInputEventHandler) x3);
                        boolean J7 = aVar4.J(gzsVar4);
                        final gzs gzsVar6 = gzsVar2;
                        boolean J8 = J7 | aVar4.J(gzsVar6) | aVar4.J(ajkVar2) | aVar4.J(gzsVar5);
                        Object x4 = aVar4.x();
                        if (J8 || x4 == c0012a) {
                            x4 = new yzs() { // from class: xsna.aiw
                                @Override // xsna.yzs
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    float floatValue = ((Float) obj4).floatValue();
                                    ov70 ov70Var = (ov70) obj5;
                                    ((Float) obj6).floatValue();
                                    if (!((Boolean) gzs.this.invoke()).booleanValue()) {
                                        boolean booleanValue = ((Boolean) gzsVar6.invoke()).booleanValue();
                                        ajk ajkVar3 = ajkVar2;
                                        if (booleanValue) {
                                            float floatValue2 = ((Number) swe0.k(Float.valueOf(ajkVar3.d() * floatValue), new awf(ajkVar3.c, ajkVar3.d))).floatValue();
                                            ((zak0) ajkVar3.e).setValue(Float.valueOf(floatValue2));
                                        }
                                        if (((Boolean) gzsVar5.invoke()).booleanValue()) {
                                            ajkVar3.a(ov70Var.a);
                                        }
                                    }
                                    return s3q0.a;
                                }
                            };
                            aVar4.R(x4);
                        }
                        yzs yzsVar = (yzs) x4;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1681419281, 0, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:189)");
                        }
                        boolean J9 = aVar4.J(yzsVar);
                        Object x5 = aVar4.x();
                        if (J9 || x5 == c0012a) {
                            x5 = new v85(yzsVar, 2);
                            aVar4.R(x5);
                        }
                        zzs zzsVar = (zzs) x5;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-963411216, 0, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:210)");
                        }
                        wh50 c2 = androidx.compose.runtime.k.c(zzsVar, aVar4, 0);
                        Object x6 = aVar4.x();
                        if (x6 == c0012a) {
                            aql aqlVar = new aql(new blp0(c2, 0));
                            aVar4.R(aqlVar);
                            x6 = aqlVar;
                        }
                        alp0 alp0Var = (alp0) x6;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        iiw.a(ajkVar2.a, agwVar2, b.g(new tkp0(alp0Var, new fyi0(6))), a, aVar4, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i6 >> 18) & 14) | 3072, 6);
            jiw.a(rek0Var, ajkVar.b, wzsVar, q630Var5, aVar2, ((i6 >> 6) & 14) | ((i6 >> 3) & 896) | ((i6 >> 12) & 7168));
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.fiw
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    int I2 = ne7.I(i2);
                    iiw.b(agw.this, ajkVar, rek0Var, wzsVar, izsVar, q630Var, q630Var2, q630Var3, gzsVar, gzsVar2, gzsVar3, z, (androidx.compose.runtime.a) obj, I, I2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final agw agwVar, final ajk ajkVar, final long j, final izs izsVar, final wzs wzsVar, final q630 q630Var, final q630 q630Var2, final q630 q630Var3, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(957260477);
        int i2 = i | (M.y(agwVar) ? 4 : 2) | (M.J(ajkVar) ? 32 : 16) | (M.p(j) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024) | (M.y(wzsVar) ? 16384 : 8192) | (M.J(q630Var3) ? 8388608 : 4194304) | (M.y(gzsVar) ? 67108864 : 33554432) | (M.y(gzsVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i3 = (M.y(gzsVar3) ? 4 : 2) | 48;
        if (M.t(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(957260477, i2, i3, "com.vk.profile.user.impl.ui.edit.cover.crop.cropper.ImageCropper (ImageCropper.kt:43)");
            }
            int i4 = i2 >> 3;
            aVar2 = M;
            b(agwVar, ajkVar, new rek0(j), wzsVar, izsVar, q630Var, q630Var3, q630Var2, gzsVar, gzsVar2, gzsVar3, z, aVar2, (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (i4 & 7168) | ((i2 << 3) & 57344) | 196608 | (i4 & 3670016) | 12582912 | (234881024 & i2) | (i2 & 1879048192), i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(ajkVar, j, izsVar, wzsVar, q630Var, q630Var2, q630Var3, gzsVar, gzsVar2, gzsVar3, z, i) { // from class: xsna.diw
                public final /* synthetic */ ajk c;
                public final /* synthetic */ long d;
                public final /* synthetic */ izs e;
                public final /* synthetic */ wzs f;
                public final /* synthetic */ q630 g;
                public final /* synthetic */ q630 h;
                public final /* synthetic */ q630 i;
                public final /* synthetic */ gzs j;
                public final /* synthetic */ gzs k;
                public final /* synthetic */ gzs l;
                public final /* synthetic */ boolean m;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1769473);
                    iiw.c(agw.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
