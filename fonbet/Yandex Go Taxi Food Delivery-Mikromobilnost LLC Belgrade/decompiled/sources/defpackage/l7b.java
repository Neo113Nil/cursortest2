package defpackage;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.k;
import com.yandex.go.payments.sbp.navigation.a;
import com.yandex.go.payments.superapp.payment.b;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.api.AIRequirementsCommentApi;
import com.yandex.go.support.web.CommonSupportWebView;
import com.yandex.go.ui.CircleLoadingImageView;
import com.yandex.messaging.internal.view.chat.c;
import com.yandex.messaging.internal.view.chat.e;
import com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerFragment;
import com.yandex.messaging.ui.statuses.ChoosePersonalStatusDialog;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.d;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.ui.RequestStatus$Data$Source;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationViewState$CodeState;
import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;
import com.ybsdk.widgets.common.CircleButtonsListView;
import com.ybsdk.widgets.common.chip.ChipListView;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.ComparisonItemView;
import ru.yandex.taxi.checkin.CheckInOnboardingModalView;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.web.CommonWebViewClient;

/* loaded from: classes15.dex */
public final /* synthetic */ class l7b implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l7b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        noh viewModelFactoryAsync_delegate$lambda$0;
        zy11 onAttachedToWindow$lambda$1;
        qa3 chipsAdapter_delegate$lambda$0;
        zy11 onUserStatusChosen$lambda$0;
        qa3 buttonsAdapter_delegate$lambda$0;
        int defaultImageSize_delegate$lambda$0;
        CodeConfirmationParams.HeaderImage headerImage;
        CodeConfirmationParams.HeaderImage headerImage2;
        View view;
        st41 domesticSslErrorHandler_delegate$lambda$0;
        zy11 _init_$lambda$0;
        int i = this.a;
        int i2 = 3;
        RequestStatus$Data$Source requestStatus$Data$Source = null;
        boolean z = false;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                n7b n7bVar = (n7b) obj;
                return n7bVar.b.l(n7bVar.a);
            case 1:
                return (xav) ((c) obj).w.get();
            case 2:
                viewModelFactoryAsync_delegate$lambda$0 = ChatThreadsContainerFragment.viewModelFactoryAsync_delegate$lambda$0((ChatThreadsContainerFragment) obj);
                return viewModelFactoryAsync_delegate$lambda$0;
            case 3:
                hab habVar = (hab) obj;
                if (habVar.f() > 0) {
                    habVar.notifyItemChanged(0);
                }
                return zy11Var;
            case 4:
                return ((ebb) obj).b.Y();
            case 5:
                m2y m2yVar = ((e) obj).A;
                ConstraintLayout constraintLayout = (ConstraintLayout) m2yVar.c;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) m2yVar.c;
                if (constraintLayout.getHeight() != 0) {
                    LayoutTransition layoutTransition = new LayoutTransition();
                    layoutTransition.enableTransitionType(4);
                    layoutTransition.enableTransitionType(2);
                    layoutTransition.enableTransitionType(3);
                    z = true;
                    PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, constraintLayout2.getHeight(), 0.0f);
                    Property property = View.ALPHA;
                    layoutTransition.setAnimator(2, ObjectAnimator.ofPropertyValuesHolder(null, ofFloat, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 0.0f, 1.0f)));
                    layoutTransition.setAnimator(3, ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 1.0f, 0.0f)));
                    constraintLayout2.setLayoutTransition(layoutTransition);
                }
                return Boolean.valueOf(z);
            case 6:
                a aVar = (a) obj;
                b bVar = aVar.G;
                String str = ((veb) aVar.n()).a;
                u32.a.getClass();
                return bVar.a(str, t32.b, new l90(), uba0.g);
            case 7:
                onAttachedToWindow$lambda$1 = CheckInOnboardingModalView.onAttachedToWindow$lambda$1((CheckInOnboardingModalView) obj);
                return onAttachedToWindow$lambda$1;
            case 8:
                on2 on2Var = (on2) ((fjb) obj).a.d;
                sjh sjhVar = uyj.a;
                return new com.yandex.go.masstransit.sdk.client_api.a(on2Var, mdh.b);
            case 9:
                return ((k) obj).b.a();
            case 10:
                ((com.yandex.go.masstransit.sdk.checkout.impl.checkout.a) obj).r(new qu(9));
                return zy11Var;
            case 11:
                r0 r0Var = ((d) obj).L;
                bob bobVar = new bob(null, false);
                r0Var.getClass();
                r0Var.m(null, bobVar);
                return zy11Var;
            case 12:
                chipsAdapter_delegate$lambda$0 = ChipListView.chipsAdapter_delegate$lambda$0((ChipListView) obj);
                return chipsAdapter_delegate$lambda$0;
            case 13:
                onUserStatusChosen$lambda$0 = ChoosePersonalStatusDialog.onUserStatusChosen$lambda$0((ChoosePersonalStatusDialog) obj);
                return onUserStatusChosen$lambda$0;
            case 14:
                ((ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.c) obj).d.a.g(zy11Var);
                return zy11Var;
            case 15:
                buttonsAdapter_delegate$lambda$0 = CircleButtonsListView.buttonsAdapter_delegate$lambda$0((CircleButtonsListView) obj);
                return buttonsAdapter_delegate$lambda$0;
            case 16:
                defaultImageSize_delegate$lambda$0 = CircleLoadingImageView.defaultImageSize_delegate$lambda$0((CircleLoadingImageView) obj);
                return Integer.valueOf(defaultImageSize_delegate$lambda$0);
            case 17:
                return (dw) ((jg9) obj).b.get();
            case 18:
                ((e5c) obj).d.getClass();
                sjh sjhVar2 = uyj.a;
                return o400.a;
            case 19:
                return new ddc0(((e8c) obj).a);
            case 20:
                i9c i9cVar = (i9c) obj;
                CodeConfirmationParams.HeaderText header = i9cVar.getParams().getHeader();
                CodeConfirmationParams params = i9cVar.getParams();
                CodeConfirmationParams.Authorization authorization = params instanceof CodeConfirmationParams.Authorization ? (CodeConfirmationParams.Authorization) params : null;
                Text headerSubtitle = authorization != null ? authorization.getHeaderSubtitle() : null;
                CodeConfirmationParams params2 = i9cVar.getParams();
                if (params2 instanceof CodeConfirmationParams.Authorization) {
                    headerImage2 = ((CodeConfirmationParams.Authorization) params2).getHeaderImage();
                } else {
                    if (!(params2 instanceof CodeConfirmationParams.ChangePhone)) {
                        headerImage = null;
                        OtpResponseDataEntity e = i9cVar.e();
                        return new com.ybsdk.screens.registration.codeconfirmation.presentation.a(header, headerSubtitle, headerImage, e == null ? new r8j0(e, requestStatus$Data$Source, 14) : new t8j0(), System.currentTimeMillis(), System.currentTimeMillis(), 0, null, "", null, i9cVar.getParams().getAvatarSignOutEnabled(), i9cVar.getParams().getSignOutEnabled(), false, CodeConfirmationViewState$CodeState.DEFAULT);
                    }
                    headerImage2 = ((CodeConfirmationParams.ChangePhone) params2).getHeaderImage();
                }
                headerImage = headerImage2;
                OtpResponseDataEntity e2 = i9cVar.e();
                return new com.ybsdk.screens.registration.codeconfirmation.presentation.a(header, headerSubtitle, headerImage, e2 == null ? new r8j0(e2, requestStatus$Data$Source, 14) : new t8j0(), System.currentTimeMillis(), System.currentTimeMillis(), 0, null, "", null, i9cVar.getParams().getAvatarSignOutEnabled(), i9cVar.getParams().getSignOutEnabled(), false, CodeConfirmationViewState$CodeState.DEFAULT);
            case 21:
                owy0 owy0Var = (owy0) obj;
                if (owy0Var != null) {
                    owy0Var.a();
                }
                return zy11Var;
            case 22:
                sls slsVar = ((androidx.compose.foundation.d) obj).R;
                if (slsVar != null) {
                    slsVar.invoke();
                }
                return Boolean.TRUE;
            case 23:
                on2 on2Var2 = ((com.yandex.go.requirements.comment.summary.ui.v3.data.a) obj).a;
                on2Var2.getClass();
                return (AIRequirementsCommentApi) on2Var2.a(GoApiName.TaxiV4, AIRequirementsCommentApi.class);
            case 24:
                ((com.yandex.go.support.web.e) obj).r(new foc(i2));
                return zy11Var;
            case 25:
                view = ((CommonSupportWebView) obj).webViewWrapper;
                return view;
            case 26:
                ((sqc) obj).O0.run();
                return zy11Var;
            case 27:
                domesticSslErrorHandler_delegate$lambda$0 = CommonWebViewClient.domesticSslErrorHandler_delegate$lambda$0((CommonWebViewClient) obj);
                return domesticSslErrorHandler_delegate$lambda$0;
            case 28:
                return Float.valueOf(r0.heightPixels / ((avj0) ((zuj0) ((an8) obj).c)).d().density);
            default:
                _init_$lambda$0 = ComparisonItemView._init_$lambda$0((ComparisonItemView) obj);
                return _init_$lambda$0;
        }
    }
}
