package defpackage;

import com.yandex.go.experiment.LocationSdkAndroidGoExperiment;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class f7z implements g7z {
    public final String a;
    public final LocationSdkAndroidGoExperiment.GoConfig b;
    public final wnp0 c;

    public f7z(String str, LocationSdkAndroidGoExperiment.GoConfig goConfig, wnp0 wnp0Var) {
        this.a = str;
        this.b = goConfig;
        this.c = wnp0Var;
    }

    @Override // defpackage.g7z
    public final wnp0 a() {
        return this.c;
    }

    @Override // defpackage.g7z
    public final LocationSdkAndroidGoExperiment.GoConfig b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7z)) {
            return false;
        }
        f7z f7zVar = (f7z) obj;
        return jl40.l(this.a, f7zVar.a) && jl40.l(this.b, f7zVar.b) && this.c.equals(f7zVar.c);
    }

    @Override // defpackage.g7z
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Enabled(name=" + this.a + ", go=" + this.b + ", sdk=" + this.c + Extension.C_BRAKE;
    }
}
