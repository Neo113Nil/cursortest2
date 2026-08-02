package defpackage;

import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.dto.MosmetroInitOtpResponse;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.dto.MosmetroPasswordParametersDto;

/* loaded from: classes12.dex */
public final class i930 {
    public static g930 a(MosmetroInitOtpResponse mosmetroInitOtpResponse) {
        j930 j930Var;
        String str = mosmetroInitOtpResponse.a;
        MosmetroPasswordParametersDto mosmetroPasswordParametersDto = mosmetroInitOtpResponse.b;
        if (mosmetroPasswordParametersDto != null) {
            j930Var = new j930(mosmetroPasswordParametersDto.b, mosmetroPasswordParametersDto.a, mosmetroPasswordParametersDto.c);
        } else {
            j930Var = null;
        }
        return new g930(str, j930Var, mosmetroInitOtpResponse.c, mosmetroInitOtpResponse.d, mosmetroInitOtpResponse.e);
    }
}
