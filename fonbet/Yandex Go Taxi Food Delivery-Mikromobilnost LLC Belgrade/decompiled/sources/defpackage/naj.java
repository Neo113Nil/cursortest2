package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class naj implements ig5 {
    public static final maj Companion = new maj();
    public static final i3y[] i;
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final List e;
    public final vm50 f;
    public final List g;
    public final List h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, null, null, null, a.b(lazyThreadSafetyMode, new dii(26)), a.b(lazyThreadSafetyMode, new dii(27)), a.b(lazyThreadSafetyMode, new dii(28)), a.b(lazyThreadSafetyMode, new dii(29))};
    }

    public /* synthetic */ naj(int i2, int i3, int i4, String str, String str2, List list, vm50 vm50Var, List list2, List list3) {
        if (15 != (i2 & 15)) {
            qje.Z(i2, 15, laj.a.getDescriptor());
            throw null;
        }
        this.a = i3;
        this.b = i4;
        this.c = str;
        this.d = str2;
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = vm50Var;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = list2;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof naj)) {
            return false;
        }
        naj najVar = (naj) obj;
        return this.a == najVar.a && this.b == najVar.b && jl40.l(this.c, najVar.c) && jl40.l(this.d, najVar.d) && jl40.l(this.e, najVar.e) && jl40.l(this.f, najVar.f) && jl40.l(this.g, najVar.g) && jl40.l(this.h, najVar.h);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
        List list = this.e;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        vm50 vm50Var = this.f;
        int hashCode2 = (hashCode + (vm50Var == null ? 0 : vm50Var.hashCode())) * 31;
        List list2 = this.g;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.h;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "DeviceChallengeSignatureAction(deviceChallengePostDelay=", ", deviceChallengeStartDelay=", ", paymentMethodId=");
        g8e.D(s, this.c, ", purchaseToken=", this.d, ", dataVarPath=");
        s.append(this.e);
        s.append(", onCompleteAction=");
        s.append(this.f);
        s.append(", signatureVarPath=");
        return vfc.p(s, this.g, ", userSuccessVarPath=", this.h, Extension.C_BRAKE);
    }
}
