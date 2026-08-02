package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.unr0;
import defpackage.w7s;
import defpackage.xvz;
import defpackage.xx;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/ArrowSectionWidget;", "Lcom/yandex/go/shortcuts/dto/response/o2;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/e", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ArrowSectionWidget extends o2 {
    public static final e Companion = new e();
    public final String a;
    public final FormattedText b;
    public final com.yandex.go.dto.response.q1 c;

    public ArrowSectionWidget(int i, String str, FormattedText formattedText, com.yandex.go.dto.response.q1 q1Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new FormattedText(0);
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = com.yandex.go.dto.response.e0.INSTANCE;
        } else {
            this.c = q1Var;
        }
    }

    public static final /* synthetic */ void a(ArrowSectionWidget arrowSectionWidget, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(arrowSectionWidget.a, "")) {
            yjdVar.o(serialDescriptor, 0, arrowSectionWidget.a);
        }
        if (yjdVar.F() || !nzs.t(0, arrowSectionWidget.b)) {
            yjdVar.e(serialDescriptor, 1, w7s.a, arrowSectionWidget.b);
        }
        if (!yjdVar.F() && jl40.l(arrowSectionWidget.c, com.yandex.go.dto.response.e0.INSTANCE)) {
            return;
        }
        yjdVar.e(serialDescriptor, 2, xx.f, arrowSectionWidget.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArrowSectionWidget)) {
            return false;
        }
        ArrowSectionWidget arrowSectionWidget = (ArrowSectionWidget) obj;
        return jl40.l(this.a, arrowSectionWidget.a) && jl40.l(this.b, arrowSectionWidget.b) && jl40.l(this.c, arrowSectionWidget.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        StringBuilder q = xvz.q("ArrowSectionWidget(color=", this.a, ", title=", ", action=", this.b);
        q.append(this.c);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public ArrowSectionWidget() {
        FormattedText formattedText = new FormattedText(0);
        com.yandex.go.dto.response.e0 e0Var = com.yandex.go.dto.response.e0.INSTANCE;
        this.a = "";
        this.b = formattedText;
        this.c = e0Var;
    }
}
