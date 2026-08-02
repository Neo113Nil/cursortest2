package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import com.yandex.go.address.models.FavoriteAddressRequest;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.address.models.a;
import com.yandex.go.address.models.c;
import com.yandex.go.payments.data.model.FastshiftAccountDto;
import com.yandex.go.payments.data.model.VerifyStrategy;
import com.yandex.go.payments.data.model.p;
import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.FastshiftAccount;
import com.yandex.go.payments.data.model.response.k0;
import com.yandex.payment.sdk.flex.api.dtotransport.FTTransportKind;
import com.yandex.payment.sdk.flex.api.dtotransport.RestMethod;
import com.yandex.plus.pay.data.mb.dto.FamilyRoleDto;
import defpackage.khp;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final /* synthetic */ class d6p implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ d6p(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return RestMethod.Companion.serializer();
            case 1:
                return new p53(auu0.a, 0);
            case 2:
                return new k8u(auu0.a, s6p.a, 1);
            case 3:
                return new k8u(auu0.a, wum.a, 1);
            case 4:
                return new k8u(auu0.a, qke.n(s6p.a), 1);
            case 5:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 6:
                return new k8u(auu0.a, t5p.a, 1);
            case 7:
                return new k8u(auu0.a, lis0.a, 1);
            case 8:
                return new k8u(auu0.a, t5p.a, 1);
            case 9:
                return new o4o("com.yandex.fintechsdk.core.network.api.request.RestMethod", (Enum[]) com.yandex.fintechsdk.core.network.api.request.RestMethod.values());
            case 10:
                return new k8u(auu0.a, t5p.a, 1);
            case 11:
                return new k8u(auu0.a, qke.n(lis0.a), 1);
            case 12:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 13:
                return new k8u(auu0.a, wum.a, 1);
            case 14:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 15:
                return new k8u(auu0.a, wum.a, 1);
            case 16:
                return new p53(auu0.a, 0);
            case 17:
                return new p53(auu0.a, 0);
            case 18:
                return new p53(auu0.a, 0);
            case 19:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 20:
                return new o4o("com.yandex.payment.sdk.flex.api.dtotransport.FTTransportKind", (Enum[]) FTTransportKind.values());
            case 21:
                return new p53(auu0.a, 0);
            case 22:
                return vez0.g("com.yandex.plus.pay.data.mb.dto.FamilyRoleDto", FamilyRoleDto.values(), new String[]{"PARENT", "CHILD", null}, new Annotation[][]{null, null, null});
            case 23:
                k0 k0Var = FastshiftAccount.Companion;
                return Card.VerifyStrategy.Companion.serializer();
            case 24:
                p pVar = FastshiftAccountDto.Companion;
                return VerifyStrategy.Companion.serializer();
            case 25:
                a aVar = FavoriteAddress.Companion;
                return PlaceType.Companion.serializer();
            case 26:
                a aVar2 = FavoriteAddress.Companion;
                return FavoriteAddressDatumType.Companion.serializer();
            case 27:
                return vez0.g("com.yandex.go.address.models.FavoriteAddressDatumType", FavoriteAddressDatumType.values(), new String[]{"regular", "geo_point"}, new Annotation[][]{null, null});
            case 28:
                c cVar = FavoriteAddressRequest.Companion;
                return PlaceType.Companion.serializer();
            default:
                ghp ghpVar = khp.a.Companion;
                return new p53(lrk0.e, 0);
        }
    }
}
