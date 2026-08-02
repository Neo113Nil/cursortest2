package defpackage;

import com.yandex.go.navigation.UserPhotoUploadingEntryPoint;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hr21 {
    public final UserPhotoUploadingEntryPoint a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ hr21(UserPhotoUploadingEntryPoint userPhotoUploadingEntryPoint, boolean z, int i) {
        this(userPhotoUploadingEntryPoint, (i & 2) != 0 ? false : z, true);
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean b() {
        return this.b;
    }

    public final UserPhotoUploadingEntryPoint c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr21)) {
            return false;
        }
        hr21 hr21Var = (hr21) obj;
        return this.a == hr21Var.a && this.b == hr21Var.b && this.c == hr21Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserPhotoUploadingPayload(userPhotoUploadingEntryPoint=");
        sb.append(this.a);
        sb.append(", shouldRequestRouteStats=");
        sb.append(this.b);
        sb.append(", shouldCheckExperiment=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }

    public hr21(UserPhotoUploadingEntryPoint userPhotoUploadingEntryPoint, boolean z, boolean z2) {
        this.a = userPhotoUploadingEntryPoint;
        this.b = z;
        this.c = z2;
    }
}
