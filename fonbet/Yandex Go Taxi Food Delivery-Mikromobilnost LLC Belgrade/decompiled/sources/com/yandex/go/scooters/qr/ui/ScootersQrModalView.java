package com.yandex.go.scooters.qr.ui;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.scooters.analytics.ScootersQrCardAnalytics$CloseReason;
import com.yandex.go.scooters.analytics.ScootersQrCardAnalytics$QrState;
import com.yandex.go.scooters.qr.analytics.ScootersQrAnalytics$Button;
import com.yandex.go.scooters.qr.analytics.ScootersQrAnalytics$CloseReason;
import com.yandex.go.scooters.qr.analytics.ScootersQrAnalytics$State;
import com.yandex.go.scooters.qr.api.ScootersQrNumberInputSource;
import com.yandex.go.scooters.qr.api.ScootersQrNumberResultSource;
import com.yandex.go.scooters.qr.data.model.ScootersQrMode;
import com.yandex.go.scooters.qr.domain.ScootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$1;
import com.yandex.go.scooters.qr.domain.ScootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$2;
import com.yandex.go.scooters.qr.preview.ScootersPreviewView;
import com.yandex.go.scooters.qr.ui.ScootersQrModalView;
import defpackage.a60;
import defpackage.bk;
import defpackage.bpg0;
import defpackage.bpo0;
import defpackage.bys;
import defpackage.ce0;
import defpackage.cpo0;
import defpackage.d8p0;
import defpackage.dpo0;
import defpackage.e230;
import defpackage.e3o0;
import defpackage.e3x;
import defpackage.e8p0;
import defpackage.epo0;
import defpackage.gpo0;
import defpackage.hl7;
import defpackage.i3y;
import defpackage.iqo0;
import defpackage.j3x;
import defpackage.jl40;
import defpackage.jpo0;
import defpackage.jqo0;
import defpackage.kqo0;
import defpackage.kug0;
import defpackage.kyh0;
import defpackage.mj1;
import defpackage.mpo0;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.n5o0;
import defpackage.nao0;
import defpackage.npo0;
import defpackage.o7h0;
import defpackage.pw0;
import defpackage.pxm0;
import defpackage.qu;
import defpackage.r7p0;
import defpackage.rp31;
import defpackage.scc;
import defpackage.sls;
import defpackage.t1w;
import defpackage.tje;
import defpackage.too0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.v3h0;
import defpackage.vam0;
import defpackage.w130;
import defpackage.wxs;
import defpackage.x770;
import defpackage.xd2;
import defpackage.yjh0;
import defpackage.yln0;
import defpackage.yvf0;
import defpackage.zoo0;
import defpackage.zxs;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.internal.h;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u0092\u00012\u00020\u0001:\u0004\u0093\u0001\u0094\u0001Bk\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J/\u0010'\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001cH\u0014¢\u0006\u0004\b)\u0010\u001eJ\u000f\u0010*\u001a\u00020\u001cH\u0014¢\u0006\u0004\b*\u0010\u001eJ\u000f\u0010+\u001a\u00020\u001cH\u0014¢\u0006\u0004\b+\u0010\u001eJ\u000f\u0010,\u001a\u00020\u001cH\u0002¢\u0006\u0004\b,\u0010\u001eJ\u000f\u0010-\u001a\u00020\u001cH\u0002¢\u0006\u0004\b-\u0010\u001eJ\u000f\u0010.\u001a\u00020\u001cH\u0002¢\u0006\u0004\b.\u0010\u001eJ\u000f\u0010/\u001a\u00020\u001cH\u0002¢\u0006\u0004\b/\u0010\u001eJ\u000f\u00101\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u001cH\u0002¢\u0006\u0004\b3\u0010\u001eJ\u000f\u00104\u001a\u00020\u001cH\u0002¢\u0006\u0004\b4\u0010\u001eJ\u000f\u00105\u001a\u00020\u001cH\u0003¢\u0006\u0004\b5\u0010\u001eJ\u000f\u00106\u001a\u00020\u001cH\u0002¢\u0006\u0004\b6\u0010\u001eJ\u000f\u00108\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010:R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010;R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010<R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010=R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010>R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010?R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010@R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u0014\u0010R\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010PR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Y\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010MR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\\R\u0014\u0010^\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010MR\u0014\u0010_\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010PR\u0014\u0010`\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010PR\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010JR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010gR\u0016\u0010j\u001a\u00020i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010l\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR#\u0010w\u001a\n\u0012\u0006\b\u0000\u0012\u00020r0q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001c\u0010z\u001a\b\u0012\u0004\u0012\u00020y0x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010|\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010mR\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001d\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u0002070\u0082\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010{R\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008a\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010mR\u0019\u0010\u008b\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008c\u0001R\u0019\u0010\u008e\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008c\u0001R\u0017\u0010\u0091\u0001\u001a\u00020\"8UX\u0094\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0095\u0001"}, d2 = {"Lcom/yandex/go/scooters/qr/ui/ScootersQrModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Lyvf0;", "Lcom/yandex/go/scooters/qr/preview/ScootersPreviewView;", "scootersPreviewViewProvider", "Ltse;", "activityScope", "Ltoo0;", "scootersQrAnalytics", "Lzoo0;", "scootersQrMlVisionDetectorFactory", "Ln5o0;", "scootersOneShotHistogramTimeReporter", "Lcom/yandex/go/scooters/qr/ui/e;", "scootersQrPresenter", "Lpxm0;", "scootersAnalyticPath", "Lkqo0;", "scootersQrSearchMode", "Lcom/yandex/go/scooters/qr/api/ScootersQrNumberInputSource;", "scootersQrNumberInputSource", "<init>", "(Landroid/content/Context;Lyvf0;Ltse;Ltoo0;Lzoo0;Ln5o0;Lcom/yandex/go/scooters/qr/ui/e;Lpxm0;Lkqo0;Lcom/yandex/go/scooters/qr/api/ScootersQrNumberInputSource;)V", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "", "isArrowsPermanentlyHidden", "()Z", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onDetachedFromWindow", "onBackPressed", "onSlideOut", "setupListeners", "setupListenersForPermissionsViews", "setupListenersForCameraScanQrViews", "setupListenersForManualEnterViews", "Landroid/graphics/Rect;", "getManualEnterFieldRect", "()Landroid/graphics/Rect;", "applyManualOrQrViewState", "setTopHint", "refreshManualEnterField", "initCloseButton", "Lru/yandex/taxi/design/ListItemCheckComponent;", "createVendorSelectorItem", "()Lru/yandex/taxi/design/ListItemCheckComponent;", "Ltse;", "Ltoo0;", "Lzoo0;", "Ln5o0;", "Lcom/yandex/go/scooters/qr/ui/e;", "Lpxm0;", "Lkqo0;", "Lcom/yandex/go/scooters/qr/api/ScootersQrNumberInputSource;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "qrRoot", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yandex/go/scooters/qr/ui/ScootersQrCameraPreview;", "qrCameraPreview", "Lcom/yandex/go/scooters/qr/ui/ScootersQrCameraPreview;", "Lru/yandex/taxi/widget/RobotoTextView;", "topTextHint", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroidx/constraintlayout/widget/Group;", "photoButtonsGroup", "Landroidx/constraintlayout/widget/Group;", "Landroid/view/View;", "flashlightBtn", "Landroid/view/View;", "enterNumberManually", "qrStateBackButton", "Landroidx/constraintlayout/widget/Guideline;", "offerCardOffsetGuideline", "Landroidx/constraintlayout/widget/Guideline;", "Landroidx/constraintlayout/widget/Barrier;", "cleanAreaBottomBarrier", "Landroidx/constraintlayout/widget/Barrier;", "permissionsGroup", "Lru/yandex/taxi/design/ButtonComponent;", "exitBtn", "Lru/yandex/taxi/design/ButtonComponent;", "goToSettingsBtn", "manualEnterGroup", "backToCamera", "manualEnterDone", "Lru/yandex/taxi/widget/KeyboardAwareRobotoEditText;", "invisibleEditText", "Lru/yandex/taxi/widget/KeyboardAwareRobotoEditText;", "manualEnterField", "Landroid/text/style/ForegroundColorSpan;", "numberColorSpan", "Landroid/text/style/ForegroundColorSpan;", "placeholderNumberColorSpan", "", "selectedPrefix", "Ljava/lang/String;", "multiplePrefixes", "Z", "Landroidx/recyclerview/widget/RecyclerView;", "prefixSelectorRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lbys;", "", "prefixSelectorButtonsAdapter$delegate", "Li3y;", "getPrefixSelectorButtonsAdapter", "()Lbys;", "prefixSelectorButtonsAdapter", "", "Lmpo0;", "vendorsForManualSelection", "Ljava/util/List;", "selectedVendor", "Lmpo0;", "multipleVendors", "Landroidx/constraintlayout/helper/widget/Flow;", "vendorSelectorFlow", "Landroidx/constraintlayout/helper/widget/Flow;", "", "vendorSelectorItems", "Ljava/lang/Runnable;", "leaveGrabbedQrRectRunnable", "Ljava/lang/Runnable;", "Lru/yandex/taxi/camera/ml/c;", "mlCameraController", "Lru/yandex/taxi/camera/ml/c;", "isManualEnterSelected", "numberLength", CA20Status.STATUS_USER_I, "validNumberMinLength", "offerCardBottomOffset", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "Companion", "com/yandex/go/scooters/qr/ui/a", "gpo0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersQrModalView extends SlideableModalView {
    public static final gpo0 Companion = new gpo0();
    private static final int DEFAULT_RESOLUTION_HEIGHT = 2080;
    private static final int DEFAULT_RESOLUTION_WIDTH = 1080;
    private static final String NUMBER_FIELD_PLACEHOLDER = "0";
    private final tse activityScope;
    private final View backToCamera;
    private final Barrier cleanAreaBottomBarrier;
    private final View enterNumberManually;
    private final ButtonComponent exitBtn;
    private final View flashlightBtn;
    private final ButtonComponent goToSettingsBtn;
    private final KeyboardAwareRobotoEditText invisibleEditText;
    private boolean isManualEnterSelected;
    private final Runnable leaveGrabbedQrRectRunnable;
    private final View manualEnterDone;
    private final RobotoTextView manualEnterField;
    private final Group manualEnterGroup;
    private final ru.yandex.taxi.camera.ml.c mlCameraController;
    private boolean multiplePrefixes;
    private boolean multipleVendors;
    private final ForegroundColorSpan numberColorSpan;
    private int numberLength;
    private int offerCardBottomOffset;
    private final Guideline offerCardOffsetGuideline;
    private final Group permissionsGroup;
    private final Group photoButtonsGroup;
    private final ForegroundColorSpan placeholderNumberColorSpan;

    /* renamed from: prefixSelectorButtonsAdapter$delegate, reason: from kotlin metadata */
    private final i3y prefixSelectorButtonsAdapter;
    private final RecyclerView prefixSelectorRecyclerView;
    private final ScootersQrCameraPreview qrCameraPreview;
    private final ConstraintLayout qrRoot;
    private final View qrStateBackButton;
    private final pxm0 scootersAnalyticPath;
    private final n5o0 scootersOneShotHistogramTimeReporter;
    private final too0 scootersQrAnalytics;
    private final zoo0 scootersQrMlVisionDetectorFactory;
    private final ScootersQrNumberInputSource scootersQrNumberInputSource;
    private final e scootersQrPresenter;
    private final kqo0 scootersQrSearchMode;
    private String selectedPrefix;
    private mpo0 selectedVendor;
    private final RobotoTextView topTextHint;
    private int validNumberMinLength;
    private final Flow vendorSelectorFlow;
    private final List<ListItemCheckComponent> vendorSelectorItems;
    private List<mpo0> vendorsForManualSelection;

    public ScootersQrModalView(Context context, yvf0 yvf0Var, tse tseVar, too0 too0Var, zoo0 zoo0Var, n5o0 n5o0Var, e eVar, pxm0 pxm0Var, kqo0 kqo0Var, ScootersQrNumberInputSource scootersQrNumberInputSource) {
        super(context);
        this.activityScope = tseVar;
        this.scootersQrAnalytics = too0Var;
        this.scootersQrMlVisionDetectorFactory = zoo0Var;
        this.scootersOneShotHistogramTimeReporter = n5o0Var;
        this.scootersQrPresenter = eVar;
        this.scootersAnalyticPath = pxm0Var;
        this.scootersQrSearchMode = kqo0Var;
        this.scootersQrNumberInputSource = scootersQrNumberInputSource;
        int i = o7h0.qr_root;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.qrRoot = (ConstraintLayout) ((View) rp31.d(this, i));
        ScootersQrCameraPreview scootersQrCameraPreview = (ScootersQrCameraPreview) ((View) rp31.d(this, o7h0.camera_preview));
        this.qrCameraPreview = scootersQrCameraPreview;
        this.topTextHint = (RobotoTextView) ((View) rp31.d(this, o7h0.text_hint));
        this.photoButtonsGroup = (Group) ((View) rp31.d(this, o7h0.photo_buttons_group));
        this.flashlightBtn = (View) rp31.d(this, o7h0.flash_light_btn);
        this.enterNumberManually = (View) rp31.d(this, o7h0.enter_number_manually);
        this.qrStateBackButton = (View) rp31.d(this, o7h0.qr_state_back_button);
        this.offerCardOffsetGuideline = (Guideline) ((View) rp31.d(this, o7h0.offer_card_offset_guideline));
        this.cleanAreaBottomBarrier = (Barrier) ((View) rp31.d(this, o7h0.clean_area_bottom_barrier));
        this.permissionsGroup = (Group) ((View) rp31.d(this, o7h0.permissions_group));
        this.exitBtn = (ButtonComponent) ((View) rp31.d(this, o7h0.close));
        this.goToSettingsBtn = (ButtonComponent) ((View) rp31.d(this, o7h0.go_to_settings));
        this.manualEnterGroup = (Group) ((View) rp31.d(this, o7h0.manual_enter_group));
        this.backToCamera = (View) rp31.d(this, o7h0.back_to_camera);
        this.manualEnterDone = (View) rp31.d(this, o7h0.manual_enter_done);
        this.invisibleEditText = (KeyboardAwareRobotoEditText) ((View) rp31.d(this, o7h0.invisible_edit_text));
        RobotoTextView robotoTextView = (RobotoTextView) ((View) rp31.d(this, o7h0.manual_enter_field));
        int i2 = 1;
        robotoTextView.setTextTypeface(1);
        robotoTextView.setGravity(17);
        robotoTextView.setMaxLines(1);
        robotoTextView.enableAutoSize(tje.u(13, robotoTextView.getContext()), tje.r(kug0.scooters_manual_number_enter_max_text_size, robotoTextView.getContext()), 1);
        this.manualEnterField = robotoTextView;
        this.numberColorSpan = new ForegroundColorSpan(getContext().getColor(mqg0.component_white));
        this.placeholderNumberColorSpan = new ForegroundColorSpan(getContext().getColor(bpg0.scooter_number_color_hint));
        this.selectedPrefix = "";
        RecyclerView recyclerView = (RecyclerView) ((View) rp31.d(this, o7h0.prefix_selector_rv));
        this.prefixSelectorRecyclerView = recyclerView;
        this.prefixSelectorButtonsAdapter = kotlin.a.b(LazyThreadSafetyMode.NONE, new nao0(5, this, context));
        this.vendorsForManualSelection = EmptyList.a;
        this.vendorSelectorFlow = (Flow) ((View) rp31.d(this, o7h0.vendor_selector_flow));
        this.vendorSelectorItems = new ArrayList();
        this.leaveGrabbedQrRectRunnable = new dpo0(this, 2);
        this.mlCameraController = new ru.yandex.taxi.camera.ml.c(context, scootersQrCameraPreview, tseVar);
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        initCloseButton();
        if (kqo0Var instanceof jqo0) {
            ScootersPreviewView scootersPreviewView = (ScootersPreviewView) yvf0Var.get();
            scootersPreviewView.setVisibility(8);
            scootersPreviewView.setOnScooterSuggestListener(new cpo0(this, i2));
            addView(scootersPreviewView, -2, -2);
        }
        recyclerView.setItemAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(ScootersQrModalView scootersQrModalView, r7p0 r7p0Var) {
        scootersQrModalView.scootersQrPresenter.K.a.r(new vam0(27, r7p0Var, ScootersQrNumberResultSource.UNAVAILABLE_SCOOTER));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyManualOrQrViewState() {
        this.scootersQrPresenter.A.Fg(this.isManualEnterSelected ? ScootersQrMode.MANUAL : ScootersQrMode.QR_SCAN);
        this.scootersQrAnalytics.a(this.isManualEnterSelected ? ScootersQrAnalytics$State.MANUAL_ENTER : ScootersQrAnalytics$State.CAMERA, this.scootersAnalyticPath.b);
        this.qrCameraPreview.setActive(!this.isManualEnterSelected);
        int i = 8;
        this.manualEnterGroup.setVisibility(this.isManualEnterSelected ? 0 : 8);
        this.photoButtonsGroup.setVisibility(this.isManualEnterSelected ? 8 : 0);
        View view = this.enterNumberManually;
        if (this.scootersQrNumberInputSource != ScootersQrNumberInputSource.QR_ONLY && !this.isManualEnterSelected) {
            i = 0;
        }
        view.setVisibility(i);
        if (this.isManualEnterSelected) {
            this.manualEnterField.invalidateAutosize();
        }
        setTopHint();
        boolean z = this.isManualEnterSelected;
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.invisibleEditText;
        if (z) {
            keyboardAwareRobotoEditText.requestFocus();
        } else {
            keyboardAwareRobotoEditText.clearFocus();
            requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListItemCheckComponent createVendorSelectorItem() {
        ListItemCheckComponent listItemCheckComponent = new ListItemCheckComponent(getContext(), null, 0, 6, null);
        listItemCheckComponent.setId(View.generateViewId());
        listItemCheckComponent.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        int u = tje.u(40, listItemCheckComponent.getContext());
        listItemCheckComponent.setMinHeight(u);
        listItemCheckComponent.setTrailImageSize(u);
        listItemCheckComponent.setTitleTextSizePx(tje.r(mrg0.component_text_size_caption, listItemCheckComponent.getContext()));
        listItemCheckComponent.setTitleTextColor(listItemCheckComponent.getContext().getColor(mqg0.component_white));
        listItemCheckComponent.setRoundedBackground(listItemCheckComponent.getContext().getColor(mqg0.component_fog_dark), tje.w(100, listItemCheckComponent.getContext()));
        listItemCheckComponent.setMode(ListItemCheckComponent.Mode.SINGLE);
        listItemCheckComponent.setCheckToggleByClickEnabled(false);
        return listItemCheckComponent;
    }

    private final Rect getManualEnterFieldRect() {
        Rect rect = new Rect();
        this.manualEnterField.getDrawingRect(rect);
        ((ViewGroup) this.manualEnterField.getParent()).offsetDescendantRectToMyCoords(this.manualEnterField, rect);
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bys getPrefixSelectorButtonsAdapter() {
        return (bys) this.prefixSelectorButtonsAdapter.getValue();
    }

    private final void initCloseButton() {
        ru.yandex.taxi.design.utils.c.z(new bpo0(this, 2), this.qrStateBackButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initCloseButton$lambda$0(ScootersQrModalView scootersQrModalView) {
        scootersQrModalView.scootersQrAnalytics.b(ScootersQrAnalytics$Button.BACK);
        scootersQrModalView.scootersQrAnalytics.d = ScootersQrAnalytics$CloseReason.BUTTON;
        e eVar = scootersQrModalView.scootersQrPresenter;
        if (!eVar.Mg()) {
            eVar.K.a.r(new qu(9));
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(ScootersQrModalView scootersQrModalView, t1w t1wVar) {
        RobotoTextView robotoTextView = scootersQrModalView.topTextHint;
        robotoTextView.setPadding(robotoTextView.getPaddingLeft(), t1wVar.b, robotoTextView.getPaddingRight(), robotoTextView.getPaddingBottom());
        Guideline guideline = scootersQrModalView.offerCardOffsetGuideline;
        int i = scootersQrModalView.offerCardBottomOffset;
        int i2 = t1wVar.g;
        guideline.setGuidelineEnd(Math.max(i, i2));
        Guideline guideline2 = scootersQrModalView.offerCardOffsetGuideline;
        guideline2.setPadding(guideline2.getPaddingLeft(), guideline2.getPaddingTop(), guideline2.getPaddingRight(), i2);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void leaveGrabbedQrRectRunnable$lambda$0(ScootersQrModalView scootersQrModalView) {
        scootersQrModalView.qrCameraPreview.leaveQrRect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bys prefixSelectorButtonsAdapter_delegate$lambda$0(ScootersQrModalView scootersQrModalView, Context context) {
        RecyclerView recyclerView = scootersQrModalView.prefixSelectorRecyclerView;
        j3x j3xVar = new j3x();
        prefixSelectorButtonsAdapter_delegate$lambda$0$0(context, scootersQrModalView, j3xVar);
        LinearLayoutManager linearLayoutManager = j3xVar.b;
        if (linearLayoutManager == null) {
            linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 1, false);
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        recyclerView.setAdapter(bysVar);
        return bysVar;
    }

    private static final zy11 prefixSelectorButtonsAdapter_delegate$lambda$0$0(Context context, ScootersQrModalView scootersQrModalView, j3x j3xVar) {
        j3xVar.b = new LinearLayoutManager(context, 0, false);
        int i = yjh0.scooters_qr_prefix_selector_item;
        j3xVar.a.add(new zxs(String.class, i, new mj1(new e3o0(6, scootersQrModalView), new e3x(String.class, j3xVar, i), 5)));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 prefixSelectorButtonsAdapter_delegate$lambda$0$0$0(ScootersQrModalView scootersQrModalView, View view, String str) {
        RobotoTextView robotoTextView = (RobotoTextView) view;
        robotoTextView.setText(str);
        robotoTextView.setBackgroundResource(jl40.l(str, scootersQrModalView.selectedPrefix) ? v3h0.bg_qr_prefix_selector_item_selected : v3h0.bg_qr_prefix_selector);
        robotoTextView.setTextColor(robotoTextView.getContext().getColor(jl40.l(str, scootersQrModalView.selectedPrefix) ? mqg0.component_gray_600 : mqg0.component_white));
        ru.yandex.taxi.design.utils.c.z(new nao0(6, scootersQrModalView, str), robotoTextView);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 prefixSelectorButtonsAdapter_delegate$lambda$0$0$0$0$0(ScootersQrModalView scootersQrModalView, String str) {
        scootersQrModalView.selectedPrefix = str;
        scootersQrModalView.refreshManualEnterField();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshManualEnterField() {
        if (this.multiplePrefixes) {
            getPrefixSelectorButtonsAdapter().notifyDataSetChanged();
        }
        Object[] objArr = 0;
        if (this.multipleVendors) {
            int i = 0;
            for (Object obj : this.vendorsForManualSelection) {
                int i2 = i + 1;
                e8p0 e8p0Var = null;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                mpo0 mpo0Var = (mpo0) obj;
                ListItemCheckComponent listItemCheckComponent = this.vendorSelectorItems.get(i);
                listItemCheckComponent.setTitle(mpo0Var.b);
                mpo0 mpo0Var2 = this.selectedVendor;
                if (mpo0Var2 != null) {
                    e8p0Var = mpo0Var2.a;
                }
                listItemCheckComponent.setChecked(jl40.l(e8p0Var, mpo0Var.a));
                listItemCheckComponent.setDebounceClickListener(new epo0(objArr == true ? 1 : 0, this, mpo0Var));
                i = i2;
            }
        }
        String str = this.selectedPrefix;
        CharSequence text = this.invisibleEditText.getText();
        if (text == null) {
            text = "";
        }
        StringBuilder sb = new StringBuilder();
        int max = Math.max(0, this.numberLength - text.length());
        for (int i3 = 0; i3 < max; i3++) {
            sb.append("0");
        }
        String sb2 = sb.toString();
        RobotoTextView robotoTextView = this.manualEnterField;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + ((Object) text) + sb2);
        spannableStringBuilder.setSpan(this.numberColorSpan, 0, text.length() + str.length(), 33);
        spannableStringBuilder.setSpan(this.placeholderNumberColorSpan, text.length() + str.length(), sb2.length() + text.length() + str.length(), 33);
        robotoTextView.setText(spannableStringBuilder);
        this.manualEnterDone.setEnabled(text.length() >= this.validNumberMinLength);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshManualEnterField$lambda$0$0$0(ScootersQrModalView scootersQrModalView, mpo0 mpo0Var) {
        scootersQrModalView.selectedVendor = mpo0Var;
        scootersQrModalView.refreshManualEnterField();
    }

    private final void setTopHint() {
        CharSequence string;
        boolean z = this.isManualEnterSelected;
        RobotoTextView robotoTextView = this.topTextHint;
        if (z) {
            robotoTextView.setText(getContext().getString(kyh0.scooters_manual_enter_top_hint));
            return;
        }
        kqo0 kqo0Var = this.scootersQrSearchMode;
        if (kqo0Var instanceof jqo0) {
            iqo0 iqo0Var = ((jqo0) kqo0Var).a;
            CharSequence charSequence = iqo0Var.a;
            if (charSequence != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(charSequence).append('\n');
                spannableStringBuilder.append(iqo0Var.b);
                string = new SpannedString(spannableStringBuilder);
            } else {
                string = getContext().getString(kyh0.scooters_manual_enter_top_hint);
            }
        } else {
            string = getContext().getString(kyh0.scooters_manual_enter_top_hint);
        }
        robotoTextView.setText(string);
    }

    private final void setupListeners() {
        setupListenersForPermissionsViews();
        setupListenersForCameraScanQrViews();
        setupListenersForManualEnterViews();
    }

    private final void setupListenersForCameraScanQrViews() {
        ru.yandex.taxi.design.utils.c.z(new bpo0(this, 3), this.flashlightBtn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupListenersForCameraScanQrViews$lambda$0(ScootersQrModalView scootersQrModalView) {
        scootersQrModalView.scootersQrAnalytics.b(ScootersQrAnalytics$Button.TORCH);
        e eVar = scootersQrModalView.scootersQrPresenter;
        boolean z = eVar.M;
        eVar.M = !z;
        if (z) {
            ((npo0) eVar.Dg()).je();
        } else {
            ((npo0) eVar.Dg()).G0();
        }
        return zy11.a;
    }

    private final void setupListenersForManualEnterViews() {
        final bpo0 bpo0Var = new bpo0(this, 4);
        final int i = 0;
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: fpo0
            public final /* synthetic */ ScootersQrModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 zy11Var;
                zy11 zy11Var2;
                int i2 = i;
                bpo0 bpo0Var2 = bpo0Var;
                ScootersQrModalView scootersQrModalView = this.b;
                switch (i2) {
                    case 0:
                        zy11Var = ScootersQrModalView.setupListenersForManualEnterViews$lambda$1(scootersQrModalView, bpo0Var2);
                        return zy11Var;
                    default:
                        zy11Var2 = ScootersQrModalView.setupListenersForManualEnterViews$lambda$2(scootersQrModalView, bpo0Var2);
                        return zy11Var2;
                }
            }
        }, this.enterNumberManually);
        final int i2 = 1;
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: fpo0
            public final /* synthetic */ ScootersQrModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 zy11Var;
                zy11 zy11Var2;
                int i22 = i2;
                bpo0 bpo0Var2 = bpo0Var;
                ScootersQrModalView scootersQrModalView = this.b;
                switch (i22) {
                    case 0:
                        zy11Var = ScootersQrModalView.setupListenersForManualEnterViews$lambda$1(scootersQrModalView, bpo0Var2);
                        return zy11Var;
                    default:
                        zy11Var2 = ScootersQrModalView.setupListenersForManualEnterViews$lambda$2(scootersQrModalView, bpo0Var2);
                        return zy11Var2;
                }
            }
        }, this.backToCamera);
        this.invisibleEditText.setOnCloseListener(new pw0(8, this));
        this.invisibleEditText.setOnFocusChangeListener(new bk(26, this));
        ru.yandex.taxi.design.utils.c.z(new bpo0(this, 0), this.manualEnterField);
        ru.yandex.taxi.design.utils.c.z(new bpo0(this, 1), this.manualEnterDone);
        this.invisibleEditText.addTextChangedListener(new TextWatcher() { // from class: com.yandex.go.scooters.qr.ui.ScootersQrModalView$setupListenersForManualEnterViews$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                ScootersQrModalView.this.refreshManualEnterField();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupListenersForManualEnterViews$lambda$0(ScootersQrModalView scootersQrModalView) {
        scootersQrModalView.isManualEnterSelected = !scootersQrModalView.isManualEnterSelected;
        scootersQrModalView.applyManualOrQrViewState();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupListenersForManualEnterViews$lambda$1(ScootersQrModalView scootersQrModalView, sls slsVar) {
        scootersQrModalView.scootersQrAnalytics.b(ScootersQrAnalytics$Button.MANUAL_ENTER);
        slsVar.invoke();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupListenersForManualEnterViews$lambda$2(ScootersQrModalView scootersQrModalView, sls slsVar) {
        scootersQrModalView.scootersQrAnalytics.b(ScootersQrAnalytics$Button.BACK_TO_CAMERA);
        slsVar.invoke();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListenersForManualEnterViews$lambda$3(ScootersQrModalView scootersQrModalView) {
        scootersQrModalView.invisibleEditText.clearFocus();
        scootersQrModalView.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListenersForManualEnterViews$lambda$4(ScootersQrModalView scootersQrModalView, View view, boolean z) {
        if (z) {
            KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = scootersQrModalView.invisibleEditText;
            if (keyboardAwareRobotoEditText == null) {
                return;
            }
            keyboardAwareRobotoEditText.post(new xd2(keyboardAwareRobotoEditText, 1));
            return;
        }
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText2 = scootersQrModalView.invisibleEditText;
        if (keyboardAwareRobotoEditText2 == null) {
            return;
        }
        keyboardAwareRobotoEditText2.post(new ce0(keyboardAwareRobotoEditText2, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupListenersForManualEnterViews$lambda$5(ScootersQrModalView scootersQrModalView) {
        scootersQrModalView.invisibleEditText.requestFocus();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupListenersForManualEnterViews$lambda$6(ScootersQrModalView scootersQrModalView) {
        scootersQrModalView.scootersQrAnalytics.b(ScootersQrAnalytics$Button.MANUAL_ENTER_DONE);
        String str = scootersQrModalView.selectedPrefix + ((Object) scootersQrModalView.invisibleEditText.getText());
        if (scootersQrModalView.isManualEnterSelected) {
            e eVar = scootersQrModalView.scootersQrPresenter;
            mpo0 mpo0Var = scootersQrModalView.selectedVendor;
            e8p0 e8p0Var = mpo0Var != null ? mpo0Var.a : d8p0.a;
            Rect manualEnterFieldRect = scootersQrModalView.getManualEnterFieldRect();
            eVar.getClass();
            String upperCase = str.toUpperCase(Locale.US);
            yln0 yln0Var = eVar.L;
            r7p0 r7p0Var = new r7p0(e8p0Var, upperCase);
            if (((r0) yln0Var.c.b).getValue() == ScootersQrMode.MANUAL) {
                yln0Var.g.g(r7p0Var);
                yln0Var.e.a(manualEnterFieldRect);
            }
        }
        scootersQrModalView.invisibleEditText.setText((CharSequence) null);
        return zy11.a;
    }

    private final void setupListenersForPermissionsViews() {
        this.goToSettingsBtn.setDebounceClickListener(new dpo0(this, 0));
        this.exitBtn.setDebounceClickListener(new dpo0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListenersForPermissionsViews$lambda$0(ScootersQrModalView scootersQrModalView) {
        scootersQrModalView.scootersQrAnalytics.b(ScootersQrAnalytics$Button.GO_TO_SETTINGS);
        ((a60) scootersQrModalView.scootersQrPresenter.y).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListenersForPermissionsViews$lambda$1(ScootersQrModalView scootersQrModalView) {
        scootersQrModalView.scootersQrAnalytics.b(ScootersQrAnalytics$Button.EXIT);
        scootersQrModalView.scootersQrAnalytics.d = ScootersQrAnalytics$CloseReason.BUTTON;
        e eVar = scootersQrModalView.scootersQrPresenter;
        if (eVar.Mg()) {
            return;
        }
        eVar.K.a.r(new qu(9));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return yjh0.scooters_qr_view;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new cpo0(this, 0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getRouteSummaryIsVisible() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        setupListeners();
        e eVar = this.scootersQrPresenter;
        a aVar = new a(this);
        eVar.Bg(aVar);
        eVar.z.b(eVar, new d(eVar));
        jpo0 jpo0Var = eVar.A;
        jpo0Var.Fg(ScootersQrMode.QR_SCAN);
        tje.N(eVar.Jg(), null, null, new ScootersQrPresenter$attachView$$inlined$collectLatestIn$1(new c(kotlinx.coroutines.flow.e.d((r0) jpo0Var.b)), null, aVar), 3);
        tje.N(eVar.Jg(), null, null, new ScootersQrPresenter$attachView$$inlined$collectLatestIn$2(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.d((r0) eVar.G.b)), null, aVar), 3);
        yln0 yln0Var = eVar.L;
        h K = kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{new com.yandex.go.scooters.qr.domain.b(kotlinx.coroutines.flow.e.c(yln0Var.e.a)), kotlinx.coroutines.flow.e.B(yln0Var.g, new ScootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$1(null, yln0Var)), kotlinx.coroutines.flow.e.B(kotlinx.coroutines.flow.e.o(com.yandex.go.coroutines.b.j(yln0Var.f, 500L)), new ScootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$2(null, yln0Var))}, 3));
        yln0Var.a.getClass();
        tje.N(eVar.Jg(), null, null, new ScootersQrPresenter$listenQrScanActions$$inlined$collectIn$1(kotlinx.coroutines.flow.e.F(K, uyj.a), null, eVar), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.scootersQrAnalytics.d = ScootersQrAnalytics$CloseReason.ANDROID_BACK_BUTTON;
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.leaveGrabbedQrRectRunnable);
        this.scootersQrPresenter.Cg();
        too0 too0Var = this.scootersQrAnalytics;
        ScootersQrAnalytics$CloseReason scootersQrAnalytics$CloseReason = this.scootersQrSearchMode instanceof jqo0 ? ScootersQrAnalytics$CloseReason.ORDER_CREATED : ScootersQrAnalytics$CloseReason.BUTTON;
        if (too0Var.d == null) {
            too0Var.d = scootersQrAnalytics$CloseReason;
        }
        x770 x770Var = too0Var.a;
        ScootersQrAnalytics$CloseReason scootersQrAnalytics$CloseReason2 = too0Var.d;
        ScootersQrCardAnalytics$CloseReason evgenValue = scootersQrAnalytics$CloseReason2 != null ? scootersQrAnalytics$CloseReason2.getEvgenValue() : null;
        ScootersQrAnalytics$State scootersQrAnalytics$State = too0Var.b;
        ScootersQrCardAnalytics$QrState evgenValue2 = scootersQrAnalytics$State != null ? scootersQrAnalytics$State.getEvgenValue() : null;
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        if (evgenValue != null) {
            hashMap.put("close_reason", evgenValue.getEventValue());
        }
        if (evgenValue2 != null) {
            hashMap.put(ClidProvider.STATE, evgenValue2.getEventValue());
        }
        x770Var.a.a("ScootersQrCard.Closed", hashMap, 1, new HashMap());
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        OneShotPreDrawListener.add(getContent(), new hl7(this, w, 5));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        this.scootersQrAnalytics.d = ScootersQrAnalytics$CloseReason.ROLL_OFF;
        super.onSlideOut();
    }
}
