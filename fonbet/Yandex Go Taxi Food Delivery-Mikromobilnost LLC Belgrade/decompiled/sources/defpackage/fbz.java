package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.yandex.go.flex.screens.common.flexible.layout.manager.FlexibleGridLayoutManager;
import com.yandex.go.lootbox.impl.presentation.detail.LootBoxDetailDialog;
import com.yandex.go.navigator.map_interactions.long_taps.LongTapModalView;
import com.yandex.go.payments.shared.members.list.MembersListView;
import com.yandex.go.payments.shared.members.list.b;
import com.yandex.go.permission.location_with_agreement.ui.LocationPermissionWithAgreementModalView;
import com.yandex.go.permission.location_with_agreement.ui.c;
import com.yandex.go.platform.ui.components.LottieSplashView;
import com.yandex.go.safety.center.lost_item.modal.ui.LostItemModalView;
import com.yandex.go.user_profile.settings.main.UserInfoView;
import com.yandex.messaging.internal.view.custom.ProgressIndicator;
import com.yandex.messaging.internal.view.timeline.MessageTapHandler;
import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactFragment;
import core.flex.ui.OrientationAwareRecyclerView;
import java.io.InputStream;
import java.util.Date;
import java.util.zip.ZipInputStream;
import ru.yandex.taxi.layers.presentation.optimalview.MapObservationView;
import ru.yandex.taxi.masstransit.address.ui.MtAddressMapPickerFragment;
import ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutModalView;
import ru.yandex.taxi.search.v2.presentation.LongSearchViews;

/* loaded from: classes12.dex */
public final /* synthetic */ class fbz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fbz(da00 da00Var, OrientationAwareRecyclerView orientationAwareRecyclerView) {
        this.a = 13;
        this.b = orientationAwareRecyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView.e layoutManager;
        TextView textView;
        g5c g5cVar;
        b bVar;
        pzt0 pzt0Var;
        pzt0 pzt0Var2;
        int i = this.a;
        int i2 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                LocationPermissionWithAgreementModalView.onAttachedToWindow$onContinueClicked((c) obj);
                break;
            case 1:
                LongSearchViews.hideClientPin$lambda$0((LongSearchViews) obj);
                break;
            case 2:
                ((LongTapModalView) obj).updateRightSideContainer();
                break;
            case 3:
                ((LootBoxDetailDialog) obj).dismiss();
                break;
            case 4:
                LostItemModalView.onAttachedToWindow$closeClicked((yqz) obj);
                break;
            case 5:
                zw21.b((InputStream) obj);
                break;
            case 6:
                zw21.b((ZipInputStream) obj);
                break;
            case 7:
                ((LottieDrawable) obj).lambda$new$1();
                break;
            case 8:
                LottieSplashView.startSpiralAnimation$lambda$1((LottieSplashView) obj);
                break;
            case 9:
                ((svz) obj).invoke();
                break;
            case 10:
                ((svz) obj).invoke();
                break;
            case 11:
                ((o500) obj).b.performAccessibilityAction(64, null);
                break;
            case 12:
                ((UserInfoView) obj).sendAccessibilityEvent(32768);
                break;
            case 13:
                OrientationAwareRecyclerView orientationAwareRecyclerView = (OrientationAwareRecyclerView) obj;
                RecyclerView.Adapter adapter = orientationAwareRecyclerView.getAdapter();
                if (adapter != null && (layoutManager = orientationAwareRecyclerView.getLayoutManager()) != null && adapter.getItemCount() > 0 && layoutManager.d0() == 0 && !orientationAwareRecyclerView.isComputingLayout()) {
                    RecyclerView.e layoutManager2 = orientationAwareRecyclerView.getLayoutManager();
                    if (layoutManager2 instanceof FlexibleGridLayoutManager) {
                        FlexibleGridLayoutManager flexibleGridLayoutManager = (FlexibleGridLayoutManager) layoutManager2;
                        FlexibleGridLayoutManager.LazySpanLookup lazySpanLookup = flexibleGridLayoutManager.l0;
                        lazySpanLookup.a = new int[0];
                        lazySpanLookup.b = null;
                        flexibleGridLayoutManager.i1();
                        break;
                    }
                }
                break;
            case 14:
                e100 e100Var = (e100) obj;
                xm00 xm00Var = (xm00) e100Var.w;
                if (xm00Var != null) {
                    xm00Var.d();
                }
                xm00 xm00Var2 = (xm00) e100Var.w;
                if (xm00Var2 != null) {
                    xm00Var2.m();
                }
                e100Var.w = null;
                break;
            case 15:
                textView = ((MapObservationView) obj).messageText;
                textView.setText((CharSequence) null);
                break;
            case 16:
                ((g700) obj).invoke();
                break;
            case 17:
                com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.b bVar2 = (com.yandex.go.shortcuts.impl.view.adapter.market.recommendation.b) obj;
                bVar2.T.postInvalidateOnAnimation();
                ((k3s0) bVar2.R).c++;
                OneShotPreDrawListener.add(bVar2.T, new i8m(20, bVar2));
                break;
            case 18:
                h610 h610Var = (h610) obj;
                h610Var.f.a.a = true;
                h610Var.e.a.a.q(new Date().getTime(), "ru.yandex.taxi.utils.PreferenceUtils.FIELD_MASTERCARD_LAST_SHOWN_TIMESTAMP");
                h610Var.a();
                break;
            case 19:
                ((MaterialButton) obj).lambda$setOpticalCenterEnabled$5();
                break;
            case 20:
                ((MaterialTimePicker) obj).lambda$onViewCreated$3();
                break;
            case 21:
                MembersListView membersListView = (MembersListView) obj;
                g5cVar = membersListView.modalViewBackPressedReason;
                membersListView.setCloseTransitionReason(g5cVar);
                bVar = membersListView.presenter;
                bVar.onBackClick();
                break;
            case 22:
                MerchantOffersFragment.onProgressBarFinished$lambda$28((MerchantOffersFragment) obj);
                break;
            case 23:
                mt10 mt10Var = (mt10) obj;
                kt10 kt10Var = mt10Var.m;
                boolean l = kt10Var != null ? jl40.l(kt10Var.h, Boolean.FALSE) : false;
                ProgressIndicator progressIndicator = mt10Var.b;
                if (!l) {
                    boolean b = mt10Var.b();
                    if (mt10Var.l && (((pzt0Var = mt10Var.n) == null || !pzt0Var.isActive()) && ((pzt0Var2 = mt10Var.p) == null || !pzt0Var2.isActive()))) {
                        mav mavVar = mt10Var.u;
                        kt10 kt10Var2 = mt10Var.m;
                        if (!fx91.c(mavVar, kt10Var2 != null ? kt10Var2.g : null)) {
                            boolean z = mt10Var.r;
                            if ((!z || b) && !mt10Var.s && !mt10Var.t) {
                                progressIndicator.setRetryState();
                                break;
                            } else if (!z || !b || !mt10Var.s) {
                                kt10 kt10Var3 = mt10Var.m;
                                if ((kt10Var3 != null ? kt10Var3.d : false) && !b) {
                                    progressIndicator.setInitialState();
                                    break;
                                } else {
                                    progressIndicator.setLoadedState();
                                    break;
                                }
                            } else {
                                progressIndicator.setLoadedState();
                                break;
                            }
                        } else {
                            progressIndicator.setErrorState();
                            break;
                        }
                    } else {
                        ProgressIndicator.setLoadingState$default(progressIndicator, 0, 1, null);
                        break;
                    }
                } else {
                    progressIndicator.setVisibility(8);
                    break;
                }
                break;
            case 24:
                MessageTapHandler.onClick$lambda$1((MessageTapHandler) obj);
                break;
            case 25:
                oy10 oy10Var = ((py10) obj).h;
                op3 op3Var = oy10Var.b;
                kgx kgxVar = oy10.e[0];
                op3Var.b(null);
                Handler handler = oy10Var.c;
                handler.removeCallbacksAndMessages(null);
                handler.postDelayed(new my10(oy10Var, i2), 60000L);
                break;
            case 26:
                j220 j220Var = (j220) obj;
                com.yandex.messaging.internal.images.b bVar3 = j220Var.w;
                z83.b(null, ((Handler) bVar3.b.get()).getLooper(), Looper.myLooper());
                j220Var.b = ((el21) bVar3.c.get()).f(j220Var);
                break;
            case 27:
                MobilePaymentSelectContactFragment.onResume$lambda$7((MobilePaymentSelectContactFragment) obj);
                break;
            case 28:
                MtAddressMapPickerFragment.bindViewsInFields$lambda$0((MtAddressMapPickerFragment) obj);
                break;
            default:
                MtCheckoutModalView.onBackButtonClicked$default((MtCheckoutModalView) obj, null, 1, null);
                break;
        }
    }

    public /* synthetic */ fbz(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
