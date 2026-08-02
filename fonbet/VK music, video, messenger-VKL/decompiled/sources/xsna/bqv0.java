package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.datetime.EditingMode;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import xsna.cri;
import xsna.dt1;
import xsna.nwr;
import xsna.q630;
import xsna.t2x;
import xsna.ty6;

/* compiled from: VkTemporalPicker.kt */
/* loaded from: classes17.dex */
public final class bqv0 {

    /* compiled from: VkTemporalPicker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EditingMode.values().length];
            try {
                iArr[EditingMode.Keyboard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EditingMode.Picker.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final com.vk.core.compose.component.datetime.n nVar, final izs izsVar, final rgy rgyVar, final sg50 sg50Var, final q630 q630Var, final SemanticsConfiguration semanticsConfiguration, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        uey ueyVar = uey.d;
        androidx.compose.runtime.a M = aVar.M(-1503731556);
        int i2 = i | (M.J(nVar) ? 4 : 2) | (M.J(rgyVar) ? 256 : 128) | (M.J(ueyVar) ? 2048 : 1024) | (M.J(sg50Var) ? 16384 : 8192) | (M.J(q630Var) ? 131072 : 65536) | (M.J(semanticsConfiguration) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.l(z) ? 8388608 : 4194304);
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1503731556, i2, -1, "com.vk.core.compose.component.datetime.VkDateRangePickerField (VkTemporalPicker.kt:178)");
            }
            com.vk.core.compose.component.datetime.m mVar = nVar.a;
            tho0 tho0Var = new tho0(mVar.b(), jgz.c(mVar.a().e.b, mVar.a().e.c + 1), 4);
            q630 b = com.vk.core.compose.component.semantics.b.b(q630Var, semanticsConfiguration);
            nmo0 e = nmo0.e(wlb0.l(M).T.a, wlb0.h(M).getText().p, 0L, null, null, 0L, null, 0, 0L, 16777214);
            com.vk.core.compose.component.datetime.b a2 = mVar.a();
            kf7 kf7Var = a2.d;
            ArrayList arrayList = new ArrayList();
            if (kf7Var == null || !a2.a) {
                a2.b.e.h(arrayList);
            } else {
                kf7Var.h(arrayList);
            }
            k5v k5vVar = new k5v(arrayList, wlb0.h(M).getText().m);
            boolean z2 = !z;
            rek0 rek0Var = new rek0(l5g.k);
            boolean J = ((i2 & 14) == 4) | M.J(tho0Var);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new il7(28, nVar, tho0Var);
                M.R(x);
            }
            int i3 = i2 << 12;
            aVar2 = M;
            wt6.a(tho0Var, (izs) x, b, z, z2, e, rgyVar, ueyVar, true, 0, 0, k5vVar, izsVar, sg50Var, rek0Var, null, aVar2, ((i2 >> 12) & 7168) | 100663296 | (3670016 & i3) | (i3 & 29360128), 24960 | ((i2 >> 3) & 7168), 34304);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(nVar, izsVar, rgyVar, sg50Var, q630Var, semanticsConfiguration, z, i) { // from class: xsna.wpv0
                public final /* synthetic */ com.vk.core.compose.component.datetime.n b;
                public final /* synthetic */ izs c;
                public final /* synthetic */ rgy d;
                public final /* synthetic */ sg50 e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ SemanticsConfiguration g;
                public final /* synthetic */ boolean h;

                {
                    uey ueyVar2 = uey.d;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    uey ueyVar2 = uey.d;
                    ((Integer) obj2).getClass();
                    int I = ne7.I(49);
                    bqv0.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final spg0 spg0Var, boolean z, final com.vk.core.compose.component.datetime.n nVar, final gzs gzsVar, final SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z2;
        gzs gzsVar2;
        int i3;
        hkg0 a2;
        androidx.compose.runtime.a M = aVar.M(1855465064);
        if ((i & 6) == 0) {
            i2 = (M.J(spg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= M.l(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(nVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 2048 : 1024;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(semanticsConfiguration) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1855465064, i2, -1, "com.vk.core.compose.component.datetime.VkDateRangePickerRight (VkTemporalPicker.kt:240)");
            }
            if (nVar.a.c()) {
                M.K(-69122516);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-108852644, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelCircle16> (VkSdkIcons.kt:250)");
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_cancel_circle_16, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N = d370.N(R.string.vk_datetime_icon_reset_talkback, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().l;
                boolean z3 = (i2 & 896) == 256;
                Object x = M.x();
                if (z3 || x == a.C0011a.a) {
                    x = new m5o0(nVar, 15);
                    M.R(x);
                }
                i3 = 0;
                a2 = t2x.b.a.a(a3, N, (gzs) x, j, semanticsConfiguration, M, 196616 | (i2 & 57344), 0);
                M.j();
            } else {
                i3 = 0;
                M.K(-68753802);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(49016044, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CalendarOutline24> (VkSdkIcons.kt:180)");
                }
                lg90 a4 = pg90.a(R.drawable.vk_icon_calendar_outline_24, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N2 = d370.N(R.string.vk_datetime_icon_set_talkback, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a2 = t2x.b.a.a(a4, N2, gzsVar2, ylu0Var2.getIcon().l, semanticsConfiguration, M, ((i2 >> 3) & 896) | 196616 | (i2 & 57344), 0);
                M.j();
            }
            ((zak0) a2.a).setValue(Boolean.valueOf(z2));
            dt1.a.getClass();
            a2.a(s200.H(spg0Var.a(q630.a.a, dt1.a.l), kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final boolean z4 = z2;
            s.d = new wzs() { // from class: xsna.aqv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bqv0.b(spg0.this, z4, nVar, gzsVar, semanticsConfiguration, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final com.vk.core.compose.component.datetime.n nVar, final gzs gzsVar, final q630 q630Var, final SemanticsConfiguration semanticsConfiguration, final SemanticsConfiguration semanticsConfiguration2, final rgy rgyVar, final sg50 sg50Var, final boolean z, final EditingMode editingMode, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final SemanticsConfiguration semanticsConfiguration3;
        androidx.compose.runtime.a aVar2;
        int i3;
        int i4;
        long j;
        uey ueyVar = uey.d;
        androidx.compose.runtime.a M = aVar.M(-1449253756);
        if ((i & 6) == 0) {
            i2 = (M.J(nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            semanticsConfiguration3 = semanticsConfiguration;
            i2 |= M.J(semanticsConfiguration3) ? 2048 : 1024;
        } else {
            semanticsConfiguration3 = semanticsConfiguration;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(semanticsConfiguration2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= M.J(rgyVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= M.J(ueyVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= M.J(sg50Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= M.l(z) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= M.o(editingMode == null ? -1 : editingMode.ordinal()) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i5 = i2;
        if (M.t(i5 & 1, (306783379 & i5) != 306783378)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1449253756, i5, -1, "com.vk.core.compose.component.datetime.VkTemporalPicker (VkTemporalPicker.kt:70)");
            }
            nVar.a(sg50Var, M, ((i5 >> 21) & 14) | ((i5 << 3) & 112));
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new rwr();
                M.R(x);
            }
            final rwr rwrVar = (rwr) x;
            s1v.k();
            on20 on20Var = on20.a;
            M.K(-1302469375);
            if (androidx.compose.runtime.b.d()) {
                i3 = i5;
                i4 = 0;
                androidx.compose.runtime.b.f(-1302469375, 0, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeInputSelectDefaults.focusColor (MilkshakeInputSelectDefaults.kt:89)");
            } else {
                i3 = i5;
                i4 = 0;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, i4, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var.getBackground().f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(null);
                M.R(x2);
            }
            final wh50 wh50Var = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                j = j2;
                x3 = bbk0.b(new dsp0(5, wh50Var, nVar));
                M.R(x3);
            } else {
                j = j2;
            }
            final mtk0 mtk0Var = (mtk0) x3;
            InputSelect$State inputSelect$State = (InputSelect$State) nVar.f.getValue();
            boolean z2 = nVar.a.a().a;
            s1v.k();
            q630 C = s200.C(q630Var, on20.f);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new h7t0(2);
                M.R(x4);
            }
            q630 g = C.g(new kwr(new nwr.a((izs) x4)));
            boolean z3 = ((i3 & 1879048192) == 536870912) | ((i3 & 112) == 32);
            Object x5 = M.x();
            if (z3 || x5 == c0012a) {
                x5 = new p2b(editingMode, rwrVar, gzsVar, 4);
                M.R(x5);
            }
            final long j3 = j;
            aVar2 = M;
            rqv0.a(inputSelect$State, z2, z, o19.a(ojc.b(g, null, null, z, null, (gzs) x5, 24), z ? 1.0f : 0.64f), null, null, null, kai.c(1246728137, new yzs() { // from class: xsna.ypv0
                {
                    uey ueyVar2 = uey.d;
                }

                /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x010c  */
                @Override // xsna.yzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z4;
                    Object x6;
                    uey ueyVar2 = uey.d;
                    spg0 spg0Var = (spg0) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(spg0Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1246728137, intValue, -1, "com.vk.core.compose.component.datetime.VkTemporalPicker.<anonymous> (VkTemporalPicker.kt:108)");
                        }
                        dt1.a.getClass();
                        ty6.b bVar = dt1.a.l;
                        q630.a aVar4 = q630.a.a;
                        q630 b = spg0Var.b(1.0f, spg0Var.a(aVar4, bVar), true);
                        long j4 = j3;
                        boolean p = aVar3.p(j4);
                        Object x7 = aVar3.x();
                        a.C0011a.C0012a c0012a2 = a.C0011a.a;
                        if (p || x7 == c0012a2) {
                            x7 = new wcm(j4, mtk0Var, 1);
                            aVar3.R(x7);
                        }
                        q630 f = bu00.f(b, (izs) x7);
                        cp10 d = ja8.d(dt1.a.b, false);
                        int hashCode = Long.hashCode(n34.n(aVar3));
                        sy90 D = aVar3.D();
                        q630 c = qri.c(aVar3, f);
                        cri.h7.getClass();
                        LayoutNode.a aVar5 = cri.a.b;
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar5);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, d, cri.a.f);
                        k9q0.w(aVar3, D, cri.a.e);
                        k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar3, cri.a.h);
                        k9q0.w(aVar3, c, cri.a.d);
                        boolean z5 = z;
                        if (z5) {
                            if (editingMode == EditingMode.Keyboard) {
                                z4 = true;
                                q630 d2 = jvi.d(aVar4, rwrVar);
                                x6 = aVar3.x();
                                if (x6 == c0012a2) {
                                    x6 = new tc8(4, wh50Var);
                                    aVar3.R(x6);
                                }
                                izs izsVar = (izs) x6;
                                com.vk.core.compose.component.datetime.n nVar2 = nVar;
                                bqv0.a(nVar2, izsVar, rgyVar, sg50Var, d2, semanticsConfiguration3, z4, aVar3, 48);
                                aVar3.G();
                                bqv0.b(spg0Var, z5, nVar2, gzsVar, semanticsConfiguration2, aVar3, intValue & 14);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            }
                        }
                        z4 = false;
                        q630 d22 = jvi.d(aVar4, rwrVar);
                        x6 = aVar3.x();
                        if (x6 == c0012a2) {
                        }
                        izs izsVar2 = (izs) x6;
                        com.vk.core.compose.component.datetime.n nVar22 = nVar;
                        bqv0.a(nVar22, izsVar2, rgyVar, sg50Var, d22, semanticsConfiguration3, z4, aVar3, 48);
                        aVar3.G();
                        bqv0.b(spg0Var, z5, nVar22, gzsVar, semanticsConfiguration2, aVar3, intValue & 14);
                        if (androidx.compose.runtime.b.d()) {
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i3 >> 18) & 896) | 12582912, 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.zpv0
                {
                    uey ueyVar2 = uey.d;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    uey ueyVar2 = uey.d;
                    ((Integer) obj2).getClass();
                    bqv0.c(nVar, gzsVar, q630Var, semanticsConfiguration, semanticsConfiguration2, rgyVar, sg50Var, z, editingMode, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final int i, final int i2, androidx.compose.runtime.a aVar, gzs gzsVar, final boolean z) {
        int i3;
        final gzs gzsVar2;
        androidx.compose.runtime.a M = aVar.M(-607184801);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (M.l(z) ? 4 : 2) | i;
        }
        int i5 = i3 | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i5 & 1, (i5 & 19) != 18)) {
            boolean z2 = i4 != 0 ? true : z;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-607184801, i5, -1, "com.vk.core.compose.component.datetime.VkTemporalPickerDialogConfirmButton (VkTemporalPicker.kt:145)");
            }
            int i6 = ((i5 >> 3) & 14) | 805306368 | ((i5 << 6) & 896);
            gzsVar2 = gzsVar;
            lq8.b(gzsVar2, null, z2, null, null, null, kq01.c, M, i6, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z = z2;
        } else {
            gzsVar2 = gzsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, i2, gzsVar2, z) { // from class: xsna.xpv0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ gzs c;
                public final /* synthetic */ int d;

                {
                    this.b = z;
                    this.c = gzsVar2;
                    this.d = i2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bqv0.d(ne7.I(1), this.d, (androidx.compose.runtime.a) obj, this.c, this.b);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        gzs<s3q0> gzsVar2;
        androidx.compose.runtime.a M = aVar.M(1015380145);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1015380145, i2, -1, "com.vk.core.compose.component.datetime.VkTemporalPickerDialogDismissButton (VkTemporalPicker.kt:155)");
            }
            gzsVar2 = gzsVar;
            lq8.b(gzsVar2, null, false, null, null, null, kq01.d, M, (i2 & 14) | 805306368, 510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar2 = gzsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xa2(gzsVar2, i, 14);
        }
    }
}
