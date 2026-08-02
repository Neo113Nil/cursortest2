package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.TabMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.psn0;
import xsna.q630;

/* compiled from: VkAccentTabRow.kt */
/* loaded from: classes17.dex */
public abstract class jj {

    /* compiled from: VkAccentTabRow.kt */
    @b6l(c = "com.vk.core.compose.component.AccentTabScope$VkAccentTab$4$1", f = "VkAccentTabRow.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $selected;
        final /* synthetic */ wh50<Float> $selectedProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(spj spjVar, wh50 wh50Var, boolean z) {
            super(2, spjVar);
            this.$selectedProgress = wh50Var;
            this.$selected = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(spjVar, this.$selectedProgress, this.$selected);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$selectedProgress.setValue(new Float(this.$selected ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            return s3q0.a;
        }
    }

    public abstract void a(q630 q630Var, boolean z, gzs<s3q0> gzsVar, zzs<? super jj, ? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar, androidx.compose.runtime.a aVar, int i);

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(final boolean z, final gzs<s3q0> gzsVar, final zzs<? super jj, ? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-844681323);
        if ((i & 6) == 0) {
            i3 = (M.l(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(zzsVar) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= M.J(this) ? 16384 : 8192;
            }
            if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                M.h();
                q630Var3 = q630Var2;
            } else {
                q630 q630Var4 = i4 != 0 ? q630.a.a : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-844681323, i3, -1, "com.vk.core.compose.component.AccentTabScope.VkAccentTab (VkAccentTabRow.kt:283)");
                }
                int i5 = i3 << 3;
                a(q630Var4, z, gzsVar, zzsVar, M, ((i3 >> 9) & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i3 & 57344));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var4;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.ij
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        jj.this.b(z, gzsVar, zzsVar, q630Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if ((i & 24576) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final boolean z, final gzs<s3q0> gzsVar, q630 q630Var, final psn0.a aVar, osn0 osn0Var, ssn0 ssn0Var, msn0 msn0Var, androidx.compose.runtime.a aVar2, final int i, final int i2) {
        int i3;
        gzs<s3q0> gzsVar2;
        q630 q630Var2;
        int i4;
        osn0 osn0Var2;
        int i5;
        int i6;
        final msn0 msn0Var2;
        final q630 q630Var3;
        final osn0 osn0Var3;
        final ssn0 ssn0Var2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar2.M(815678631);
        if ((i & 6) == 0) {
            i3 = (M.l(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            gzsVar2 = gzsVar;
            i3 |= M.y(gzsVar2) ? 32 : 16;
        } else {
            gzsVar2 = gzsVar;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= M.J(aVar) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                osn0Var2 = osn0Var;
                i3 |= M.J(osn0Var2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    i3 |= M.J(ssn0Var) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        msn0Var2 = msn0Var;
                        i3 |= M.J(msn0Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        if ((i & 12582912) == 0) {
                            i3 |= M.J(this) ? 8388608 : 4194304;
                        }
                        if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
                            if (i7 != 0) {
                                q630Var2 = q630.a.a;
                            }
                            final osn0 osn0Var4 = i4 != 0 ? null : osn0Var2;
                            final ssn0 ssn0Var3 = i5 != 0 ? null : ssn0Var;
                            if (i6 != 0) {
                                msn0Var2 = null;
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(815678631, i3, -1, "com.vk.core.compose.component.AccentTabScope.VkAccentTab (VkAccentTabRow.kt:332)");
                            }
                            Object x = M.x();
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            if (x == c0012a) {
                                x = androidx.compose.runtime.k.b(Float.valueOf(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                                M.R(x);
                            }
                            final wh50 wh50Var = (wh50) x;
                            Boolean valueOf = Boolean.valueOf(z);
                            int i8 = i3 & 14;
                            boolean z2 = i8 == 4;
                            Object x2 = M.x();
                            if (z2 || x2 == c0012a) {
                                x2 = new a(null, wh50Var, z);
                                M.R(x2);
                            }
                            bap.g(valueOf, (wzs) x2, M, i8);
                            int i9 = i3 << 3;
                            int i10 = ((i3 >> 6) & 14) | 3072 | (i9 & 112) | (i9 & 896) | ((i3 >> 9) & 57344);
                            q630 q630Var4 = q630Var2;
                            a(q630Var4, z, gzsVar2, kai.c(412298288, new zzs() { // from class: xsna.fj
                                @Override // xsna.zzs
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    ((Boolean) obj2).getClass();
                                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    if (aVar3.t(intValue & 1, (intValue & 129) != 128)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(412298288, intValue, -1, "com.vk.core.compose.component.AccentTabScope.VkAccentTab.<anonymous> (VkAccentTabRow.kt:344)");
                                        }
                                        ipv0.a(wh50.this, TabMode.Accent, null, aVar, osn0Var4, ssn0Var3, msn0Var2, aVar3, 54);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar3.h();
                                    }
                                    return s3q0.a;
                                }
                            }, M), M, i10);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var3 = q630Var4;
                            osn0Var3 = osn0Var4;
                            ssn0Var2 = ssn0Var3;
                        } else {
                            M.h();
                            q630Var3 = q630Var2;
                            osn0Var3 = osn0Var2;
                            ssn0Var2 = ssn0Var;
                        }
                        final msn0 msn0Var3 = msn0Var2;
                        s = M.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.gj
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    jj.this.c(z, gzsVar, q630Var3, aVar, osn0Var3, ssn0Var2, msn0Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    msn0Var2 = msn0Var;
                    if ((i & 12582912) == 0) {
                    }
                    if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
                    }
                    final msn0 msn0Var32 = msn0Var2;
                    s = M.s();
                    if (s != null) {
                    }
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                msn0Var2 = msn0Var;
                if ((i & 12582912) == 0) {
                }
                if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
                }
                final msn0 msn0Var322 = msn0Var2;
                s = M.s();
                if (s != null) {
                }
            }
            osn0Var2 = osn0Var;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            msn0Var2 = msn0Var;
            if ((i & 12582912) == 0) {
            }
            if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
            }
            final msn0 msn0Var3222 = msn0Var2;
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        osn0Var2 = osn0Var;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        msn0Var2 = msn0Var;
        if ((i & 12582912) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
        }
        final msn0 msn0Var32222 = msn0Var2;
        s = M.s();
        if (s != null) {
        }
    }

    public final void d(String str, frv0 frv0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1294573148);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(frv0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1294573148, i2, -1, "com.vk.core.compose.component.AccentTabScope.VkAccentTabText (VkAccentTabRow.kt:359)");
            }
            int i3 = i2;
            anx e = e();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            e.a(str, j, ylu0Var2.getText().c, frv0Var, null, M, ((i3 << 6) & 7168) | (i3 & 14));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hj(i, 0, this, str, frv0Var);
        }
    }

    public abstract anx e();
}
