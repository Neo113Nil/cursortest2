package defpackage;

import com.yandex.quark.alice.AliceModelType;
import com.yandex.quark.dialog.DialogType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class cs1 {
    public final String a;
    public final String b;
    public final String c;
    public final seu d;
    public final boolean e;
    public final odj f;
    public final whi0 g;

    public cs1(String str, String str2) {
        seu seuVar = seu.G;
        gej.Companion.getClass();
        gej gejVar = new gej(DialogType.UNKNOWN);
        qwr.Companion.getClass();
        eah eahVar = new eah(gejVar, "", AliceModelType.BASE);
        this.a = str;
        this.b = "7d80e4b3-451a-4b75-99fe-ddc2aa6c7fcd";
        this.c = str2;
        this.d = seuVar;
        this.e = true;
        this.f = eahVar;
        this.g = whi0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs1)) {
            return false;
        }
        cs1 cs1Var = (cs1) obj;
        return jl40.l(this.a, cs1Var.a) && jl40.l(this.b, cs1Var.b) && jl40.l(this.c, cs1Var.c) && jl40.l(this.d, cs1Var.d) && this.e == cs1Var.e && jl40.l(this.f, cs1Var.f) && jl40.l(this.g, cs1Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + unr0.e(unr0.e(unr0.e((this.d.hashCode() + unr0.b(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, false), 31, this.c)) * 31, 31, false), 31, false), 31, this.e)) * 31;
        this.g.getClass();
        return hashCode + 1045364792;
    }

    public final String toString() {
        StringBuilder v = b64.v("AliceConfig(appId=", this.a, ", speechkitApiKey=", this.b, ", isSpotterEnabled=false, uuid=");
        v.append(this.c);
        v.append(", responseMode=");
        v.append(this.d);
        v.append(", vocalizerEnabled=false, requireAuthorization=false, requireMetricaUuid=");
        v.append(this.e);
        v.append(", defaultDialogContext=");
        v.append(this.f);
        v.append(", recognizerModel=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
