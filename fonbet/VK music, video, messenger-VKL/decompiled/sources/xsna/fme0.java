package xsna;

import com.google.zxing.client.result.ParsedResult;
import com.vk.api.generated.utils.dto.UtilsResolveScreenNameWithDataPlatformDto;
import com.vk.qrcode.QRTypes$SubType;
import com.vk.qrcode.QRTypes$Type;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: QRTypes.kt */
/* loaded from: classes5.dex */
public final class fme0 extends q76 {
    public final String c;

    public fme0(ParsedResult parsedResult) {
        super(parsedResult);
        this.c = parsedResult.toString();
    }

    @Override // xsna.q76
    public final <T> io.reactivex.rxjava3.core.q<T> a() {
        return rsg0.y0(yfb.x(po40.s(new po40(), f870.w(InternalVkMiniApps.CHECK_BACK.h()), UtilsResolveScreenNameWithDataPlatformDto.ANDROID, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)), null, null, 3).U(new fl40(new d230(9), 6));
    }

    @Override // xsna.q76
    public final boolean i() {
        return true;
    }

    @Override // xsna.q76
    public final QRTypes$SubType o() {
        return QRTypes$SubType.NONE;
    }

    @Override // xsna.q76
    public final QRTypes$Type q() {
        return QRTypes$Type.CHECK_BACK;
    }
}
