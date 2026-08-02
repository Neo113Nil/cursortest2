package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.q630;

/* compiled from: ButtonScreenContent.kt */
/* loaded from: classes18.dex */
public final class nr8 {

    /* compiled from: ButtonScreenContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[qtp0.values().length];
            try {
                iArr[qtp0.Icon.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qtp0.Loader.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qtp0.Filled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[qtp0.Simple.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[qtp0.SimpleRectangle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[qtp0.SimpleRound.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonStyle.values().length];
            try {
                iArr2[ButtonStyle.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ButtonStyle.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ButtonStyle.Tertiary.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ButtonStyle.Outline.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ButtonStyle.Link.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ButtonSize.values().length];
            try {
                iArr3[ButtonSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ButtonSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ButtonSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ButtonAppearance.values().length];
            try {
                iArr4[ButtonAppearance.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[ButtonAppearance.Positive.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[ButtonAppearance.Negative.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[ButtonAppearance.Neutral.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[ButtonAppearance.Overlay.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(hkr0 hkr0Var, String str, boolean z, rv5 rv5Var, androidx.compose.runtime.a aVar, int i) {
        lg90 lg90Var;
        boolean z2;
        String str2;
        Integer num;
        lg90 d;
        r5j0 x;
        androidx.compose.runtime.a M = aVar.M(-488082208);
        int i2 = i | (M.J(hkr0Var) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.J(rv5Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-488082208, i2, -1, "com.vk.design.demo.presentation.screens.ComposeImplementation (ButtonScreenContent.kt:457)");
            }
            q630 D = s200.D(q630.a.a, 4);
            qtp0 qtp0Var = hkr0Var.a;
            boolean z3 = qtp0Var == qtp0.Filled || qtp0Var == qtp0.Loader;
            boolean z4 = qtp0Var == qtp0.Loader;
            int[] iArr = a.$EnumSwitchMapping$0;
            switch (iArr[qtp0Var.ordinal()]) {
                case 1:
                case 2:
                    lg90Var = null;
                    z2 = z3;
                    str2 = null;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    lg90Var = null;
                    z2 = z3;
                    str2 = str;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            switch (iArr[qtp0Var.ordinal()]) {
                case 1:
                case 2:
                case 4:
                case 5:
                case 6:
                    num = lg90Var;
                    break;
                case 3:
                    num = 99;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            switch (iArr[qtp0Var.ordinal()]) {
                case 1:
                case 3:
                    M.K(-895540724);
                    qzu0.a.getClass();
                    d = qzu0.d(M);
                    M.j();
                    break;
                case 2:
                case 4:
                case 5:
                case 6:
                    M.K(-1992005539);
                    M.j();
                    d = lg90Var;
                    break;
                default:
                    throw alb0.c(-895545213, M);
            }
            switch (iArr[qtp0Var.ordinal()]) {
                case 1:
                case 2:
                case 4:
                case 5:
                case 6:
                    M.K(-1991809123);
                    M.j();
                    break;
                case 3:
                    M.K(-895534735);
                    qzu0.a.getClass();
                    lg90Var = qzu0.L(M);
                    M.j();
                    break;
                default:
                    throw alb0.c(-895539224, M);
            }
            lg90 lg90Var2 = lg90Var;
            switch (iArr[qtp0Var.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    M.K(-895526733);
                    x = hr80.z().x(0, M);
                    M.j();
                    break;
                case 5:
                    M.K(-895531730);
                    M.j();
                    x = androidx.compose.ui.graphics.e.a;
                    break;
                case 6:
                    M.K(-895530357);
                    M.j();
                    x = vog0.a;
                    break;
                default:
                    throw alb0.c(-895533237, M);
            }
            r5j0 r5j0Var = x;
            if (z) {
                M.K(-1991464557);
                dhu0.b(hkr0Var.c, hkr0Var.b, D, r5j0Var, z2, d, str2, num, lg90Var2, M, 1074004352);
                M.j();
            } else {
                M.K(-1991121046);
                String str3 = str2;
                boolean z5 = z2;
                ButtonStyle buttonStyle = hkr0Var.b;
                ButtonSize buttonSize = hkr0Var.c;
                ButtonAppearance buttonAppearance = hkr0Var.d;
                Object x2 = M.x();
                if (x2 == a.C0011a.a) {
                    x2 = new lz2(3);
                    M.R(x2);
                }
                bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, D, r5j0Var, z5, z4, d, null, null, str3, num, lg90Var2, null, null, false, rv5Var, null, null, M, 1073766406, 32768 | ((i2 << 15) & 234881024), 0, 3902528);
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
            s.d = new jr8(hkr0Var, str, z, rv5Var, i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final hkr0 hkr0Var, final String str, final boolean z, final VkBlurContentView vkBlurContentView, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        final String str2;
        Integer num;
        Integer valueOf;
        Integer num2;
        VkButton.Mode mode;
        VkButton.Size size;
        VkButton.Appearance appearance;
        Object x;
        a.C0011a.C0012a c0012a;
        boolean o;
        Object x2;
        androidx.compose.runtime.a M = aVar.M(-2042218904);
        int i2 = i | (M.J(hkr0Var) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.y(vkBlurContentView) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2042218904, i2, -1, "com.vk.design.demo.presentation.screens.ViewImplementation (ButtonScreenContent.kt:524)");
            }
            qtp0 qtp0Var = hkr0Var.a;
            boolean z2 = qtp0Var == qtp0.Filled || qtp0Var == qtp0.Loader;
            int[] iArr = a.$EnumSwitchMapping$0;
            Float f = null;
            switch (iArr[qtp0Var.ordinal()]) {
                case 1:
                case 2:
                    str2 = null;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    str2 = str;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            switch (iArr[qtp0Var.ordinal()]) {
                case 1:
                case 2:
                case 4:
                case 5:
                case 6:
                    num = null;
                    break;
                case 3:
                    num = 99;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            switch (iArr[qtp0Var.ordinal()]) {
                case 1:
                case 3:
                    valueOf = Integer.valueOf(R.drawable.vk_icon_add_outline_24);
                    break;
                case 2:
                case 4:
                case 5:
                case 6:
                    valueOf = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            switch (iArr[qtp0Var.ordinal()]) {
                case 1:
                case 2:
                case 4:
                case 5:
                case 6:
                    num2 = null;
                    break;
                case 3:
                    num2 = Integer.valueOf(R.drawable.vk_icon_download_outline_24);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            int i3 = a.$EnumSwitchMapping$1[hkr0Var.b.ordinal()];
            if (i3 == 1) {
                mode = VkButton.Mode.Primary;
            } else if (i3 == 2) {
                mode = VkButton.Mode.Secondary;
            } else if (i3 == 3) {
                mode = VkButton.Mode.Tertiary;
            } else if (i3 == 4) {
                mode = VkButton.Mode.Outline;
            } else {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                mode = VkButton.Mode.Link;
            }
            int i4 = a.$EnumSwitchMapping$2[hkr0Var.c.ordinal()];
            if (i4 == 1) {
                size = VkButton.Size.Small;
            } else if (i4 == 2) {
                size = VkButton.Size.Medium;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                size = VkButton.Size.Large;
            }
            int i5 = a.$EnumSwitchMapping$3[hkr0Var.d.ordinal()];
            if (i5 == 1) {
                appearance = VkButton.Appearance.Accent;
            } else if (i5 == 2) {
                appearance = VkButton.Appearance.Positive;
            } else if (i5 == 3) {
                appearance = VkButton.Appearance.Negative;
            } else if (i5 == 4) {
                appearance = VkButton.Appearance.Neutral;
            } else {
                if (i5 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                appearance = VkButton.Appearance.Overlay;
            }
            final VkButton.Appearance appearance2 = appearance;
            switch (iArr[qtp0Var.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    final Float f2 = f;
                    q630 D = s200.D(q630.a.a, 4);
                    x = M.x();
                    c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = mr8.b;
                        M.R(x);
                    }
                    izs izsVar = (izs) ((fcy) x);
                    o = ((i2 & 7168) != 2048 || M.y(vkBlurContentView)) | M.o(mode.ordinal()) | M.l(z2) | M.J(str2) | M.J(num) | M.J(valueOf) | M.J(num2) | M.o(size.ordinal()) | M.o(appearance2.ordinal()) | M.J(f2) | ((i2 & 896) == 256);
                    x2 = M.x();
                    if (!o || x2 == c0012a) {
                        final VkButton.Mode mode2 = mode;
                        final boolean z3 = z2;
                        final Integer num3 = num2;
                        final Integer num4 = valueOf;
                        final Integer num5 = num;
                        final VkButton.Size size2 = size;
                        izs izsVar2 = new izs() { // from class: xsna.kr8
                            @Override // xsna.izs
                            public final Object invoke(Object obj) {
                                com.vk.core.view.components.button.d dVar = (com.vk.core.view.components.button.d) obj;
                                VkButton button = dVar.getButton();
                                if (button != null) {
                                    button.setLoading(z3);
                                    button.setText(str2);
                                    button.setCount(num5);
                                    button.a5(true, num4);
                                    button.d5(num3);
                                    button.setMode(mode2);
                                    button.setSize(size2);
                                    button.setAppearance(appearance2);
                                    button.setCornerRadius(f2);
                                    VkBlurContentView vkBlurContentView2 = vkBlurContentView;
                                    if (vkBlurContentView2 != null) {
                                        button.setupBlur(vkBlurContentView2);
                                    }
                                }
                                dVar.setSkeletonEnabled(z);
                                return s3q0.a;
                            }
                        };
                        M.R(izsVar2);
                        x2 = izsVar2;
                    }
                    aVar2 = M;
                    ae2.a(54, 0, aVar2, izsVar, (izs) x2, D);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                        break;
                    }
                    break;
                case 5:
                    f = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    final Float f22 = f;
                    q630 D2 = s200.D(q630.a.a, 4);
                    x = M.x();
                    c0012a = a.C0011a.a;
                    if (x == c0012a) {
                    }
                    izs izsVar3 = (izs) ((fcy) x);
                    if ((i2 & 7168) != 2048) {
                        break;
                    }
                    o = ((i2 & 7168) != 2048 || M.y(vkBlurContentView)) | M.o(mode.ordinal()) | M.l(z2) | M.J(str2) | M.J(num) | M.J(valueOf) | M.J(num2) | M.o(size.ordinal()) | M.o(appearance2.ordinal()) | M.J(f22) | ((i2 & 896) == 256);
                    x2 = M.x();
                    if (!o) {
                    }
                    final VkButton.Mode mode22 = mode;
                    final boolean z32 = z2;
                    final Integer num32 = num2;
                    final Integer num42 = valueOf;
                    final Integer num52 = num;
                    final VkButton.Size size22 = size;
                    izs izsVar22 = new izs() { // from class: xsna.kr8
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            com.vk.core.view.components.button.d dVar = (com.vk.core.view.components.button.d) obj;
                            VkButton button = dVar.getButton();
                            if (button != null) {
                                button.setLoading(z32);
                                button.setText(str2);
                                button.setCount(num52);
                                button.a5(true, num42);
                                button.d5(num32);
                                button.setMode(mode22);
                                button.setSize(size22);
                                button.setAppearance(appearance2);
                                button.setCornerRadius(f22);
                                VkBlurContentView vkBlurContentView2 = vkBlurContentView;
                                if (vkBlurContentView2 != null) {
                                    button.setupBlur(vkBlurContentView2);
                                }
                            }
                            dVar.setSkeletonEnabled(z);
                            return s3q0.a;
                        }
                    };
                    M.R(izsVar22);
                    x2 = izsVar22;
                    aVar2 = M;
                    ae2.a(54, 0, aVar2, izsVar3, (izs) x2, D2);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    break;
                case 6:
                    f = Float.valueOf(iah0.b(50.0f));
                    final Float f222 = f;
                    q630 D22 = s200.D(q630.a.a, 4);
                    x = M.x();
                    c0012a = a.C0011a.a;
                    if (x == c0012a) {
                    }
                    izs izsVar32 = (izs) ((fcy) x);
                    o = ((i2 & 7168) != 2048 || M.y(vkBlurContentView)) | M.o(mode.ordinal()) | M.l(z2) | M.J(str2) | M.J(num) | M.J(valueOf) | M.J(num2) | M.o(size.ordinal()) | M.o(appearance2.ordinal()) | M.J(f222) | ((i2 & 896) == 256);
                    x2 = M.x();
                    if (!o) {
                    }
                    final VkButton.Mode mode222 = mode;
                    final boolean z322 = z2;
                    final Integer num322 = num2;
                    final Integer num422 = valueOf;
                    final Integer num522 = num;
                    final VkButton.Size size222 = size;
                    izs izsVar222 = new izs() { // from class: xsna.kr8
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            com.vk.core.view.components.button.d dVar = (com.vk.core.view.components.button.d) obj;
                            VkButton button = dVar.getButton();
                            if (button != null) {
                                button.setLoading(z322);
                                button.setText(str2);
                                button.setCount(num522);
                                button.a5(true, num422);
                                button.d5(num322);
                                button.setMode(mode222);
                                button.setSize(size222);
                                button.setAppearance(appearance2);
                                button.setCornerRadius(f222);
                                VkBlurContentView vkBlurContentView2 = vkBlurContentView;
                                if (vkBlurContentView2 != null) {
                                    button.setupBlur(vkBlurContentView2);
                                }
                            }
                            dVar.setSkeletonEnabled(z);
                            return s3q0.a;
                        }
                    };
                    M.R(izsVar222);
                    x2 = izsVar222;
                    aVar2 = M;
                    ae2.a(54, 0, aVar2, izsVar32, (izs) x2, D22);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(str, z, vkBlurContentView, i) { // from class: xsna.lr8
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ VkBlurContentView e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(4097);
                    nr8.b(hkr0.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(hkr0 hkr0Var, final String str, final VkBlurContentView vkBlurContentView, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.f fVar;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        VkButton.Mode mode;
        VkButton.Size size;
        VkButton.Appearance appearance;
        Float f;
        qtp0 qtp0Var = hkr0Var.a;
        androidx.compose.runtime.a M = aVar.M(1543511510);
        int i2 = i | (M.J(hkr0Var) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.y(vkBlurContentView) ? 256 : 128);
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1543511510, i2, -1, "com.vk.design.demo.presentation.screens.ViewSimpleImplementation (ButtonScreenContent.kt:607)");
            }
            if (qtp0Var == qtp0.Filled || qtp0Var == qtp0.Loader || qtp0Var == qtp0.Icon) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                fVar = M.s();
                if (fVar != null) {
                    wzsVar = new jk1(i, 2, hkr0Var, str, vkBlurContentView);
                    fVar.d = wzsVar;
                }
                return;
            }
            int i3 = a.$EnumSwitchMapping$1[hkr0Var.b.ordinal()];
            if (i3 == 1) {
                mode = VkButton.Mode.Primary;
            } else if (i3 == 2) {
                mode = VkButton.Mode.Secondary;
            } else if (i3 == 3) {
                mode = VkButton.Mode.Tertiary;
            } else if (i3 == 4) {
                mode = VkButton.Mode.Outline;
            } else {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                mode = VkButton.Mode.Link;
            }
            int i4 = a.$EnumSwitchMapping$2[hkr0Var.c.ordinal()];
            if (i4 == 1) {
                size = VkButton.Size.Small;
            } else if (i4 == 2) {
                size = VkButton.Size.Medium;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                size = VkButton.Size.Large;
            }
            int i5 = a.$EnumSwitchMapping$3[hkr0Var.d.ordinal()];
            if (i5 == 1) {
                appearance = VkButton.Appearance.Accent;
            } else if (i5 == 2) {
                appearance = VkButton.Appearance.Positive;
            } else if (i5 == 3) {
                appearance = VkButton.Appearance.Negative;
            } else if (i5 == 4) {
                appearance = VkButton.Appearance.Neutral;
            } else {
                if (i5 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                appearance = VkButton.Appearance.Overlay;
            }
            switch (a.$EnumSwitchMapping$0[qtp0Var.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    f = null;
                    break;
                case 5:
                    f = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case 6:
                    f = Float.valueOf(iah0.b(50.0f));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            final Float f2 = f;
            q630 D = s200.D(q630.a.a, 4);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = new vt1(4);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean o = ((i2 & 112) == 32) | M.o(mode.ordinal()) | M.o(size.ordinal()) | M.o(appearance.ordinal()) | M.J(f2);
            if ((i2 & 896) != 256 && !M.y(vkBlurContentView)) {
                z = false;
            }
            boolean z2 = o | z;
            Object x2 = M.x();
            if (z2 || x2 == obj) {
                final VkButton.Size size2 = size;
                final VkButton.Appearance appearance2 = appearance;
                final VkButton.Mode mode2 = mode;
                Object obj2 = new izs() { // from class: xsna.ir8
                    @Override // xsna.izs
                    public final Object invoke(Object obj3) {
                        VkSimpleButton vkSimpleButton = (VkSimpleButton) obj3;
                        vkSimpleButton.setText(str);
                        vkSimpleButton.setMode(mode2);
                        vkSimpleButton.setSize(size2);
                        vkSimpleButton.setAppearance(appearance2);
                        Float f3 = f2;
                        if (f3 != null) {
                            vkSimpleButton.setCornerRadius(f3.floatValue());
                        }
                        VkBlurContentView vkBlurContentView2 = vkBlurContentView;
                        if (vkBlurContentView2 != null) {
                            vkSimpleButton.setupBlur(vkBlurContentView2);
                        }
                        return s3q0.a;
                    }
                };
                M.R(obj2);
                x2 = obj2;
            }
            aVar2 = M;
            ae2.a(54, 0, aVar2, izsVar, (izs) x2, D);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        fVar = aVar2.s();
        if (fVar != null) {
            wzsVar = new ip6(i, 1, hkr0Var, str, vkBlurContentView);
            fVar.d = wzsVar;
        }
    }
}
