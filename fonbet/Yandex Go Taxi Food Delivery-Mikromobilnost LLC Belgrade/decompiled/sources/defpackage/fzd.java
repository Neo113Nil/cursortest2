package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.care.camera.di.Config$CameraLens;
import ru.yandex.logistics.care.camera.di.Config$Orientation;

/* loaded from: classes4.dex */
public final class fzd {
    public final String a;
    public final String b;
    public final String c;
    public final Config$Orientation d;
    public final ArrayList e;
    public final ozd f;
    public final Config$CameraLens g;
    public final pzd h;
    public final jzd i;

    public fzd(String str, String str2, String str3, Config$Orientation config$Orientation, ArrayList arrayList, ozd ozdVar, Config$CameraLens config$CameraLens, pzd pzdVar, jzd jzdVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = config$Orientation;
        this.e = arrayList;
        this.f = ozdVar;
        this.g = config$CameraLens;
        this.h = pzdVar;
        this.i = jzdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzd)) {
            return false;
        }
        fzd fzdVar = (fzd) obj;
        return jl40.l(this.a, fzdVar.a) && this.b.equals(fzdVar.b) && jl40.l(this.c, fzdVar.c) && this.d == fzdVar.d && this.e.equals(fzdVar.e) && jl40.l(this.f, fzdVar.f) && this.g == fzdVar.g && jl40.l(this.h, fzdVar.h) && jl40.l(this.i, fzdVar.i);
    }

    public final int hashCode() {
        String str = this.a;
        int b = ly3.b((this.d.hashCode() + unr0.b(unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        ozd ozdVar = this.f;
        int hashCode = (this.g.hashCode() + ((b + (ozdVar == null ? 0 : ozdVar.hashCode())) * 31)) * 31;
        pzd pzdVar = this.h;
        int hashCode2 = (hashCode + (pzdVar == null ? 0 : pzdVar.hashCode())) * 31;
        jzd jzdVar = this.i;
        return hashCode2 + (jzdVar != null ? jzdVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CameraStep(title=", this.a, ", subtitle=", this.b, ", photoClass=");
        v.append(this.c);
        v.append(", orientation=");
        v.append(this.d);
        v.append(", availableControls=");
        v.append(this.e);
        v.append(", overlayConfig=");
        v.append(this.f);
        v.append(", camera=");
        v.append(this.g);
        v.append(", selfTimerConfig=");
        v.append(this.h);
        v.append(", exposureConfig=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
