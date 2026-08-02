package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.uxe0;

/* compiled from: RatingBar.kt */
/* loaded from: classes17.dex */
public final class rxe0 {

    /* compiled from: RatingBar.kt */
    @b6l(c = "com.vk.core.compose.extracomponents.rating.RatingBarKt$VkDynamicRatingBar$2$1", f = "RatingBar.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Integer> $currentRating$delegate;
        final /* synthetic */ int $rating;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, wh50<Integer> wh50Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$rating = i;
            this.$currentRating$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$rating, this.$currentRating$delegate, spjVar);
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
            this.$currentRating$delegate.setValue(Integer.valueOf(this.$rating));
            return s3q0.a;
        }
    }

    /* compiled from: RatingBar.kt */
    public static final class b implements PointerInputEventHandler {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ wh50<Boolean> b;
        public final /* synthetic */ izs<Integer, s3q0> c;
        public final /* synthetic */ wh50<Integer> d;
        public final /* synthetic */ uxe0 e;

        public b(izs izsVar, wh50 wh50Var, wh50 wh50Var2, uxe0 uxe0Var, boolean z) {
            this.a = z;
            this.b = wh50Var;
            this.c = izsVar;
            this.d = wh50Var2;
            this.e = uxe0Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            if (!this.a) {
                return s3q0.a;
            }
            wh50<Boolean> wh50Var = this.b;
            fv90 fv90Var = new fv90(wh50Var, 16);
            izs<Integer, s3q0> izsVar = this.c;
            wh50<Integer> wh50Var2 = this.d;
            y68 y68Var = new y68(izsVar, wh50Var, wh50Var2, 1);
            mt mtVar = new mt(dmb0Var, this.e, wh50Var2, 9);
            la0 la0Var = new la0(10);
            float f = lgo.a;
            Object c = d7s.c(dmb0Var, new hgo(null, y68Var, la0Var, fv90Var, mtVar), spjVar);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (c != coroutineSingletons) {
                c = s3q0.a;
            }
            return c == coroutineSingletons ? c : s3q0.a;
        }
    }

    /* compiled from: RatingBar.kt */
    public static final class c implements PointerInputEventHandler {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ uxe0 b;
        public final /* synthetic */ izs<Integer, s3q0> c;
        public final /* synthetic */ wh50<Boolean> d;
        public final /* synthetic */ wh50<Integer> e;

        public c(izs izsVar, wh50 wh50Var, wh50 wh50Var2, uxe0 uxe0Var, boolean z) {
            this.a = z;
            this.b = uxe0Var;
            this.c = izsVar;
            this.d = wh50Var;
            this.e = wh50Var2;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            if (!this.a) {
                return s3q0.a;
            }
            Object e = z2o0.e(dmb0Var, null, null, new i6g(dmb0Var, this.b, this.c, this.d, this.e, 1), spjVar, 7);
            return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
        }
    }

    /* compiled from: Effects.kt */
    public static final class d implements kgn {
        public final /* synthetic */ AccessibilityManager a;
        public final /* synthetic */ mxe0 b;

        public d(AccessibilityManager accessibilityManager, mxe0 mxe0Var) {
            this.a = accessibilityManager;
            this.b = mxe0Var;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.removeAccessibilityStateChangeListener(this.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final int i, final lg90 lg90Var, final izs<? super Integer, s3q0> izsVar, q630 q630Var, boolean z, uxe0 uxe0Var, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        int i5;
        boolean z2;
        uxe0 uxe0Var2;
        final q630 q630Var3;
        final boolean z3;
        final uxe0 uxe0Var3;
        androidx.compose.runtime.f s;
        q630 q630Var4;
        boolean z4;
        uxe0 a2;
        Object x;
        a.C0011a.C0012a c0012a;
        wh50 wh50Var;
        Object x2;
        Object x3;
        Object x4;
        wh50 wh50Var2;
        boolean y;
        Object x5;
        boolean z5;
        boolean z6;
        Object x6;
        Object x7;
        Object x8;
        boolean J;
        Object x9;
        wh50 wh50Var3;
        int i6;
        int i7;
        boolean z7;
        Object x10;
        wh50 wh50Var4;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z8;
        boolean z9;
        boolean z10;
        Object x11;
        boolean z11;
        Object x12;
        int i12;
        androidx.compose.runtime.a M = aVar.M(-1735033025);
        if ((i2 & 6) == 0) {
            i4 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= M.y(izsVar) ? 256 : 128;
        }
        int i13 = i3 & 8;
        if (i13 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                z2 = z;
                i4 |= M.l(z2) ? 16384 : 8192;
                if ((i2 & 196608) == 0) {
                    if ((i3 & 32) == 0) {
                        uxe0Var2 = uxe0Var;
                        if (M.J(uxe0Var2)) {
                            i12 = 131072;
                            i4 |= i12;
                        }
                    } else {
                        uxe0Var2 = uxe0Var;
                    }
                    i12 = 65536;
                    i4 |= i12;
                } else {
                    uxe0Var2 = uxe0Var;
                }
                if (M.t(i4 & 1, (i4 & 74899) != 74898)) {
                    M.V();
                    if ((i2 & 1) == 0 || M.i()) {
                        if (i13 != 0) {
                            q630Var2 = q630.a.a;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            q630Var4 = q630Var2;
                            z4 = z2;
                            a2 = uxe0.a.a(M);
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1735033025, i4, -1, "com.vk.core.compose.extracomponents.rating.VkDynamicRatingBar (RatingBar.kt:122)");
                            }
                            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
                            x = M.x();
                            c0012a = a.C0011a.a;
                            if (x == c0012a) {
                                x = qq.h(i, M);
                            }
                            wh50Var = (wh50) x;
                            x2 = M.x();
                            if (x2 == c0012a) {
                                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                                M.R(x2);
                            }
                            wh50 wh50Var5 = (wh50) x2;
                            x3 = M.x();
                            if (x3 == c0012a) {
                                x3 = new w9x();
                                M.R(x3);
                            }
                            final w9x w9xVar = (w9x) x3;
                            String N = d370.N(R.string.vk_dynamic_rating_view_state_content_description, 0, M);
                            String N2 = d370.N(R.string.vk_rating_view_content_description_accessibility, 0, M);
                            float f = (4 * a2.c) + (a2.a * 5);
                            x4 = M.x();
                            if (x4 == c0012a) {
                                x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                                M.R(x4);
                            }
                            wh50Var2 = (wh50) x4;
                            s3q0 s3q0Var = s3q0.a;
                            y = M.y(context);
                            x5 = M.x();
                            if (!y || x5 == c0012a) {
                                z5 = z4;
                                x5 = new r770(4, context, wh50Var2);
                                M.R(x5);
                            } else {
                                z5 = z4;
                            }
                            bap.c(s3q0Var, (izs) x5, M, 6);
                            Integer valueOf = Integer.valueOf(i);
                            int i14 = i4 & 14;
                            z6 = i14 != 4;
                            x6 = M.x();
                            if (!z6 || x6 == c0012a) {
                                x6 = new a(i, wh50Var, null);
                                M.R(x6);
                            }
                            bap.g(valueOf, (wzs) x6, M, i14);
                            q630 h = txj0.h(txj0.v(q630Var4, f), a2.a);
                            x7 = M.x();
                            if (x7 == c0012a) {
                                x7 = new zos(24);
                                M.R(x7);
                            }
                            q630 a3 = rdu.a(h, (izs) x7);
                            x8 = M.x();
                            if (x8 == c0012a) {
                                x8 = new z410(17);
                                M.R(x8);
                            }
                            q630 b2 = egi0.b(a3, true, (izs) x8);
                            J = M.J(N2) | M.J(N);
                            x9 = M.x();
                            if (!J || x9 == c0012a) {
                                wh50Var3 = wh50Var;
                                x9 = new jsg(N2, N, wh50Var5, wh50Var3, 4);
                                M.R(x9);
                            } else {
                                wh50Var3 = wh50Var;
                            }
                            q630 a4 = egi0.a(b2, (izs) x9);
                            Boolean valueOf2 = Boolean.valueOf(z5);
                            int i15 = 57344 & i4;
                            i6 = i4 & 896;
                            i7 = (458752 & i4) ^ 196608;
                            z7 = ((i7 <= 131072 && M.J(a2)) || (i4 & 196608) == 131072) | (i15 != 16384) | (i6 != 256);
                            x10 = M.x();
                            if (!z7 || x10 == c0012a) {
                                wh50Var4 = wh50Var2;
                                i8 = i4;
                                i9 = i6;
                                i10 = i7;
                                i11 = 16384;
                                z8 = true;
                                z9 = z5;
                                b bVar = new b(izsVar, wh50Var5, wh50Var3, a2, z9);
                                M.R(bVar);
                                x10 = bVar;
                            } else {
                                wh50Var4 = wh50Var2;
                                i8 = i4;
                                i9 = i6;
                                i10 = i7;
                                i11 = 16384;
                                z8 = true;
                                z9 = z5;
                            }
                            q630 b3 = skn0.b(a4, valueOf2, (PointerInputEventHandler) x10);
                            Boolean valueOf3 = Boolean.valueOf(z9);
                            z10 = (((i10 > 131072 || !M.J(a2)) && (i8 & 196608) != 131072) ? false : z8) | (i15 != i11 ? z8 : false) | (i9 != 256 ? z8 : false);
                            x11 = M.x();
                            if (!z10 || x11 == c0012a) {
                                x11 = new c(izsVar, wh50Var4, wh50Var3, a2, z9);
                                M.R(x11);
                            }
                            q630 b4 = skn0.b(b3, valueOf3, (PointerInputEventHandler) x11);
                            z11 = (((i10 > 131072 || !M.J(a2)) && (i8 & 196608) != 131072) ? false : z8) | (((i8 & 112) != 32 || ((i8 & 64) != 0 && M.y(lg90Var))) ? z8 : false) | (i15 != i11 ? z8 : false);
                            x12 = M.x();
                            if (!z11 || x12 == c0012a) {
                                final uxe0 uxe0Var4 = a2;
                                final boolean z12 = z9;
                                final wh50 wh50Var6 = wh50Var3;
                                izs izsVar2 = new izs() { // from class: xsna.qxe0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj) {
                                        rxe0.e((oio) obj, ((Number) wh50Var6.getValue()).intValue(), lg90.this, uxe0Var4, w9xVar, z12);
                                        return s3q0.a;
                                    }
                                };
                                M.R(izsVar2);
                                x12 = izsVar2;
                            }
                            xa4.i(0, M, (izs) x12, b4);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var3 = q630Var4;
                            uxe0Var3 = a2;
                            z3 = z9;
                        }
                    } else {
                        M.h();
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                    }
                    uxe0 uxe0Var5 = uxe0Var2;
                    z4 = z2;
                    a2 = uxe0Var5;
                    q630Var4 = q630Var2;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    Context context2 = (Context) M.r(AndroidCompositionLocals_androidKt.b);
                    x = M.x();
                    c0012a = a.C0011a.a;
                    if (x == c0012a) {
                    }
                    wh50Var = (wh50) x;
                    x2 = M.x();
                    if (x2 == c0012a) {
                    }
                    wh50 wh50Var52 = (wh50) x2;
                    x3 = M.x();
                    if (x3 == c0012a) {
                    }
                    final w9x w9xVar2 = (w9x) x3;
                    String N3 = d370.N(R.string.vk_dynamic_rating_view_state_content_description, 0, M);
                    String N22 = d370.N(R.string.vk_rating_view_content_description_accessibility, 0, M);
                    float f2 = (4 * a2.c) + (a2.a * 5);
                    x4 = M.x();
                    if (x4 == c0012a) {
                    }
                    wh50Var2 = (wh50) x4;
                    s3q0 s3q0Var2 = s3q0.a;
                    y = M.y(context2);
                    x5 = M.x();
                    if (y) {
                    }
                    z5 = z4;
                    x5 = new r770(4, context2, wh50Var2);
                    M.R(x5);
                    bap.c(s3q0Var2, (izs) x5, M, 6);
                    Integer valueOf4 = Integer.valueOf(i);
                    int i142 = i4 & 14;
                    if (i142 != 4) {
                    }
                    x6 = M.x();
                    if (!z6) {
                    }
                    x6 = new a(i, wh50Var, null);
                    M.R(x6);
                    bap.g(valueOf4, (wzs) x6, M, i142);
                    q630 h2 = txj0.h(txj0.v(q630Var4, f2), a2.a);
                    x7 = M.x();
                    if (x7 == c0012a) {
                    }
                    q630 a32 = rdu.a(h2, (izs) x7);
                    x8 = M.x();
                    if (x8 == c0012a) {
                    }
                    q630 b22 = egi0.b(a32, true, (izs) x8);
                    J = M.J(N22) | M.J(N3);
                    x9 = M.x();
                    if (J) {
                    }
                    wh50Var3 = wh50Var;
                    x9 = new jsg(N22, N3, wh50Var52, wh50Var3, 4);
                    M.R(x9);
                    q630 a42 = egi0.a(b22, (izs) x9);
                    Boolean valueOf22 = Boolean.valueOf(z5);
                    int i152 = 57344 & i4;
                    i6 = i4 & 896;
                    i7 = (458752 & i4) ^ 196608;
                    z7 = ((i7 <= 131072 && M.J(a2)) || (i4 & 196608) == 131072) | (i152 != 16384) | (i6 != 256);
                    x10 = M.x();
                    if (z7) {
                    }
                    wh50Var4 = wh50Var2;
                    i8 = i4;
                    i9 = i6;
                    i10 = i7;
                    i11 = 16384;
                    z8 = true;
                    z9 = z5;
                    b bVar2 = new b(izsVar, wh50Var52, wh50Var3, a2, z9);
                    M.R(bVar2);
                    x10 = bVar2;
                    q630 b32 = skn0.b(a42, valueOf22, (PointerInputEventHandler) x10);
                    Boolean valueOf32 = Boolean.valueOf(z9);
                    if (i152 != i11) {
                    }
                    z10 = (((i10 > 131072 || !M.J(a2)) && (i8 & 196608) != 131072) ? false : z8) | (i152 != i11 ? z8 : false) | (i9 != 256 ? z8 : false);
                    x11 = M.x();
                    if (!z10) {
                    }
                    x11 = new c(izsVar, wh50Var4, wh50Var3, a2, z9);
                    M.R(x11);
                    q630 b42 = skn0.b(b32, valueOf32, (PointerInputEventHandler) x11);
                    if ((i8 & 112) != 32) {
                    }
                    z11 = (((i10 > 131072 || !M.J(a2)) && (i8 & 196608) != 131072) ? false : z8) | (((i8 & 112) != 32 || ((i8 & 64) != 0 && M.y(lg90Var))) ? z8 : false) | (i152 != i11 ? z8 : false);
                    x12 = M.x();
                    if (!z11) {
                    }
                    final uxe0 uxe0Var42 = a2;
                    final boolean z122 = z9;
                    final wh50 wh50Var62 = wh50Var3;
                    izs izsVar22 = new izs() { // from class: xsna.qxe0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            rxe0.e((oio) obj, ((Number) wh50Var62.getValue()).intValue(), lg90.this, uxe0Var42, w9xVar2, z122);
                            return s3q0.a;
                        }
                    };
                    M.R(izsVar22);
                    x12 = izsVar22;
                    xa4.i(0, M, (izs) x12, b42);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630Var3 = q630Var4;
                    uxe0Var3 = a2;
                    z3 = z9;
                } else {
                    M.h();
                    q630Var3 = q630Var2;
                    z3 = z2;
                    uxe0Var3 = uxe0Var2;
                }
                s = M.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.nxe0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            rxe0.a(i, lg90Var, izsVar, q630Var3, z3, uxe0Var3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            z2 = z;
            if ((i2 & 196608) == 0) {
            }
            if (M.t(i4 & 1, (i4 & 74899) != 74898)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        z2 = z;
        if ((i2 & 196608) == 0) {
        }
        if (M.t(i4 & 1, (i4 & 74899) != 74898)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    public static final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1528376483);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1528376483, i2, -1, "com.vk.core.compose.extracomponents.rating.VkSkeletonRatingBar (RatingBar.kt:280)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(6);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c2 = qri.c(M, aVar2);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            M.K(1188050319);
            for (int i3 = 0; i3 < 5; i3++) {
                q630 D2 = s200.D(txj0.q(aVar2, 28), 4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                ja8.a(hr80.m(D2, ylu0Var.c().a, vog0.a), M, 0);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wa5(q630Var, i, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final float f, final lg90 lg90Var, q630 q630Var, boolean z, final uxe0 uxe0Var, b920 b920Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        final boolean z3;
        final b920 b920Var2;
        androidx.compose.runtime.f s;
        q630 q630Var4;
        final b920 b920Var3;
        final boolean z4;
        float f2 = uxe0Var.a;
        androidx.compose.runtime.a M = aVar.M(352953112);
        if ((i & 6) == 0) {
            i3 = (M.n(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i3 | (M.y(lg90Var) ? 32 : 16);
        int i8 = i2 & 4;
        if (i8 != 0) {
            i7 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i7 |= M.J(q630Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i5 = i7 | 3072;
                z2 = z;
            } else {
                z2 = z;
                i5 = i7 | (M.l(z2) ? 2048 : 1024);
            }
            i6 = i5 | (!M.J(uxe0Var) ? 16384 : 8192) | 196608;
            if (M.t(i6 & 1, (74899 & i6) == 74898)) {
                M.h();
                aVar2 = M;
                q630Var3 = q630Var2;
                z3 = z2;
                b920Var2 = b920Var;
            } else {
                M.V();
                int i9 = i & 1;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (i9 == 0 || M.i()) {
                    q630Var4 = i8 != 0 ? q630.a.a : q630Var2;
                    if (i4 != 0) {
                        z2 = true;
                    }
                    Object x = M.x();
                    if (x == c0012a) {
                        x = new pt3();
                        M.R(x);
                    }
                    b920Var3 = (pt3) x;
                } else {
                    M.h();
                    b920Var3 = b920Var;
                    q630Var4 = q630Var2;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(352953112, i6, -1, "com.vk.core.compose.extracomponents.rating.VkStaticRatingBar (RatingBar.kt:74)");
                }
                float f3 = (uxe0Var.c * 4) + (5 * f2);
                String O = d370.O(R.string.vk_static_rating_view_content_description, new Object[]{Float.valueOf(f)}, M);
                q630 v = txj0.v(txj0.h(q630Var4, f2), f3);
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new gky(22);
                    M.R(x2);
                }
                q630 a2 = rdu.a(v, (izs) x2);
                boolean J = M.J(O);
                Object x3 = M.x();
                if (J || x3 == c0012a) {
                    x3 = new r45(O, 3);
                    M.R(x3);
                }
                q630 b2 = egi0.b(a2, false, (izs) x3);
                boolean z5 = ((i6 & 14) == 4) | ((i6 & 112) == 32 || M.y(lg90Var)) | ((((57344 & i6) ^ 24576) > 16384 && M.J(uxe0Var)) || (i6 & 24576) == 16384) | ((i6 & 7168) == 2048);
                Object x4 = M.x();
                if (z5 || x4 == c0012a) {
                    z4 = z2;
                    izs izsVar = new izs() { // from class: xsna.oxe0
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            rxe0.e((oio) obj, f, lg90Var, uxe0Var, b920Var3, z4);
                            return s3q0.a;
                        }
                    };
                    M.R(izsVar);
                    x4 = izsVar;
                } else {
                    z4 = z2;
                }
                xa4.i(0, M, (izs) x4, b2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                q630Var3 = q630Var4;
                b920Var2 = b920Var3;
                z3 = z4;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.pxe0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        rxe0.c(f, lg90Var, q630Var3, z3, uxe0Var, b920Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i6 = i5 | (!M.J(uxe0Var) ? 16384 : 8192) | 196608;
        if (M.t(i6 & 1, (74899 & i6) == 74898)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final int d(float f, float f2, float f3) {
        float f4 = (f3 / 2) + f2;
        float f5 = f2 + f3;
        if (f < f4) {
            return 1;
        }
        if (f > (3 * f5) + f4) {
            return 5;
        }
        return ((int) ((f - f4) / f5)) + 2;
    }

    public static final void e(oio oioVar, float f, lg90 lg90Var, uxe0 uxe0Var, b920 b920Var, boolean z) {
        ColorFilter porterDuffColorFilter;
        oio oioVar2 = oioVar;
        char c2 = ' ';
        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar2.d() >> 32));
        float I0 = oioVar2.I0(uxe0Var.a);
        float I02 = oioVar2.I0(uxe0Var.c);
        float b2 = an10.b(b920Var.e(f, I0, oioVar2.I0(uxe0Var.b), I02));
        int i = 0;
        while (i < 5) {
            float f2 = i;
            float f3 = (f2 * I02) + (I0 * f2);
            oioVar2.a0().a.l(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            try {
                char c3 = c2;
                float f4 = intBitsToFloat;
                long floatToRawIntBits = (Float.floatToRawIntBits(I0) << c3) | (Float.floatToRawIntBits(I0) & 4294967295L);
                long j = l5g.b;
                if (Build.VERSION.SDK_INT >= 29) {
                    se7.b();
                    porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                } else {
                    porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                }
                lg90.h(lg90Var, oioVar2, floatToRawIntBits, new oe7(j, 5, porterDuffColorFilter), 2);
                oioVar.a0().a.l(-f3, -0.0f);
                i++;
                oioVar2 = oioVar;
                c2 = c3;
                intBitsToFloat = f4;
            } catch (Throwable th) {
                oioVar.a0().a.l(-f3, -0.0f);
                throw th;
            }
        }
        char c4 = c2;
        float f5 = intBitsToFloat;
        long j2 = uxe0Var.e;
        oio.P(oioVar, l5g.c(14, j2, l5g.e(j2) * (z ? 1.0f : 0.64f)), 0L, (Float.floatToRawIntBits(b2) << c4) | (Float.floatToRawIntBits(I0) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 5, 56);
        long j3 = uxe0Var.d;
        oio.P(oioVar, l5g.c(14, j3, l5g.e(j3) * (z ? 1.0f : 0.64f)), (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) | (Float.floatToRawIntBits(b2) << c4), (Float.floatToRawIntBits(I0) & 4294967295L) | (Float.floatToRawIntBits(f5 - b2) << c4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 5, 56);
    }
}
