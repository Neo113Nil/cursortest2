package com.ybsdk.feature.transfer.version2.internal.screens.main.presentation;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.b;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ybsdk.core.transfer.utils.AmountResizeTextWatcher;
import com.ybsdk.core.transfer.utils.AmountTextWatcher;
import com.ybsdk.core.transfer.utils.TransferCommentView;
import com.ybsdk.core.transfer.utils.TransferToolbarView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.ThousandSeparatorTextWatcher;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import com.ybsdk.feature.transfer.version2.api.TransferSkeletonType;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.fund.FundDocsNoticeFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.view.TransferMainSkeletonView;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.view.TransferMainSkeletonView$State$CircleButtonsCount;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.view.TransferMainSkeletonView$State$SuggestsCount;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.MobileProvidersListFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.f;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.MoneyInputEditView;
import com.ybsdk.widgets.common.PageIndicatorView;
import com.ybsdk.widgets.common.StadiumButtonView;
import com.ybsdk.widgets.common.Tooltip$DismissReason;
import com.ybsdk.widgets.common.Tooltip$PreferredGravity;
import com.ybsdk.widgets.common.Tooltip$PreferredPosition;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.c;
import com.ybsdk.widgets.common.bottomsheet.d;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.bottomsheet.l;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import com.ybsdk.widgets.common.o;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodView;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.ak01;
import defpackage.bk01;
import defpackage.bmg0;
import defpackage.buz0;
import defpackage.ce4;
import defpackage.cg91;
import defpackage.cuz0;
import defpackage.cvu0;
import defpackage.dcf;
import defpackage.dcs;
import defpackage.dh6;
import defpackage.dn01;
import defpackage.dzh0;
import defpackage.el0;
import defpackage.eu01;
import defpackage.fh6;
import defpackage.frb1;
import defpackage.h5a0;
import defpackage.hh6;
import defpackage.hua1;
import defpackage.hzt0;
import defpackage.i3y;
import defpackage.i5y0;
import defpackage.jj01;
import defpackage.jl40;
import defpackage.kl01;
import defpackage.kp50;
import defpackage.kux0;
import defpackage.lcb1;
import defpackage.lfx;
import defpackage.lh01;
import defpackage.ll01;
import defpackage.lwg0;
import defpackage.m1i0;
import defpackage.mdq0;
import defpackage.mh01;
import defpackage.ml01;
import defpackage.nbv;
import defpackage.nl01;
import defpackage.ntz0;
import defpackage.ol01;
import defpackage.p1b;
import defpackage.pg6;
import defpackage.pk31;
import defpackage.pl01;
import defpackage.px11;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.qg6;
import defpackage.ql01;
import defpackage.r501;
import defpackage.rbv;
import defpackage.rev;
import defpackage.rje;
import defpackage.rmy0;
import defpackage.rr51;
import defpackage.rtu;
import defpackage.rtz0;
import defpackage.saf;
import defpackage.sl;
import defpackage.sl01;
import defpackage.sls;
import defpackage.sm91;
import defpackage.t451;
import defpackage.t961;
import defpackage.tj01;
import defpackage.tk01;
import defpackage.tl01;
import defpackage.tm60;
import defpackage.ubv0;
import defpackage.ue5;
import defpackage.uj01;
import defpackage.ul01;
import defpackage.utb1;
import defpackage.uvz0;
import defpackage.v4b1;
import defpackage.vj01;
import defpackage.vl01;
import defpackage.vmu0;
import defpackage.vnq;
import defpackage.vs4;
import defpackage.vvg0;
import defpackage.vxg0;
import defpackage.w511;
import defpackage.wl01;
import defpackage.x49;
import defpackage.xj01;
import defpackage.xm2;
import defpackage.xty0;
import defpackage.y7z0;
import defpackage.y8f;
import defpackage.yf6;
import defpackage.ynb1;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.zj01;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u0090\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\u0091\u0001B\u0019\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001aH\u0016¢\u0006\u0004\b-\u0010 J\u000f\u0010.\u001a\u00020\u001aH\u0016¢\u0006\u0004\b.\u0010 J\u0017\u00101\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u0003H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u001aH\u0016¢\u0006\u0004\b6\u0010 J\u000f\u00107\u001a\u00020\u001aH\u0016¢\u0006\u0004\b7\u0010 J\u0017\u00109\u001a\u00020\u001a2\u0006\u00103\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u001a2\u0006\u00103\u001a\u000208H\u0002¢\u0006\u0004\b;\u0010:J\u0019\u0010>\u001a\u00020\u001a2\b\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u0003H\u0002¢\u0006\u0004\b@\u00105J#\u0010F\u001a\u00020\u001a*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u001a2\u0006\u00103\u001a\u000208H\u0002¢\u0006\u0004\bH\u0010:J\u0015\u0010J\u001a\u0004\u0018\u00010I*\u000208H\u0002¢\u0006\u0004\bJ\u0010KJ'\u0010Q\u001a\u00020P2\u0006\u0010L\u001a\u00020B2\u0006\u0010M\u001a\u00020B2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u001a2\u0006\u00103\u001a\u000208H\u0002¢\u0006\u0004\bS\u0010:J\u0017\u0010T\u001a\u00020\u001a2\u0006\u00103\u001a\u000208H\u0002¢\u0006\u0004\bT\u0010:J\u0017\u0010U\u001a\u00020\u001a2\u0006\u00103\u001a\u000208H\u0002¢\u0006\u0004\bU\u0010:J\u0017\u0010V\u001a\u00020\u001a2\u0006\u00103\u001a\u000208H\u0002¢\u0006\u0004\bV\u0010:J\u0017\u0010W\u001a\u00020\u001a2\u0006\u00103\u001a\u000208H\u0002¢\u0006\u0004\bW\u0010:J-\u0010]\u001a\u00020\u001a2\b\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010Z\u001a\u0004\u0018\u00010X2\b\u0010\\\u001a\u0004\u0018\u00010[H\u0002¢\u0006\u0004\b]\u0010^J+\u0010_\u001a\u00020\u001a2\u0006\u0010Y\u001a\u00020X2\b\u0010Z\u001a\u0004\u0018\u00010X2\b\u0010\\\u001a\u0004\u0018\u00010[H\u0002¢\u0006\u0004\b_\u0010^J\u0019\u0010`\u001a\u0004\u0018\u00010\u001a2\u0006\u00103\u001a\u000208H\u0002¢\u0006\u0004\b`\u0010aJ\u0019\u0010b\u001a\u0004\u0018\u00010\u001a2\u0006\u00103\u001a\u000208H\u0002¢\u0006\u0004\bb\u0010aJ\u000f\u0010c\u001a\u00020\u001aH\u0002¢\u0006\u0004\bc\u0010 J\u000f\u0010d\u001a\u00020\u001aH\u0002¢\u0006\u0004\bd\u0010 J\u000f\u0010e\u001a\u00020\u001aH\u0002¢\u0006\u0004\be\u0010 J\u0019\u0010h\u001a\u00020\u001a2\b\u0010g\u001a\u0004\u0018\u00010fH\u0002¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\u001aH\u0002¢\u0006\u0004\bj\u0010 J\u0019\u0010k\u001a\u00020\u001a2\b\u0010g\u001a\u0004\u0018\u00010fH\u0002¢\u0006\u0004\bk\u0010iJ\u000f\u0010l\u001a\u00020\u001aH\u0002¢\u0006\u0004\bl\u0010 J\u000f\u0010m\u001a\u00020\u001aH\u0002¢\u0006\u0004\bm\u0010 J\u0017\u0010n\u001a\u00020\u001a2\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bn\u0010oJ\u0013\u0010q\u001a\u00020\u001a*\u00020pH\u0002¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020\u001aH\u0002¢\u0006\u0004\bs\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010uR\u0018\u0010v\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR)\u0010\u007f\u001a\u0010\u0012\f\u0012\n z*\u0004\u0018\u00010y0y0x8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u001c\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0082\u0001R\u001c\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008c\u0001R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0092\u0001"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/main/presentation/TransferMainFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lt961;", "Lwl01;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/main/presentation/a;", "Lmdq0;", "Lpg6;", "Lce4;", "Lkl01;", "factory", "Lqg6;", "bottomSheetShownAware", "<init>", "(Lkl01;Lqg6;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/main/presentation/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lt961;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "()V", "onDestroyView", "", "onBackPressed", "()Z", "Lsl;", "accountPaymentMethodEntity", "onSelectedAccountChanged", "(Lsl;)V", "Lel0;", "additionalButtonEntity", "onAdditionalButtonClicked", "(Lel0;)V", "onBottomSheetShown", "onBottomSheetClosed", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "viewState", "render", "(Lwl01;)V", "onPause", "onStop", "Lvl01;", "renderAmount", "(Lvl01;)V", "renderFeeState", "Lvnq;", "feeState", "updateFeeState", "(Lvnq;)V", "renderButtonsAdapter", "Landroidx/viewpager2/widget/ViewPager2;", "", "itemPosition", "Lcom/ybsdk/feature/transfer/version2/internal/screens/main/presentation/TransferMainFragment$Companion$PagerScrollType;", "scrollType", "setCurrentItem", "(Landroidx/viewpager2/widget/ViewPager2;ILcom/ybsdk/feature/transfer/version2/internal/screens/main/presentation/TransferMainFragment$Companion$PagerScrollType;)V", "renderBottomSheet", "Lcom/ybsdk/feature/transfer/version2/internal/screens/main/presentation/BottomSheetViewState$SelectAccount$Type;", "getPrimaryActionType", "(Lvl01;)Lcom/ybsdk/feature/transfer/version2/internal/screens/main/presentation/BottomSheetViewState$SelectAccount$Type;", "width", "height", "Lrr51;", Constants.KEY_DATA, "Lcom/ybsdk/feature/divkit/api/ui/YbDivView;", "createYbDivView", "(IILrr51;)Lcom/ybsdk/feature/divkit/api/ui/YbDivView;", "renderConfirmButton", "renderSuggests", "renderInfo", "renderInfoSubtitle", "renderTooltip", "Lcom/ybsdk/core/utils/text/Text;", "subtitle", "linkText", "Lrbv;", "linkImage", "hideAndShowTooltip", "(Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lrbv;)V", "showTooltip", "renderCashback", "(Lvl01;)Lzy11;", "renderCrossBorderCurrencyRate", "wiggleAmount", "announceTooltip", "announceZeroAmount", "", "comment", "showCommentDialogView", "(Ljava/lang/String;)V", "afterCommentDialogDismiss", "showCommentDialog", "temporarilyDismissCommentDialog", "dismissCommentDialog", "handleNoPaymentSelected", "(Lcom/ybsdk/core/utils/text/Text;)V", "Landroid/widget/EditText;", "disableInput", "(Landroid/widget/EditText;)V", "postHideKeyboard", "Lkl01;", "Lqg6;", "previousViewState", "Lwl01;", "Lqa3;", "Lsj01;", "kotlin.jvm.PlatformType", "mainButtonsAdapter$delegate", "Li3y;", "getMainButtonsAdapter", "()Lqa3;", "mainButtonsAdapter", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "bottomSheetDialogView", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "Lhh6;", "lastBottomSheetViewState", "Lhh6;", "commentBottomSheetDialogView", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "commentBottomSheetDialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "Lcuz0;", "tooltip", "Lcuz0;", "pagerTooltip", "lastFeeState", "Lvnq;", "Companion", "zj01", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransferMainFragment extends BaseDivContextMvvmFragment<t961, wl01, a> implements mdq0, pg6, ce4 {
    private static final zj01 Companion = new zj01();

    @Deprecated
    public static final float FEE_ACTION_ICON_ASPECT = 0.625f;

    @Deprecated
    public static final long FOCUS_ON_RESUME_DELAY_MS = 300;

    @Deprecated
    public static final int STADIUM_BUTTON_IN_PAGER_POSITION = 1;

    @Deprecated
    public static final int STADIUM_BUTTON_ZERO_POSITION = 0;

    @Deprecated
    public static final long TOOLTIP_PAGER_DURATION_MS = 3000;
    private BottomSheetDialogView bottomSheetDialogView;
    private final qg6 bottomSheetShownAware;
    private BottomSheetDialog commentBottomSheetDialog;
    private BottomSheetDialogView commentBottomSheetDialogView;
    private final kl01 factory;
    private hh6 lastBottomSheetViewState;
    private vnq lastFeeState;

    /* renamed from: mainButtonsAdapter$delegate, reason: from kotlin metadata */
    private final i3y mainButtonsAdapter;
    private cuz0 pagerTooltip;
    private wl01 previousViewState;
    private cuz0 tooltip;

    public TransferMainFragment(kl01 kl01Var, qg6 qg6Var) {
        super(null, 48, null, null, a.class, 13, null);
        this.factory = kl01Var;
        this.bottomSheetShownAware = qg6Var;
        this.mainButtonsAdapter = kotlin.a.a(new vj01(this, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void afterCommentDialogDismiss() {
        postHideKeyboard();
        ((a) getViewModel()).w0(false);
        wl01 wl01Var = this.previousViewState;
        vl01 vl01Var = wl01Var instanceof vl01 ? (vl01) wl01Var : null;
        uvz0 s = vl01Var != null ? vl01Var.s() : null;
        if (this.commentBottomSheetDialogView != null && s != null) {
            hideAndShowTooltip(s.c(), s.b(), s.a());
        }
        this.commentBottomSheetDialogView = null;
    }

    private final void announceTooltip() {
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.a();
        }
        cuz0 cuz0Var2 = this.pagerTooltip;
        if (cuz0Var2 != null) {
            cuz0Var2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void announceZeroAmount() {
        BigDecimal money = ((t961) getBinding()).h.getMoney();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (jl40.l(money, bigDecimal)) {
            b.r(((t961) getBinding()).h, requireContext().getString(dzh0.ybsdk_transfer_accessibility_transfer_sum, bigDecimal));
        }
    }

    private final YbDivView createYbDivView(int width, int height, rr51 data) {
        YbDivView ybDivView = new YbDivView(getDivContext(), null, 0, 6, null);
        YbDivView.setData$default(ybDivView, data, null, null, false, 14, null);
        ybDivView.setActionHandler(new tj01(this, 19));
        ybDivView.setLayoutParams(new FrameLayout.LayoutParams(width, height));
        return ybDivView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean createYbDivView$lambda$59$lambda$58(TransferMainFragment transferMainFragment, Uri uri) {
        return ((a) transferMainFragment.getViewModel()).x0(uri);
    }

    private final void disableInput(EditText editText) {
        editText.setFocusable(false);
        editText.setCursorVisible(false);
        editText.setFocusableInTouchMode(false);
        editText.setKeyListener(null);
        editText.setOnClickListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void dismissCommentDialog() {
        BottomSheetDialog bottomSheetDialog = this.commentBottomSheetDialog;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
        }
        postHideKeyboard();
        ((a) getViewModel()).w0(false);
        wl01 wl01Var = this.previousViewState;
        vl01 vl01Var = wl01Var instanceof vl01 ? (vl01) wl01Var : null;
        uvz0 s = vl01Var != null ? vl01Var.s() : null;
        if (this.commentBottomSheetDialog != null && s != null) {
            hideAndShowTooltip(s.c(), s.b(), s.a());
        }
        this.commentBottomSheetDialog = null;
    }

    private final qa3 getMainButtonsAdapter() {
        return (qa3) this.mainButtonsAdapter.getValue();
    }

    private final BottomSheetViewState$SelectAccount$Type getPrimaryActionType(vl01 vl01Var) {
        hh6 b = vl01Var.b();
        fh6 fh6Var = b instanceof fh6 ? (fh6) b : null;
        if (fh6Var != null) {
            return fh6Var.c();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$21$lambda$10$lambda$9(TransferMainFragment transferMainFragment, View view) {
        ((a) transferMainFragment.getViewModel()).X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$21$lambda$12$lambda$11(View view, float f) {
        view.setAlpha(1.0f - Math.min(1.0f, Math.abs(f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$21$lambda$15$lambda$13(TransferMainFragment transferMainFragment) {
        ((a) transferMainFragment.getViewModel()).T0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$21$lambda$15$lambda$14(TransferMainFragment transferMainFragment) {
        ((a) transferMainFragment.getViewModel()).r0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$21$lambda$18$lambda$16(TransferMainFragment transferMainFragment, View view) {
        ((a) transferMainFragment.getViewModel()).L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$21$lambda$18$lambda$17(TransferMainFragment transferMainFragment) {
        ((a) transferMainFragment.getViewModel()).S0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$21$lambda$19(TransferMainFragment transferMainFragment, View view) {
        ((a) transferMainFragment.getViewModel()).y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$21$lambda$20(TransferMainFragment transferMainFragment, View view) {
        ((a) transferMainFragment.getViewModel()).t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$21$lambda$6(t961 t961Var, View view) {
        t961Var.h.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$21$lambda$8$lambda$7(TransferMainFragment transferMainFragment, Editable editable) {
        ((a) transferMainFragment.getViewModel()).n0(editable != null ? editable.toString() : null);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleNoPaymentSelected(Text subtitle) {
        sm91.h(bmg0.ybsdk_animation_wiggle, ((t961) getBinding()).p);
        cuz0 cuz0Var = this.pagerTooltip;
        if (cuz0Var != null) {
            cuz0Var.a();
            return;
        }
        buz0 d = frb1.d(requireContext());
        d.l(subtitle);
        d.e();
        d.d(new tj01(this, 14));
        d.f(false);
        d.k(Tooltip$PreferredPosition.TOP);
        d.g(Tooltip$PreferredGravity.CENTER);
        cuz0 a = d.a();
        this.pagerTooltip = a;
        a.f(((t961) getBinding()).p, 3000L);
        cuz0 cuz0Var2 = this.pagerTooltip;
        if (cuz0Var2 != null) {
            cuz0Var2.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 handleNoPaymentSelected$lambda$88(TransferMainFragment transferMainFragment, Tooltip$DismissReason tooltip$DismissReason) {
        transferMainFragment.pagerTooltip = null;
        return zy11.a;
    }

    private final void hideAndShowTooltip(Text subtitle, Text linkText, rbv linkImage) {
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.d();
        }
        this.tooltip = null;
        if (subtitle != null) {
            showTooltip(subtitle, linkText, linkImage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa3 mainButtonsAdapter_delegate$lambda$5(TransferMainFragment transferMainFragment) {
        return new qa3(jj01.b(), jj01.c(new tj01(transferMainFragment, 5), new tj01(transferMainFragment, 6), new tj01(transferMainFragment, 7), new tj01(transferMainFragment, 8)), jj01.a(new tj01(transferMainFragment, 9)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 mainButtonsAdapter_delegate$lambda$5$lambda$0(TransferMainFragment transferMainFragment, StadiumButtonView.ClickedPart clickedPart) {
        ((a) transferMainFragment.getViewModel()).J0(clickedPart);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 mainButtonsAdapter_delegate$lambda$5$lambda$1(TransferMainFragment transferMainFragment, px11 px11Var) {
        ((a) transferMainFragment.getViewModel()).O0(px11Var, transferMainFragment.requireContext());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 mainButtonsAdapter_delegate$lambda$5$lambda$2(TransferMainFragment transferMainFragment, t451 t451Var) {
        ((a) transferMainFragment.getViewModel()).P0(t451Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 mainButtonsAdapter_delegate$lambda$5$lambda$3(TransferMainFragment transferMainFragment, o oVar) {
        ((a) transferMainFragment.getViewModel()).Q0(oVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 mainButtonsAdapter_delegate$lambda$5$lambda$4(TransferMainFragment transferMainFragment, String str) {
        ((a) transferMainFragment.getViewModel()).q0(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$22(TransferMainFragment transferMainFragment, SelectedPartner selectedPartner, PhoneInputSource phoneInputSource) {
        ((a) transferMainFragment.getViewModel()).D0(selectedPartner, phoneInputSource);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$23(TransferMainFragment transferMainFragment) {
        ((a) transferMainFragment.getViewModel()).H0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$24(TransferMainFragment transferMainFragment, TransferRequisiteResultEntity transferRequisiteResultEntity) {
        ((a) transferMainFragment.getViewModel()).F0(transferRequisiteResultEntity);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$25(TransferMainFragment transferMainFragment) {
        ((a) transferMainFragment.getViewModel()).H0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$26(TransferMainFragment transferMainFragment, SelectedPartner selectedPartner) {
        ((a) transferMainFragment.getViewModel()).C0(selectedPartner, transferMainFragment.requireContext());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$27(TransferMainFragment transferMainFragment, PaymentProviderEntity paymentProviderEntity, String str) {
        ((a) transferMainFragment.getViewModel()).B0(paymentProviderEntity);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$28(TransferMainFragment transferMainFragment, PaymentProviderEntity paymentProviderEntity, String str) {
        ((a) transferMainFragment.getViewModel()).A0(paymentProviderEntity, str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$29(TransferMainFragment transferMainFragment) {
        ((a) transferMainFragment.getViewModel()).z0();
        return zy11.a;
    }

    private final void postHideKeyboard() {
        safePostDelayed(300L, new vj01(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 postHideKeyboard$lambda$89(TransferMainFragment transferMainFragment) {
        lcb1.d(transferMainFragment.requireView());
        ((t961) transferMainFragment.getBinding()).h.requestFocus();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderAmount(vl01 viewState) {
        MoneyInputEditView moneyInputEditView = ((t961) getBinding()).h;
        Locale locale = tm60.a;
        BigDecimal g = tm60.g(String.valueOf(moneyInputEditView.getText()));
        BigDecimal t = viewState.t();
        if (t.equals(g)) {
            t = null;
        }
        if (t != null) {
            moneyInputEditView.setText(tm60.i(tm60.b(t)));
        }
        if (this.previousViewState instanceof ul01) {
            moneyInputEditView.requestFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderBottomSheet(vl01 viewState) {
        BottomSheetDialogView.State state;
        if (jl40.l(this.lastBottomSheetViewState, viewState.b())) {
            return;
        }
        this.lastBottomSheetViewState = viewState.b();
        final hh6 b = viewState.b();
        if (b == null) {
            BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.dismiss();
                this.bottomSheetDialogView = null;
                uvz0 s = viewState.s();
                Text c = s != null ? s.c() : null;
                uvz0 s2 = viewState.s();
                Text b2 = s2 != null ? s2.b() : null;
                uvz0 s3 = viewState.s();
                hideAndShowTooltip(c, b2, s3 != null ? s3.a() : null);
                return;
            }
            return;
        }
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.d();
        }
        cuz0 cuz0Var2 = this.pagerTooltip;
        if (cuz0Var2 != null) {
            cuz0Var2.d();
        }
        if (b instanceof dh6) {
            final int i = 0;
            state = new BottomSheetDialogView.State((d) new e(null, null, new sls(this) { // from class: yj01
                public final /* synthetic */ TransferMainFragment b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    View renderBottomSheet$lambda$57$lambda$49;
                    View renderBottomSheet$lambda$57$lambda$52;
                    int i2 = i;
                    hh6 hh6Var = b;
                    TransferMainFragment transferMainFragment = this.b;
                    switch (i2) {
                        case 0:
                            renderBottomSheet$lambda$57$lambda$49 = TransferMainFragment.renderBottomSheet$lambda$57$lambda$49(transferMainFragment, hh6Var);
                            return renderBottomSheet$lambda$57$lambda$49;
                        default:
                            renderBottomSheet$lambda$57$lambda$52 = TransferMainFragment.renderBottomSheet$lambda$57$lambda$52(transferMainFragment, hh6Var);
                            return renderBottomSheet$lambda$57$lambda$52;
                    }
                }
            }, 3), (YbButtonViewGroup.b) null, (h) null, false, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (c) null, false, (z1x0) null, (z1x0) null, false, false, 65532);
        } else if (!(b instanceof fh6)) {
            w511.b();
            return;
        } else {
            final int i2 = 1;
            state = new BottomSheetDialogView.State(new e(null, Integer.valueOf(rje.d(lwg0.ybsdk_payment_methods_bottom_sheet_content_bottom_padding, requireContext())), new sls(this) { // from class: yj01
                public final /* synthetic */ TransferMainFragment b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    View renderBottomSheet$lambda$57$lambda$49;
                    View renderBottomSheet$lambda$57$lambda$52;
                    int i22 = i2;
                    hh6 hh6Var = b;
                    TransferMainFragment transferMainFragment = this.b;
                    switch (i22) {
                        case 0:
                            renderBottomSheet$lambda$57$lambda$49 = TransferMainFragment.renderBottomSheet$lambda$57$lambda$49(transferMainFragment, hh6Var);
                            return renderBottomSheet$lambda$57$lambda$49;
                        default:
                            renderBottomSheet$lambda$57$lambda$52 = TransferMainFragment.renderBottomSheet$lambda$57$lambda$52(transferMainFragment, hh6Var);
                            return renderBottomSheet$lambda$57$lambda$52;
                    }
                }
            }, 1), null, null, null, null, null, null, null, null, 131036);
        }
        BottomSheetDialogView bottomSheetDialogView2 = this.bottomSheetDialogView;
        if (bottomSheetDialogView2 != null) {
            bottomSheetDialogView2.render(state);
            return;
        }
        BottomSheetDialogView bottomSheetDialogView3 = new BottomSheetDialogView(((t961) getBinding()).o().getContext(), null, 0, 6, null);
        bottomSheetDialogView3.render(state);
        bottomSheetDialogView3.onPrimaryAction(new y7z0(6, this, viewState));
        bottomSheetDialogView3.onDismiss(new tj01(this, 15));
        BottomSheetDialogView.show$default(bottomSheetDialogView3, requireActivity(), null, 2, null);
        this.bottomSheetDialogView = bottomSheetDialogView3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View renderBottomSheet$lambda$57$lambda$49(TransferMainFragment transferMainFragment, hh6 hh6Var) {
        YbDivView ybDivView = new YbDivView(transferMainFragment.getDivContext(), null, 0, 6, null);
        YbDivView.setData$default(ybDivView, ((dh6) hh6Var).a(), null, null, false, 14, null);
        ybDivView.setActionHandler(new tj01(transferMainFragment, 2));
        return ybDivView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean renderBottomSheet$lambda$57$lambda$49$lambda$48$lambda$47(TransferMainFragment transferMainFragment, Uri uri) {
        return ((a) transferMainFragment.getViewModel()).x0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View renderBottomSheet$lambda$57$lambda$52(TransferMainFragment transferMainFragment, hh6 hh6Var) {
        SelectPaymentMethodView selectPaymentMethodView = new SelectPaymentMethodView(transferMainFragment.requireContext(), null, 0, 6, null);
        fh6 fh6Var = (fh6) hh6Var;
        rr51 a = fh6Var.a();
        if (a != null) {
            selectPaymentMethodView.setHeaderWidget(transferMainFragment.createYbDivView(-1, -2, a));
        }
        selectPaymentMethodView.setListener(transferMainFragment);
        selectPaymentMethodView.render(fh6Var.b());
        return selectPaymentMethodView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void renderBottomSheet$lambda$57$lambda$56$lambda$54(TransferMainFragment transferMainFragment, vl01 vl01Var, View view) {
        BottomSheetViewState$SelectAccount$Type primaryActionType = transferMainFragment.getPrimaryActionType(vl01Var);
        if (primaryActionType != null) {
            ((a) transferMainFragment.getViewModel()).p0(primaryActionType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderBottomSheet$lambda$57$lambda$56$lambda$55(TransferMainFragment transferMainFragment, boolean z) {
        ((a) transferMainFragment.getViewModel()).o0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderButtonsAdapter(wl01 viewState) {
        t961 t961Var = (t961) getBinding();
        if (viewState instanceof ul01) {
            t961Var.q.setVisibility(4);
            return;
        }
        if (!(viewState instanceof vl01)) {
            if (viewState instanceof tl01) {
                getMainButtonsAdapter().g(null);
                return;
            } else {
                w511.b();
                return;
            }
        }
        vl01 vl01Var = (vl01) viewState;
        t961Var.p.setUserInputEnabled(vl01Var.a());
        Object S = kotlin.collections.a.S(1, getMainButtonsAdapter().f());
        hzt0 hzt0Var = S instanceof hzt0 ? (hzt0) S : null;
        Object S2 = kotlin.collections.a.S(0, getMainButtonsAdapter().f());
        hzt0 hzt0Var2 = S2 instanceof hzt0 ? (hzt0) S2 : null;
        Object S3 = kotlin.collections.a.S(1, vl01Var.c());
        hzt0 hzt0Var3 = S3 instanceof hzt0 ? (hzt0) S3 : null;
        Object S4 = kotlin.collections.a.S(0, vl01Var.c());
        getMainButtonsAdapter().h(vl01Var.c(), new ue5(hzt0Var3, S4 instanceof hzt0 ? (hzt0) S4 : null, hzt0Var2, t961Var, this, hzt0Var, 4));
        PageIndicatorView pageIndicatorView = t961Var.q;
        PageIndicatorView.a aVar = new PageIndicatorView.a(vl01Var.c().size(), 13);
        if (!vl01Var.a()) {
            aVar = PageIndicatorView.a.a(aVar, aVar.b());
        }
        pageIndicatorView.render(aVar);
        renderBottomSheet(vl01Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void renderButtonsAdapter$lambda$43$lambda$42$lambda$40(hzt0 hzt0Var, hzt0 hzt0Var2, hzt0 hzt0Var3, t961 t961Var, TransferMainFragment transferMainFragment, hzt0 hzt0Var4) {
        if (hzt0Var != null || hzt0Var2 != null) {
            if (jl40.l(hzt0Var3 != null ? hzt0Var3.a().a() : null, hzt0Var2 != null ? hzt0Var2.a().a() : null)) {
                if (jl40.l(hzt0Var4 != null ? hzt0Var4.a().a() : null, hzt0Var != null ? hzt0Var.a().a() : null)) {
                    return;
                }
                transferMainFragment.setCurrentItem(t961Var.p, 1, transferMainFragment.previousViewState instanceof vl01 ? TransferMainFragment$Companion$PagerScrollType.SMOOTH : TransferMainFragment$Companion$PagerScrollType.INSTANT);
                return;
            }
        }
        t961Var.p.post(new kux0(22, t961Var));
        ((a) transferMainFragment.getViewModel()).E0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderButtonsAdapter$lambda$43$lambda$42$lambda$40$lambda$39(t961 t961Var) {
        t961Var.p.requestTransform();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zy11 renderCashback(vl01 viewState) {
        t961 t961Var = (t961) getBinding();
        t961Var.i.setVisibility(viewState.d() != null ? 0 : 8);
        x49 d = viewState.d();
        if (d == null) {
            return null;
        }
        t961Var.i.render(d);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderConfirmButton(vl01 viewState) {
        t961 t961Var = (t961) getBinding();
        YbButtonView.a f = viewState.f();
        if (f != null) {
            t961Var.k.render(f);
        }
        t961Var.k.setVisibility(viewState.f() != null ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zy11 renderCrossBorderCurrencyRate(vl01 viewState) {
        t961 t961Var = (t961) getBinding();
        dcf g = viewState.g();
        TextView textView = t961Var.f;
        TextView textView2 = t961Var.e;
        textView.setVisibility(g != null ? 0 : 8);
        textView2.setVisibility(g != null ? 0 : 8);
        if (g == null) {
            return null;
        }
        CharSequence a = com.ybsdk.core.utils.text.d.a(requireContext(), g.d());
        Locale locale = tm60.a;
        String str = tm60.i(tm60.b(g.c())) + " " + ((Object) a);
        String a2 = g.a();
        t961Var.f.setText(a2 != null ? cvu0.v(a2, "%s", str, false) : null);
        textView2.setText(com.ybsdk.core.utils.text.d.a(requireContext(), g.b()));
        return zy11.a;
    }

    private final void renderFeeState(vl01 viewState) {
        if (jl40.l(this.lastFeeState, viewState.k())) {
            return;
        }
        vnq k = viewState.k();
        this.lastFeeState = k;
        updateFeeState(k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderInfo(vl01 viewState) {
        TextView textView = ((t961) getBinding()).n;
        bk01 n = viewState.n();
        if (n == null) {
            ynb1.d(textView);
        } else if (ynb1.a(textView) != 1) {
            ynb1.c(textView, n.b(), n.a(), n.c(), 2);
        }
        textView.setVisibility(com.ybsdk.core.utils.text.d.b(viewState.m()) ? 0 : 8);
        Text m = viewState.m();
        textView.setText(m != null ? rtu.a(new rmy0(26, this, textView), com.ybsdk.core.utils.text.d.a(requireContext(), m).toString()) : null);
        xty0.f(textView, viewState.o());
        textView.setPadding(textView.getPaddingLeft(), kp50.r(viewState.p()), textView.getPaddingRight(), textView.getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderInfo$lambda$66$lambda$65(TransferMainFragment transferMainFragment, TextView textView, String str) {
        ((a) transferMainFragment.getViewModel()).u0(str);
        if (((a) transferMainFragment.getViewModel()).k0()) {
            CharSequence text = textView.getText();
            Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
            if (spannable != null) {
                Selection.removeSelection(spannable);
            }
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderInfoSubtitle(vl01 viewState) {
        TextView textView = ((t961) getBinding()).c;
        Text l = viewState.l();
        int i = 0;
        textView.setVisibility(l != null ? com.ybsdk.core.utils.text.d.b(l) : false ? 0 : 8);
        TextView textView2 = ((t961) getBinding()).c;
        Text l2 = viewState.l();
        textView2.setText(l2 != null ? rtu.a(new tj01(this, i), com.ybsdk.core.utils.text.d.a(requireContext(), l2).toString()) : null);
        ((t961) getBinding()).c.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderInfoSubtitle$lambda$67(TransferMainFragment transferMainFragment, String str) {
        ((a) transferMainFragment.getViewModel()).u0(str);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderSuggests(vl01 viewState) {
        t961 t961Var = (t961) getBinding();
        wl01 wl01Var = this.previousViewState;
        vl01 vl01Var = wl01Var instanceof vl01 ? (vl01) wl01Var : null;
        ubv0 q = viewState.q();
        if (q != null) {
            t961Var.t.render(q);
        }
        t961Var.t.setVisibility(viewState.q() != null ? 0 : 8);
        if (jl40.l(vl01Var != null ? vl01Var.q() : null, viewState.q())) {
            return;
        }
        ((a) getViewModel()).K0();
    }

    private final void renderTooltip(vl01 viewState) {
        boolean z = viewState.b() != null || viewState.i();
        if (!viewState.j()) {
            uvz0 s = viewState.s();
            if ((s != null ? s.c() : null) != null && !z) {
                showTooltip(viewState.s().c(), viewState.s().b(), viewState.s().a());
                return;
            }
        }
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.c();
        }
        this.tooltip = null;
    }

    private final void setCurrentItem(ViewPager2 viewPager2, int i, TransferMainFragment$Companion$PagerScrollType transferMainFragment$Companion$PagerScrollType) {
        int i2 = ak01.b[transferMainFragment$Companion$PagerScrollType.ordinal()];
        if (i2 == 1) {
            viewPager2.setCurrentItem(i, false);
        } else if (i2 == 2) {
            viewPager2.post(new xm2(viewPager2, i, 22));
        } else {
            w511.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showCommentDialog(String comment) {
        WindowManager.LayoutParams attributes;
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.d();
        }
        cuz0 cuz0Var2 = this.pagerTooltip;
        if (cuz0Var2 != null) {
            cuz0Var2.d();
        }
        ((t961) getBinding()).h.clearFocus();
        BottomSheetDialog bottomSheetDialog = this.commentBottomSheetDialog;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.cancel();
        }
        BottomSheetDialog bottomSheetDialog2 = new BottomSheetDialog(requireContext(), m1i0.YbSdk_CommentView_BottomSheetDialog);
        bottomSheetDialog2.setCancelable(true);
        Window window = bottomSheetDialog2.getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.windowAnimations = m1i0.YbSdk_CommentView_BottomSheetDialog_Animation;
        }
        TransferCommentView transferCommentView = new TransferCommentView(bottomSheetDialog2.getContext(), null, 0, 6, null);
        transferCommentView.render(new mh01(comment));
        transferCommentView.setClickListener(new tj01(this, 16));
        transferCommentView.setOnCloseClickListener(new tj01(this, 17));
        transferCommentView.setOnVibrateListener(new tj01(this, 18));
        bottomSheetDialog2.setContentView(transferCommentView);
        bottomSheetDialog2.setOnCancelListener(new yf6(2, this));
        bottomSheetDialog2.getBehavior().W(3);
        this.commentBottomSheetDialog = bottomSheetDialog2;
        bottomSheetDialog2.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 showCommentDialog$lambda$87$lambda$85$lambda$82(TransferMainFragment transferMainFragment, String str) {
        ((a) transferMainFragment.getViewModel()).s0(str);
        transferMainFragment.dismissCommentDialog();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 showCommentDialog$lambda$87$lambda$85$lambda$83(TransferMainFragment transferMainFragment, String str) {
        ((a) transferMainFragment.getViewModel()).V0(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 showCommentDialog$lambda$87$lambda$85$lambda$84(TransferMainFragment transferMainFragment, pk31 pk31Var) {
        cg91.c(((t961) transferMainFragment.getBinding()).o(), pk31Var);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showCommentDialogView(String comment) {
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.d();
        }
        cuz0 cuz0Var2 = this.pagerTooltip;
        if (cuz0Var2 != null) {
            cuz0Var2.d();
        }
        ((t961) getBinding()).h.clearFocus();
        BottomSheetDialogView bottomSheetDialogView = this.commentBottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        this.commentBottomSheetDialogView = com.ybsdk.widgets.common.bottomsheet.a.a(BottomSheetDialogView.Companion, requireActivity(), requireContext(), new BottomSheetDialogView.State((d) new e(null, null, new i5y0(24, this, comment), 3), (YbButtonViewGroup.b) null, (h) null, false, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (c) null, false, (z1x0) null, (z1x0) null, false, false, 65534), null, null, new tj01(this, 1), 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View showCommentDialogView$lambda$80(TransferMainFragment transferMainFragment, String str) {
        TransferCommentView transferCommentView = new TransferCommentView(transferMainFragment.requireContext(), null, 0, 6, null);
        transferCommentView.render(new mh01(str));
        transferCommentView.setClickListener(new tj01(transferMainFragment, 11));
        transferCommentView.setOnCloseClickListener(new tj01(transferMainFragment, 13));
        transferCommentView.setOnVibrateListener(new lh01(transferCommentView, 2));
        return transferCommentView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 showCommentDialogView$lambda$80$lambda$79$lambda$76(TransferMainFragment transferMainFragment, String str) {
        ((a) transferMainFragment.getViewModel()).s0(str);
        BottomSheetDialogView bottomSheetDialogView = transferMainFragment.commentBottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        transferMainFragment.afterCommentDialogDismiss();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 showCommentDialogView$lambda$80$lambda$79$lambda$77(TransferMainFragment transferMainFragment, String str) {
        ((a) transferMainFragment.getViewModel()).V0(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showCommentDialogView$lambda$80$lambda$79$lambda$78(TransferCommentView transferCommentView, pk31 pk31Var) {
        cg91.c(transferCommentView, pk31Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showCommentDialogView$lambda$81(TransferMainFragment transferMainFragment, boolean z) {
        if (z) {
            transferMainFragment.afterCommentDialogDismiss();
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showTooltip(Text subtitle, Text linkText, rbv linkImage) {
        cuz0 cuz0Var;
        wl01 wl01Var = this.previousViewState;
        vl01 vl01Var = wl01Var instanceof vl01 ? (vl01) wl01Var : null;
        uvz0 s = vl01Var != null ? vl01Var.s() : null;
        t961 t961Var = (t961) getBinding();
        if (jl40.l(subtitle, s != null ? s.c() : null) && jl40.l(linkText, s.b()) && (cuz0Var = this.tooltip) != null) {
            cuz0Var.a();
            return;
        }
        cuz0 cuz0Var2 = this.tooltip;
        if (cuz0Var2 != null) {
            cuz0Var2.d();
        }
        buz0 d = frb1.d(requireContext());
        d.l(subtitle);
        d.i(linkText);
        d.h(linkImage);
        d.e();
        d.d(new tj01(this, 10));
        d.f(false);
        d.k(Tooltip$PreferredPosition.TOP);
        d.b(new vj01(this, 5));
        cuz0 a = d.a();
        this.tooltip = a;
        a.f(t961Var.d, 0L);
        cuz0 cuz0Var3 = this.tooltip;
        if (cuz0Var3 != null) {
            cuz0Var3.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showTooltip$lambda$71$lambda$69(TransferMainFragment transferMainFragment, Tooltip$DismissReason tooltip$DismissReason) {
        transferMainFragment.tooltip = null;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 showTooltip$lambda$71$lambda$70(TransferMainFragment transferMainFragment) {
        ((a) transferMainFragment.getViewModel()).M0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void temporarilyDismissCommentDialog() {
        if (getCustomHandlingInsetsBehaviourProvider().getDrawSdkUnderSafeArea()) {
            BottomSheetDialogView bottomSheetDialogView = this.commentBottomSheetDialogView;
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.dismiss();
            }
            ((a) getViewModel()).w0(this.commentBottomSheetDialogView != null);
            return;
        }
        BottomSheetDialog bottomSheetDialog = this.commentBottomSheetDialog;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.dismiss();
        }
        ((a) getViewModel()).w0(this.commentBottomSheetDialog != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateFeeState(vnq feeState) {
        TextView textView = ((t961) getBinding()).m;
        textView.setText(feeState != null ? com.ybsdk.core.utils.text.d.a(requireContext(), feeState.b()) : null);
        textView.setVisibility(feeState != null ? 0 : 8);
        if ((feeState != null ? feeState.a() : null) != null) {
            nbv nbvVar = new nbv(vxg0.ybsdk_ic_arrow_fee_action, rev.f);
            float dimension = textView.getResources().getDimension(vvg0.ybsdk_textsize_body3);
            v4b1.h(nbvVar, textView, (int) (0.625f * dimension), (int) dimension);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void wiggleAmount() {
        sm91.h(bmg0.ybsdk_animation_wiggle, ((t961) getBinding()).h);
        sm91.h(bmg0.ybsdk_animation_wiggle, ((t961) getBinding()).g);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        uvz0 s;
        ql01 ql01Var = sideEffect instanceof ql01 ? (ql01) sideEffect : null;
        if (ql01Var == null) {
            return;
        }
        if (ql01Var.equals(pl01.a)) {
            wiggleAmount();
            announceTooltip();
            announceZeroAmount();
            return;
        }
        if (ql01Var instanceof ol01) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, activity, ((ol01) ql01Var).a(), null, 12);
                return;
            }
            return;
        }
        if (ql01Var instanceof nl01) {
            if (!getCustomHandlingInsetsBehaviourProvider().getDrawSdkUnderSafeArea() || Build.VERSION.SDK_INT < 30) {
                showCommentDialog(((nl01) ql01Var).a());
                return;
            } else {
                showCommentDialogView(((nl01) ql01Var).a());
                return;
            }
        }
        if (ql01Var instanceof ll01) {
            handleNoPaymentSelected(((ll01) ql01Var).a());
            return;
        }
        if (!ql01Var.equals(ml01.a)) {
            w511.b();
            return;
        }
        wl01 wl01Var = this.previousViewState;
        vl01 vl01Var = wl01Var instanceof vl01 ? (vl01) wl01Var : null;
        if (vl01Var == null || vl01Var.j() || vl01Var.b() != null || vl01Var.i() || (s = vl01Var.s()) == null) {
            return;
        }
        wiggleAmount();
        hideAndShowTooltip(s.c(), s.b(), s.a());
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((sl01) this.factory).a((TransferMainScreenParams) dcs.a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public t961 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        t961 p = t961.p(inflater, container);
        this.bottomSheetShownAware.a(this);
        p.o().setOnClickListener(new vmu0(16, p));
        MoneyInputEditView moneyInputEditView = p.h;
        utb1.d(p.o, moneyInputEditView);
        moneyInputEditView.addTextChangedListener(new AmountTextWatcher(moneyInputEditView, new tj01(this, 12)));
        final int i = 1;
        moneyInputEditView.addTextChangedListener(new ThousandSeparatorTextWatcher(null, i, 0 == true ? 1 : 0));
        moneyInputEditView.addTextChangedListener(new AmountResizeTextWatcher(requireContext(), moneyInputEditView, p.g, p.o()));
        moneyInputEditView.setInputType(524288);
        AppCompatEditText appCompatEditText = p.j;
        final int i2 = 0;
        appCompatEditText.setFocusable(false);
        appCompatEditText.setCursorVisible(false);
        appCompatEditText.setFocusableInTouchMode(false);
        appCompatEditText.setOnClickListener(new View.OnClickListener(this) { // from class: wj01
            public final /* synthetic */ TransferMainFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                TransferMainFragment transferMainFragment = this.b;
                switch (i3) {
                    case 0:
                        TransferMainFragment.getViewBinding$lambda$21$lambda$10$lambda$9(transferMainFragment, view);
                        break;
                    case 1:
                        TransferMainFragment.getViewBinding$lambda$21$lambda$18$lambda$16(transferMainFragment, view);
                        break;
                    case 2:
                        TransferMainFragment.getViewBinding$lambda$21$lambda$19(transferMainFragment, view);
                        break;
                    default:
                        TransferMainFragment.getViewBinding$lambda$21$lambda$20(transferMainFragment, view);
                        break;
                }
            }
        });
        ViewPager2 viewPager2 = p.p;
        viewPager2.setAdapter(getMainButtonsAdapter());
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setPageTransformer(new xj01(i2));
        p.q.attachToViewPager(viewPager2);
        ErrorView errorView = p.l;
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new vj01(this, 6));
        errorView.setSecondaryButtonClickListener(new vj01(this, 7));
        TransferToolbarView transferToolbarView = p.u;
        transferToolbarView.setSubtitleClickListener(new View.OnClickListener(this) { // from class: wj01
            public final /* synthetic */ TransferMainFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                TransferMainFragment transferMainFragment = this.b;
                switch (i3) {
                    case 0:
                        TransferMainFragment.getViewBinding$lambda$21$lambda$10$lambda$9(transferMainFragment, view);
                        break;
                    case 1:
                        TransferMainFragment.getViewBinding$lambda$21$lambda$18$lambda$16(transferMainFragment, view);
                        break;
                    case 2:
                        TransferMainFragment.getViewBinding$lambda$21$lambda$19(transferMainFragment, view);
                        break;
                    default:
                        TransferMainFragment.getViewBinding$lambda$21$lambda$20(transferMainFragment, view);
                        break;
                }
            }
        });
        transferToolbarView.setOnCloseButtonClickListener(new vj01(this, 8));
        final int i3 = 2;
        p.m.setOnClickListener(new View.OnClickListener(this) { // from class: wj01
            public final /* synthetic */ TransferMainFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                TransferMainFragment transferMainFragment = this.b;
                switch (i32) {
                    case 0:
                        TransferMainFragment.getViewBinding$lambda$21$lambda$10$lambda$9(transferMainFragment, view);
                        break;
                    case 1:
                        TransferMainFragment.getViewBinding$lambda$21$lambda$18$lambda$16(transferMainFragment, view);
                        break;
                    case 2:
                        TransferMainFragment.getViewBinding$lambda$21$lambda$19(transferMainFragment, view);
                        break;
                    default:
                        TransferMainFragment.getViewBinding$lambda$21$lambda$20(transferMainFragment, view);
                        break;
                }
            }
        });
        final int i4 = 3;
        p.k.setOnClickListener(new View.OnClickListener(this) { // from class: wj01
            public final /* synthetic */ TransferMainFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i4;
                TransferMainFragment transferMainFragment = this.b;
                switch (i32) {
                    case 0:
                        TransferMainFragment.getViewBinding$lambda$21$lambda$10$lambda$9(transferMainFragment, view);
                        break;
                    case 1:
                        TransferMainFragment.getViewBinding$lambda$21$lambda$18$lambda$16(transferMainFragment, view);
                        break;
                    case 2:
                        TransferMainFragment.getViewBinding$lambda$21$lambda$19(transferMainFragment, view);
                        break;
                    default:
                        TransferMainFragment.getViewBinding$lambda$21$lambda$20(transferMainFragment, view);
                        break;
                }
            }
        });
        p.t.setOnSuggestClickListener(new TransferMainFragment$getViewBinding$1$9(getViewModel()));
        p.n.setMovementMethod(LinkMovementMethod.getInstance());
        return p;
    }

    @Override // defpackage.mdq0
    public void onAddMethodClicked() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mdq0
    public void onAdditionalButtonClicked(el0 additionalButtonEntity) {
        ((a) getViewModel()).m0(additionalButtonEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((a) getViewModel()).S0();
        return true;
    }

    @Override // defpackage.mdq0
    public void onBackPressedFromSbp() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pg6
    public void onBottomSheetClosed() {
        ((a) getViewModel()).j0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pg6
    public void onBottomSheetShown() {
        ((a) getViewModel()).j0(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TransferPhoneInputFragment.Companion.getClass();
        hua1.g(this, dn01.a(), new f(new uj01(this, 0), new vj01(this, 0)));
        hua1.g(this, TransferRequisiteFragment.RESULT_KEY, new com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.a(new tj01(this, 3), new vj01(this, 1)));
        hua1.g(this, "SELECT_PARTNER_RESULT_KEY", new com.ybsdk.feature.partnerselection.api.a(new tj01(this, 4), (sls) null, 6));
        hua1.g(this, MobileProvidersListFragment.DEFAULT_MOBILE_PROVIDERS_RESULT_KEY, new com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.b(new uj01(this, 1)));
        hua1.g(this, InternetPaymentFormInputFragment.INTERNET_FORM_RESULT_KEY, new com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.a(new uj01(this, 2)));
        hua1.g(this, FundDocsNoticeFragment.RESULT_KEY, new vs4(25, new vj01(this, 3)));
    }

    @Override // defpackage.mdq0
    public void onCreditPaymentMethodChanged(saf safVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((a) getViewModel()).v0();
        this.bottomSheetShownAware.b(this);
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        this.bottomSheetDialogView = null;
        this.lastBottomSheetViewState = null;
        this.tooltip = null;
        this.pagerTooltip = null;
        this.lastFeeState = null;
        ((t961) getBinding()).p.setAdapter(null);
        this.previousViewState = null;
        this.commentBottomSheetDialogView = null;
        this.commentBottomSheetDialog = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        temporarilyDismissCommentDialog();
        ((t961) getBinding()).h.clearFocus();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        uvz0 s;
        super.onResume();
        ((a) getViewModel()).G0();
        wl01 wl01Var = this.previousViewState;
        vl01 vl01Var = wl01Var instanceof vl01 ? (vl01) wl01Var : null;
        if (vl01Var == null) {
            return;
        }
        if (!vl01Var.j() && !vl01Var.i()) {
            postHideKeyboard();
        }
        if (vl01Var.b() == null && !vl01Var.j() && !vl01Var.i() && (s = vl01Var.s()) != null) {
            hideAndShowTooltip(s.c(), s.b(), s.a());
        }
        if (vl01Var.j()) {
            if (getCustomHandlingInsetsBehaviourProvider().getDrawSdkUnderSafeArea()) {
                ((a) getViewModel()).X0();
                return;
            }
            BottomSheetDialog bottomSheetDialog = this.commentBottomSheetDialog;
            if (bottomSheetDialog != null) {
                bottomSheetDialog.show();
            } else {
                ((a) getViewModel()).X0();
            }
        }
    }

    @Override // defpackage.mdq0
    public void onSbpMethodClicked() {
    }

    @Override // defpackage.mdq0
    public void onSbpWidgetClicked() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mdq0
    public void onSelectedAccountChanged(sl accountPaymentMethodEntity) {
        ((a) getViewModel()).I0(accountPaymentMethodEntity);
    }

    @Override // defpackage.mdq0
    public void onSelectedPaymentMethodChanged(h5a0 h5a0Var) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        cuz0 cuz0Var = this.tooltip;
        if (cuz0Var != null) {
            cuz0Var.d();
        }
        cuz0 cuz0Var2 = this.pagerTooltip;
        if (cuz0Var2 != null) {
            cuz0Var2.d();
        }
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((a) getViewModel()).N0(getViewLifecycleOwner().getLifecycle());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0121  */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void render(wl01 viewState) {
        int i;
        t961 t961Var = (t961) getBinding();
        NumberKeyboardView numberKeyboardView = t961Var.o;
        TransferToolbarView transferToolbarView = t961Var.u;
        AppCompatEditText appCompatEditText = t961Var.j;
        TransferMainSkeletonView transferMainSkeletonView = t961Var.s;
        boolean z = viewState instanceof ul01;
        numberKeyboardView.setSkeletonMode(z);
        NumberKeyboardView numberKeyboardView2 = t961Var.o;
        boolean z2 = !z;
        numberKeyboardView2.setEnabled(z2);
        MoneyInputEditView moneyInputEditView = t961Var.h;
        moneyInputEditView.setEnabled(z2);
        moneyInputEditView.setCursorVisible(true);
        ErrorView errorView = t961Var.l;
        errorView.render(null);
        renderButtonsAdapter(viewState);
        ul01 ul01Var = z ? (ul01) viewState : null;
        t961Var.o().setVisibility((ul01Var == null || !ul01Var.b()) ? 0 : 8);
        boolean z3 = (ul01Var != null ? ul01Var.a() : null) == TransferSkeletonType.SCENARIO;
        setBackButtonVisible(!z3 && (ul01Var == null || !ul01Var.b()));
        t961Var.r.o().setVisibility(!z3 ? 8 : 0);
        t961Var.b.setVisibility(z3 ? 8 : 0);
        TransferSkeletonType a = ul01Var != null ? ul01Var.a() : null;
        int i2 = a == null ? -1 : ak01.a[a.ordinal()];
        if (i2 != -1) {
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                i = 0;
                transferMainSkeletonView.setVisibility(i);
                if (!(viewState instanceof vl01)) {
                    vl01 vl01Var = (vl01) viewState;
                    errorView.render(null);
                    renderAmount(vl01Var);
                    renderFeeState(vl01Var);
                    renderTooltip(vl01Var);
                    renderConfirmButton(vl01Var);
                    renderSuggests(vl01Var);
                    renderInfo(vl01Var);
                    renderInfoSubtitle(vl01Var);
                    renderCashback(vl01Var);
                    renderCrossBorderCurrencyRate(vl01Var);
                    appCompatEditText.setVisibility(!vl01Var.w() ? 8 : 0);
                    transferToolbarView.render(vl01Var.r());
                    t961Var.g.setText(vl01Var.h());
                    String e = vl01Var.e();
                    if (e == null) {
                        e = "";
                    }
                    appCompatEditText.setText(e);
                    if (!vl01Var.v()) {
                        disableInput(appCompatEditText);
                    }
                    if (!vl01Var.u()) {
                        disableInput(moneyInputEditView);
                    }
                    numberKeyboardView2.setVisibility(vl01Var.u() ? 0 : 8);
                } else if (viewState instanceof tl01) {
                    errorView.render(r501.a(((tl01) viewState).a(), null, null, null, null, null, null, null, null, null, null, null, null, 65534));
                } else {
                    if (!z) {
                        w511.b();
                        return;
                    }
                    appCompatEditText.setVisibility(8);
                    t961Var.m.setVisibility(8);
                    t961Var.k.setVisibility(8);
                    t961Var.t.setVisibility(8);
                    t961Var.f.setVisibility(8);
                    t961Var.e.setVisibility(8);
                    TransferSkeletonType a2 = ((ul01) viewState).a();
                    int i3 = a2 == null ? -1 : ak01.a[a2.ordinal()];
                    if (i3 != -1) {
                        if (i3 == 1) {
                            transferMainSkeletonView.render(new tk01(TransferMainSkeletonView$State$SuggestsCount.ONE, TransferMainSkeletonView$State$CircleButtonsCount.THREE));
                        } else if (i3 == 2) {
                            transferMainSkeletonView.render(new tk01(TransferMainSkeletonView$State$SuggestsCount.ZERO, TransferMainSkeletonView$State$CircleButtonsCount.ZERO));
                        } else if (i3 == 3) {
                            transferMainSkeletonView.render(new tk01(TransferMainSkeletonView$State$SuggestsCount.THREE, TransferMainSkeletonView$State$CircleButtonsCount.ZERO));
                        } else {
                            if (i3 != 4) {
                                w511.b();
                                return;
                            }
                            transferToolbarView.render(new eu01((Text.Constant) null, false, (rbv) null, (Text.Constant) null, (Text) null, (rtz0) new ntz0(0), 95));
                        }
                    }
                }
                this.previousViewState = viewState;
            }
            if (i2 != 4) {
                w511.b();
                return;
            }
        }
        i = 8;
        transferMainSkeletonView.setVisibility(i);
        if (!(viewState instanceof vl01)) {
        }
        this.previousViewState = viewState;
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
