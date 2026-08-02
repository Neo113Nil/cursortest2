package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.care.camera.di.Config$CameraLens;

/* loaded from: classes4.dex */
public final class do7 implements no7 {
    public final int a;
    public final String b;
    public final Config$CameraLens c;

    public do7(int i, String str, Config$CameraLens config$CameraLens) {
        this.a = i;
        this.b = str;
        this.c = config$CameraLens;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do7)) {
            return false;
        }
        do7 do7Var = (do7) obj;
        return this.a == do7Var.a && jl40.l(this.b, do7Var.b) && this.c == do7Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "CameraScreenShown(step=", ", type=", this.b, ", camera=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
