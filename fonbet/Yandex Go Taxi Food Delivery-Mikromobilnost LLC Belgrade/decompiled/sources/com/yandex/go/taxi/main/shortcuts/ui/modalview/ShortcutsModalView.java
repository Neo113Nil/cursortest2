package com.yandex.go.taxi.main.shortcuts.ui.modalview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import com.yandex.go.address.models.Address;
import com.yandex.go.shortcuts.dto.request.ProductsParam;
import com.yandex.go.shortcuts.dto.response.ProductsResponse;
import com.yandex.go.shortcuts.impl.interactors.z;
import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutModalViewMvp;
import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutsModalView;
import defpackage.abf0;
import defpackage.b7p0;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.dzg0;
import defpackage.e230;
import defpackage.eaj0;
import defpackage.eg3;
import defpackage.ezs;
import defpackage.fz2;
import defpackage.gwx0;
import defpackage.h3y;
import defpackage.h61;
import defpackage.hbp0;
import defpackage.hc00;
import defpackage.hxx;
import defpackage.hzr0;
import defpackage.i3y;
import defpackage.ic00;
import defpackage.ior;
import defpackage.jc00;
import defpackage.jl40;
import defpackage.kc00;
import defpackage.lg;
import defpackage.mrg0;
import defpackage.ndh0;
import defpackage.ng;
import defpackage.nuy;
import defpackage.peh0;
import defpackage.pep0;
import defpackage.pre0;
import defpackage.pzt0;
import defpackage.qaf0;
import defpackage.qgn0;
import defpackage.qje;
import defpackage.qr31;
import defpackage.quq0;
import defpackage.r4s0;
import defpackage.s2s0;
import defpackage.sls;
import defpackage.t030;
import defpackage.t1w;
import defpackage.t4s0;
import defpackage.tje;
import defpackage.tls;
import defpackage.u2s0;
import defpackage.u4s0;
import defpackage.uaf0;
import defpackage.ukh0;
import defpackage.v2s0;
import defpackage.vb90;
import defpackage.vng;
import defpackage.w130;
import defpackage.w2s0;
import defpackage.w40;
import defpackage.wor0;
import defpackage.x0s0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y700;
import defpackage.yaf0;
import defpackage.yln;
import defpackage.z700;
import defpackage.zaf0;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.mainscreen.analytics.MainScreenAnalyticsScreenMode;
import ru.yandex.taxi.perf.screen.ElementPerformanceState;
import ru.yandex.taxi.preorder.source.domain.s;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.view.BaseAddressSearchView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;
import ru.yandex.taxi.widget.modalview.ModalViewProcessing$ProcessingState;

@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ´\u00012\u00020\u00012\u00020\u0002:\u0006\u0093\u0001µ\u0001¶\u0001BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001bH\u0014¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010\u001fJ\u000f\u0010#\u001a\u00020\u001bH\u0014¢\u0006\u0004\b#\u0010\u001fJ\u000f\u0010$\u001a\u00020\u0012H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0012H\u0014¢\u0006\u0004\b-\u0010%J\u001f\u00101\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.H\u0014¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u001b2\u0006\u00104\u001a\u000203H\u0014¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001bH\u0014¢\u0006\u0004\b7\u0010\u001fJ\u0019\u0010:\u001a\u00020\u001b2\b\b\u0001\u00109\u001a\u000208H\u0014¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020\u001b2\u0006\u0010<\u001a\u0002032\u0006\u0010=\u001a\u00020\u0012H\u0014¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0012H\u0014¢\u0006\u0004\b@\u0010%J\u000f\u0010A\u001a\u00020\u001bH\u0014¢\u0006\u0004\bA\u0010\u001fJ\u000f\u0010B\u001a\u00020\u001bH\u0014¢\u0006\u0004\bB\u0010\u001fJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0012H\u0014¢\u0006\u0004\bF\u0010%J\u0017\u0010H\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020CH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u001bH\u0016¢\u0006\u0004\bJ\u0010\u001fJ\u000f\u0010K\u001a\u00020\u001bH\u0016¢\u0006\u0004\bK\u0010\u001fJ\u000f\u0010L\u001a\u00020\u0012H\u0016¢\u0006\u0004\bL\u0010%J\u000f\u0010M\u001a\u00020\u0012H\u0016¢\u0006\u0004\bM\u0010%J\u0017\u0010P\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010P\u001a\u00020\u001b2\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bP\u0010TJ\u000f\u0010U\u001a\u00020\u001bH\u0016¢\u0006\u0004\bU\u0010\u001fJ\u0019\u0010X\u001a\u00020\u001b2\b\u0010W\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u0010ZJ\u0017\u0010\\\u001a\u00020\u001b2\u0006\u0010[\u001a\u000208H\u0016¢\u0006\u0004\b\\\u0010;J\u000f\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u001bH\u0014¢\u0006\u0004\b`\u0010\u001fJ\u0017\u0010b\u001a\u00020\u001b2\u0006\u0010a\u001a\u000208H\u0014¢\u0006\u0004\bb\u0010;J\u000f\u0010c\u001a\u000203H\u0016¢\u0006\u0004\bc\u0010ZJ\u0019\u0010d\u001a\u00020\u001b2\b\u0010W\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bd\u0010YJ\u000f\u0010e\u001a\u00020\u001bH\u0002¢\u0006\u0004\be\u0010\u001fJ\u000f\u0010f\u001a\u000203H\u0002¢\u0006\u0004\bf\u0010ZJ\u000f\u0010g\u001a\u00020\u001bH\u0002¢\u0006\u0004\bg\u0010\u001fJ\u000f\u0010h\u001a\u00020\u001bH\u0002¢\u0006\u0004\bh\u0010\u001fJ\u000f\u0010i\u001a\u00020\u001bH\u0002¢\u0006\u0004\bi\u0010\u001fJ\u000f\u0010j\u001a\u00020\u001bH\u0002¢\u0006\u0004\bj\u0010\u001fJ\u000f\u0010k\u001a\u00020\u001bH\u0002¢\u0006\u0004\bk\u0010\u001fJ\u000f\u0010l\u001a\u00020\u001bH\u0002¢\u0006\u0004\bl\u0010\u001fJ\u000f\u0010m\u001a\u00020\u001bH\u0002¢\u0006\u0004\bm\u0010\u001fJ\u000f\u0010n\u001a\u000203H\u0002¢\u0006\u0004\bn\u0010ZJ\u001f\u0010q\u001a\u00020\u001b2\u0006\u0010o\u001a\u00020C2\u0006\u0010p\u001a\u00020CH\u0002¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020\u001bH\u0002¢\u0006\u0004\bs\u0010\u001fJ\u000f\u0010u\u001a\u00020tH\u0002¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\u001bH\u0002¢\u0006\u0004\bw\u0010\u001fJ\u0017\u0010y\u001a\u00020\u001b2\u0006\u0010x\u001a\u00020\u0012H\u0002¢\u0006\u0004\by\u0010zJ\u000f\u0010{\u001a\u00020\tH\u0002¢\u0006\u0004\b{\u0010|J9\u0010\u0080\u0001\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010}*\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000~H\u0082\b¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u0082\u0001R\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0083\u0001R\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u0084\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010\u0085\u0001R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010\u0086\u0001R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u008b\u0001\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\"\u0010\u0091\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0094\u0001\u001a\u00070\u0093\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0017\u0010\u0096\u0001\u001a\u0002038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001c\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001a\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0017\u0010G\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bG\u0010¡\u0001R\u0017\u0010x\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bx\u0010\u0087\u0001R\u0019\u0010¢\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u0087\u0001R\u0019\u0010£\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u0087\u0001R\u0016\u0010¤\u0001\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010%R\u0016\u0010¥\u0001\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010%R\u0016\u0010§\u0001\u001a\u0002038TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010ZR\u0016\u0010¨\u0001\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010%R\u0017\u0010«\u0001\u001a\u0002088BX\u0082\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0017\u0010\u00ad\u0001\u001a\u0002088BX\u0082\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010ª\u0001R\u0018\u0010±\u0001\u001a\u00030®\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010³\u0001\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010%¨\u0006·\u0001"}, d2 = {"Lcom/yandex/go/taxi/main/shortcuts/ui/modalview/ShortcutsModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Ly700;", "Lr4s0;", "shortcutsView", "Li3y;", "Lru/yandex/taxi/search/address/view/CompositeAddressSearchView;", "addressSearchViewLazy", "Lnuy;", "Lz700;", "shortcutsModalViewListener", "Lcom/yandex/go/taxi/main/shortcuts/ui/modalview/b;", "presenter", "Lt4s0;", "shortcutsVisibilityTracker", "Lh3y;", "Ljc00;", "mainScreenStatusInteractorLazy", "", "isFullscreenSuggests", "<init>", "(Lr4s0;Li3y;Lnuy;Lcom/yandex/go/taxi/main/shortcuts/ui/modalview/b;Lt4s0;Lh3y;Z)V", "Le230;", "insetsType", "()Le230;", "Lt1w;", "insets", "Lzy11;", "onInsetsHandled", "(Lt1w;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "addLocateButton", "removeLocateButton", "onArrowClick", "hasCustomBackground", "()Z", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "useBelowCardDimming", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "", "contentTop", "onModalViewAppear", "(I)V", "onModalViewDisappear", "", "slideOffset", "onDialogSlide", "(F)V", "newState", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "canDragToExpandFromAnchored", "onTouchOutside", "onBackPressed", "Lru/yandex/taxi/widget/modalview/ModalViewProcessing$ProcessingState;", "getProcessingState", "()Lru/yandex/taxi/widget/modalview/ModalViewProcessing$ProcessingState;", "isArrowsPermanentlyHidden", "processingState", "setProcessingState", "(Lru/yandex/taxi/widget/modalview/ModalViewProcessing$ProcessingState;)V", "forceCollapse", "collapse", "isProcessing", "isStickOut", "Lru/yandex/taxi/search/address/view/PointType;", "activePoint", "showEditAddress", "(Lru/yandex/taxi/search/address/view/PointType;)V", "Landroid/net/Uri;", Constants.DEEPLINK, "(Landroid/net/Uri;)V", "proceed", "Lcom/yandex/go/address/models/Address;", "sourceAddress", "setSourceAddress", "(Lcom/yandex/go/address/models/Address;)V", "()I", "scale", "setDefaultHorizontalScaleX", "Landroid/graphics/Bitmap;", "takeScreenshot", "()Landroid/graphics/Bitmap;", "animateDismissBackground", "newOffset", "setBackgroundDimColor", "getTopPadding", "tryRenderPanoramaButton", "applyBackground", "bottomSheetCornerRadius", "refreshBottomSheetClip", "fillShortcutsRemainSpace", "removeShortcutsSpaceFiller", "cancelAppearAnimation", "initAddressSearchView", "initAddressInsetsHandler", "applyMinimizedProcessingSheetLayout", "computeMinimizedPeekHeightPx", "previous", "current", "restoreAnchoredStateIfCollapsedAfterLeavingMinimizedProcessing", "(Lru/yandex/taxi/widget/modalview/ModalViewProcessing$ProcessingState;Lru/yandex/taxi/widget/modalview/ModalViewProcessing$ProcessingState;)V", "updateHeights", "Lng;", "createAccessibilityButtonDelegate", "()Lng;", "initializeBackButton", "areShortcutsVisible", "changeShortcutsVisibility", "(Z)V", "modalListener", "()Lz700;", "T", "Lkotlin/Function1;", "body", "useIfAvailable", "(Li3y;Ltls;)Ljava/lang/Object;", "Lr4s0;", "Li3y;", "Lnuy;", "Lcom/yandex/go/taxi/main/shortcuts/ui/modalview/b;", "Lt4s0;", "Z", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "accessibilityButtonsDelegate", "Lng;", "Lt030;", "modalViewCompatibleDelegate", "Lt030;", "Lh61;", "addressInsetsHandler", "Lh61;", "Lw2s0;", "innerMvpView", "Lw2s0;", "defaultProcessingHeight", CA20Status.STATUS_USER_I, "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "locateButton", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "Lru/yandex/taxi/widget/floatbuttonholder/FloatButtonHolderLayout;", "floatButtonHolderLayout", "Lru/yandex/taxi/widget/floatbuttonholder/FloatButtonHolderLayout;", "Lru/yandex/taxi/widget/modalview/ModalViewProcessing$ProcessingState;", "minimized", "canMinimized", "isModalViewCollapsed", "isModalViewExpanded", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "isApplyDimming", "getExpandedCardToRootRatio", "()F", "expandedCardToRootRatio", "getSlideOffsetForAnchoredState", "slideOffsetForAnchoredState", "Landroid/graphics/Rect;", "getWindowBounds", "()Landroid/graphics/Rect;", "windowBounds", "getMapInteractionProcessingActive", "mapInteractionProcessingActive", "Companion", "wor0", "v2s0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ShortcutsModalView extends SlideableModalView implements y700 {
    private static final int BOTTOM_PADDING_LOCATE_BUTTON_DP = 9;
    public static final v2s0 Companion = new v2s0();
    private static final float DEFAULT_PROCESSING_FACTOR = 0.8f;
    public static final float DIM_HEIGHT_RATIO = 0.65f;
    private static final int MARGIN_HORIZONTAL_LOCATE_BUTTON_DP = 13;
    private final ng accessibilityButtonsDelegate;
    private h61 addressInsetsHandler;
    private final i3y addressSearchViewLazy;
    private boolean areShortcutsVisible;
    private FloatButtonIconComponent backButton;
    private boolean canMinimized;
    private final int defaultProcessingHeight;
    private FloatButtonHolderLayout floatButtonHolderLayout;
    private final w2s0 innerMvpView;
    private final boolean isFullscreenSuggests;
    private final View.OnLayoutChangeListener layoutChangeListener;
    private RotatableFloatButton locateButton;
    private boolean minimized;
    private final t030 modalViewCompatibleDelegate;
    private final b presenter;
    private ModalViewProcessing$ProcessingState processingState;
    private final nuy shortcutsModalViewListener;
    private final r4s0 shortcutsView;
    private final t4s0 shortcutsVisibilityTracker;

    public ShortcutsModalView(r4s0 r4s0Var, i3y i3yVar, nuy nuyVar, b bVar, t4s0 t4s0Var, h3y h3yVar, boolean z) {
        super(r4s0Var.getView().getContext(), 6);
        this.shortcutsView = r4s0Var;
        this.addressSearchViewLazy = i3yVar;
        this.shortcutsModalViewListener = nuyVar;
        this.presenter = bVar;
        this.shortcutsVisibilityTracker = t4s0Var;
        this.isFullscreenSuggests = z;
        this.layoutChangeListener = new yln(28, this);
        this.accessibilityButtonsDelegate = createAccessibilityButtonDelegate();
        this.modalViewCompatibleDelegate = new qgn0(19, this);
        this.innerMvpView = new w2s0(this);
        this.defaultProcessingHeight = tje.r(mrg0.go_design_m_space, getContext());
        FloatButtonHolderLayout c = eg3.c(this, 13);
        c.setBottomPadding(tje.u(9, c.getContext()));
        this.floatButtonHolderLayout = c;
        this.processingState = ModalViewProcessing$ProcessingState.DONE;
        int i = 1;
        this.areShortcutsVisible = true;
        refreshTopPadding();
        setBehaviorAnchorHeight(0);
        r4s0Var.getView().setFocusable(true);
        r4s0Var.getView().setClickable(true);
        ic00 ic00Var = ((kc00) ((jc00) h3yVar.get())).a;
        ic00Var.getClass();
        if (ic00Var instanceof hc00) {
            initializeBackButton();
        }
        getBottomSheetBehavior().J(true);
        getCardContentContainer().addView(r4s0Var.getView());
        if (i3yVar.isInitialized()) {
            ((CompositeAddressSearchView) i3yVar.getValue()).setVisibility(8);
            initAddressInsetsHandler();
        }
        refreshNestedScrollView(r4s0Var.getView());
        getBottomSheetBehavior().g0 = true;
        onBehaviorStateChanged(6, false);
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
        setSpringStiffness(50.0f);
        applyBackground();
        ru.yandex.taxi.design.utils.c.e(this, new s2s0(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ShortcutsModalView shortcutsModalView) {
        shortcutsModalView.presenter.H.i(new gwx0(ElementPerformanceState.FIRST_CONTENTFUL_PAINT));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLocateButton$lambda$0(ShortcutsModalView shortcutsModalView) {
        ((s) shortcutsModalView.presenter.I).c();
    }

    private final void applyBackground() {
        cvw.g0(0, bottomSheetCornerRadius(), getBottomSheet());
        i3y i3yVar = this.addressSearchViewLazy;
        if (i3yVar.isInitialized()) {
            cvw.g0(qje.t(xng0.bgMain, getContext()), this.isFullscreenSuggests ? 0 : this.shortcutsView.getCornerRadius(), (CompositeAddressSearchView) i3yVar.getValue());
        }
    }

    private final void applyMinimizedProcessingSheetLayout() {
        int computeMinimizedPeekHeightPx = computeMinimizedPeekHeightPx();
        if (computeMinimizedPeekHeightPx != peekHeight()) {
            setBehaviorPeekHeight(computeMinimizedPeekHeightPx, false);
        }
        if (!isCollapsed()) {
            setBehaviorState(4, true);
        }
        if (computeMinimizedPeekHeightPx != anchoredHeight()) {
            setUseOvershootSettling(false, 0);
            if (tje.L(getContext())) {
                setBehaviorAnchorHeight(Integer.valueOf((int) Math.max(getMaxAnchoredHeight(), computeMinimizedPeekHeightPx)));
            } else {
                setBehaviorAnchorHeight(Integer.valueOf(computeMinimizedPeekHeightPx));
            }
        }
        modalListener().D6(getCurrentInsets().b, computeMinimizedPeekHeightPx, false);
    }

    private final int bottomSheetCornerRadius() {
        if (!this.isFullscreenSuggests || this.areShortcutsVisible) {
            return this.shortcutsView.getCornerRadius();
        }
        return 0;
    }

    private final void cancelAppearAnimation() {
        Object tag = getTag(ndh0.appear_animation_helper);
        fz2 fz2Var = tag instanceof fz2 ? (fz2) tag : null;
        if (fz2Var == null) {
            fz2Var = new fz2(this);
            setTag(ndh0.appear_animation_helper, fz2Var);
        }
        fz2Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeShortcutsVisibility(boolean areShortcutsVisible) {
        if (areShortcutsVisible == this.areShortcutsVisible) {
            return;
        }
        this.areShortcutsVisible = areShortcutsVisible;
        if (areShortcutsVisible) {
            cma1.L((View) this.addressSearchViewLazy.getValue());
            cma1.J(this.shortcutsView.getView());
            enableBottomButtonsShow();
        } else {
            disableBottomButtonsShow();
            cma1.L(this.shortcutsView.getView());
            cma1.J((View) this.addressSearchViewLazy.getValue());
        }
        if (this.isFullscreenSuggests) {
            refreshBottomSheetClip();
            updateArrow();
        }
    }

    private final int computeMinimizedPeekHeightPx() {
        return (int) Math.max(this.defaultProcessingHeight + getCurrentInsets().g, (int) ((this.defaultProcessingHeight + getCurrentInsets().g) * 0.19999999f));
    }

    private final ng createAccessibilityButtonDelegate() {
        final int i = 0;
        final int i2 = 1;
        return new ng(this, this.shortcutsView.getView(), new lg(getTopPadding(), new sls(this) { // from class: t2s0
            public final /* synthetic */ ShortcutsModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 createAccessibilityButtonDelegate$lambda$0;
                zy11 createAccessibilityButtonDelegate$lambda$1;
                int i3 = i;
                ShortcutsModalView shortcutsModalView = this.b;
                switch (i3) {
                    case 0:
                        createAccessibilityButtonDelegate$lambda$0 = ShortcutsModalView.createAccessibilityButtonDelegate$lambda$0(shortcutsModalView);
                        return createAccessibilityButtonDelegate$lambda$0;
                    default:
                        createAccessibilityButtonDelegate$lambda$1 = ShortcutsModalView.createAccessibilityButtonDelegate$lambda$1(shortcutsModalView);
                        return createAccessibilityButtonDelegate$lambda$1;
                }
            }
        }, new sls(this) { // from class: t2s0
            public final /* synthetic */ ShortcutsModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 createAccessibilityButtonDelegate$lambda$0;
                zy11 createAccessibilityButtonDelegate$lambda$1;
                int i3 = i2;
                ShortcutsModalView shortcutsModalView = this.b;
                switch (i3) {
                    case 0:
                        createAccessibilityButtonDelegate$lambda$0 = ShortcutsModalView.createAccessibilityButtonDelegate$lambda$0(shortcutsModalView);
                        return createAccessibilityButtonDelegate$lambda$0;
                    default:
                        createAccessibilityButtonDelegate$lambda$1 = ShortcutsModalView.createAccessibilityButtonDelegate$lambda$1(shortcutsModalView);
                        return createAccessibilityButtonDelegate$lambda$1;
                }
            }
        }, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createAccessibilityButtonDelegate$lambda$0(ShortcutsModalView shortcutsModalView) {
        shortcutsModalView.onBackPressed();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createAccessibilityButtonDelegate$lambda$1(ShortcutsModalView shortcutsModalView) {
        shortcutsModalView.expand();
        shortcutsModalView.shortcutsView.scrollToTop();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fillShortcutsRemainSpace() {
        ViewGroup bottomSheet = getBottomSheet();
        Rect rect = xw31.a;
        ViewGroup.LayoutParams layoutParams = bottomSheet.getLayoutParams();
        layoutParams.height = -1;
        bottomSheet.setLayoutParams(layoutParams);
        int t = qje.t(xng0.bgMain, getContext());
        int bottomSheetCornerRadius = bottomSheetCornerRadius();
        bottomSheet.setBackgroundColor(t);
        bottomSheet.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(bottomSheetCornerRadius));
        bottomSheet.setClipToOutline(true);
    }

    private final float getExpandedCardToRootRatio() {
        return Math.min(getCardContentView().getHeight() / Math.max(getContent().getHeight(), 1.0f), 1.0f);
    }

    private final boolean getMapInteractionProcessingActive() {
        ModalViewProcessing$ProcessingState modalViewProcessing$ProcessingState = this.processingState;
        return modalViewProcessing$ProcessingState == ModalViewProcessing$ProcessingState.MINIMIZED || modalViewProcessing$ProcessingState == ModalViewProcessing$ProcessingState.STICK_OUT;
    }

    private final float getSlideOffsetForAnchoredState() {
        int height = getHeight() - getCardContentContainer().getHeight();
        AnchorBottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
        if (bottomSheetBehavior.w(bottomSheetBehavior.x) > height) {
            return 0.0f;
        }
        return getBottomSheetBehavior().z();
    }

    private final Rect getWindowBounds() {
        Rect rect = new Rect();
        getBottomSheet().getGlobalVisibleRect(rect);
        return rect;
    }

    private final void initAddressInsetsHandler() {
        h61 h61Var = new h61(this, (BaseAddressSearchView) this.addressSearchViewLazy.getValue(), false, false);
        h61Var.a(getCurrentInsets());
        this.addressInsetsHandler = h61Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initAddressSearchView() {
        if (this.addressSearchViewLazy.isInitialized()) {
            return;
        }
        CompositeAddressSearchView compositeAddressSearchView = (CompositeAddressSearchView) this.addressSearchViewLazy.getValue();
        applyBackground();
        initAddressInsetsHandler();
        compositeAddressSearchView.setModalViewCompatibleDelegate(this.modalViewCompatibleDelegate);
        compositeAddressSearchView.setOnKeyboardListener(new u2s0(this, 1));
    }

    private final void initializeBackButton() {
        BackButtonIconComponent backButtonIconComponent = new BackButtonIconComponent(getContext(), null, 0, 0, 14, null);
        backButtonIconComponent.setIconBackground(vng.t(dzg0.fab_component_light, backButtonIconComponent.getContext()));
        backButtonIconComponent.setBadgeBackgroundColor(qje.t(xng0.controlMain, backButtonIconComponent.getContext()));
        backButtonIconComponent.setBadgeTextColorAttr(xng0.textOnControl);
        backButtonIconComponent.setOnClickListener(new eaj0(19, this));
        addFloatButton(backButtonIconComponent, 8388611);
        this.backButton = backButtonIconComponent;
        setInterceptOnBackPress(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeBackButton$lambda$0$0(ShortcutsModalView shortcutsModalView, View view) {
        b bVar = shortcutsModalView.presenter;
        ic00 ic00Var = ((kc00) bVar.F).a;
        ic00Var.getClass();
        if (ic00Var instanceof hc00) {
            ((j) bVar.J.a).d("TaxiMainScreen.BackButton.Tapped").m();
            ((ShortcutModalViewMvp) bVar.Dg()).fc();
        } else {
            ((pep0) bVar.L).f(bVar.K.b.r(), new pre0("back button press from SPF main"), hxx.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ShortcutsModalView shortcutsModalView, t1w t1wVar) {
        i3y i3yVar = shortcutsModalView.addressSearchViewLazy;
        if (i3yVar.isInitialized()) {
            CompositeAddressSearchView compositeAddressSearchView = (CompositeAddressSearchView) i3yVar.getValue();
            h61 h61Var = shortcutsModalView.addressInsetsHandler;
            if (h61Var != null) {
                h61Var.a(t1wVar);
            }
            if (shortcutsModalView.isFullscreenSuggests) {
                compositeAddressSearchView.setTopSpaceAdditionalHeight(t1wVar.b);
            }
        }
        return zy11.a;
    }

    private final boolean isApplyDimming() {
        return getExpandedCardToRootRatio() >= 0.65f;
    }

    private final z700 modalListener() {
        return (z700) ((w40) this.shortcutsModalViewListener).a;
    }

    private final void refreshBottomSheetClip() {
        ViewGroup bottomSheet = getBottomSheet();
        bottomSheet.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(bottomSheetCornerRadius()));
        bottomSheet.setClipToOutline(true);
    }

    private final void removeShortcutsSpaceFiller() {
        ViewGroup.LayoutParams layoutParams = getBottomSheet().getLayoutParams();
        layoutParams.height = -2;
        getBottomSheet().setLayoutParams(layoutParams);
        getBottomSheet().setBackground(null);
    }

    private final void restoreAnchoredStateIfCollapsedAfterLeavingMinimizedProcessing(ModalViewProcessing$ProcessingState previous, ModalViewProcessing$ProcessingState current) {
        ModalViewProcessing$ProcessingState modalViewProcessing$ProcessingState = ModalViewProcessing$ProcessingState.MINIMIZED;
        if (previous == modalViewProcessing$ProcessingState && current != modalViewProcessing$ProcessingState && current != ModalViewProcessing$ProcessingState.STICK_OUT && behaviourFinalState() == 4) {
            anchor();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateHeights() {
        ezs ezsVar;
        qaf0 qaf0Var;
        double min;
        int i;
        int min2;
        boolean z;
        Boolean valueOf;
        boolean z2;
        boolean z3;
        ProductsResponse productsResponse;
        if (getProcessingState() == ModalViewProcessing$ProcessingState.MINIMIZED) {
            applyMinimizedProcessingSheetLayout();
            return;
        }
        if (getProcessingState() == ModalViewProcessing$ProcessingState.STICK_OUT) {
            i = tje.u(40, getContext()) + getCurrentInsets().g;
            min2 = i;
            z3 = true;
        } else {
            hzr0 hzr0Var = this.presenter.B;
            ic00 ic00Var = ((kc00) hzr0Var.b).a;
            ic00Var.getClass();
            uaf0 uaf0Var = ic00Var instanceof hc00 ? yaf0.b : yaf0.a;
            abf0 abf0Var = hzr0Var.a;
            zaf0 zaf0Var = (zaf0) abf0Var.a.getValue();
            qaf0 qaf0Var2 = zaf0Var.a;
            if (qaf0Var2 == null || !jl40.l(qaf0Var2.a, uaf0Var)) {
                zaf0 zaf0Var2 = abf0Var.b;
                if (zaf0Var2 != null && (qaf0Var = zaf0Var2.a) != null && jl40.l((uaf0) qaf0Var.a, uaf0Var)) {
                    zaf0 zaf0Var3 = abf0Var.b;
                    if ((zaf0Var3 != null ? new z(zaf0Var3.b) : null) != null && zaf0Var3 != null) {
                        ezsVar = (ezs) zaf0Var3.b.getValue();
                    }
                }
                ezsVar = null;
            } else {
                ezsVar = (ezs) zaf0Var.b.getValue();
            }
            Float f = (ezsVar == null || (productsResponse = ezsVar.b) == null) ? null : productsResponse.a;
            long a = ior.a(f == null ? 2.5f : 0.5f, Math.min(0.75f, Math.max(0.1f, f != null ? f.floatValue() : 0.33333334f)));
            int height = getContent().getHeight();
            int preferredLayoutHeight = this.shortcutsView.getPreferredLayoutHeight(Float.intBitsToFloat((int) (a >> 32))) + getCurrentInsets().g;
            int layoutHeight = this.shortcutsView.getLayoutHeight() + getCurrentInsets().g;
            int min3 = (int) Math.min(height, Math.max(Float.intBitsToFloat((int) (a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * getHeight(), Math.max(this.shortcutsView.getTopServicePosition(), this.shortcutsView.getBottomDestinationShortcutPosition())));
            boolean z4 = ((float) Math.abs(min3 - layoutHeight)) < ((ProductsParam.SupportedGrid) this.presenter.C.b.getValue()).b;
            if (preferredLayoutHeight >= min3) {
                min = Math.min(preferredLayoutHeight, height);
            } else if (z4) {
                i = layoutHeight;
                min2 = Math.min(this.shortcutsView.getBottomDestinationShortcutPosition() + getCurrentInsets().g, i);
                z = min2 >= i;
                if (this.canMinimized != z && !z) {
                    if (this.minimized) {
                        anchor();
                    }
                    getBottomSheetBehavior().W = false;
                }
                this.canMinimized = z;
                if (isApplyDimming() || z4) {
                    i3y i3yVar = this.addressSearchViewLazy;
                    valueOf = i3yVar.isInitialized() ? Boolean.valueOf(((CompositeAddressSearchView) i3yVar.getValue()).isAttachedToWindow()) : null;
                    if (!(valueOf == null ? valueOf.booleanValue() : false)) {
                        z2 = false;
                        getBottomSheetBehavior().V = z2;
                        getBottomSheetBehavior().B = z2;
                        z3 = false;
                    }
                }
                z2 = true;
                getBottomSheetBehavior().V = z2;
                getBottomSheetBehavior().B = z2;
                z3 = false;
            } else {
                min = Math.min(min3, layoutHeight);
            }
            i = (int) min;
            min2 = Math.min(this.shortcutsView.getBottomDestinationShortcutPosition() + getCurrentInsets().g, i);
            if (min2 >= i) {
            }
            if (this.canMinimized != z) {
                if (this.minimized) {
                }
                getBottomSheetBehavior().W = false;
            }
            this.canMinimized = z;
            if (isApplyDimming()) {
            }
            i3y i3yVar2 = this.addressSearchViewLazy;
            if (i3yVar2.isInitialized()) {
            }
            if (!(valueOf == null ? valueOf.booleanValue() : false)) {
            }
            z2 = true;
            getBottomSheetBehavior().V = z2;
            getBottomSheetBehavior().B = z2;
            z3 = false;
        }
        if (i != anchoredHeight()) {
            setUseOvershootSettling(false, 0);
            if (z3 || isApplyDimming()) {
                if (tje.L(getContext())) {
                    setBehaviorAnchorHeight(Integer.valueOf((int) Math.max(getMaxAnchoredHeight(), i)));
                } else {
                    setBehaviorAnchorHeight(Integer.valueOf(i));
                }
            }
            if (!this.minimized) {
                modalListener().D6(getCurrentInsets().b, i, !z3);
            }
        }
        int height2 = getCardContentContainer().getHeight();
        if (!isApplyDimming() && height2 >= i) {
            int[] iArr = {convertToOffset(i), convertToOffset(height2)};
            AnchorBottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
            int[] copyOf = Arrays.copyOf(iArr, 2);
            bottomSheetBehavior.H(Math.min(bottomSheetBehavior.x, copyOf.length - 1), false, Arrays.copyOf(copyOf, copyOf.length));
        }
        if (min2 != peekHeight()) {
            setBehaviorPeekHeight(min2);
            if (this.minimized) {
                modalListener().D6(getCurrentInsets().b, min2, !z3);
            }
        }
    }

    private final <T> T useIfAvailable(i3y i3yVar, tls tlsVar) {
        if (i3yVar.isInitialized()) {
            return (T) tlsVar.invoke(i3yVar.getValue());
        }
        return null;
    }

    @Override // defpackage.y700
    public void addLocateButton() {
        if (this.locateButton != null) {
            return;
        }
        this.locateButton = eg3.d(this.floatButtonHolderLayout, new s2s0(this, 0));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismissBackground() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        AnimUtils$AnimationStartEndListener animUtils$AnimationStartEndListener = new AnimUtils$AnimationStartEndListener(onAnimateShowStartAction, onAnimateShowEndAction);
        Object tag = getTag(ndh0.appear_animation_helper);
        fz2 fz2Var = tag instanceof fz2 ? (fz2) tag : null;
        if (fz2Var == null) {
            fz2Var = new fz2(this);
            setTag(ndh0.appear_animation_helper, fz2Var);
        }
        fz2Var.f(animUtils$AnimationStartEndListener);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        applyBackground();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, defpackage.y700
    public void collapse() {
        if (this.minimized) {
            super.collapse();
        } else {
            super.anchor();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.y700
    public int contentTop() {
        return this.minimized ? peekHeight() : anchoredHeight();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return getBottomSheet();
    }

    @Override // defpackage.y700
    public void forceCollapse() {
        this.shortcutsView.forceScrollToTop();
        collapse();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return ukh0.shortcuts_modal_view;
    }

    @Override // defpackage.y700
    public ModalViewProcessing$ProcessingState getProcessingState() {
        return this.processingState;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        if (this.isFullscreenSuggests) {
            return 0;
        }
        return super.getTopPadding();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: hasCustomBackground */
    public boolean getHasCustomBackgroundColor() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new quq0(8, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        if (!this.isFullscreenSuggests || this.areShortcutsVisible) {
            return super.getWithCloseButton();
        }
        return true;
    }

    public boolean isModalViewCollapsed() {
        return isCollapsed() || isAnchored();
    }

    @Override // defpackage.y700
    public boolean isModalViewExpanded() {
        int behaviourState = behaviourState();
        return (behaviourState == 6 && !getCanDragToExpandedState()) || behaviourState == 3 || behaviourState == 7;
    }

    @Override // defpackage.y700
    public boolean isProcessing() {
        return getProcessingState() != ModalViewProcessing$ProcessingState.DONE;
    }

    @Override // defpackage.y700
    public boolean isStickOut() {
        return getProcessingState() == ModalViewProcessing$ProcessingState.STICK_OUT;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onArrowClick() {
        if (isProcessing()) {
            return;
        }
        if (isApplyDimming() && (isModalViewCollapsed() || isAnchored())) {
            expand();
        } else {
            anchor();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.shortcutsView.setShortcutsVisibilityListener(new wor0(this));
        b bVar = this.presenter;
        bVar.Bg(this.innerMvpView);
        bVar.Ng();
        i3y i3yVar = this.addressSearchViewLazy;
        if (i3yVar.isInitialized()) {
            CompositeAddressSearchView compositeAddressSearchView = (CompositeAddressSearchView) i3yVar.getValue();
            compositeAddressSearchView.setModalViewCompatibleDelegate(this.modalViewCompatibleDelegate);
            compositeAddressSearchView.setOnKeyboardListener(new u2s0(this, 0));
        }
        addOnLayoutChangeListener(this.layoutChangeListener);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        forceCollapse();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        updateUserInteractionBlockingOutside();
        ((u4s0) this.shortcutsVisibilityTracker).d.set(getWindowBounds());
        setInterceptOnBackPress((newState == 4 || newState == 6) ? false : true);
        if (newState != 2) {
            setUseOvershootSettling(false, 0);
            if (newState != 1 && !getMapInteractionProcessingActive()) {
                boolean z = newState == 4 && this.canMinimized;
                if (z != this.minimized) {
                    this.minimized = z;
                }
            }
        }
        if (newState == 1) {
            setClickable(true);
            return;
        }
        if (newState == 2) {
            int behaviourFinalState = behaviourFinalState();
            boolean z2 = behaviourFinalState == 4 || behaviourFinalState == 6;
            setClickable(!z2);
            if (z2) {
                this.shortcutsView.scrollToTop();
                return;
            }
            return;
        }
        if (newState != 3) {
            if (newState == 4 || newState == 6) {
                b bVar = this.presenter;
                ((com.yandex.go.shortcuts.impl.analytic.a) bVar.A).n = false;
                bVar.D.a = ShortcutModalViewMvp.Mode.SHORTCUT;
                bVar.Ng();
                i3y i3yVar = this.addressSearchViewLazy;
                if (i3yVar.isInitialized()) {
                    ((CompositeAddressSearchView) i3yVar.getValue()).onCollapse(getProcessingState(), this.minimized, movedByUser);
                }
                changeShortcutsVisibility(true);
                onDialogSlide(getMapInteractionProcessingActive() ? 0.0f : getSlideOffsetForAnchoredState());
                setBackground(null);
                removeShortcutsSpaceFiller();
                z700 modalListener = modalListener();
                contentTop();
                modalListener.u3();
                if (!getMapInteractionProcessingActive()) {
                    modalListener().D6(getCurrentInsets().b, contentTop(), true);
                }
                setClickable(false);
                refreshNestedScrollView(this.shortcutsView.getView());
                getBottomSheetBehavior().W = this.canMinimized;
                this.accessibilityButtonsDelegate.a();
                if (xw31.i(this.shortcutsView.getView())) {
                    return;
                }
                this.accessibilityButtonsDelegate.d();
                return;
            }
            if (newState != 7) {
                return;
            }
        }
        onDialogSlide(1.0f);
        modalListener().qa();
        b bVar2 = this.presenter;
        ((com.yandex.go.shortcuts.impl.analytic.a) bVar2.A).n = true;
        if (bVar2.D.a == ShortcutModalViewMvp.Mode.ADDRESS) {
            ((ShortcutModalViewMvp) bVar2.Dg()).F2();
        } else {
            ((ShortcutModalViewMvp) bVar2.Dg()).requestFocus();
        }
        i3y i3yVar2 = this.addressSearchViewLazy;
        if (i3yVar2.isInitialized()) {
            ((CompositeAddressSearchView) i3yVar2.getValue()).onExpand(MainScreenAnalyticsScreenMode.SHORTCUTS, !this.areShortcutsVisible);
        }
        setClickable(true);
        getBottomSheetBehavior().W = false;
        this.accessibilityButtonsDelegate.c(true);
        this.accessibilityButtonsDelegate.b();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.shortcutsView.setShortcutsVisibilityListener(null);
        this.presenter.Cg();
        removeOnLayoutChangeListener(this.layoutChangeListener);
        cancelAppearAnimation();
        i3y i3yVar = this.addressSearchViewLazy;
        if (i3yVar.isInitialized()) {
            CompositeAddressSearchView compositeAddressSearchView = (CompositeAddressSearchView) i3yVar.getValue();
            compositeAddressSearchView.setOnKeyboardListener(null);
            compositeAddressSearchView.setModalViewCompatibleDelegate(null);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float slideOffset) {
        b bVar = this.presenter;
        boolean z = getProcessingState() == ModalViewProcessing$ProcessingState.DONE && isApplyDimming() && this.areShortcutsVisible && (slideOffset == 0.0f || slideOffset == 1.0f) && behaviourState() == 6;
        qr31 qr31Var = bVar.G.l;
        if (qr31Var != null) {
            qr31Var.c().a.setVisibility(z ? 0 : 8);
        }
        super.onDialogSlide(slideOffset);
        float convertToOffsetFromAnchored = convertToOffsetFromAnchored(slideOffset);
        if (isApplyDimming()) {
            modalListener().onSlide(convertToOffsetFromAnchored);
        }
        if (behaviourState() == 1) {
            i3y i3yVar = this.addressSearchViewLazy;
            if (i3yVar.isInitialized()) {
                ((CompositeAddressSearchView) i3yVar.getValue()).closeKeyboard();
            }
        }
        b bVar2 = this.presenter;
        if (bVar2.D.a == ShortcutModalViewMvp.Mode.ADDRESS) {
            float f = convertToOffsetFromAnchored >= 0.0f ? 1.0f - convertToOffsetFromAnchored : 1.0f;
            if (f < 0.35f) {
                ((ShortcutModalViewMvp) bVar2.Dg()).changeShortcutsVisibility(false);
            } else if (f > 0.65f) {
                ((ShortcutModalViewMvp) bVar2.Dg()).changeShortcutsVisibility(true);
            }
        }
        if (convertToOffsetFromAnchored == 0.0f) {
            this.shortcutsView.scrollToTop();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onInsetsHandled(t1w insets) {
        updateHeights();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        modalListener().e1();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        modalListener().Ac();
        this.shortcutsView.pause();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        i3y i3yVar = this.addressSearchViewLazy;
        if (i3yVar.isInitialized()) {
            ((CompositeAddressSearchView) i3yVar.getValue()).onTouchOutside();
        }
        anchor();
    }

    @Override // defpackage.y700
    public void proceed() {
        initAddressSearchView();
        ((CompositeAddressSearchView) this.addressSearchViewLazy.getValue()).onRouteConfirmed();
    }

    @Override // defpackage.y700
    public void removeLocateButton() {
        RotatableFloatButton rotatableFloatButton = this.locateButton;
        if (rotatableFloatButton != null) {
            this.floatButtonHolderLayout.removeFloatButton(rotatableFloatButton);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setBackgroundDimColor(float newOffset) {
        if (isApplyDimming()) {
            if (getMapInteractionProcessingActive()) {
                newOffset = 0.0f;
            }
            super.setBackgroundDimColor(newOffset);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setDefaultHorizontalScaleX(float scale) {
    }

    @Override // defpackage.y700
    public void setProcessingState(ModalViewProcessing$ProcessingState processingState) {
        if (processingState == getProcessingState()) {
            return;
        }
        ModalViewProcessing$ProcessingState modalViewProcessing$ProcessingState = this.processingState;
        this.processingState = processingState;
        updateHeights();
        if (getMapInteractionProcessingActive()) {
            this.shortcutsView.cancelSingleLoading();
        } else if (this.minimized && behaviourFinalState() == 6) {
            super.collapse();
        }
        restoreAnchoredStateIfCollapsedAfterLeavingMinimizedProcessing(modalViewProcessing$ProcessingState, processingState);
    }

    @Override // defpackage.y700
    public void setSourceAddress(Address sourceAddress) {
        if (sourceAddress == null || !sourceAddress.X1()) {
            i3y i3yVar = this.addressSearchViewLazy;
            if (i3yVar.isInitialized()) {
                ((CompositeAddressSearchView) i3yVar.getValue()).onSourceAddressChanged(sourceAddress);
            }
        }
    }

    @Override // defpackage.y700
    public void showEditAddress(PointType activePoint) {
        b bVar = this.presenter;
        bVar.D.a = ShortcutModalViewMvp.Mode.ADDRESS;
        bVar.Ng();
        ((ShortcutModalViewMvp) bVar.Dg()).showEditAddress(activePoint);
    }

    public Bitmap takeScreenshot() {
        ViewGroup cardContentContainer = getCardContentContainer();
        Bitmap createBitmap = Bitmap.createBitmap(cardContentContainer.getWidth(), anchoredHeight(), Bitmap.Config.ARGB_8888);
        cardContentContainer.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    @Override // defpackage.y700
    public void tryRenderPanoramaButton(Address sourceAddress) {
        b bVar = this.presenter;
        FloatButtonHolderLayout floatButtonHolderLayout = this.floatButtonHolderLayout;
        FrameLayout frameLayout = (FrameLayout) getRootView().findViewById(peh0.main_screen_container);
        final d dVar = bVar.G;
        dVar.getClass();
        dVar.p = new vb90(floatButtonHolderLayout, sourceAddress, frameLayout);
        x0s0 x0s0Var = dVar.j;
        hbp0 b = dVar.b();
        b7p0 b7p0Var = new b7p0(25, dVar);
        sls slsVar = new sls() { // from class: com.yandex.go.taxi.main.shortcuts.ui.modalview.c
            @Override // defpackage.sls
            public final Object invoke() {
                d dVar2 = d.this;
                pzt0 pzt0Var = dVar2.m;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                vb90 vb90Var = dVar2.p;
                if (vb90Var == null) {
                    dVar2.j.c = false;
                } else {
                    dVar2.m = hbp0.e(dVar2.b(), null, null, new ShortcutPanoramaViewController$ensureMapMovingSubscription$2$1(dVar2, vb90Var, null), 3);
                }
                return zy11.a;
            }
        };
        pzt0 pzt0Var = x0s0Var.b;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            x0s0Var.b = hbp0.e(b, null, null, new ShortcutPanoramaMapMovingCoordinator$ensureSubscription$1(x0s0Var, b7p0Var, slsVar, null), 3);
        }
        pzt0 pzt0Var2 = dVar.m;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        dVar.m = hbp0.e(dVar.b(), null, null, new ShortcutPanoramaViewController$addPanoramaButton$1(dVar, floatButtonHolderLayout, sourceAddress, frameLayout, null), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public boolean useBelowCardDimming() {
        return true;
    }

    public void showEditAddress(Uri deeplink) {
        b bVar = this.presenter;
        bVar.D.a = ShortcutModalViewMvp.Mode.ADDRESS;
        bVar.Ng();
        ((ShortcutModalViewMvp) bVar.Dg()).showEditAddress(deeplink);
    }
}
