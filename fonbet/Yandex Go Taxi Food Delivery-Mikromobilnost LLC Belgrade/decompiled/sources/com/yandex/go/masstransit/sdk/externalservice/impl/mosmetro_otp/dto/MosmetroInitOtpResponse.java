package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.dto;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/externalservice/impl/mosmetro_otp/dto/MosmetroInitOtpResponse;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/externalservice/impl/mosmetro_otp/dto/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MosmetroInitOtpResponse {
    public static final d Companion = new d();
    public final String a;
    public final MosmetroPasswordParametersDto b;
    public final String c;
    public final Boolean d;
    public final String e;

    public /* synthetic */ MosmetroInitOtpResponse(int i, String str, MosmetroPasswordParametersDto mosmetroPasswordParametersDto, String str2, Boolean bool, String str3) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = mosmetroPasswordParametersDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public MosmetroInitOtpResponse() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
