package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.design.widget.qr.QrTargetView;
import com.yandex.go.scooters.debt.d;
import com.yandex.go.scooters.misc.common_dialog.ScootersCommonDialogModalView;
import com.yandex.go.scooters.misc.message.attention.ScootersAttentionMessageModalView;
import com.yandex.go.scooters.offers.v2.components.bottom.ScootersCardBottomComponent;
import com.yandex.go.scooters.offers.v2.domain.e;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.main.internal.screens.sbpAccount.SbpAccountInfoFragment;
import com.ybsdk.feature.savings.internal.screens.account.a;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsShelfView;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.c;
import com.ybsdk.feature.savings.internal.screens.goal.SavingsAccountGoalParams;
import com.ybsdk.feature.savings.internal.screens.lock.SavingsAccountLockParams;
import com.ybsdk.feature.savings.internal.screens.name.SavingsAccountNameParams;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.scheduleride.deeplink.b;
import ru.yandex.taxi.scooters.presentation.common.ui.ScootersCameraSlideableModalView;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.ScootersCompletionPhotoView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

/* loaded from: classes6.dex */
public final /* synthetic */ class j6m0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j6m0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 accountsRecyclerHelper$lambda$4;
        View stateForRender$lambda$4;
        zy11 renderIcon$lambda$0;
        RobotoTextView robotoTextView;
        zy11 offerDetails$lambda$0$0;
        p7n0 analytics_delegate$lambda$0;
        zy11 _init_$lambda$0;
        int i = this.a;
        int i2 = 9;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                SavingsAccountGoalParams savingsAccountGoalParams = (SavingsAccountGoalParams) obj;
                String title = savingsAccountGoalParams.getTitle();
                Text i3 = title != null ? g8e.i(Text.Companion, title) : unr0.h(Text.Companion, dzh0.ybsdk_savings_goal_title_default);
                String subtitle = savingsAccountGoalParams.getSubtitle();
                break;
            case 1:
                SavingsAccountLockParams savingsAccountLockParams = (SavingsAccountLockParams) obj;
                break;
            case 2:
                SavingsAccountNameParams savingsAccountNameParams = (SavingsAccountNameParams) obj;
                break;
            case 3:
                ((a) obj).d0(true);
                break;
            case 4:
                ((com.ybsdk.feature.savings.internal.screens.dashboard.a) obj).e0(false);
                break;
            case 5:
                ((c) obj).d0(false);
                break;
            case 6:
                accountsRecyclerHelper$lambda$4 = SavingsShelfView.accountsRecyclerHelper$lambda$4((SavingsShelfView) obj);
                break;
            case 7:
                stateForRender$lambda$4 = SbpAccountInfoFragment.getStateForRender$lambda$4((SbpAccountInfoFragment) obj);
                break;
            case 8:
                break;
            case 9:
                ((j) ((dfm0) ((kk5) obj).J).a).d("SBPOpenBankFailed.Modal.Tapped").m();
                break;
            case 10:
                lui0 lui0Var = (lui0) obj;
                break;
            case 11:
                ((b) obj).d.a();
                break;
            case 12:
                ((f28) obj).r(new qu(i2));
                break;
            case 13:
                break;
            case 14:
                ((iym0) obj).r(new qu(i2));
                break;
            case 15:
                renderIcon$lambda$0 = ScootersAttentionMessageModalView.renderIcon$lambda$0((ScootersAttentionMessageModalView) obj);
                break;
            case 16:
                ((y71) obj).r(new qu(i2));
                break;
            case 17:
                break;
            case 18:
                robotoTextView = ScootersCameraSlideableModalView.topTextHint_delegate$lambda$0((ScootersCameraSlideableModalView) obj);
                break;
            case 19:
                offerDetails$lambda$0$0 = ScootersCardBottomComponent.setOfferDetails$lambda$0$0((ScootersCardBottomComponent) obj);
                break;
            case 20:
                ((e) obj).a.getClass();
                break;
            case 21:
                analytics_delegate$lambda$0 = ScootersCommonDialogModalView.analytics_delegate$lambda$0((ScootersCommonDialogModalView) obj);
                break;
            case 22:
                ((fl5) obj).r(new v1n0(6));
                break;
            case 23:
                View inflate = LayoutInflater.from(((ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.b) obj).k).inflate(qrh0.scooters_completion_photo_result_camera_layer, (ViewGroup) null, false);
                int i4 = pfh0.bottom_offset_guideline;
                Guideline guideline = (Guideline) cma1.O(i4, inflate);
                if (guideline != null) {
                    i4 = pfh0.complete_btn;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i4, inflate);
                    if (buttonComponent != null) {
                        i4 = pfh0.completion_group;
                        Group group = (Group) cma1.O(i4, inflate);
                        if (group != null) {
                            i4 = pfh0.progress_bar;
                            if (((CircularProgressBar) cma1.O(i4, inflate)) != null) {
                                i4 = pfh0.progress_fog_dark;
                                if (((GoView) cma1.O(i4, inflate)) != null) {
                                    i4 = pfh0.progress_group;
                                    Group group2 = (Group) cma1.O(i4, inflate);
                                    if (group2 != null) {
                                        i4 = pfh0.take_new_pic_btn;
                                        ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i4, inflate);
                                        if (buttonComponent2 != null) {
                                            i4 = pfh0.taken_pic;
                                            GoImageView goImageView = (GoImageView) cma1.O(i4, inflate);
                                            if (goImageView != null) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
                break;
            case 24:
                ((ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.a) obj).r(new v1n0(7));
                break;
            case 25:
                _init_$lambda$0 = ScootersCompletionPhotoView._init_$lambda$0((ScootersCompletionPhotoView) obj);
                break;
            case 26:
                View inflate2 = LayoutInflater.from(((nan0) obj).k).inflate(qrh0.scooters_completion_take_photo_camera_layer, (ViewGroup) null, false);
                int i5 = pfh0.bottom_container;
                GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i5, inflate2);
                if (goFrameLayout != null) {
                    i5 = pfh0.bottom_offset_guideline;
                    Guideline guideline2 = (Guideline) cma1.O(i5, inflate2);
                    if (guideline2 != null) {
                        i5 = pfh0.completion_info;
                        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i5, inflate2);
                        if (listItemComponent != null) {
                            i5 = pfh0.detection_badge;
                            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i5, inflate2);
                            if (goLinearLayout != null) {
                                i5 = pfh0.detection_badge_icon;
                                GoImageView goImageView2 = (GoImageView) cma1.O(i5, inflate2);
                                if (goImageView2 != null && (r12 = cma1.O((i5 = pfh0.detection_badge_reserved_space), inflate2)) != null) {
                                    i5 = pfh0.detection_badge_text;
                                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i5, inflate2);
                                    if (robotoTextView2 != null) {
                                        i5 = pfh0.flash_light_btn;
                                        GoImageButton goImageButton = (GoImageButton) cma1.O(i5, inflate2);
                                        if (goImageButton != null) {
                                            i5 = pfh0.outline_hint;
                                            GoImageView goImageView3 = (GoImageView) cma1.O(i5, inflate2);
                                            if (goImageView3 != null) {
                                                i5 = pfh0.panorama_loading;
                                                CircularProgressBar circularProgressBar = (CircularProgressBar) cma1.O(i5, inflate2);
                                                if (circularProgressBar != null) {
                                                    i5 = pfh0.take_photo_btn;
                                                    GoImageButton goImageButton2 = (GoImageButton) cma1.O(i5, inflate2);
                                                    if (goImageButton2 != null) {
                                                        i5 = pfh0.target_bottom_fog;
                                                        if (((GoFrameLayout) cma1.O(i5, inflate2)) != null) {
                                                            i5 = pfh0.target_view;
                                                            QrTargetView qrTargetView = (QrTargetView) cma1.O(i5, inflate2);
                                                            if (qrTargetView != null) {
                                                                break;
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
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i5)));
                break;
            case 27:
                ((fl5) obj).r(new v1n0(13));
                break;
            case 28:
                ((d) obj).r(new v1n0(14));
                break;
            default:
                com.yandex.go.scooters.deposit.notification.a aVar = (com.yandex.go.scooters.deposit.notification.a) obj;
                if (aVar.u()) {
                    aVar.r(new qu(i2));
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
