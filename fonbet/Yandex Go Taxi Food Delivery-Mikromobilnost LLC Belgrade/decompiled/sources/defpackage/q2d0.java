package defpackage;

import android.graphics.Paint;
import com.yandex.plus.core.data.common.PlusGradient;
import com.yandex.plus.home.animation.PlusLoadingAnimationView;
import com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionOfferVendorTypeDto;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final /* synthetic */ class q2d0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ q2d0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_2;
        KSerializer _childSerializers$_anonymous_$02;
        KSerializer _childSerializers$_anonymous_$1;
        KSerializer _childSerializers$_anonymous_$2;
        Paint maskPaint_delegate$lambda$9;
        KSerializer _childSerializers$_anonymous_3;
        KSerializer _childSerializers$_anonymous_$03;
        KSerializer _childSerializers$_anonymous_$12;
        KSerializer _childSerializers$_anonymous_4;
        switch (this.a) {
            case 0:
                _init_$_anonymous_ = PlusGradient._init_$_anonymous_();
                return _init_$_anonymous_;
            case 1:
                _childSerializers$_anonymous_ = PlusGradient.Linear._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 2:
                _childSerializers$_anonymous_$0 = PlusGradient.Linear._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            case 3:
                _childSerializers$_anonymous_2 = PlusGradient.Radial._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 4:
                _childSerializers$_anonymous_$02 = PlusGradient.Radial._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$02;
            case 5:
                _childSerializers$_anonymous_$1 = PlusGradient.Radial._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$1;
            case 6:
                _childSerializers$_anonymous_$2 = PlusGradient.Radial._childSerializers$_anonymous_$2();
                return _childSerializers$_anonymous_$2;
            case 7:
                return null;
            case 8:
                maskPaint_delegate$lambda$9 = PlusLoadingAnimationView.maskPaint_delegate$lambda$9();
                return maskPaint_delegate$lambda$9;
            case 9:
                return new p53(auu0.a, 1);
            case 10:
                return new p53(g8d0.a, 1);
            case 11:
                return new p53(pnz.a, 1);
            case 12:
                return new p53(auu0.a, 1);
            case 13:
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 14:
                return new p53(auu0.a, 1);
            case 15:
                return new p53(u8d0.a, 0);
            case 16:
                return vez0.g("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionOfferVendorTypeDto", PlusPayAcquisitionOfferVendorTypeDto.values(), new String[]{"GOOGLE_PLAY", "NATIVE_YANDEX", null}, new Annotation[][]{null, null, null});
            case 17:
                return PlusPayAcquisitionOfferVendorTypeDto.Companion.serializer();
            case 18:
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 19:
                return new cs5();
            case 20:
                return new p53(f9d0.a, 0);
            case 21:
                return new p53(auu0.a, 1);
            case 22:
                return new p53(l9d0.a, 0);
            case 23:
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 24:
                return PlusPayAcquisitionOfferVendorTypeDto.Companion.serializer();
            case 25:
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 26:
                _childSerializers$_anonymous_3 = PlusPayAdditionalOffer._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_3;
            case 27:
                _childSerializers$_anonymous_$03 = PlusPayAdditionalOffer._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$03;
            case 28:
                _childSerializers$_anonymous_$12 = PlusPayAdditionalOffer._childSerializers$_anonymous_$1();
                return _childSerializers$_anonymous_$12;
            default:
                _childSerializers$_anonymous_4 = PlusPayAdditionalOffer.Assets._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_4;
        }
    }
}
