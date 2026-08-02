package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Thumb;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.q630;

/* compiled from: MusicTrackCell.kt */
/* loaded from: classes4.dex */
public final class qa50 {
    public static final v5b0 a;

    static {
        float f = 2;
        float f2 = 18;
        float f3 = 10;
        a = new v5b0(f, f2, 4, f, f, l5g.d, e43.l(new pco(f3), new pco(16), new pco(f2), new pco(f3)), new l5g(l5g.c(14, l5g.b, 0.6f)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0166  */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.vk.core.compose.component.semantics.SemanticsConfiguration$Mode, java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6, types: [com.vk.core.compose.component.cell.content.Cell$Middle$d$a] */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r2v79, types: [xsna.pkg0] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27, types: [com.vk.core.compose.component.cell.content.Cell$Middle$c] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final ae50 ae50Var, final boolean z, final boolean z2, final boolean z3, final q630 q630Var, wax waxVar, boolean z4, zzf0 zzf0Var, final gzs gzsVar, gzs gzsVar2, gzs gzsVar3, gzs gzsVar4, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        boolean z5;
        boolean z6;
        wax waxVar2;
        boolean z7;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        androidx.compose.runtime.a aVar2;
        final zzf0 zzf0Var2;
        final gzs gzsVar5;
        final gzs gzsVar6;
        final boolean z8;
        final wax waxVar3;
        final gzs gzsVar7;
        androidx.compose.runtime.f s;
        gzs gzsVar8;
        gzs gzsVar9;
        zzf0 zzf0Var3;
        boolean z9;
        long j;
        wax waxVar4;
        int i11;
        com.vk.core.compose.component.semantics.a aVar3;
        boolean z10;
        long j2;
        gzs gzsVar10;
        vtu vtuVar;
        boolean z11;
        Thumb thumb;
        zzf0 zzf0Var4;
        boolean z12;
        com.vk.core.compose.component.semantics.a aVar4;
        int i12;
        int i13;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a aVar5;
        float f;
        float f2;
        gzs gzsVar11;
        androidx.compose.runtime.a aVar6;
        int i14;
        SemanticsConfiguration.Mode mode;
        Cell$Left.b bVar;
        int i15;
        ?? r19;
        androidx.compose.runtime.a aVar7;
        ?? r7;
        com.vk.core.compose.component.cell.content.o oVar;
        com.vk.core.compose.component.cell.content.b0 b0Var;
        gzs gzsVar12;
        q630.a aVar8;
        zzf0 zzf0Var5;
        q630 q630Var2;
        com.vk.core.compose.component.cell.content.o oVar2;
        gzs gzsVar13 = gzsVar;
        boolean z13 = ae50Var.p;
        boolean z14 = ae50Var.j;
        boolean z15 = ae50Var.o;
        androidx.compose.runtime.a M = aVar.M(1081851597);
        if ((i & 6) == 0) {
            i3 = (M.J(ae50Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z5 = z2;
            i3 |= M.l(z5) ? 256 : 128;
        } else {
            z5 = z2;
        }
        if ((i & 3072) == 0) {
            z6 = z3;
            i3 |= M.l(z6) ? 2048 : 1024;
        } else {
            z6 = z3;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        int i16 = i2 & 32;
        if (i16 != 0) {
            i3 |= 196608;
            waxVar2 = waxVar;
        } else {
            waxVar2 = waxVar;
            if ((i & 196608) == 0) {
                i3 |= M.J(waxVar2) ? 131072 : 65536;
            }
        }
        int i17 = i2 & 64;
        if (i17 != 0) {
            i3 |= 1572864;
            z7 = z4;
        } else {
            z7 = z4;
            if ((i & 1572864) == 0) {
                i3 |= M.l(z7) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
        }
        int i18 = i2 & 128;
        if (i18 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 = i18;
            i3 |= M.J(zzf0Var) ? 8388608 : 4194304;
            if ((i & 100663296) == 0) {
                i3 |= M.y(gzsVar13) ? 67108864 : 33554432;
            }
            i5 = i2 & 512;
            if (i5 == 0) {
                i3 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i6 = i5;
                i3 |= M.y(gzsVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                int i19 = i2 & 1024;
                int i20 = i19 != 0 ? 6 : M.y(gzsVar3) ? 4 : 2;
                i7 = i2 & 2048;
                if (i7 != 0) {
                    i9 = i20 | 48;
                    i8 = i7;
                } else {
                    i8 = i7;
                    i9 = i20 | (M.y(gzsVar4) ? 32 : 16);
                }
                i10 = i9;
                int i21 = 1;
                if (M.t(i3 & 1, (i3 & 306783379) == 306783378 || (i10 & 19) != 18)) {
                    wax waxVar5 = i16 != 0 ? null : waxVar2;
                    boolean z16 = i17 != 0 ? false : z7;
                    zzf0 zzf0Var6 = i4 != 0 ? null : zzf0Var;
                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                    if (i6 != 0) {
                        Object x = M.x();
                        if (x == c0012a2) {
                            x = new x5(29);
                            M.R(x);
                        }
                        gzsVar8 = (gzs) x;
                    } else {
                        gzsVar8 = gzsVar2;
                    }
                    if (i19 != 0) {
                        Object x2 = M.x();
                        if (x2 == c0012a2) {
                            x2 = new se0(26);
                            M.R(x2);
                        }
                        gzsVar9 = (gzs) x2;
                    } else {
                        gzsVar9 = gzsVar3;
                    }
                    gzs gzsVar14 = i8 != 0 ? null : gzsVar4;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1081851597, i3, i10, "com.vk.newsfeed.posting.music_picker.presentation.view.MusicTrackCell (MusicTrackCell.kt:88)");
                    }
                    vtu vtuVar2 = (vtu) M.r(uvi.l);
                    gzs gzsVar15 = gzsVar9;
                    if (z16) {
                        M.K(277317184);
                        zzf0Var3 = zzf0Var6;
                        z9 = z15;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getBackground().x;
                        M.j();
                    } else {
                        zzf0Var3 = zzf0Var6;
                        z9 = z15;
                        M.K(277319192);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.d().a;
                        M.j();
                    }
                    Thumb thumb2 = ae50Var.h;
                    long j3 = j;
                    float f3 = 4;
                    int i22 = i3;
                    String str = ae50Var.a;
                    if (waxVar5 == null) {
                        M.K(7305454);
                        Object x3 = M.x();
                        if (x3 == c0012a2) {
                            x3 = ir.h(M);
                        }
                        waxVar4 = (sg50) x3;
                        M.j();
                    } else {
                        M.K(277329859);
                        M.j();
                        waxVar4 = waxVar5;
                    }
                    float f4 = !z9 ? 1.0f : 0.64f;
                    int i23 = i22 & 14;
                    boolean z17 = i23 == 4;
                    Object x4 = M.x();
                    if (z17 || x4 == c0012a2) {
                        i11 = i22;
                        x4 = new kb40(ae50Var, 5);
                        M.R(x4);
                    } else {
                        i11 = i22;
                    }
                    com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3);
                    int i24 = ((i11 << 9) & 3670016) | 805309440 | ((i11 << 15) & 29360128) | (i11 & 234881024);
                    if (androidx.compose.runtime.b.d()) {
                        aVar3 = a2;
                        z10 = z13;
                        androidx.compose.runtime.b.f(-13804779, i24, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.MusicTrackImage.Companion.invoke (MusicTrackCell.kt:413)");
                    } else {
                        aVar3 = a2;
                        z10 = z13;
                    }
                    Object x5 = M.x();
                    if (x5 == c0012a2) {
                        j2 = j3;
                        gzsVar10 = gzsVar8;
                        vtuVar = vtuVar2;
                        z11 = z14;
                        thumb = thumb2;
                        zzf0Var4 = zzf0Var3;
                        z12 = z9;
                        f = f4;
                        i12 = 3;
                        i13 = i11;
                        c0012a = c0012a2;
                        f2 = f3;
                        boolean z18 = z6;
                        boolean z19 = z5;
                        aVar4 = aVar3;
                        wb50 wb50Var = new wb50(thumb, f2, f, str, z19, z18, waxVar4, aVar4, gzsVar13);
                        gzsVar13 = gzsVar13;
                        M.R(wb50Var);
                        aVar5 = M;
                        x5 = wb50Var;
                    } else {
                        j2 = j3;
                        gzsVar10 = gzsVar8;
                        vtuVar = vtuVar2;
                        z11 = z14;
                        thumb = thumb2;
                        zzf0Var4 = zzf0Var3;
                        z12 = z9;
                        aVar4 = aVar3;
                        i12 = 3;
                        i13 = i11;
                        c0012a = c0012a2;
                        aVar5 = M;
                        f = f4;
                        f2 = f3;
                    }
                    wb50 wb50Var2 = (wb50) x5;
                    ((zak0) wb50Var2.c).setValue(new qow(thumb));
                    ((zak0) wb50Var2.d).setValue(new pco(f2));
                    ((vak0) wb50Var2.f).g(f);
                    ((zak0) wb50Var2.b).setValue(str);
                    ((zak0) wb50Var2.g).setValue(aVar4);
                    ((zak0) wb50Var2.h).setValue(Boolean.valueOf(z3));
                    ((zak0) wb50Var2.i).setValue(Boolean.valueOf(z2));
                    ((zak0) wb50Var2.e).setValue(gzsVar13);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (ae50Var.i) {
                        aVar5.K(277345690);
                        Object x6 = aVar5.x();
                        if (x6 == c0012a) {
                            x6 = new ehu(14);
                            aVar5.R(x6);
                        }
                        Cell$Left.b a3 = com.vk.core.compose.component.cell.content.c.a(gzsVar10, com.vk.core.compose.component.semantics.b.a(null, (izs) x6, i12), aVar5, ((i13 >> 27) & 14) | 3072, 2);
                        aVar5.j();
                        gzsVar11 = gzsVar15;
                        bVar = a3;
                        aVar6 = aVar5;
                        i15 = 0;
                        i14 = -1;
                        mode = null;
                    } else {
                        if (z11 && z10) {
                            aVar5.K(8105874);
                            boolean z20 = !z12;
                            Object x7 = aVar5.x();
                            if (x7 == c0012a) {
                                x7 = new byo(13);
                                aVar5.R(x7);
                            }
                            androidx.compose.runtime.a aVar9 = aVar5;
                            i14 = -1;
                            mode = null;
                            gzsVar11 = gzsVar15;
                            bVar = com.vk.core.compose.component.cell.content.b.a(z, gzsVar11, z20, com.vk.core.compose.component.semantics.b.a(null, (izs) x7, i12), aVar9, ((i13 >> 3) & 14) | 24576 | ((i10 << 3) & 112), 0);
                            aVar6 = aVar9;
                            aVar6.j();
                        } else {
                            gzsVar11 = gzsVar15;
                            aVar6 = aVar5;
                            i14 = -1;
                            mode = null;
                            aVar6.K(8442192);
                            aVar6.j();
                            bVar = null;
                        }
                        i15 = 0;
                    }
                    com.vk.core.compose.component.cell.content.i0 a4 = Cell$Left.a.a(wb50Var2, bVar, aVar6, i15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(615571727, i23, i14, "com.vk.newsfeed.posting.music_picker.presentation.view.createMiddle (MusicTrackCell.kt:171)");
                    }
                    us2 us2Var = ae50Var.b;
                    if (ae50Var.d) {
                        aVar6.K(-1141049341);
                        qzu0.a.getClass();
                        gbx0 gbx0Var = new gbx0(qzu0.M(aVar6));
                        aVar6.j();
                        r19 = gbx0Var;
                    } else {
                        aVar6.K(-1012684562);
                        aVar6.j();
                        r19 = mode;
                    }
                    float f5 = !z12 ? 1.0f : 0.64f;
                    SemanticsConfiguration.Mode mode2 = SemanticsConfiguration.Mode.ClearAndSet;
                    if (((i23 ^ 6) <= 4 || !aVar6.J(ae50Var)) && (i13 & 6) != 4) {
                        i21 = i15;
                    }
                    Object x8 = aVar6.x();
                    if (i21 != 0 || x8 == c0012a) {
                        x8 = new jjx(ae50Var, 16);
                        aVar6.R(x8);
                    }
                    com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.d.b.b(us2Var, null, null, r19, 1, 2, com.vk.core.compose.component.semantics.b.a(mode2, (izs) x8, 2), Float.valueOf(f5), null, aVar6, 12804096, 6, 518);
                    String str2 = ae50Var.e;
                    ?? r16 = !drm0.N(str2) ? str2 : mode;
                    if (r16 == 0) {
                        aVar6.K(-1012170551);
                        aVar6.j();
                        aVar7 = aVar6;
                        r7 = mode;
                    } else {
                        aVar6.K(-1012170550);
                        Object x9 = aVar6.x();
                        if (x9 == c0012a) {
                            x9 = new amp(16);
                            aVar6.R(x9);
                        }
                        aVar7 = aVar6;
                        com.vk.core.compose.component.cell.content.h1 b2 = Cell$Middle.c.b.b(r16, 1, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x9, i12), aVar7, 12583344, 88);
                        aVar7.j();
                        r7 = b2;
                    }
                    int i25 = i14;
                    ?? r13 = mode;
                    androidx.compose.runtime.a aVar10 = aVar7;
                    com.vk.core.compose.component.cell.content.k0 a5 = Cell$Middle.a.a(b, r7, null, null, aVar10, 196608, 28);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (ae50Var.k) {
                        aVar10.K(277371446);
                        com.vk.core.compose.component.cell.content.z0 a6 = o.f.a.a(r13, aVar10, 7);
                        aVar10.j();
                        oVar2 = a6;
                    } else if (ae50Var.l) {
                        aVar10.K(277373871);
                        if (z10 && !z11) {
                            aVar10.K(277375862);
                            us2 us2Var2 = ae50Var.m;
                            String str3 = ae50Var.n;
                            float f6 = !z12 ? 1.0f : 0.64f;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-413366400, 3072, i25, "com.vk.newsfeed.posting.music_picker.presentation.view.RightText.Companion.invoke (MusicTrackCell.kt:237)");
                            }
                            Object x10 = aVar10.x();
                            if (x10 == c0012a) {
                                x10 = new pkg0(us2Var2, str3, f6);
                                aVar10.R(x10);
                            }
                            ?? r2 = (pkg0) x10;
                            ((zak0) r2.a).setValue(us2Var2);
                            ((zak0) r2.b).setValue(str3);
                            ((vak0) r2.c).g(f6);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            aVar10.j();
                            b0Var = r2;
                        } else if (z10 || !z) {
                            aVar10.K(9316144);
                            aVar10.j();
                            b0Var = r13;
                        } else {
                            aVar10.K(277386041);
                            Object x11 = aVar10.x();
                            if (x11 == c0012a) {
                                x11 = new u4u(16);
                                aVar10.R(x11);
                            }
                            com.vk.core.compose.component.cell.content.b0 a7 = o.e.a.C0736a.a(true, gzsVar11, false, com.vk.core.compose.component.semantics.b.a(r13, (izs) x11, i12), aVar10, ((i10 << 3) & 112) | 24582, 4);
                            aVar10.j();
                            b0Var = a7;
                        }
                        aVar10.j();
                        oVar2 = b0Var;
                    } else {
                        aVar10.K(9355824);
                        aVar10.j();
                        oVar = r13;
                        aVar10.K(277407749);
                        aVar10.K(277399357);
                        q630 f7 = txj0.f(q630Var, 1.0f);
                        gzsVar12 = r13;
                        if (!z12) {
                            gzsVar12 = gzsVar14;
                        }
                        q630.a aVar11 = q630.a.a;
                        if (gzsVar12 == null) {
                            boolean J = aVar10.J(gzsVar12);
                            Object x12 = aVar10.x();
                            if (J || x12 == c0012a) {
                                x12 = new al0(1, gzsVar12);
                                aVar10.R(x12);
                            }
                            q630 c = ojc.c(aVar11, false, null, null, (gzs) x12, 15);
                            aVar8 = aVar11;
                            q630 g = f7.g(c);
                            if (g != null) {
                                f7 = g;
                            }
                        } else {
                            aVar8 = aVar11;
                        }
                        aVar10.j();
                        q630 m = hr80.m(txj0.j(58, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, f7), j2, androidx.compose.ui.graphics.e.a);
                        if (zzf0Var4 == null) {
                            vtu vtuVar3 = vtuVar;
                            boolean y = aVar10.y(vtuVar3);
                            Object x13 = aVar10.x();
                            if (y || x13 == c0012a) {
                                x13 = new jw30(vtuVar3, 4);
                                aVar10.R(x13);
                            }
                            zzf0Var5 = zzf0Var4;
                            q630 g2 = m.g(e5m.a(aVar8, zzf0Var5, (gzs) x13));
                            if (g2 != null) {
                                q630Var2 = g2;
                                aVar10.j();
                                wiu0.b(q630Var2, false, a4, a5, oVar, null, null, aVar10, 0, 98);
                                aVar2 = aVar10;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                gzsVar5 = gzsVar11;
                                zzf0Var2 = zzf0Var5;
                                gzsVar7 = gzsVar10;
                                waxVar3 = waxVar5;
                                z8 = z16;
                                gzsVar6 = gzsVar14;
                            }
                        } else {
                            zzf0Var5 = zzf0Var4;
                        }
                        q630Var2 = m;
                        aVar10.j();
                        wiu0.b(q630Var2, false, a4, a5, oVar, null, null, aVar10, 0, 98);
                        aVar2 = aVar10;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        gzsVar5 = gzsVar11;
                        zzf0Var2 = zzf0Var5;
                        gzsVar7 = gzsVar10;
                        waxVar3 = waxVar5;
                        z8 = z16;
                        gzsVar6 = gzsVar14;
                    }
                    oVar = oVar2;
                    aVar10.K(277407749);
                    aVar10.K(277399357);
                    q630 f72 = txj0.f(q630Var, 1.0f);
                    gzsVar12 = r13;
                    if (!z12) {
                    }
                    q630.a aVar112 = q630.a.a;
                    if (gzsVar12 == null) {
                    }
                    aVar10.j();
                    q630 m2 = hr80.m(txj0.j(58, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, f72), j2, androidx.compose.ui.graphics.e.a);
                    if (zzf0Var4 == null) {
                    }
                    q630Var2 = m2;
                    aVar10.j();
                    wiu0.b(q630Var2, false, a4, a5, oVar, null, null, aVar10, 0, 98);
                    aVar2 = aVar10;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    gzsVar5 = gzsVar11;
                    zzf0Var2 = zzf0Var5;
                    gzsVar7 = gzsVar10;
                    waxVar3 = waxVar5;
                    z8 = z16;
                    gzsVar6 = gzsVar14;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    zzf0Var2 = zzf0Var;
                    gzsVar5 = gzsVar3;
                    gzsVar6 = gzsVar4;
                    z8 = z7;
                    waxVar3 = waxVar2;
                    gzsVar7 = gzsVar2;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.pa50
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(i | 1);
                            qa50.a(ae50.this, z, z2, z3, q630Var, waxVar3, z8, zzf0Var2, gzsVar, gzsVar7, gzsVar5, gzsVar6, (androidx.compose.runtime.a) obj, I, i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i6 = i5;
            int i192 = i2 & 1024;
            if (i192 != 0) {
            }
            i7 = i2 & 2048;
            if (i7 != 0) {
            }
            i10 = i9;
            int i212 = 1;
            if (M.t(i3 & 1, (i3 & 306783379) == 306783378 || (i10 & 19) != 18)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        i4 = i18;
        if ((i & 100663296) == 0) {
        }
        i5 = i2 & 512;
        if (i5 == 0) {
        }
        i6 = i5;
        int i1922 = i2 & 1024;
        if (i1922 != 0) {
        }
        i7 = i2 & 2048;
        if (i7 != 0) {
        }
        i10 = i9;
        int i2122 = 1;
        if (M.t(i3 & 1, (i3 & 306783379) == 306783378 || (i10 & 19) != 18)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    public static final String b(Thumb thumb, float f, androidx.compose.runtime.a aVar, int i) {
        String str;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1912627875, i, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.getForSizeOrEmpty (MusicTrackCell.kt:444)");
        }
        azl azlVar = (azl) aVar.r(uvi.h);
        if (thumb != null) {
            int I0 = (int) azlVar.I0(f);
            Serializer.c<Thumb> cVar = Thumb.CREATOR;
            str = thumb.Ab(I0, false);
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return str;
    }
}
