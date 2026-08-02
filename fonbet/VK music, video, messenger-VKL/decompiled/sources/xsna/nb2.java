package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import xsna.cri;
import xsna.q630;
import xsna.tra0;
import xsna.tuw;

/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes11.dex */
public final class nb2 {
    public static final pqo a = new pqo(b.i);
    public static final pqo b = new pqo(a.i);

    /* compiled from: AndroidPopup.android.kt */
    public static final class a extends Lambda implements gzs<Boolean> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    public static final class b extends Lambda implements gzs<String> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    public static final class c extends Lambda implements izs<lgn, kgn> {
        final /* synthetic */ LayoutDirection $layoutDirection;
        final /* synthetic */ gzs<s3q0> $onDismissRequest;
        final /* synthetic */ owb0 $popupLayout;
        final /* synthetic */ gxb0 $properties;
        final /* synthetic */ String $testTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(owb0 owb0Var, gzs<s3q0> gzsVar, gxb0 gxb0Var, String str, LayoutDirection layoutDirection) {
            super(1);
            this.$popupLayout = owb0Var;
            this.$onDismissRequest = gzsVar;
            this.$properties = gxb0Var;
            this.$testTag = str;
            this.$layoutDirection = layoutDirection;
        }

        @Override // xsna.izs
        public final kgn invoke(lgn lgnVar) {
            owb0 owb0Var = this.$popupLayout;
            owb0Var.r.addView(owb0Var, owb0Var.s);
            this.$popupLayout.B(this.$onDismissRequest, this.$properties, this.$testTag, this.$layoutDirection);
            return new ob2(this.$popupLayout);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    public static final class d extends Lambda implements gzs<s3q0> {
        final /* synthetic */ LayoutDirection $layoutDirection;
        final /* synthetic */ gzs<s3q0> $onDismissRequest;
        final /* synthetic */ owb0 $popupLayout;
        final /* synthetic */ gxb0 $properties;
        final /* synthetic */ String $testTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(owb0 owb0Var, gzs<s3q0> gzsVar, gxb0 gxb0Var, String str, LayoutDirection layoutDirection) {
            super(0);
            this.$popupLayout = owb0Var;
            this.$onDismissRequest = gzsVar;
            this.$properties = gxb0Var;
            this.$testTag = str;
            this.$layoutDirection = layoutDirection;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.$popupLayout.B(this.$onDismissRequest, this.$properties, this.$testTag, this.$layoutDirection);
            return s3q0.a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    public static final class e extends Lambda implements izs<lgn, kgn> {
        final /* synthetic */ owb0 $popupLayout;
        final /* synthetic */ fxb0 $popupPositionProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(owb0 owb0Var, fxb0 fxb0Var) {
            super(1);
            this.$popupLayout = owb0Var;
            this.$popupPositionProvider = fxb0Var;
        }

        @Override // xsna.izs
        public final kgn invoke(lgn lgnVar) {
            this.$popupLayout.setPositionProvider(this.$popupPositionProvider);
            this.$popupLayout.E();
            return new pb2();
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @b6l(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", l = {496}, m = "invokeSuspend", v = 1)
    public static final class f extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ owb0 $popupLayout;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: AndroidPopup.android.kt */
        public static final class a extends Lambda implements izs<Long, s3q0> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final /* bridge */ /* synthetic */ s3q0 invoke(Long l) {
                l.longValue();
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(owb0 owb0Var, spj<? super f> spjVar) {
            super(2, spjVar);
            this.$popupLayout = owb0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            f fVar = new f(this.$popupLayout, spjVar);
            fVar.L$0 = obj;
            return fVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
        
            if (r9.r() == r0) goto L16;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0060  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yvjVar = (yvj) this.L$0;
                if (zvj.f(yvjVar)) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yvjVar = (yvj) this.L$0;
                kotlin.a.a(obj);
                owb0 owb0Var = this.$popupLayout;
                int[] iArr = owb0Var.E;
                if (owb0Var.isAttachedToWindow()) {
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    owb0Var.o.getLocationOnScreen(iArr);
                    if (i2 != iArr[0] || i3 != iArr[1]) {
                        owb0Var.C();
                    }
                }
                if (zvj.f(yvjVar)) {
                    this.L$0 = yvjVar;
                    this.label = 1;
                    tuw tuwVar = (tuw) getContext().get(tuw.a.b);
                    a aVar = a.i;
                    if (tuwVar != null) {
                        new uuw(aVar, null);
                    } else if (i830.a(getContext()).k(aVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    owb0 owb0Var2 = this.$popupLayout;
                    int[] iArr2 = owb0Var2.E;
                    if (owb0Var2.isAttachedToWindow()) {
                    }
                    if (zvj.f(yvjVar)) {
                        return s3q0.a;
                    }
                }
            }
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    public static final class g extends Lambda implements izs<tny, s3q0> {
        final /* synthetic */ owb0 $popupLayout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(owb0 owb0Var) {
            super(1);
            this.$popupLayout = owb0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(tny tnyVar) {
            this.$popupLayout.D(tnyVar.y());
            return s3q0.a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    public static final class h implements cp10 {
        public final /* synthetic */ owb0 a;
        public final /* synthetic */ LayoutDirection b;

        /* compiled from: AndroidPopup.android.kt */
        public static final class a extends Lambda implements izs<tra0.a, s3q0> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final /* bridge */ /* synthetic */ s3q0 invoke(tra0.a aVar) {
                return s3q0.a;
            }
        }

        public h(owb0 owb0Var, LayoutDirection layoutDirection) {
            this.a = owb0Var;
            this.b = layoutDirection;
        }

        @Override // xsna.cp10
        public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
            this.a.setParentLayoutDirection(this.b);
            return ep10Var.Q(0, 0, jgp.b, a.i);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    public static final class i extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ gzs<s3q0> $onDismissRequest;
        final /* synthetic */ fxb0 $popupPositionProvider;
        final /* synthetic */ gxb0 $properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(fxb0 fxb0Var, gzs<s3q0> gzsVar, gxb0 gxb0Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, int i, int i2) {
            super(2);
            this.$popupPositionProvider = fxb0Var;
            this.$onDismissRequest = gzsVar;
            this.$properties = gxb0Var;
            this.$content = wzsVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            nb2.a(this.$popupPositionProvider, this.$onDismissRequest, this.$properties, this.$content, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    public static final class j extends Lambda implements gzs<UUID> {
        public static final j i = new j(0);

        @Override // xsna.gzs
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    public static final class k extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ mtk0<wzs<androidx.compose.runtime.a, Integer, s3q0>> $currentContent$delegate;
        final /* synthetic */ owb0 $this_apply;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(owb0 owb0Var, wh50 wh50Var) {
            super(2);
            this.$this_apply = owb0Var;
            this.$currentContent$delegate = wh50Var;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-297523940, intValue, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:440)");
                }
                rvi.a(nb2.b.b(Boolean.TRUE), kai.c(1022273628, new sb2(this.$this_apply, this.$currentContent$delegate), aVar2), aVar2, 56);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Throwable, xsna.spj] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(fxb0 fxb0Var, gzs<s3q0> gzsVar, gxb0 gxb0Var, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar, androidx.compose.runtime.a aVar, int i2, int i3) {
        int i4;
        gzs<s3q0> gzsVar2;
        int i5;
        gxb0 gxb0Var2;
        int i6;
        gzs<s3q0> gzsVar3;
        gxb0 gxb0Var3;
        androidx.compose.runtime.f s;
        boolean z;
        String str;
        ?? r9;
        LayoutDirection layoutDirection;
        fxb0 fxb0Var2 = fxb0Var;
        androidx.compose.runtime.a M = aVar.M(-1772091631);
        if ((i2 & 6) == 0) {
            i4 = (M.J(fxb0Var2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            gzsVar2 = gzsVar;
            i4 |= M.y(gzsVar2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                gxb0Var2 = gxb0Var;
                i4 |= M.J(gxb0Var2) ? 256 : 128;
                if ((i2 & 3072) == 0) {
                    i4 |= M.y(wzsVar) ? 2048 : 1024;
                }
                i6 = i4;
                if (M.t(i6 & 1, (i6 & 1171) != 1170)) {
                    gzs<s3q0> gzsVar4 = i7 != 0 ? null : gzsVar2;
                    gxb0 gxb0Var4 = i5 != 0 ? new gxb0(false, false, 31) : gxb0Var2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1772091631, i6, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:417)");
                    }
                    View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
                    azl azlVar = (azl) M.r(uvi.h);
                    String str2 = (String) M.r(a);
                    LayoutDirection layoutDirection2 = (LayoutDirection) M.r(uvi.n);
                    cvi z2 = n34.z(M);
                    wh50 c2 = androidx.compose.runtime.k.c(wzsVar, M, (i6 >> 9) & 14);
                    Object[] objArr = new Object[0];
                    Object x = M.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = j.i;
                        M.R(x);
                    }
                    UUID uuid = (UUID) crx0.A(objArr, (gzs) x, M, 48);
                    boolean booleanValue = ((Boolean) M.r(b)).booleanValue();
                    Object x2 = M.x();
                    if (x2 == c0012a) {
                        str = str2;
                        r9 = 0;
                        owb0 owb0Var = new owb0(gzsVar4, gxb0Var4, str, view, azlVar, fxb0Var2, uuid, booleanValue);
                        fxb0Var2 = fxb0Var2;
                        z = true;
                        owb0Var.A(z2, new jai(-297523940, new k(owb0Var, c2), true));
                        M.R(owb0Var);
                        x2 = owb0Var;
                    } else {
                        z = true;
                        str = str2;
                        r9 = 0;
                    }
                    owb0 owb0Var2 = (owb0) x2;
                    int i8 = i6 & 112;
                    int i9 = i6 & 896;
                    boolean y = M.y(owb0Var2) | (i8 == 32 ? z : false) | (i9 == 256 ? z : false) | M.J(str) | M.o(layoutDirection2.ordinal());
                    Object x3 = M.x();
                    if (y || x3 == c0012a) {
                        x3 = new c(owb0Var2, gzsVar4, gxb0Var4, str, layoutDirection2);
                        M.R(x3);
                    }
                    bap.c(owb0Var2, (izs) x3, M, 0);
                    boolean y2 = M.y(owb0Var2) | (i8 == 32 ? z : false) | (i9 == 256 ? z : false) | M.J(str) | M.o(layoutDirection2.ordinal());
                    Object x4 = M.x();
                    if (y2 || x4 == c0012a) {
                        x4 = new d(owb0Var2, gzsVar4, gxb0Var4, str, layoutDirection2);
                        layoutDirection = layoutDirection2;
                        M.R(x4);
                    } else {
                        layoutDirection = layoutDirection2;
                    }
                    bap.i((gzs) x4, M, 0);
                    int i10 = i6 & 14;
                    boolean y3 = M.y(owb0Var2) | (i10 == 4 ? z : false);
                    Object x5 = M.x();
                    if (y3 || x5 == c0012a) {
                        x5 = new e(owb0Var2, fxb0Var2);
                        M.R(x5);
                    }
                    bap.c(fxb0Var2, (izs) x5, M, i10);
                    boolean y4 = M.y(owb0Var2);
                    Object x6 = M.x();
                    if (y4 || x6 == c0012a) {
                        x6 = new f(owb0Var2, r9);
                        M.R(x6);
                    }
                    bap.g(owb0Var2, (wzs) x6, M, 0);
                    boolean y5 = M.y(owb0Var2);
                    Object x7 = M.x();
                    if (y5 || x7 == c0012a) {
                        x7 = new g(owb0Var2);
                        M.R(x7);
                    }
                    q630 o = egi.o(q630.a.a, (izs) x7);
                    boolean y6 = M.y(owb0Var2) | M.o(layoutDirection.ordinal());
                    Object x8 = M.x();
                    if (y6 || x8 == c0012a) {
                        x8 = new h(owb0Var2, layoutDirection);
                        M.R(x8);
                    }
                    cp10 cp10Var = (cp10) x8;
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c3 = qri.c(M, o);
                    cri.h7.getClass();
                    LayoutNode.a aVar2 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw r9;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar2);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, cp10Var, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c3, cri.a.d);
                    M.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    gzsVar3 = gzsVar4;
                    gxb0Var3 = gxb0Var4;
                } else {
                    M.h();
                    gzsVar3 = gzsVar2;
                    gxb0Var3 = gxb0Var2;
                }
                s = M.s();
                if (s != null) {
                    s.d = new i(fxb0Var2, gzsVar3, gxb0Var3, wzsVar, i2, i3);
                    return;
                }
                return;
            }
            gxb0Var2 = gxb0Var;
            if ((i2 & 3072) == 0) {
            }
            i6 = i4;
            if (M.t(i6 & 1, (i6 & 1171) != 1170)) {
            }
            s = M.s();
            if (s != null) {
            }
        }
        gzsVar2 = gzsVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        gxb0Var2 = gxb0Var;
        if ((i2 & 3072) == 0) {
        }
        i6 = i4;
        if (M.t(i6 & 1, (i6 & 1171) != 1170)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
