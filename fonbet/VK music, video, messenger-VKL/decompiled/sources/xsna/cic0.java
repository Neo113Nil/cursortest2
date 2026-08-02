package xsna;

import android.content.Context;
import android.text.Annotation;
import android.text.SpannableStringBuilder;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.group.footer.GroupFooter;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.posting.impl.presentation.model.ToolbarNavButtonType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.q8z;
import xsna.us2;
import xsna.wpc0;

/* compiled from: PostingOtherStepsContentView.kt */
/* loaded from: classes4.dex */
public final class cic0 extends i6v0<upc0, PostingAction> {
    public static final int j;
    public final xqi<wpc0<?>> f;
    public final tcc0 g;
    public final ComposeView h;
    public final xd40 i;

    /* compiled from: PostingOtherStepsContentView.kt */
    @b6l(c = "com.vk.newsfeed.posting.impl.presentation.base.view.PostingOtherStepsContentView$SaveDraftOnboarding$2$1", f = "PostingOtherStepsContentView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ gzs<s3q0> $onTooltipDismissed;
        final /* synthetic */ etv0 $tooltipState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(etv0 etv0Var, gzs<s3q0> gzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$tooltipState = etv0Var;
            this.$onTooltipDismissed = gzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$tooltipState, this.$onTooltipDismissed, spjVar);
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
            if (!this.$tooltipState.isVisible()) {
                this.$onTooltipDismissed.invoke();
            }
            return s3q0.a;
        }
    }

    /* compiled from: PostingOtherStepsContentView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToolbarNavButtonType.values().length];
            try {
                iArr[ToolbarNavButtonType.Back.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToolbarNavButtonType.Close.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int i = ComposeView.n;
        j = iah0.a(68);
    }

    public cic0(Context context, PostingFragment postingFragment, xqi xqiVar, tcc0 tcc0Var, ComposeView composeView, xd40 xd40Var) {
        super(context, postingFragment);
        this.f = xqiVar;
        this.g = tcc0Var;
        this.h = composeView;
        this.i = xd40Var;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        m((upc0) ao50Var, izsVar, aVar, 512);
    }

    @Override // xsna.kk50, xsna.jj50
    public final ComposeView c() {
        return this.h;
    }

    @Override // xsna.kk50
    /* renamed from: e */
    public final ComposeView c() {
        return this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x02e1, code lost:
    
        if (r3 == r1) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(wpc0<?> wpc0Var, final izs<? super PostingAction, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        tdc0 tdc0Var;
        Object obj;
        int i2;
        tdc0 tdc0Var2;
        a.C0011a.C0012a c0012a;
        int i3;
        cic0 cic0Var;
        int i4;
        int i5;
        StringBuilder sb;
        SpannableStringBuilder spannableStringBuilder;
        Annotation[] annotationArr;
        int i6;
        a.C0011a.C0012a c0012a2;
        androidx.compose.runtime.a M = aVar.M(-713067569);
        int i7 = i | (M.J(wpc0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        boolean z = true;
        if (M.t(i7 & 1, (i7 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-713067569, i7, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.PostingOtherStepsContentView.BottomBarContent (PostingOtherStepsContentView.kt:239)");
            }
            M.W(1936841748, wpc0Var);
            if (wpc0Var instanceof wpc0.a) {
                M.K(1936843700);
                tdc0Var = (tdc0) jk50.c(((wpc0.a) wpc0Var).b(), M).getValue();
                M.j();
            } else {
                M.K(-87357714);
                M.j();
                tdc0Var = null;
            }
            if (tdc0Var == null || (obj = tdc0Var.c) == null) {
                obj = ActionsAvailabilityState.Availability.Available.b;
            }
            int i8 = i7 & 112;
            boolean y = (i8 == 32) | M.y(obj);
            Object x = M.x();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (y || x == c0012a3) {
                x = new m84(15, izsVar, obj);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            boolean y2 = (i8 == 32) | M.y(obj);
            Object x2 = M.x();
            if (y2 || x2 == c0012a3) {
                x2 = new lb6(22, izsVar, obj);
                M.R(x2);
            }
            gzs gzsVar2 = (gzs) x2;
            boolean z2 = i8 == 32;
            Object x3 = M.x();
            if (z2 || x3 == c0012a3) {
                x3 = new m74(izsVar, 2);
                M.R(x3);
            }
            gzs gzsVar3 = (gzs) x3;
            boolean z3 = i8 == 32;
            Object x4 = M.x();
            if (z3 || x4 == c0012a3) {
                x4 = new os7(izsVar, 5);
                M.R(x4);
            }
            gzs gzsVar4 = (gzs) x4;
            if (tdc0Var != null) {
                M.K(-86614116);
                boolean z4 = obj instanceof ActionsAvailabilityState.Availability.Available;
                float f = z4 ? 1.0f : 0.64f;
                float f2 = (!z4 || tdc0Var.f) ? 0.64f : 1.0f;
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630.a aVar2 = q630.a.a;
                q630 c = qri.c(M, aVar2);
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
                k9q0.w(M, c, cri.a.d);
                iec0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, M, txj0.f(aVar2, 1.0f));
                bhu0.e(gzsVar, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, ahn.E(o19.a(s200.E(txj0.f(aVar2, 1.0f), 16, 12), f), "PostingCreatePostButton"), null, false, false, null, null, null, tdc0Var.a, null, null, null, null, false, null, null, null, M, X2.b.f, 0, 0, 4190176);
                if (tdc0Var.e) {
                    M.K(336102732);
                    String str = tdc0Var.b;
                    String str2 = tdc0Var.g;
                    boolean z5 = tdc0Var.h;
                    int i9 = ComposeView.n;
                    i2 = -1;
                    tdc0Var2 = tdc0Var;
                    c0012a = c0012a3;
                    i3 = i7;
                    cic0 cic0Var2 = this;
                    cic0Var2.i(str, z5, gzsVar3, gzsVar4, gzsVar2, f2, str2, M, ((i7 << 15) & 29360128) | C.DEFAULT_MUXED_BUFFER_SIZE);
                    cic0Var = cic0Var2;
                } else {
                    i2 = -1;
                    tdc0Var2 = tdc0Var;
                    c0012a = c0012a3;
                    i3 = i7;
                    cic0Var = this;
                    M.K(324414709);
                }
                M.j();
                if (tdc0Var2.d) {
                    M.K(336781756);
                    int i10 = i3 >> 3;
                    int i11 = ComposeView.n;
                    int i12 = (i10 & 112) | (i10 & 14) | 64;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-454259967, i12, i2, "com.vk.newsfeed.posting.impl.presentation.base.view.PostingOtherStepsContentView.createPrivacyLink (PostingOtherStepsContentView.kt:380)");
                    }
                    CharSequence text = cic0Var.c.getText(R.string.vk_video_privacy_policy_description);
                    M.K(1542843875);
                    StringBuilder sb2 = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    new ArrayList();
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(text);
                    Annotation[] annotationArr2 = (Annotation[]) spannableStringBuilder2.getSpans(0, text.length(), Annotation.class);
                    sb2.append(text.toString());
                    M.K(1542850964);
                    int length = annotationArr2.length;
                    int i13 = 0;
                    while (i13 < length) {
                        Annotation annotation = annotationArr2[i13];
                        if (epx.f(annotation.getValue(), "link")) {
                            M.K(-746869120);
                            int spanStart = spannableStringBuilder2.getSpanStart(annotation);
                            int spanEnd = spannableStringBuilder2.getSpanEnd(annotation);
                            String value = annotation.getValue();
                            i4 = i12;
                            i5 = length;
                            sb = sb2;
                            zqv0 zqv0Var = new zqv0(new klv0(VkTypographyToken.Footnote, VkColorToken.TextLink), 14);
                            boolean z6 = (((i4 & 14) ^ 6) > 4 && M.J(izsVar)) || (i4 & 6) == 4;
                            Object x5 = M.x();
                            if (z6) {
                                c0012a2 = c0012a;
                            } else {
                                c0012a2 = c0012a;
                            }
                            x5 = new i9z() { // from class: xsna.yhc0
                                @Override // xsna.i9z
                                public final void a(q8z q8zVar) {
                                    izs.this.invoke(PostingAction.Navigation.OpenVkVideoPrivacyPolicy.b);
                                }
                            };
                            M.R(x5);
                            i9z i9zVar = (i9z) x5;
                            if (androidx.compose.runtime.b.d()) {
                                spannableStringBuilder = spannableStringBuilder2;
                                annotationArr = annotationArr2;
                                i6 = i13;
                                androidx.compose.runtime.b.f(-822338567, 8, -1, "com.vk.core.compose.annotated.VkLinkAnnotation.Clickable.toLinkAnnotation (VkLinkAnnotation.kt:76)");
                            } else {
                                spannableStringBuilder = spannableStringBuilder2;
                                annotationArr = annotationArr2;
                                i6 = i13;
                            }
                            M.K(6625227);
                            tjo0 a3 = zqv0Var.a(M);
                            M.j();
                            q8z.a aVar4 = new q8z.a(value, a3, i9zVar);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            arrayList.add(new us2.b.a(spanStart, spanEnd, 8, aVar4));
                        } else {
                            i4 = i12;
                            i5 = length;
                            sb = sb2;
                            spannableStringBuilder = spannableStringBuilder2;
                            annotationArr = annotationArr2;
                            i6 = i13;
                            c0012a2 = c0012a;
                            M.K(-763032272);
                        }
                        M.j();
                        i13 = i6 + 1;
                        c0012a = c0012a2;
                        i12 = i4;
                        length = i5;
                        sb2 = sb;
                        spannableStringBuilder2 = spannableStringBuilder;
                        annotationArr2 = annotationArr;
                    }
                    StringBuilder sb3 = sb2;
                    a.C0011a.C0012a c0012a4 = c0012a;
                    M.j();
                    String sb4 = sb3.toString();
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        arrayList2.add(((us2.b.a) arrayList.get(i14)).a(sb3.length()));
                    }
                    us2 us2Var = new us2(sb4, arrayList2);
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
                    if ((i3 & 896) != 256 && !M.y(cic0Var)) {
                        z = false;
                    }
                    Object x6 = M.x();
                    if (z || x6 == c0012a4) {
                        x6 = new el30(cic0Var, 19);
                        M.R(x6);
                    }
                    com.vk.core.compose.component.semantics.a a4 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x6, 2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(228915026, 384, -1, "com.vk.core.compose.component.group.footer.GroupFooter.GroupDescription.Companion.invoke (GroupFooter.kt:79)");
                    }
                    Object x7 = M.x();
                    if (x7 == c0012a4) {
                        x7 = new GroupFooter.a(us2Var, a4);
                        M.R(x7);
                    }
                    GroupFooter.a aVar5 = (GroupFooter.a) x7;
                    ((zak0) aVar5.a).setValue(us2Var);
                    ((zak0) aVar5.b).setValue(a4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    fxu0.a(aVar5, null, M, 0, 2);
                } else {
                    M.K(324414709);
                }
                M.j();
                M.G();
            } else {
                M.K(-97169709);
            }
            M.j();
            M.a0();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hx(i, 3, this, wpc0Var, izsVar);
        }
    }

    public final void i(final String str, final boolean z, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, final float f, final String str2, androidx.compose.runtime.a aVar, final int i) {
        String str3;
        int i2;
        gzs gzsVar4;
        float f2;
        androidx.compose.runtime.a M = aVar.M(693193392);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (M.J(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            gzsVar4 = gzsVar3;
            i2 |= M.y(gzsVar4) ? 16384 : 8192;
        } else {
            gzsVar4 = gzsVar3;
        }
        if ((196608 & i) == 0) {
            f2 = f;
            i2 |= M.n(f2) ? 131072 : 65536;
        } else {
            f2 = f;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(str2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? M.J(this) : M.y(this) ? 8388608 : 4194304;
        }
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(693193392, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.PostingOtherStepsContentView.HintSaveDraftButton (PostingOtherStepsContentView.kt:311)");
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new bic0(z, gzsVar, null);
                M.R(x);
            }
            bap.g(valueOf, (wzs) x, M, (i2 >> 3) & 14);
            if (str2 != null) {
                M.K(722116501);
                q630 f3 = txj0.f(q630.a.a, 1.0f);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.f, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, f3);
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
                int i3 = i2 >> 6;
                int i4 = ComposeView.n;
                l(str2, gzsVar2, M, ((i2 >> 18) & 14) | (i3 & 112) | 512 | ((i2 >> 15) & 896));
                int i5 = i2 & 14;
                int i6 = i2 >> 12;
                k(str3, f2, gzsVar4, M, i5 | (i6 & 112) | (i3 & 896) | 4096 | (i6 & 7168));
                M.G();
                M.j();
            } else {
                M.K(722398384);
                int i7 = i2 >> 12;
                int i8 = ComposeView.n;
                k(str, f, gzsVar3, M, (i2 & 14) | (i7 & 112) | ((i2 >> 6) & 896) | 4096 | (i7 & 7168));
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
            s.d = new wzs() { // from class: xsna.xhc0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cic0.this.i(str, z, gzsVar, gzsVar2, gzsVar3, f, str2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void j(final wpc0.a aVar, final int i, final izs<? super PostingAction, s3q0> izsVar, final s890 s890Var, androidx.compose.runtime.a aVar2, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar2.M(-509206225);
        if ((i2 & 6) == 0) {
            i3 = (M.J(aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(s890Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? M.J(this) : M.y(this) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-509206225, i3, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.PostingOtherStepsContentView.PostEditingContent (PostingOtherStepsContentView.kt:199)");
            }
            if (aVar instanceof wpc0.a.C3948a) {
                M.K(62150189);
                p74.b(this.g, (wpc0.a.C3948a) aVar, i, s890Var, izsVar, this.i, M, ((i3 << 3) & 896) | (i3 & 7168) | ((i3 << 6) & 57344));
                M.j();
            } else {
                M.K(279110323);
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
            s.d = new wzs() { // from class: xsna.whc0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cic0.this.j(aVar, i, izsVar, s890Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void k(final String str, final float f, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i) {
        String str2;
        int i2;
        gzs<s3q0> gzsVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-872369832);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (M.J(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gzsVar2 = gzsVar;
            i2 |= M.y(gzsVar2) ? 256 : 128;
        } else {
            gzsVar2 = gzsVar;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-872369832, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.PostingOtherStepsContentView.SaveDraftButton (PostingOtherStepsContentView.kt:364)");
            }
            float f2 = 16;
            aVar2 = M;
            bhu0.e(gzsVar2, ButtonSize.Large, ButtonStyle.Secondary, ButtonAppearance.Accent, ahn.E(o19.a(s200.H(txj0.f(q630.a.a, 1.0f), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 12, 2), f), "PostingDraftButton"), null, false, false, null, null, null, str2, null, null, null, null, false, null, null, null, aVar2, ((i2 >> 6) & 14) | X2.b.f, (i2 << 6) & 896, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.zhc0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cic0.this.k(str, f, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void l(String str, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        gzs<s3q0> gzsVar2 = gzsVar;
        androidx.compose.runtime.a M = aVar.M(1848129361);
        if ((i & 6) == 0) {
            i2 = i | (M.J(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1848129361, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.PostingOtherStepsContentView.SaveDraftOnboarding (PostingOtherStepsContentView.kt:333)");
            }
            buv0 z = rdi.z(true, null, null, M, 6, 6);
            q630 m = kci.m(-44, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            o9v0.a(str, z, null, VkTooltip$MarkerStyle.Style6, VkTooltip$MarkerSize.Size72, null, VkTooltip$BalloonPosition.TopRight, null, gzsVar, gzsVar, null, null, null, false, null, true, 190, false, !dhr0.M(), pji.a, M, (i2 & 14) | 1600512 | ((i2 << 21) & 234881024) | ((i2 << 24) & 1879048192), 807075840, 162980);
            gzsVar2 = gzsVar;
            M = M;
            M.G();
            Boolean valueOf = Boolean.valueOf(z.isVisible());
            boolean y = M.y(z) | ((i2 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new a(z, gzsVar2, null);
                M.R(x);
            }
            bap.g(valueOf, (wzs) x, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zx9(i, 4, this, str, gzsVar2);
        }
    }

    public final void m(upc0 upc0Var, izs<? super PostingAction, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1761556938);
        int i2 = i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1761556938, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.PostingOtherStepsContentView.ThemedContent (PostingOtherStepsContentView.kt:91)");
            }
            uov0.a(null, null, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1994304957, new zw5(7, izsVar, this), M), M, 1572864, 63);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new l8c(i, 7, this, upc0Var, izsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(dpc0 dpc0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        a.C0011a.C0012a c0012a;
        int i2;
        TopBar$Before.e a2;
        androidx.compose.runtime.a aVar2;
        int i3;
        SemanticsConfiguration.Mode mode;
        com.vk.core.compose.component.topbar.a aVar3;
        TopBar$Middle.Text.d dVar;
        androidx.compose.runtime.a M = aVar.M(-325566201);
        int i4 = i | (M.J(dpc0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-325566201, i4, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.PostingOtherStepsContentView.Toolbar (PostingOtherStepsContentView.kt:138)");
            }
            int i5 = b.$EnumSwitchMapping$0[dpc0Var.d.ordinal()];
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (i5 == 1) {
                c0012a = c0012a2;
                i2 = 0;
                M.K(663502511);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
                }
                lg90 b2 = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N = d370.N(R.string.previous_step_talkback_title, 0, M);
                boolean z = (i4 & 112) == 32;
                Object x = M.x();
                if (z || x == c0012a) {
                    x = new vrc(izsVar, 3);
                    M.R(x);
                }
                a2 = TopBar$Before.e.a.a(b2, N, (gzs) x, null, null, null, M, 1572872, 56);
                aVar2 = M;
                aVar2.j();
            } else {
                if (i5 != 2) {
                    throw alb0.c(663500207, M);
                }
                M.K(663511791);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                }
                lg90 b3 = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N2 = d370.N(R.string.close_posting_talkback_title, 0, M);
                boolean z2 = (i4 & 112) == 32;
                Object x2 = M.x();
                if (z2 || x2 == c0012a2) {
                    x2 = new j87(izsVar, 5);
                    M.R(x2);
                }
                i2 = 0;
                c0012a = c0012a2;
                a2 = TopBar$Before.e.a.a(b3, N2, (gzs) x2, null, null, null, M, 1572872, 56);
                aVar2 = M;
                aVar2.j();
            }
            TopBar$Before.e eVar = a2;
            if (dpc0Var.b) {
                aVar2.K(663522577);
                String N3 = d370.N(R.string.next_step_toolbar_button_title, i2, aVar2);
                float f = dpc0Var.c instanceof ActionsAvailabilityState.Availability.Available ? 1.0f : 0.5f;
                int i6 = (i4 & 112) == 32 ? 1 : i2;
                if ((i4 & 14) == 4) {
                    i2 = 1;
                }
                int i7 = i2 | i6;
                Object x3 = aVar2.x();
                if (i7 != 0 || x3 == c0012a) {
                    x3 = new jl4(16, izsVar, dpc0Var);
                    aVar2.R(x3);
                }
                gzs gzsVar = (gzs) x3;
                mode = null;
                i3 = 3;
                d.c.b a3 = d.c.b.a.a(N3, gzsVar, true, f, null, aVar2, 196992, 16);
                Object x4 = aVar2.x();
                if (x4 == c0012a) {
                    x4 = new acc0(1);
                    aVar2.R(x4);
                }
                androidx.compose.runtime.a aVar4 = aVar2;
                com.vk.core.compose.component.topbar.a a4 = d.a.a(a3, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), aVar4, 24576, 6);
                aVar2 = aVar4;
                aVar2.j();
                aVar3 = a4;
            } else {
                i3 = 3;
                mode = null;
                aVar2.K(-904959242);
                aVar2.j();
                aVar3 = null;
            }
            TopBar$Middle.Text.Title a5 = TopBar$Middle.Text.Title.b.a(dpc0Var.a, null, null, null, null, aVar2, 196608, 30);
            String a6 = cqm0.a(dpc0Var.g);
            if (a6 == null) {
                aVar2.K(-904748256);
                aVar2.j();
                dVar = mode;
            } else {
                aVar2.K(-904748255);
                TopBar$Middle.Text.d a7 = TopBar$Middle.Text.d.a.a(a6, 1, 2, null, null, aVar2, 197040, 24);
                aVar2.j();
                dVar = a7;
            }
            Object x5 = aVar2.x();
            if (x5 == c0012a) {
                x5 = new xpt(16);
                aVar2.R(x5);
            }
            androidx.compose.runtime.a aVar5 = aVar2;
            muv0.h(TopBar$Middle.Text.b.a(a5, dVar, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x5, i3), aVar5, 4), q630Var, null, null, null, eVar, aVar3, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar5, 48, 0, 8092);
            M = aVar5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ohw(i, 1, this, dpc0Var, izsVar, q630Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(wpc0<?> wpc0Var, izs<? super PostingAction, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        dpc0 dpc0Var;
        androidx.compose.runtime.a M = aVar.M(-1970377379);
        int i2 = (M.J(wpc0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1970377379, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.PostingOtherStepsContentView.TopBarContent (PostingOtherStepsContentView.kt:218)");
            }
            M.W(547921439, wpc0Var);
            if (wpc0Var instanceof wpc0.a) {
                M.K(547925826);
                dpc0Var = (dpc0) jk50.c(((wpc0.a) wpc0Var).a(), M).getValue();
                M.j();
            } else {
                M.K(-194138848);
                M.j();
                dpc0Var = null;
            }
            dpc0 dpc0Var2 = dpc0Var;
            if (dpc0Var2 != null) {
                M.K(-194070399);
                q630 E = ahn.E(q630.a.a, "PostingToolbarStep2");
                int i3 = ComposeView.n;
                n(dpc0Var2, izsVar, E, M, (i2 & 112) | 4480 | ((i2 << 3) & 7168));
            } else {
                M.K(-203297115);
            }
            M.j();
            M.a0();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xmd(i, 4, this, wpc0Var, izsVar);
        }
    }
}
