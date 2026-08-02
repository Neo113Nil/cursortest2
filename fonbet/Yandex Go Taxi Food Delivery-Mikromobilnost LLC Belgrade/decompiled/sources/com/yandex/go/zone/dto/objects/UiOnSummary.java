package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/UiOnSummary;", "Lcom/yandex/go/zone/dto/objects/o6;", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/q6", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UiOnSummary extends o6 {
    public static final q6 Companion = new q6();
    public final String a;
    public final String b;
    public final SelectAction c;

    public UiOnSummary(int i, String str, String str2, SelectAction selectAction) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = selectAction;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiOnSummary)) {
            return false;
        }
        UiOnSummary uiOnSummary = (UiOnSummary) obj;
        return jl40.l(this.a, uiOnSummary.a) && jl40.l(this.b, uiOnSummary.b) && jl40.l(this.c, uiOnSummary.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        SelectAction selectAction = this.c;
        return b + (selectAction == null ? 0 : selectAction.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("UiOnSummary(title=", this.a, ", subtitle=", this.b, ", selectAction=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public UiOnSummary() {
        this.a = "";
        this.b = "";
        this.c = null;
    }
}
