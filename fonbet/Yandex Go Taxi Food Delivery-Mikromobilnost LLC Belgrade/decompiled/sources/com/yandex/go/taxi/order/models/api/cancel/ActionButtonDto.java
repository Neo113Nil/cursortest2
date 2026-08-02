package com.yandex.go.taxi.order.models.api.cancel;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/ActionButtonDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/cancel/o", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ActionButtonDto {
    public static final o Companion = new o();
    public final String a;
    public final FormattedText b;
    public final n c;

    public /* synthetic */ ActionButtonDto(int i, String str, FormattedText formattedText, n nVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = m.INSTANCE;
        } else {
            this.c = nVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionButtonDto)) {
            return false;
        }
        ActionButtonDto actionButtonDto = (ActionButtonDto) obj;
        return jl40.l(this.a, actionButtonDto.a) && jl40.l(this.b, actionButtonDto.b) && jl40.l(this.c, actionButtonDto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        StringBuilder q = xvz.q("ActionButtonDto(color=", this.a, ", text=", ", action=", this.b);
        q.append(this.c);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public ActionButtonDto() {
        FormattedText formattedText = FormattedText.c;
        m mVar = m.INSTANCE;
        this.a = "";
        this.b = formattedText;
        this.c = mVar;
    }
}
