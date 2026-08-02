package com.yandex.go.mainscreen.superapp.impl.foundation.presentation;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.flex.main_screen.api.domain.SuperappTopPlaqueType;
import com.yandex.go.mainscreen.superapp.api.sidepager.MainSidePagerSidePage;
import com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.SuperAppLogoPositionRepository$LogoPosition;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenFlexModalView;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.flex.FeedScrollUpButton;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.MainSidePager;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperAppMainScreenHeader;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperappMainFloatingHeader;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperappMainFloatingHeaderContainer;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperappMainFloatingHeaderTopPlaqueView;
import com.yandex.go.mainscreen.superapp.popup.presentation.SuperAppMainScreenPopupView;
import com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.SuperAppMainOnboardingView;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a3w0;
import defpackage.a941;
import defpackage.acw0;
import defpackage.b941;
import defpackage.bae0;
import defpackage.bkv0;
import defpackage.c0g;
import defpackage.c2x0;
import defpackage.cd00;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.d2x0;
import defpackage.dai0;
import defpackage.dcw0;
import defpackage.dd00;
import defpackage.edc;
import defpackage.f0w0;
import defpackage.f2w0;
import defpackage.ffe;
import defpackage.fwx0;
import defpackage.g18;
import defpackage.g1w0;
import defpackage.ga1;
import defpackage.gci0;
import defpackage.h0w0;
import defpackage.h1w0;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.i4w0;
import defpackage.ip11;
import defpackage.is8;
import defpackage.j800;
import defpackage.jb7;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.k2w0;
import defpackage.k801;
import defpackage.kxl0;
import defpackage.kyh0;
import defpackage.l76;
import defpackage.l900;
import defpackage.lbw0;
import defpackage.lhc;
import defpackage.lnv0;
import defpackage.lp2;
import defpackage.lx4;
import defpackage.m76;
import defpackage.m900;
import defpackage.mag;
import defpackage.mdh;
import defpackage.mj10;
import defpackage.mqg0;
import defpackage.n1d;
import defpackage.n900;
import defpackage.ney;
import defpackage.ny61;
import defpackage.o4w0;
import defpackage.o900;
import defpackage.oep0;
import defpackage.pho;
import defpackage.q1w0;
import defpackage.q5z;
import defpackage.qje;
import defpackage.r1w0;
import defpackage.r3w0;
import defpackage.rbw0;
import defpackage.rqo;
import defpackage.rx2;
import defpackage.s1w0;
import defpackage.sa00;
import defpackage.sbw0;
import defpackage.sjh;
import defpackage.sls;
import defpackage.sy60;
import defpackage.t1w;
import defpackage.tbw0;
import defpackage.tcu;
import defpackage.tig0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.tyz0;
import defpackage.u1w0;
import defpackage.u45;
import defpackage.u900;
import defpackage.ucu;
import defpackage.uyj;
import defpackage.v66;
import defpackage.vc00;
import defpackage.vcu;
import defpackage.vng;
import defpackage.w030;
import defpackage.w130;
import defpackage.w49;
import defpackage.w511;
import defpackage.w66;
import defpackage.wc00;
import defpackage.wth0;
import defpackage.x1w0;
import defpackage.x4e;
import defpackage.x841;
import defpackage.xng0;
import defpackage.xvf0;
import defpackage.xzv0;
import defpackage.y0w0;
import defpackage.yih0;
import defpackage.yvf0;
import defpackage.yzv0;
import defpackage.zbw0;
import defpackage.zww0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.altpins.order.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;
import ru.yandex.taxi.design.LocationButtonIconComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewBottomRounded$1;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.modalview.ModalViewCoordinator$StackChangeType;

@Metadata(d1 = {"\u0000Î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004*\u0002¯\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002¸\u0001Bÿ\u0001\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\n\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\b\b\u0001\u00101\u001a\u000200\u0012\b\b\u0001\u00103\u001a\u000202\u0012\b\b\u0001\u00105\u001a\u000204\u0012\b\b\u0001\u00107\u001a\u000206\u0012\n\b\u0001\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0014¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0014¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0015¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH\u0014¢\u0006\u0004\bF\u0010GJ\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u0010HJ\u0017\u0010J\u001a\u00020E2\u0006\u0010I\u001a\u000208H\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020E2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020EH\u0016¢\u0006\u0004\bP\u0010GJ\u000f\u0010Q\u001a\u00020EH\u0014¢\u0006\u0004\bQ\u0010GJ\u0017\u0010T\u001a\u00020E2\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020LH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010Z\u001a\u00020E2\u0006\u0010Y\u001a\u00020XH\u0016¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020EH\u0002¢\u0006\u0004\b\\\u0010GJ\u000f\u0010]\u001a\u00020EH\u0002¢\u0006\u0004\b]\u0010GJ\u0019\u0010_\u001a\u00020E2\b\b\u0002\u0010^\u001a\u00020LH\u0002¢\u0006\u0004\b_\u0010OJ\u000f\u0010`\u001a\u00020EH\u0002¢\u0006\u0004\b`\u0010GJ\u001f\u0010d\u001a\u00020<2\u0006\u0010a\u001a\u0002002\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010h\u001a\u00020<2\u0006\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00020<2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020EH\u0002¢\u0006\u0004\bl\u0010GJ\u000f\u0010m\u001a\u00020EH\u0002¢\u0006\u0004\bm\u0010GJ\u0017\u0010p\u001a\u00020E2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020EH\u0002¢\u0006\u0004\br\u0010GJ\u000f\u0010s\u001a\u00020EH\u0002¢\u0006\u0004\bs\u0010GJ\u000f\u0010t\u001a\u00020EH\u0002¢\u0006\u0004\bt\u0010GJ\u0017\u0010u\u001a\u00020E2\u0006\u0010I\u001a\u00020<H\u0002¢\u0006\u0004\bu\u0010vR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010wR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010xR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010yR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010zR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010{R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010|R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010}R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010~R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u007fR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010yR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010yR\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0080\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010\u0081\u0001R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010\u0082\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010\u0083\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010\u0084\u0001R\u0015\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010\u0085\u0001R\u0015\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010\u0086\u0001R\u0015\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b1\u0010\u0087\u0001R\u0015\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b3\u0010\u0088\u0001R\u0015\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010\u0089\u0001R\u0015\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010\u008a\u0001R\u0017\u0010\u008b\u0001\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001e\u0010\u008d\u0001\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u008c\u0001\u0012\u0005\b\u008e\u0001\u0010GR.\u0010\u0090\u0001\u001a\u0004\u0018\u0001082\t\u0010\u008f\u0001\u001a\u0004\u0018\u0001088\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001b\u0010\u0094\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0017\u0010\u009c\u0001\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R!\u0010©\u0001\u001a\u00030¤\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R!\u0010®\u0001\u001a\u00030ª\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010¦\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0018\u0010°\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001a\u0010³\u0001\u001a\u00030²\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0018\u0010¶\u0001\u001a\u00030µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001¨\u0006¹\u0001"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/impl/foundation/presentation/SuperAppMainScreenFlexModalView;", "Lru/yandex/taxi/widget/ModalView;", "Lk2w0;", "Lnwy0;", "Landroid/content/Context;", "context", "Lw66;", "blurDelegateFactory", "Lzbw0;", "superappMainRepository", "Lh3y;", "Lh0w0;", "headerPresenterLazy", "Lw49;", "cashbackViewFactory", "Lsa00;", "mainScreenOpenedAnalytics", "Lxzv0;", "superAppFlexAnalytics", "Lg1w0;", "onboardingViewFactory", "Ltyz0;", "totalRecyclerViewScrolledRepository", "Lzww0;", "suspendUntilMainScreenLoadedInteractor", "Lcom/yandex/go/mainscreen/superapp/impl/clarifyaddress/presentation/b;", "topPlaquePresenterLazy", "Lcom/yandex/go/mainscreen/superapp/impl/clarifyaddress/presentation/a;", "compactTopPlaquePresenterLazy", "Lyvf0;", "Ldcw0;", "superappMainScreenFloatingPresenter", "Lmj10;", "menuBadgeFactory", "Lf0w0;", "logoViewDelegate", "Lc2x0;", "systemBarsCoordinator", "Lrqo;", "experimentProviderFactory", "Lcd00;", "mainSidePagerStateRepository", "Lvc00;", "mainSidePagerNavigator", "Lcom/yandex/go/mainscreen/superapp/impl/foundation/presentation/sidepager/a;", "mainSidePagerIntegration", "Lq1w0;", "mainScreenFeaturesRepository", "Lvcu;", "headerType", "Lcom/yandex/go/flex/main_screen/api/domain/SuperappTopPlaqueType;", "topPlaqueType", "Lcom/yandex/go/mainscreen/superapp/impl/foundation/presentation/e;", "presenter", "Li4w0;", "component", "Lo900;", "initialBottomView", "<init>", "(Landroid/content/Context;Lw66;Lzbw0;Lh3y;Lw49;Lsa00;Lxzv0;Lg1w0;Ltyz0;Lzww0;Lh3y;Lh3y;Lyvf0;Lmj10;Lf0w0;Lc2x0;Lrqo;Lcd00;Lvc00;Lcom/yandex/go/mainscreen/superapp/impl/foundation/presentation/sidepager/a;Lq1w0;Lvcu;Lcom/yandex/go/flex/main_screen/api/domain/SuperappTopPlaqueType;Lcom/yandex/go/mainscreen/superapp/impl/foundation/presentation/e;Li4w0;Lo900;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lw130;", "insetsType", "()Lw130;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Lzy11;", "onAttachedToWindow", "()V", "()Lvcu;", "view", "renderBottomView", "(Lo900;)V", "", "isVisible", "setMyLocationButtonVisible", "(Z)V", "scrollUp", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "applyThemeForChildrenByDefault", "()Z", "Lf2w0;", "headerState", "clarifyAddressViewVisibilityChanged", "(Lf2w0;)V", "attachMyLocationButton", "removeOnboardingView", "isClarifyAddressVisible", "updateBackground", "updateFlexSdkContainerBackground", "type", "Landroid/view/ViewGroup;", "parent", "initHeader", "(Lvcu;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/yandex/go/mainscreen/superapp/impl/foundation/data/repository/SuperAppLogoPositionRepository$LogoPosition;", "logoPosition", "initStickyHeader", "(Lcom/yandex/go/mainscreen/superapp/impl/foundation/data/repository/SuperAppLogoPositionRepository$LogoPosition;)Landroid/view/View;", "initFloatingHeader", "(Landroid/view/ViewGroup;)Landroid/view/View;", "initOnboardingView", "updateStatusBarThemeByFloatingHeaderPosition", "Lcom/yandex/go/mainscreen/superapp/api/sidepager/MainSidePagerSidePage;", "sidePage", "applySidePagerState", "(Lcom/yandex/go/mainscreen/superapp/api/sidepager/MainSidePagerSidePage;)V", "setupMainSidePager", "attachFallbackAssistant", "addModalViewCoordinatorListener", "onRecyclerViewAttached", "(Landroid/view/View;)V", "Lw66;", "Lzbw0;", "Lh3y;", "Lw49;", "Lsa00;", "Lxzv0;", "Lg1w0;", "Ltyz0;", "Lzww0;", "Lyvf0;", "Lmj10;", "Lf0w0;", "Lc2x0;", "Lcd00;", "Lvc00;", "Lcom/yandex/go/mainscreen/superapp/impl/foundation/presentation/sidepager/a;", "Lvcu;", "Lcom/yandex/go/flex/main_screen/api/domain/SuperappTopPlaqueType;", "Lcom/yandex/go/mainscreen/superapp/impl/foundation/presentation/e;", "Li4w0;", "isSupermapEnabled", "Z", "isOptimizedShimmeringEnabled", "isOptimizedShimmeringEnabled$annotations", "value", "bottomView", "Lo900;", "getBottomView", "()Lo900;", "isTopPlaqueUnderStatusBar", "Ljava/lang/Boolean;", "Lhbp0;", "scope", "Lhbp0;", "Lr1w0;", "binding", "Lr1w0;", "headerView", "Landroid/view/View;", "Llbw0;", "appBar", "Llbw0;", "Lv66;", "contentBlurDelegate", "Lv66;", "Lcom/yandex/go/mainscreen/superapp/impl/foundation/presentation/flex/FeedScrollUpButton;", "scrollUpButton$delegate", "Li3y;", "getScrollUpButton", "()Lcom/yandex/go/mainscreen/superapp/impl/foundation/presentation/flex/FeedScrollUpButton;", "scrollUpButton", "Lru/yandex/taxi/design/LocationButtonIconComponent;", "myLocationButton$delegate", "getMyLocationButton", "()Lru/yandex/taxi/design/LocationButtonIconComponent;", "myLocationButton", "x1w0", "scrollListener", "Lx1w0;", "Lg18;", "coordinatorListenerCancellable", "Lg18;", "", "tempLocation", "[I", "z1w0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperAppMainScreenFlexModalView extends ModalView implements k2w0 {
    private final lbw0 appBar;
    private final r1w0 binding;
    private final w66 blurDelegateFactory;
    private o900 bottomView;
    private final w49 cashbackViewFactory;
    private final h3y compactTopPlaquePresenterLazy;
    private final i4w0 component;
    private v66 contentBlurDelegate;
    private g18 coordinatorListenerCancellable;
    private final h3y headerPresenterLazy;
    private final vcu headerType;
    private final View headerView;
    private final boolean isOptimizedShimmeringEnabled;
    private final boolean isSupermapEnabled;
    private Boolean isTopPlaqueUnderStatusBar;
    private final f0w0 logoViewDelegate;
    private final sa00 mainScreenOpenedAnalytics;
    private final com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.a mainSidePagerIntegration;
    private final vc00 mainSidePagerNavigator;
    private final cd00 mainSidePagerStateRepository;
    private final mj10 menuBadgeFactory;

    /* renamed from: myLocationButton$delegate, reason: from kotlin metadata */
    private final i3y myLocationButton;
    private final g1w0 onboardingViewFactory;
    private final e presenter;
    private final hbp0 scope;
    private final x1w0 scrollListener;

    /* renamed from: scrollUpButton$delegate, reason: from kotlin metadata */
    private final i3y scrollUpButton;
    private final xzv0 superAppFlexAnalytics;
    private final zbw0 superappMainRepository;
    private final yvf0 superappMainScreenFloatingPresenter;
    private final zww0 suspendUntilMainScreenLoadedInteractor;
    private final c2x0 systemBarsCoordinator;
    private final int[] tempLocation;
    private final h3y topPlaquePresenterLazy;
    private final SuperappTopPlaqueType topPlaqueType;
    private final tyz0 totalRecyclerViewScrolledRepository;

    public SuperAppMainScreenFlexModalView(final Context context, w66 w66Var, zbw0 zbw0Var, h3y h3yVar, w49 w49Var, sa00 sa00Var, xzv0 xzv0Var, g1w0 g1w0Var, tyz0 tyz0Var, zww0 zww0Var, h3y h3yVar2, h3y h3yVar3, yvf0 yvf0Var, mj10 mj10Var, f0w0 f0w0Var, c2x0 c2x0Var, rqo rqoVar, cd00 cd00Var, vc00 vc00Var, com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.a aVar, q1w0 q1w0Var, vcu vcuVar, SuperappTopPlaqueType superappTopPlaqueType, e eVar, i4w0 i4w0Var, o900 o900Var) {
        super(context);
        this.blurDelegateFactory = w66Var;
        this.superappMainRepository = zbw0Var;
        this.headerPresenterLazy = h3yVar;
        this.cashbackViewFactory = w49Var;
        this.mainScreenOpenedAnalytics = sa00Var;
        this.superAppFlexAnalytics = xzv0Var;
        this.onboardingViewFactory = g1w0Var;
        this.totalRecyclerViewScrolledRepository = tyz0Var;
        this.suspendUntilMainScreenLoadedInteractor = zww0Var;
        this.topPlaquePresenterLazy = h3yVar2;
        this.compactTopPlaquePresenterLazy = h3yVar3;
        this.superappMainScreenFloatingPresenter = yvf0Var;
        this.menuBadgeFactory = mj10Var;
        this.logoViewDelegate = f0w0Var;
        this.systemBarsCoordinator = c2x0Var;
        this.mainSidePagerStateRepository = cd00Var;
        this.mainSidePagerNavigator = vc00Var;
        this.mainSidePagerIntegration = aVar;
        this.headerType = vcuVar;
        this.topPlaqueType = superappTopPlaqueType;
        this.presenter = eVar;
        this.component = i4w0Var;
        q1w0Var.getClass();
        final int i = 0;
        this.isSupermapEnabled = false;
        this.isOptimizedShimmeringEnabled = ((Boolean) ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.OPTIMIZED_SHIMMERING).c()).booleanValue();
        this.scope = new hbp0(new czo0(14), "SuperAppMainScreenFlexModalView", null);
        View inflate = LayoutInflater.from(context).inflate(wth0.super_app_main_screen_flex, (ViewGroup) this, false);
        addView(inflate);
        GoFrameLayout goFrameLayout = (GoFrameLayout) inflate;
        int i2 = yih0.flex_sdk_container;
        GoFrameLayout goFrameLayout2 = (GoFrameLayout) cma1.O(i2, inflate);
        if (goFrameLayout2 != null) {
            i2 = yih0.main_content;
            GoFrameLayout goFrameLayout3 = (GoFrameLayout) cma1.O(i2, inflate);
            if (goFrameLayout3 != null) {
                i2 = yih0.main_side_pager;
                MainSidePager mainSidePager = (MainSidePager) cma1.O(i2, inflate);
                if (mainSidePager != null) {
                    i2 = yih0.popup;
                    ViewStub viewStub = (ViewStub) cma1.O(i2, inflate);
                    if (viewStub != null) {
                        i2 = yih0.superapp_overlay_container;
                        GoFrameLayout goFrameLayout4 = (GoFrameLayout) cma1.O(i2, inflate);
                        if (goFrameLayout4 != null) {
                            this.binding = new r1w0(goFrameLayout, goFrameLayout, goFrameLayout2, goFrameLayout3, mainSidePager, viewStub, goFrameLayout4);
                            View initHeader = initHeader(vcuVar, goFrameLayout3);
                            this.headerView = initHeader;
                            this.appBar = new lbw0(vcuVar instanceof tcu, initHeader, zbw0Var);
                            this.scrollUpButton = kotlin.a.a(new sls() { // from class: t1w0
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    FeedScrollUpButton scrollUpButton_delegate$lambda$0;
                                    LocationButtonIconComponent myLocationButton_delegate$lambda$0;
                                    int i3 = i;
                                    SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView = this;
                                    Context context2 = context;
                                    switch (i3) {
                                        case 0:
                                            scrollUpButton_delegate$lambda$0 = SuperAppMainScreenFlexModalView.scrollUpButton_delegate$lambda$0(context2, superAppMainScreenFlexModalView);
                                            return scrollUpButton_delegate$lambda$0;
                                        default:
                                            myLocationButton_delegate$lambda$0 = SuperAppMainScreenFlexModalView.myLocationButton_delegate$lambda$0(context2, superAppMainScreenFlexModalView);
                                            return myLocationButton_delegate$lambda$0;
                                    }
                                }
                            });
                            final int i3 = 1;
                            this.myLocationButton = kotlin.a.a(new sls() { // from class: t1w0
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    FeedScrollUpButton scrollUpButton_delegate$lambda$0;
                                    LocationButtonIconComponent myLocationButton_delegate$lambda$0;
                                    int i32 = i3;
                                    SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView = this;
                                    Context context2 = context;
                                    switch (i32) {
                                        case 0:
                                            scrollUpButton_delegate$lambda$0 = SuperAppMainScreenFlexModalView.scrollUpButton_delegate$lambda$0(context2, superAppMainScreenFlexModalView);
                                            return scrollUpButton_delegate$lambda$0;
                                        default:
                                            myLocationButton_delegate$lambda$0 = SuperAppMainScreenFlexModalView.myLocationButton_delegate$lambda$0(context2, superAppMainScreenFlexModalView);
                                            return myLocationButton_delegate$lambda$0;
                                    }
                                }
                            });
                            this.scrollListener = new x1w0(this);
                            this.coordinatorListenerCancellable = g18.u1;
                            this.animateOnAppearing = false;
                            setDismissOnTouchOutside(false);
                            setInterceptOnBackPress(false);
                            if (o900Var instanceof n900) {
                                renderBottomView(o900Var);
                            }
                            this.tempLocation = new int[2];
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void addModalViewCoordinatorListener() {
        w030 C2 = ((c0g) ((mag) this.component).a).C2();
        q5z.h(C2);
        this.coordinatorListenerCancellable = C2.g(new bkv0(1, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addModalViewCoordinatorListener$lambda$0(SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView, u45 u45Var, u45 u45Var2, ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType) {
        superAppMainScreenFlexModalView.presenter.Ng(u45Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySidePagerState(MainSidePagerSidePage sidePage) {
        String string;
        vc00 vc00Var;
        MainSidePager mainSidePager;
        sidePage.getClass();
        boolean z = (sidePage == MainSidePagerSidePage.NONE || this.isSupermapEnabled) ? false : true;
        this.binding.e.setEnabled(z);
        com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.a aVar = this.mainSidePagerIntegration;
        if (aVar.g == sidePage) {
            MainSidePager mainSidePager2 = aVar.h;
            if (mainSidePager2 != null) {
                string = aVar.f != null ? mainSidePager2.getContext().getString(kyh0.main_wallet_pager_pull_hint) : null;
                mainSidePager2.setPullHint(string != null ? string : "");
            }
        } else {
            aVar.g = sidePage;
            a941 a941Var = aVar.e;
            if (a941Var != null) {
                a941Var.a();
            }
            aVar.e = null;
            MainSidePager mainSidePager3 = aVar.h;
            if (mainSidePager3 != null) {
                mainSidePager3.clearSidePage();
            }
            aVar.c.e = new k801(25);
            MainSidePager mainSidePager4 = aVar.h;
            if (mainSidePager4 != null) {
                b941 b941Var = (b941) aVar.a.a.get(sidePage);
                aVar.f = b941Var;
                string = b941Var != null ? mainSidePager4.getContext().getString(kyh0.main_wallet_pager_pull_hint) : null;
                mainSidePager4.setPullHint(string != null ? string : "");
            }
        }
        if (z || (mainSidePager = (vc00Var = this.mainSidePagerNavigator).b) == null || !mainSidePager.isOnSidePage()) {
            return;
        }
        vc00Var.c = false;
        vc00Var.d = false;
        mainSidePager.showMain(false);
    }

    private final void attachFallbackAssistant() {
        ViewStub viewStub = this.binding.f;
        mag magVar = (mag) this.component;
        magVar.getClass();
        c0g c0gVar = (c0g) magVar.a;
        Context e2 = c0gVar.e2();
        q5z.h(e2);
        r3w0 r3w0Var = (r3w0) c0gVar.Ls.get();
        q5z.h(r3w0Var);
        jb7 jb7Var = new jb7(28, r3w0Var, (com.yandex.go.mainscreen.superapp.popup.data.c) magVar.h.get(), c0gVar.b2());
        lx4 F = c0gVar.F();
        q5z.h(F);
        pho k2 = c0gVar.k2();
        q5z.h(k2);
        tig0 tig0Var = new tig0(F, new rx2(k2));
        tse tseVar = (tse) c0gVar.B.get();
        q5z.h(tseVar);
        tt2 Z1 = c0gVar.Z1();
        q5z.h(Z1);
        com.yandex.go.mainscreen.superapp.popup.analytics.a aVar = new com.yandex.go.mainscreen.superapp.popup.analytics.a(tig0Var, tseVar, Z1);
        fwx0 fwx0Var = new fwx0(c0gVar.T9, (oep0) c0gVar.T.get());
        ney y2 = c0gVar.y2();
        q5z.h(y2);
        ru.yandex.taxi.design.utils.c.w(viewStub, new SuperAppMainScreenPopupView(e2, new a3w0(jb7Var, aVar, fwx0Var, y2)));
    }

    private final void attachMyLocationButton() {
        if (getMyLocationButton().getParent() != null) {
            return;
        }
        int u = tje.u(86, getContext());
        GoFrameLayout goFrameLayout = this.binding.g;
        LocationButtonIconComponent myLocationButton = getMyLocationButton();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388693;
        layoutParams.setMarginEnd(-tje.u(5, getContext()));
        layoutParams.bottomMargin = u;
        goFrameLayout.addView(myLocationButton, layoutParams);
        tje.j(new is8(u, this, 16), getMyLocationButton());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachMyLocationButton$lambda$1(int i, SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView, t1w t1wVar) {
        int i2 = i + t1wVar.d;
        ViewGroup.LayoutParams layoutParams = superAppMainScreenFlexModalView.getMyLocationButton().getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (i2 != (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0)) {
            LocationButtonIconComponent myLocationButton = superAppMainScreenFlexModalView.getMyLocationButton();
            ViewGroup.LayoutParams layoutParams2 = myLocationButton.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.bottomMargin = i2;
                myLocationButton.setLayoutParams(marginLayoutParams2);
            } else {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        return false;
    }

    private final LocationButtonIconComponent getMyLocationButton() {
        return (LocationButtonIconComponent) this.myLocationButton.getValue();
    }

    private final FeedScrollUpButton getScrollUpButton() {
        return (FeedScrollUpButton) this.scrollUpButton.getValue();
    }

    private final View initFloatingHeader(ViewGroup parent) {
        tbw0 tbw0Var;
        SuperappMainFloatingHeader superappMainFloatingHeader = (SuperappMainFloatingHeader) ru.yandex.taxi.design.utils.c.q(parent, wth0.super_app_main_screen_header_v3, false);
        boolean z = this.isSupermapEnabled;
        superappMainFloatingHeader.init(z, (dcw0) this.superappMainScreenFloatingPresenter.get(), this.menuBadgeFactory, this.logoViewDelegate, this.cashbackViewFactory);
        if (u1w0.a[this.topPlaqueType.ordinal()] != 1) {
            if (!z) {
                superappMainFloatingHeader.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewBottomRounded$1(tje.u(24, getContext())));
                superappMainFloatingHeader.setClipToOutline(true);
            }
            return superappMainFloatingHeader;
        }
        int u = tje.u(32, getContext());
        if (z) {
            tbw0Var = new sbw0(u);
        } else {
            superappMainFloatingHeader.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(u));
            superappMainFloatingHeader.setClipToOutline(true);
            tbw0Var = rbw0.a;
        }
        SuperappMainFloatingHeaderContainer superappMainFloatingHeaderContainer = new SuperappMainFloatingHeaderContainer(superappMainFloatingHeader, (com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation.a) this.compactTopPlaquePresenterLazy.get(), tbw0Var);
        superappMainFloatingHeaderContainer.setId(View.generateViewId());
        if (!z) {
            superappMainFloatingHeaderContainer.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewBottomRounded$1(u));
            superappMainFloatingHeaderContainer.setClipToOutline(true);
        }
        return superappMainFloatingHeaderContainer;
    }

    private final View initHeader(vcu type, ViewGroup parent) {
        View initStickyHeader;
        if (jl40.l(type, tcu.a)) {
            initStickyHeader = initFloatingHeader(parent);
        } else {
            if (!(type instanceof ucu)) {
                w511.b();
                return null;
            }
            initStickyHeader = initStickyHeader(((ucu) type).a);
        }
        initStickyHeader.setClickable(true);
        initStickyHeader.addOnLayoutChangeListener(new lp2(6, this));
        parent.addView(initStickyHeader);
        return initStickyHeader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHeader$lambda$0(SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        zbw0 zbw0Var = superAppMainScreenFlexModalView.superappMainRepository;
        int height = view.getHeight();
        r0 r0Var = ((acw0) zbw0Var).a;
        if (height < 0) {
            height = 0;
        }
        x4e.z(height, r0Var, null);
        ((acw0) superAppMainScreenFlexModalView.superappMainRepository).a(view);
        superAppMainScreenFlexModalView.updateStatusBarThemeByFloatingHeaderPosition();
    }

    private final void initOnboardingView() {
        View requireViewById = ((Activity) getContext()).requireViewById(yih0.onboarding_overlay);
        g1w0 g1w0Var = this.onboardingViewFactory;
        View rootView = requireViewById.getRootView();
        n1d n1dVar = ((h1w0) g1w0Var).a;
        ru.yandex.taxi.design.utils.c.w(requireViewById, new SuperAppMainOnboardingView((Context) ((xvf0) n1dVar.a).get(), (Activity) ((xvf0) n1dVar.b).get(), (y0w0) ((kxl0) n1dVar.c).get(), (ip11) ((xvf0) n1dVar.d).get(), (c2x0) ((xvf0) n1dVar.e).get(), (bae0) ((xvf0) n1dVar.f).get(), rootView, (tt2) ((xvf0) n1dVar.g).get()));
    }

    private final View initStickyHeader(SuperAppLogoPositionRepository$LogoPosition logoPosition) {
        GoFrameLayout goFrameLayout = this.binding.d;
        SuperAppMainScreenHeader superAppMainScreenHeader = (SuperAppMainScreenHeader) LayoutInflater.from(goFrameLayout.getContext()).inflate(wth0.super_app_main_sticky_header_placeholder, (ViewGroup) goFrameLayout, false);
        superAppMainScreenHeader.init((h0w0) this.headerPresenterLazy.get(), this.cashbackViewFactory, new SuperAppMainScreenFlexModalView$initStickyHeader$1(0, this.component, i4w0.class, "headerLogoView", "headerLogoView()Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/logo/HeaderLogoView;", 0), logoPosition, (com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation.b) this.topPlaquePresenterLazy.get(), this.menuBadgeFactory, this.binding, this.isOptimizedShimmeringEnabled);
        return superAppMainScreenHeader;
    }

    private static /* synthetic */ void isOptimizedShimmeringEnabled$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationButtonIconComponent myLocationButton_delegate$lambda$0(Context context, SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView) {
        LocationButtonIconComponent locationButtonIconComponent = new LocationButtonIconComponent(context, null, 0, 0, 14, null);
        locationButtonIconComponent.setTranslationY(0.0f);
        locationButtonIconComponent.setIconTintAttr(xng0.textMain);
        locationButtonIconComponent.setDebounceClickListener(new lnv0(5, superAppMainScreenFlexModalView.presenter));
        return locationButtonIconComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void myLocationButton_delegate$lambda$0$0$onMyLocationClicked(e eVar) {
        eVar.n0.a.g(zy11.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRecyclerViewAttached(View view) {
        if (this.isSupermapEnabled) {
            ViewParent parent = view.getParent();
            while ((parent instanceof ViewGroup) && parent != this.binding.c) {
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.setClipChildren(false);
                parent = viewGroup.getParent();
            }
        }
        this.mainSidePagerIntegration.c.c = view;
        this.headerView.setImportantForAccessibility(1);
        view.setImportantForAccessibility(1);
        this.binding.g.setImportantForAccessibility(1);
        view.setAccessibilityTraversalAfter(this.headerView.getId());
        this.binding.g.setAccessibilityTraversalAfter(view.getId());
    }

    private final void removeOnboardingView() {
        ru.yandex.taxi.design.utils.c.w(((Activity) getContext()).requireViewById(yih0.onboarding_overlay), new ViewStub(getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderBottomView$lambda$0(SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView) {
        superAppMainScreenFlexModalView.getScrollUpButton().setTranslationX(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FeedScrollUpButton scrollUpButton_delegate$lambda$0(Context context, SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView) {
        FeedScrollUpButton feedScrollUpButton = new FeedScrollUpButton(context);
        feedScrollUpButton.setDebounceClickListener(new s1w0(superAppMainScreenFlexModalView, 0));
        return feedScrollUpButton;
    }

    private final void setupMainSidePager() {
        MainSidePager mainSidePager;
        MainSidePager mainSidePager2 = this.binding.e;
        this.mainSidePagerIntegration.j = new SuperAppMainScreenFlexModalView$setupMainSidePager$1(0, this, SuperAppMainScreenFlexModalView.class, "updateStatusBarThemeByFloatingHeaderPosition", "updateStatusBarThemeByFloatingHeaderPosition()V", 0);
        this.mainSidePagerIntegration.a(mainSidePager2);
        this.mainSidePagerIntegration.c.d = this.headerView;
        vc00 vc00Var = this.mainSidePagerNavigator;
        vc00Var.b = mainSidePager2;
        Float f = vc00Var.e;
        if (f != null) {
            mainSidePager2.setProgress(f.floatValue(), false);
            vc00Var.e = null;
        }
        com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.a aVar = this.mainSidePagerIntegration;
        aVar.h = mainSidePager2;
        vc00 vc00Var2 = aVar.b;
        boolean z = vc00Var2.d;
        if (vc00Var2.c) {
            vc00Var2.c = false;
            vc00Var2.c(false);
        }
        if ((z || mainSidePager2.isOnSidePage()) && (mainSidePager = aVar.h) != null) {
            if (!mainSidePager.isOnSidePage()) {
                vc00Var2.d = false;
                return;
            }
            a941 b = aVar.b(mainSidePager);
            if (b == null) {
                return;
            }
            b.e();
            vc00Var2.d = false;
        }
    }

    private final void updateBackground(boolean isClarifyAddressVisible) {
        if (this.isSupermapEnabled) {
            this.binding.b.setBackground(null);
        } else {
            this.binding.b.setBackgroundColor(isClarifyAddressVisible ? qje.t(xng0.cardDivider, getContext()) : qje.t(xng0.bgMain, getContext()));
        }
    }

    public static void updateBackground$default(SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ((f2w0) superAppMainScreenFlexModalView.presenter.P.a.getValue()).a;
        }
        superAppMainScreenFlexModalView.updateBackground(z);
    }

    private final void updateFlexSdkContainerBackground() {
        Drawable colorDrawable;
        int t = qje.t(xng0.bgMain, getContext());
        if (this.isSupermapEnabled) {
            colorDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{t, lhc.f(t, 0)});
        } else {
            colorDrawable = new ColorDrawable(t);
        }
        this.binding.c.setBackground(colorDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if ((r0 - r2) < r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateStatusBarThemeByFloatingHeaderPosition() {
        boolean z;
        View view = this.headerView;
        if (view instanceof SuperappMainFloatingHeaderContainer) {
            SuperappMainFloatingHeaderContainer superappMainFloatingHeaderContainer = (SuperappMainFloatingHeaderContainer) view;
            if (superappMainFloatingHeaderContainer.isLaidOut()) {
                SuperappMainFloatingHeaderTopPlaqueView topPlaque = superappMainFloatingHeaderContainer.getTopPlaque();
                int height = (topPlaque.getVisibility() == 0 && topPlaque.isLaidOut()) ? topPlaque.getHeight() : 0;
                int paddingTop = superappMainFloatingHeaderContainer.getPaddingTop();
                if (paddingTop > 0 && height > 0) {
                    superappMainFloatingHeaderContainer.getTopPlaque().getLocationInWindow(this.tempLocation);
                    z = true;
                    int i = this.tempLocation[1];
                    int i2 = paddingTop / 2;
                    if (height + i >= i2) {
                    }
                }
                z = false;
                if (jl40.l(this.isTopPlaqueUnderStatusBar, Boolean.valueOf(z))) {
                    return;
                }
                this.isTopPlaqueUnderStatusBar = Boolean.valueOf(z);
                c2x0 c2x0Var = this.systemBarsCoordinator;
                if (z) {
                    ((d2x0) c2x0Var).a(0, this, false);
                } else {
                    ((d2x0) c2x0Var).b(this);
                }
            }
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        updateBackground$default(this, false, 1, null);
        updateFlexSdkContainerBackground();
        this.binding.e.applyTheme(themeType);
        v66 v66Var = this.contentBlurDelegate;
        if (v66Var != null) {
            v66Var.c();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return this.isSupermapEnabled ? mqg0.transparent : super.getBackgroundColor();
    }

    @Override // defpackage.k2w0
    public void clarifyAddressViewVisibilityChanged(f2w0 headerState) {
        boolean z = headerState.a;
        if (!this.isSupermapEnabled) {
            this.binding.c.setClipToOutline(z);
        }
        updateBackground(z);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContentView() {
        return this.binding.a;
    }

    public final o900 getBottomView() {
        return this.bottomView;
    }

    @Override // defpackage.k2w0
    /* renamed from: headerType, reason: from getter */
    public vcu getHeaderType() {
        return this.headerType;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public w130 insetsType() {
        return new w130(1, new SuperAppMainScreenFlexModalView$insetsType$1(1, this.appBar, lbw0.class, "applyInsets", "applyInsets(Lru/yandex/taxi/utils/Insets;)V", 0));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        setupMainSidePager();
        applySidePagerState((MainSidePagerSidePage) ((dd00) this.mainSidePagerStateRepository).b.a.getValue());
        super.onAttachedToWindow();
        this.scope.a();
        gci0 gci0Var = ((dd00) this.mainSidePagerStateRepository).b;
        hbp0 hbp0Var = this.scope;
        SuperAppMainScreenFlexModalView$onAttachedToWindow$$inlined$collectIn$1 superAppMainScreenFlexModalView$onAttachedToWindow$$inlined$collectIn$1 = new SuperAppMainScreenFlexModalView$onAttachedToWindow$$inlined$collectIn$1(gci0Var, null, this);
        int i = 3;
        tje.N(hbp0Var, null, null, superAppMainScreenFlexModalView$onAttachedToWindow$$inlined$collectIn$1, 3);
        e eVar = this.presenter;
        eVar.Bg(this);
        ((j) ((lx4) eVar.V.a.a)).n("SuperappMain.Appear");
        r0 r0Var = eVar.G.a;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
        if (!(((k2w0) eVar.Dg()).getHeaderType() instanceof tcu)) {
            tje.N(eVar.Jg(), null, null, new SuperAppMainScreenPresenter$initHeader$1(eVar, null), 3);
        }
        eVar.D.a();
        eVar.r0 = com.yandex.go.coroutines.b.g(eVar.Jg(), null, null, new SuperAppMainScreenPresenter$listenToAddress$1(eVar, null), 3);
        tse Jg = eVar.Jg();
        eVar.B.getClass();
        sjh sjhVar = uyj.a;
        tje.N(Jg, mdh.b, null, new SuperAppMainScreenPresenter$observeZoneChanges$1(eVar, null), 2);
        tje.N(eVar.Jg(), null, null, new SuperAppMainScreenPresenter$observeLoadingState$$inlined$collectIn$1(vng.l(new jqr(eVar.N.b, new SuperAppMainScreenPresenter$observeLoadingState$1(eVar, null), i), SuperAppMainScreenPresenter$observeLoadingState$2.b, vng.c), null, eVar), 3);
        tje.N(eVar.Jg(), null, null, new SuperAppMainScreenPresenter$observeReloadingRequests$$inlined$collectIn$1(eVar.F.a, null, eVar), 3);
        tje.N(eVar.Jg(), null, null, new SuperAppMainScreenPresenter$observeReloadingRequests$$inlined$collectLatestIn$1(eVar.W.b, null, eVar), 3);
        tje.N(eVar.Jg(), null, null, new SuperAppMainScreenPresenter$observeBottomView$$inlined$safeCollectIn$1(new m0(new com.yandex.go.preload.d(eVar.j0.c.c), eVar.h0.a(), new SuperAppMainScreenPresenter$observeBottomView$1(3, null)), null, (k2w0) eVar.Dg()), 3);
        tje.N(eVar.Jg(), null, null, new SuperAppMainScreenPresenter$observeScrollUp$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.c(eVar.o0.c), null, eVar), 3);
        eVar.e0.getClass();
        ((i) eVar.Q).a();
        initOnboardingView();
        tje.N(this.scope, null, null, new SuperAppMainScreenFlexModalView$onAttachedToWindow$$inlined$collectIn$2(kotlinx.coroutines.flow.e.c(((acw0) this.superappMainRepository).e), null, this), 3);
        e eVar2 = this.presenter;
        GoFrameLayout goFrameLayout = this.binding.c;
        x1w0 x1w0Var = this.scrollListener;
        o4w0 o4w0Var = eVar2.o0.f;
        u900 P = o4w0Var.P();
        if (P != null && !o4w0Var.v(P)) {
            o4w0Var.A(P, new ffe(goFrameLayout), sy60.Q2);
            if (x1w0Var != null) {
                P.R(x1w0Var);
            }
        }
        ((j800) this.mainScreenOpenedAnalytics).c();
        addModalViewCoordinatorListener();
        e eVar3 = this.presenter;
        w030 C2 = ((c0g) ((mag) this.component).a).C2();
        q5z.h(C2);
        eVar3.Ng(C2.e());
        attachFallbackAssistant();
        hbp0.e(this.scope, null, null, new SuperAppMainScreenFlexModalView$onAttachedToWindow$3(this, null), 3);
        tje.N(this.scope, null, null, new SuperAppMainScreenFlexModalView$onAttachedToWindow$$inlined$collectIn$3(kotlinx.coroutines.flow.e.d(((acw0) this.superappMainRepository).a), null, this.presenter), 3);
        tje.N(this.scope, null, null, new SuperAppMainScreenFlexModalView$onAttachedToWindow$$inlined$collectIn$4(kotlinx.coroutines.flow.e.d(((acw0) this.superappMainRepository).a), null, this.binding.e), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        x841 x841Var;
        boolean z;
        vc00 vc00Var = this.mainSidePagerNavigator;
        MainSidePager mainSidePager = vc00Var.b;
        vc00Var.e = mainSidePager != null ? Float.valueOf(mainSidePager.getSidePhase()) : null;
        vc00Var.b = null;
        boolean z2 = this.mainSidePagerNavigator.d;
        com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.a aVar = this.mainSidePagerIntegration;
        if (z2) {
            MainSidePager mainSidePager2 = aVar.h;
            if (mainSidePager2 != null) {
                ga1 ga1Var = aVar.i;
                if (ga1Var != null) {
                    mainSidePager2.removeProgressListener(ga1Var);
                }
                aVar.i = null;
                a941 a941Var = aVar.e;
                if (a941Var != null) {
                    a941Var.f();
                }
            }
        } else {
            MainSidePager mainSidePager3 = aVar.h;
            if (mainSidePager3 != null) {
                ga1 ga1Var2 = aVar.i;
                if (ga1Var2 != null) {
                    mainSidePager3.removeProgressListener(ga1Var2);
                }
                a941 a941Var2 = aVar.e;
                if (a941Var2 != null) {
                    a941Var2.a();
                }
                aVar.e = null;
                MainSidePager mainSidePager4 = aVar.h;
                if (mainSidePager4 != null) {
                    mainSidePager4.clearSidePage();
                }
                wc00 wc00Var = aVar.c;
                int i = 25;
                wc00Var.e = new k801(i);
                aVar.i = null;
                aVar.h = null;
                wc00Var.c = null;
                wc00Var.d = null;
                wc00Var.e = new k801(i);
                aVar.d.a(false);
                b941 b941Var = aVar.f;
                if (b941Var != null && (z = (x841Var = b941Var.b).c) && z) {
                    x841Var.c = false;
                    x841Var.a.d("wallet");
                    x841Var.b.i(Screen.MAIN_V4);
                }
                aVar.f = null;
                aVar.g = MainSidePagerSidePage.NONE;
            }
        }
        super.onDetachedFromWindow();
        this.scope.b();
        e eVar = this.presenter;
        x1w0 x1w0Var = this.scrollListener;
        u900 P = eVar.o0.f.P();
        if (P != null) {
            if (x1w0Var != null) {
                P.T(x1w0Var);
            }
            P.i();
        }
        this.presenter.Cg();
        removeOnboardingView();
        this.coordinatorListenerCancellable.cancel();
        v66 v66Var = this.contentBlurDelegate;
        if (v66Var != null) {
            v66Var.detach();
        }
        ((d2x0) this.systemBarsCoordinator).b(this);
        ((d2x0) this.systemBarsCoordinator).b(dai0.c);
        this.isTopPlaqueUnderStatusBar = null;
    }

    @Override // defpackage.k2w0
    public void renderBottomView(o900 view) {
        this.bottomView = view;
        if (jl40.l(view, l900.a)) {
            e.Og(this.presenter, null);
            this.presenter.Mg();
            v66 v66Var = this.contentBlurDelegate;
            if (v66Var != null) {
                v66Var.detach();
                return;
            }
            return;
        }
        int i = 1;
        if (jl40.l(view, m900.a)) {
            this.presenter.Mg();
            v66 v66Var2 = this.contentBlurDelegate;
            if (v66Var2 != null) {
                v66Var2.detach();
            }
            if (getScrollUpButton().getParent() != null) {
                return;
            }
            getScrollUpButton().setTranslationX(1000.0f);
            e.Og(this.presenter, getScrollUpButton());
            getHandler().postDelayed(new s1w0(this, i), 600L);
            return;
        }
        if (!(view instanceof n900)) {
            w511.b();
            return;
        }
        e.Og(this.presenter, null);
        v66 v66Var3 = this.contentBlurDelegate;
        if (v66Var3 == null) {
            v66Var3 = w66.a(this.blurDelegateFactory, "superapp_main_screen", !this.isSupermapEnabled && ((n900) view).a, new m76(new edc(-1, ModalContentViewContainer.BASE_SHADOW_COLOR), 1), this.isSupermapEnabled ? l76.b : new m76(null, 7), 4);
        }
        this.contentBlurDelegate = v66Var3;
        v66Var3.b(this.binding.c);
        this.presenter.o0.a(this.binding.g, v66Var3);
    }

    @Override // defpackage.k2w0
    public void scrollUp() {
        u900 P;
        ((yzv0) this.superAppFlexAnalytics).l("UpToStartTapped", null);
        o4w0 o4w0Var = this.presenter.o0.f;
        if (vc00.b(o4w0Var.d0) || (P = o4w0Var.P()) == null) {
            return;
        }
        P.S();
    }

    public void setMyLocationButtonVisible(boolean isVisible) {
        if (isVisible || getMyLocationButton().getParent() != null) {
            attachMyLocationButton();
            LocationButtonIconComponent myLocationButton = getMyLocationButton();
            if (isVisible) {
                myLocationButton.show();
            } else {
                myLocationButton.hide();
            }
        }
    }
}
