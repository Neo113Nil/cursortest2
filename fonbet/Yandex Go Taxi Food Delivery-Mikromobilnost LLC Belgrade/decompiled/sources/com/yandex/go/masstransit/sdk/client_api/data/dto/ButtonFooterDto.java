package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/data/dto/ButtonFooterDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/b", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ButtonFooterDto {
    public static final b Companion = new b();
    public final ButtonDto a;

    public /* synthetic */ ButtonFooterDto(int i, ButtonDto buttonDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = buttonDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ButtonFooterDto) && jl40.l(this.a, ((ButtonFooterDto) obj).a);
    }

    public final int hashCode() {
        ButtonDto buttonDto = this.a;
        if (buttonDto == null) {
            return 0;
        }
        return buttonDto.hashCode();
    }

    public final String toString() {
        return "ButtonFooterDto(button=" + this.a + Extension.C_BRAKE;
    }

    public ButtonFooterDto() {
        this.a = null;
    }
}
