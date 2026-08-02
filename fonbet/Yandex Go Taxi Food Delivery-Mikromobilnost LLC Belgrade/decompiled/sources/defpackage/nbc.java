package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;

/* loaded from: classes2.dex */
public final class nbc implements ejg0 {
    public final String a;
    public final String b;
    public final String c;

    public nbc(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        bfxVar.A1("language");
        foe foeVar = l80.a;
        uga1.f(bfxVar, this.a);
        bfxVar.A1("serviceName");
        foe foeVar2 = l80.a;
        bfxVar.r0(this.b);
        bfxVar.A1(DivkitThemeChangeListener.THEME_VARIABLE_NAME);
        bfxVar.r0(this.c);
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(pbc.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "query CollectContactsWebUrl($language: LanguageISO639Scalar!, $serviceName: String!, $theme: String!) { collectUserContacts(input: { language: $language widgetServiceName: $serviceName theme: $theme } ) { webViewUrl skipText alreadyCollected } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbc)) {
            return false;
        }
        nbc nbcVar = (nbc) obj;
        return this.a.equals(nbcVar.a) && jl40.l(this.b, nbcVar.b) && jl40.l(this.c, nbcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // defpackage.fc70
    public final String id() {
        return "c85ca64da6db6512aaee70c33897674eca050fb0535130e4d72588b5e7022f99";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "CollectContactsWebUrl";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectContactsWebUrlQuery(language=");
        sb.append((Object) this.a);
        sb.append(", serviceName=");
        sb.append(this.b);
        sb.append(", theme=");
        return b64.p(sb, this.c, ')');
    }
}
