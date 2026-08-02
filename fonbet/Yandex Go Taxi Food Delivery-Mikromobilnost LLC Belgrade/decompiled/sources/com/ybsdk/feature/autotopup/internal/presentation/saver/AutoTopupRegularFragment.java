package com.ybsdk.feature.autotopup.internal.presentation.saver;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.ThousandSeparatorTextWatcher;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.FrequencyType;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;
import com.ybsdk.feature.autotopup.internal.presentation.view.AutoTopupSummaryView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.Tooltip$DismissReason;
import com.ybsdk.widgets.common.Tooltip$PreferredGravity;
import com.ybsdk.widgets.common.Tooltip$PreferredPosition;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.daychoosers.MonthDayChooserView;
import com.ybsdk.widgets.common.bottomsheet.daychoosers.WeekDayChooserView;
import com.ybsdk.widgets.common.bottomsheet.daychoosers.WeekDayChooserView$State$WeekDay;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.bottomsheet.l;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import com.ybsdk.widgets.common.g;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodView;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.a661;
import defpackage.ahq0;
import defpackage.at3;
import defpackage.ay3;
import defpackage.b730;
import defpackage.buz0;
import defpackage.bx3;
import defpackage.by3;
import defpackage.ce4;
import defpackage.cg91;
import defpackage.cuz0;
import defpackage.cx3;
import defpackage.cy3;
import defpackage.dcs;
import defpackage.dna;
import defpackage.dx3;
import defpackage.dy3;
import defpackage.eo1;
import defpackage.ex3;
import defpackage.ey3;
import defpackage.fk11;
import defpackage.frb1;
import defpackage.fx3;
import defpackage.fy3;
import defpackage.gx3;
import defpackage.hc5;
import defpackage.hsg;
import defpackage.hua1;
import defpackage.hy3;
import defpackage.i3y;
import defpackage.ix3;
import defpackage.iy3;
import defpackage.jl40;
import defpackage.jw00;
import defpackage.jx3;
import defpackage.jy3;
import defpackage.kp50;
import defpackage.kx3;
import defpackage.ky3;
import defpackage.l1i0;
import defpackage.l24;
import defpackage.lcb1;
import defpackage.lfx;
import defpackage.lx3;
import defpackage.mh3;
import defpackage.mw2;
import defpackage.my3;
import defpackage.ny3;
import defpackage.ok31;
import defpackage.oy3;
import defpackage.p1b;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.rbv;
import defpackage.rr51;
import defpackage.sua1;
import defpackage.sx3;
import defpackage.tgq0;
import defpackage.tja1;
import defpackage.tls;
import defpackage.tn1;
import defpackage.tx3;
import defpackage.uk11;
import defpackage.ux3;
import defpackage.v161;
import defpackage.v4b1;
import defpackage.v5;
import defpackage.vrc;
import defpackage.vv3;
import defpackage.vw41;
import defpackage.vx3;
import defpackage.w511;
import defpackage.ww41;
import defpackage.wx3;
import defpackage.x630;
import defpackage.xty0;
import defpackage.xx3;
import defpackage.y630;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yx3;
import defpackage.z1x0;
import defpackage.zx3;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000Í\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0006*\u0001i\b\u0000\u0018\u0000 l2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001mB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\b*\u0010%J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\b+\u0010%J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010%J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010%J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\b.\u0010%J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\b/\u0010%J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\b0\u0010%J\u001f\u00104\u001a\u00020\u000e2\u000e\u00103\u001a\n\u0018\u000101j\u0004\u0018\u0001`2H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u000e2\u000e\u00103\u001a\n\u0018\u000101j\u0004\u0018\u0001`6H\u0002¢\u0006\u0004\b7\u00105J\u001f\u0010<\u001a\u00020\u000e2\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u00020\u000e2\b\u00103\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\bA\u0010%J\u0017\u0010B\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\bB\u0010%J\u0017\u0010C\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0003H\u0002¢\u0006\u0004\bC\u0010%J\u0017\u0010F\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bH\u0010GJ\u0017\u0010J\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020IH\u0002¢\u0006\u0004\bJ\u0010KJ\u0019\u0010N\u001a\u00020\u000e2\b\u0010M\u001a\u0004\u0018\u00010LH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020PH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020SH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020 H\u0002¢\u0006\u0004\bW\u0010XR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010YR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010_\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R)\u0010h\u001a\u0010\u0012\f\u0012\n c*\u0004\u0018\u00010b0b0a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006n"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/saver/AutoTopupRegularFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "La661;", "Loy3;", "Lcom/ybsdk/feature/autotopup/internal/presentation/saver/a;", "Lce4;", "Lfy3;", "factoryOfViewModel", "Luk11;", "secondFactorScreenProvider", "<init>", "(Lfy3;Luk11;)V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "createViewModel", "()Lcom/ybsdk/feature/autotopup/internal/presentation/saver/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La661;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "()V", "onDestroyView", "", "onBackPressed", "()Z", "viewState", "render", "(Loy3;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "renderError", "renderTrivia", "renderToolbar", "renderShimmer", "renderButtons", "renderDivView", "renderFrequency", "Lb730;", "Lcom/ybsdk/feature/autotopup/internal/presentation/saver/entities/OncePerWeekViewItem;", Constants.KEY_DATA, "renderFrequencyOncePerWeek", "(Lb730;)V", "Lcom/ybsdk/feature/autotopup/internal/presentation/saver/entities/OncePerMonthViewItem;", "renderFrequencyOncePerMonth", "Lcom/ybsdk/widgets/common/g;", "amount", "Lhsg;", MetaDataField.DATE_FIELD, "renderFrequencyOnce", "(Lcom/ybsdk/widgets/common/g;Lhsg;)V", "Lfk11;", "renderFrequencyTwicePerMonth", "(Lfk11;)V", "renderInstructions", "renderSummaryWidget", "renderSourceSelection", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "bottomSheetState", "showExitConfirmationNotice", "(Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;)V", "showNoticeBottomSheet", "Ldy3;", "showTooltip", "(Ldy3;)V", "Lcom/ybsdk/widgets/common/bottomsheet/daychoosers/WeekDayChooserView$State$WeekDay;", "day", "showDayOfWeekBottomSheet", "(Lcom/ybsdk/widgets/common/bottomsheet/daychoosers/WeekDayChooserView$State$WeekDay;)V", "Lyx3;", "showDayOfMonthBottomSheet", "(Lyx3;)V", "Lby3;", "showSourceBottomSheet", "(Lby3;)V", BackendConfig.Restrictions.ENABLED, "onSummaryViewDropDownToggle", "(Z)V", "Lfy3;", "Luk11;", "Lcuz0;", "tooltip", "Lcuz0;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "bottomSheetDialogView", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "Lqa3;", "Lgc5;", "kotlin.jvm.PlatformType", "adapter$delegate", "Li3y;", "getAdapter", "()Lqa3;", "adapter", "lx3", "selectPaymentMethodListener", "Llx3;", "Companion", "jx3", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AutoTopupRegularFragment extends BaseDivContextMvvmFragment<a661, oy3, a> implements ce4 {
    private static final jx3 Companion = new jx3();
    private static final int MARGIN_FREQUENCY_OPTION_PX = kp50.r(6);

    @Deprecated
    public static final String TAG_BOTTOM_SHEET_SOURCE = "SOURCE_SELECTION_BOTTOM_SHEET";

    @Deprecated
    public static final int TOOLTIP_ROUNDING_CORNER_DP = 12;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final i3y adapter;
    private BottomSheetDialogView bottomSheetDialogView;
    private final fy3 factoryOfViewModel;
    private final uk11 secondFactorScreenProvider;
    private final lx3 selectPaymentMethodListener;
    private cuz0 tooltip;

    public AutoTopupRegularFragment(fy3 fy3Var, uk11 uk11Var) {
        super(null, null, null, null, a.class, 15, null);
        this.factoryOfViewModel = fy3Var;
        this.secondFactorScreenProvider = uk11Var;
        this.adapter = kotlin.a.b(LazyThreadSafetyMode.NONE, new gx3(this, 0));
        this.selectPaymentMethodListener = new lx3(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ a access$getViewModel(AutoTopupRegularFragment autoTopupRegularFragment) {
        return (a) autoTopupRegularFragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa3 adapter_delegate$lambda$1(AutoTopupRegularFragment autoTopupRegularFragment) {
        return new qa3(hc5.a(), sua1.c(new dx3(autoTopupRegularFragment, 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 adapter_delegate$lambda$1$lambda$0(AutoTopupRegularFragment autoTopupRegularFragment, int i) {
        lcb1.d(((a661) autoTopupRegularFragment.getBinding()).o());
        ((LoadableInput) ((a661) autoTopupRegularFragment.getBinding()).f.b).clearFocus();
        ((a661) autoTopupRegularFragment.getBinding()).n.b.clearFocus();
        ((a661) autoTopupRegularFragment.getBinding()).n.f.clearFocus();
        ((a) autoTopupRegularFragment.getViewModel()).w0(i);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void consumeSideEffect$lambda$43(AutoTopupRegularFragment autoTopupRegularFragment) {
        ((a661) autoTopupRegularFragment.getBinding()).l.showInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void consumeSideEffect$lambda$44(AutoTopupRegularFragment autoTopupRegularFragment) {
        ((a661) autoTopupRegularFragment.getBinding()).l.hideInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void consumeSideEffect$lambda$45(AutoTopupRegularFragment autoTopupRegularFragment, qas0 qas0Var) {
        ((a661) autoTopupRegularFragment.getBinding()).e.smoothScrollToPosition(((xx3) qas0Var).a());
    }

    private final qa3 getAdapter() {
        return (qa3) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$21$lambda$10(AutoTopupRegularFragment autoTopupRegularFragment, View view) {
        ((a) autoTopupRegularFragment.getViewModel()).j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$21$lambda$11(AutoTopupRegularFragment autoTopupRegularFragment, View view) {
        ((a) autoTopupRegularFragment.getViewModel()).j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$21$lambda$12(AutoTopupRegularFragment autoTopupRegularFragment, Editable editable) {
        ((a) autoTopupRegularFragment.getViewModel()).s0(editable.toString());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$21$lambda$13(AutoTopupRegularFragment autoTopupRegularFragment, View view) {
        ((a) autoTopupRegularFragment.getViewModel()).v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$21$lambda$14(AutoTopupRegularFragment autoTopupRegularFragment, Editable editable) {
        ((a) autoTopupRegularFragment.getViewModel()).C0(editable.toString());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$21$lambda$15(AutoTopupRegularFragment autoTopupRegularFragment, View view) {
        ((a) autoTopupRegularFragment.getViewModel()).E0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$21$lambda$16(AutoTopupRegularFragment autoTopupRegularFragment, View view) {
        ((a) autoTopupRegularFragment.getViewModel()).x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$21$lambda$17(AutoTopupRegularFragment autoTopupRegularFragment, boolean z) {
        autoTopupRegularFragment.onSummaryViewDropDownToggle(z);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$21$lambda$18(AutoTopupRegularFragment autoTopupRegularFragment) {
        ((a) autoTopupRegularFragment.getViewModel()).B0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$21$lambda$19(AutoTopupRegularFragment autoTopupRegularFragment) {
        ((a) autoTopupRegularFragment.getViewModel()).q0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$21$lambda$20(AutoTopupRegularFragment autoTopupRegularFragment) {
        ((a) autoTopupRegularFragment.getViewModel()).r0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$21$lambda$4(AutoTopupRegularFragment autoTopupRegularFragment, View view) {
        ((a) autoTopupRegularFragment.getViewModel()).H0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$21$lambda$5(AutoTopupRegularFragment autoTopupRegularFragment, View view) {
        ((a) autoTopupRegularFragment.getViewModel()).I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getViewBinding$lambda$21$lambda$6(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$21$lambda$7(AutoTopupRegularFragment autoTopupRegularFragment, Editable editable) {
        ((a) autoTopupRegularFragment.getViewModel()).s0(editable.toString());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$21$lambda$8(AutoTopupRegularFragment autoTopupRegularFragment, View view) {
        ((a) autoTopupRegularFragment.getViewModel()).v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$21$lambda$9(AutoTopupRegularFragment autoTopupRegularFragment, View view) {
        ((a) autoTopupRegularFragment.getViewModel()).j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$2(AutoTopupRegularFragment autoTopupRegularFragment, String str, Bundle bundle) {
        ((a) autoTopupRegularFragment.getViewModel()).z0(((vv3) autoTopupRegularFragment.secondFactorScreenProvider).a(bundle));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$3(AutoTopupRegularFragment autoTopupRegularFragment) {
        ((a) autoTopupRegularFragment.getViewModel()).getClass();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onSummaryViewDropDownToggle(boolean enabled) {
        if (enabled) {
            ((a661) getBinding()).o().post(new ex3(this, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onSummaryViewDropDownToggle$lambda$66(AutoTopupRegularFragment autoTopupRegularFragment) {
        ((a661) autoTopupRegularFragment.getBinding()).g.smoothScrollTo(0, ((a661) autoTopupRegularFragment.getBinding()).l.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderButtons(oy3 viewState) {
        ky3 ky3Var = viewState instanceof ky3 ? (ky3) viewState : null;
        if (ky3Var != null) {
            ((a661) getBinding()).c.render(ky3Var.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [uc5] */
    private final void renderDivView(oy3 viewState) {
        rr51 a;
        ky3 ky3Var = viewState instanceof ky3 ? (ky3) viewState : null;
        iy3 b = ky3Var != null ? ky3Var.b() : null;
        YbDivView ybDivView = ((a661) getBinding()).d;
        ybDivView.setVisibility(b == null ? 8 : 0);
        if (b != null && (a = b.a()) != null) {
            YbDivView.setData$default(ybDivView, a, null, null, false, 14, null);
        }
        if (b != null) {
            ybDivView.updateLocalVariables(b.b());
        }
        ybDivView.setActionHandler(new AutoTopupRegularFragment$renderDivView$1$3(getViewModel()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderError(oy3 viewState) {
        my3 my3Var = viewState instanceof my3 ? (my3) viewState : null;
        ((a661) getBinding()).p.render(my3Var != null ? my3Var.a() : null);
        ((a661) getBinding()).p.setVisibility(my3Var == null ? 8 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderFrequency(oy3 viewState) {
        ky3 ky3Var = viewState instanceof ky3 ? (ky3) viewState : null;
        if (ky3Var != null) {
            getAdapter().g(ky3Var.c());
            tgq0 e = ((ky3) viewState).e();
            FrequencyType d = e.d();
            int i = kx3.a[d.ordinal()];
            if (i == 1) {
                renderFrequencyOncePerWeek(e.b());
            } else if (i == 2) {
                renderFrequencyOncePerMonth(e.a());
            } else {
                if (i != 3) {
                    w511.b();
                    return;
                }
                renderFrequencyTwicePerMonth(e.c());
            }
            ((a661) getBinding()).n.o().setVisibility(d == FrequencyType.TWICE_PER_MONTH ? 0 : 8);
            ((a661) getBinding()).f.p().setVisibility((d == FrequencyType.ONCE_PER_WEEK || d == FrequencyType.ONCE_PER_MONTH) ? 0 : 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderFrequencyOnce(g amount, hsg date) {
        CharSequence a;
        dna dnaVar = ((a661) getBinding()).f;
        String str = null;
        LoadableInput.render$default((LoadableInput) dnaVar.b, false, new eo1(22, amount), 1, null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) dnaVar.e;
        appCompatTextView.setVisibility(date.a() == null ? 8 : 0);
        xty0.d(appCompatTextView, date.a());
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) dnaVar.f;
        xty0.d(appCompatTextView2, date.b());
        xty0.e(appCompatTextView2, date.c());
        Text a2 = date.a();
        if (a2 != null && (a = d.a(requireContext(), a2)) != null) {
            str = ((Object) a) + Extension.FIX_SPACE;
        }
        if (str == null) {
            str = "";
        }
        dnaVar.c.setContentDescription(str + ((Object) d.a(requireContext(), date.b())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g renderFrequencyOnce$lambda$27$lambda$23(g gVar, g gVar2) {
        return gVar;
    }

    private final void renderFrequencyOncePerMonth(b730 data) {
        if (data == null) {
            return;
        }
        renderFrequencyOnce(data.a(), data.b());
    }

    private final void renderFrequencyOncePerWeek(b730 data) {
        if (data == null) {
            return;
        }
        renderFrequencyOnce(data.a(), data.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderFrequencyTwicePerMonth(fk11 data) {
        String str;
        CharSequence a;
        CharSequence a2;
        if (data == null) {
            return;
        }
        v161 v161Var = ((a661) getBinding()).n;
        final b730 a3 = data.a();
        final int i = 1;
        String str2 = null;
        LoadableInput.render$default(v161Var.b, false, new tls() { // from class: hx3
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                g renderFrequencyTwicePerMonth$lambda$28;
                g renderFrequencyTwicePerMonth$lambda$32;
                int i2 = r2;
                b730 b730Var = a3;
                g gVar = (g) obj;
                switch (i2) {
                    case 0:
                        renderFrequencyTwicePerMonth$lambda$28 = AutoTopupRegularFragment.renderFrequencyTwicePerMonth$lambda$28(b730Var, gVar);
                        return renderFrequencyTwicePerMonth$lambda$28;
                    default:
                        renderFrequencyTwicePerMonth$lambda$32 = AutoTopupRegularFragment.renderFrequencyTwicePerMonth$lambda$32(b730Var, gVar);
                        return renderFrequencyTwicePerMonth$lambda$32;
                }
            }
        }, 1, null);
        AppCompatTextView appCompatTextView = v161Var.d;
        appCompatTextView.setVisibility(a3.b().a() != null ? 0 : 8);
        xty0.d(appCompatTextView, a3.b().a());
        AppCompatTextView appCompatTextView2 = v161Var.e;
        xty0.d(appCompatTextView2, a3.b().b());
        xty0.e(appCompatTextView2, a3.b().c());
        Text a4 = a3.b().a();
        if (a4 == null || (a2 = d.a(requireContext(), a4)) == null) {
            str = null;
        } else {
            str = ((Object) a2) + Extension.FIX_SPACE;
        }
        if (str == null) {
            str = "";
        }
        v161Var.c.setContentDescription(str + ((Object) d.a(requireContext(), a3.b().b())));
        final b730 b = data.b();
        LoadableInput.render$default(v161Var.f, false, new tls() { // from class: hx3
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                g renderFrequencyTwicePerMonth$lambda$28;
                g renderFrequencyTwicePerMonth$lambda$32;
                int i2 = i;
                b730 b730Var = b;
                g gVar = (g) obj;
                switch (i2) {
                    case 0:
                        renderFrequencyTwicePerMonth$lambda$28 = AutoTopupRegularFragment.renderFrequencyTwicePerMonth$lambda$28(b730Var, gVar);
                        return renderFrequencyTwicePerMonth$lambda$28;
                    default:
                        renderFrequencyTwicePerMonth$lambda$32 = AutoTopupRegularFragment.renderFrequencyTwicePerMonth$lambda$32(b730Var, gVar);
                        return renderFrequencyTwicePerMonth$lambda$32;
                }
            }
        }, 1, null);
        AppCompatTextView appCompatTextView3 = v161Var.h;
        appCompatTextView3.setVisibility(b.b().a() == null ? 8 : 0);
        xty0.d(appCompatTextView3, b.b().a());
        AppCompatTextView appCompatTextView4 = v161Var.i;
        xty0.d(appCompatTextView4, b.b().b());
        xty0.e(appCompatTextView4, b.b().c());
        Text a5 = b.b().a();
        if (a5 != null && (a = d.a(requireContext(), a5)) != null) {
            str2 = ((Object) a) + Extension.FIX_SPACE;
        }
        String str3 = str2 != null ? str2 : "";
        v161Var.g.setContentDescription(str3 + ((Object) d.a(requireContext(), b.b().b())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g renderFrequencyTwicePerMonth$lambda$28(b730 b730Var, g gVar) {
        return b730Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g renderFrequencyTwicePerMonth$lambda$32(b730 b730Var, g gVar) {
        return b730Var.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderInstructions(oy3 viewState) {
        ky3 ky3Var = viewState instanceof ky3 ? (ky3) viewState : null;
        vrc d = ky3Var != null ? ky3Var.d() : null;
        CommunicationFullScreenView communicationFullScreenView = ((a661) getBinding()).o;
        communicationFullScreenView.setVisibility(d == null ? 8 : 0);
        if (d != null) {
            communicationFullScreenView.render(d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderShimmer(oy3 viewState) {
        ((a661) getBinding()).h.p().setVisibility(viewState instanceof ny3 ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderSourceSelection(oy3 viewState) {
        ky3 ky3Var = viewState instanceof ky3 ? (ky3) viewState : null;
        if (ky3Var != null) {
            jy3 f = ky3Var.f();
            ((a661) getBinding()).j.setVisibility(f.b() != null ? 0 : 8);
            rbv b = f.b();
            if (b != null) {
                v4b1.k(b, ((a661) getBinding()).j, null, null, 6);
            }
            AppCompatTextView appCompatTextView = ((a661) getBinding()).k;
            appCompatTextView.setVisibility(f.d() != null ? 0 : 8);
            xty0.d(appCompatTextView, f.d());
            View view = ((a661) getBinding()).i;
            view.setVisibility(f.d() != null ? 0 : 8);
            Text d = f.d();
            view.setContentDescription(d != null ? d.a(requireContext(), d) : null);
            ((a661) getBinding()).b.render(new eo1(21, f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahq0 renderSourceSelection$lambda$42(jy3 jy3Var, ahq0 ahq0Var) {
        return new ahq0(true, jy3Var.c(), jy3Var.f(), (Text) null, jy3Var.e(), (Text.Resource) null, 0, jy3Var.a(), 232);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderSummaryWidget(oy3 viewState) {
        ky3 ky3Var = viewState instanceof ky3 ? (ky3) viewState : null;
        l24 g = ky3Var != null ? ky3Var.g() : null;
        AutoTopupSummaryView autoTopupSummaryView = ((a661) getBinding()).l;
        autoTopupSummaryView.setVisibility(g == null ? 8 : 0);
        if (g != null) {
            autoTopupSummaryView.render(g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderToolbar(oy3 viewState) {
        ky3 ky3Var = viewState instanceof ky3 ? (ky3) viewState : null;
        if (ky3Var != null) {
            ((a661) getBinding()).q.render(ky3Var.h());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderTrivia(oy3 viewState) {
        ky3 ky3Var = viewState instanceof ky3 ? (ky3) viewState : null;
        if (ky3Var != null) {
            xty0.d(((a661) getBinding()).m, ky3Var.i());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [uc5] */
    private final void showDayOfMonthBottomSheet(yx3 sideEffect) {
        ((LoadableInput) ((a661) getBinding()).f.b).clearFocus();
        ((a661) getBinding()).n.b.clearFocus();
        ((a661) getBinding()).n.f.clearFocus();
        lcb1.d(((a661) getBinding()).o());
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        MonthDayChooserView monthDayChooserView = new MonthDayChooserView(requireContext(), null, 0, 6, null);
        monthDayChooserView.setupAnalyticActions(new AutoTopupRegularFragment$showDayOfMonthBottomSheet$selector$1$1(getViewModel()));
        monthDayChooserView.render(new y630(sideEffect.e(), sideEffect.b(), sideEffect.d(), sideEffect.c()));
        monthDayChooserView.setOnSaveButtonClickListener(new v5(24, sideEffect, this));
        BottomSheetDialogView.State state = new BottomSheetDialogView.State((com.ybsdk.widgets.common.bottomsheet.d) new e(null, null, new fx3(monthDayChooserView, 0), 3), (YbButtonViewGroup.b) null, (h) null, false, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (com.ybsdk.widgets.common.bottomsheet.c) null, false, (z1x0) null, (z1x0) null, false, false, 65534);
        Object[] objArr = 0 == true ? 1 : 0;
        BottomSheetDialogView bottomSheetDialogView2 = new BottomSheetDialogView(requireContext(), objArr, 0, 6, null);
        bottomSheetDialogView2.render(state);
        BottomSheetDialogView.show$default(bottomSheetDialogView2, requireActivity(), null, 2, null);
        this.bottomSheetDialogView = bottomSheetDialogView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 showDayOfMonthBottomSheet$lambda$59$lambda$58(yx3 yx3Var, AutoTopupRegularFragment autoTopupRegularFragment, x630 x630Var) {
        int i = kx3.c[yx3Var.a().ordinal()];
        if (i == 1) {
            ((a) autoTopupRegularFragment.getViewModel()).t0(x630Var.a(), x630Var.b());
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            Integer a = x630Var.a();
            if (a != null) {
                ((a) autoTopupRegularFragment.getViewModel()).D0(a.intValue());
            }
        }
        BottomSheetDialogView bottomSheetDialogView = autoTopupRegularFragment.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View showDayOfMonthBottomSheet$lambda$60(MonthDayChooserView monthDayChooserView) {
        return monthDayChooserView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [uc5] */
    private final void showDayOfWeekBottomSheet(WeekDayChooserView$State$WeekDay day) {
        lcb1.d(((a661) getBinding()).o());
        ((LoadableInput) ((a661) getBinding()).f.b).clearFocus();
        ((a661) getBinding()).n.b.clearFocus();
        ((a661) getBinding()).n.f.clearFocus();
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        WeekDayChooserView weekDayChooserView = new WeekDayChooserView(requireContext(), null, 0, 6, null);
        weekDayChooserView.render(new ww41(day));
        weekDayChooserView.setupAnalyticActions(new AutoTopupRegularFragment$showDayOfWeekBottomSheet$selector$1$1(getViewModel()));
        weekDayChooserView.setOnSaveButtonClickListener(new dx3(this, 4));
        BottomSheetDialogView.State state = new BottomSheetDialogView.State((com.ybsdk.widgets.common.bottomsheet.d) new e(null, null, new ix3(weekDayChooserView, 0), 3), (YbButtonViewGroup.b) null, (h) null, false, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (com.ybsdk.widgets.common.bottomsheet.c) null, false, (z1x0) null, (z1x0) null, false, false, 65534);
        Object[] objArr = 0 == true ? 1 : 0;
        BottomSheetDialogView bottomSheetDialogView2 = new BottomSheetDialogView(requireContext(), objArr, 0, 6, null);
        bottomSheetDialogView2.render(state);
        BottomSheetDialogView.show$default(bottomSheetDialogView2, requireActivity(), null, 2, null);
        this.bottomSheetDialogView = bottomSheetDialogView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 showDayOfWeekBottomSheet$lambda$54$lambda$53(AutoTopupRegularFragment autoTopupRegularFragment, vw41 vw41Var) {
        ((a) autoTopupRegularFragment.getViewModel()).t0(Integer.valueOf(vw41Var.a().ordinal() + 1), false);
        BottomSheetDialogView bottomSheetDialogView = autoTopupRegularFragment.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View showDayOfWeekBottomSheet$lambda$55(WeekDayChooserView weekDayChooserView) {
        return weekDayChooserView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showExitConfirmationNotice(BottomSheetDialogView.State bottomSheetState) {
        lcb1.d(((a661) getBinding()).o());
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        BottomSheetDialogView bottomSheetDialogView2 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
        bottomSheetDialogView2.onPrimaryAction(new bx3(this, bottomSheetDialogView2, 0));
        bottomSheetDialogView2.onSecondaryAction(new bx3(this, bottomSheetDialogView2, 1));
        bottomSheetDialogView2.render(bottomSheetState);
        BottomSheetDialogView.show$default(bottomSheetDialogView2, requireActivity(), null, 2, null);
        this.bottomSheetDialogView = bottomSheetDialogView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showExitConfirmationNotice$lambda$48$lambda$46(AutoTopupRegularFragment autoTopupRegularFragment, BottomSheetDialogView bottomSheetDialogView, View view) {
        ((a) autoTopupRegularFragment.getViewModel()).y0();
        bottomSheetDialogView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showExitConfirmationNotice$lambda$48$lambda$47(AutoTopupRegularFragment autoTopupRegularFragment, BottomSheetDialogView bottomSheetDialogView, View view) {
        ((a) autoTopupRegularFragment.getViewModel()).F0();
        bottomSheetDialogView.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showNoticeBottomSheet(BottomSheetDialogView.State bottomSheetState) {
        lcb1.d(((a661) getBinding()).o());
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        BottomSheetDialogView bottomSheetDialogView2 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
        bottomSheetDialogView2.onPrimaryAction(new bx3(bottomSheetDialogView2, this));
        bottomSheetDialogView2.onSecondaryAction(new bx3(this, bottomSheetDialogView2, 3));
        bottomSheetDialogView2.render(bottomSheetState);
        BottomSheetDialogView.show$default(bottomSheetDialogView2, requireActivity(), null, 2, null);
        this.bottomSheetDialogView = bottomSheetDialogView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showNoticeBottomSheet$lambda$51$lambda$49(BottomSheetDialogView bottomSheetDialogView, AutoTopupRegularFragment autoTopupRegularFragment, View view) {
        bottomSheetDialogView.dismiss();
        ((a) autoTopupRegularFragment.getViewModel()).p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showNoticeBottomSheet$lambda$51$lambda$50(AutoTopupRegularFragment autoTopupRegularFragment, BottomSheetDialogView bottomSheetDialogView, View view) {
        ((a) autoTopupRegularFragment.getViewModel()).n0();
        bottomSheetDialogView.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [uc5] */
    private final void showSourceBottomSheet(by3 sideEffect) {
        BottomSheetDialogView bottomSheetDialogView;
        lcb1.d(((a661) getBinding()).o());
        int i = 6;
        BottomSheetDialogView.State state = new BottomSheetDialogView.State(new e(null, null, new mw2(i, this, sideEffect), 3), new YbButtonView.a(sideEffect.a(), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131068);
        BottomSheetDialogView bottomSheetDialogView2 = this.bottomSheetDialogView;
        if (jl40.l(bottomSheetDialogView2 != null ? bottomSheetDialogView2.getTag() : null, "SOURCE_SELECTION_BOTTOM_SHEET") && (bottomSheetDialogView = this.bottomSheetDialogView) != null && bottomSheetDialogView.isShown()) {
            BottomSheetDialogView bottomSheetDialogView3 = this.bottomSheetDialogView;
            if (bottomSheetDialogView3 != null) {
                bottomSheetDialogView3.render(state);
                return;
            }
            return;
        }
        BottomSheetDialogView bottomSheetDialogView4 = this.bottomSheetDialogView;
        if (bottomSheetDialogView4 != null) {
            bottomSheetDialogView4.dismiss();
        }
        BottomSheetDialogView bottomSheetDialogView5 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
        bottomSheetDialogView5.setTag("SOURCE_SELECTION_BOTTOM_SHEET");
        bottomSheetDialogView5.onDismiss(new AutoTopupRegularFragment$showSourceBottomSheet$1$1(getViewModel()));
        bottomSheetDialogView5.onPrimaryAction(new cx3(this, i));
        bottomSheetDialogView5.render(state);
        BottomSheetDialogView.show$default(bottomSheetDialogView5, requireActivity(), null, 2, null);
        this.bottomSheetDialogView = bottomSheetDialogView5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View showSourceBottomSheet$lambda$63(AutoTopupRegularFragment autoTopupRegularFragment, by3 by3Var) {
        SelectPaymentMethodView selectPaymentMethodView = new SelectPaymentMethodView(autoTopupRegularFragment.requireContext(), null, 0, 6, null);
        selectPaymentMethodView.setListener(autoTopupRegularFragment.selectPaymentMethodListener);
        selectPaymentMethodView.render(by3Var.b());
        return selectPaymentMethodView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showSourceBottomSheet$lambda$65$lambda$64(AutoTopupRegularFragment autoTopupRegularFragment, View view) {
        ((a) autoTopupRegularFragment.getViewModel()).l0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showTooltip(dy3 sideEffect) {
        cuz0 cuz0Var = this.tooltip;
        if (jl40.l(cuz0Var != null ? cuz0Var.b() : null, sideEffect)) {
            return;
        }
        cuz0 cuz0Var2 = this.tooltip;
        if (cuz0Var2 != null) {
            cuz0Var2.d();
        }
        buz0 d = frb1.d(requireContext());
        d.c();
        d.m(l1i0.Widget_YB_Text_Caption1_Regular_Inverted);
        d.l(sideEffect.b());
        d.g(Tooltip$PreferredGravity.START);
        d.d(new dx3(this, 2));
        d.k(Tooltip$PreferredPosition.TOP);
        d.f(false);
        cuz0 a = d.a();
        this.tooltip = a;
        a.e(sideEffect);
        int i = kx3.b[sideEffect.a().ordinal()];
        if (i == 1) {
            EditText editText = ((a661) getBinding()).f.p().getVisibility() == 0 ? ((LoadableInput) ((a661) getBinding()).f.b).getEditText() : ((a661) getBinding()).n.b.getEditText();
            cuz0 cuz0Var3 = this.tooltip;
            if (cuz0Var3 != null) {
                cuz0Var3.f(editText, 0L);
                return;
            }
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        cuz0 cuz0Var4 = this.tooltip;
        if (cuz0Var4 != null) {
            cuz0Var4.f(((a661) getBinding()).n.f.getEditText(), 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showTooltip$lambda$52(AutoTopupRegularFragment autoTopupRegularFragment, Tooltip$DismissReason tooltip$DismissReason) {
        autoTopupRegularFragment.tooltip = null;
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof ey3) {
            cg91.c(((a661) getBinding()).o(), ok31.c);
            return;
        }
        if (sideEffect instanceof tx3) {
            showExitConfirmationNotice(((tx3) sideEffect).a());
            return;
        }
        if (sideEffect instanceof wx3) {
            showNoticeBottomSheet(((wx3) sideEffect).a());
            return;
        }
        if (sideEffect instanceof dy3) {
            showTooltip((dy3) sideEffect);
            return;
        }
        if (sideEffect instanceof cy3) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((cy3) sideEffect).a(), null, 12);
            return;
        }
        if (sideEffect instanceof vx3) {
            cuz0 cuz0Var = this.tooltip;
            if (cuz0Var != null) {
                cuz0Var.d();
            }
            this.tooltip = null;
            return;
        }
        if (sideEffect instanceof sx3) {
            BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.dismiss();
            }
            this.bottomSheetDialogView = null;
            return;
        }
        if (sideEffect instanceof ay3) {
            ((a661) getBinding()).o().post(new ex3(this, 1));
            return;
        }
        if (sideEffect instanceof ux3) {
            ((a661) getBinding()).o().post(new ex3(this, 2));
            return;
        }
        if (sideEffect instanceof by3) {
            showSourceBottomSheet((by3) sideEffect);
            return;
        }
        if (sideEffect instanceof zx3) {
            showDayOfWeekBottomSheet(((zx3) sideEffect).a());
            return;
        }
        if (sideEffect instanceof yx3) {
            showDayOfMonthBottomSheet((yx3) sideEffect);
        } else if (sideEffect instanceof xx3) {
            ((a661) getBinding()).o().post(new mh3(3, this, sideEffect));
        } else {
            super.consumeSideEffect(sideEffect);
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((hy3) this.factoryOfViewModel).a((AutoTopupRegularParams) dcs.a(this));
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v11, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v9, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public a661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        a661 p = a661.p(inflater, container);
        p.b.setOnClickListener(new cx3(this, 7));
        View view = p.i;
        tja1.b(view);
        int i = 0;
        view.setOnClickListener(new cx3(this, i));
        RecyclerView recyclerView = p.e;
        recyclerView.setAdapter(getAdapter());
        int i2 = 5;
        recyclerView.addItemDecoration(new jw00(0, MARGIN_FREQUENCY_OPTION_PX, 0, new at3(i2), 5));
        dna dnaVar = p.f;
        LoadableInput loadableInput = (LoadableInput) dnaVar.b;
        loadableInput.getEditText().addTextChangedListener(new ThousandSeparatorTextWatcher(new dx3(this, i)));
        View view2 = dnaVar.c;
        tja1.b(view2);
        int i3 = 1;
        view2.setOnClickListener(new cx3(this, i3));
        int i4 = 2;
        loadableInput.setOnClickListener(new cx3(this, i4));
        v161 v161Var = p.n;
        LoadableInput loadableInput2 = v161Var.b;
        int i5 = 3;
        loadableInput2.setOnClickListener(new cx3(this, i5));
        LoadableInput loadableInput3 = v161Var.f;
        int i6 = 4;
        loadableInput3.setOnClickListener(new cx3(this, i6));
        loadableInput2.getEditText().addTextChangedListener(new ThousandSeparatorTextWatcher(new dx3(this, i3)));
        View view3 = v161Var.c;
        tja1.b(view3);
        view3.setOnClickListener(new cx3(this, i2));
        loadableInput3.getEditText().addTextChangedListener(new ThousandSeparatorTextWatcher(new dx3(this, i2)));
        View view4 = v161Var.g;
        tja1.b(view4);
        view4.setOnClickListener(new cx3(this, 8));
        AppCompatTextView appCompatTextView = p.m;
        tja1.b(appCompatTextView);
        appCompatTextView.setOnClickListener(new cx3(this, 9));
        YbButtonViewGroup ybButtonViewGroup = p.c;
        ybButtonViewGroup.setLinkClickListener(new AutoTopupRegularFragment$getViewBinding$1$14(getViewModel()));
        ybButtonViewGroup.setPrimaryButtonOnClickListener(new AutoTopupRegularFragment$getViewBinding$1$15(getViewModel()));
        ybButtonViewGroup.setSecondaryButtonClickListener(new AutoTopupRegularFragment$getViewBinding$1$16(getViewModel()));
        p.l.setOnDropDownToggleAction(new dx3(this, 6));
        p.o.setPrimaryButtonOnClickListener(new gx3(this, i4));
        ErrorView errorView = p.p;
        errorView.setPrimaryButtonOnClickListener(new gx3(this, i5));
        errorView.setSecondaryButtonClickListener(new gx3(this, i6));
        return p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        if (((a661) getBinding()).o.getVisibility() == 0) {
            ((a) getViewModel()).m0();
            return true;
        }
        ((a) getViewModel()).k0();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [uc5] */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hua1.g(this, "AUTO_TOPUP_REQUEST_KEY", new tn1(17, this));
        hua1.g(this, "request_select_target", new com.ybsdk.feature.transfer.api.a(new gx3(this, 1), new AutoTopupRegularFragment$onCreate$2(getViewModel())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        this.bottomSheetDialogView = null;
        ((a) getViewModel()).o0();
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((a) getViewModel()).A0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((a) getViewModel()).J0(getViewLifecycleOwner().getLifecycle());
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(oy3 viewState) {
        renderError(viewState);
        renderTrivia(viewState);
        renderButtons(viewState);
        renderDivView(viewState);
        renderToolbar(viewState);
        renderShimmer(viewState);
        renderFrequency(viewState);
        renderInstructions(viewState);
        renderSummaryWidget(viewState);
        renderSourceSelection(viewState);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
