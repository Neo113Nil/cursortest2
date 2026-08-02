package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.Build;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.us2;
import xsna.wkj;

/* compiled from: VkOnboardingHighlighter.kt */
/* loaded from: classes17.dex */
public final class d8v0 {
    public static final Pair<Integer, Integer> a = new Pair<>(-1, -1);

    /* compiled from: VkOnboardingHighlighter.kt */
    @b6l(c = "com.vk.core.tool.compose.onboarding.VkOnboardingHighlighterKt$rememberHighlightedText$1$1", f = "VkOnboardingHighlighter.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ long $highlightedTextColor;
        final /* synthetic */ boolean $isHighlighted;
        final /* synthetic */ boolean $shouldChangeColor;
        final /* synthetic */ wh50<us2> $text$delegate;
        final /* synthetic */ v5v $textHighlightedInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, boolean z2, v5v v5vVar, long j, wh50<us2> wh50Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$shouldChangeColor = z;
            this.$isHighlighted = z2;
            this.$textHighlightedInfo = v5vVar;
            this.$highlightedTextColor = j;
            this.$text$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$shouldChangeColor, this.$isHighlighted, this.$textHighlightedInfo, this.$highlightedTextColor, this.$text$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            us2 us2Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (!this.$shouldChangeColor) {
                return s3q0.a;
            }
            wh50<us2> wh50Var = this.$text$delegate;
            if (!this.$isHighlighted || this.$textHighlightedInfo.b.equals(d8v0.a)) {
                us2Var = new us2(this.$textHighlightedInfo.a);
            } else {
                v5v v5vVar = this.$textHighlightedInfo;
                long j = this.$highlightedTextColor;
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                String str = v5vVar.a;
                Pair<Integer, Integer> pair = v5vVar.b;
                sb.append(str);
                arrayList.add(new us2.b.a(pair.i().intValue(), pair.j().intValue(), 8, new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534)));
                String sb2 = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(((us2.b.a) arrayList.get(i)).a(sb.length()));
                }
                us2Var = new us2(sb2, arrayList2);
            }
            wh50Var.setValue(us2Var);
            return s3q0.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final Pair pair, q630 q630Var, VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType, VkOnboarding$TintColor vkOnboarding$TintColor, boolean z, boolean z2, boolean z3, izs izsVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        int i5;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        int i9;
        int i10;
        androidx.compose.runtime.a aVar2;
        final VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType2;
        final boolean z6;
        final izs izsVar2;
        final q630 q630Var3;
        final boolean z7;
        final boolean z8;
        final VkOnboarding$TintColor vkOnboarding$TintColor2;
        androidx.compose.runtime.f s;
        int i11;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(-1210724953);
        if ((i & 6) == 0) {
            i3 = (M.J(pair) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= M.o(vkOnboarding$HighlighterMarkerType == null ? -1 : vkOnboarding$HighlighterMarkerType.ordinal()) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= M.o(vkOnboarding$TintColor == null ? -1 : vkOnboarding$TintColor.ordinal()) ? 2048 : 1024;
            }
            i6 = i2 & 16;
            if (i6 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z4 = z;
                i3 |= M.l(z4) ? 16384 : 8192;
                i7 = i2 & 32;
                if (i7 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    z5 = z2;
                    i3 |= M.l(z5) ? 131072 : 65536;
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                    i9 = i2 & 128;
                    if (i9 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= M.y(izsVar) ? 8388608 : 4194304;
                    }
                    i10 = i3 | 100663296;
                    if ((i & 805306368) == 0) {
                        i10 |= M.y(jaiVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                    }
                    if (M.t(i10 & 1, (i10 & 306783379) == 306783378)) {
                        aVar2 = M;
                        aVar2.h();
                        vkOnboarding$HighlighterMarkerType2 = vkOnboarding$HighlighterMarkerType;
                        z6 = z3;
                        izsVar2 = izsVar;
                        q630Var3 = q630Var2;
                        z7 = z4;
                        z8 = z5;
                        vkOnboarding$TintColor2 = vkOnboarding$TintColor;
                    } else {
                        if (i12 != 0) {
                            q630Var4 = q630.a.a;
                            i11 = i8;
                        } else {
                            i11 = i8;
                            q630Var4 = q630Var2;
                        }
                        VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType3 = i4 != 0 ? VkOnboarding$HighlighterMarkerType.Type1 : vkOnboarding$HighlighterMarkerType;
                        vkOnboarding$TintColor2 = i5 != 0 ? VkOnboarding$TintColor.Lime : vkOnboarding$TintColor;
                        boolean z9 = i6 != 0 ? true : z4;
                        boolean z10 = i7 == 0 ? z5 : false;
                        boolean z11 = i11 != 0 ? false : z3;
                        izs izsVar3 = i9 != 0 ? null : izsVar;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1210724953, i10, -1, "com.vk.core.tool.compose.onboarding.VkOnboardingHighlighter (VkOnboardingHighlighter.kt:83)");
                        }
                        int i13 = i10 << 3;
                        aVar2 = M;
                        b(pair, j0t.a(vkOnboarding$TintColor2, M, (i10 >> 9) & 14), q630Var4, vkOnboarding$HighlighterMarkerType3, z9, z10, z11, izsVar3, jaiVar, aVar2, (i10 & 14) | (i13 & 896) | (i13 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192), 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var3 = q630Var4;
                        vkOnboarding$HighlighterMarkerType2 = vkOnboarding$HighlighterMarkerType3;
                        z7 = z9;
                        z8 = z10;
                        z6 = z11;
                        izsVar2 = izsVar3;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.w7v0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                d8v0.a(Pair.this, q630Var3, vkOnboarding$HighlighterMarkerType2, vkOnboarding$TintColor2, z7, z8, z6, izsVar2, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                z5 = z2;
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                i9 = i2 & 128;
                if (i9 == 0) {
                }
                i10 = i3 | 100663296;
                if ((i & 805306368) == 0) {
                }
                if (M.t(i10 & 1, (i10 & 306783379) == 306783378)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            z4 = z;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            z5 = z2;
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            i9 = i2 & 128;
            if (i9 == 0) {
            }
            i10 = i3 | 100663296;
            if ((i & 805306368) == 0) {
            }
            if (M.t(i10 & 1, (i10 & 306783379) == 306783378)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        z4 = z;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        z5 = z2;
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        i10 = i3 | 100663296;
        if ((i & 805306368) == 0) {
        }
        if (M.t(i10 & 1, (i10 & 306783379) == 306783378)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x02f6, code lost:
    
        if (r0 == null) goto L183;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final Pair pair, long j, final q630 q630Var, VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType, final boolean z, boolean z2, boolean z3, izs izsVar, jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        boolean z4;
        izs izsVar2;
        androidx.compose.runtime.a aVar2;
        final VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType2;
        final boolean z5;
        final izs izsVar3;
        final boolean z6;
        izs izsVar4;
        q630 q630Var2;
        q630 q630Var3;
        ColorFilter porterDuffColorFilter;
        final long j2 = j;
        final jai jaiVar2 = jaiVar;
        androidx.compose.runtime.a M = aVar.M(1382568404);
        if ((i & 6) == 0) {
            i3 = (M.J(pair) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.p(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= M.o(vkOnboarding$HighlighterMarkerType == null ? -1 : vkOnboarding$HighlighterMarkerType.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.l(z) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= 196608;
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & 196608) == 0) {
                i3 |= M.l(z4) ? 131072 : 65536;
            }
        }
        int i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i7 = i2 & 128;
        if (i7 != 0) {
            i3 |= 12582912;
            izsVar2 = izsVar;
        } else {
            izsVar2 = izsVar;
            if ((i & 12582912) == 0) {
                i3 |= M.y(izsVar2) ? 8388608 : 4194304;
            }
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= M.J(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= M.y(jaiVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if (M.t(i3 & 1, (i3 & 306783379) != 306783378)) {
            VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType3 = i4 != 0 ? VkOnboarding$HighlighterMarkerType.Type1 : vkOnboarding$HighlighterMarkerType;
            boolean z7 = i5 != 0 ? false : z4;
            boolean z8 = i6 != 0 ? false : z3;
            izs izsVar5 = i7 != 0 ? null : izsVar2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1382568404, i3, -1, "com.vk.core.tool.compose.onboarding.VkOnboardingHighlighter (VkOnboardingHighlighter.kt:109)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(null);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType4 = vkOnboarding$HighlighterMarkerType3;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var3 = (wh50) x3;
            int i8 = i3;
            Object x4 = M.x();
            int i9 = 6;
            if (x4 == c0012a) {
                x4 = new vgs0(wh50Var, i9);
                M.R(x4);
            }
            izs izsVar6 = (izs) x4;
            boolean z9 = z8;
            mtk0 b = hg2.b(((Boolean) wh50Var3.getValue()).booleanValue() ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jq2.d(250, 0, null, 6), "", izsVar5, M, ((i8 >> 9) & 57344) | 3120, 4);
            izs izsVar7 = izsVar5;
            aVar2 = M;
            Object x5 = aVar2.x();
            if (x5 == c0012a) {
                izsVar4 = izsVar6;
                x5 = androidx.compose.runtime.k.b(new ujt(new y7v0(z9 ? ((Number) b.getValue()).floatValue() : 1.0f)));
                aVar2.R(x5);
            } else {
                izsVar4 = izsVar6;
            }
            wh50 wh50Var4 = (wh50) x5;
            int i10 = i8 & 57344;
            boolean z10 = i10 == 16384;
            Object x6 = aVar2.x();
            if (z10 || x6 == c0012a) {
                x6 = io.reactivex.rxjava3.internal.operators.mixed.j.d(z, aVar2);
            }
            wh50 wh50Var5 = (wh50) x6;
            ljo0 ljo0Var = (ljo0) wh50Var.getValue();
            boolean z11 = (i8 & 14) == 4;
            Object x7 = aVar2.x();
            if (z11 || x7 == c0012a) {
                x7 = new z7v0(wh50Var, pair, wh50Var2, null);
                aVar2.R(x7);
            }
            bap.g(ljo0Var, (wzs) x7, aVar2, 8);
            Boolean valueOf = Boolean.valueOf(z);
            Rect rect = (Rect) wh50Var2.getValue();
            boolean z12 = i10 == 16384;
            Object x8 = aVar2.x();
            if (z12 || x8 == c0012a) {
                x8 = new a8v0(z, wh50Var2, wh50Var3, null);
                aVar2.R(x8);
            }
            bap.f(valueOf, rect, (wzs) x8, aVar2, (i8 >> 12) & 14);
            Float valueOf2 = Float.valueOf(((Number) b.getValue()).floatValue());
            boolean J = ((i8 & 3670016) == 1048576) | aVar2.J(b);
            Object x9 = aVar2.x();
            if (J || x9 == c0012a) {
                x9 = new b8v0(z9, b, wh50Var4, null);
                aVar2.R(x9);
            }
            bap.g(valueOf2, (wzs) x9, aVar2, 0);
            Boolean bool = (Boolean) wh50Var5.getValue();
            bool.getClass();
            boolean J2 = ((i8 & 458752) == 131072) | aVar2.J(wh50Var5);
            Object x10 = aVar2.x();
            if (J2 || x10 == c0012a) {
                x10 = new c8v0(null, wh50Var5, z7);
                aVar2.R(x10);
            }
            bap.g(bool, (wzs) x10, aVar2, 0);
            aVar2.K(1503410303);
            ljo0 ljo0Var2 = (ljo0) wh50Var.getValue();
            q630.a aVar3 = q630.a.a;
            if (ljo0Var2 != null) {
                q630Var2 = q630Var;
                q630Var3 = q630Var2.g(txj0.h(aVar3, d((int) (ljo0Var2.c & 4294967295L), aVar2)));
            } else {
                q630Var2 = q630Var;
            }
            q630Var3 = q630Var2;
            aVar2.j();
            dt1.a.getClass();
            q630 y = txj0.y(q630Var3, dt1.a.k, true);
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(aVar2));
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, y);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar4);
            } else {
                aVar2.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(aVar2, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(aVar2, D, eVar);
            Integer valueOf3 = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(aVar2, valueOf3, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(aVar2, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(aVar2, c, dVar);
            if (((Boolean) wh50Var5.getValue()).booleanValue()) {
                aVar2.K(421990253);
                Rect rect2 = (Rect) wh50Var2.getValue();
                if (rect2 == null) {
                    aVar2.K(196825437);
                    aVar2.j();
                    j2 = j;
                } else {
                    aVar2.K(196825438);
                    q630 d2 = rte0.d(kci.l(txj0.h(txj0.v(aVar3, d(rect2.width() + 30, aVar2)), d(rect2.height() + 30, aVar2)), d(rect2.left - 15, aVar2), d(rect2.top - 15, aVar2)), (ujt) wh50Var4.getValue());
                    boolean z13 = (i8 & 234881024) == 67108864;
                    Object x11 = aVar2.x();
                    int i11 = 5;
                    if (z13 || x11 == c0012a) {
                        x11 = new cbt0(null, i11);
                        aVar2.R(x11);
                    }
                    q630 f = bu00.f(d2, (izs) x11);
                    cp10 d3 = ja8.d(ty6Var, false);
                    int hashCode2 = Long.hashCode(n34.n(aVar2));
                    sy90 D2 = aVar2.D();
                    q630 c2 = qri.c(aVar2, f);
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, d3, cVar);
                    k9q0.w(aVar2, D2, eVar);
                    ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
                    k9q0.w(aVar2, c2, dVar);
                    q630 d4 = txj0.d(aVar3, 1.0f);
                    lg90 a2 = pg90.a(vkOnboarding$HighlighterMarkerType4.h(), 0, aVar2);
                    if (Build.VERSION.SDK_INT >= 29) {
                        se7.b();
                        porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                    }
                    j2 = j;
                    vjw.a(a2, null, d4, null, wkj.a.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j2, 5, porterDuffColorFilter), aVar2, 25016, 40);
                    aVar2 = aVar2;
                    aVar2.G();
                    s3q0 s3q0Var = s3q0.a;
                    aVar2.j();
                }
            } else {
                j2 = j;
                aVar2.K(190857256);
            }
            aVar2.j();
            Boolean bool2 = (Boolean) wh50Var5.getValue();
            bool2.getClass();
            jaiVar2 = jaiVar;
            jaiVar2.invoke(izsVar4, bool2, aVar2, Integer.valueOf(((i8 >> 21) & 896) | 6));
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z6 = z7;
            vkOnboarding$HighlighterMarkerType2 = vkOnboarding$HighlighterMarkerType4;
            izsVar3 = izsVar7;
            z5 = z9;
        } else {
            aVar2 = M;
            aVar2.h();
            vkOnboarding$HighlighterMarkerType2 = vkOnboarding$HighlighterMarkerType;
            z5 = z3;
            izsVar3 = izsVar2;
            z6 = z4;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.x7v0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d8v0.b(Pair.this, j2, q630Var, vkOnboarding$HighlighterMarkerType2, z, z6, z5, izsVar3, jaiVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r20.l(r5) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r20.l(r12) == false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final us2 c(v5v v5vVar, boolean z, boolean z2, long j, androidx.compose.runtime.a aVar, int i) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Object x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1563627172, i, -1, "com.vk.core.tool.compose.onboarding.rememberHighlightedText (VkOnboardingHighlighter.kt:240)");
        }
        int i2 = (i & 14) ^ 6;
        boolean z8 = (i2 > 4 && aVar.J(v5vVar)) || (i & 6) == 4;
        Object x2 = aVar.x();
        Object obj = a.C0011a.a;
        if (z8 || x2 == obj) {
            x2 = androidx.compose.runtime.k.b(new us2(v5vVar.a));
            aVar.R(x2);
        }
        wh50 wh50Var = (wh50) x2;
        Boolean valueOf = Boolean.valueOf(z);
        if (((i & 896) ^ 384) > 256) {
            z3 = z2;
        } else {
            z3 = z2;
        }
        if ((i & 384) != 256) {
            z4 = false;
            boolean J = z4 | aVar.J(wh50Var);
            if (((i & 112) ^ 48) <= 32) {
                z5 = z;
            } else {
                z5 = z;
            }
            if ((i & 48) != 32) {
                z6 = false;
                z7 = ((i2 <= 4 && aVar.J(v5vVar)) || (i & 6) == 4) | J | z6 | ((((i & 7168) ^ 3072) > 2048 && aVar.p(j)) || (i & 3072) == 2048);
                x = aVar.x();
                if (!z7 || x == obj) {
                    Object aVar2 = new a(z3, z5, v5vVar, j, wh50Var, null);
                    aVar.R(aVar2);
                    x = aVar2;
                }
                bap.f(valueOf, v5vVar, (wzs) x, aVar, ((i >> 3) & 14) | ((i << 3) & 112));
                us2 us2Var = (us2) wh50Var.getValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return us2Var;
            }
            z6 = true;
            if (((i & 7168) ^ 3072) > 2048) {
                z7 = ((i2 <= 4 && aVar.J(v5vVar)) || (i & 6) == 4) | J | z6 | ((((i & 7168) ^ 3072) > 2048 && aVar.p(j)) || (i & 3072) == 2048);
                x = aVar.x();
                if (!z7) {
                }
                Object aVar22 = new a(z3, z5, v5vVar, j, wh50Var, null);
                aVar.R(aVar22);
                x = aVar22;
                bap.f(valueOf, v5vVar, (wzs) x, aVar, ((i >> 3) & 14) | ((i << 3) & 112));
                us2 us2Var2 = (us2) wh50Var.getValue();
                if (androidx.compose.runtime.b.d()) {
                }
                return us2Var2;
            }
            z7 = ((i2 <= 4 && aVar.J(v5vVar)) || (i & 6) == 4) | J | z6 | ((((i & 7168) ^ 3072) > 2048 && aVar.p(j)) || (i & 3072) == 2048);
            x = aVar.x();
            if (!z7) {
            }
            Object aVar222 = new a(z3, z5, v5vVar, j, wh50Var, null);
            aVar.R(aVar222);
            x = aVar222;
            bap.f(valueOf, v5vVar, (wzs) x, aVar, ((i >> 3) & 14) | ((i << 3) & 112));
            us2 us2Var22 = (us2) wh50Var.getValue();
            if (androidx.compose.runtime.b.d()) {
            }
            return us2Var22;
        }
        z4 = true;
        boolean J2 = z4 | aVar.J(wh50Var);
        if (((i & 112) ^ 48) <= 32) {
        }
        if ((i & 48) != 32) {
        }
        z6 = true;
        z7 = ((i2 <= 4 && aVar.J(v5vVar)) || (i & 6) == 4) | J2 | z6 | ((((i & 7168) ^ 3072) > 2048 && aVar.p(j)) || (i & 3072) == 2048);
        x = aVar.x();
        if (!z7) {
        }
        Object aVar2222 = new a(z3, z5, v5vVar, j, wh50Var, null);
        aVar.R(aVar2222);
        x = aVar2222;
        bap.f(valueOf, v5vVar, (wzs) x, aVar, ((i >> 3) & 14) | ((i << 3) & 112));
        us2 us2Var222 = (us2) wh50Var.getValue();
        if (androidx.compose.runtime.b.d()) {
        }
        return us2Var222;
    }

    public static final float d(int i, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-111024029, 0, -1, "com.vk.core.tool.compose.onboarding.toDp (VkOnboardingHighlighter.kt:190)");
        }
        float k1 = ((azl) aVar.r(uvi.h)).k1(i);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return k1;
    }
}
