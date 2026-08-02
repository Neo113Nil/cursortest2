package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/dto/response/ButtonDto;", "", "Companion", "$serializer", "com/yandex/go/dto/response/s1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ButtonDto {
    public static final s1 Companion = new s1();
    public final String a;
    public final FormattedText b;
    public final String c;
    public final q1 d;

    public /* synthetic */ ButtonDto(int i, String str, FormattedText formattedText, String str2, q1 q1Var) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = q1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonDto)) {
            return false;
        }
        ButtonDto buttonDto = (ButtonDto) obj;
        return jl40.l(this.a, buttonDto.a) && jl40.l(this.b, buttonDto.b) && jl40.l(this.c, buttonDto.c) && jl40.l(this.d, buttonDto.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c);
        q1 q1Var = this.d;
        return b + (q1Var == null ? 0 : q1Var.hashCode());
    }

    public final String toString() {
        StringBuilder q = xvz.q("ButtonDto(id=", this.a, ", attributedTitle=", ", backgroundColor=", this.b);
        q.append(this.c);
        q.append(", action=");
        q.append(this.d);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public ButtonDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = formattedText;
        this.c = "";
        this.d = null;
    }
}
