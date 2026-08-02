package com.yandex.go.multimodal_route.network.models;

import defpackage.gsq0;
import defpackage.ief;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/network/models/TaxiFeedbackDto;", "", "Companion", "$serializer", "com/yandex/go/multimodal_route/network/models/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TaxiFeedbackDto {
    public static final q Companion = new q();
    public final FormattedText a;
    public final FormattedText b;
    public final int c;
    public final HubRatingSelectorDto d;
    public final SupportButtonDto e;
    public final TipsChoicesDto f;
    public final HubDoneButtonDto g;
    public final ief h;

    public /* synthetic */ TaxiFeedbackDto(int i, FormattedText formattedText, FormattedText formattedText2, int i2, HubRatingSelectorDto hubRatingSelectorDto, SupportButtonDto supportButtonDto, TipsChoicesDto tipsChoicesDto, HubDoneButtonDto hubDoneButtonDto, ief iefVar) {
        if (125 != (i & HProv.PP_DELETE_KEYSET)) {
            qje.Z(i, HProv.PP_DELETE_KEYSET, TaxiFeedbackDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        this.c = i2;
        this.d = hubRatingSelectorDto;
        this.e = supportButtonDto;
        this.f = tipsChoicesDto;
        this.g = hubDoneButtonDto;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = iefVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiFeedbackDto)) {
            return false;
        }
        TaxiFeedbackDto taxiFeedbackDto = (TaxiFeedbackDto) obj;
        return jl40.l(this.a, taxiFeedbackDto.a) && jl40.l(this.b, taxiFeedbackDto.b) && this.c == taxiFeedbackDto.c && jl40.l(this.d, taxiFeedbackDto.d) && jl40.l(this.e, taxiFeedbackDto.e) && jl40.l(this.f, taxiFeedbackDto.f) && jl40.l(this.g, taxiFeedbackDto.g) && jl40.l(this.h, taxiFeedbackDto.h);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + oyr.b(this.c, unr0.c(this.a.a.hashCode() * 31, 31, this.b.a), 31)) * 31;
        SupportButtonDto supportButtonDto = this.e;
        int hashCode2 = (hashCode + (supportButtonDto == null ? 0 : supportButtonDto.hashCode())) * 31;
        TipsChoicesDto tipsChoicesDto = this.f;
        int hashCode3 = (this.g.hashCode() + ((hashCode2 + (tipsChoicesDto == null ? 0 : tipsChoicesDto.hashCode())) * 31)) * 31;
        ief iefVar = this.h;
        return hashCode3 + (iefVar != null ? iefVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = defpackage.n.r("TaxiFeedbackDto(title=", this.a, ", subtitle=", this.b, ", lifetime=");
        r.append(this.c);
        r.append(", ratingSelector=");
        r.append(this.d);
        r.append(", supportButton=");
        r.append(this.e);
        r.append(", tipsChoices=");
        r.append(this.f);
        r.append(", doneButton=");
        r.append(this.g);
        r.append(", currencyRules=");
        r.append(this.h);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
