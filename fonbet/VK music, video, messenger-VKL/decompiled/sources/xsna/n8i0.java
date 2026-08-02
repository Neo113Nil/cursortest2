package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.ahn;
import xsna.bap;
import xsna.c6j;
import xsna.dp10;
import xsna.e4p0;
import xsna.ep10;
import xsna.frv0;
import xsna.gub0;
import xsna.h8i0;
import xsna.izs;
import xsna.j8i0;
import xsna.jgp;
import xsna.k8i0;
import xsna.l8i0;
import xsna.lg90;
import xsna.m8i0;
import xsna.n8i0;
import xsna.op10;
import xsna.pg90;
import xsna.pzu0;
import xsna.q630;
import xsna.s3q0;
import xsna.s5j;
import xsna.tgi0;
import xsna.tlo0;
import xsna.tra0;
import xsna.txj0;
import xsna.wh50;
import xsna.wkj;
import xsna.wlb0;
import xsna.yqv0;
import xsna.zo10;

/* compiled from: SelectGroupVerificationTypeItem.kt */
/* loaded from: classes18.dex */
public final class n8i0 {
    public static final void a(final h8i0 h8i0Var, q630 q630Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1753805948);
        int i2 = i | (M.J(h8i0Var) ? 4 : 2) | 48 | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1753805948, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.ui.SelectGroupVerificationTypeItem (SelectGroupVerificationTypeItem.kt:39)");
            }
            tlo0.h hVar = h8i0Var.b;
            iyk0 iyk0Var = AndroidCompositionLocals_androidKt.b;
            CharSequence a = tlo0.b.a(hVar, (Context) M.r(iyk0Var));
            String obj = a != null ? a.toString() : null;
            if (obj == null) {
                obj = "";
            }
            CharSequence a2 = tlo0.b.a(h8i0Var.c, (Context) M.r(iyk0Var));
            String obj2 = a2 != null ? a2.toString() : null;
            final String str = obj2 != null ? obj2 : "";
            q630Var2 = q630.a.a;
            q630 E = ahn.E(s200.E(txj0.f(q630Var2, 1.0f), 0, 10), "select_group_verification_type_item");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 c = ojc.c(hr80.m(E, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), false, null, null, gzsVar, 15);
            M.K(-1003410150);
            M.K(212064437);
            M.j();
            azl azlVar = (azl) M.r(uvi.h);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new op10(azlVar);
                M.R(x);
            }
            final op10 op10Var = (op10) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new c6j();
                M.R(x2);
            }
            final c6j c6jVar = (c6j) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            final wh50 wh50Var = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new h6j(c6jVar);
                M.R(x4);
            }
            final h6j h6jVar = (h6j) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = androidx.compose.runtime.k.a(s3q0.a, w65.e);
                M.R(x5);
            }
            final wh50 wh50Var2 = (wh50) x5;
            boolean y = M.y(op10Var) | M.o(257);
            Object x6 = M.x();
            if (y || x6 == c0012a) {
                x6 = new cp10() { // from class: com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.ui.SelectGroupVerificationTypeItemKt$SelectGroupVerificationTypeItem$$inlined$ConstraintLayout$2
                    @Override // xsna.cp10
                    public final dp10 b(ep10 ep10Var, final List<? extends zo10> list, long j) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        wh50.this.getValue();
                        long f = op10Var.f(j, ep10Var.getLayoutDirection(), h6jVar, list, linkedHashMap);
                        wh50Var.getValue();
                        final op10 op10Var2 = op10Var;
                        return ep10Var.Q((int) (f >> 32), (int) (f & 4294967295L), jgp.b, new izs<tra0.a, s3q0>() { // from class: com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.ui.SelectGroupVerificationTypeItemKt$SelectGroupVerificationTypeItem$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // xsna.izs
                            public final s3q0 invoke(tra0.a aVar3) {
                                op10.this.e(aVar3, list, linkedHashMap);
                                return s3q0.a;
                            }
                        });
                    }
                };
                M.R(x6);
            }
            cp10 cp10Var = (cp10) x6;
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = new gzs<s3q0>() { // from class: com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.ui.SelectGroupVerificationTypeItemKt$SelectGroupVerificationTypeItem$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.gzs
                    public final s3q0 invoke() {
                        wh50.this.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        h6jVar.e = true;
                        return s3q0.a;
                    }
                };
                M.R(x7);
            }
            final gzs gzsVar2 = (gzs) x7;
            boolean y2 = M.y(op10Var);
            Object x8 = M.x();
            if (y2 || x8 == c0012a) {
                x8 = new izs<tgi0, s3q0>() { // from class: com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.ui.SelectGroupVerificationTypeItemKt$SelectGroupVerificationTypeItem$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public final s3q0 invoke(tgi0 tgi0Var) {
                        e4p0.a(tgi0Var, op10.this);
                        return s3q0.a;
                    }
                };
                M.R(x8);
            }
            final String str2 = obj;
            aVar2 = M;
            joy.a(egi0.b(c, false, (izs) x8), kai.c(1200550679, new wzs<androidx.compose.runtime.a, Integer, s3q0>() { // from class: com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.ui.SelectGroupVerificationTypeItemKt$SelectGroupVerificationTypeItem$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0108, code lost:
                
                    if (r5 == r2) goto L24;
                 */
                @Override // xsna.wzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final s3q0 invoke(a aVar3, Integer num) {
                    a.C0011a.C0012a c0012a2;
                    long j;
                    int i3;
                    a aVar4 = aVar3;
                    int intValue = num.intValue();
                    if ((intValue & 3) == 2 && aVar4.e()) {
                        aVar4.h();
                    } else {
                        if (b.d()) {
                            b.f(1200550679, intValue, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        wh50.this.setValue(s3q0.a);
                        c6j c6jVar2 = c6jVar;
                        int i4 = c6jVar2.b;
                        c6jVar2.l();
                        c6j c6jVar3 = c6jVar;
                        aVar4.K(1940294076);
                        s5j j2 = c6jVar3.j();
                        s5j j3 = c6jVar3.j();
                        s5j j4 = c6jVar3.j();
                        s5j j5 = c6jVar3.j();
                        q630.a aVar5 = q630.a.a;
                        q630 q = txj0.q(aVar5, 28);
                        Object x9 = aVar4.x();
                        a.C0011a.C0012a c0012a3 = a.C0011a.a;
                        if (x9 == c0012a3) {
                            x9 = j8i0.b;
                            aVar4.R(x9);
                        }
                        n8i0.b(h8i0Var, str2, c6j.i(q, j2, (izs) x9), aVar4, 0);
                        q630 E2 = ahn.E(aVar5, "select_group_verification_type_item_title");
                        boolean J = aVar4.J(j2) | aVar4.J(j5);
                        Object x10 = aVar4.x();
                        if (J || x10 == c0012a3) {
                            x10 = new k8i0(j2, j5);
                            aVar4.R(x10);
                        }
                        yqv0.c(str2, c6j.i(E2, j3, (izs) x10), wlb0.h(aVar4).getText().m, null, null, 0, 5, null, 0, false, 0, 0, null, wlb0.l(aVar4).N, aVar4, 0, 0, 8120);
                        q630 E3 = ahn.E(aVar5, "select_group_verification_type_item_description");
                        boolean J2 = aVar4.J(j3) | aVar4.J(j2) | aVar4.J(j5);
                        Object x11 = aVar4.x();
                        if (J2) {
                            c0012a2 = c0012a3;
                        } else {
                            c0012a2 = c0012a3;
                        }
                        x11 = new l8i0(j3, j2, j5);
                        aVar4.R(x11);
                        q630 i5 = c6j.i(E3, j4, (izs) x11);
                        frv0 frv0Var = wlb0.l(aVar4).i0;
                        h8i0 h8i0Var2 = h8i0Var;
                        if (h8i0Var2.f) {
                            j = gub0.a(aVar4, -352986649, aVar4).k;
                            aVar4.j();
                        } else if (h8i0Var2.g) {
                            j = gub0.a(aVar4, -352984409, aVar4).l;
                            aVar4.j();
                        } else {
                            j = gub0.a(aVar4, -352982584, aVar4).p;
                            aVar4.j();
                        }
                        a.C0011a.C0012a c0012a4 = c0012a2;
                        yqv0.c(str, i5, j, null, null, 0, 5, null, 0, false, 0, 0, null, frv0Var, aVar4, 0, 0, 8120);
                        q630 q2 = txj0.q(aVar5, 24);
                        Object x12 = aVar4.x();
                        if (x12 == c0012a4) {
                            x12 = m8i0.b;
                            aVar4.R(x12);
                        }
                        q630 i6 = c6j.i(q2, j5, (izs) x12);
                        if (b.d()) {
                            i3 = 0;
                            b.f(-1231053620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronCompactRight24> (VkSdkIcons.kt:416)");
                        } else {
                            i3 = 0;
                        }
                        lg90 a3 = pg90.a(R.drawable.vk_icon_chevron_compact_right_24, i3, aVar4);
                        if (b.d()) {
                            b.e();
                        }
                        pzu0.b(a3, str2, i6, wlb0.h(aVar4).getIcon().l, aVar4, 8, 0);
                        aVar4.j();
                        if (c6jVar.b != i4) {
                            bap.i(gzsVar2, aVar4, 6);
                        }
                        if (b.d()) {
                            b.e();
                        }
                    }
                    return s3q0.a;
                }
            }, M), cp10Var, aVar2, 48, 0);
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new cqg(i, 9, h8i0Var, q630Var2, gzsVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(h8i0 h8i0Var, final String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        lg90 a;
        int i3;
        int hashCode;
        oe7 oe7Var;
        int i4;
        ColorFilter porterDuffColorFilter;
        int i5;
        ColorFilter porterDuffColorFilter2;
        ColorFilter porterDuffColorFilter3;
        int i6;
        int i7;
        androidx.compose.runtime.a M = aVar.M(-1487397228);
        int i8 = i | (M.J(h8i0Var) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i8 & 1, (i8 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1487397228, i8, -1, "com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.ui.VerificationTypeIcon (SelectGroupVerificationTypeItem.kt:140)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String str2 = ylu0Var.s() ? h8i0Var.d : h8i0Var.e;
            if (str2.length() == 0) {
                M.K(127069877);
                int i9 = i8 & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-661839326, i9, -1, "com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.ui.resolveIcon (SelectGroupVerificationTypeItem.kt:171)");
                }
                String str3 = h8i0Var.a;
                int hashCode2 = str3.hashCode();
                if (hashCode2 == -318452137) {
                    if (str3.equals("premium")) {
                        M.K(-372421967);
                        if (androidx.compose.runtime.b.d()) {
                            i2 = 0;
                            androidx.compose.runtime.b.f(-911860438, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CrownVerified28> (VkSdkIcons.kt:598)");
                        } else {
                            i2 = 0;
                        }
                        a = pg90.a(R.drawable.vk_icon_crown_verified_28, i2, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        if (androidx.compose.runtime.b.d()) {
                        }
                        if (androidx.compose.runtime.b.d()) {
                        }
                        String str4 = h8i0Var.a;
                        hashCode = str4.hashCode();
                        if (hashCode != -318452137) {
                        }
                    }
                    M.K(-372420596);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    a = pg90.a(R.drawable.vk_icon_verified_20, i3, M);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    String str42 = h8i0Var.a;
                    hashCode = str42.hashCode();
                    if (hashCode != -318452137) {
                    }
                } else if (hashCode2 != 3016401) {
                    if (hashCode2 == 3344077 && str3.equals("mark")) {
                        M.K(-372427244);
                        if (androidx.compose.runtime.b.d()) {
                            i7 = 0;
                            androidx.compose.runtime.b.f(-602429508, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-VerifiedCentered28> (VkSdkIcons.kt:3672)");
                        } else {
                            i7 = 0;
                        }
                        a = pg90.a(R.drawable.vk_icon_verified_centered_28, i7, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1079246231, i9, -1, "com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.ui.resolveIconTint (SelectGroupVerificationTypeItem.kt:182)");
                        }
                        String str422 = h8i0Var.a;
                        hashCode = str422.hashCode();
                        if (hashCode != -318452137) {
                            if (str422.equals("premium")) {
                                M.K(2068522459);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j = ylu0Var2.getIcon().a;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    se7.b();
                                    i4 = 5;
                                    porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                                } else {
                                    i4 = 5;
                                    porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                                }
                                oe7Var = new oe7(j, i4, porterDuffColorFilter);
                                M.j();
                                oe7 oe7Var2 = oe7Var;
                                if (androidx.compose.runtime.b.d()) {
                                }
                                vjw.a(a, str, q630Var, null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var2, M, (i8 & 112) | 24584 | (i8 & 896), 40);
                                M.j();
                            }
                            M.K(-300261626);
                            M.j();
                            oe7Var = null;
                            oe7 oe7Var22 = oe7Var;
                            if (androidx.compose.runtime.b.d()) {
                            }
                            vjw.a(a, str, q630Var, null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var22, M, (i8 & 112) | 24584 | (i8 & 896), 40);
                            M.j();
                        } else if (hashCode != 3016401) {
                            if (hashCode == 3344077 && str422.equals("mark")) {
                                M.K(2068515867);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j2 = ylu0Var3.getIcon().a;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    se7.b();
                                    porterDuffColorFilter3 = re7.b(f870.H(j2), z42.a(5));
                                } else {
                                    porterDuffColorFilter3 = new PorterDuffColorFilter(f870.H(j2), z42.b(5));
                                }
                                oe7Var = new oe7(j2, 5, porterDuffColorFilter3);
                                M.j();
                                oe7 oe7Var222 = oe7Var;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                vjw.a(a, str, q630Var, null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var222, M, (i8 & 112) | 24584 | (i8 & 896), 40);
                                M.j();
                            }
                            M.K(-300261626);
                            M.j();
                            oe7Var = null;
                            oe7 oe7Var2222 = oe7Var;
                            if (androidx.compose.runtime.b.d()) {
                            }
                            vjw.a(a, str, q630Var, null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var2222, M, (i8 & 112) | 24584 | (i8 & 896), 40);
                            M.j();
                        } else {
                            if (str422.equals("base")) {
                                M.K(2068519070);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var4 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j3 = ylu0Var4.getIcon().l;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    se7.b();
                                    i5 = 5;
                                    porterDuffColorFilter2 = re7.b(f870.H(j3), z42.a(5));
                                } else {
                                    i5 = 5;
                                    porterDuffColorFilter2 = new PorterDuffColorFilter(f870.H(j3), z42.b(5));
                                }
                                oe7Var = new oe7(j3, i5, porterDuffColorFilter2);
                                M.j();
                                oe7 oe7Var22222 = oe7Var;
                                if (androidx.compose.runtime.b.d()) {
                                }
                                vjw.a(a, str, q630Var, null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var22222, M, (i8 & 112) | 24584 | (i8 & 896), 40);
                                M.j();
                            }
                            M.K(-300261626);
                            M.j();
                            oe7Var = null;
                            oe7 oe7Var222222 = oe7Var;
                            if (androidx.compose.runtime.b.d()) {
                            }
                            vjw.a(a, str, q630Var, null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var222222, M, (i8 & 112) | 24584 | (i8 & 896), 40);
                            M.j();
                        }
                    }
                    M.K(-372420596);
                    if (androidx.compose.runtime.b.d()) {
                        i3 = 0;
                        androidx.compose.runtime.b.f(2124872764, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Verified20> (VkSdkIcons.kt:3656)");
                    } else {
                        i3 = 0;
                    }
                    a = pg90.a(R.drawable.vk_icon_verified_20, i3, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    String str4222 = h8i0Var.a;
                    hashCode = str4222.hashCode();
                    if (hashCode != -318452137) {
                    }
                } else {
                    if (str3.equals("base")) {
                        M.K(-372424652);
                        if (androidx.compose.runtime.b.d()) {
                            i6 = 0;
                            androidx.compose.runtime.b.f(-602429508, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-VerifiedCentered28> (VkSdkIcons.kt:3672)");
                        } else {
                            i6 = 0;
                        }
                        a = pg90.a(R.drawable.vk_icon_verified_centered_28, i6, M);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        M.j();
                        if (androidx.compose.runtime.b.d()) {
                        }
                        if (androidx.compose.runtime.b.d()) {
                        }
                        String str42222 = h8i0Var.a;
                        hashCode = str42222.hashCode();
                        if (hashCode != -318452137) {
                        }
                    }
                    M.K(-372420596);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    a = pg90.a(R.drawable.vk_icon_verified_20, i3, M);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    if (androidx.compose.runtime.b.d()) {
                    }
                    String str422222 = h8i0Var.a;
                    hashCode = str422222.hashCode();
                    if (hashCode != -318452137) {
                    }
                }
            } else {
                M.K(127325627);
                fwu0.c(q630Var, null, str2, null, null, null, null, kai.c(-1987203767, new a0t() { // from class: xsna.i8i0
                    @Override // xsna.a0t
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        lg90 lg90Var = (lg90) obj3;
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        if ((intValue & 384) == 0) {
                            intValue |= (intValue & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                        }
                        if (aVar2.t(intValue & 1, (intValue & 1153) != 1152)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1987203767, intValue, -1, "com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.ui.VerificationTypeIcon.<anonymous> (SelectGroupVerificationTypeItem.kt:160)");
                            }
                            vjw.a(lg90Var, str, q630.a.a, null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 24968 | ((intValue >> 6) & 14), 104);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, ((i8 >> 6) & 14) | 100663296, 250);
                M = M;
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
            s.d = new be0(i, 4, h8i0Var, str, q630Var);
        }
    }
}
