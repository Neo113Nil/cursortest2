package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.care.camera.di.Config$CameraLens;

/* loaded from: classes4.dex */
public final class mo7 implements no7 {
    public final int a;
    public final String b;
    public final Config$CameraLens c;
    public final String d;
    public final Integer e;

    public mo7(int i, String str, Config$CameraLens config$CameraLens, String str2, Integer num) {
        this.a = i;
        this.b = str;
        this.c = config$CameraLens;
        this.d = str2;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo7)) {
            return false;
        }
        mo7 mo7Var = (mo7) obj;
        return this.a == mo7Var.a && jl40.l(this.b, mo7Var.b) && this.c == mo7Var.c && this.d.equals(mo7Var.d) && jl40.l(this.e, mo7Var.e);
    }

    public final int hashCode() {
        int b = unr0.b((this.c.hashCode() + unr0.b(Integer.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
        Integer num = this.e;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "TakePhotoTapped(step=", ", type=", this.b, ", camera=");
        v.append(this.c);
        v.append(", captureMethod=");
        v.append(this.d);
        v.append(", timerDuration=");
        return oo31.j(v, this.e, Extension.C_BRAKE);
    }
}
