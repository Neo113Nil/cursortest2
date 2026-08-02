package xsna;

import android.view.View;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.modal.SheetValue;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.UUID;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: InternalModalBottomSheet.kt */
/* loaded from: classes17.dex */
public final class nix {
    public static final float a = 48;
    public static final float b = 24;
    public static final long c = f370.i(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public static final nkk d = new nkk(0.1f, 0.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);

    /* compiled from: InternalModalBottomSheet.kt */
    public static final class a implements PointerInputEventHandler {
        public final /* synthetic */ gzs<Boolean> a;
        public final /* synthetic */ gzs<s3q0> b;

        public a(gzs<Boolean> gzsVar, gzs<s3q0> gzsVar2) {
            this.a = gzsVar;
            this.b = gzsVar2;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            Object e = z2o0.e(dmb0Var, null, null, new wd3(16, this.a, this.b), spjVar, 7);
            return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
        }
    }

    /* compiled from: InternalModalBottomSheet.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SheetValue.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SecureFlagPolicy.values().length];
            try {
                iArr2[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SecureFlagPolicy.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void a(fw20 fw20Var, wzs wzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1990636199);
        int i2 = (M.J(fw20Var) ? 32 : 16) | i | (M.y(wzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1990636199, i2, -1, "com.vk.core.compose.component.internal.DragHandleSection (InternalModalBottomSheet.kt:342)");
            }
            String N = d370.N(R.string.vk_modal_collapse_description, 0, M);
            String N2 = d370.N(R.string.vk_modal_dismiss_description, 0, M);
            String N3 = d370.N(R.string.vk_modal_expand_description, 0, M);
            dt1.a.getClass();
            gcv gcvVar = new gcv(dt1.a.o);
            boolean J = ((i2 & 112) == 32) | M.J(N2) | M.J(N3) | M.J(N);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                ag9 ag9Var = new ag9(fw20Var, N2, N3, N, 2);
                M.R(ag9Var);
                x = ag9Var;
            }
            q630 b2 = egi0.b(gcvVar, true, (izs) x);
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            k9q0.w(M, c2, cri.a.d);
            wzsVar.invoke(M, Integer.valueOf((i2 >> 6) & 14));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wd0(fw20Var, wzsVar, i, 6);
        }
    }

    public static final void b(final gzs gzsVar, final r5j0 r5j0Var, final fdj0 fdj0Var, final q630 q630Var, final q630 q630Var2, final xx20 xx20Var, final wzs wzsVar, final wzs wzsVar2, final float f, final wzs wzsVar3, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        float f2;
        int i4;
        fdj0 fdj0Var2;
        androidx.compose.runtime.a aVar2;
        a.C0011a.C0012a c0012a;
        int i5;
        int i6;
        if2 if2Var;
        androidx.compose.runtime.a M = aVar.M(1961527061);
        if ((i & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(r5j0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(fdj0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(q630Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.J(xx20Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= M.y(wzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= M.y(wzsVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            f2 = f;
            i3 |= M.n(f2) ? 67108864 : 33554432;
        } else {
            f2 = f;
        }
        if ((i & 805306368) == 0) {
            i3 |= M.y(wzsVar3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (M.y(jaiVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1961527061, i3, i4, "com.vk.core.compose.component.internal.InternalModalBottomSheet (InternalModalBottomSheet.kt:131)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            int i7 = i3 & 896;
            int i8 = i3;
            int i9 = i8 & 14;
            boolean y = (i7 == 256) | M.y(yvjVar) | (i9 == 4);
            Object x2 = M.x();
            if (y || x2 == c0012a2) {
                x2 = new j49(fdj0Var, yvjVar, gzsVar, 2);
                M.R(x2);
            }
            final gzs gzsVar2 = (gzs) x2;
            boolean y2 = M.y(yvjVar) | (i7 == 256) | (i9 == 4);
            Object x3 = M.x();
            if (y2 || x3 == c0012a2) {
                x3 = new rte(yvjVar, fdj0Var, gzsVar, 3);
                M.R(x3);
            }
            izs izsVar = (izs) x3;
            Object x4 = M.x();
            if (x4 == c0012a2) {
                x4 = qf2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                M.R(x4);
            }
            if2 if2Var2 = (if2) x4;
            final fw20 fw20Var = new fw20(if2Var2, yvjVar, gzsVar2, izsVar, fdj0Var, r5j0Var, xx20Var, f2);
            boolean y3 = (i9 == 4) | (i7 == 256) | M.y(yvjVar) | M.y(if2Var2);
            Object x5 = M.x();
            if (y3 || x5 == c0012a2) {
                c0012a = c0012a2;
                i5 = 256;
                i6 = i7;
                y2t y2tVar = new y2t(fdj0Var, yvjVar, if2Var2, gzsVar, 1);
                if2Var = if2Var2;
                M.R(y2tVar);
                x5 = y2tVar;
            } else {
                i6 = i7;
                c0012a = c0012a2;
                i5 = 256;
                if2Var = if2Var2;
            }
            fdj0Var2 = fdj0Var;
            aVar2 = M;
            c((gzs) x5, xx20Var, if2Var, kai.c(515233236, new wzs() { // from class: xsna.yhx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(515233236, intValue, -1, "com.vk.core.compose.component.internal.InternalModalBottomSheet.<anonymous> (InternalModalBottomSheet.kt:176)");
                        }
                        q630 A = f9t.A(txj0.d(q630.a.a, 1.0f));
                        dt1.a.getClass();
                        cp10 d2 = ja8.d(dt1.a.b, false);
                        int hashCode = Long.hashCode(n34.n(aVar3));
                        sy90 D = aVar3.D();
                        q630 c2 = qri.c(aVar3, A);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar4);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, d2, cri.a.f);
                        k9q0.w(aVar3, D, cri.a.e);
                        k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar3, cri.a.h);
                        k9q0.w(aVar3, c2, cri.a.d);
                        wzs wzsVar4 = wzs.this;
                        if (wzsVar4 == null) {
                            aVar3.K(-408138657);
                        } else {
                            aVar3.K(1233760226);
                            wzsVar4.invoke(aVar3, 0);
                        }
                        aVar3.j();
                        xx20 xx20Var2 = xx20Var;
                        nix.d(xx20Var2.h, gzsVar2, ((SheetValue) fdj0Var.b.g.getValue()) != SheetValue.Hidden, xx20Var2.c, aVar3, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-805156232, 6, -1, "com.vk.core.compose.component.internal.ModalBottomSheetContent (InternalModalBottomSheet.kt:215)");
                        }
                        nix.e(fw20Var, q630Var, q630Var2, wzsVar, wzsVar3, jaiVar, aVar3, 6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar3.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i8 >> 12) & 112) | 3584);
            if (fdj0Var2.b.e().f(SheetValue.Expanded)) {
                aVar2.K(-1469177127);
                boolean z = i6 == i5;
                Object x6 = aVar2.x();
                if (z || x6 == c0012a) {
                    x6 = new jix(fdj0Var2, null);
                    aVar2.R(x6);
                }
                bap.g(fdj0Var2, (wzs) x6, aVar2, (i8 >> 6) & 14);
            } else {
                aVar2.K(-1477669267);
            }
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            fdj0Var2 = fdj0Var;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final fdj0 fdj0Var3 = fdj0Var2;
            s.d = new wzs() { // from class: xsna.zhx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nix.b(gzs.this, r5j0Var, fdj0Var3, q630Var, q630Var2, xx20Var, wzsVar, wzsVar2, f, wzsVar3, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), ne7.I(i2));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final gzs gzsVar, final xx20 xx20Var, final if2 if2Var, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        gzs gzsVar2;
        int i2;
        boolean z;
        Object obj;
        androidx.compose.runtime.a M = aVar.M(208160625);
        if ((i & 6) == 0) {
            gzsVar2 = gzsVar;
            i2 = (M.y(gzsVar2) ? 4 : 2) | i;
        } else {
            gzsVar2 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(xx20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(if2Var) : M.y(if2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(jaiVar) ? 2048 : 1024;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(208160625, i3, -1, "com.vk.core.compose.component.internal.ModalBottomSheetDialog (InternalModalBottomSheet.kt:588)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            azl azlVar = (azl) M.r(uvi.h);
            LayoutDirection layoutDirection = (LayoutDirection) M.r(uvi.n);
            cvi z2 = n34.z(M);
            wh50 c2 = androidx.compose.runtime.k.c(jaiVar, M, (i3 >> 9) & 14);
            Object[] objArr = new Object[0];
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new sv0(20);
                M.R(x);
            }
            UUID uuid = (UUID) crx0.A(objArr, (gzs) x, M, 48);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x2);
            }
            yvj yvjVar = (yvj) x2;
            boolean J = M.J(view) | M.J(azlVar);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                uw20 uw20Var = new uw20(gzsVar2, xx20Var, view, layoutDirection, azlVar, uuid, if2Var, yvjVar);
                z = true;
                jai jaiVar2 = new jai(-458359394, new com.vk.movika.sdk.android.defaultplayer.control.l(c2, 5), true);
                sw20 sw20Var = uw20Var.i;
                sw20Var.setParentCompositionContext(z2);
                ((zak0) sw20Var.q).setValue(jaiVar2);
                sw20Var.s = true;
                sw20Var.r();
                M.R(uw20Var);
                obj = uw20Var;
            } else {
                z = true;
                obj = x3;
            }
            uw20 uw20Var2 = (uw20) obj;
            boolean y = M.y(uw20Var2);
            Object x4 = M.x();
            if (y || x4 == c0012a) {
                x4 = new cww(uw20Var2, 1);
                M.R(x4);
            }
            bap.c(uw20Var2, (izs) x4, M, 0);
            boolean y2 = M.y(uw20Var2) | ((i3 & 14) == 4 ? z : false) | ((i3 & 112) == 32 ? z : false) | M.o(layoutDirection.ordinal());
            Object x5 = M.x();
            if (y2 || x5 == c0012a) {
                qc3 qc3Var = new qc3(uw20Var2, gzsVar, xx20Var, layoutDirection, 1);
                M.R(qc3Var);
                x5 = qc3Var;
            }
            bap.i((gzs) x5, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.vhx
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    nix.c(gzs.this, xx20Var, if2Var, jaiVar, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final long j, final gzs<s3q0> gzsVar, final boolean z, final gzs<Boolean> gzsVar2, androidx.compose.runtime.a aVar, final int i) {
        q630 q630Var;
        androidx.compose.runtime.a M = aVar.M(-854338982);
        int i2 = i | (M.p(j) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.y(gzsVar2) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-854338982, i2, -1, "com.vk.core.compose.component.internal.Scrim (InternalModalBottomSheet.kt:520)");
            }
            if (j != 16) {
                M.K(363787905);
                final mtk0 b2 = hg2.b(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new dtp0(0, (huo) null, 7), null, null, M, 48, 28);
                q630.a aVar2 = q630.a.a;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z) {
                    M.K(363958839);
                    boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
                    Object x = M.x();
                    if (z2 || x == c0012a) {
                        x = new a(gzsVar2, gzsVar);
                        M.R(x);
                    }
                    q630 b3 = skn0.b(aVar2, gzsVar, (PointerInputEventHandler) x);
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        x2 = new xsq(10);
                        M.R(x2);
                    }
                    q630Var = egi0.a(b3, (izs) x2);
                    M.j();
                } else {
                    M.K(364289640);
                    M.j();
                    q630Var = aVar2;
                }
                q630 g = txj0.d(aVar2, 1.0f).g(q630Var);
                boolean J = M.J(b2) | ((i2 & 14) == 4);
                Object x3 = M.x();
                if (J || x3 == c0012a) {
                    x3 = new izs() { // from class: xsna.xhx
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            oio.P((oio) obj, j, 0L, 0L, ((Number) b2.getValue()).floatValue(), null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                            return s3q0.a;
                        }
                    };
                    M.R(x3);
                }
                xa4.i(0, M, (izs) x3, g);
            } else {
                M.K(343068776);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, gzsVar, z, gzsVar2, i) { // from class: xsna.aix
                public final /* synthetic */ long b;
                public final /* synthetic */ gzs c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ gzs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    nix.d(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final fw20 fw20Var, final q630 q630Var, final q630 q630Var2, final wzs wzsVar, final wzs wzsVar2, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(254829582);
        int i2 = i | (M.J(fw20Var) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.J(q630Var2) ? 2048 : 1024) | (M.y(wzsVar) ? 16384 : 8192) | (M.y(wzsVar2) ? 131072 : 65536) | (M.y(jaiVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(254829582, i2, -1, "com.vk.core.compose.component.internal.SheetSurface (InternalModalBottomSheet.kt:234)");
            }
            M.K(78164732);
            xx20 xx20Var = fw20Var.g;
            fdj0 fdj0Var = fw20Var.e;
            q630 f = txj0.f(txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, xx20Var.i, 1, q630Var), 1.0f);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new bhh(fw20Var, 28);
                M.R(x);
            }
            q630 a2 = rdu.a(f, (izs) x);
            dt1.a.getClass();
            q630 b2 = ra8.a.b(a2, dt1.a.c);
            boolean J = M.J(fdj0Var);
            Object x2 = M.x();
            if (J || x2 == obj) {
                idj0 idj0Var = new idj0(fdj0Var, fw20Var.d, Orientation.Vertical);
                M.R(idj0Var);
                x2 = idj0Var;
            }
            q630 t = n34.t(b2, (d160) x2, null);
            e12<SheetValue> e12Var = fdj0Var.b;
            Orientation orientation = Orientation.Vertical;
            boolean z2 = i3 == 32;
            Object x3 = M.x();
            if (z2 || x3 == obj) {
                x3 = new bh5(fw20Var, 6);
                M.R(x3);
            }
            q630 g = t.g(new xgo(e12Var, (wzs) x3, orientation));
            a12 a12Var = fdj0Var.b.e;
            boolean z3 = xx20Var.d && fdj0Var.c();
            boolean z4 = ((zak0) fdj0Var.b.k).getValue() != null;
            boolean z5 = i3 == 32;
            Object x4 = M.x();
            if (z5 || x4 == obj) {
                x4 = new oix(fw20Var, null);
                M.R(x4);
            }
            q630 D = s200.D(fho.a(g, a12Var, orientation, z3, null, z4, (yzs) x4, false, 168), xx20Var.j);
            wzs<androidx.compose.runtime.a, Integer, zpx0> wzsVar3 = xx20Var.l;
            if (wzsVar3 != null) {
                q630 g2 = D.g(tci.y(q630.a.a, wzsVar3.invoke(M, 0)));
                if (g2 != null) {
                    q630Var3 = g2;
                    M.j();
                    aVar2 = M;
                    uov0.a(q630Var3, fw20Var.f, xx20Var.e, xx20Var.f, null, xx20Var.g, kai.c(-1554549529, new bix(fw20Var, q630Var2, wzsVar, wzsVar2, jaiVar, 0), M), aVar2, 1572864, 16);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            q630Var3 = D;
            M.j();
            aVar2 = M;
            uov0.a(q630Var3, fw20Var.f, xx20Var.e, xx20Var.f, null, xx20Var.g, kai.c(-1554549529, new bix(fw20Var, q630Var2, wzsVar, wzsVar2, jaiVar, 0), M), aVar2, 1572864, 16);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(q630Var, q630Var2, wzsVar, wzsVar2, jaiVar, i) { // from class: xsna.cix
                public final /* synthetic */ q630 c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ wzs e;
                public final /* synthetic */ wzs f;
                public final /* synthetic */ jai g;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(7);
                    nix.e(fw20.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(fw20 fw20Var, q630 q630Var, wzs wzsVar, wzs wzsVar2, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1054692621);
        int i2 = i | (M.J(fw20Var) ? 4 : 2) | (M.J(q630Var) ? 32 : 16) | (M.y(wzsVar) ? 256 : 128) | (M.y(wzsVar2) ? 2048 : 1024) | (M.y(jaiVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1054692621, i2, -1, "com.vk.core.compose.component.internal.SheetSurfaceContent (InternalModalBottomSheet.kt:297)");
            }
            jai c2 = kai.c(391725546, new whx(q630Var, fw20Var, wzsVar, jaiVar), M);
            if (wzsVar2 == null) {
                M.K(-1631402216);
                c2.invoke(M, 6);
                M.j();
            } else {
                M.K(-1631363621);
                q630.a aVar2 = q630.a.a;
                q630 f = txj0.f(aVar2, 1.0f);
                dt1.a.getClass();
                ty6 ty6Var = dt1.a.b;
                cp10 d2 = ja8.d(ty6Var, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c3 = qri.c(M, f);
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
                cri.a.c cVar = cri.a.f;
                k9q0.w(M, d2, cVar);
                cri.a.e eVar = cri.a.e;
                k9q0.w(M, D, eVar);
                Integer valueOf = Integer.valueOf(hashCode);
                cri.a.b bVar = cri.a.g;
                k9q0.w(M, valueOf, bVar);
                cri.a.C2678a c2678a = cri.a.h;
                k9q0.t(M, c2678a);
                cri.a.d dVar = cri.a.d;
                k9q0.w(M, c3, dVar);
                c2.invoke(M, 6);
                q630 b2 = ra8.a.b(aVar2, dt1.a.i);
                cp10 d3 = ja8.d(ty6Var, false);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c4 = qri.c(M, b2);
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
                k9q0.w(M, d3, cVar);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar, M, c2678a);
                k9q0.w(M, c4, dVar);
                wzsVar2.invoke(M, Integer.valueOf((i2 >> 9) & 14));
                M.G();
                M.G();
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
            s.d = new jy7(fw20Var, q630Var, wzsVar, wzsVar2, jaiVar, i);
        }
    }

    public static final float g(tdu tduVar, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (tduVar.d() >> 32));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 1.0f;
        }
        return 1.0f - ((((Math.min(tduVar.I0(a), intBitsToFloat) - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / intBitsToFloat);
    }

    public static final float h(tdu tduVar, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (tduVar.d() & 4294967295L));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 1.0f;
        }
        return 1.0f - ((((Math.min(tduVar.I0(b), intBitsToFloat) - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / intBitsToFloat);
    }
}
