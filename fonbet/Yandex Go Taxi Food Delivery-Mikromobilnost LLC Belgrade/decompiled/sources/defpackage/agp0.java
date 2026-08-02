package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.presentation.error.verification.VerificationErrorFragment;

/* loaded from: classes4.dex */
public final class agp0 extends mds {
    public final Exception a;

    public agp0(Exception exc) {
        this.a = exc;
    }

    @Override // defpackage.mds
    public final Fragment a() {
        VerificationErrorFragment.Companion.getClass();
        VerificationErrorFragment verificationErrorFragment = new VerificationErrorFragment();
        verificationErrorFragment.setArguments(wwg.g(new Pair("ARG_VERIFICATION_ERROR", this.a)));
        return verificationErrorFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agp0) && jl40.l(this.a, ((agp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerificationErrorScreen(error=" + this.a + Extension.C_BRAKE;
    }
}
