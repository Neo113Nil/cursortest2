package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dps implements hps {
    public final Text.Constant a;
    public final Text b;
    public final fps c;

    public dps(Text.Constant constant, Text.Constant constant2, fps fpsVar) {
        this.a = constant;
        this.b = constant2;
        this.c = fpsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dps)) {
            return false;
        }
        dps dpsVar = (dps) obj;
        return this.a.equals(dpsVar.a) && jl40.l(this.b, dpsVar.b) && jl40.l(this.c, dpsVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        fps fpsVar = this.c;
        return hashCode2 + (fpsVar != null ? fpsVar.hashCode() : 0);
    }

    public final String toString() {
        return "InProgress(title=" + this.a + ", subtitle=" + this.b + ", resultScreen=" + this.c + Extension.C_BRAKE;
    }
}
