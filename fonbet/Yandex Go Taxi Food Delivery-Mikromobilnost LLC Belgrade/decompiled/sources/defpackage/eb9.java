package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.VOLUNTARY_MAILING_AGREEMENT_STATUS;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final class eb9 implements b050 {
    public final VOLUNTARY_MAILING_AGREEMENT_STATUS a;

    public eb9(VOLUNTARY_MAILING_AGREEMENT_STATUS voluntary_mailing_agreement_status) {
        this.a = voluntary_mailing_agreement_status;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        bfxVar.A1(ACSPConstants.STATUS);
        bfxVar.r0(this.a.getRawValue());
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(gb9.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "mutation ChangeMailingAdsAgreementStatus($status: VOLUNTARY_MAILING_AGREEMENT_STATUS!) { changeVoluntaryAgreementStatus(input: { status: $status } ) { status } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb9) && this.a == ((eb9) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.fc70
    public final String id() {
        return "a806441ed933a420f0d8eef21205bd5f5082592caf126b4aa232077fac3bc89c";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "ChangeMailingAdsAgreementStatus";
    }

    public final String toString() {
        return "ChangeMailingAdsAgreementStatusMutation(status=" + this.a + ')';
    }
}
