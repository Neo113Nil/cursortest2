package xsna;

import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.verification.base.CheckPresenterInfo;

/* compiled from: SmartflowOpenArgs.kt */
/* loaded from: classes15.dex */
public final class z5k0 {
    public final String a;
    public final String b;
    public final CheckPresenterInfo c;
    public final String d;
    public final VerificationMethodState e;
    public final int f;
    public final boolean g;
    public final h3e0 h;
    public final boolean i;

    /* compiled from: SmartflowOpenArgs.kt */
    public static final class a {
        public static z5k0 a(VerificationScreenData verificationScreenData, VerificationMethodState verificationMethodState) {
            return new z5k0(null, verificationScreenData.d, new CheckPresenterInfo.MethodSelectorAuth(verificationScreenData), verificationScreenData.b, verificationMethodState, false, false, 993);
        }
    }

    public z5k0() {
        throw null;
    }

    public z5k0(String str, String str2, CheckPresenterInfo checkPresenterInfo, String str3, VerificationMethodState verificationMethodState, boolean z, boolean z2, int i) {
        str = (i & 1) != 0 ? null : str;
        verificationMethodState = (i & 16) != 0 ? null : verificationMethodState;
        int i2 = (i & 32) != 0 ? 0 : 2;
        z = (i & 256) != 0 ? false : z;
        h3e0 h3e0Var = new h3e0(4);
        this.a = str;
        this.b = str2;
        this.c = checkPresenterInfo;
        this.d = str3;
        this.e = verificationMethodState;
        this.f = i2;
        this.g = z;
        this.h = h3e0Var;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5k0)) {
            return false;
        }
        z5k0 z5k0Var = (z5k0) obj;
        return epx.f(this.a, z5k0Var.a) && epx.f(this.b, z5k0Var.b) && epx.f(this.c, z5k0Var.c) && epx.f(this.d, z5k0Var.d) && epx.f(this.e, z5k0Var.e) && this.f == z5k0Var.f && this.g == z5k0Var.g && epx.f(this.h, z5k0Var.h) && this.i == z5k0Var.i;
    }

    public final int hashCode() {
        String str = this.a;
        int a2 = urd0.a((this.c.hashCode() + urd0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31, 31, this.d);
        VerificationMethodState verificationMethodState = this.e;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + qoy.b(qoy.b(shy.a(this.f, (a2 + (verificationMethodState == null ? 0 : verificationMethodState.hashCode())) * 31, 31), 961, false), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmartflowOpenArgs(phoneMask=");
        sb.append(this.a);
        sb.append(", validationSid=");
        sb.append(this.b);
        sb.append(", presenterInfo=");
        sb.append(this.c);
        sb.append(", login=");
        sb.append(this.d);
        sb.append(", verificationMethodState=");
        sb.append(this.e);
        sb.append(", derivedArgsCount=");
        sb.append(this.f);
        sb.append(", hasAnotherVerificationMethods=false, satToken=null, requestAccessFactor=");
        sb.append(this.g);
        sb.append(", creator=");
        sb.append(this.h);
        sb.append(", isOkMimicry=");
        return defpackage.q0.a(sb, this.i, ')');
    }
}
