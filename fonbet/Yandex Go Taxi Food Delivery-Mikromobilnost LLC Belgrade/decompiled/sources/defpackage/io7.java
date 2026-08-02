package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.care.camera.di.Config$CameraLens;

/* loaded from: classes4.dex */
public final class io7 implements no7 {
    public final int a;
    public final String b;
    public final Config$CameraLens c;

    public io7(int i, String str, Config$CameraLens config$CameraLens) {
        this.a = i;
        this.b = str;
        this.c = config$CameraLens;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io7)) {
            return false;
        }
        io7 io7Var = (io7) obj;
        return this.a == io7Var.a && jl40.l(this.b, io7Var.b) && this.c == io7Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "ConfirmPhotoTapped(step=", ", type=", this.b, ", camera=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
