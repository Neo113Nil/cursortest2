package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oi60;
import defpackage.unr0;
import defpackage.w7s;
import defpackage.xvz;
import defpackage.yjd;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/shortcuts/dto/response/Offer$MainScreenOnboarding", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/d0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Offer$MainScreenOnboarding {
    public static final d0 Companion = new d0();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new oi60(14))};
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final Map d;

    public /* synthetic */ Offer$MainScreenOnboarding(int i, String str, FormattedText formattedText, FormattedText formattedText2, Map map) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = map;
        }
    }

    public static final /* synthetic */ void b(Offer$MainScreenOnboarding offer$MainScreenOnboarding, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(offer$MainScreenOnboarding.a, "")) {
            yjdVar.o(serialDescriptor, 0, offer$MainScreenOnboarding.a);
        }
        if (yjdVar.F() || !jl40.l(offer$MainScreenOnboarding.b, FormattedText.c)) {
            yjdVar.e(serialDescriptor, 1, w7s.a, offer$MainScreenOnboarding.b);
        }
        if (yjdVar.F() || !jl40.l(offer$MainScreenOnboarding.c, FormattedText.c)) {
            yjdVar.e(serialDescriptor, 2, w7s.a, offer$MainScreenOnboarding.c);
        }
        if (!yjdVar.F() && offer$MainScreenOnboarding.d == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 3, (KSerializer) e[3].getValue(), offer$MainScreenOnboarding.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offer$MainScreenOnboarding)) {
            return false;
        }
        Offer$MainScreenOnboarding offer$MainScreenOnboarding = (Offer$MainScreenOnboarding) obj;
        return jl40.l(this.a, offer$MainScreenOnboarding.a) && jl40.l(this.b, offer$MainScreenOnboarding.b) && jl40.l(this.c, offer$MainScreenOnboarding.c) && jl40.l(this.d, offer$MainScreenOnboarding.d);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c.a);
        Map map = this.d;
        return c + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder q = xvz.q("MainScreenOnboarding(id=", this.a, ", attributedTitle=", ", attributedSubtitle=", this.b);
        q.append(this.c);
        q.append(", payload=");
        q.append(this.d);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public Offer$MainScreenOnboarding() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = formattedText;
        this.c = formattedText;
        this.d = null;
    }
}
