package com.yandex.plus.pay.data.mb.dto;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kka0;
import defpackage.t7a0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/plus/pay/data/mb/dto/PaymentSubmitResultDto;", "", "Companion", "StatusDto", "com/yandex/plus/pay/data/mb/dto/a", "kka0", "pay-sdk-data-mediabilling-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PaymentSubmitResultDto {
    public static final kka0 Companion = new kka0();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(19)), null};
    public final String a;
    public final StatusDto b;
    public final String c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/pay/data/mb/dto/PaymentSubmitResultDto$StatusDto;", "", "SUCCESS", "FAIL", "UNKNOWN", "pay-sdk-data-mediabilling-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StatusDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;
        public static final StatusDto FAIL;
        public static final StatusDto SUCCESS;
        public static final StatusDto UNKNOWN;

        static {
            StatusDto statusDto = new StatusDto("SUCCESS", 0);
            SUCCESS = statusDto;
            StatusDto statusDto2 = new StatusDto("FAIL", 1);
            FAIL = statusDto2;
            StatusDto statusDto3 = new StatusDto("UNKNOWN", 2);
            UNKNOWN = statusDto3;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3};
            $VALUES = statusDtoArr;
            $ENTRIES = kotlin.enums.a.a(statusDtoArr);
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ PaymentSubmitResultDto(int i, String str, StatusDto statusDto, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = StatusDto.UNKNOWN;
        } else {
            this.b = statusDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentSubmitResultDto)) {
            return false;
        }
        PaymentSubmitResultDto paymentSubmitResultDto = (PaymentSubmitResultDto) obj;
        return jl40.l(this.a, paymentSubmitResultDto.a) && this.b == paymentSubmitResultDto.b && jl40.l(this.c, paymentSubmitResultDto.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentSubmitResultDto(invoiceId=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", statusCode=");
        return b64.p(sb, this.c, ')');
    }

    public PaymentSubmitResultDto() {
        StatusDto statusDto = StatusDto.UNKNOWN;
        this.a = null;
        this.b = statusDto;
        this.c = null;
    }
}
