package com.ybsdk.feature.qr.internal.screens.reader.presentation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.qr.api.QrCameraType;
import com.ybsdk.feature.qr.api.QrReaderContentInfo;
import com.ybsdk.feature.qr.api.QrReaderContentLogo;
import com.ybsdk.feature.qr.api.QrReaderLogoImage;
import com.ybsdk.feature.qr.api.QrReaderScreenType;
import com.ybsdk.feature.qr.api.QrScannerPreview;
import com.ybsdk.feature.qr.api.QrScannerPreviewDependencies;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.view.QrReaderErrorView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.g;
import defpackage.a50;
import defpackage.acg0;
import defpackage.agc0;
import defpackage.akb1;
import defpackage.bcg0;
import defpackage.cbg0;
import defpackage.ccg0;
import defpackage.ccv;
import defpackage.cua1;
import defpackage.dcg0;
import defpackage.dcs;
import defpackage.dcv;
import defpackage.dzh0;
import defpackage.ecg0;
import defpackage.eja1;
import defpackage.exa1;
import defpackage.fcg0;
import defpackage.fob1;
import defpackage.gwg0;
import defpackage.hdg0;
import defpackage.i3y;
import defpackage.idg0;
import defpackage.ifg0;
import defpackage.j6g0;
import defpackage.jdg0;
import defpackage.jl40;
import defpackage.jla1;
import defpackage.jqr;
import defpackage.jzz;
import defpackage.kp50;
import defpackage.l1i0;
import defpackage.l8x;
import defpackage.lfx;
import defpackage.lrp0;
import defpackage.m50;
import defpackage.mcg0;
import defpackage.me1;
import defpackage.mob1;
import defpackage.mqp0;
import defpackage.n;
import defpackage.n751;
import defpackage.ntz0;
import defpackage.ny61;
import defpackage.ocg0;
import defpackage.orp0;
import defpackage.oxe0;
import defpackage.p7b1;
import defpackage.pbv;
import defpackage.pc70;
import defpackage.pcg0;
import defpackage.pg6;
import defpackage.ptz0;
import defpackage.qas0;
import defpackage.qcg0;
import defpackage.qg6;
import defpackage.r461;
import defpackage.rbv;
import defpackage.rcg0;
import defpackage.rev;
import defpackage.rfg0;
import defpackage.rje;
import defpackage.rtz0;
import defpackage.scc;
import defpackage.scg0;
import defpackage.sls;
import defpackage.stz0;
import defpackage.tcg0;
import defpackage.tdr;
import defpackage.tja1;
import defpackage.tpr;
import defpackage.trp0;
import defpackage.tya0;
import defpackage.ubg0;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.v41;
import defpackage.v4b1;
import defpackage.v50;
import defpackage.vcg0;
import defpackage.vfv;
import defpackage.vh91;
import defpackage.vo31;
import defpackage.vvg0;
import defpackage.w511;
import defpackage.wcg0;
import defpackage.wo31;
import defpackage.x4c;
import defpackage.xbg0;
import defpackage.xlm0;
import defpackage.xty0;
import defpackage.y4a0;
import defpackage.y5h0;
import defpackage.y6g0;
import defpackage.y8f;
import defpackage.ybg0;
import defpackage.ylg0;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.zbg0;
import defpackage.zr7;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.e;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 ®\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0002¯\u0001BQ\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0014¢\u0006\u0004\b#\u0010$J!\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0014¢\u0006\u0004\b)\u0010*J!\u0010/\u001a\u00020 2\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020 H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020 2\u0006\u00103\u001a\u00020\u0003H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020 H\u0016¢\u0006\u0004\b6\u00102J\u000f\u00107\u001a\u00020 H\u0016¢\u0006\u0004\b7\u00102J\u000f\u00108\u001a\u00020 H\u0016¢\u0006\u0004\b8\u00102J\u000f\u00109\u001a\u00020 H\u0016¢\u0006\u0004\b9\u00102J\u0017\u0010<\u001a\u00020 2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020>2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJE\u0010J\u001a\u00020 2\b\u0010C\u001a\u0004\u0018\u00010B2\b\u0010D\u001a\u0004\u0018\u00010B2\b\u0010F\u001a\u0004\u0018\u00010E2\b\u0010G\u001a\u0004\u0018\u00010B2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020 0HH\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020 H\u0002¢\u0006\u0004\bL\u00102J\u000f\u0010M\u001a\u00020 H\u0002¢\u0006\u0004\bM\u00102J\u001d\u0010Q\u001a\u00020 2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020O0NH\u0002¢\u0006\u0004\bQ\u0010RJ\u001f\u0010V\u001a\u00020\u001b2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020SH\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020 H\u0002¢\u0006\u0004\bX\u00102J\u000f\u0010Y\u001a\u00020 H\u0002¢\u0006\u0004\bY\u00102J\u0013\u0010[\u001a\u00020 *\u00020ZH\u0002¢\u0006\u0004\b[\u0010\\J\u0013\u0010]\u001a\u00020 *\u00020ZH\u0002¢\u0006\u0004\b]\u0010\\J\u0013\u0010^\u001a\u00020 *\u00020ZH\u0002¢\u0006\u0004\b^\u0010\\J\u0019\u0010`\u001a\u0004\u0018\u00010 2\u0006\u0010_\u001a\u00020\u0003H\u0002¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020 H\u0002¢\u0006\u0004\bb\u00102J\u0017\u0010f\u001a\u00020e2\u0006\u0010d\u001a\u00020cH\u0002¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020 2\u0006\u0010h\u001a\u00020+H\u0002¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020 H\u0002¢\u0006\u0004\bk\u00102J\u000f\u0010l\u001a\u00020 H\u0002¢\u0006\u0004\bl\u00102J\u000f\u0010m\u001a\u00020 H\u0002¢\u0006\u0004\bm\u00102J\u000f\u0010n\u001a\u00020 H\u0002¢\u0006\u0004\bn\u00102J\u001f\u0010r\u001a\n q*\u0004\u0018\u00010p0p2\u0006\u0010o\u001a\u00020eH\u0002¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020 H\u0002¢\u0006\u0004\bt\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010uR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010vR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010wR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010xR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010yR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010zR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010{R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR6\u0010\u0083\u0001\u001a!\u0012\u001c\u0012\u001a\u0012\u0005\u0012\u00030\u0082\u0001 q*\f\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010\u0081\u00010\u0081\u00010\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R!\u0010\u008a\u0001\u001a\u00030\u0085\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R$\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00018B@\u0002X\u0082\u000e¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R*\u0010\u0099\u0001\u001a\f q*\u0005\u0018\u00010\u0095\u00010\u0095\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0087\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001c\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0094\u0001R\u001b\u0010\u009b\u0001\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009c\u0001R\u0016\u0010\u009e\u0001\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010\u001dR\u0016\u0010\u009f\u0001\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010\u001dR\u0018\u0010£\u0001\u001a\u00030 \u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001a\u0010§\u0001\u001a\u0005\u0018\u00010¤\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0016\u0010©\u0001\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010\u001dR\u0018\u0010\u00ad\u0001\u001a\u00030ª\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001¨\u0006°\u0001"}, d2 = {"Lcom/ybsdk/feature/qr/internal/screens/reader/presentation/QrReaderFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lr461;", "Lwcg0;", "Lcom/ybsdk/feature/qr/internal/screens/reader/presentation/b;", "Ltdr;", "Lpg6;", "Locg0;", "viewModelFactory", "Lubg0;", "preferencesProvider", "Lj6g0;", "boundaryProvider", "Ljdg0;", "remoteConfig", "Lifg0;", "qrScannerPreviewFactory", "Lcom/ybsdk/core/analytics/generated/AppAnalyticsReporter;", "analyticsReporter", "Lrfg0;", "qrSourceProvider", "Lcom/ybsdk/feature/qr/api/QrScannerPreviewDependencies;", "qrScannerPreviewDependencies", "Lqg6;", "bottomSheetShownAware", "<init>", "(Locg0;Lubg0;Lj6g0;Ljdg0;Lifg0;Lcom/ybsdk/core/analytics/generated/AppAnalyticsReporter;Lrfg0;Lcom/ybsdk/feature/qr/api/QrScannerPreviewDependencies;Lqg6;)V", "", "fitsSystemWindow", "()Z", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "createViewModel", "()Lcom/ybsdk/feature/qr/internal/screens/reader/presentation/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lr461;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "()V", "viewState", "render", "(Lwcg0;)V", "onResume", "onDestroyView", "onBottomSheetShown", "onBottomSheetClosed", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "Lcom/ybsdk/core/utils/text/Text;", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lrbv;", "topImage", "primaryButtonText", "Lkotlin/Function0;", "onPrimaryButtonClick", "showBottomSheet", "(Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lrbv;Lcom/ybsdk/core/utils/text/Text;Lsls;)V", "startQrRecognizeFlow", "tryReadQrFromClipboardForTestsOnce", "", "Lxlm0;", "results", "handleRecognizeResults", "(Ljava/util/List;)V", "Landroid/graphics/Rect;", "resultRect", "targetRect", "checkResultIntersectsTarget", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z", "stopRecognizeFlow", "renderToolbar", "Lcom/ybsdk/widgets/common/ToolbarView;", "renderToolbarOldScreen", "(Lcom/ybsdk/widgets/common/ToolbarView;)V", "renderToolbarWithTsarButton", "renderToolbarWithoutTsarButton", ClidProvider.STATE, "renderFlashLight", "(Lwcg0;)Lzy11;", "renderInfoButton", "", "frameMinSize", "", "getAdjustedFrameMaxSizeIfNeeded", "(I)F", "rootView", "subscribeBoundary", "(Landroid/view/View;)V", "initRecognitionFromFileForOldScanner", "handleTitleContainerOldScanner", "showLoadingState", "hideLoadingState", "target", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "createProgressAnimator", "(F)Landroid/animation/ValueAnimator;", "renderDescription", "Locg0;", "Lj6g0;", "Ljdg0;", "Lifg0;", "Lcom/ybsdk/core/analytics/generated/AppAnalyticsReporter;", "Lrfg0;", "Lcom/ybsdk/feature/qr/api/QrScannerPreviewDependencies;", "Lqg6;", "Ltya0;", "permissionManager", "Ltya0;", "Lm50;", "", "", "filePickerLauncher", "Lm50;", "Lcom/ybsdk/feature/qr/internal/screens/reader/presentation/QrReaderScreenParams;", "screenParams$delegate", "Li3y;", "getScreenParams", "()Lcom/ybsdk/feature/qr/internal/screens/reader/presentation/QrReaderScreenParams;", "screenParams", "currentState", "Lwcg0;", "Lcom/ybsdk/feature/qr/api/QrScannerPreview;", "qrView", "Lcom/ybsdk/feature/qr/api/QrScannerPreview;", "getQrView", "()Lcom/ybsdk/feature/qr/api/QrScannerPreview;", "Ll8x;", "boundaryJob", "Ll8x;", "Landroid/view/animation/Interpolator;", "defaultInterpolator$delegate", "getDefaultInterpolator", "()Landroid/view/animation/Interpolator;", "defaultInterpolator", "qrRecognizeFlowJob", "progressVisibleAnimation", "Landroid/animation/ValueAnimator;", "progressHiddenAnimation", "isOldScreen", "isTsarButtonEnabled", "Lfcg0;", "getScanningConfig", "()Lfcg0;", "scanningConfig", "Lcom/ybsdk/feature/qr/api/QrReaderContentInfo;", "getInfoIcon", "()Lcom/ybsdk/feature/qr/api/QrReaderContentInfo;", "infoIcon", "getShowInfoIconInOldScanner", "showInfoIconInOldScanner", "Landroidx/lifecycle/o;", "getViewScope", "()Landroidx/lifecycle/o;", "viewScope", "Companion", "ccg0", "feature-qr_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QrReaderFragment extends BaseMvvmFragment<r461, wcg0, b> implements tdr, pg6 {

    @Deprecated
    public static final float ALPHA_HIDDEN = 0.0f;

    @Deprecated
    public static final float ALPHA_VISIBLE = 1.0f;
    private static final ccg0 Companion = new ccg0();

    @Deprecated
    public static final float ERROR_VIEW_MIN_POSITION_PERCENT = 0.16f;

    @Deprecated
    public static final float FRAME_OFFSET_MULTIPLIER = 0.13f;

    @Deprecated
    public static final int ONE_HUNDRED_PERCENT = 100;
    private final AppAnalyticsReporter analyticsReporter;
    private final qg6 bottomSheetShownAware;
    private l8x boundaryJob;
    private final j6g0 boundaryProvider;
    private wcg0 currentState;

    /* renamed from: defaultInterpolator$delegate, reason: from kotlin metadata */
    private final i3y defaultInterpolator;
    private final m50 filePickerLauncher;
    private final tya0 permissionManager;
    private ValueAnimator progressHiddenAnimation;
    private ValueAnimator progressVisibleAnimation;
    private l8x qrRecognizeFlowJob;
    private final QrScannerPreviewDependencies qrScannerPreviewDependencies;
    private final ifg0 qrScannerPreviewFactory;
    private final rfg0 qrSourceProvider;
    private QrScannerPreview qrView;
    private final jdg0 remoteConfig;

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private final ocg0 viewModelFactory;

    public QrReaderFragment(ocg0 ocg0Var, ubg0 ubg0Var, j6g0 j6g0Var, jdg0 jdg0Var, ifg0 ifg0Var, AppAnalyticsReporter appAnalyticsReporter, rfg0 rfg0Var, QrScannerPreviewDependencies qrScannerPreviewDependencies, qg6 qg6Var) {
        super(Boolean.FALSE, null, null, null, b.class, 14, null);
        this.viewModelFactory = ocg0Var;
        this.boundaryProvider = j6g0Var;
        this.remoteConfig = jdg0Var;
        this.qrScannerPreviewFactory = ifg0Var;
        this.analyticsReporter = appAnalyticsReporter;
        this.qrSourceProvider = rfg0Var;
        this.qrScannerPreviewDependencies = qrScannerPreviewDependencies;
        this.bottomSheetShownAware = qg6Var;
        this.permissionManager = vh91.c(this, zr7.a(), ((me1) ubg0Var).c());
        this.filePickerLauncher = registerForActivityResult(new a50(), new v50(7, this));
        this.screenParams = kotlin.a.a(new acg0(this, 1));
        this.defaultInterpolator = kotlin.a.a(new acg0(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ r461 access$getBinding(QrReaderFragment qrReaderFragment) {
        return (r461) qrReaderFragment.getBinding();
    }

    private final boolean checkResultIntersectsTarget(Rect resultRect, Rect targetRect) {
        Rect rect = new Rect();
        if (rect.setIntersect(targetRect, resultRect)) {
            return (100.0f * ((float) (rect.height() * rect.width()))) / Math.min((float) (resultRect.height() * resultRect.width()), (float) (targetRect.height() * targetRect.width())) >= ((float) getScanningConfig().a());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 consumeSideEffect$lambda$21(QrReaderFragment qrReaderFragment, tcg0 tcg0Var) {
        b viewModel = qrReaderFragment.getViewModel();
        y6g0 a = ((scg0) tcg0Var).a();
        viewModel.i0(a != null ? a.a() : null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 consumeSideEffect$lambda$23$lambda$22(QrReaderFragment qrReaderFragment) {
        qrReaderFragment.getViewModel().l0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ValueAnimator createProgressAnimator(float target) {
        final r461 r461Var = (r461) getBinding();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(r461Var.d.getAlpha(), target);
        ofFloat.setInterpolator(getDefaultInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment$createProgressAnimator$lambda$50$lambda$49$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                r461.this.d.setVisibility(0);
                r461.this.b.setVisibility(0);
            }
        });
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interpolator defaultInterpolator_delegate$lambda$4(QrReaderFragment qrReaderFragment) {
        return AnimationUtils.loadInterpolator(qrReaderFragment.getContext(), ylg0.ybsdk_default_interpolator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void filePickerLauncher$lambda$1(QrReaderFragment qrReaderFragment, Uri uri) {
        if (uri != null) {
            qrReaderFragment.getViewModel().j0(uri);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float getAdjustedFrameMaxSizeIfNeeded(int frameMinSize) {
        float width = ((r461) getBinding()).b.getWidth();
        if (width != 0.0f) {
            return width;
        }
        x4c.g("Unexpected zero barcodeFrame width in QrReaderFragment taking frameMinSize", null, null, Collections.singletonList(orp0.f), 6);
        return frameMinSize;
    }

    private final Interpolator getDefaultInterpolator() {
        return (Interpolator) this.defaultInterpolator.getValue();
    }

    private final QrReaderContentInfo getInfoIcon() {
        QrReaderContentInfo o = ((y4a0) this.remoteConfig).o();
        QrScannerPreview qrView = getQrView();
        QrCameraType cameraType = qrView != null ? qrView.cameraType() : null;
        int i = cameraType == null ? -1 : dcg0.a[cameraType.ordinal()];
        if (i == -1 || i == 1 || i == 2) {
            if (((y4a0) this.remoteConfig).g()) {
                return null;
            }
        } else if (i != 3 && i != 4) {
            w511.b();
            return null;
        }
        return o;
    }

    private final QrScannerPreview getQrView() {
        if (this.qrView == null) {
            trp0 trp0Var = trp0.a;
            trp0.e(new mqp0("Tried to access qrView but it was null", lrp0.w));
        }
        return this.qrView;
    }

    private final fcg0 getScanningConfig() {
        return ((mcg0) getViewModel().X()).b();
    }

    private final QrReaderScreenParams getScreenParams() {
        return (QrReaderScreenParams) this.screenParams.getValue();
    }

    private final boolean getShowInfoIconInOldScanner() {
        return ((y4a0) this.remoteConfig).r() && getInfoIcon() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$7$lambda$5(QrReaderFragment qrReaderFragment) {
        cua1.d(qrReaderFragment);
        return zy11.a;
    }

    private final o getViewScope() {
        return eja1.s(getViewLifecycleOwner());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleRecognizeResults(List<xlm0> results) {
        Object obj;
        Rect i = com.ybsdk.core.utils.ext.view.b.i(((r461) getBinding()).b);
        Iterator<T> it = results.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            xlm0 xlm0Var = (xlm0) obj;
            xlm0Var.getClass();
            Rect a = xlm0Var.a();
            if (a != null ? checkResultIntersectsTarget(a, i) : false) {
                break;
            }
        }
        xlm0 xlm0Var2 = (xlm0) obj;
        if (xlm0Var2 != null) {
            getViewModel().q0(xlm0Var2.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleTitleContainerOldScanner() {
        r461 r461Var = (r461) getBinding();
        if (isOldScreen() && getShowInfoIconInOldScanner()) {
            r461Var.m.setTextAppearance(l1i0.Widget_YB_Text_Headline2);
            r461Var.m.setTextColor(rje.a(requireContext(), ung0.ybColor_textIcon_primaryStaticInverted));
            r461Var.n.setTranslationY(rje.d(gwg0.ybsdk_toolbar_title_offset, requireContext()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideLoadingState() {
        r461 r461Var = (r461) getBinding();
        ValueAnimator valueAnimator = this.progressVisibleAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.progressVisibleAnimation = null;
        ValueAnimator valueAnimator2 = this.progressHiddenAnimation;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            ValueAnimator createProgressAnimator = createProgressAnimator(0.0f);
            createProgressAnimator.setDuration((long) (r461Var.d.getAlpha() * 300.0f));
            createProgressAnimator.addUpdateListener(new zbg0(r461Var, 0));
            createProgressAnimator.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment$hideLoadingState$lambda$47$lambda$46$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    QrReaderFragment.this.progressHiddenAnimation = null;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
            createProgressAnimator.start();
            this.progressHiddenAnimation = createProgressAnimator;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideLoadingState$lambda$47$lambda$46$lambda$44(r461 r461Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        r461Var.d.setAlpha(floatValue);
        r461Var.b.setAlpha(1.0f - floatValue);
        if (floatValue == 0.0f) {
            r461Var.d.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRecognitionFromFileForOldScanner() {
        r461 r461Var = (r461) getBinding();
        if (getShowInfoIconInOldScanner()) {
            r461Var.o.render(new bcg0(this, 0));
            handleTitleContainerOldScanner();
            FrameLayout frameLayout = r461Var.f;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.endToEnd = 0;
            layoutParams2.startToStart = 0;
            frameLayout.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 initRecognitionFromFileForOldScanner$lambda$38$lambda$36(QrReaderFragment qrReaderFragment, stz0 stz0Var) {
        QrReaderLogoImage image;
        QrReaderContentInfo infoIcon = qrReaderFragment.getInfoIcon();
        return stz0.a(stz0Var, null, null, null, (infoIcon == null || (image = infoIcon.getImage()) == null) ? null : image.toImageModel(), null, null, false, false, null, null, 0, 32759);
    }

    private final boolean isOldScreen() {
        return jl40.l(getScreenParams().getScreenType(), QrReaderScreenType.Old.INSTANCE);
    }

    private final boolean isTsarButtonEnabled() {
        QrReaderScreenType screenType = getScreenParams().getScreenType();
        QrReaderScreenType.New r2 = screenType instanceof QrReaderScreenType.New ? (QrReaderScreenType.New) screenType : null;
        return r2 != null && r2.isTsarButtonEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$20(QrReaderFragment qrReaderFragment) {
        qrReaderFragment.setStatusBarColorModel(new z1x0(new ColorModel.Raw(0), mob1.c(true, true)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rbv onViewCreated$lambda$18$lambda$12$lambda$11(String str) {
        return new pbv(str, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$18$lambda$16$lambda$13(QrReaderFragment qrReaderFragment) {
        qrReaderFragment.getViewModel().g0(qrReaderFragment.getInfoIcon());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$18$lambda$16$lambda$14(QrReaderFragment qrReaderFragment) {
        qrReaderFragment.getViewModel().f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$18$lambda$16$lambda$15(QrReaderFragment qrReaderFragment) {
        qrReaderFragment.getViewModel().g0(qrReaderFragment.getInfoIcon());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$18$lambda$8(QrReaderFragment qrReaderFragment) {
        qrReaderFragment.getViewModel().u0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$18$lambda$9(QrReaderFragment qrReaderFragment) {
        qrReaderFragment.getViewModel().g0(qrReaderFragment.getInfoIcon());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onViewCreated$subscribeBoundary(QrReaderFragment qrReaderFragment, View view, Continuation continuation) {
        qrReaderFragment.subscribeBoundary(view);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderDescription() {
        Text description = getScreenParams().getDescription();
        ((r461) getBinding()).l.setVisibility((description == null || !((com.ybsdk.core.permissions.a) this.permissionManager).a()) ? 8 : 0);
        if (description != null) {
            xty0.d(((r461) getBinding()).l, description);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zy11 renderFlashLight(wcg0 state) {
        zy11 zy11Var = zy11.a;
        r461 r461Var = (r461) getBinding();
        ((r461) getBinding()).f.setVisibility(((com.ybsdk.core.permissions.a) this.permissionManager).a() ? 0 : 8);
        r461Var.f.setContentDescription(d.a(requireContext(), state.a()));
        try {
            QrScannerPreview qrView = getQrView();
            if (qrView == null) {
                return null;
            }
            qrView.setTorch(state.c());
            return zy11Var;
        } catch (Throwable th) {
            x4c.g("Can't enable torch", th, null, null, 12);
            return zy11Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderInfoButton() {
        QrReaderLogoImage image;
        QrReaderContentInfo infoIcon = getInfoIcon();
        rbv imageModel = (infoIcon == null || (image = infoIcon.getImage()) == null) ? null : image.toImageModel();
        ((r461) getBinding()).h.setVisibility((!isTsarButtonEnabled() || imageModel == null) ? 8 : 0);
        if (!isTsarButtonEnabled() || imageModel == null) {
            return;
        }
        v4b1.k(imageModel, ((r461) getBinding()).i, null, null, 6);
        FrameLayout frameLayout = ((r461) getBinding()).h;
        QrReaderContentInfo infoIcon2 = getInfoIcon();
        frameLayout.setContentDescription(infoIcon2 != null ? infoIcon2.getAccessibilityLabel() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderToolbar() {
        ((r461) getBinding()).n.setVisibility(((com.ybsdk.core.permissions.a) this.permissionManager).a() ? 0 : 8);
        ToolbarView toolbarView = ((r461) getBinding()).o;
        if (isOldScreen()) {
            renderToolbarOldScreen(toolbarView);
        } else if (isTsarButtonEnabled()) {
            renderToolbarWithTsarButton(toolbarView);
        } else {
            renderToolbarWithoutTsarButton(toolbarView);
        }
    }

    private final void renderToolbarOldScreen(ToolbarView toolbarView) {
        toolbarView.setCloseButtonTint(ung0.ybColor_textIcon_primaryStaticInverted);
        initRecognitionFromFileForOldScanner();
    }

    private final void renderToolbarWithTsarButton(ToolbarView toolbarView) {
        toolbarView.render(new cbg0(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 renderToolbarWithTsarButton$lambda$30(stz0 stz0Var) {
        return stz0.a(stz0Var, Text.Empty.INSTANCE, null, null, null, null, new ntz0(new ColorModel.Attr(ung0.ybColor_textIcon_primaryStaticInverted)), false, false, null, null, 0, 32734);
    }

    private final void renderToolbarWithoutTsarButton(ToolbarView toolbarView) {
        String accessibilityLabel;
        QrReaderContentInfo infoIcon = getInfoIcon();
        if (infoIcon != null && (accessibilityLabel = infoIcon.getAccessibilityLabel()) != null) {
            toolbarView.setRightImageContentDescription(accessibilityLabel);
        }
        toolbarView.render(new bcg0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 renderToolbarWithoutTsarButton$lambda$32(QrReaderFragment qrReaderFragment, stz0 stz0Var) {
        rtz0 ntz0Var;
        QrReaderLogoImage image;
        rbv imageModel;
        Text.Empty empty = Text.Empty.INSTANCE;
        QrReaderContentInfo infoIcon = qrReaderFragment.getInfoIcon();
        if (infoIcon == null || (image = infoIcon.getImage()) == null || (imageModel = image.toImageModel()) == null) {
            ((jzz) qrReaderFragment.qrSourceProvider).getClass();
            ntz0Var = new ntz0(new ColorModel.Attr(ung0.ybColor_textIcon_primaryStaticInverted));
        } else {
            ntz0Var = new ptz0(imageModel);
        }
        return stz0.a(stz0Var, empty, null, null, null, null, ntz0Var, false, false, null, null, 0, 32734);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QrReaderScreenParams screenParams_delegate$lambda$2(QrReaderFragment qrReaderFragment) {
        return (QrReaderScreenParams) dcs.a(qrReaderFragment);
    }

    private final void showBottomSheet(Text title, Text description, rbv topImage, Text primaryButtonText, sls onPrimaryButtonClick) {
        com.ybsdk.widgets.common.bottomsheet.a.a(BottomSheetDialogView.Companion, requireActivity(), requireContext(), new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(title, description, topImage != null ? new g(topImage, null, null, null, 30) : null, null, null, null, 120), new YbButtonView.a(primaryButtonText, null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131068), new xbg0(1, onPrimaryButtonClick), null, null, 100);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showLoadingState() {
        r461 r461Var = (r461) getBinding();
        ValueAnimator valueAnimator = this.progressHiddenAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.progressHiddenAnimation = null;
        ValueAnimator valueAnimator2 = this.progressVisibleAnimation;
        int i = 1;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            ValueAnimator createProgressAnimator = createProgressAnimator(1.0f);
            createProgressAnimator.setDuration((long) ((1.0f - r461Var.d.getAlpha()) * 300.0f));
            createProgressAnimator.addUpdateListener(new zbg0(r461Var, i));
            createProgressAnimator.addListener(new Animator.AnimatorListener() { // from class: com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment$showLoadingState$lambda$43$lambda$42$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    QrReaderFragment.this.progressVisibleAnimation = null;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }
            });
            createProgressAnimator.start();
            this.progressVisibleAnimation = createProgressAnimator;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showLoadingState$lambda$43$lambda$42$lambda$40(r461 r461Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        r461Var.d.setAlpha(floatValue);
        AppCompatImageView appCompatImageView = r461Var.b;
        appCompatImageView.setAlpha(1.0f - floatValue);
        if (floatValue == 1.0f) {
            appCompatImageView.setVisibility(8);
        }
    }

    private final void startQrRecognizeFlow() {
        tpr decodeFlow;
        stopRecognizeFlow();
        QrScannerPreview qrView = getQrView();
        if (qrView == null || (decodeFlow = qrView.getDecodeFlow()) == null) {
            return;
        }
        this.qrRecognizeFlowJob = e.H(getViewScope(), new jqr(decodeFlow, new QrReaderFragment$startQrRecognizeFlow$1(this), 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object startQrRecognizeFlow$handleRecognizeResults(QrReaderFragment qrReaderFragment, List list, Continuation continuation) {
        qrReaderFragment.handleRecognizeResults(list);
        return zy11.a;
    }

    private final void stopRecognizeFlow() {
        l8x l8xVar = this.qrRecognizeFlowJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.qrRecognizeFlowJob = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void subscribeBoundary(View rootView) {
        if (rootView.getHeight() <= 0) {
            x4c.g("Unexpected zero height in QrReaderFragment", null, null, Collections.singletonList(orp0.f), 6);
            return;
        }
        int q = kp50.q(144.0f);
        float adjustedFrameMaxSizeIfNeeded = getAdjustedFrameMaxSizeIfNeeded(q);
        float f = q;
        float f2 = f / adjustedFrameMaxSizeIfNeeded;
        float a = n.a(adjustedFrameMaxSizeIfNeeded, f, 2.0f, ((r461) getBinding()).o().getHeight() * 0.13f);
        float d = rje.d(vvg0.ybsdk_qr_reader_minimal_bottom_offset, requireContext()) + akb1.f(requireContext());
        float height = rootView.getHeight() / 2.0f;
        Context context = rootView.getContext();
        int i = y5h0.ybsdk_qr_error_view_vertical_bias;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i, typedValue, true);
        this.boundaryJob = c.a(this.boundaryProvider.a(), eja1.s(getViewLifecycleOwner()), new ecg0(d, height, height - d, a, f2, rje.d(vvg0.ybsdk_textsize_title1, requireContext()), rje.d(vvg0.ybsdk_textsize_headline2, requireContext()), this, adjustedFrameMaxSizeIfNeeded, (typedValue.getFloat() * (((r461) getBinding()).c.getHeight() - d)) - ((((r461) getBinding()).c.getHeight() / 2) * 0.16f), rje.d(gwg0.ybsdk_toolbar_title_offset, requireContext())));
    }

    private final void tryReadQrFromClipboardForTestsOnce() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        Text h;
        tcg0 tcg0Var = sideEffect instanceof tcg0 ? (tcg0) sideEffect : null;
        if (tcg0Var == null) {
            return;
        }
        int i = 0;
        if (tcg0Var.equals(pcg0.b)) {
            ((r461) getBinding()).c.setVisibility(0);
            return;
        }
        if (tcg0Var.equals(pcg0.d)) {
            eja1.s(this).b(new QrReaderFragment$consumeSideEffect$1(this, null));
            return;
        }
        if (tcg0Var instanceof scg0) {
            scg0 scg0Var = (scg0) tcg0Var;
            y6g0 a = scg0Var.a();
            Text d = a != null ? a.d() : unr0.h(Text.Companion, dzh0.ybsdk_qr_payment_qr_unresolved_alert_title);
            y6g0 a2 = scg0Var.a();
            Text c = a2 != null ? a2.c() : unr0.h(Text.Companion, dzh0.ybsdk_qr_payment_qr_unresolved_alert_details);
            y6g0 a3 = scg0Var.a();
            rbv e = a3 != null ? a3.e() : null;
            y6g0 a4 = scg0Var.a();
            if (a4 == null || (h = a4.b()) == null) {
                h = unr0.h(Text.Companion, dzh0.ybsdk_qr_payment_qr_unresolved_alert_button);
            }
            showBottomSheet(d, c, e, h, new agc0(17, this, tcg0Var));
            return;
        }
        if (tcg0Var.equals(pcg0.a)) {
            renderToolbar();
            renderDescription();
            ((r461) getBinding()).f.setVisibility(0);
            return;
        }
        if (tcg0Var.equals(pcg0.c)) {
            jla1.i(this.filePickerLauncher, new String[]{"image/*", "application/pdf"});
            return;
        }
        if (tcg0Var instanceof rcg0) {
            QrScannerPreview qrView = getQrView();
            if (qrView != null) {
                qrView.decodeUri(((rcg0) tcg0Var).a(), new QrReaderFragment$consumeSideEffect$3(getViewModel()));
                return;
            }
            return;
        }
        if (!(tcg0Var instanceof qcg0)) {
            w511.b();
            return;
        }
        idg0 a5 = ((qcg0) tcg0Var).a();
        showBottomSheet(a5.d(), a5.b(), a5.c(), a5.a(), new acg0(this, i));
        getViewModel().k0();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public b getFactoryOfViewModel() {
        return ((vcg0) this.viewModelFactory).a(getScreenParams());
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public r461 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        r461 p = r461.p(inflater, container);
        p.c.setGoToSettingsButtonClickListener(new acg0(this, 8));
        QrScannerPreview b = this.qrScannerPreviewFactory.b(requireContext(), this.qrScannerPreviewDependencies);
        this.qrView = b;
        b.setAnalyticsListener(new QrReaderFragment$getViewBinding$1$2$1(this.analyticsReporter.m0));
        p.k.addView(b);
        return p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        int i;
        if (isNewInsetsHandlingEnabled()) {
            i = 0;
        } else {
            i = rje.d(gwg0.ybsdk_qr_reader_toolbar_margin_top, requireContext());
        }
        int i2 = p7b1.f(insets).b + i;
        ToolbarView toolbarView = ((r461) getBinding()).o;
        ViewGroup.LayoutParams layoutParams = toolbarView.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i2, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        toolbarView.setLayoutParams(marginLayoutParams);
        handleTitleContainerOldScanner();
        return insets;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ((com.ybsdk.core.permissions.a) this.permissionManager).d(getViewModel());
    }

    @Override // defpackage.pg6
    public void onBottomSheetClosed() {
        getViewModel().o0(false);
    }

    @Override // defpackage.pg6
    public void onBottomSheetShown() {
        getViewModel().o0(true);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.qrView = null;
        l8x l8xVar = this.boundaryJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        getViewModel().h0();
        this.bottomSheetShownAware.b(this);
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        startQrRecognizeFlow();
        getViewModel().m0();
        ((r461) getBinding()).c.setVisibility(((com.ybsdk.core.permissions.a) this.permissionManager).a() ? 4 : 0);
        com.ybsdk.core.utils.ext.view.b.m(((r461) getBinding()).m);
        renderToolbar();
        wcg0 wcg0Var = this.currentState;
        if (wcg0Var == null) {
            wcg0Var = null;
        }
        renderFlashLight(wcg0Var);
        renderInfoButton();
        renderDescription();
        if (jl40.l(getScreenParams().getScreenType(), QrReaderScreenType.Old.INSTANCE)) {
            ((r461) getBinding()).o().post(new oxe0(15, this));
            setNavigationBarColorModel(new z1x0(new ColorModel.Raw(0), mob1.c(true, true)));
        }
        tryReadQrFromClipboardForTestsOnce();
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        getViewModel().n0();
        super.onStart();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.bottomSheetShownAware.a(this);
        getViewModel().p0();
        r461 r461Var = (r461) getBinding();
        QrReaderErrorView qrReaderErrorView = r461Var.c;
        ToolbarView toolbarView = r461Var.o;
        AppCompatImageView appCompatImageView = r461Var.j;
        FrameLayout frameLayout = r461Var.n;
        FrameLayout frameLayout2 = r461Var.f;
        FrameLayout frameLayout3 = r461Var.h;
        int i = 4;
        qrReaderErrorView.setVisibility(((com.ybsdk.core.permissions.a) this.permissionManager).a() ? 4 : 0);
        exa1.d(frameLayout2, scc.g(new wo31(frameLayout2), new vo31(frameLayout2)), new acg0(this, 3));
        tja1.b(frameLayout2);
        exa1.d(frameLayout3, scc.g(new wo31(frameLayout3), new vo31(frameLayout3)), new acg0(this, i));
        tja1.b(frameLayout3);
        r461Var.d.render(pc70.a);
        appCompatImageView.setVisibility(((y4a0) this.remoteConfig).p() != null ? 0 : 8);
        QrReaderContentLogo p = ((y4a0) this.remoteConfig).p();
        int i2 = 6;
        if (p != null) {
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = kp50.r(p.getTopMargin());
                marginLayoutParams.width = kp50.r(p.getWidth());
                marginLayoutParams.height = kp50.r(p.getHeight());
            }
            rbv c = fob1.c(p.getImage().getLight(), p.getImage().getDark(), new cbg0(i));
            if (c != null) {
                v4b1.k(c, appCompatImageView, null, null, 6);
            }
        }
        renderToolbar();
        if (getShowInfoIconInOldScanner()) {
            toolbarView.setOnImageClickListener(new acg0(this, 5));
        }
        toolbarView.setOnCloseButtonClickListener(new acg0(this, i2));
        toolbarView.setOnRightImageClickListener(new acg0(this, 7));
        frameLayout2.setAccessibilityTraversalBefore(frameLayout3.getId());
        frameLayout3.setAccessibilityTraversalAfter(frameLayout2.getId());
        frameLayout3.setAccessibilityTraversalBefore(frameLayout.getId());
        frameLayout.setAccessibilityTraversalAfter(frameLayout3.getId());
        toolbarView.setAccessibilityTraversalAfter(frameLayout.getId());
        frameLayout.setAccessibilityTraversalBefore(toolbarView.getId());
        hdg0 n = ((y4a0) this.remoteConfig).n();
        if (n != null) {
            r461Var.c.render(new ybg0(n.c(), n.d(), n.b(), n.a()));
        }
        renderDescription();
        setStatusBarColorModel(new z1x0(new ColorModel.Raw(0), mob1.c(true, true)));
        c.a(e.T(com.ybsdk.core.utils.ext.view.b.k(view), 1), eja1.s(getViewLifecycleOwner()), new v41(17, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(wcg0 viewState) {
        r461 r461Var = (r461) getBinding();
        this.currentState = viewState;
        v4b1.k(viewState.b(), r461Var.g, null, null, 6);
        renderFlashLight(viewState);
        renderInfoButton();
        if (viewState.d()) {
            showLoadingState();
        } else {
            hideLoadingState();
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
