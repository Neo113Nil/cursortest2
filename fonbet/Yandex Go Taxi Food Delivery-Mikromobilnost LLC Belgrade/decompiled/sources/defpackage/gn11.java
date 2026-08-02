package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.dto.response.FlexScreenType;
import com.yandex.go.dto.response.UnavailabilityAction$OpenFlexScreenAction;
import com.yandex.go.dto.response.UnavailabilityAction$OpenSummaryAddress;
import com.yandex.go.dto.response.a2;
import com.yandex.go.dto.response.c2;
import com.yandex.go.dto.response.x1;
import com.yandex.go.dto.response.y1;
import com.yandex.go.experiment.UserPhotoUploadingExperiment;
import com.yandex.go.experiment.UserPhotoUploadingExperiment$NotificationParameters$$serializer;
import com.yandex.go.experiment.c;
import com.yandex.go.flex.main_screen.presentation.actions.UpdateMainSidePagerStateAction;
import com.yandex.go.flex.main_screen.presentation.actions.UpdateSuperappMainSectionsStateAction;
import com.yandex.go.mainscreen.superapp.api.sidepager.MainSidePagerSidePage;
import com.yandex.go.suggest.impl.data.flex.actions.UpdateSearchSectionsStateAction;
import com.yandex.go.suggest.impl.data.flex.actions.UpdateSearchSectionsStateAction$QuerySectionInfo$$serializer;
import com.yandex.go.ugc.entities.UGCItemExperiment;
import com.yandex.go.ugc.entities.b;
import com.yandex.go.universal_qr_scanner.experiments.config.UniversalQrScannerConfigExperiment;
import com.yandex.go.universal_qr_scanner.experiments.config.d;
import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment;
import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment$PlateColor$LinearGradient;
import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment$UserProfileStatusParams$$serializer;
import com.yandex.go.user_profile.fullscreen.models.a;
import com.yandex.go.zone.dto.objects.r6;
import com.yandex.go.zone.dto.objects.s6;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;
import ru.yandex.taxi.web.deeplink.e;

/* loaded from: classes9.dex */
public final /* synthetic */ class gn11 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ gn11(uc ucVar) {
        this.a = 20;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return vez0.g("ru.yandex.taxi.communications.api.dto.TypedContentWidget.Type", TypedContentWidget.Type.values(), new String[]{Constants.SMALL, Constants.LARGE}, new Annotation[][]{null, null});
            case 1:
                return 15;
            case 2:
                return 25;
            case 3:
                sn11 sn11Var = yn11.Companion;
                return new p53(qke.n(mn11.Companion.serializer()), 0);
            case 4:
                qo11 qo11Var = ro11.Companion;
                return new p53(qke.n(fo11.Companion.serializer()), 0);
            case 5:
                qo11 qo11Var2 = ro11.Companion;
                return new p53(auu0.a, 0);
            case 6:
                return new bq11(null, null, null, null, null, null, null, null, null, null, 32767);
            case 7:
                b bVar = UGCItemExperiment.Companion;
                return new p53(e.a, 0);
            case 8:
                b bVar2 = UGCItemExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 9:
                return new o4o("com.yandex.go.dto.response.UnavailabilityAction.None", x1.INSTANCE, new Annotation[0]);
            case 10:
                y1 y1Var = UnavailabilityAction$OpenFlexScreenAction.Companion;
                return FlexScreenType.Companion.serializer();
            case 11:
                a2 a2Var = UnavailabilityAction$OpenSummaryAddress.Companion;
                return UnavailabilityAction$OpenSummaryAddress.FocusField.Companion.serializer();
            case 12:
                return new o4o("com.yandex.go.dto.response.UnavailabilityAction.OpenTariffCardAction", c2.INSTANCE, new Annotation[0]);
            case 13:
                d dVar = UniversalQrScannerConfigExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 14:
                return new o4o("com.yandex.go.zone.dto.objects.Unknown", r6.INSTANCE, new Annotation[0]);
            case 15:
                return new o4o("com.yandex.go.zone.dto.objects.UnsupportedOrderPopup", s6.INSTANCE, new Annotation[0]);
            case 16:
                com.yandex.go.flex.main_screen.presentation.actions.d dVar2 = UpdateMainSidePagerStateAction.Companion;
                return MainSidePagerSidePage.Companion.serializer();
            case 17:
                return UpdateMainSidePagerStateAction.Companion.serializer();
            case 18:
                com.yandex.go.suggest.impl.data.flex.actions.d dVar3 = UpdateSearchSectionsStateAction.Companion;
                return new p53(UpdateSearchSectionsStateAction$QuerySectionInfo$$serializer.INSTANCE, 0);
            case 19:
                return UpdateSuperappMainSectionsStateAction.Companion.serializer();
            case 20:
                return null;
            case 21:
                return vez0.g("ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName", UserCardProfileName.values(), new String[]{"yandex_default", "yango_com_dh1", "yandex_com_dh2", "yango_com"}, new Annotation[][]{null, null, null, null});
            case 22:
                c cVar = UserPhotoUploadingExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 23:
                c cVar2 = UserPhotoUploadingExperiment.Companion;
                return new p53(UserPhotoUploadingExperiment$NotificationParameters$$serializer.INSTANCE, 0);
            case 24:
                a aVar = UserProfileExperiment.Companion;
                return new p53(UserProfileExperiment$UserProfileStatusParams$$serializer.INSTANCE, 0);
            case 25:
                a aVar2 = UserProfileExperiment.Companion;
                return UserProfileExperiment.Type.Companion.serializer();
            case 26:
                a aVar3 = UserProfileExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 27:
                com.yandex.go.user_profile.fullscreen.models.c cVar3 = UserProfileExperiment$PlateColor$LinearGradient.Companion;
                return new p53(auu0.a, 0);
            case 28:
                com.yandex.go.user_profile.fullscreen.models.c cVar4 = UserProfileExperiment$PlateColor$LinearGradient.Companion;
                return new p53(nor.a, 0);
            default:
                return new o4o("com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment.PlateColor.Unsupported", com.yandex.go.user_profile.fullscreen.models.e.INSTANCE, new Annotation[0]);
        }
    }

    public /* synthetic */ gn11(int i) {
        this.a = i;
    }
}
