package com.ybsdk.feature.card.internal.presentation.carddetails;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$SecondFactorResult;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;
import com.ybsdk.feature.card.internal.presentation.cardlimit.CardLimitFragment;
import com.ybsdk.feature.card.internal.presentation.cardreissue.CardReissueFragment;
import com.ybsdk.feature.settings.api.SettingsTheme;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ListItemButton;
import com.ybsdk.widgets.common.PageIndicatorView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import com.ybsdk.widgets.common.tabview.TabView;
import defpackage.a261;
import defpackage.al8;
import defpackage.bl8;
import defpackage.buz0;
import defpackage.cm8;
import defpackage.cp8;
import defpackage.cx7;
import defpackage.d1;
import defpackage.dab1;
import defpackage.dcs;
import defpackage.de8;
import defpackage.dzh0;
import defpackage.ee8;
import defpackage.evu0;
import defpackage.fe8;
import defpackage.fi8;
import defpackage.frb1;
import defpackage.g661;
import defpackage.g9r0;
import defpackage.ge8;
import defpackage.gf91;
import defpackage.gk1;
import defpackage.h2b1;
import defpackage.he8;
import defpackage.hf8;
import defpackage.hua1;
import defpackage.ie8;
import defpackage.if6;
import defpackage.ij7;
import defpackage.j5x0;
import defpackage.jl40;
import defpackage.k5;
import defpackage.k5x0;
import defpackage.kds;
import defpackage.kp50;
import defpackage.lb7;
import defpackage.ld8;
import defpackage.le8;
import defpackage.lfx;
import defpackage.lum;
import defpackage.m810;
import defpackage.md8;
import defpackage.me8;
import defpackage.mf8;
import defpackage.mq5;
import defpackage.n6r0;
import defpackage.n70;
import defpackage.nab1;
import defpackage.ne8;
import defpackage.ns3;
import defpackage.ny61;
import defpackage.o0p;
import defpackage.od8;
import defpackage.oe8;
import defpackage.p9j;
import defpackage.pd8;
import defpackage.pe8;
import defpackage.q9j;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.qn8;
import defpackage.r9j;
import defpackage.rbv;
import defpackage.rd8;
import defpackage.rje;
import defpackage.rtu;
import defpackage.scc;
import defpackage.sd8;
import defpackage.sls;
import defpackage.snf0;
import defpackage.stz0;
import defpackage.t26;
import defpackage.td8;
import defpackage.te8;
import defpackage.tls;
import defpackage.ud8;
import defpackage.unr0;
import defpackage.v4b1;
import defpackage.vd8;
import defpackage.w511;
import defpackage.wd8;
import defpackage.wfz;
import defpackage.wk6;
import defpackage.xd8;
import defpackage.xqq0;
import defpackage.y5e;
import defpackage.y8f;
import defpackage.yi;
import defpackage.yqq0;
import defpackage.yr31;
import defpackage.z161;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007*\u0002^a\b\u0000\u0018\u0000 s2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001tB1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0003H\u0002¢\u0006\u0004\b+\u0010*J\u001b\u0010.\u001a\u00020\u0013*\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u001b\u00103\u001a\u00020\u0013*\u0002002\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u001b\u00107\u001a\u00020\u0013*\u00020\u00022\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u001b\u0010;\u001a\u00020\u0013*\u00020\u00022\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<JA\u0010D\u001a\u00020\u00132\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020@2\b\b\u0002\u0010C\u001a\u00020@H\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010H\u001a\u00020\u0013*\u00020\u00022\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ;\u0010Q\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00130L2\u000e\b\u0002\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00130OH\u0002¢\u0006\u0004\bQ\u0010RJ\u001d\u0010T\u001a\u00020\u00132\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00130OH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020W2\u0006\u0010V\u001a\u00020\u0002H\u0002¢\u0006\u0004\bX\u0010YR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010ZR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010[R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\\R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001e\u0010f\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u001e\u0010i\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010gR\u0016\u0010j\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020l0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010gR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020 0n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006u"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/carddetails/CardDetailsFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lg661;", "Lpe8;", "Lcom/ybsdk/feature/card/internal/presentation/carddetails/b;", "Lie8;", "viewModelFactory", "Lqn8;", "secondFactorHelper", "Lal8;", "cardOpenScreenHelper", "Lte8;", "bottomSheetInteractor", "Ln6r0;", "settingsAdapterFactory", "<init>", "(Lie8;Lqn8;Lal8;Lte8;Ln6r0;)V", "createViewModel", "()Lcom/ybsdk/feature/card/internal/presentation/carddetails/b;", "Lzy11;", "onResume", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lg661;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "viewState", "render", "(Lpe8;)V", "enableSensitiveDataMode", "Lr9j;", "card", "renderCardPublicInfo", "(Lg661;Lr9j;)V", "Lcom/ybsdk/widgets/common/ListItemButton;", "Lo0p;", "externalNfcServiceItemState", "renderExternalNfcServiceItemState", "(Lcom/ybsdk/widgets/common/ListItemButton;Lo0p;)V", "Lq9j;", "promoCard", "renderPromoInfo", "(Lg661;Lq9j;)V", "Lp9j;", "cardInfo", "renderInformation", "(Lg661;Lp9j;)V", "", "cardOffset", "animationTension", "", "firstAnimationDurationMs", "secondAnimationDurationMs", "secondAnimationDelayMs", "playPromoCarouselAnimation", "(FFJJJ)V", "Lcp8;", "skin", "renderCarousel", "(Lg661;Lcp8;)V", "Lcom/ybsdk/feature/card/api/CardSecondFactorHelper$Request;", "request", "Lkotlin/Function1;", "", "onSuccess", "Lkotlin/Function0;", "onCancel", "handle2faResult", "(Lcom/ybsdk/feature/card/api/CardSecondFactorHelper$Request;Ltls;Lsls;)V", "mainAction", "showSamsungPayBottomSheet", "(Lsls;)V", "binding", "", "createDetailsGroup", "(Lg661;)Z", "Lie8;", "Lqn8;", "Lal8;", "Lte8;", "xd8", "ybCardDiffCallback", "Lxd8;", "wd8", "promoInfoDiffCallback", "Lwd8;", "Lqa3;", "Lld8;", "cardsAdapter", "Lqa3;", "Lsnf0;", "promoInfoAdapter", "promoAnimationPlayed", "Z", "Le9r0;", "settingsAdapter", "", "detailsGroup", "Ljava/util/List;", "currPromoAgreement", "Ljava/lang/String;", "Companion", "td8", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardDetailsFragment extends BaseMvvmFragment<g661, pe8, com.ybsdk.feature.card.internal.presentation.carddetails.b> {
    public static final td8 Companion = new td8();
    private static final String DEFAULT_PROMO_AGREEMENT = "";
    private final te8 bottomSheetInteractor;
    private final al8 cardOpenScreenHelper;
    private qa3 cardsAdapter;
    private String currPromoAgreement;
    private final List<View> detailsGroup;
    private boolean promoAnimationPlayed;
    private qa3 promoInfoAdapter;
    private final wd8 promoInfoDiffCallback;
    private final qn8 secondFactorHelper;
    private final qa3 settingsAdapter;
    private final ie8 viewModelFactory;
    private final xd8 ybCardDiffCallback;

    /* loaded from: classes3.dex */
    public static final class a implements zls {
        public static final a a = new a();

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            ((Number) obj3).intValue();
            return Boolean.valueOf(obj instanceof snf0);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements tls {
        public static final b a = new b();

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return LayoutInflater.from(((ViewGroup) obj).getContext());
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements zls {
        public static final c a = new c();

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            ((Number) obj3).intValue();
            return Boolean.valueOf(obj instanceof ld8);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements tls {
        public static final d a = new d();

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return LayoutInflater.from(((ViewGroup) obj).getContext());
        }
    }

    public CardDetailsFragment(ie8 ie8Var, qn8 qn8Var, al8 al8Var, te8 te8Var, n6r0 n6r0Var) {
        super(null, null, null, null, com.ybsdk.feature.card.internal.presentation.carddetails.b.class, 15, null);
        this.viewModelFactory = ie8Var;
        this.secondFactorHelper = qn8Var;
        this.cardOpenScreenHelper = al8Var;
        this.bottomSheetInteractor = te8Var;
        this.ybCardDiffCallback = new xd8();
        this.promoInfoDiffCallback = new wd8();
        this.settingsAdapter = nab1.e(n6r0Var, new pd8(this, 1), new wk6(28));
        this.detailsGroup = new ArrayList();
        this.currPromoAgreement = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ g661 access$getBinding(CardDetailsFragment cardDetailsFragment) {
        return (g661) cardDetailsFragment.getBinding();
    }

    private final boolean createDetailsGroup(g661 binding) {
        return this.detailsGroup.addAll(scc.g(binding.x, binding.d, binding.i, binding.c, binding.b, binding.z, binding.j, binding.v, binding.u, binding.t, binding.f));
    }

    private final void enableSensitiveDataMode(pe8 viewState) {
        yqq0 yqq0Var = dab1.Q;
        if (viewState instanceof me8) {
            if (!((me8) viewState).c()) {
                yqq0Var = xqq0.a;
            }
        } else if (!(viewState instanceof ne8) && !jl40.l(viewState, oe8.a)) {
            w511.b();
            return;
        }
        setSensitiveDataMode(yqq0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$27$lambda$10(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$27$lambda$11(CardDetailsFragment cardDetailsFragment) {
        cardDetailsFragment.getViewModel().t0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$27$lambda$12(CardDetailsFragment cardDetailsFragment, View view) {
        cardDetailsFragment.getViewModel().s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$27$lambda$13(CardDetailsFragment cardDetailsFragment, View view) {
        cardDetailsFragment.getViewModel().f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$27$lambda$14(CardDetailsFragment cardDetailsFragment, View view) {
        cardDetailsFragment.getViewModel().h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$27$lambda$15(CardDetailsFragment cardDetailsFragment, View view) {
        cardDetailsFragment.getViewModel().g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$27$lambda$19(n70 n70Var) {
        n70Var.W(new ns3(n70Var, 3));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$27$lambda$19$lambda$18(n70 n70Var, List list) {
        ((a261) n70Var.X()).d.setText(com.ybsdk.core.utils.text.d.a(n70Var.Y(), ((snf0) n70Var.Z()).b()));
        ((a261) n70Var.X()).b.setImageDrawable(null);
        ((a261) n70Var.X()).c.setVisibility(0);
        v4b1.k(((snf0) n70Var.Z()).a(), ((a261) n70Var.X()).b, new ns3(n70Var, 4), null, 4);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$27$lambda$19$lambda$18$lambda$17(n70 n70Var, boolean z) {
        ((a261) n70Var.X()).c.setVisibility(z ? 0 : 8);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$27$lambda$2(CardDetailsFragment cardDetailsFragment) {
        cardDetailsFragment.getViewModel().v0(true);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$27$lambda$22(n70 n70Var) {
        n70Var.W(new ns3(n70Var, 2));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$27$lambda$22$lambda$21(n70 n70Var, List list) {
        ((z161) n70Var.X()).o().render(((ld8) n70Var.Z()).b());
        CardSkinView o = ((z161) n70Var.X()).o();
        String a2 = ((ld8) n70Var.Z()).a();
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.p(o, a2);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$27$lambda$23(CardDetailsFragment cardDetailsFragment, k5x0 k5x0Var) {
        cardDetailsFragment.getViewModel().o0(k5x0Var.a());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$27$lambda$26(g661 g661Var, View view, int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            g661Var.A.render(new wk6(29));
        } else {
            g661Var.A.render(new sd8(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 getViewBinding$lambda$27$lambda$26$lambda$24(stz0 stz0Var) {
        return stz0.a(stz0Var, null, null, null, null, null, null, false, false, null, null, 0, 32639);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 getViewBinding$lambda$27$lambda$26$lambda$25(stz0 stz0Var) {
        return stz0.a(stz0Var, null, null, null, null, null, null, false, true, null, null, 0, 32639);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$27$lambda$3(CardDetailsFragment cardDetailsFragment, View view) {
        cardDetailsFragment.getViewModel().l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$27$lambda$4(CardDetailsFragment cardDetailsFragment, View view) {
        cardDetailsFragment.getViewModel().j0(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$27$lambda$5(CardDetailsFragment cardDetailsFragment, View view) {
        cardDetailsFragment.getViewModel().p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$27$lambda$6(CardDetailsFragment cardDetailsFragment, View view) {
        cardDetailsFragment.getViewModel().i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$27$lambda$7(CardDetailsFragment cardDetailsFragment, View view) {
        cardDetailsFragment.getViewModel().e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$27$lambda$8(CardDetailsFragment cardDetailsFragment, View view) {
        cardDetailsFragment.getViewModel().m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$27$lambda$9(CardDetailsFragment cardDetailsFragment, View view) {
        cardDetailsFragment.getViewModel().n0();
    }

    private final void handle2faResult(CardSecondFactorHelper$Request request, tls onSuccess, sls onCancel) {
        getParentFragmentManager().m0(request.getKey(), this, new t26(2, this, onSuccess, onCancel));
    }

    public static /* synthetic */ void handle2faResult$default(CardDetailsFragment cardDetailsFragment, CardSecondFactorHelper$Request cardSecondFactorHelper$Request, tls tlsVar, sls slsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            slsVar = new ij7(28);
        }
        cardDetailsFragment.handle2faResult(cardSecondFactorHelper$Request, tlsVar, slsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handle2faResult$lambda$49(CardDetailsFragment cardDetailsFragment, tls tlsVar, sls slsVar, String str, Bundle bundle) {
        CardSecondFactorHelper$SecondFactorResult a2 = ((mf8) cardDetailsFragment.secondFactorHelper).a(bundle);
        if (a2 instanceof CardSecondFactorHelper$SecondFactorResult.VerificationToken) {
            tlsVar.invoke(((CardSecondFactorHelper$SecondFactorResult.VerificationToken) a2).getVerificationToken());
        } else if (jl40.l(a2, CardSecondFactorHelper$SecondFactorResult.Cancel.INSTANCE) || a2 == null) {
            slsVar.invoke();
        } else {
            w511.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$28(CardDetailsFragment cardDetailsFragment, String str, Bundle bundle) {
        com.ybsdk.feature.card.internal.presentation.carddetails.b viewModel = cardDetailsFragment.getViewModel();
        CardLimitFragment.Companion.getClass();
        viewModel.y0(fi8.a(bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$29(CardDetailsFragment cardDetailsFragment, String str, Bundle bundle) {
        com.ybsdk.feature.card.internal.presentation.carddetails.b viewModel = cardDetailsFragment.getViewModel();
        CardReissueFragment.Companion.getClass();
        viewModel.y0(cm8.a(bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$30(CardDetailsFragment cardDetailsFragment) {
        cardDetailsFragment.getViewModel().v0(false);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$31(CardDetailsFragment cardDetailsFragment, String str, Bundle bundle) {
        cardDetailsFragment.getViewModel().v0(false);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void playPromoCarouselAnimation(float cardOffset, float animationTension, long firstAnimationDurationMs, final long secondAnimationDurationMs, final long secondAnimationDelayMs) {
        if (this.promoAnimationPlayed) {
            return;
        }
        this.promoAnimationPlayed = true;
        ViewPager2 viewPager2 = ((g661) getBinding()).k;
        if (!(viewPager2.getChildCount() > 0)) {
            w511.i("Sequence is empty.");
            return;
        }
        View childAt = viewPager2.getChildAt(0);
        if (childAt == null) {
            ny61.s();
            return;
        }
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, cardOffset);
        ofFloat.addUpdateListener(new yi(9, linearLayoutManager));
        ofFloat.setInterpolator(new AnticipateOvershootInterpolator(animationTension));
        ofFloat.setDuration(firstAnimationDurationMs);
        final ValueAnimator clone = ofFloat.clone();
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment$playPromoCarouselAnimation$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                clone.setStartDelay(secondAnimationDurationMs);
                clone.setInterpolator(new AccelerateDecelerateInterpolator());
                clone.setDuration(secondAnimationDelayMs);
                clone.reverse();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
    }

    public static /* synthetic */ void playPromoCarouselAnimation$default(CardDetailsFragment cardDetailsFragment, float f, float f2, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = kp50.t(50);
        }
        if ((i & 2) != 0) {
            f2 = 3.0f;
        }
        if ((i & 4) != 0) {
            j = 1000;
        }
        if ((i & 8) != 0) {
            j2 = 500;
        }
        cardDetailsFragment.playPromoCarouselAnimation(f, f2, j, j2, (i & 16) != 0 ? 500L : j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playPromoCarouselAnimation$lambda$44$lambda$43(LinearLayoutManager linearLayoutManager, ValueAnimator valueAnimator) {
        linearLayoutManager.r(0, -m810.b(((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 render$lambda$35$lambda$32(pe8 pe8Var, stz0 stz0Var) {
        me8 me8Var = (me8) pe8Var;
        Text e = me8Var.e();
        if (e == null) {
            e = Text.Empty.INSTANCE;
        }
        Text text = e;
        Text d2 = me8Var.d();
        if (d2 == null) {
            d2 = Text.Empty.INSTANCE;
        }
        return stz0.a(stz0Var, text, d2, null, null, null, me8Var.f(), false, false, null, null, 0, 32732);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$35$lambda$33(CardDetailsFragment cardDetailsFragment) {
        cardDetailsFragment.getViewModel().d0();
        return zy11.a;
    }

    private final void renderCardPublicInfo(g661 g661Var, r9j r9jVar) {
        CardRequisiteFieldView cardRequisiteFieldView = g661Var.t;
        YbButtonView ybButtonView = g661Var.i;
        cardRequisiteFieldView.render(r9jVar.i().b());
        g661Var.v.render(r9jVar.i().a());
        g661Var.u.render(r9jVar.i().c());
        rbv k = r9jVar.k();
        AppCompatImageView appCompatImageView = g661Var.j;
        v4b1.k(k, appCompatImageView, null, null, 6);
        appCompatImageView.setContentDescription(com.ybsdk.core.utils.text.d.a(requireContext(), r9jVar.j()));
        YbButtonView ybButtonView2 = g661Var.c;
        ybButtonView2.setVisibility(r9jVar.h() ? 0 : 8);
        ybButtonView2.render(r9jVar.e());
        g661Var.d.render(r9jVar.f());
        ybButtonView.setVisibility(r9jVar.g() != null ? 0 : 8);
        YbButtonView.a g = r9jVar.g();
        if (g != null) {
            ybButtonView.render(g);
        }
        g661Var.f.setVisibility(r9jVar.l().isEmpty() ? 0 : 8);
        this.settingsAdapter.g(r9jVar.l());
        g661Var.e.setVisibility(r9jVar.m() ? 0 : 8);
        renderExternalNfcServiceItemState(g661Var.b, r9jVar.d());
    }

    private final void renderCarousel(g661 g661Var, cp8 cp8Var) {
        g661Var.k.setVisibility(0);
        PageIndicatorView pageIndicatorView = g661Var.l;
        pageIndicatorView.setVisibility(((ArrayList) cp8Var.a()).size() <= 1 ? 8 : 0);
        qa3 qa3Var = this.cardsAdapter;
        if (qa3Var != null) {
            qa3Var.h(cp8Var.a(), new d1(12, cp8Var, this, g661Var));
        }
        pageIndicatorView.render(new PageIndicatorView.a(((ArrayList) cp8Var.a()).size(), 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderCarousel$lambda$47(cp8 cp8Var, CardDetailsFragment cardDetailsFragment, g661 g661Var) {
        if (cp8Var.b()) {
            playPromoCarouselAnimation$default(cardDetailsFragment, 0.0f, 0.0f, 0L, 0L, 0L, 31, null);
        }
        if (cp8Var.c().b()) {
            g661Var.k.setCurrentItem(cp8Var.c().a(), false);
        } else if (cp8Var.c().a() != g661Var.k.getCurrentItem()) {
            g661Var.k.setCurrentItem(cp8Var.c().a(), true);
        }
        g661Var.k.requestTransform();
    }

    private final void renderExternalNfcServiceItemState(ListItemButton listItemButton, o0p o0pVar) {
        if (jl40.l(o0pVar, wfz.E)) {
            com.ybsdk.core.utils.ext.view.b.A(listItemButton);
            listItemButton.stopShimmer();
            listItemButton.setEnabled(true);
        } else if (jl40.l(o0pVar, h2b1.F)) {
            com.ybsdk.core.utils.ext.view.b.A(listItemButton);
            listItemButton.startShimmer();
            listItemButton.setEnabled(false);
        } else if (jl40.l(o0pVar, dab1.F)) {
            com.ybsdk.core.utils.ext.view.b.l(listItemButton);
        } else {
            w511.b();
        }
    }

    private final void renderInformation(g661 g661Var, p9j p9jVar) {
        g661Var.n.render(p9jVar.d());
        g661Var.e.setVisibility(8);
    }

    private final void renderPromoInfo(g661 g661Var, q9j q9jVar) {
        qa3 qa3Var = this.promoInfoAdapter;
        if (qa3Var != null) {
            qa3Var.g(q9jVar.e());
        }
        YbButtonView ybButtonView = g661Var.g;
        TabView tabView = g661Var.s;
        YbButtonView ybButtonView2 = g661Var.h;
        TextView textView = g661Var.p;
        int i = 8;
        ybButtonView.setVisibility(q9jVar.f() != null ? 0 : 8);
        YbButtonView.a f = q9jVar.f();
        if (f != null) {
            g661Var.g.render(f);
        }
        ybButtonView2.setVisibility(q9jVar.g() != null ? 0 : 8);
        YbButtonView.a g = q9jVar.g();
        if (g != null) {
            ybButtonView2.render(g);
        }
        textView.setVisibility(q9jVar.d() != null ? 0 : 8);
        if (evu0.J(textView.getText()) || !jl40.l(this.currPromoAgreement, q9jVar.d())) {
            String d2 = q9jVar.d();
            textView.setText(d2 != null ? rtu.a(new rd8(this, r6), d2) : null);
            String d3 = q9jVar.d();
            if (d3 != null) {
                this.currPromoAgreement = d3;
            }
        }
        tabView.setVisibility(q9jVar.h() == null ? 8 : 0);
        tabView.render(new cx7(i, q9jVar));
        g661Var.e.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderPromoInfo$lambda$40(CardDetailsFragment cardDetailsFragment, String str) {
        ((com.ybsdk.di.modules.features.c) cardDetailsFragment.cardOpenScreenHelper).c(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j5x0 renderPromoInfo$lambda$42(q9j q9jVar, j5x0 j5x0Var) {
        j5x0 h = q9jVar.h();
        return h == null ? j5x0Var : h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean settingsAdapter$lambda$0(CardDetailsFragment cardDetailsFragment, g9r0 g9r0Var, boolean z) {
        cardDetailsFragment.getViewModel().r0(g9r0Var);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 settingsAdapter$lambda$1(SettingsTheme settingsTheme) {
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showSamsungPayBottomSheet(sls mainAction) {
        BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
        bottomSheetDialogView.onPrimaryAction(new k5(15, mainAction, bottomSheetDialogView));
        bottomSheetDialogView.onSecondaryAction(new if6(bottomSheetDialogView, 1));
        ColorModel colorModel = null;
        ColorModel colorModel2 = null;
        ColorModel colorModel3 = null;
        boolean z = false;
        Object[] objArr = 0 == true ? 1 : 0;
        YbButtonView.a aVar = new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_card_samsung_pay_bottom_sheet_primary_button_text), objArr, null, null, colorModel, colorModel2, colorModel3, false, z, null, 4094);
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        bottomSheetDialogView.render(new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(new Text.Resource(dzh0.ybsdk_card_samsung_pay_bottom_sheet_title), new Text.Resource(dzh0.ybsdk_card_samsung_pay_bottom_sheet_description), null, null, null, null, HProv.PP_SAME_MEDIA), aVar, new YbButtonView.a(new Text.Resource(dzh0.ybsdk_card_samsung_pay_bottom_sheet_secondary_button_text), objArr2, objArr3, colorModel, colorModel2, colorModel3, null, z, false, null, 4094), null, null, null, null, null, null, 131064));
        BottomSheetDialogView.show$default(bottomSheetDialogView, requireActivity(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSamsungPayBottomSheet$lambda$52$lambda$50(sls slsVar, BottomSheetDialogView bottomSheetDialogView, View view) {
        slsVar.invoke();
        bottomSheetDialogView.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        ImageView icon;
        he8 he8Var = sideEffect instanceof he8 ? (he8) sideEffect : null;
        if (he8Var == null) {
            return;
        }
        if (he8Var instanceof fe8) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((fe8) he8Var).a(), null, 12);
            return;
        }
        if (he8Var instanceof de8) {
            de8 de8Var = (de8) he8Var;
            rje.b(requireContext(), de8Var.b(), getString(de8Var.a()));
            return;
        }
        if (!(he8Var instanceof ge8)) {
            if (he8Var instanceof ee8) {
                showSamsungPayBottomSheet(((ee8) he8Var).a());
                return;
            } else {
                w511.b();
                return;
            }
        }
        ge8 ge8Var = (ge8) he8Var;
        int i = ud8.a[ge8Var.b().ordinal()];
        if (i == 1) {
            icon = ((g661) getBinding()).v.getIcon();
        } else if (i == 2) {
            icon = ((g661) getBinding()).u.getIcon();
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            icon = ((g661) getBinding()).t.getIcon();
        }
        buz0 d2 = frb1.d(requireContext());
        com.ybsdk.core.utils.text.b bVar = Text.Companion;
        String string = getString(ge8Var.a());
        bVar.getClass();
        d2.l(new Text.Constant(string));
        d2.a().f(icon, 0L);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public com.ybsdk.feature.card.internal.presentation.carddetails.b getFactoryOfViewModel() {
        return ((le8) this.viewModelFactory).a((CardDetailsScreenArguments) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public g661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        g661 p = g661.p(getLayoutInflater());
        createDetailsGroup(p);
        final int i = 0;
        p.m.setPrimaryButtonOnClickListener(new md8(this, i));
        p.f.setOnClickListener(new View.OnClickListener(this) { // from class: nd8
            public final /* synthetic */ CardDetailsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                CardDetailsFragment cardDetailsFragment = this.b;
                switch (i2) {
                    case 0:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$3(cardDetailsFragment, view);
                        break;
                    case 1:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$4(cardDetailsFragment, view);
                        break;
                    case 2:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$5(cardDetailsFragment, view);
                        break;
                    case 3:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$6(cardDetailsFragment, view);
                        break;
                    case 4:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$7(cardDetailsFragment, view);
                        break;
                    case 5:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$8(cardDetailsFragment, view);
                        break;
                    case 6:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$9(cardDetailsFragment, view);
                        break;
                    case 7:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$12(cardDetailsFragment, view);
                        break;
                    case 8:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$13(cardDetailsFragment, view);
                        break;
                    case 9:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$14(cardDetailsFragment, view);
                        break;
                    default:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$15(cardDetailsFragment, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        p.d.setOnClickListener(new View.OnClickListener(this) { // from class: nd8
            public final /* synthetic */ CardDetailsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                CardDetailsFragment cardDetailsFragment = this.b;
                switch (i22) {
                    case 0:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$3(cardDetailsFragment, view);
                        break;
                    case 1:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$4(cardDetailsFragment, view);
                        break;
                    case 2:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$5(cardDetailsFragment, view);
                        break;
                    case 3:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$6(cardDetailsFragment, view);
                        break;
                    case 4:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$7(cardDetailsFragment, view);
                        break;
                    case 5:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$8(cardDetailsFragment, view);
                        break;
                    case 6:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$9(cardDetailsFragment, view);
                        break;
                    case 7:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$12(cardDetailsFragment, view);
                        break;
                    case 8:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$13(cardDetailsFragment, view);
                        break;
                    case 9:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$14(cardDetailsFragment, view);
                        break;
                    default:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$15(cardDetailsFragment, view);
                        break;
                }
            }
        });
        final int i3 = 2;
        p.i.setOnClickListener(new View.OnClickListener(this) { // from class: nd8
            public final /* synthetic */ CardDetailsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                CardDetailsFragment cardDetailsFragment = this.b;
                switch (i22) {
                    case 0:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$3(cardDetailsFragment, view);
                        break;
                    case 1:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$4(cardDetailsFragment, view);
                        break;
                    case 2:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$5(cardDetailsFragment, view);
                        break;
                    case 3:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$6(cardDetailsFragment, view);
                        break;
                    case 4:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$7(cardDetailsFragment, view);
                        break;
                    case 5:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$8(cardDetailsFragment, view);
                        break;
                    case 6:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$9(cardDetailsFragment, view);
                        break;
                    case 7:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$12(cardDetailsFragment, view);
                        break;
                    case 8:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$13(cardDetailsFragment, view);
                        break;
                    case 9:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$14(cardDetailsFragment, view);
                        break;
                    default:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$15(cardDetailsFragment, view);
                        break;
                }
            }
        });
        final int i4 = 3;
        p.c.setOnClickListener(new View.OnClickListener(this) { // from class: nd8
            public final /* synthetic */ CardDetailsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i4;
                CardDetailsFragment cardDetailsFragment = this.b;
                switch (i22) {
                    case 0:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$3(cardDetailsFragment, view);
                        break;
                    case 1:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$4(cardDetailsFragment, view);
                        break;
                    case 2:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$5(cardDetailsFragment, view);
                        break;
                    case 3:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$6(cardDetailsFragment, view);
                        break;
                    case 4:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$7(cardDetailsFragment, view);
                        break;
                    case 5:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$8(cardDetailsFragment, view);
                        break;
                    case 6:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$9(cardDetailsFragment, view);
                        break;
                    case 7:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$12(cardDetailsFragment, view);
                        break;
                    case 8:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$13(cardDetailsFragment, view);
                        break;
                    case 9:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$14(cardDetailsFragment, view);
                        break;
                    default:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$15(cardDetailsFragment, view);
                        break;
                }
            }
        });
        final int i5 = 4;
        p.b.setOnClickListener(new View.OnClickListener(this) { // from class: nd8
            public final /* synthetic */ CardDetailsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i5;
                CardDetailsFragment cardDetailsFragment = this.b;
                switch (i22) {
                    case 0:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$3(cardDetailsFragment, view);
                        break;
                    case 1:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$4(cardDetailsFragment, view);
                        break;
                    case 2:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$5(cardDetailsFragment, view);
                        break;
                    case 3:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$6(cardDetailsFragment, view);
                        break;
                    case 4:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$7(cardDetailsFragment, view);
                        break;
                    case 5:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$8(cardDetailsFragment, view);
                        break;
                    case 6:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$9(cardDetailsFragment, view);
                        break;
                    case 7:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$12(cardDetailsFragment, view);
                        break;
                    case 8:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$13(cardDetailsFragment, view);
                        break;
                    case 9:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$14(cardDetailsFragment, view);
                        break;
                    default:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$15(cardDetailsFragment, view);
                        break;
                }
            }
        });
        final int i6 = 5;
        p.g.setOnClickListener(new View.OnClickListener(this) { // from class: nd8
            public final /* synthetic */ CardDetailsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i6;
                CardDetailsFragment cardDetailsFragment = this.b;
                switch (i22) {
                    case 0:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$3(cardDetailsFragment, view);
                        break;
                    case 1:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$4(cardDetailsFragment, view);
                        break;
                    case 2:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$5(cardDetailsFragment, view);
                        break;
                    case 3:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$6(cardDetailsFragment, view);
                        break;
                    case 4:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$7(cardDetailsFragment, view);
                        break;
                    case 5:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$8(cardDetailsFragment, view);
                        break;
                    case 6:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$9(cardDetailsFragment, view);
                        break;
                    case 7:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$12(cardDetailsFragment, view);
                        break;
                    case 8:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$13(cardDetailsFragment, view);
                        break;
                    case 9:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$14(cardDetailsFragment, view);
                        break;
                    default:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$15(cardDetailsFragment, view);
                        break;
                }
            }
        });
        final int i7 = 6;
        p.h.setOnClickListener(new View.OnClickListener(this) { // from class: nd8
            public final /* synthetic */ CardDetailsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i7;
                CardDetailsFragment cardDetailsFragment = this.b;
                switch (i22) {
                    case 0:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$3(cardDetailsFragment, view);
                        break;
                    case 1:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$4(cardDetailsFragment, view);
                        break;
                    case 2:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$5(cardDetailsFragment, view);
                        break;
                    case 3:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$6(cardDetailsFragment, view);
                        break;
                    case 4:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$7(cardDetailsFragment, view);
                        break;
                    case 5:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$8(cardDetailsFragment, view);
                        break;
                    case 6:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$9(cardDetailsFragment, view);
                        break;
                    case 7:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$12(cardDetailsFragment, view);
                        break;
                    case 8:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$13(cardDetailsFragment, view);
                        break;
                    case 9:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$14(cardDetailsFragment, view);
                        break;
                    default:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$15(cardDetailsFragment, view);
                        break;
                }
            }
        });
        p.e.setOnClickListener(new od8(i));
        p.n.setSecondaryButtonClickListener(new md8(this, i2));
        p.x.setAdapter(this.settingsAdapter);
        final int i8 = 7;
        p.j.setOnClickListener(new View.OnClickListener(this) { // from class: nd8
            public final /* synthetic */ CardDetailsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i8;
                CardDetailsFragment cardDetailsFragment = this.b;
                switch (i22) {
                    case 0:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$3(cardDetailsFragment, view);
                        break;
                    case 1:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$4(cardDetailsFragment, view);
                        break;
                    case 2:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$5(cardDetailsFragment, view);
                        break;
                    case 3:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$6(cardDetailsFragment, view);
                        break;
                    case 4:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$7(cardDetailsFragment, view);
                        break;
                    case 5:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$8(cardDetailsFragment, view);
                        break;
                    case 6:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$9(cardDetailsFragment, view);
                        break;
                    case 7:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$12(cardDetailsFragment, view);
                        break;
                    case 8:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$13(cardDetailsFragment, view);
                        break;
                    case 9:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$14(cardDetailsFragment, view);
                        break;
                    default:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$15(cardDetailsFragment, view);
                        break;
                }
            }
        });
        final int i9 = 8;
        p.v.setOnClickListener(new View.OnClickListener(this) { // from class: nd8
            public final /* synthetic */ CardDetailsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i9;
                CardDetailsFragment cardDetailsFragment = this.b;
                switch (i22) {
                    case 0:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$3(cardDetailsFragment, view);
                        break;
                    case 1:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$4(cardDetailsFragment, view);
                        break;
                    case 2:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$5(cardDetailsFragment, view);
                        break;
                    case 3:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$6(cardDetailsFragment, view);
                        break;
                    case 4:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$7(cardDetailsFragment, view);
                        break;
                    case 5:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$8(cardDetailsFragment, view);
                        break;
                    case 6:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$9(cardDetailsFragment, view);
                        break;
                    case 7:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$12(cardDetailsFragment, view);
                        break;
                    case 8:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$13(cardDetailsFragment, view);
                        break;
                    case 9:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$14(cardDetailsFragment, view);
                        break;
                    default:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$15(cardDetailsFragment, view);
                        break;
                }
            }
        });
        final int i10 = 9;
        p.u.setOnClickListener(new View.OnClickListener(this) { // from class: nd8
            public final /* synthetic */ CardDetailsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i10;
                CardDetailsFragment cardDetailsFragment = this.b;
                switch (i22) {
                    case 0:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$3(cardDetailsFragment, view);
                        break;
                    case 1:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$4(cardDetailsFragment, view);
                        break;
                    case 2:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$5(cardDetailsFragment, view);
                        break;
                    case 3:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$6(cardDetailsFragment, view);
                        break;
                    case 4:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$7(cardDetailsFragment, view);
                        break;
                    case 5:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$8(cardDetailsFragment, view);
                        break;
                    case 6:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$9(cardDetailsFragment, view);
                        break;
                    case 7:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$12(cardDetailsFragment, view);
                        break;
                    case 8:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$13(cardDetailsFragment, view);
                        break;
                    case 9:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$14(cardDetailsFragment, view);
                        break;
                    default:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$15(cardDetailsFragment, view);
                        break;
                }
            }
        });
        final int i11 = 10;
        p.t.setOnClickListener(new View.OnClickListener(this) { // from class: nd8
            public final /* synthetic */ CardDetailsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i11;
                CardDetailsFragment cardDetailsFragment = this.b;
                switch (i22) {
                    case 0:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$3(cardDetailsFragment, view);
                        break;
                    case 1:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$4(cardDetailsFragment, view);
                        break;
                    case 2:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$5(cardDetailsFragment, view);
                        break;
                    case 3:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$6(cardDetailsFragment, view);
                        break;
                    case 4:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$7(cardDetailsFragment, view);
                        break;
                    case 5:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$8(cardDetailsFragment, view);
                        break;
                    case 6:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$9(cardDetailsFragment, view);
                        break;
                    case 7:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$12(cardDetailsFragment, view);
                        break;
                    case 8:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$13(cardDetailsFragment, view);
                        break;
                    case 9:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$14(cardDetailsFragment, view);
                        break;
                    default:
                        CardDetailsFragment.getViewBinding$lambda$27$lambda$15(cardDetailsFragment, view);
                        break;
                }
            }
        });
        wd8 wd8Var = this.promoInfoDiffCallback;
        Object obj = y5e.a;
        synchronized (obj) {
            try {
                if (y5e.b == null) {
                    y5e.b = Executors.newFixedThreadPool(2);
                }
            } finally {
            }
        }
        qa3 qa3Var = new qa3(new lb7(i10, y5e.b, wd8Var), new lum(new mq5(11), a.a, new sd8(i2), b.a));
        this.promoInfoAdapter = qa3Var;
        p.r.setAdapter(qa3Var);
        p.r.setItemAnimator(null);
        p.p.setMovementMethod(LinkMovementMethod.getInstance());
        xd8 xd8Var = this.ybCardDiffCallback;
        synchronized (obj) {
            try {
                if (y5e.b == null) {
                    y5e.b = Executors.newFixedThreadPool(2);
                }
            } finally {
            }
        }
        qa3 qa3Var2 = new qa3(new lb7(i10, y5e.b, xd8Var), new lum(new mq5(12), c.a, new sd8(i3), d.a));
        this.cardsAdapter = qa3Var2;
        p.k.setAdapter(qa3Var2);
        p.k.setOffscreenPageLimit(1);
        p.k.setPageTransformer(new bl8(requireContext()));
        p.k.registerOnPageChangeCallback(new vd8(this));
        p.l.attachToViewPager(p.k);
        p.s.setOnTabSelectedListener(new rd8(this, i2));
        p.w.setOnScrollChangeListener(new gk1(i2, p));
        p.A.setRightImageContentDescription(getString(dzh0.ybsdk_dashboard_accessibility_dashboard_promo_type));
        return p;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        handle2faResult$default(this, CardSecondFactorHelper$Request.FREEZING, new CardDetailsFragment$onCreate$1(getViewModel()), null, 4, null);
        handle2faResult(CardSecondFactorHelper$Request.SETTINGS, new CardDetailsFragment$onCreate$2(getViewModel()), new CardDetailsFragment$onCreate$3(getViewModel()));
        handle2faResult(CardSecondFactorHelper$Request.REQUISITES, new CardDetailsFragment$onCreate$4(getViewModel()), new CardDetailsFragment$onCreate$5(getViewModel()));
        final int i = 0;
        getParentFragmentManager().m0(CardLimitFragment.SAVE_LIMIT_RESULT, this, new kds(this) { // from class: qd8
            public final /* synthetic */ CardDetailsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.kds
            public final void s(Bundle bundle, String str) {
                int i2 = i;
                CardDetailsFragment cardDetailsFragment = this.b;
                switch (i2) {
                    case 0:
                        CardDetailsFragment.onCreate$lambda$28(cardDetailsFragment, str, bundle);
                        break;
                    default:
                        CardDetailsFragment.onCreate$lambda$29(cardDetailsFragment, str, bundle);
                        break;
                }
            }
        });
        final int i2 = 1;
        getParentFragmentManager().m0(CardReissueFragment.CARD_REISSUE_RESULT_KEY, this, new kds(this) { // from class: qd8
            public final /* synthetic */ CardDetailsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.kds
            public final void s(Bundle bundle, String str) {
                int i22 = i2;
                CardDetailsFragment cardDetailsFragment = this.b;
                switch (i22) {
                    case 0:
                        CardDetailsFragment.onCreate$lambda$28(cardDetailsFragment, str, bundle);
                        break;
                    default:
                        CardDetailsFragment.onCreate$lambda$29(cardDetailsFragment, str, bundle);
                        break;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getViewModel().q0();
        ((g661) getBinding()).k.requestTransform();
        ((g661) getBinding()).o().requestApplyInsets();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((hf8) this.bottomSheetInteractor).b(getViewLifecycleOwner().getLifecycle(), new md8(this, 2));
        hua1.g(this, "SETTINGS_TERM_FRAGMENT_CLOSED_RESULT_KEY", new pd8(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(pe8 viewState) {
        enableSensitiveDataMode(viewState);
        ErrorView errorView = ((g661) getBinding()).m;
        boolean z = viewState instanceof ne8;
        ne8 ne8Var = z ? (ne8) viewState : null;
        errorView.render(ne8Var != null ? ne8Var.a() : null);
        g661 g661Var = (g661) getBinding();
        if (!(viewState instanceof me8)) {
            if (z) {
                g661Var.o.setVisibility(8);
                g661Var.y.setVisibility(8);
                return;
            } else if (!viewState.equals(oe8.a)) {
                w511.b();
                return;
            } else {
                g661Var.o.setVisibility(8);
                g661Var.y.setVisibility(0);
                return;
            }
        }
        g661Var.A.render(new cx7(7, viewState));
        g661Var.A.setOnRightImageClickListener(new md8(this, 3));
        g661Var.o.setVisibility(0);
        g661Var.y.setVisibility(8);
        me8 me8Var = (me8) viewState;
        renderCarousel(g661Var, me8Var.b());
        g661Var.q.setVisibility(me8Var.a() instanceof q9j ? 0 : 8);
        Iterator<T> it = this.detailsGroup.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(me8Var.a() instanceof r9j ? 0 : 8);
        }
        g661Var.n.setVisibility(me8Var.a() instanceof p9j ? 0 : 8);
        gf91 a2 = me8Var.a();
        if (a2 instanceof r9j) {
            renderCardPublicInfo(g661Var, (r9j) a2);
            return;
        }
        if (a2 instanceof q9j) {
            renderPromoInfo(g661Var, (q9j) a2);
        } else if (a2 instanceof p9j) {
            renderInformation(g661Var, (p9j) a2);
        } else {
            w511.b();
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
