package defpackage;

import com.yandex.go.overdraft.data.model.ConditionType;
import com.yandex.go.places.models.data.entities.network.CompressionResistantAttributedTextContainerDto;
import com.yandex.go.places.models.data.entities.network.CompressionResistantAttributedTextDto$$serializer;
import com.yandex.go.places.models.data.entities.network.v;
import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo;
import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionProduct;
import com.yandex.plus.pay.data.mb.dto.CompositeOfferDto$Vendor;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.model.TextAlign;
import ru.yandex.taxi.persuggest.api.finalsuggest.Condition;

/* loaded from: classes2.dex */
public final /* synthetic */ class kpd implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ kpd(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_3;
        switch (this.a) {
            case 0:
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 1:
                return new p53(fpd.Companion.serializer(), 0);
            case 2:
                return vez0.g("com.yandex.plus.pay.data.mb.dto.CompositeOfferDto.Vendor", CompositeOfferDto$Vendor.values(), new String[]{"GOOGLE_PLAY", "NATIVE_YANDEX", null}, new Annotation[][]{null, null, null});
            case 3:
                return new oed0();
            case 4:
                return new gdd0();
            case 5:
                _childSerializers$_anonymous_ = CompositeSubscriptionInfo.Home._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 6:
                _childSerializers$_anonymous_$0 = CompositeSubscriptionInfo.Home._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 7:
                _childSerializers$_anonymous_2 = CompositeSubscriptionInfo.Stories._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 8:
                _childSerializers$_anonymous_$02 = CompositeSubscriptionInfo.Stories._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 9:
                _childSerializers$_anonymous_3 = CompositeSubscriptionProduct._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 10:
                a7u0 a7u0Var = ztd.a;
                return null;
            case 11:
                v vVar = CompressionResistantAttributedTextContainerDto.Companion;
                return new p53(CompressionResistantAttributedTextDto$$serializer.INSTANCE, 0);
            case 12:
                return vez0.g("ru.yandex.taxi.persuggest.api.finalsuggest.Condition", Condition.values(), new String[]{"to_taxi"}, new Annotation[][]{null});
            case 13:
                oxd oxdVar = pxd.Companion;
                return jsq0.Companion.serializer(Condition.Companion.serializer());
            case 14:
                oxd oxdVar2 = pxd.Companion;
                return new p53(zsd0.f, 0);
            case 15:
                return vez0.g("com.yandex.go.overdraft.data.model.ConditionType", ConditionType.values(), new String[]{"show", "hide", null}, new Annotation[][]{null, null, null});
            case 16:
                fyd fydVar = hyd.Companion;
                return new p53(new p53(byd.e, 0), 0);
            case 17:
                return new oke(qoi0.a(v5x.class), null, new KSerializer[0]);
            case 18:
                fyd fydVar2 = hyd.Companion;
                return new p53(zsd0.f, 0);
            case 19:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 20:
                return y251.Companion.serializer();
            case 21:
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 22:
                return rh60.Companion.serializer();
            case 23:
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 24:
                return hle0.Companion.serializer();
            case 25:
                hzd hzdVar = rzd.Companion;
                return new p53(auu0.a, 0);
            case 26:
                return new o4o("ru.yandex.taxi.communications.model.Configuration.Bubble", e0e.INSTANCE, new Annotation[0]);
            case 27:
                i0e i0eVar = j0e.Companion;
                return TextAlign.Companion.serializer();
            case 28:
                return new o4o("ru.yandex.taxi.communications.model.Configuration.ModalWindow", n0e.INSTANCE, new Annotation[0]);
            default:
                return new o4o("ru.yandex.taxi.communications.model.Configuration.Unsupported", s0e.INSTANCE, new Annotation[0]);
        }
    }
}
