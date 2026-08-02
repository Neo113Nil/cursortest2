package defpackage;

import android.animation.AnimatorSet;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.room.util.a;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.places.base.ui.base_old.BaseOrganizationDiscoveryModalView;
import com.yandex.go.places.base.ui.modals.BasePlacesModalView;
import com.yandex.go.places.impl.ui.organizations.base.BaseOrganizationsModalView;
import com.yandex.go.taxi.order.communications.f;
import com.yandex.messaging.core.db.AppDatabaseRoom;
import com.yandex.messaging.core.db.AppDatabaseRoom_Impl;
import com.yandex.messaging.navigation.BaseMessengerFragment;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.api.AutoTopupShowOnly;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.internal.domain.entities.IntroductionItemEntity;
import com.ybsdk.feature.autotopup.internal.domain.entities.IntroductionScreenEntity;
import com.ybsdk.feature.autotopup.internal.presentation.instruction.AutoTopupInstructionFragment;
import com.ybsdk.feature.autotopup.internal.presentation.instruction.AutoTopupInstructionParams;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupLogoResultStatus;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultFragment;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultParams;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v1.AutoTopupSetupParams;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.rt.ebs.cryptosdk.presentation.base.BaseActivity;
import ru.rt.ebs.cryptosdk.presentation.base.BaseFragment;
import ru.yandex.taxi.altpins.walking_route.fragment.AltpinWalkingRouteFragment;
import ru.yandex.taxi.logistics.sdk.ui.component.icon.b;
import ru.yandex.taxi.plus.badge.AmountTextView;

/* loaded from: classes3.dex */
public final /* synthetic */ class f02 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f02(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onViewCreated$lambda$1$0;
        Rect _init_$lambda$0;
        zy11 viewBinding$lambda$1$lambda$0;
        zy11 onViewCreated$lambda$2;
        wy3 wy3Var;
        vc5 viewModel_delegate$lambda$0;
        n4u0 themeType_delegate$lambda$2;
        zy11 viewBinding$lambda$2$lambda$0;
        vc5 viewModel_delegate$lambda$02;
        ids permissionManager_delegate$lambda$0;
        uc5 viewModel_delegate$lambda$03;
        int anchorHeight_delegate$lambda$0;
        int cornersRadius;
        ez20 slideableMode_delegate$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$1$0 = AltpinWalkingRouteFragment.onViewCreated$lambda$1$0((AltpinWalkingRouteFragment) obj);
                return onViewCreated$lambda$1$0;
            case 1:
                _init_$lambda$0 = AmountTextView._init_$lambda$0((AmountTextView) obj);
                return _init_$lambda$0;
            case 2:
                rzo.D((ac2) obj);
                return zy11Var;
            case 3:
                return ((aly0) obj).data();
            case 4:
                ((rf2) obj).d = null;
                return zy11Var;
            case 5:
                Long l = (Long) a.b(((AppDatabaseRoom_Impl) ((AppDatabaseRoom) obj)).g().a, true, false, new xuv(26));
                z83.i();
                long longValue = l != null ? l.longValue() : 1L;
                dt2 dt2Var = new dt2();
                dt2Var.a = longValue;
                return dt2Var;
            case 6:
                return (String) ((b) obj).G.getValue();
            case 7:
                viewBinding$lambda$1$lambda$0 = AutoTopupInstructionFragment.getViewBinding$lambda$1$lambda$0((AutoTopupInstructionFragment) obj);
                return viewBinding$lambda$1$lambda$0;
            case 8:
                AutoTopupInstructionParams autoTopupInstructionParams = (AutoTopupInstructionParams) obj;
                IntroductionScreenEntity introductionScreen = autoTopupInstructionParams.getIntroductionScreen();
                ThemedImageUrlEntity image = introductionScreen.getImage();
                String title = introductionScreen.getTitle();
                ActionButtonEntity button = introductionScreen.getButton();
                List<IntroductionItemEntity> items = introductionScreen.getItems();
                String autoTopupId = autoTopupInstructionParams.getAutoTopupId();
                String twoFactorScreenTitle = autoTopupInstructionParams.getTwoFactorScreenTitle();
                Boolean autoFundEnabled = autoTopupInstructionParams.getAutoFundEnabled();
                AutoTopupInstructionParams.SaveAutoTopupInfoEntity infoEntity = autoTopupInstructionParams.getInfoEntity();
                String agreementId = infoEntity.getAgreementId();
                String amount = infoEntity.getAmount();
                String threshold = infoEntity.getThreshold();
                AutoTopupType autoTopupType = infoEntity.getAutoTopupType();
                AutoTopupInstructionParams.SaveAutoTopupMe2Me paymentMethod = infoEntity.getPaymentMethod();
                return new aw3(image, title, button, items, autoTopupId, new j4w(agreementId, amount, threshold, new e5a0(paymentMethod.getTitle(), paymentMethod.getDescription(), new d5a0(paymentMethod.getLogo(), false), new d5a0(paymentMethod.getSelectedLogo(), false), paymentMethod.getYbSuggestId(), paymentMethod.getYbId(), null, null, null, null, null), autoTopupType), twoFactorScreenTitle, null, false, autoFundEnabled);
            case 9:
                onViewCreated$lambda$2 = AutoTopupResultFragment.onViewCreated$lambda$2((AutoTopupResultFragment) obj);
                return onViewCreated$lambda$2;
            case 10:
                AutoTopupResultParams autoTopupResultParams = (AutoTopupResultParams) obj;
                if (autoTopupResultParams instanceof AutoTopupResultParams.NoPolling) {
                    AutoTopupResultParams.NoPolling noPolling = (AutoTopupResultParams.NoPolling) autoTopupResultParams;
                    ThemedImageUrlEntity imageUrl = noPolling.getImageUrl();
                    Text.Constant i2 = g8e.i(Text.Companion, noPolling.getTitle());
                    String description = noPolling.getDescription();
                    Text.Constant constant = description != null ? new Text.Constant(description) : null;
                    ActionButtonEntity primaryButton = noPolling.getPrimaryButton();
                    ActionButtonEntity actionButtonEntity = new ActionButtonEntity(primaryButton.getText(), primaryButton.getAction(), false, null, 12, null);
                    ActionButtonEntity secondaryButton = noPolling.getSecondaryButton();
                    wy3Var = new wy3(imageUrl, i2, constant, actionButtonEntity, secondaryButton != null ? new ActionButtonEntity(secondaryButton.getText(), secondaryButton.getAction(), false, null, 12, null) : null, AutoTopupLogoResultStatus.SUCCESS, noPolling.getResultAnalyticsTypes(), 896);
                } else if (autoTopupResultParams instanceof AutoTopupResultParams.Polling) {
                    AutoTopupResultParams.Polling polling = (AutoTopupResultParams.Polling) autoTopupResultParams;
                    ThemedImageUrlEntity imageUrl2 = polling.getImageUrl();
                    Text.Constant i3 = g8e.i(Text.Companion, polling.getTitle());
                    String description2 = polling.getDescription();
                    wy3Var = new wy3(imageUrl2, i3, description2 != null ? new Text.Constant(description2) : null, polling.getPrimaryButton(), null, AutoTopupLogoResultStatus.PROCESSING, polling.getResultAnalyticsTypes(), 896);
                } else {
                    if (!(autoTopupResultParams instanceof AutoTopupResultParams.ShowPaymentInfo)) {
                        w511.b();
                        return null;
                    }
                    wy3Var = new wy3(null, null, null, null, null, AutoTopupLogoResultStatus.HIDDEN, null, 768);
                }
                return wy3Var;
            case 11:
                t8j0 t8j0Var = new t8j0();
                AutoTopupShowOnly autoTopupShowOnly = ((AutoTopupSetupParams) obj).getAutoTopupShowOnly();
                EmptyList emptyList = EmptyList.a;
                return new j04(t8j0Var, autoTopupShowOnly, false, emptyList, emptyList, null, null, null, null, null, null, null, "", null, null, null, null);
            case 12:
                ((th4) obj).E0();
                return zy11Var;
            case 13:
                h0w h0wVar = ((as4) obj).b.a;
                return new ru.yandex.taxi.logistics.sdk.promotions.api.a((v5c0) ((kxb0) h0wVar.b).get(), (st2) ((xvf0) h0wVar.c).get());
            case 14:
                h0w h0wVar2 = ((bs4) obj).b.a;
                return new ru.yandex.taxi.logistics.sdk.promotions.api.a((v5c0) ((kxb0) h0wVar2.b).get(), (st2) ((xvf0) h0wVar2.c).get());
            case 15:
                viewModel_delegate$lambda$0 = BaseActivity.viewModel_delegate$lambda$0((BaseActivity) obj);
                return viewModel_delegate$lambda$0;
            case 16:
                nx4 nx4Var = (nx4) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(200L);
                animatorSet.setInterpolator(new LinearInterpolator());
                animatorSet.playTogether(kotlin.collections.a.m0(nx4Var.a(), scc.g(nx4Var.d, nx4Var.e, nx4Var.f)));
                return animatorSet;
            case 17:
                com.yandex.messaging.ui.chatlist.b bVar = (com.yandex.messaging.ui.chatlist.b) obj;
                p1b p1bVar = bVar.Q;
                return new d4b(bVar.N, (d820) p1bVar.a, (arg) p1bVar.b, bVar.a0());
            case 18:
                f fVar = (f) obj;
                LottieAnimationView lottieAnimationView = new LottieAnimationView(fVar.O.getContext());
                int i4 = fVar.T;
                lottieAnimationView.setLayoutParams(new ViewGroup.LayoutParams(i4, i4));
                lottieAnimationView.setRepeatMode(1);
                lottieAnimationView.setRepeatCount(-1);
                return lottieAnimationView;
            case 19:
                themeType_delegate$lambda$2 = BaseDivContextMvvmFragment.themeType_delegate$lambda$2((BaseDivContextMvvmFragment) obj);
                return themeType_delegate$lambda$2;
            case 20:
                viewBinding$lambda$2$lambda$0 = BaseDivFragment.getViewBinding$lambda$2$lambda$0((BaseDivFragment) obj);
                return viewBinding$lambda$2$lambda$0;
            case 21:
                ((com.yandex.messaging.input.b) obj).f.d();
                return zy11Var;
            case 22:
                ((i15) obj).N2.d();
                return zy11Var;
            case 23:
                viewModel_delegate$lambda$02 = BaseFragment.viewModel_delegate$lambda$0((BaseFragment) obj);
                return viewModel_delegate$lambda$02;
            case 24:
                permissionManager_delegate$lambda$0 = BaseMessengerFragment.permissionManager_delegate$lambda$0((BaseMessengerFragment) obj);
                return permissionManager_delegate$lambda$0;
            case 25:
                viewModel_delegate$lambda$03 = BaseMvvmFragment.viewModel_delegate$lambda$0((BaseMvvmFragment) obj);
                return viewModel_delegate$lambda$03;
            case 26:
                anchorHeight_delegate$lambda$0 = BaseOrganizationDiscoveryModalView.anchorHeight_delegate$lambda$0((BaseOrganizationDiscoveryModalView) obj);
                return Integer.valueOf(anchorHeight_delegate$lambda$0);
            case 27:
                cornersRadius = ((BaseOrganizationsModalView) obj).getCornersRadius();
                return Integer.valueOf(cornersRadius);
            case 28:
                slideableMode_delegate$lambda$0 = BasePlacesModalView.slideableMode_delegate$lambda$0((fz20) obj);
                return slideableMode_delegate$lambda$0;
            default:
                return ((com.yandex.go.places.webview.impl.navigation.common.b) obj).Y().a();
        }
    }
}
