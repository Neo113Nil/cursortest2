package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import com.yandex.go.payments.addmethod.data.model.BindPaymentMethodRequest;
import com.yandex.go.payments.addmethod.data.model.UserDataField$$serializer;
import com.yandex.go.payments.addmethod.data.model.f0;
import com.yandex.go.payments.cards.data.model.Binding;
import com.yandex.go.payments.cards.data.model.Verification$$serializer;
import com.yandex.go.payments.cards.data.model.b;
import com.yandex.go.places.impl.data.entities.network.bookings.BookingDto;
import com.yandex.go.places.impl.data.entities.network.bookings.BookingSource;
import com.yandex.go.places.impl.data.entities.network.bookings.BookingState;
import com.yandex.go.places.impl.data.entities.network.bookings.a;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$OpenMoreActionItemDto$$serializer;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonActionDto$OpenMoreActions;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonDto;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonDto$$serializer;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonSize;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonType;
import com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelContentDto;
import com.yandex.go.places.models.data.entities.network.bottom_panel.d;
import com.yandex.go.places.models.data.entities.network.bottom_panel.l;
import com.yandex.go.places.models.data.entities.network.bottom_panel.m;
import com.yandex.go.slot.dto.i;
import com.yandex.go.zone.dto.objects.Branding;
import com.yandex.go.zone.dto.objects.BrandingCashbackStyle;
import com.yandex.go.zone.dto.objects.BrandingType;
import com.yandex.go.zone.dto.objects.BrandingValues;
import com.yandex.go.zone.dto.objects.h;
import com.yandex.go.zone.dto.objects.j;
import com.yandex.messaging.core.net.entities.BackendConfig;
import java.lang.annotation.Annotation;
import java.util.UUID;
import ru.yandex.taxi.common_models.net.map_object.BubbleFontStyle;
import ru.yandex.taxi.eatskit.dto.BleError;
import ru.yandex.taxi.eatskit.dto.BleErrorCode;
import ru.yandex.taxi.eatskit.dto.BluetoothError;
import ru.yandex.taxi.net.taxi.dto.response.BlockedUserTypeDto;

/* loaded from: classes13.dex */
public final /* synthetic */ class av5 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ av5(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                f0 f0Var = BindPaymentMethodRequest.Companion;
                return new p53(e6m.a, 0);
            case 2:
                f0 f0Var2 = BindPaymentMethodRequest.Companion;
                return new p53(UserDataField$$serializer.INSTANCE, 0);
            case 3:
                b bVar = Binding.Companion;
                return new p53(Verification$$serializer.INSTANCE, 0);
            case 4:
                return vez0.g("ru.yandex.taxi.eatskit.dto.BleError", BleError.values(), new String[]{"notConnected", "writeError", "unknown"}, new Annotation[][]{null, null, null});
            case 5:
                return vez0.g("ru.yandex.taxi.eatskit.dto.BleErrorCode", BleErrorCode.values(), new String[]{"permissionError", "connectionFailed", "disconnected"}, new Annotation[][]{null, null, null});
            case 6:
                r36 r36Var = s36.Companion;
                return BlockedUserTypeDto.Companion.serializer();
            case 7:
                return vez0.g("ru.yandex.taxi.net.taxi.dto.response.BlockedUserTypeDto", BlockedUserTypeDto.values(), new String[]{"id", "phone"}, new Annotation[][]{null, null});
            case 8:
                return vez0.g("ru.yandex.taxi.eatskit.dto.BluetoothError", BluetoothError.values(), new String[]{"notSupported", "userDenied", "alreadyEnabled", "unknown"}, new Annotation[][]{null, null, null, null});
            case 9:
                return new mzz(128);
            case 10:
                return BodyAlign.Start;
            case 11:
                a aVar = BookingDto.Companion;
                return BookingSource.Companion.serializer();
            case 12:
                a aVar2 = BookingDto.Companion;
                return BookingState.Companion.serializer();
            case 13:
                return vez0.g("com.yandex.go.places.impl.data.entities.network.bookings.BookingSource", BookingSource.values(), new String[]{"maps", "ultima", "fitmost", null}, new Annotation[][]{null, null, null, null});
            case 14:
                return vez0.g("com.yandex.go.places.impl.data.entities.network.bookings.BookingState", BookingState.values(), new String[]{"confirmation", "pending", "completed", "cancelled", "created", "confirmed", "visited", "not_visited", null}, new Annotation[][]{null, null, null, null, null, null, null, null, null});
            case 15:
                return new o4o("com.yandex.go.slot.dto.BottomModalContentItemDto.Unknown", i.INSTANCE, new Annotation[0]);
            case 16:
                d dVar = BottomPanelButtonActionDto$OpenMoreActions.Companion;
                return new p53(BottomPanelButtonActionDto$OpenMoreActionItemDto$$serializer.INSTANCE, 0);
            case 17:
                l lVar = BottomPanelButtonDto.Companion;
                return BottomPanelButtonType.Companion.serializer();
            case 18:
                l lVar2 = BottomPanelButtonDto.Companion;
                return BottomPanelButtonSize.Companion.serializer();
            case 19:
                return vez0.g("com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonSize", BottomPanelButtonSize.values(), new String[]{"big", Constants.SMALL}, new Annotation[][]{null, null});
            case 20:
                return vez0.g("com.yandex.go.places.models.data.entities.network.bottom_panel.BottomPanelButtonType", BottomPanelButtonType.values(), new String[]{"main", "minor"}, new Annotation[][]{null, null});
            case 21:
                m mVar = BottomPanelContentDto.Companion;
                return new p53(BottomPanelButtonDto$$serializer.INSTANCE, 0);
            case 22:
                h hVar = Branding.Companion;
                return BrandingType.Companion.serializer();
            case 23:
                j jVar = BrandingCashbackStyle.Companion;
                return BrandingCashbackStyle.Style.Companion.serializer();
            case 24:
                return vez0.g("com.yandex.go.zone.dto.objects.BrandingCashbackStyle.Style", BrandingCashbackStyle.Style.values(), new String[]{"dark_gray", "light_gray", "light_gradient", "dark_gradient", BackendConfig.Restrictions.DISABLED}, new Annotation[][]{null, null, null, null, null});
            case 25:
                com.yandex.go.zone.dto.objects.l lVar3 = BrandingValues.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 26:
                ql6 ql6Var = rl6.Companion;
                return new p53(km6.e, 0);
            case 27:
                ql6 ql6Var2 = rl6.Companion;
                return new p53(km6.e, 0);
            case 28:
                ql6 ql6Var3 = rl6.Companion;
                return new eni0(qoi0.a(Float.class), nor.a);
            default:
                mm6 mm6Var = nm6.Companion;
                return BubbleFontStyle.Companion.serializer();
        }
    }
}
