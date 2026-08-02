package com.yandex.go.places.impl.data.entities.network;

import com.yandex.go.places.models.data.entities.network.r;
import com.yandex.go.places.models.data.entities.network.s;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/ButtonDto;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/a", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ButtonDto {
    public static final a Companion = new a();
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final s d;

    public /* synthetic */ ButtonDto(int i, FormattedText formattedText, FormattedText formattedText2, String str, s sVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = r.INSTANCE;
        } else {
            this.d = sVar;
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
        FormattedText formattedText = this.a;
        int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
        FormattedText formattedText2 = this.b;
        int hashCode2 = (hashCode + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder r = n.r("ButtonDto(title=", this.a, ", subtitle=", this.b, ", backgroundColor=");
        r.append(this.c);
        r.append(", action=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    public ButtonDto() {
        this(0);
    }

    public ButtonDto(int i) {
        r rVar = r.INSTANCE;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = rVar;
    }
}
