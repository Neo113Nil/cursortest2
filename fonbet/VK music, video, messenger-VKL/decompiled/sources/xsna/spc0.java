package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.feed.design.compose.posting.preview.spinner.PostingSpinnerSize;
import com.vk.feed.design.compose.posting.preview.spinner.PostingSpinnerState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.spc0;

/* compiled from: PostingVKSpinner.kt */
/* loaded from: classes18.dex */
public final class spc0 {

    /* compiled from: PostingVKSpinner.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostingSpinnerState.values().length];
            try {
                iArr[PostingSpinnerState.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingSpinnerState.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostingSpinnerState.Done.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final PostingSpinnerSize postingSpinnerSize, final long j, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        float f;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1453057596);
        int i3 = i | (M.o(postingSpinnerSize.ordinal()) ? 4 : 2) | (M.p(j) ? 32 : 16) | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1453057596, i3, -1, "com.vk.feed.design.compose.posting.preview.spinner.DoneState (PostingVKSpinner.kt:135)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1060031380, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DoneOutline28> (VkSdkIcons.kt:712)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_done_outline_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i4 = (i3 & 14) | 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1948414563, i4, -1, "com.vk.feed.design.compose.posting.preview.spinner.PostingVkSpinnerDefault.sizeToDp (PostingVkSpinnerDefault.kt:10)");
            }
            int i5 = jqc0.$EnumSwitchMapping$0[postingSpinnerSize.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    i2 = 24;
                } else if (i5 == 3) {
                    f = 32;
                } else {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 44;
                }
                f = i2;
            } else {
                f = 16;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630.a aVar2 = q630.a.a;
            pzu0.b(a2, d370.N(R.string.vk_spinner_done, 0, M), txj0.q(aVar2, f), j, M, 8 | ((i3 << 6) & 7168), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, q630Var2, i) { // from class: xsna.jpc0
                public final /* synthetic */ long c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    spc0.a(PostingSpinnerSize.this, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final PostingSpinnerSize postingSpinnerSize, final long j, final lg90 lg90Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        float f;
        int i3;
        androidx.compose.runtime.a M = aVar.M(723360814);
        if ((i & 6) == 0) {
            i2 = (M.o(postingSpinnerSize.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.p(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(723360814, i2, -1, "com.vk.feed.design.compose.posting.preview.spinner.ErrorIcon (PostingVKSpinner.kt:190)");
            }
            int i4 = (i2 & 14) | 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1948414563, i4, -1, "com.vk.feed.design.compose.posting.preview.spinner.PostingVkSpinnerDefault.sizeToDp (PostingVkSpinnerDefault.kt:10)");
            }
            int i5 = jqc0.$EnumSwitchMapping$0[postingSpinnerSize.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    i3 = 24;
                } else if (i5 == 3) {
                    f = 32;
                } else {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 44;
                }
                f = i3;
            } else {
                f = 16;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(lg90Var, d370.N(R.string.vk_spinner_error, 0, M), txj0.q(q630.a.a, f), j, M, ((i2 >> 6) & 14) | 8 | ((i2 << 6) & 7168), 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.kpc0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    spc0.b(PostingSpinnerSize.this, j, lg90Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final PostingSpinnerSize postingSpinnerSize, final long j, q630 q630Var, final lg90 lg90Var, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        long j2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1427513795);
        int i2 = i | (M.o(postingSpinnerSize.ordinal()) ? 4 : 2) | (M.p(j) ? 32 : 16) | 384 | (M.y(lg90Var) ? 2048 : 1024) | (M.y(gzsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1427513795, i2, -1, "com.vk.feed.design.compose.posting.preview.spinner.ErrorState (PostingVKSpinner.kt:151)");
            }
            q630Var2 = q630.a.a;
            if (lg90Var != null) {
                M.K(-1702480556);
                if (gzsVar != null) {
                    M.K(-1702455353);
                    nzu0.e(gzsVar, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, kai.c(466361582, new wzs() { // from class: xsna.opc0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(466361582, intValue, -1, "com.vk.feed.design.compose.posting.preview.spinner.ErrorState.<anonymous> (PostingVKSpinner.kt:155)");
                                }
                                spc0.b(PostingSpinnerSize.this, j, lg90Var, aVar3, 512);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar3.h();
                            }
                            return s3q0.a;
                        }
                    }, M), M, ((i2 >> 12) & 14) | 100663296, 254);
                    M.j();
                    aVar2 = M;
                    j2 = j;
                } else {
                    M.K(-1702237609);
                    aVar2 = M;
                    b(postingSpinnerSize, j, lg90Var, aVar2, (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 512 | ((i2 >> 3) & 896));
                    j2 = j;
                    aVar2.j();
                }
                aVar2.j();
            } else {
                j2 = j;
                M.K(-1702077432);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new vsq(24);
                    M.R(x);
                }
                q630 b = egi0.b(q630Var2, true, (izs) x);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.f, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, b);
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
                f9t.e(hr80.m(txj0.q(q630Var2, 32), j2, vog0.a), M, 0);
                q630 q = txj0.q(q630Var2, 16);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2113961956, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel16> (VkSdkIcons.kt:212)");
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_cancel_16, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(a2, d370.N(R.string.vk_spinner_error, 0, M), q, ylu0Var.getBackground().n, M, 392, 0);
                aVar2 = M;
                aVar2.G();
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            j2 = j;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final long j3 = j2;
            final q630 q630Var3 = q630Var2;
            s.d = new wzs(j3, q630Var3, lg90Var, gzsVar, i) { // from class: xsna.ppc0
                public final /* synthetic */ long c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ lg90 e;
                public final /* synthetic */ gzs f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(4097);
                    spc0.c(PostingSpinnerSize.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final PostingSpinnerSize postingSpinnerSize, long j, final gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final long j2;
        q630 q630Var2;
        int i2;
        float f;
        int i3;
        float f2;
        androidx.compose.runtime.a M = aVar.M(-1754150162);
        int i4 = i | (M.o(postingSpinnerSize.ordinal()) ? 4 : 2) | (M.p(j) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | 3072;
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1754150162, i4, -1, "com.vk.feed.design.compose.posting.preview.spinner.LoadingState (PostingVKSpinner.kt:205)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new gzn(28);
                M.R(x);
            }
            q630Var2 = q630.a.a;
            q630 b = egi0.b(q630Var2, true, (izs) x);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i5 = (i4 & 14) | 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1948414563, i5, -1, "com.vk.feed.design.compose.posting.preview.spinner.PostingVkSpinnerDefault.sizeToDp (PostingVkSpinnerDefault.kt:10)");
            }
            int[] iArr = jqc0.$EnumSwitchMapping$0;
            int i6 = iArr[postingSpinnerSize.ordinal()];
            if (i6 == 1) {
                i2 = 16;
            } else if (i6 == 2) {
                i2 = 24;
            } else if (i6 == 3) {
                f = 32;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 q = txj0.q(q630Var2, f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1873865038, i5, -1, "com.vk.feed.design.compose.posting.preview.spinner.PostingVkSpinnerDefault.strokeWidthToDp (PostingVkSpinnerDefault.kt:19)");
                }
                i3 = iArr[postingSpinnerSize.ordinal()];
                if (i3 != 1) {
                    f2 = 2;
                } else if (i3 == 2) {
                    f2 = (float) 2.5d;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = 3;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                mku0.a(f2, i4 & 112, 8, j, M, q);
                j2 = j;
                if (gzsVar == null) {
                    M.K(1551431407);
                    nzu0.e(gzsVar, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, kai.c(1946653572, new wzs() { // from class: xsna.qpc0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1946653572, intValue, -1, "com.vk.feed.design.compose.posting.preview.spinner.LoadingState.<anonymous>.<anonymous> (PostingVKSpinner.kt:215)");
                                }
                                q630 q2 = txj0.q(q630.a.a, 16);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-2113961956, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel16> (VkSdkIcons.kt:212)");
                                }
                                lg90 a2 = pg90.a(R.drawable.vk_icon_cancel_16, 0, aVar3);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                pzu0.b(a2, d370.N(R.string.vk_spinner_cancel, 0, aVar3), q2, j2, aVar3, 392, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar3.h();
                            }
                            return s3q0.a;
                        }
                    }, M), M, ((i4 >> 6) & 14) | 100663296, 254);
                    M = M;
                } else {
                    M.K(1544477518);
                }
                M.j();
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                if (i6 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 44;
            }
            f = i2;
            if (androidx.compose.runtime.b.d()) {
            }
            q630 q2 = txj0.q(q630Var2, f);
            if (androidx.compose.runtime.b.d()) {
            }
            i3 = iArr[postingSpinnerSize.ordinal()];
            if (i3 != 1) {
            }
            if (androidx.compose.runtime.b.d()) {
            }
            mku0.a(f2, i4 & 112, 8, j, M, q2);
            j2 = j;
            if (gzsVar == null) {
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            j2 = j;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final long j3 = j2;
            final q630 q630Var3 = q630Var2;
            s.d = new wzs(j3, gzsVar, q630Var3, i) { // from class: xsna.rpc0
                public final /* synthetic */ long c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    spc0.d(PostingSpinnerSize.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(final PostingSpinnerState postingSpinnerState, q630 q630Var, final String str, final gzs gzsVar, final long j, final long j2, final PostingSpinnerSize postingSpinnerSize, final gzs gzsVar2, final lg90 lg90Var, final long j3, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(-1371340619);
        int i2 = i | (M.o(postingSpinnerState.ordinal()) ? 4 : 2) | 48 | (M.J(str) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.p(j) ? 16384 : 8192) | (M.p(j2) ? 131072 : 65536) | (M.o(postingSpinnerSize == null ? -1 : postingSpinnerSize.ordinal()) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(gzsVar2) ? 8388608 : 4194304) | (M.y(lg90Var) ? 67108864 : 33554432) | (M.p(j3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if (M.t(i2 & 1, (306783379 & i2) != 306783378)) {
            M.V();
            int i3 = i & 1;
            q630.a aVar2 = q630.a.a;
            if (i3 == 0 || M.i()) {
                q630Var3 = aVar2;
            } else {
                M.h();
                q630Var3 = q630Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1371340619, i2, -1, "com.vk.feed.design.compose.posting.preview.spinner.PostingVkScreenSpinner (PostingVKSpinner.kt:50)");
            }
            float f = 88;
            q630 g = txj0.a(aVar2, f, f).g(q630Var3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1412929589, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
            }
            squ0 squ0Var = (squ0) M.r(rrv0.b);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            squ0Var.getClass();
            q630 q630Var4 = q630Var3;
            shu0.a(g, null, j, 0L, null, tqu0.d, kai.c(957391300, new wzs() { // from class: xsna.mpc0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(957391300, intValue, -1, "com.vk.feed.design.compose.posting.preview.spinner.PostingVkScreenSpinner.<anonymous> (PostingVKSpinner.kt:58)");
                        }
                        q630.a aVar4 = q630.a.a;
                        q630 D = s200.D(aVar4, 16);
                        dt1.a.getClass();
                        cp10 d = ja8.d(dt1.a.f, false);
                        int hashCode = Long.hashCode(n34.n(aVar3));
                        sy90 D2 = aVar3.D();
                        q630 c = qri.c(aVar3, D);
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
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar3, d, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar3, D2, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar3, valueOf, bVar);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(aVar3, c2678a);
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(aVar3, c, dVar);
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar3, 48);
                        int hashCode2 = Long.hashCode(n34.n(aVar3));
                        sy90 D3 = aVar3.D();
                        q630 c2 = qri.c(aVar3, aVar4);
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
                        k9q0.w(aVar3, a2, cVar);
                        k9q0.w(aVar3, D3, eVar);
                        ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
                        k9q0.w(aVar3, c2, dVar);
                        spc0.f(PostingSpinnerState.this, txj0.q(aVar4, 56), gzsVar, j2, postingSpinnerSize, gzsVar2, lg90Var, aVar3, 2097200);
                        String str2 = str;
                        if (str2 == null || str2.length() == 0) {
                            aVar3.K(-728862);
                        } else {
                            aVar3.K(2163965);
                            if (a690.d(aVar4, kqu0.t, aVar3, 0)) {
                                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                            }
                            wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            yqv0.c(str2, null, j3, null, null, 0, 3, null, 0, false, 0, 2, null, wuv0Var.i0, aVar3, 0, 48, 6074);
                            aVar3 = aVar3;
                        }
                        aVar3.j();
                        if (kr.f(aVar3)) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 >> 6) & 896) | 1572864, 26);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var4;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(q630Var2, str, gzsVar, j, j2, postingSpinnerSize, gzsVar2, lg90Var, j3, i) { // from class: xsna.npc0
                public final /* synthetic */ q630 c;
                public final /* synthetic */ String d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long g;
                public final /* synthetic */ PostingSpinnerSize h;
                public final /* synthetic */ gzs i;
                public final /* synthetic */ lg90 j;
                public final /* synthetic */ long k;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(134217729);
                    spc0.e(PostingSpinnerState.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(final PostingSpinnerState postingSpinnerState, final q630 q630Var, final gzs gzsVar, final long j, final PostingSpinnerSize postingSpinnerSize, final gzs gzsVar2, final lg90 lg90Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1787867046);
        int i2 = i | (M.o(postingSpinnerState.ordinal()) ? 4 : 2) | (M.y(gzsVar) ? 256 : 128) | (M.p(j) ? 2048 : 1024) | (M.o(postingSpinnerSize == null ? -1 : postingSpinnerSize.ordinal()) ? 16384 : 8192) | (M.y(gzsVar2) ? 131072 : 65536) | (M.y(lg90Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1787867046, i2, -1, "com.vk.feed.design.compose.posting.preview.spinner.PostingVkSpinner (PostingVKSpinner.kt:99)");
            }
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            xh2.a(postingSpinnerState, null, null, ty6Var, "SpinnerAnimation", null, kai.c(172808353, new zzs() { // from class: xsna.ipc0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    PostingSpinnerState postingSpinnerState2 = (PostingSpinnerState) obj2;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(172808353, intValue, -1, "com.vk.feed.design.compose.posting.preview.spinner.PostingVkSpinner.<anonymous>.<anonymous> (PostingVKSpinner.kt:106)");
                    }
                    int i3 = spc0.a.$EnumSwitchMapping$0[postingSpinnerState2.ordinal()];
                    PostingSpinnerSize postingSpinnerSize2 = PostingSpinnerSize.this;
                    long j2 = j;
                    if (i3 == 1) {
                        aVar3.K(-1434894068);
                        spc0.d(postingSpinnerSize2, j2, gzsVar, null, aVar3, 0);
                        aVar3.j();
                    } else if (i3 == 2) {
                        aVar3.K(-1434888075);
                        spc0.c(postingSpinnerSize2, j2, null, lg90Var, gzsVar2, aVar3, 4096);
                        aVar3.j();
                    } else {
                        if (i3 != 3) {
                            throw alb0.c(-1434895794, aVar3);
                        }
                        aVar3.K(-1434880928);
                        spc0.a(postingSpinnerSize2, j2, null, aVar3, 0);
                        aVar3.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, (i2 & 14) | 1600512, 38);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(q630Var, gzsVar, j, postingSpinnerSize, gzsVar2, lg90Var, i) { // from class: xsna.lpc0
                public final /* synthetic */ q630 c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ long e;
                public final /* synthetic */ PostingSpinnerSize f;
                public final /* synthetic */ gzs g;
                public final /* synthetic */ lg90 h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(2097201);
                    spc0.f(PostingSpinnerState.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
