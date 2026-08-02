package com.yandex.go.taxi.order.models.api.cancel;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.mz7;
import defpackage.nz7;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/Button;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/cancel/w", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Button {
    public static final w Companion = new w();
    public final FormattedText a;
    public final String b;
    public final FormattedText c;
    public final nz7 d;

    public /* synthetic */ Button(int i, FormattedText formattedText, String str, FormattedText formattedText2, nz7 nz7Var) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = mz7.INSTANCE;
        } else {
            this.d = nz7Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return jl40.l(this.a, button.a) && jl40.l(this.b, button.b) && jl40.l(this.c, button.c) && jl40.l(this.d, button.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.c(unr0.b(this.a.a.hashCode() * 31, 31, this.b), 31, this.c.a);
    }

    public final String toString() {
        return "Button(text=" + this.a + ", backgroundColor=" + this.b + ", subtitle=" + this.c + ", action=" + this.d + Extension.C_BRAKE;
    }

    public Button() {
        FormattedText formattedText = FormattedText.c;
        mz7 mz7Var = mz7.INSTANCE;
        this.a = formattedText;
        this.b = "";
        this.c = formattedText;
        this.d = mz7Var;
    }
}
