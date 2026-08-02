package xsna;

import com.vk.api.generated.utils.dto.UtilsResolveScreenNameWithDataPlatformDto;
import com.vk.qrcode.QRTypes$SubType;
import com.vk.qrcode.QRTypes$Type;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: QRTypes.kt */
/* loaded from: classes5.dex */
public final class eme0 extends com.vk.qrcode.c {
    public String g;
    public String h;
    public String i;
    public qkd0 j;
    public int k;

    @Override // com.vk.qrcode.c, xsna.q76
    public final <T> io.reactivex.rxjava3.core.q<T> a() {
        QRTypes$SubType qRTypes$SubType = QRTypes$SubType.LINK_POST;
        QRTypes$SubType qRTypes$SubType2 = this.e;
        if (qRTypes$SubType2 == qRTypes$SubType || qRTypes$SubType2 == QRTypes$SubType.LINK_ARTICLE || rl3.G(new QRTypes$SubType[]{QRTypes$SubType.LINK_USER, QRTypes$SubType.LINK_GROUP, QRTypes$SubType.LINK_VK_APP}, qRTypes$SubType2)) {
            return super.a();
        }
        return rsg0.y0(yfb.x(po40.s(new po40(), this.f, UtilsResolveScreenNameWithDataPlatformDto.ANDROID, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)), null, null, 3).U(new u9c0(new n9w(18), 3));
    }

    @Override // com.vk.qrcode.c, xsna.q76
    public final boolean i() {
        return this.i != null;
    }

    @Override // com.vk.qrcode.c, xsna.q76
    public final QRTypes$Type q() {
        return QRTypes$Type.BRAND;
    }
}
