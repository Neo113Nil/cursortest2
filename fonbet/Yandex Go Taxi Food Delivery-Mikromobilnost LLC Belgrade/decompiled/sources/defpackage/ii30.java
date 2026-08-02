package defpackage;

import android.app.job.JobParameters;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.navigator.address.NavigatorFullscreenDestinationSearchModalView;
import com.yandex.go.navigator.rate_route.RateRouteModalView;
import com.yandex.go.payments.cards.ui.OnClickRepeatingTouchListener;
import com.yandex.go.places.impl.ui.nearby.flex.NearbyFlexModalView;
import com.yandex.go.places.impl.ui.search.SearchModalView;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v1.OrganizationCardFlexModalView;
import com.yandex.go.rida.header.ui.RidaHeaderView;
import com.yandex.go.safety.center.instruction.SafetyCenterInstructionView;
import com.yandex.go.scooters.passes.active.ScootersActivePassesModalView;
import com.yandex.go.taxi.order.search.overlay.ordinary.mvp.b;
import com.yandex.go.user_profile.ui.primary.ProfileModalView;
import com.yandex.passport.internal.ui.sloth.e;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmCategoriesView;
import com.ybsdk.feature.savings.internal.entities.SavingsClosingVersion;
import com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositFragment;
import com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositParams;
import com.ybsdk.rconfig.configs.YbMobileCommonAnimationsImpl;
import java.util.Locale;
import java.util.Objects;
import kotlinx.coroutines.flow.r0;
import org.altbeacon.beacon.service.ScanJob;
import org.altbeacon.beacon.service.ScanState;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.map_common.map.o;
import ru.yandex.taxi.masstransit.domain.v;
import ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexModalView;
import ru.yandex.taxi.masstransit.router.MtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalView;
import ru.yandex.taxi.perf.screen.ElementPerformanceState;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes13.dex */
public final class ii30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public ii30(RecyclerView recyclerView, ScootersActivePassesModalView scootersActivePassesModalView) {
        this.a = 26;
        this.b = scootersActivePassesModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lo30 lo30Var;
        AnchorBottomSheetBehavior bottomSheetBehavior;
        AddressSearchView addressSearchView;
        View contentView;
        int i;
        t1w currentInsets;
        jsj jsjVar;
        int minItemsContainerHeight;
        boolean z;
        View view;
        View view2;
        View contentView2;
        int i2;
        t1w currentInsets2;
        int minItemsContainerHeight2;
        int visibleGalleryHeight;
        jsj jsjVar2;
        int minItemsContainerHeight3;
        ListItemComponent listItemComponent;
        ListItemComponent listItemComponent2;
        r7i0 binding;
        r7i0 binding2;
        pz40 pz40Var;
        GoLinearLayout goLinearLayout;
        FloatButtonIconComponent floatButtonIconComponent;
        GoLinearLayout goLinearLayout2;
        FloatButtonIconComponent floatButtonIconComponent2;
        AnchorBottomSheetBehavior bottomSheetBehavior2;
        FloatButtonIconComponent floatButtonIconComponent3;
        q3m0 viewModel;
        String amountProfit;
        String amountPenalty;
        m3m0 k3m0Var;
        ScanState scanState;
        Handler handler;
        crm0 binding3;
        int i3 = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ((MtDiscoveryMapOverlayRouterImpl$addStopsClicks$1$visit$$inlined$suspendCallbackApi$2) obj).invoke(zy11Var);
                break;
            case 1:
                SystemClock.elapsedRealtimeNanos();
                lo30Var = ((MtMainFlexModalView) obj).presenter;
                lo30Var.J.i(new e211(ElementPerformanceState.FIRST_CONTENTFUL_PAINT));
                break;
            case 2:
                ((o) ((v) obj).e).d();
                break;
            case 3:
                vw30 vw30Var = (vw30) ((zo31) ((y57) obj).R);
                int measuredWidth = vw30Var.d.getMeasuredWidth();
                GoConstraintLayout goConstraintLayout = vw30Var.a;
                vw30Var.c.setVisibility(measuredWidth > (goConstraintLayout.getWidth() - goConstraintLayout.getPaddingStart()) - goConstraintLayout.getPaddingEnd() ? 0 : 8);
                break;
            case 4:
                MtRoutesModalView mtRoutesModalView = (MtRoutesModalView) obj;
                mtRoutesModalView.actualizeAnchorOffset();
                bottomSheetBehavior = mtRoutesModalView.getBottomSheetBehavior();
                mtRoutesModalView.onDialogSlide(bottomSheetBehavior.E == 3 ? 1.0f : 0.0f);
                break;
            case 5:
                ((vn40) obj).y0.requestLayout();
                break;
            case 6:
                addressSearchView = ((NavigatorFullscreenDestinationSearchModalView) obj).getAddressSearchView();
                addressSearchView.addressInput.requestFocus();
                break;
            case 7:
                NearbyFlexModalView nearbyFlexModalView = (NearbyFlexModalView) obj;
                contentView = nearbyFlexModalView.getContentView();
                int height = contentView.getHeight();
                i = ((SlideableModalView) nearbyFlexModalView).topSystemWindowInset;
                int i4 = height - i;
                currentInsets = nearbyFlexModalView.getCurrentInsets();
                nearbyFlexModalView.minItemsContainerHeight = i4 - currentInsets.d;
                jsjVar = nearbyFlexModalView.flexContentContainer;
                ViewGroup.LayoutParams layoutParams = jsjVar.a.getLayoutParams();
                minItemsContainerHeight = nearbyFlexModalView.getMinItemsContainerHeight();
                layoutParams.height = minItemsContainerHeight;
                break;
            case 8:
                OnClickRepeatingTouchListener onClickRepeatingTouchListener = (OnClickRepeatingTouchListener) obj;
                z = onClickRepeatingTouchListener.pressed;
                if (z) {
                    view = onClickRepeatingTouchListener.view;
                    if (view != null) {
                        view.performClick();
                    }
                    view2 = onClickRepeatingTouchListener.view;
                    if (view2 != null) {
                        view2.postDelayed(this, 100L);
                        break;
                    }
                }
                break;
            case 9:
                d980 d980Var = (d980) obj;
                d980Var.a();
                ((Handler) qyy0.a.getValue()).postDelayed(this, 1000L);
                d980Var.z = new bwi(4, this);
                break;
            case 10:
                ((o) ((b) obj).z).d();
                break;
            case 11:
                OrganizationCardFlexModalView organizationCardFlexModalView = (OrganizationCardFlexModalView) obj;
                contentView2 = organizationCardFlexModalView.getContentView();
                int height2 = contentView2.getHeight();
                i2 = ((SlideableModalView) organizationCardFlexModalView).topSystemWindowInset;
                int i5 = height2 - i2;
                currentInsets2 = organizationCardFlexModalView.getCurrentInsets();
                organizationCardFlexModalView.minItemsContainerHeight = i5 - currentInsets2.d;
                minItemsContainerHeight2 = organizationCardFlexModalView.getMinItemsContainerHeight();
                visibleGalleryHeight = organizationCardFlexModalView.getVisibleGalleryHeight();
                organizationCardFlexModalView.minItemsErrorContainerHeight = minItemsContainerHeight2 - visibleGalleryHeight;
                jsjVar2 = organizationCardFlexModalView.flexOrganizationCardContainer;
                ViewGroup.LayoutParams layoutParams2 = jsjVar2.a.getLayoutParams();
                minItemsContainerHeight3 = organizationCardFlexModalView.getMinItemsContainerHeight();
                layoutParams2.height = minItemsContainerHeight3;
                break;
            case 12:
                ((pda0) obj).r(new qu(9));
                break;
            case 13:
                PfmCategoriesView pfmCategoriesView = (PfmCategoriesView) obj;
                if (pfmCategoriesView.isAttachedToWindow()) {
                    pfmCategoriesView.scrollToPosition(0);
                    break;
                }
                break;
            case 14:
                ((ame0) obj).k();
                break;
            case 15:
                ((wve0) obj).B.l(mve0.a);
                break;
            case 16:
                ((rwe0) obj).a0();
                break;
            case 17:
                ProfileModalView profileModalView = (ProfileModalView) obj;
                listItemComponent = profileModalView.ratingItem;
                listItemComponent2 = profileModalView.ratingItem;
                listItemComponent.setTrailCompanionTextMaxWidth((int) (listItemComponent2.getWidth() * 0.6d));
                break;
            case 18:
                RateRouteModalView rateRouteModalView = (RateRouteModalView) obj;
                binding = rateRouteModalView.getBinding();
                NestedScrollViewAdvanced nestedScrollViewAdvanced = binding.q;
                binding2 = rateRouteModalView.getBinding();
                nestedScrollViewAdvanced.smoothScrollBy(0, binding2.p.getHeight());
                break;
            case 19:
                ListItemInputComponent listItemInputComponent = (ListItemInputComponent) obj;
                listItemInputComponent.requestFocus();
                listItemInputComponent.placeCursorAtEnd();
                break;
            case 20:
                RidaHeaderView ridaHeaderView = (RidaHeaderView) obj;
                if (ridaHeaderView.getAlpha() < 1.0E-4f) {
                    ridaHeaderView.setVisibility(8);
                    pz40Var = ridaHeaderView._contentHeightFlow;
                    r0 r0Var = (r0) pz40Var;
                    r0Var.getClass();
                    r0Var.m(null, 0);
                    ridaHeaderView.setBackground(null);
                    break;
                }
                break;
            case 21:
                SafetyCenterInstructionView safetyCenterInstructionView = (SafetyCenterInstructionView) obj;
                int height3 = safetyCenterInstructionView.getHeight();
                goLinearLayout = safetyCenterInstructionView.content;
                int height4 = height3 - goLinearLayout.getHeight();
                floatButtonIconComponent = safetyCenterInstructionView.backButton;
                if (height4 < floatButtonIconComponent.getHeight()) {
                    goLinearLayout2 = safetyCenterInstructionView.content;
                    floatButtonIconComponent2 = safetyCenterInstructionView.backButton;
                    e.n(floatButtonIconComponent2.getHeight(), goLinearLayout2);
                    bottomSheetBehavior2 = safetyCenterInstructionView.getBottomSheetBehavior();
                    floatButtonIconComponent3 = safetyCenterInstructionView.backButton;
                    bottomSheetBehavior2.K(floatButtonIconComponent3.getHeight(), true);
                    break;
                }
                break;
            case 22:
                viewModel = ((SavingsAccountCloseDepositFragment) obj).getViewModel();
                SavingsAccountCloseDepositParams savingsAccountCloseDepositParams = viewModel.B;
                SavingsClosingVersion version = savingsAccountCloseDepositParams.getVersion();
                int[] iArr = p3m0.b;
                int i6 = iArr[version.ordinal()];
                if (i6 == 1) {
                    amountProfit = savingsAccountCloseDepositParams.getAmountProfit();
                } else if (i6 != 2) {
                    w511.b();
                    break;
                } else {
                    amountProfit = savingsAccountCloseDepositParams.getAmountFull();
                    if (amountProfit == null) {
                        amountProfit = "";
                    }
                }
                Locale locale = tm60.a;
                Float h = tm60.h(amountProfit);
                int i7 = iArr[savingsAccountCloseDepositParams.getVersion().ordinal()];
                if (i7 == 1) {
                    amountPenalty = savingsAccountCloseDepositParams.getAmountPenalty();
                } else if (i7 != 2) {
                    w511.b();
                    break;
                } else {
                    amountPenalty = savingsAccountCloseDepositParams.getAmountTotal();
                }
                Float h2 = tm60.h(amountPenalty);
                ndm0 ndm0Var = (ndm0) viewModel.H;
                ndm0Var.getClass();
                com.ybsdk.rconfig.b bVar = ndm0Var.a;
                j3m0 j3m0Var = (h == null || h2 == null) ? null : new j3m0(h.floatValue(), h2.floatValue(), tm60.e(((g3m0) viewModel.X()).a.getAmountPenalty()), ((YbMobileCommonAnimationsImpl) bVar.d(ks51.a()).getData()).getLostIncomePenaltyBalanceDurationMs(), ((YbMobileCommonAnimationsImpl) bVar.d(ks51.a()).getData()).getLostIncomePenaltyBalanceStepMs());
                int i8 = iArr[savingsAccountCloseDepositParams.getVersion().ordinal()];
                if (i8 == 1) {
                    k3m0Var = new k3m0(q3m0.J);
                } else if (i8 != 2) {
                    w511.b();
                    break;
                } else {
                    k3m0Var = l3m0.a;
                }
                viewModel.Z(new n3m0(k3m0Var, savingsAccountCloseDepositParams.getAmountPenalty(), ((YbMobileCommonAnimationsImpl) bVar.d(ks51.a()).getData()).getLostIncomeBarDurationMs(), j3m0Var));
                break;
            case 23:
                ((ScanJob) ((uqs) ((ii30) obj).b).c).scheduleNextScan();
                break;
            case 24:
                int i9 = ScanJob.a;
                uqs uqsVar = (uqs) obj;
                ScanJob scanJob = (ScanJob) uqsVar.c;
                Objects.toString(scanJob);
                scanJob.stopScanning();
                scanState = scanJob.mScanState;
                scanState.p();
                scanJob.jobFinished((JobParameters) uqsVar.b, false);
                handler = scanJob.mStopHandler;
                handler.post(new ii30(23, this));
                break;
            case 25:
                ((kol0) obj).resumeWith(zy11Var);
                break;
            case 26:
                ScootersActivePassesModalView scootersActivePassesModalView = (ScootersActivePassesModalView) obj;
                int r = tje.r(mrg0.go_design_m_space, scootersActivePassesModalView.getContext());
                binding3 = scootersActivePassesModalView.getBinding();
                RecyclerView recyclerView = binding3.d;
                recyclerView.setPaddingRelative(r, recyclerView.getPaddingTop(), r, recyclerView.getPaddingBottom());
                break;
            case 27:
                ((w1n0) obj).i();
                break;
            case 28:
                SearchModalView.access$getBinding((SearchModalView) obj).e.requestFocus();
                break;
            default:
                ((SearchView) obj).updateFocusedState();
                break;
        }
    }

    public ii30(long j, MtMainFlexModalView mtMainFlexModalView) {
        this.a = 1;
        this.b = mtMainFlexModalView;
    }

    public /* synthetic */ ii30(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
