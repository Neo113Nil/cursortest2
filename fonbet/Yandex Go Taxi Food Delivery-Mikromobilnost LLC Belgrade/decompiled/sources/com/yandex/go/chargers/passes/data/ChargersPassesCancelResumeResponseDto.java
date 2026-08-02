package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassesCancelResumeResponseDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/passes/data/l0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPassesCancelResumeResponseDto {
    public static final l0 Companion = new l0();
    public final ChargersPassDto a;
    public final ChargersPassNotificationDto b;

    static {
        s sVar = ChargersPassDto.Companion;
    }

    public /* synthetic */ ChargersPassesCancelResumeResponseDto(int i, ChargersPassDto chargersPassDto, ChargersPassNotificationDto chargersPassNotificationDto) {
        this.a = (i & 1) == 0 ? new ChargersPassDto(0) : chargersPassDto;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = chargersPassNotificationDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersPassesCancelResumeResponseDto)) {
            return false;
        }
        ChargersPassesCancelResumeResponseDto chargersPassesCancelResumeResponseDto = (ChargersPassesCancelResumeResponseDto) obj;
        return jl40.l(this.a, chargersPassesCancelResumeResponseDto.a) && jl40.l(this.b, chargersPassesCancelResumeResponseDto.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ChargersPassNotificationDto chargersPassNotificationDto = this.b;
        return hashCode + (chargersPassNotificationDto == null ? 0 : chargersPassNotificationDto.hashCode());
    }

    public final String toString() {
        return "ChargersPassesCancelResumeResponseDto(pass=" + this.a + ", notification=" + this.b + Extension.C_BRAKE;
    }

    public ChargersPassesCancelResumeResponseDto() {
        this.a = new ChargersPassDto(0);
        this.b = null;
    }
}
