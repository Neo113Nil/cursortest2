package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.TabMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.q630;

/* compiled from: VkDefaultTabRow.kt */
/* loaded from: classes17.dex */
public abstract class col {

    /* compiled from: VkDefaultTabRow.kt */
    @b6l(c = "com.vk.core.compose.component.DefaultTabScope$VkDefaultTab$4$1", f = "VkDefaultTabRow.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $selected;
        final /* synthetic */ kg50 $selectedProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kg50 kg50Var, boolean z, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$selectedProgress = kg50Var;
            this.$selected = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$selectedProgress, this.$selected, spjVar);
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
            this.$selectedProgress.g(this.$selected ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return s3q0.a;
        }
    }

    public abstract void a(int i, androidx.compose.runtime.a aVar, jai jaiVar, gzs gzsVar, q630 q630Var, boolean z);

    public final void b(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var, boolean z) {
        int i2;
        q630 q630Var2;
        jai jaiVar = wlb0.c;
        androidx.compose.runtime.a M = aVar.M(-867899104);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= M.J(this) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-867899104, i3, -1, "com.vk.core.compose.component.DefaultTabScope.VkDefaultTab (VkDefaultTabRow.kt:303)");
            }
            int i4 = i3 << 3;
            q630 q630Var3 = q630.a.a;
            a(((i3 >> 9) & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i3 & 57344), M, jaiVar, gzsVar, q630Var3, z);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u3(this, z, gzsVar, q630Var2, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final boolean z, final gzs<s3q0> gzsVar, q630 q630Var, final psn0 psn0Var, osn0 osn0Var, ssn0 ssn0Var, msn0 msn0Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
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
        androidx.compose.runtime.a M = aVar.M(-581727782);
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
                i3 |= M.J(psn0Var) ? 2048 : 1024;
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
                            q630 q630Var4 = i7 != 0 ? q630.a.a : q630Var2;
                            final osn0 osn0Var4 = i4 != 0 ? null : osn0Var2;
                            final ssn0 ssn0Var3 = i5 != 0 ? null : ssn0Var;
                            if (i6 != 0) {
                                msn0Var2 = null;
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-581727782, i3, -1, "com.vk.core.compose.component.DefaultTabScope.VkDefaultTab (VkDefaultTabRow.kt:351)");
                            }
                            Object x = M.x();
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            if (x == c0012a) {
                                x = androidx.compose.runtime.d.a(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                M.R(x);
                            }
                            final kg50 kg50Var = (kg50) x;
                            Boolean valueOf = Boolean.valueOf(z);
                            int i8 = i3 & 14;
                            boolean z2 = i8 == 4;
                            Object x2 = M.x();
                            if (z2 || x2 == c0012a) {
                                x2 = new a(kg50Var, z, null);
                                M.R(x2);
                            }
                            bap.g(valueOf, (wzs) x2, M, i8);
                            int i9 = i3 << 3;
                            a(((i3 >> 9) & 57344) | ((i3 >> 6) & 14) | 3072 | (i9 & 112) | (i9 & 896), M, kai.c(-1399870915, new zzs() { // from class: xsna.aol
                                @Override // xsna.zzs
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    ((Boolean) obj2).getClass();
                                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    if (aVar2.t(intValue & 1, (intValue & 129) != 128)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-1399870915, intValue, -1, "com.vk.core.compose.component.DefaultTabScope.VkDefaultTab.<anonymous> (VkDefaultTabRow.kt:365)");
                                        }
                                        ipv0.a(kg50.this, TabMode.Default, null, psn0Var, osn0Var4, ssn0Var3, msn0Var2, aVar2, 54);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar2.h();
                                    }
                                    return s3q0.a;
                                }
                            }, M), gzsVar2, q630Var4, z);
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
                            s.d = new wzs() { // from class: xsna.bol
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    col.this.c(z, gzsVar, q630Var3, psn0Var, osn0Var3, ssn0Var2, msn0Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
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
}
