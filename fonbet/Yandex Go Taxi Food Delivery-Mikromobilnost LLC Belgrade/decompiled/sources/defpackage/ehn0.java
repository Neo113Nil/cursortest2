package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.yandex.go.scooters.discovery.ScootersDiscoveryModalView;
import com.yandex.go.scooters.driver_license_notification.ScootersDriverLicenseNotification;
import com.yandex.go.scooters.insurance.details.ScootersInsuranceDetailsModalView;
import com.yandex.go.scooters.insurance.suggest.d;
import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuActionDialogOpenReason;
import com.yandex.go.scooters.offers.v2.components.scooters.ScootersListComponent;
import com.yandex.go.scooters.offers.v2.newbie_guide.b;
import com.yandex.go.scooters.passes.data.e;
import com.yandex.go.scooters.passes.domain.h;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import com.yandex.go.scooters.photocontrol.camera_ui.photo_result.c;
import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionModalView;
import com.yandex.mapkit.styling.transportnavigation.TransportNavigationStyleProvider;
import java.util.List;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2ModalView;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.ScootersOrderSelectorView;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersNewControlPanelView;
import ru.yandex.taxi.scooters.presentation.feedback.newbie.ScootersFeedbackCardNewbieHeader;
import ru.yandex.taxi.scooters.presentation.finish_info.input.ScootersFinishInfoInputModalView;
import ru.yandex.taxi.scooters.presentation.finish_info.statistics.ScootersFinishInfoStatisticsCard;
import ru.yandex.taxi.scooters.presentation.share_location.ScootersShareLocationService;
import ru.yandex.taxi.scooters.presentation.share_location.a;
import ru.yandex.taxi.scooters.utils.ScootersVehicleActualPhotoButtonIconComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;
import ru.yandex.taxi.widget.text.method.LinkMovementMethod;

/* loaded from: classes13.dex */
public final /* synthetic */ class ehn0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ehn0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 _init_$lambda$3;
        View insetsType$lambda$0;
        zy11 _init_$lambda$0;
        List progressSteps_delegate$lambda$0;
        View insetsType$lambda$02;
        int i;
        LinkMovementMethod linkMovementMethod_delegate$lambda$0;
        zy11 showViewWithScooters$lambda$0;
        bys remainingButtonsRvAdapter_delegate$lambda$0;
        zy11 onAttachedToWindow$lambda$1;
        View O;
        View O2;
        a scootersShareLocationPresenter_delegate$lambda$0;
        zy11 onAttachedToWindow$lambda$2;
        zy11 iconByUrl$lambda$0;
        int i2 = this.a;
        int i3 = 9;
        int i4 = 0;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                _init_$lambda$3 = ScootersDetailedOrderV2ModalView._init_$lambda$3((ScootersDetailedOrderV2ModalView) obj);
                return _init_$lambda$3;
            case 1:
                insetsType$lambda$0 = ScootersDiscoveryModalView.insetsType$lambda$0((ScootersDiscoveryModalView) obj);
                return insetsType$lambda$0;
            case 2:
                _init_$lambda$0 = ScootersDriverLicenseNotification._init_$lambda$0((ScootersDriverLicenseNotification) obj);
                return _init_$lambda$0;
            case 3:
                progressSteps_delegate$lambda$0 = ScootersFeedbackCardNewbieHeader.progressSteps_delegate$lambda$0((ScootersFeedbackCardNewbieHeader) obj);
                return progressSteps_delegate$lambda$0;
            case 4:
                insetsType$lambda$02 = ScootersFinishInfoInputModalView.insetsType$lambda$0((ScootersFinishInfoInputModalView) obj);
                return insetsType$lambda$02;
            case 5:
                i = ((ScootersFinishInfoStatisticsCard) obj).statisticsItemWidthPx;
                return Integer.valueOf(i);
            case 6:
                linkMovementMethod_delegate$lambda$0 = ScootersInsuranceDetailsModalView.linkMovementMethod_delegate$lambda$0((lg21) obj);
                return linkMovementMethod_delegate$lambda$0;
            case 7:
                ((d) obj).r(new vkn0(21));
                return zy11Var;
            case 8:
                showViewWithScooters$lambda$0 = ScootersListComponent.showViewWithScooters$lambda$0((ScootersListComponent) obj);
                return showViewWithScooters$lambda$0;
            case 9:
                c0o0 c0o0Var = (c0o0) obj;
                if (!c0o0Var.t()) {
                    c0o0Var.F.b(vyn0.a);
                    c0o0Var.A((m950) c0o0Var.D.get(), new lzn0(new hzn0(ScootersMosRuActionDialogOpenReason.MOS_RU_STATE_BAR)), new b0o0(i4, c0o0Var));
                }
                return zy11Var;
            case 10:
                remainingButtonsRvAdapter_delegate$lambda$0 = ScootersNewControlPanelView.remainingButtonsRvAdapter_delegate$lambda$0((ScootersNewControlPanelView) obj);
                return remainingButtonsRvAdapter_delegate$lambda$0;
            case 11:
                b bVar = (b) obj;
                bVar.E.h();
                bVar.H.c.a.g(zy11Var);
                bVar.r(new pzn0(7));
                return zy11Var;
            case 12:
                ((r3o0) obj).a.getClass();
                return uyj.a;
            case 13:
                onAttachedToWindow$lambda$1 = ScootersOrderSelectorView.onAttachedToWindow$lambda$1((ScootersOrderSelectorView) obj);
                return onAttachedToWindow$lambda$1;
            case 14:
                return (dwn0) obj;
            case 15:
                ((h) obj).c.d(false);
                return zy11Var;
            case 16:
                ((com.yandex.go.scooters.passes.h) obj).r(new qu(i3));
                return zy11Var;
            case 17:
                return new fgo0((e) obj);
            case 18:
                ((gio0) ((iio0) obj)).a.r(new qu(i3));
                return zy11Var;
            case 19:
                View inflate = LayoutInflater.from(((c) obj).k).inflate(xjh0.scooters_photocontrol_photo_result_camera_layer, (ViewGroup) null, false);
                int i5 = n7h0.bottom_offset_guideline;
                Guideline guideline = (Guideline) cma1.O(i5, inflate);
                if (guideline != null) {
                    i5 = n7h0.check_btn;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i5, inflate);
                    if (buttonComponent != null) {
                        i5 = n7h0.check_group;
                        Group group = (Group) cma1.O(i5, inflate);
                        if (group != null) {
                            i5 = n7h0.legal_approve_text;
                            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i5, inflate);
                            if (robotoTextView != null) {
                                i5 = n7h0.legal_approve_title;
                                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i5, inflate);
                                if (robotoTextView2 != null) {
                                    i5 = n7h0.legal_link;
                                    RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i5, inflate);
                                    if (robotoTextView3 != null) {
                                        i5 = n7h0.mask_placeholder;
                                        ViewStub viewStub = (ViewStub) cma1.O(i5, inflate);
                                        if (viewStub != null && (O = cma1.O((i5 = n7h0.photo_result_buttons_bg), inflate)) != null) {
                                            i5 = n7h0.progress_bar;
                                            if (((CircularProgressBar) cma1.O(i5, inflate)) != null && (O2 = cma1.O((i5 = n7h0.progress_fog_dark), inflate)) != null) {
                                                i5 = n7h0.progress_group;
                                                Group group2 = (Group) cma1.O(i5, inflate);
                                                if (group2 != null) {
                                                    i5 = n7h0.take_new_pic_btn;
                                                    ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i5, inflate);
                                                    if (buttonComponent2 != null) {
                                                        i5 = n7h0.taken_pic;
                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i5, inflate);
                                                        if (appCompatImageView != null) {
                                                            i5 = n7h0.toolbar;
                                                            ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i5, inflate);
                                                            if (toolbarComponent != null) {
                                                                i5 = n7h0.top_border;
                                                                Guideline guideline2 = (Guideline) cma1.O(i5, inflate);
                                                                if (guideline2 != null) {
                                                                    return new sio0((ConstraintLayout) inflate, guideline, buttonComponent, group, robotoTextView, robotoTextView2, robotoTextView3, viewStub, O, O2, group2, buttonComponent2, appCompatImageView, toolbarComponent, guideline2);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
                return null;
            case 20:
                View inflate2 = LayoutInflater.from(((com.yandex.go.scooters.photocontrol.camera_ui.take_photo.b) obj).k).inflate(xjh0.scooters_photocontrol_take_photo_camera_layer, (ViewGroup) null, false);
                int i6 = n7h0.bottom_border;
                Guideline guideline3 = (Guideline) cma1.O(i6, inflate2);
                if (guideline3 != null) {
                    i6 = n7h0.detection_status;
                    ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i6, inflate2);
                    if (listItemComponent != null) {
                        i6 = n7h0.mask_placeholder;
                        ViewStub viewStub2 = (ViewStub) cma1.O(i6, inflate2);
                        if (viewStub2 != null) {
                            i6 = n7h0.take_photo_btn;
                            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) cma1.O(i6, inflate2);
                            if (appCompatImageButton != null) {
                                i6 = n7h0.toolbar;
                                ToolbarComponent toolbarComponent2 = (ToolbarComponent) cma1.O(i6, inflate2);
                                if (toolbarComponent2 != null) {
                                    i6 = n7h0.top_border;
                                    Guideline guideline4 = (Guideline) cma1.O(i6, inflate2);
                                    if (guideline4 != null) {
                                        return new ejo0((ConstraintLayout) inflate2, guideline3, listItemComponent, viewStub2, appCompatImageButton, toolbarComponent2, guideline4);
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i6)));
                return null;
            case 21:
                ((cso0) obj).r(new pzn0(29));
                return zy11Var;
            case 22:
                return new TransportNavigationStyleProvider(((juo0) obj).a).routeViewStyleProvider();
            case 23:
                ((a) obj).a.getClass();
                return uyj.a;
            case 24:
                scootersShareLocationPresenter_delegate$lambda$0 = ScootersShareLocationService.scootersShareLocationPresenter_delegate$lambda$0((ScootersShareLocationService) obj);
                return scootersShareLocationPresenter_delegate$lambda$0;
            case 25:
                ((ej1) obj).r(new tyo0(3));
                return zy11Var;
            case 26:
                com.yandex.go.scooters.passes.super_pass.grace.state_bar.a aVar = (com.yandex.go.scooters.passes.super_pass.grace.state_bar.a) obj;
                aVar.A((m950) aVar.D.get(), new veo0(bei.N, ScootersPassesFromScreen.DISCOVERY, null), sy60.Q2);
                return zy11Var;
            case 27:
                onAttachedToWindow$lambda$2 = ScootersTariffFixSelectionModalView.onAttachedToWindow$lambda$2((ScootersTariffFixSelectionModalView) obj);
                return onAttachedToWindow$lambda$2;
            case 28:
                ((b5p0) obj).r(new tyo0(6));
                return zy11Var;
            default:
                iconByUrl$lambda$0 = ScootersVehicleActualPhotoButtonIconComponent.setIconByUrl$lambda$0((ScootersVehicleActualPhotoButtonIconComponent) obj);
                return iconByUrl$lambda$0;
        }
    }
}
