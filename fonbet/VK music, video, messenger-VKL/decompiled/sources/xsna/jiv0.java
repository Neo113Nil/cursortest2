package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.q630;

/* compiled from: VkSearchTextField.kt */
/* loaded from: classes17.dex */
public final class jiv0 {

    /* compiled from: VkSearchTextField.kt */
    public static final class a implements zzs<InputSelect$State, Boolean, androidx.compose.runtime.a, Integer, l5g> {
        public static final a b = new a();

        @Override // xsna.zzs
        public final l5g invoke(InputSelect$State inputSelect$State, Boolean bool, androidx.compose.runtime.a aVar, Integer num) {
            long j;
            InputSelect$State inputSelect$State2 = inputSelect$State;
            boolean booleanValue = bool.booleanValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            aVar2.K(955798381);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(955798381, intValue, -1, "com.vk.core.compose.component.SearchDecorationBox.<anonymous> (VkSearchTextField.kt:173)");
            }
            int i = intValue & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1481314929, i, -1, "com.vk.core.compose.component.inputBackgroundColor (VkSearchTextField.kt:218)");
            }
            if (inputSelect$State2 == InputSelect$State.Error) {
                aVar2.K(-1909465243);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getBackground().u;
                aVar2.j();
            } else {
                aVar2.K(-1909463292);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.k().a;
                aVar2.j();
            }
            long c = l5g.c(14, j, l5g.e(j) * (booleanValue ? 1.0f : 0.64f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return com.vk.movika.sdk.android.defaultplayer.interactive.c.c(c, aVar2);
        }
    }

    /* compiled from: VkSearchTextField.kt */
    @b6l(c = "com.vk.core.compose.component.VkSearchTextFieldKt$VkSearchTextField$3$1", f = "VkSearchTextField.kt", l = {143}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ rwr $focusRequester;
        final /* synthetic */ boolean $requestFocus;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, rwr rwrVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$requestFocus = z;
            this.$focusRequester = rwrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$requestFocus, this.$focusRequester, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.label = 1;
                if (qsl.b(500L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            if (this.$requestFocus) {
                rwr.b(this.$focusRequester);
            } else {
                this.$focusRequester.a();
            }
            return s3q0.a;
        }
    }

    public static final void a(String str, bkg0 bkg0Var, tlh0 tlh0Var, androidx.compose.runtime.a aVar, int i) {
        String str2;
        bkg0 bkg0Var2;
        tlh0 tlh0Var2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-681682219);
        int i3 = (M.J(str) ? 32 : 16) | i | (M.J(bkg0Var) ? 256 : 128) | (M.J(tlh0Var) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-681682219, i3, -1, "com.vk.core.compose.component.GetSearchClearTrailingIcon (VkSearchTextField.kt:232)");
            }
            if (str.length() > 0) {
                M.K(-1389422910);
                bkg0Var.a(54, M);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new zle(i, 9, str, bkg0Var, tlh0Var);
                    return;
                }
                return;
            }
            str2 = str;
            bkg0Var2 = bkg0Var;
            tlh0Var2 = tlh0Var;
            i2 = i;
            M.K(-1397624115);
            M.j();
            if (tlh0Var2 != null) {
                M.K(-1389325167);
                tlh0Var2.a(54, M);
            } else {
                M.K(-1397624115);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str2 = str;
            bkg0Var2 = bkg0Var;
            tlh0Var2 = tlh0Var;
            i2 = i;
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            tlh0 tlh0Var3 = tlh0Var2;
            s2.d = new ar0(i2, 12, str2, bkg0Var2, tlh0Var3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(sg50 sg50Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, fqh0 fqh0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1594138813);
        if ((i & 6) == 0) {
            i2 = (M.J(sg50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(wzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(fqh0Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1594138813, i2, -1, "com.vk.core.compose.component.SearchDecorationBox (VkSearchTextField.kt:166)");
            }
            rqv0.a(InputSelect$State.NoBorder, ((Boolean) sa30.j(sg50Var, M, i2 & 14).getValue()).booleanValue(), true, s200.H(q630.a.a, kqu0.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, null, a.b, kai.c(-331823586, new pda0(1, fqh0Var, wzsVar), M), M, 12583302, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bg4(i, 6, sg50Var, wzsVar, fqh0Var);
        }
    }

    public static final void c(boolean z, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1236844547);
        int i2 = (M.l(z) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1236844547, i2, -1, "com.vk.core.compose.component.SearchIconOrSpinner (VkSearchTextField.kt:243)");
            }
            ijk.a(Boolean.valueOf(z), null, null, null, fco0.b, M, (i2 & 14) | 24576, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ek00(z, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final tho0 tho0Var, final String str, q630 q630Var, boolean z, boolean z2, tlh0 tlh0Var, tlh0 tlh0Var2, iqv0 iqv0Var, sg50 sg50Var, izs<? super tho0, s3q0> izsVar, gzs<s3q0> gzsVar, boolean z3, final izs<? super tho0, s3q0> izsVar2, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        int i5;
        int i6;
        int i7;
        tlh0 tlh0Var3;
        int i8;
        final tlh0 tlh0Var4;
        int i9;
        sg50 sg50Var2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        androidx.compose.runtime.a aVar2;
        final boolean z4;
        final boolean z5;
        final iqv0 iqv0Var2;
        final sg50 sg50Var3;
        final izs<? super tho0, s3q0> izsVar3;
        final gzs<s3q0> gzsVar2;
        final boolean z6;
        final tlh0 tlh0Var5;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        boolean z7;
        long j;
        long j2;
        int i17;
        long j3;
        int i18;
        sg50 sg50Var4;
        int i19;
        q630 q630Var4;
        boolean z8;
        sg50 sg50Var5;
        izs<? super tho0, s3q0> izsVar4;
        gzs<s3q0> gzsVar3;
        iqv0 iqv0Var3;
        tlh0 tlh0Var6;
        boolean z9;
        long j4;
        izs<? super tho0, s3q0> izsVar5;
        gzs<s3q0> gzsVar4;
        uey ueyVar;
        uey ueyVar2;
        rgy rgyVar;
        tlh0 tlh0Var7;
        tlh0 tlh0Var8;
        boolean z10;
        q630 q630Var5;
        boolean z11;
        androidx.compose.runtime.a M = aVar.M(-1619045133);
        if ((i & 6) == 0) {
            i4 = (M.J(tho0Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= M.J(str) ? 32 : 16;
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= M.l(z) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= M.l(z2) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                        tlh0Var3 = tlh0Var;
                    } else {
                        tlh0Var3 = tlh0Var;
                        if ((i & 196608) == 0) {
                            i4 |= M.J(tlh0Var3) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        tlh0Var4 = tlh0Var2;
                    } else {
                        tlh0Var4 = tlh0Var2;
                        if ((i & 1572864) == 0) {
                            i4 |= M.J(tlh0Var4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                    }
                    if ((i & 12582912) == 0) {
                        i4 |= 4194304;
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                        sg50Var2 = sg50Var;
                    } else {
                        sg50Var2 = sg50Var;
                        if ((i & 100663296) == 0) {
                            i4 |= M.J(sg50Var2) ? 67108864 : 33554432;
                        }
                    }
                    i10 = i3 & 512;
                    if (i10 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= M.y(izsVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                    }
                    i11 = i3 & 1024;
                    if (i11 == 0) {
                        i13 = i2 | 6;
                        i12 = i11;
                    } else if ((i2 & 6) == 0) {
                        i12 = i11;
                        i13 = i2 | (M.y(gzsVar) ? 4 : 2);
                    } else {
                        i12 = i11;
                        i13 = i2;
                    }
                    i14 = i3 & 2048;
                    if (i14 == 0) {
                        i13 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i15 = i14;
                        i13 |= M.l(z3) ? 32 : 16;
                        if ((i2 & 384) == 0) {
                            i13 |= M.y(izsVar2) ? 256 : 128;
                        }
                        i16 = i13;
                        if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i16 & 147) != 146)) {
                            M.V();
                            int i21 = i & 1;
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            if (i21 == 0 || M.i()) {
                                if (i20 != 0) {
                                    q630Var2 = q630.a.a;
                                }
                                boolean z12 = i5 != 0 ? false : z;
                                z7 = i6 != 0 ? false : z2;
                                if (i7 != 0) {
                                    tlh0Var3 = null;
                                }
                                if (i8 != 0) {
                                    tlh0Var4 = null;
                                }
                                uog0 uog0Var = sqv0.a;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                iyk0 iyk0Var = rrv0.a;
                                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j5 = ylu0Var.getText().m;
                                z = z12;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                int i22 = i4;
                                tlh0 tlh0Var9 = tlh0Var4;
                                long j6 = ylu0Var2.r().a;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j7 = ylu0Var3.m().a;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var4 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j8 = ylu0Var4.m().a;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var5 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j9 = ylu0Var5.r().b;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var6 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j10 = ylu0Var6.getIcon().a;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var7 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j11 = ylu0Var7.getIcon().l;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var8 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j12 = ylu0Var8.getText().r;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var9 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j13 = ylu0Var9.getText().p;
                                if (androidx.compose.runtime.b.d()) {
                                    j = j13;
                                    j2 = j5;
                                    i17 = 0;
                                    androidx.compose.runtime.b.f(-1191488726, 0, 6, "com.vk.core.compose.component.defaults.VkTextFieldDefaults.defaultStateColors (VkTextFieldDefaults.kt:68)");
                                } else {
                                    j = j13;
                                    j2 = j5;
                                    i17 = 0;
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, i17, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var10 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j14 = ylu0Var10.getBackground().u;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var11 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j15 = ylu0Var11.m().e;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var12 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j16 = ylu0Var12.m().e;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var13 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j17 = ylu0Var13.getIcon().a;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var14 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j18 = ylu0Var14.getIcon().l;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var15 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j19 = ylu0Var15.getText().r;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var16 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j20 = ylu0Var16.getText().k;
                                if (androidx.compose.runtime.b.d()) {
                                    j3 = j15;
                                    i18 = -1;
                                    androidx.compose.runtime.b.f(-484597755, 12582912, -1, "com.vk.core.compose.component.defaults.VkTextFieldDefaults.errorStateColors (VkTextFieldDefaults.kt:111)");
                                } else {
                                    j3 = j15;
                                    i18 = -1;
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, i18, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var17 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long c = l5g.c(14, ylu0Var17.getText().m, 0.64f);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var18 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j21 = ylu0Var18.r().b;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var19 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long c2 = l5g.c(14, ylu0Var19.getIcon().a, 0.64f);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var20 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long c3 = l5g.c(14, ylu0Var20.getIcon().l, 0.64f);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var21 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long j22 = ylu0Var21.getText().r;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var22 = (ylu0) M.r(iyk0Var);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                long c4 = l5g.c(14, ylu0Var22.getText().p, 0.64f);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1177132634, 1572864, -1, "com.vk.core.compose.component.defaults.VkTextFieldDefaults.disabledStateColors (VkTextFieldDefaults.kt:131)");
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1863220968, 3072, -1, "com.vk.core.compose.component.defaults.VkTextFieldDefaults.colors (VkTextFieldDefaults.kt:27)");
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1762667317, 0, 0, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:451)");
                                }
                                wol wolVar = new wol(j2, c, j7, j3, j8, j9, j16, j21, j10, c2, j17, j11, c3, j18, j6, j12, j12, j22, j19, j, c4);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                iqv0 iqv0Var4 = new iqv0(wolVar, j6, j14);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                int i23 = i22 & (-29360129);
                                if (i9 != 0) {
                                    Object x = M.x();
                                    if (x == c0012a) {
                                        x = ir.h(M);
                                    }
                                    sg50Var4 = (sg50) x;
                                } else {
                                    sg50Var4 = sg50Var;
                                }
                                izs<? super tho0, s3q0> izsVar6 = i10 != 0 ? null : izsVar;
                                gzs<s3q0> gzsVar5 = i12 != 0 ? null : gzsVar;
                                q630 q630Var6 = q630Var2;
                                i19 = i23;
                                q630Var4 = q630Var6;
                                if (i15 != 0) {
                                    sg50Var5 = sg50Var4;
                                    izsVar4 = izsVar6;
                                    gzsVar3 = gzsVar5;
                                    iqv0Var3 = iqv0Var4;
                                    z8 = false;
                                } else {
                                    z8 = z3;
                                    sg50Var5 = sg50Var4;
                                    izsVar4 = izsVar6;
                                    gzsVar3 = gzsVar5;
                                    iqv0Var3 = iqv0Var4;
                                }
                                tlh0Var4 = tlh0Var9;
                            } else {
                                M.h();
                                int i24 = i4 & (-29360129);
                                q630 q630Var7 = q630Var2;
                                i19 = i24;
                                q630Var4 = q630Var7;
                                z7 = z2;
                                iqv0Var3 = iqv0Var;
                                izsVar4 = izsVar;
                                gzsVar3 = gzsVar;
                                z8 = z3;
                                sg50Var5 = sg50Var2;
                            }
                            boolean z13 = z;
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                tlh0Var6 = tlh0Var4;
                                androidx.compose.runtime.b.f(-1619045133, i19, i16, "com.vk.core.compose.component.VkSearchTextField (VkSearchTextField.kt:81)");
                            } else {
                                tlh0Var6 = tlh0Var4;
                            }
                            Object x2 = M.x();
                            if (x2 == c0012a) {
                                x2 = new rwr();
                                M.R(x2);
                            }
                            rwr rwrVar = (rwr) x2;
                            pqo pqoVar = grv0.a;
                            frv0 frv0Var = (frv0) M.r(pqoVar);
                            boolean z14 = z8;
                            M.K(-1124182771);
                            long b2 = frv0Var.a.b();
                            if (b2 != 16) {
                                z9 = z7;
                                j4 = b2;
                            } else {
                                z9 = z7;
                                j4 = ((l5g) iqv0Var3.a(6, M).getValue()).a;
                            }
                            M.j();
                            nmo0 d = ((frv0) M.r(pqoVar)).a.d(new nmo0(j4, 0L, null, null, 0L, null, null, 0, 0L, null, null, 0, 16777214));
                            uog0 uog0Var2 = sqv0.a;
                            bkg0 v = fsk.v(d370.N(R.string.vk_accessibility_clear_input, 0, M), gzsVar3, M, 3072 | ((i16 << 3) & 112), 4);
                            if (izsVar4 != null) {
                                M.K(-489478992);
                                gzsVar4 = gzsVar3;
                                boolean z15 = ((i19 & 14) == 4) | ((1879048192 & i19) == 536870912);
                                Object x3 = M.x();
                                if (z15 || x3 == c0012a) {
                                    x3 = new hto0(6, izsVar4, tho0Var);
                                    M.R(x3);
                                }
                                izsVar5 = izsVar4;
                                ueyVar = new uey(null, null, (izs) x3, 47);
                                M.j();
                            } else {
                                izsVar5 = izsVar4;
                                gzsVar4 = gzsVar3;
                                M.K(-489380536);
                                M.j();
                                ueyVar = uey.d;
                            }
                            if (izsVar5 != null) {
                                ueyVar2 = ueyVar;
                                rgyVar = new rgy(0, 3, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                            } else {
                                ueyVar2 = ueyVar;
                                rgyVar = rgy.e;
                            }
                            int i25 = i19 & 14;
                            boolean J = ((i19 & 112) == 32) | (i25 == 4) | ((3670016 & i19) == 1048576) | M.J(v) | ((458752 & i19) == 131072) | ((i16 & 112) == 32);
                            Object x4 = M.x();
                            if (J || x4 == c0012a) {
                                tlh0 tlh0Var10 = tlh0Var3;
                                x4 = new fqh0(tho0Var.a.c, str, tlh0Var6, v, tlh0Var10, z14);
                                tlh0Var7 = tlh0Var6;
                                tlh0Var8 = tlh0Var10;
                                z10 = z14;
                                M.R(x4);
                            } else {
                                tlh0Var7 = tlh0Var6;
                                z10 = z14;
                                tlh0Var8 = tlh0Var3;
                            }
                            fqh0 fqh0Var = (fqh0) x4;
                            q630 h = txj0.h(jvi.d(q630Var4, rwrVar), 36);
                            int i26 = i19 >> 15;
                            iqv0Var3.getClass();
                            M.K(-1565846414);
                            if (androidx.compose.runtime.b.d()) {
                                q630Var5 = q630Var4;
                                androidx.compose.runtime.b.f(-1565846414, 54, -1, "com.vk.core.compose.component.defaults.VkTextFieldColorsImpl.backgroundColor (VkTextFieldDefaults.kt:226)");
                            } else {
                                q630Var5 = q630Var4;
                            }
                            wh50 f = bo.f(0, zjq.g(iqv0Var3.b, false), M);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            M.j();
                            q630 b3 = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, sqv0.b, 1, txj0.f(hr80.m(h, ((l5g) f.getValue()).a, uog0Var2), 1.0f));
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var23 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            izs<? super tho0, s3q0> izsVar7 = izsVar5;
                            iqv0 iqv0Var5 = iqv0Var3;
                            int i27 = i19;
                            gzs<s3q0> gzsVar6 = gzsVar4;
                            boolean z16 = z9;
                            wt6.a(tho0Var, izsVar2, b3, false, z16, d, rgyVar, ueyVar2, true, 0, 0, null, null, sg50Var5, new rek0(ylu0Var23.getIcon().a), kai.c(-1898835946, new sab0(2, sg50Var5, fqh0Var), M), M, i25 | 100663296 | ((i16 >> 3) & 112) | (57344 & i19), (i26 & 7168) | 196608, 7688);
                            aVar2 = M;
                            Boolean valueOf = Boolean.valueOf(z13);
                            boolean z17 = (i27 & 7168) == 2048;
                            Object x5 = aVar2.x();
                            if (z17 || x5 == c0012a) {
                                z11 = z13;
                                x5 = new b(z11, rwrVar, null);
                                aVar2.R(x5);
                            } else {
                                z11 = z13;
                            }
                            bap.g(valueOf, (wzs) x5, aVar2, (i27 >> 9) & 14);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            boolean z18 = z11;
                            z5 = z16;
                            z4 = z18;
                            sg50Var3 = sg50Var5;
                            gzsVar2 = gzsVar6;
                            izsVar3 = izsVar7;
                            tlh0Var5 = tlh0Var8;
                            tlh0Var4 = tlh0Var7;
                            z6 = z10;
                            q630Var3 = q630Var5;
                            iqv0Var2 = iqv0Var5;
                        } else {
                            aVar2 = M;
                            aVar2.h();
                            z4 = z;
                            z5 = z2;
                            iqv0Var2 = iqv0Var;
                            sg50Var3 = sg50Var;
                            izsVar3 = izsVar;
                            gzsVar2 = gzsVar;
                            z6 = z3;
                            tlh0Var5 = tlh0Var3;
                            q630Var3 = q630Var2;
                        }
                        s = aVar2.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.iiv0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int I = ne7.I(i | 1);
                                    int I2 = ne7.I(i2);
                                    jiv0.d(tho0.this, str, q630Var3, z4, z5, tlh0Var5, tlh0Var4, iqv0Var2, sg50Var3, izsVar3, gzsVar2, z6, izsVar2, (androidx.compose.runtime.a) obj, I, I2, i3);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i15 = i14;
                    if ((i2 & 384) == 0) {
                    }
                    i16 = i13;
                    if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i16 & 147) != 146)) {
                    }
                    s = aVar2.s();
                    if (s != null) {
                    }
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i3 & 512;
                if (i10 == 0) {
                }
                i11 = i3 & 1024;
                if (i11 == 0) {
                }
                i14 = i3 & 2048;
                if (i14 == 0) {
                }
                i15 = i14;
                if ((i2 & 384) == 0) {
                }
                i16 = i13;
                if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i16 & 147) != 146)) {
                }
                s = aVar2.s();
                if (s != null) {
                }
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i3 & 512;
            if (i10 == 0) {
            }
            i11 = i3 & 1024;
            if (i11 == 0) {
            }
            i14 = i3 & 2048;
            if (i14 == 0) {
            }
            i15 = i14;
            if ((i2 & 384) == 0) {
            }
            i16 = i13;
            if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i16 & 147) != 146)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        i11 = i3 & 1024;
        if (i11 == 0) {
        }
        i14 = i3 & 2048;
        if (i14 == 0) {
        }
        i15 = i14;
        if ((i2 & 384) == 0) {
        }
        i16 = i13;
        if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i16 & 147) != 146)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }
}
