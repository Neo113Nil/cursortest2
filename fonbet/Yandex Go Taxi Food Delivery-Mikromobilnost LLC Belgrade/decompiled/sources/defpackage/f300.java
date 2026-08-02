package defpackage;

import com.apollographql.apollo3.api.c;

/* loaded from: classes2.dex */
public final class f300 implements ejg0 {
    public final String a;

    public f300(String str) {
        this.a = str;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        bfxVar.A1("language");
        foe foeVar = l80.a;
        uga1.f(bfxVar, this.a);
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(h300.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "query MailingAdsAgreement($language: LanguageISO639Scalar!) { voluntaryMailingAdsAgreement(input: { language: $language } ) { agreement { agreementDefaultStatus logic text { text parts { __typename ... on DecoratedTextReferencePartHighlight { name text url } } } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f300) && this.a.equals(((f300) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.fc70
    public final String id() {
        return "d4068d913370277de002b4a355a3f82cbb9cf0a002c8dc4623588fda970c2e35";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "MailingAdsAgreement";
    }

    public final String toString() {
        return "MailingAdsAgreementQuery(language=" + ((Object) this.a) + ')';
    }
}
