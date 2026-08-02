package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.w7s;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/Title;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/y2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Title {
    public static final y2 Companion = new y2();
    public final String a;
    public final FormattedText b;

    public /* synthetic */ Title(int i, String str, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
    }

    public static final /* synthetic */ void a(Title title, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(title.a, "")) {
            yjdVar.o(serialDescriptor, 0, title.a);
        }
        if (!yjdVar.F() && jl40.l(title.b, FormattedText.c)) {
            return;
        }
        yjdVar.e(serialDescriptor, 1, w7s.a, title.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Title)) {
            return false;
        }
        Title title = (Title) obj;
        return jl40.l(this.a, title.a) && jl40.l(this.b, title.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Title(text=" + this.a + ", formattedText=" + this.b + Extension.C_BRAKE;
    }

    public Title() {
        this(0);
    }

    public Title(int i) {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = formattedText;
    }
}
