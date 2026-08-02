package com.yandex.go.places.impl.data.entities.network.organizations;

import com.yandex.go.places.impl.data.entities.network.ButtonDto;
import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/OrganizationsEmptyScreenConfigDto;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/r", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrganizationsEmptyScreenConfigDto {
    public static final r Companion = new r();
    public final ButtonDto a;
    public final FormattedText b;
    public final FormattedText c;
    public final ImageDto d;

    public /* synthetic */ OrganizationsEmptyScreenConfigDto(int i, ButtonDto buttonDto, FormattedText formattedText, FormattedText formattedText2, ImageDto imageDto) {
        this.a = (i & 1) == 0 ? new ButtonDto(0) : buttonDto;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = imageDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationsEmptyScreenConfigDto)) {
            return false;
        }
        OrganizationsEmptyScreenConfigDto organizationsEmptyScreenConfigDto = (OrganizationsEmptyScreenConfigDto) obj;
        return jl40.l(this.a, organizationsEmptyScreenConfigDto.a) && jl40.l(this.b, organizationsEmptyScreenConfigDto.b) && jl40.l(this.c, organizationsEmptyScreenConfigDto.c) && jl40.l(this.d, organizationsEmptyScreenConfigDto.d);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b.a);
        FormattedText formattedText = this.c;
        int hashCode = (c + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        ImageDto imageDto = this.d;
        return hashCode + (imageDto != null ? imageDto.hashCode() : 0);
    }

    public final String toString() {
        return "OrganizationsEmptyScreenConfigDto(button=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", image=" + this.d + Extension.C_BRAKE;
    }

    public OrganizationsEmptyScreenConfigDto() {
        ButtonDto buttonDto = new ButtonDto(0);
        FormattedText formattedText = FormattedText.c;
        this.a = buttonDto;
        this.b = formattedText;
        this.c = null;
        this.d = null;
    }
}
