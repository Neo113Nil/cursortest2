package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SelectAction;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/s3", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SelectAction {
    public static final s3 Companion = new s3();
    public final String a;
    public final FormattedText b;
    public final String c;

    public /* synthetic */ SelectAction(int i, String str, String str2, FormattedText formattedText) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectAction)) {
            return false;
        }
        SelectAction selectAction = (SelectAction) obj;
        return jl40.l(this.a, selectAction.a) && jl40.l(this.b, selectAction.b) && jl40.l(this.c, selectAction.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        return this.c.hashCode() + ((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(xvz.q("SelectAction(title=", this.a, ", description=", ", buttonText=", this.b), this.c, Extension.C_BRAKE);
    }

    public SelectAction() {
        this.a = "";
        this.b = null;
        this.c = "";
    }
}
