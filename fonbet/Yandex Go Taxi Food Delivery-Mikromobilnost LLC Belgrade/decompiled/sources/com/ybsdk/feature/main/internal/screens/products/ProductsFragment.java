package com.ybsdk.feature.main.internal.screens.products;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ybsdk.core.permissions.MultiplePermissionAllowance;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.feature.main.internal.screens.products.ProductsFragment;
import com.ybsdk.feature.main.internal.widgets.ProductCardListView;
import com.ybsdk.feature.main.internal.widgets.gradient.ProductsV4GradientView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.bottombar.BottomBarNavigation;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.recycler.OrientationAwareRecyclerView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;
import defpackage.aaf0;
import defpackage.acf0;
import defpackage.apn;
import defpackage.auq0;
import defpackage.b0b0;
import defpackage.bcf0;
import defpackage.c8u0;
import defpackage.ce4;
import defpackage.cwg0;
import defpackage.cz2;
import defpackage.d0b0;
import defpackage.d5b0;
import defpackage.dcf0;
import defpackage.dzh0;
import defpackage.e7n;
import defpackage.eal;
import defpackage.ecf0;
import defpackage.eja1;
import defpackage.eyg0;
import defpackage.fcf0;
import defpackage.fuq0;
import defpackage.g7f0;
import defpackage.gcf0;
import defpackage.guq0;
import defpackage.gza0;
import defpackage.hc5;
import defpackage.hcf0;
import defpackage.hdu;
import defpackage.ip2;
import defpackage.jcf0;
import defpackage.jl40;
import defpackage.juq0;
import defpackage.k4o;
import defpackage.kp50;
import defpackage.kqe0;
import defpackage.ksz0;
import defpackage.lbb0;
import defpackage.lc00;
import defpackage.lfx;
import defpackage.li91;
import defpackage.lj11;
import defpackage.lpn;
import defpackage.lsz0;
import defpackage.lwg0;
import defpackage.m70;
import defpackage.mob1;
import defpackage.mox;
import defpackage.n751;
import defpackage.n7f0;
import defpackage.nb00;
import defpackage.ny61;
import defpackage.ola1;
import defpackage.oxe0;
import defpackage.p7b1;
import defpackage.qa60;
import defpackage.qas0;
import defpackage.qx21;
import defpackage.r400;
import defpackage.r761;
import defpackage.rb00;
import defpackage.rb6;
import defpackage.rbf0;
import defpackage.rr51;
import defpackage.s400;
import defpackage.sb6;
import defpackage.sm91;
import defpackage.spl;
import defpackage.t400;
import defpackage.ta00;
import defpackage.tb6;
import defpackage.tbf0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tya0;
import defpackage.u1w;
import defpackage.ua00;
import defpackage.ugd0;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.vbf0;
import defpackage.vh91;
import defpackage.vvb1;
import defpackage.w860;
import defpackage.w9f0;
import defpackage.wbf0;
import defpackage.wrt;
import defpackage.x9f0;
import defpackage.xbf0;
import defpackage.xon;
import defpackage.y8f;
import defpackage.ybf0;
import defpackage.yk60;
import defpackage.yon;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.z8i0;
import defpackage.z9f0;
import defpackage.zbf0;
import defpackage.zon;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u0000 \u009f\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0004 \u0001¡\u0001Bc\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0014¢\u0006\u0004\b!\u0010\"J!\u0010'\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001eH\u0016¢\u0006\u0004\b.\u0010 J!\u00101\u001a\u00020+2\u0006\u00100\u001a\u00020/2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020+H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u0002052\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020+2\u0006\u00109\u001a\u00020\u0003H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020+2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020+2\u0006\u00109\u001a\u00020\u0003H\u0002¢\u0006\u0004\b@\u0010;J\u0017\u0010A\u001a\u00020+2\u0006\u00109\u001a\u00020\u0003H\u0002¢\u0006\u0004\bA\u0010;J\u0017\u0010C\u001a\u00020+2\u0006\u00109\u001a\u00020BH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020+2\u0006\u00109\u001a\u00020BH\u0002¢\u0006\u0004\bE\u0010DJ\u0017\u0010F\u001a\u00020+2\u0006\u00109\u001a\u00020BH\u0002¢\u0006\u0004\bF\u0010DJ\u000f\u0010G\u001a\u00020+H\u0002¢\u0006\u0004\bG\u00104J\u000f\u0010H\u001a\u00020\u001eH\u0002¢\u0006\u0004\bH\u0010 J!\u0010L\u001a\u00020+2\b\b\u0001\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020IH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020+2\u0006\u00109\u001a\u00020\u0003H\u0002¢\u0006\u0004\bN\u0010;J\u0017\u0010O\u001a\u00020+2\u0006\u00109\u001a\u00020BH\u0002¢\u0006\u0004\bO\u0010DJ\u000f\u0010P\u001a\u00020+H\u0002¢\u0006\u0004\bP\u00104J\u001f\u0010U\u001a\u00020+2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020+H\u0002¢\u0006\u0004\bW\u00104J\u0017\u0010Z\u001a\u00020+2\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020+H\u0002¢\u0006\u0004\b\\\u00104J\u0017\u0010]\u001a\u00020+2\u0006\u00109\u001a\u00020\u0003H\u0002¢\u0006\u0004\b]\u0010;J\u000f\u0010^\u001a\u00020+H\u0002¢\u0006\u0004\b^\u00104J\u000f\u0010_\u001a\u00020+H\u0002¢\u0006\u0004\b_\u00104J\u0017\u0010a\u001a\u00020+2\u0006\u00106\u001a\u00020`H\u0002¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020+H\u0002¢\u0006\u0004\bc\u00104J\u000f\u0010d\u001a\u00020+H\u0002¢\u0006\u0004\bd\u00104J/\u0010l\u001a\u00020+2\u0006\u0010f\u001a\u00020e2\u0006\u0010h\u001a\u00020g2\u0006\u0010i\u001a\u00020g2\u0006\u0010k\u001a\u00020jH\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010p\u001a\u00020+2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bp\u0010qR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010rR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010sR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010uR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010vR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010wR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010xR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010yR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010zR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010~R\u0019\u0010\u0080\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0081\u0001R\u001a\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001f\u0010\u008b\u0001\u001a\n\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0081\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0019\u0010\u0099\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001b\u0010\u009b\u0001\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001¨\u0006¢\u0001"}, d2 = {"Lcom/ybsdk/feature/main/internal/screens/products/ProductsFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lr761;", "Ljcf0;", "Lcom/ybsdk/feature/main/internal/screens/products/a;", "Lce4;", "Lvbf0;", "factoryOfViewModel", "Lta00;", "mainScreenPermissionPreferencesProvider", "Lua00;", "mainScreenPermissionsController", "Lnb00;", "rateProvider", "Llc00;", "updateAppProvider", "Lw860;", "nfcPaymentController", "Lrb00;", "remoteConfig", "Lsb6;", "bottomBarReporter", "Lqa60;", "nfcViewFeature", "Lzon;", "educationsFeature", "Lguq0;", "serverTooltipsFeature", "<init>", "(Lvbf0;Lta00;Lua00;Lnb00;Llc00;Lw860;Lrb00;Lsb6;Lqa60;Lzon;Lguq0;)V", "", "fitsSystemWindow", "()Z", "createViewModel", "()Lcom/ybsdk/feature/main/internal/screens/products/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lr761;", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "()V", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "viewState", "render", "(Ljcf0;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "setupViews", "renderLoading", "Lecf0;", "renderViewStateContent", "(Lecf0;)V", "manageV4WithHeaderScrollListener", "renderEducationV2", "handleCloseButtonVisibility", "canScrollUp", "", "scrollProgress", "verticalOffset", "animateQuickActionsHeaderDivViewOnScroll", "(FF)V", "changeShimmerAnimation", "setupUserInfoBlock", "updateRecyclerTopMargin", "Lrr51;", "divData", "Lcom/ybsdk/feature/main/internal/screens/products/ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType;", "bottomSheetType", "showBottomSheet", "(Lrr51;Lcom/ybsdk/feature/main/internal/screens/products/ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType;)V", "showRateAppBottomSheet", "Lauq0;", "entity", "showServerTooltip", "(Lauq0;)V", "dismissEducation", "renderTsarButton", "animateEnterTsarButton", "setupEducations", "Lu1w;", "updateContentPadding", "(Lu1w;)V", "setupViewsForV4", "setupViewsForV3", "Llsz0;", "toolbarBackground", "Lcom/ybsdk/core/utils/ColorModel;", "ybLogoColor", "closeButtonColor", "Lz1x0;", "statusBarColor", "setStatusBarAndToolbarColors", "(Llsz0;Lcom/ybsdk/core/utils/ColorModel;Lcom/ybsdk/core/utils/ColorModel;Lz1x0;)V", "", "topPadding", "setRefreshLayoutProgressViewOffset", "(I)V", "Lvbf0;", "Lua00;", "Lnb00;", "Llc00;", "Lw860;", "Lrb00;", "Lsb6;", "Lqa60;", "Lzon;", "Lguq0;", "Ltya0;", "notificationsPermissionManager", "Ltya0;", "fingerprintPermissionsManager", "isProductsV4Enabled", "Z", "isProductsV4HeaderEnabled", "Lc8u0;", "statusBarAndToolbarColors", "Lc8u0;", "Ltbf0;", "v4WithHeaderScrollListener", "Ltbf0;", "Le7n;", "Lgc5;", "adapter", "Le7n;", "previousViewState", "Ljcf0;", "needToSetupViews", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "bottomSheetDialog", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "Llpn;", "educationsV2View", "Llpn;", "", "previousCardsInStack", "Ljava/lang/String;", "currentAppBarScrollProgress", "F", "currentUserBlockDivData", "Lrr51;", "currentInsets", "Lu1w;", "Companion", "TagId", "aaf0", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProductsFragment extends BaseDivContextMvvmFragment<r761, jcf0, a> implements ce4 {

    @Deprecated
    public static final float MAX_SCROLL_PROGRESS = 1.0f;

    @Deprecated
    public static final float MIN_SCROLL_PROGRESS = 0.0f;

    @Deprecated
    public static final float SCALE_DIFF = 0.04f;
    private final e7n adapter;
    private final sb6 bottomBarReporter;
    private BottomSheetDialogView bottomSheetDialog;
    private float currentAppBarScrollProgress;
    private u1w currentInsets;
    private rr51 currentUserBlockDivData;
    private final zon educationsFeature;
    private lpn educationsV2View;
    private final vbf0 factoryOfViewModel;
    private final tya0 fingerprintPermissionsManager;
    private boolean isProductsV4Enabled;
    private boolean isProductsV4HeaderEnabled;
    private final ua00 mainScreenPermissionsController;
    private boolean needToSetupViews;
    private final w860 nfcPaymentController;
    private final qa60 nfcViewFeature;
    private final tya0 notificationsPermissionManager;
    private String previousCardsInStack;
    private jcf0 previousViewState;
    private final nb00 rateProvider;
    private final rb00 remoteConfig;
    private final guq0 serverTooltipsFeature;
    private c8u0 statusBarAndToolbarColors;
    private final lc00 updateAppProvider;
    private tbf0 v4WithHeaderScrollListener;
    private static final aaf0 Companion = new aaf0();
    private static final float FEED_ELEVATION_SIZE_PX = kp50.t(50);
    private static final int TSAR_BUTTON_RECYCLER_PADDING_BOTTOM = kp50.r(72);
    private static final int TSAR_BUTTON_RECYCLER_PADDING_BOTTOM_V4 = kp50.r(89);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/main/internal/screens/products/ProductsFragment$TagId;", "", "", "tagId", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "BOTTOM_BAR", "TSAR_BUTTON", "PRODUCTS_RECYCLER", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class TagId {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TagId[] $VALUES;
        public static final TagId BOTTOM_BAR;
        public static final TagId PRODUCTS_RECYCLER;
        public static final TagId TSAR_BUTTON;
        private final String tagId;

        static {
            TagId tagId = new TagId("BOTTOM_BAR", 0, "bottom_bar");
            BOTTOM_BAR = tagId;
            TagId tagId2 = new TagId("TSAR_BUTTON", 1, "tsar_button");
            TSAR_BUTTON = tagId2;
            TagId tagId3 = new TagId("PRODUCTS_RECYCLER", 2, "products_list");
            PRODUCTS_RECYCLER = tagId3;
            TagId[] tagIdArr = {tagId, tagId2, tagId3};
            $VALUES = tagIdArr;
            $ENTRIES = kotlin.enums.a.a(tagIdArr);
        }

        public TagId(String str, int i, String str2) {
            this.tagId = str2;
        }

        public static TagId valueOf(String str) {
            return (TagId) Enum.valueOf(TagId.class, str);
        }

        public static TagId[] values() {
            return (TagId[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final String getTagId() {
            return this.tagId;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductsFragment(vbf0 vbf0Var, ta00 ta00Var, ua00 ua00Var, nb00 nb00Var, lc00 lc00Var, w860 w860Var, rb00 rb00Var, sb6 sb6Var, qa60 qa60Var, zon zonVar, guq0 guq0Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.factoryOfViewModel = vbf0Var;
        this.mainScreenPermissionsController = ua00Var;
        this.rateProvider = nb00Var;
        this.updateAppProvider = lc00Var;
        this.remoteConfig = rb00Var;
        this.bottomBarReporter = sb6Var;
        this.nfcViewFeature = qa60Var;
        this.educationsFeature = zonVar;
        this.serverTooltipsFeature = guq0Var;
        hdu hduVar = (hdu) ta00Var;
        com.ybsdk.core.permissions.a c = vh91.c(this, yk60.a(), hduVar.j());
        int i = 4;
        c.d(new mox(i, this));
        this.notificationsPermissionManager = c;
        List singletonList = Collections.singletonList("android.permission.READ_PHONE_STATE");
        ((r400) ua00Var).i();
        int i2 = 6;
        this.fingerprintPermissionsManager = vh91.c(this, new gza0((d0b0) new b0b0(kotlin.collections.a.m0(EmptyList.a, singletonList), (MultiplePermissionAllowance) null, i2), new z8i0(unr0.h(Text.Companion, dzh0.ybsdk_app_common_permission_request_fingerprint_title), new Text.Resource(dzh0.ybsdk_app_common_permission_request_fingerprint_message), new Text.Resource(dzh0.ybsdk_app_common_push_notifications_permission_request_ok), new Text.Resource(dzh0.ybsdk_app_common_push_notifications_permission_request_cancel), null, null, 48), (wrt) (0 == true ? 1 : 0), i), hduVar.k());
        this.adapter = new e7n(hc5.a(), ola1.c(new lbb0(i2, this)), new m70[0]);
        this.needToSetupViews = true;
    }

    public static final /* synthetic */ w860 access$getNfcPaymentController$p(ProductsFragment productsFragment) {
        productsFragment.getClass();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ a access$getViewModel(ProductsFragment productsFragment) {
        return (a) productsFragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean adapter$lambda$1(ProductsFragment productsFragment, Uri uri, spl splVar) {
        return ((a) productsFragment.getViewModel()).p0(uri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void animateEnterTsarButton() {
        if (((r761) getBinding()).u.isAppearingAnimationRunning()) {
            return;
        }
        ((r761) getBinding()).u.startAppearingAnimation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void animateQuickActionsHeaderDivViewOnScroll(float scrollProgress, float verticalOffset) {
        r761 r761Var = (r761) getBinding();
        r761Var.o.setTranslationY(-verticalOffset);
        YbDivView ybDivView = r761Var.o;
        ybDivView.setAlpha(1.0f - scrollProgress);
        float f = 1.0f - (scrollProgress * 0.04f);
        ybDivView.setScaleX(f);
        ybDivView.setScaleY(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean canScrollUp() {
        r761 r761Var = (r761) getBinding();
        return r761Var.q.canScrollVertically(-1) || b.f(r761Var.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void changeShimmerAnimation(jcf0 viewState) {
        gcf0 gcf0Var = viewState instanceof gcf0 ? (gcf0) viewState : null;
        boolean l = jl40.l(gcf0Var != null ? gcf0Var.i() : null, vvb1.M);
        r761 r761Var = (r761) getBinding();
        if (l) {
            r761Var.r.startShimmer();
        } else {
            r761Var.r.stopShimmer();
        }
    }

    private final void dismissEducation() {
        lpn lpnVar = this.educationsV2View;
        if (lpnVar != null) {
            lpnVar.dismiss();
        }
        this.educationsV2View = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$5$lambda$4(ProductsFragment productsFragment, r761 r761Var, AppBarLayout appBarLayout, int i) {
        jcf0 jcf0Var;
        float f = i;
        float f2 = -f;
        float totalScrollRange = f2 / appBarLayout.getTotalScrollRange();
        if (totalScrollRange > 1.0f) {
            totalScrollRange = 1.0f;
        }
        Float valueOf = Float.valueOf(totalScrollRange);
        if (Float.isNaN(totalScrollRange)) {
            valueOf = null;
        }
        float floatValue = valueOf != null ? valueOf.floatValue() : 0.0f;
        productsFragment.currentAppBarScrollProgress = floatValue;
        if (productsFragment.isProductsV4HeaderEnabled && ((jcf0Var = productsFragment.previousViewState) == null || !jcf0Var.h())) {
            tbf0 tbf0Var = productsFragment.v4WithHeaderScrollListener;
            if (tbf0Var != null) {
                tbf0Var.a();
            }
            productsFragment.animateQuickActionsHeaderDivViewOnScroll(floatValue, f);
            return;
        }
        if (productsFragment.isProductsV4Enabled) {
            return;
        }
        r761Var.m.animateOnScroll(floatValue, f2);
        productsFragment.updateRecyclerTopMargin();
        r761Var.q.setElevation((1.0f - floatValue) * FEED_ELEVATION_SIZE_PX);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleCloseButtonVisibility() {
        ((r761) getBinding()).d.setVisibility(((t400) this.remoteConfig).b() ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void manageV4WithHeaderScrollListener(ecf0 viewState) {
        tbf0 tbf0Var;
        r761 r761Var = (r761) getBinding();
        if (!viewState.g() || this.v4WithHeaderScrollListener != null) {
            if (viewState.g() || (tbf0Var = this.v4WithHeaderScrollListener) == null) {
                return;
            }
            r761Var.q.removeOnScrollListener(tbf0Var);
            this.v4WithHeaderScrollListener = null;
            return;
        }
        OrientationAwareRecyclerView orientationAwareRecyclerView = r761Var.q;
        LinearLayoutCompat linearLayoutCompat = r761Var.t;
        ProductsV4GradientView productsV4GradientView = r761Var.k;
        ProductsV4GradientView productsV4GradientView2 = viewState.k() != null ? r761Var.j : null;
        c8u0 c8u0Var = this.statusBarAndToolbarColors;
        tbf0 tbf0Var2 = new tbf0(orientationAwareRecyclerView, linearLayoutCompat, productsV4GradientView, productsV4GradientView2, c8u0Var == null ? null : c8u0Var, new ProductsFragment$manageV4WithHeaderScrollListener$1$2(this));
        b.t(r761Var.q, tbf0Var2);
        this.v4WithHeaderScrollListener = tbf0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$10(ProductsFragment productsFragment, CustomSwipeRefreshLayout customSwipeRefreshLayout, View view) {
        return productsFragment.canScrollUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onViewCreated$lambda$11(ProductsFragment productsFragment, Uri uri) {
        return ((a) productsFragment.getViewModel()).p0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$12(ProductsFragment productsFragment, tb6 tb6Var) {
        ((a) productsFragment.getViewModel()).h0(tb6Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$13(ProductsFragment productsFragment) {
        ((a) productsFragment.getViewModel()).m0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$14(ProductsFragment productsFragment, View view) {
        ((a) productsFragment.getViewModel()).i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onViewCreated$lambda$15(ProductsFragment productsFragment, Uri uri) {
        return ((a) productsFragment.getViewModel()).p0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onViewCreated$lambda$16(ProductsFragment productsFragment, Uri uri) {
        return ((a) productsFragment.getViewModel()).p0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$17(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$7(ProductsFragment productsFragment) {
        ((a) productsFragment.getViewModel()).d0(false);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$9$lambda$8(ProductsFragment productsFragment) {
        ((a) productsFragment.getViewModel()).d0(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderEducationV2(ecf0 viewState) {
        r761 r761Var = (r761) getBinding();
        yon j = viewState.j();
        if (j == null) {
            return;
        }
        lpn lpnVar = this.educationsV2View;
        if (lpnVar == null) {
            lpnVar = ((apn) this.educationsFeature).a().h(requireContext(), r761Var.o());
            this.educationsV2View = lpnVar;
            lpnVar.setScrollContext(new xon(viewState.l(), r761Var.q, r761Var.b));
            lpnVar.setOnDismissListener(new w9f0(this, 1));
        }
        lpnVar.render(j);
        ((a) getViewModel()).j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderEducationV2$lambda$34$lambda$33$lambda$32(ProductsFragment productsFragment) {
        productsFragment.educationsV2View = null;
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderLoading(jcf0 viewState) {
        gcf0 gcf0Var = viewState instanceof gcf0 ? (gcf0) viewState : null;
        boolean l = jl40.l(gcf0Var != null ? gcf0Var.i() : null, vvb1.M);
        boolean z = (gcf0Var != null ? gcf0Var.i() : null) instanceof hcf0;
        r761 r761Var = (r761) getBinding();
        ShimmerFrameLayout shimmerFrameLayout = r761Var.r;
        DivSkeletonsView divSkeletonsView = r761Var.f;
        shimmerFrameLayout.setVisibility(l ? 0 : 8);
        divSkeletonsView.setVisibility(z ? 0 : 8);
        if (z) {
            divSkeletonsView.render(new eal(((hcf0) gcf0Var.i()).a(), false, null, 6));
        }
        if (this.isProductsV4Enabled) {
            r761Var.q.setItemAnimator(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderTsarButton(jcf0 viewState) {
        ecf0 ecf0Var = viewState instanceof ecf0 ? (ecf0) viewState : null;
        lj11 o = ecf0Var != null ? ecf0Var.o() : null;
        boolean z = o != null;
        if (!z) {
            ((r761) getBinding()).u.cancelAnimations();
        }
        ((r761) getBinding()).u.setVisibility(z ? 0 : 8);
        if (o != null) {
            ((r761) getBinding()).u.render(o);
        }
        OrientationAwareRecyclerView orientationAwareRecyclerView = ((r761) getBinding()).q;
        orientationAwareRecyclerView.setPadding(orientationAwareRecyclerView.getPaddingLeft(), orientationAwareRecyclerView.getPaddingTop(), orientationAwareRecyclerView.getPaddingRight(), z ? this.isProductsV4Enabled ? TSAR_BUTTON_RECYCLER_PADDING_BOTTOM_V4 : TSAR_BUTTON_RECYCLER_PADDING_BOTTOM : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void renderViewStateContent(ecf0 viewState) {
        rbf0 k;
        r761 r761Var = (r761) getBinding();
        r761Var.p.setRefreshing(viewState.p());
        boolean z = this.previousViewState instanceof gcf0;
        if (viewState.d()) {
            rr51 n = viewState.n();
            if (n != null) {
                YbDivView.setData$default(r761Var.o, n, null, null, false, 14, null);
            }
        } else {
            r761Var.m.render(viewState.m(), z);
            ((a) getViewModel()).l0();
            List a = viewState.m().a();
            ArrayList arrayList = new ArrayList(tcc.n(a, 10));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                arrayList.add(((n7f0) it.next()).b());
            }
            String obj = arrayList.toString();
            if (!jl40.l(this.previousCardsInStack, obj)) {
                ((a) getViewModel()).f0();
                this.previousCardsInStack = obj;
            }
        }
        if (this.isProductsV4Enabled) {
            jcf0 jcf0Var = this.previousViewState;
            if ((jcf0Var instanceof ecf0) && !jl40.l(((ecf0) jcf0Var).l(), viewState.l())) {
                this.adapter.h(viewState.l(), new oxe0(6, r761Var));
                setupUserInfoBlock(viewState);
                updateRecyclerTopMargin();
                if (z) {
                    animateEnterTsarButton();
                }
                renderEducationV2(viewState);
                k = viewState.k();
                if (k != null) {
                    r761Var.j.render(k);
                }
                manageV4WithHeaderScrollListener(viewState);
            }
        }
        this.adapter.g(viewState.l());
        setupUserInfoBlock(viewState);
        updateRecyclerTopMargin();
        if (z) {
        }
        renderEducationV2(viewState);
        k = viewState.k();
        if (k != null) {
        }
        manageV4WithHeaderScrollListener(viewState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderViewStateContent$lambda$28$lambda$26(r761 r761Var) {
        if (r761Var.q.getItemAnimator() == null) {
            r761Var.q.setItemAnimator(new h());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setRefreshLayoutProgressViewOffset(int topPadding) {
        r761 r761Var = (r761) getBinding();
        if (r761Var.p.isRefreshing()) {
            return;
        }
        r761Var.p.setProgressViewOffset(false, topPadding - getResources().getDimensionPixelSize(cwg0.ybsdk_products_ptr_start_offset), topPadding + getResources().getDimensionPixelSize(cwg0.ybsdk_products_ptr_end_offset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setStatusBarAndToolbarColors(lsz0 toolbarBackground, ColorModel ybLogoColor, ColorModel closeButtonColor, z1x0 statusBarColor) {
        r761 r761Var = (r761) getBinding();
        toolbarBackground.a(r761Var.t);
        b.z(r761Var.v, ybLogoColor.get(sm91.c(r761Var)));
        b.z(r761Var.d, closeButtonColor.get(sm91.c(r761Var)));
        setStatusBarColorModel(statusBarColor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupEducations() {
        r761 r761Var = (r761) getBinding();
        li91.j(r761Var.q, TagId.PRODUCTS_RECYCLER.getTagId());
        li91.j(r761Var.u, TagId.TSAR_BUTTON.getTagId());
        li91.j(r761Var.c, TagId.BOTTOM_BAR.getTagId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupUserInfoBlock(ecf0 viewState) {
        r761 r761Var = (r761) getBinding();
        rr51 i = viewState.i();
        r761Var.h.setVisibility(i != null ? 0 : 8);
        if (i == null || i.equals(this.currentUserBlockDivData)) {
            return;
        }
        YbDivView.setData$default(r761Var.h, i, null, null, false, 14, null);
        this.currentUserBlockDivData = i;
    }

    private final void setupViews(jcf0 viewState) {
        jcf0 jcf0Var;
        jcf0 jcf0Var2;
        this.isProductsV4Enabled = viewState.d();
        this.isProductsV4HeaderEnabled = viewState.g();
        if (this.needToSetupViews || (jcf0Var = this.previousViewState) == null || this.isProductsV4Enabled != jcf0Var.d() || (jcf0Var2 = this.previousViewState) == null || this.isProductsV4HeaderEnabled != jcf0Var2.g()) {
            this.needToSetupViews = false;
            if (this.isProductsV4Enabled) {
                setupViewsForV4();
            } else {
                setupViewsForV3();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupViewsForV3() {
        r761 r761Var = (r761) getBinding();
        YbDivView ybDivView = r761Var.o;
        AppCompatImageView appCompatImageView = r761Var.g;
        LinearLayoutCompat linearLayoutCompat = r761Var.t;
        OrientationAwareRecyclerView orientationAwareRecyclerView = r761Var.q;
        ybDivView.setVisibility(8);
        int i = 0;
        r761Var.m.setVisibility(0);
        b.x(ung0.ybColor_background_primary, r761Var.n);
        r761Var.l.setClipChildren(true);
        u1w u1wVar = this.currentInsets;
        int i2 = u1wVar != null ? u1wVar.b : 0;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(lwg0.ybsdk_toolbar_height);
        int i3 = i2 + dimensionPixelOffset;
        CustomSwipeRefreshLayout customSwipeRefreshLayout = r761Var.p;
        customSwipeRefreshLayout.setPadding(customSwipeRefreshLayout.getPaddingLeft(), i3, customSwipeRefreshLayout.getPaddingRight(), customSwipeRefreshLayout.getPaddingBottom());
        setRefreshLayoutProgressViewOffset(i3);
        r761Var.e.setMinimumHeight(0);
        orientationAwareRecyclerView.setBackgroundResource(eyg0.ybsdk_bg_products_recycler);
        orientationAwareRecyclerView.setPadding(orientationAwareRecyclerView.getPaddingLeft(), getResources().getDimensionPixelSize(cwg0.ybsdk_products_recycler_padding_top), orientationAwareRecyclerView.getPaddingRight(), orientationAwareRecyclerView.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = linearLayoutCompat.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i2;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = dimensionPixelOffset;
        linearLayoutCompat.setLayoutParams(layoutParams2);
        linearLayoutCompat.setPadding(linearLayoutCompat.getPaddingLeft(), 0, linearLayoutCompat.getPaddingRight(), linearLayoutCompat.getPaddingBottom());
        c8u0 c8u0Var = this.statusBarAndToolbarColors;
        if (c8u0Var == null) {
            c8u0Var = null;
        }
        b.z(appCompatImageView, c8u0Var.c().get(sm91.c(r761Var)));
        ViewGroup.LayoutParams layoutParams3 = appCompatImageView.getLayoutParams();
        if (layoutParams3 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams3.height = dimensionPixelOffset;
        appCompatImageView.setLayoutParams(layoutParams3);
        ksz0 ksz0Var = new ksz0(ung0.ybColor_background_primary, i);
        c8u0 c8u0Var2 = this.statusBarAndToolbarColors;
        if (c8u0Var2 == null) {
            c8u0Var2 = null;
        }
        ColorModel.Attr c = c8u0Var2.c();
        c8u0 c8u0Var3 = this.statusBarAndToolbarColors;
        if (c8u0Var3 == null) {
            c8u0Var3 = null;
        }
        ColorModel.Attr a = c8u0Var3.a();
        c8u0 c8u0Var4 = this.statusBarAndToolbarColors;
        setStatusBarAndToolbarColors(ksz0Var, c, a, (c8u0Var4 != null ? c8u0Var4 : null).e());
        r761Var.i.setChangeVisibilityWithDelay(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupViewsForV4() {
        r761 r761Var = (r761) getBinding();
        int i = 0;
        if (this.isProductsV4HeaderEnabled) {
            r761Var.o.setVisibility(0);
            r761Var.k.setVisibility(0);
            r761Var.l.setClipChildren(false);
            b.x(ung0.ybColor_newMainBackground_secondaryStatic, r761Var.n);
            r761Var.q.setBackgroundResource(eyg0.ybsdk_bg_products_recycler_v4);
            ksz0 ksz0Var = new ksz0(ung0.ybColor_internal_transparent, i);
            c8u0 c8u0Var = this.statusBarAndToolbarColors;
            if (c8u0Var == null) {
                c8u0Var = null;
            }
            ColorModel.Attr b = c8u0Var.b();
            c8u0 c8u0Var2 = this.statusBarAndToolbarColors;
            if (c8u0Var2 == null) {
                c8u0Var2 = null;
            }
            ColorModel.Attr b2 = c8u0Var2.b();
            c8u0 c8u0Var3 = this.statusBarAndToolbarColors;
            if (c8u0Var3 == null) {
                c8u0Var3 = null;
            }
            setStatusBarAndToolbarColors(ksz0Var, b, b2, z1x0.a(c8u0Var3.e(), mob1.c(true, true)));
            AppCompatImageView appCompatImageView = r761Var.g;
            c8u0 c8u0Var4 = this.statusBarAndToolbarColors;
            b.z(appCompatImageView, (c8u0Var4 != null ? c8u0Var4 : null).d().get(sm91.c(r761Var)));
            r761Var.i.setChangeVisibilityWithDelay(false);
        } else {
            r761Var.o.setVisibility(8);
            r761Var.k.setVisibility(8);
            r761Var.l.setClipChildren(true);
            int i2 = ung0.ybColor_background_secondary;
            b.x(i2, r761Var.n);
            b.x(i2, r761Var.q);
            ksz0 ksz0Var2 = new ksz0(eyg0.ybsdk_bg_products_toolbar_v4, 2);
            c8u0 c8u0Var5 = this.statusBarAndToolbarColors;
            if (c8u0Var5 == null) {
                c8u0Var5 = null;
            }
            ColorModel.Attr c = c8u0Var5.c();
            c8u0 c8u0Var6 = this.statusBarAndToolbarColors;
            if (c8u0Var6 == null) {
                c8u0Var6 = null;
            }
            ColorModel.Attr a = c8u0Var6.a();
            c8u0 c8u0Var7 = this.statusBarAndToolbarColors;
            if (c8u0Var7 == null) {
                c8u0Var7 = null;
            }
            setStatusBarAndToolbarColors(ksz0Var2, c, a, c8u0Var7.e());
            AppCompatImageView appCompatImageView2 = r761Var.g;
            c8u0 c8u0Var8 = this.statusBarAndToolbarColors;
            b.z(appCompatImageView2, (c8u0Var8 != null ? c8u0Var8 : null).c().get(sm91.c(r761Var)));
            r761Var.i.setChangeVisibilityWithDelay(true);
        }
        ProductCardListView productCardListView = r761Var.m;
        LinearLayoutCompat linearLayoutCompat = r761Var.t;
        productCardListView.setVisibility(8);
        u1w u1wVar = this.currentInsets;
        int i3 = u1wVar != null ? u1wVar.b : 0;
        int dimensionPixelSize = getResources().getDimensionPixelSize(cwg0.ybsdk_products_v4_toolbar_height);
        int i4 = dimensionPixelSize + i3;
        CustomSwipeRefreshLayout customSwipeRefreshLayout = r761Var.p;
        customSwipeRefreshLayout.setPadding(customSwipeRefreshLayout.getPaddingLeft(), 0, customSwipeRefreshLayout.getPaddingRight(), customSwipeRefreshLayout.getPaddingBottom());
        setRefreshLayoutProgressViewOffset(i4);
        r761Var.e.setMinimumHeight(this.isProductsV4HeaderEnabled ? getResources().getDimensionPixelOffset(cwg0.ybsdk_products_v4_header_collapsed_margin) + i4 : 0);
        OrientationAwareRecyclerView orientationAwareRecyclerView = r761Var.q;
        orientationAwareRecyclerView.setPadding(orientationAwareRecyclerView.getPaddingLeft(), 0, orientationAwareRecyclerView.getPaddingRight(), orientationAwareRecyclerView.getPaddingBottom());
        linearLayoutCompat.setBackgroundResource(eyg0.ybsdk_bg_products_toolbar_v4);
        ViewGroup.LayoutParams layoutParams = linearLayoutCompat.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = i4;
        linearLayoutCompat.setLayoutParams(layoutParams2);
        linearLayoutCompat.setPadding(linearLayoutCompat.getPaddingLeft(), i3, linearLayoutCompat.getPaddingRight(), linearLayoutCompat.getPaddingBottom());
        AppCompatImageView appCompatImageView3 = r761Var.g;
        ViewGroup.LayoutParams layoutParams3 = appCompatImageView3.getLayoutParams();
        if (layoutParams3 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else {
            layoutParams3.height = dimensionPixelSize;
            appCompatImageView3.setLayoutParams(layoutParams3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showBottomSheet(rr51 divData, ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType bottomSheetType) {
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialog;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        this.bottomSheetDialog = null;
        BottomSheetDialogView.State state = new BottomSheetDialogView.State(new e(null, null, new kqe0(1, this, divData, bottomSheetType), 3), null, null, null, null, null, null, null, null, 131068);
        int i = 0;
        BottomSheetDialogView bottomSheetDialogView2 = new BottomSheetDialogView(requireContext(), null, i, 6, null);
        bottomSheetDialogView2.onDismiss(new x9f0(this, 0));
        bottomSheetDialogView2.render(state);
        BottomSheetDialogView.show$default(bottomSheetDialogView2, requireActivity(), null, 2, null);
        this.bottomSheetDialog = bottomSheetDialogView2;
        ((a) getViewModel()).n0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View showBottomSheet$lambda$42(ProductsFragment productsFragment, rr51 rr51Var, ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType productsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType) {
        YbDivView ybDivView = new YbDivView(productsFragment.getDivContext(), null, 0, 6, null);
        YbDivView.setData$default(ybDivView, rr51Var, null, null, false, 14, null);
        ybDivView.setActionHandler(new ugd0(9, productsFragment, productsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType));
        return ybDivView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean showBottomSheet$lambda$42$lambda$41$lambda$40(ProductsFragment productsFragment, ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType productsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType, Uri uri) {
        BottomSheetDialogView bottomSheetDialogView = productsFragment.bottomSheetDialog;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        return ((a) productsFragment.getViewModel()).g0(uri, productsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 showBottomSheet$lambda$44$lambda$43(ProductsFragment productsFragment, boolean z) {
        ((a) productsFragment.getViewModel()).n0(false);
        return zy11.a;
    }

    private final void showRateAppBottomSheet() {
        nb00 nb00Var = this.rateProvider;
        requireActivity();
        ((s400) nb00Var).getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final zy11 showRateAppBottomSheet$lambda$45(ProductsFragment productsFragment) {
        ((a) productsFragment.getViewModel()).n0(false);
        ((a) productsFragment.getViewModel()).k0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final zy11 showRateAppBottomSheet$lambda$46(ProductsFragment productsFragment) {
        ((a) productsFragment.getViewModel()).n0(true);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showServerTooltip(auq0 entity) {
        ((juq0) this.serverTooltipsFeature).a(new fuq0(((r761) getBinding()).o(), entity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateContentPadding(u1w insets) {
        r761 r761Var = (r761) getBinding();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(lwg0.ybsdk_toolbar_height);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(cwg0.ybsdk_products_v4_toolbar_height);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(cwg0.ybsdk_products_v4_header_collapsed_margin);
        CollapsingToolbarLayout collapsingToolbarLayout = r761Var.e;
        ErrorView errorView = r761Var.i;
        BottomBarNavigation bottomBarNavigation = r761Var.c;
        LinearLayoutCompat linearLayoutCompat = r761Var.t;
        collapsingToolbarLayout.setMinimumHeight(this.isProductsV4HeaderEnabled ? insets.b + dimensionPixelOffset2 + dimensionPixelOffset3 : 0);
        ViewGroup.LayoutParams layoutParams = linearLayoutCompat.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        boolean z = this.isProductsV4Enabled;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = z ? 0 : insets.b;
        int i = insets.a;
        int i2 = insets.d;
        int i3 = insets.c;
        int i4 = insets.b;
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = i;
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = i3;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = z ? i4 + dimensionPixelOffset2 : dimensionPixelOffset;
        linearLayoutCompat.setLayoutParams(layoutParams2);
        linearLayoutCompat.setPadding(linearLayoutCompat.getPaddingLeft(), this.isProductsV4Enabled ? i4 : 0, linearLayoutCompat.getPaddingRight(), linearLayoutCompat.getPaddingBottom());
        CustomSwipeRefreshLayout customSwipeRefreshLayout = r761Var.p;
        customSwipeRefreshLayout.setPadding(customSwipeRefreshLayout.getPaddingLeft(), this.isProductsV4Enabled ? 0 : i4 + dimensionPixelOffset, customSwipeRefreshLayout.getPaddingRight(), customSwipeRefreshLayout.getPaddingBottom());
        setRefreshLayoutProgressViewOffset(this.isProductsV4Enabled ? dimensionPixelOffset2 + i4 : i4 + dimensionPixelOffset);
        bottomBarNavigation.applyBottomInset(i2);
        ViewGroup.LayoutParams layoutParams3 = bottomBarNavigation.getLayoutParams();
        if (layoutParams3 == null) {
            ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = i;
        ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = i3;
        bottomBarNavigation.setLayoutParams(layoutParams4);
        LinearLayout p = r761Var.s.p();
        p.setPadding(p.getPaddingLeft(), i4, p.getPaddingRight(), p.getPaddingBottom());
        errorView.setPadding(errorView.getPaddingLeft(), i4, errorView.getPaddingRight(), errorView.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams5 = errorView.getLayoutParams();
        if (layoutParams5 == null) {
            ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = i2;
        ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = i;
        ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = i3;
        errorView.setLayoutParams(layoutParams6);
        AppCompatImageView appCompatImageView = r761Var.g;
        ViewGroup.LayoutParams layoutParams7 = appCompatImageView.getLayoutParams();
        if (layoutParams7 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams7;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i4, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        appCompatImageView.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateRecyclerTopMargin() {
        OrientationAwareRecyclerView orientationAwareRecyclerView = ((r761) getBinding()).q;
        ViewGroup.LayoutParams layoutParams = orientationAwareRecyclerView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (this.isProductsV4Enabled) {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 0, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        } else {
            float f = 1.0f - this.currentAppBarScrollProgress;
            ProductCardListView.Companion.getClass();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) (g7f0.a() * f), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        orientationAwareRecyclerView.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof bcf0) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((bcf0) sideEffect).a(), null, 12);
            return;
        }
        if (sideEffect.equals(xbf0.a)) {
            ((r761) getBinding()).b.setExpanded(true, true);
            ((r761) getBinding()).q.scrollToPosition(0);
            return;
        }
        if (sideEffect instanceof zbf0) {
            showRateAppBottomSheet();
            return;
        }
        if (sideEffect instanceof wbf0) {
            dismissEducation();
        } else if (sideEffect instanceof ybf0) {
            ((a) getViewModel()).q0(((ybf0) sideEffect).a());
        } else if (sideEffect instanceof acf0) {
            showServerTooltip(((acf0) sideEffect).a());
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((dcf0) this.factoryOfViewModel).a();
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public r761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        final r761 p = r761.p(inflater, container);
        OrientationAwareRecyclerView orientationAwareRecyclerView = p.q;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(sm91.c(p));
        linearLayoutManager.Q = false;
        orientationAwareRecyclerView.setLayoutManager(linearLayoutManager);
        orientationAwareRecyclerView.setConfig(((a) getViewModel()).c0());
        orientationAwareRecyclerView.setAdapter(this.adapter);
        this.statusBarAndToolbarColors = new c8u0(sm91.c(p));
        b.s(p.b, new ip2() { // from class: y9f0
            @Override // defpackage.gp2
            public final void a(AppBarLayout appBarLayout, int i) {
                ProductsFragment.getViewBinding$lambda$5$lambda$4(ProductsFragment.this, p, appBarLayout, i);
            }
        });
        ((r400) this.mainScreenPermissionsController).getClass();
        return p;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        if (!insets.a.o()) {
            u1w f = p7b1.f(insets);
            updateContentPadding(f);
            this.currentInsets = f;
        }
        return insets;
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        boolean z = this.educationsV2View != null;
        if (z) {
            dismissEducation();
        }
        return z;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tje.N(eja1.s(this), null, null, new ProductsFragment$onCreate$1$1(this, null), 3);
        tje.N(eja1.s(this), null, null, new ProductsFragment$onCreate$1$2(this, null), 3);
        tje.N(eja1.s(this), null, null, new ProductsFragment$onCreate$1$3(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((r761) getBinding()).q.setAdapter(null);
        this.bottomSheetDialog = null;
        this.educationsV2View = null;
        ((a) getViewModel()).n0(false);
        ((r761) getBinding()).m.cancelAnimation();
        this.currentUserBlockDivData = null;
        this.needToSetupViews = true;
        this.v4WithHeaderScrollListener = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [uc5] */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ((a) getViewModel()).o0(requireActivity().isChangingConfigurations());
        super.onViewCreated(view, savedInstanceState);
        handleCloseButtonVisibility();
        ((r761) getBinding()).i.setPrimaryButtonOnClickListener(new w9f0(this, 0));
        ((r761) getBinding()).p.setOnRefreshListener(new z9f0(this));
        ((r761) getBinding()).p.setOnChildScrollUpCallback(new z9f0(this));
        ((r761) getBinding()).m.setActionHandler(new x9f0(this, 1));
        ((r761) getBinding()).m.setOnProductClickListener(new ProductsFragment$onViewCreated$5(getViewModel()));
        int i = 2;
        ((r761) getBinding()).c.setOnTabClickListener(new x9f0(this, i));
        qx21.b(((r761) getBinding()).q);
        tje.N(eja1.s(getViewLifecycleOwner()), null, null, new ProductsFragment$onViewCreated$7(this, null), 3);
        ((r761) getBinding()).u.setOnClickListener(new w9f0(this, i));
        ((r761) getBinding()).d.setOnClickListener(new d5b0(20, this));
        setupEducations();
        ((r761) getBinding()).h.setActionHandler(new x9f0(this, 3));
        ((r761) getBinding()).o.setActionHandler(new x9f0(this, 4));
        ((r761) getBinding()).f.setOnTouchListener(new cz2(8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(jcf0 viewState) {
        r761 r761Var = (r761) getBinding();
        setupViews(viewState);
        rbf0 b = viewState.b();
        if (b != null) {
            r761Var.k.render(b);
        }
        renderLoading(viewState);
        ErrorView errorView = r761Var.i;
        BottomBarNavigation bottomBarNavigation = r761Var.c;
        errorView.render(viewState.e());
        bottomBarNavigation.setVisibility(viewState.c() ? 0 : 8);
        r761Var.t.setVisibility(viewState.f() ? 0 : 8);
        if ((viewState instanceof ecf0 ? (ecf0) viewState : null) != null) {
            renderViewStateContent((ecf0) viewState);
        }
        if ((viewState instanceof fcf0 ? (fcf0) viewState : null) != null) {
            c8u0 c8u0Var = this.statusBarAndToolbarColors;
            setStatusBarColorModel((c8u0Var != null ? c8u0Var : null).e());
        }
        rb6 a = viewState.a();
        if (a != null) {
            bottomBarNavigation.render(a);
            List a2 = a.a();
            ArrayList arrayList = new ArrayList(tcc.n(a2, 10));
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                arrayList.add(((tb6) it.next()).a());
            }
            this.bottomBarReporter.c(arrayList.toString());
        }
        changeShimmerAnimation(viewState);
        renderTsarButton(viewState);
        this.previousViewState = viewState;
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
