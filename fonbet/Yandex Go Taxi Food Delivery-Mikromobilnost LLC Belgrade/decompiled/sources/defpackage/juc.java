package defpackage;

import com.yandex.go.overdraft.data.model.ComparisonType;
import com.yandex.go.payments.data.model.response.ComplementWallet;
import com.yandex.go.payments.data.model.response.y;
import com.yandex.go.sql.BaseDatabaseHelper;
import com.yandex.go.summary.navigation.e;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.response.CompanionHeader;
import com.yandex.go.taxi.order.models.api.response.b0;
import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$LegalInfo$Item$Type;
import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$StructureType;
import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$Vendor;
import defpackage.ouc;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.communications.api.dto.w;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes2.dex */
public final /* synthetic */ class juc implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ juc(e eVar) {
        this.a = 10;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        zy11 zy11Var3;
        switch (this.a) {
            case 0:
                luc lucVar = ouc.Companion;
                return new p53(w.a, 0);
            case 1:
                luc lucVar2 = ouc.Companion;
                return new p53(muc.a, 0);
            case 2:
                nuc nucVar = ouc.a.Companion;
                return Promotion.Type.Companion.serializer();
            case 3:
                b0 b0Var = CompanionHeader.Companion;
                return CompanionHeader.Animation.Companion.serializer();
            case 4:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.CompanionHeader.Animation", CompanionHeader.Animation.values(), new String[]{"radar_animation", "found_companion_animation", "walk_animation", "wave_animation", null}, new Annotation[][]{null, null, null, null, null});
            case 5:
                return vez0.g("com.yandex.go.overdraft.data.model.ComparisonType", ComparisonType.values(), new String[]{"less_than", "at_least", null}, new Annotation[][]{null, null, null});
            case 6:
                y yVar = ComplementWallet.Companion;
                return PaymentMethod$Type.Companion.serializer();
            case 7:
                return new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "CompletePresenter");
            case 8:
                return new p53(auu0.a, 0);
            case 9:
                return new xkz();
            case 10:
                return Boolean.TRUE;
            case 11:
                zy11Var = zy11.a;
                return zy11Var;
            case 12:
                zy11Var2 = zy11.a;
                return zy11Var2;
            case 13:
                zy11Var3 = zy11.a;
                return zy11Var3;
            case 14:
                return new oed0();
            case 15:
                return new gdd0();
            case 16:
                return new ifd0();
            case 17:
                return CompositeOfferDto$StructureType.Companion.serializer();
            case 18:
                return new p53(lpd.a, 0);
            case 19:
                return new p53(lod.a, 0);
            case 20:
                return new p53(ynd.a, 0);
            case 21:
                return new p53(dod.a, 0);
            case 22:
                return CompositeOfferDto$LegalInfo$Item$Type.Companion.serializer();
            case 23:
                return vez0.g("com.yandex.plus.pay.data.mb.dto.CompositeOfferDto.LegalInfo.Item.Type", CompositeOfferDto$LegalInfo$Item$Type.values(), new String[]{"LINK", BaseDatabaseHelper.TYPE_TEXT}, new Annotation[][]{null, null});
            case 24:
                return CompositeOfferDto$Vendor.Companion.serializer();
            case 25:
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 26:
                return new p53(fpd.Companion.serializer(), 0);
            case 27:
                return new cs5();
            case 28:
                return vez0.g("com.yandex.plus.pay.data.mb.dto.CompositeOfferDto.StructureType", CompositeOfferDto$StructureType.values(), new String[]{"TARIFF", "OPTION", "COMPOSITE"}, new Annotation[][]{null, null, null});
            default:
                return CompositeOfferDto$Vendor.Companion.serializer();
        }
    }

    public /* synthetic */ juc(int i) {
        this.a = i;
    }
}
