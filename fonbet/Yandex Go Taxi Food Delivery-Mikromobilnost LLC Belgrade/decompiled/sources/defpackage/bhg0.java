package defpackage;

import android.os.Build;
import com.yandex.quark.configuration.Language;
import java.util.Map;

/* loaded from: classes8.dex */
public final class bhg0 {
    public final bs90 a;
    public final qc20 b;
    public final raj c;
    public final String d;
    public final String e;
    public final ds1 f;
    public final qez g;
    public final Language h;
    public final Map i;
    public final dsu j;
    public final boolean k;

    public bhg0(bs90 bs90Var, qc20 qc20Var, raj rajVar, String str, String str2, ds1 ds1Var, oez oezVar, Language language, Map map, dsu dsuVar, boolean z) {
        this.a = bs90Var;
        this.b = qc20Var;
        this.c = rajVar;
        this.d = str;
        this.e = str2;
        this.f = ds1Var;
        this.g = oezVar;
        this.h = language;
        this.i = map;
        this.j = dsuVar;
        this.k = z;
        String str3 = Build.VERSION.RELEASE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhg0)) {
            return false;
        }
        bhg0 bhg0Var = (bhg0) obj;
        return this.a.equals(bhg0Var.a) && jl40.l(this.b, bhg0Var.b) && this.c.equals(bhg0Var.c) && jl40.l(this.d, bhg0Var.d) && jl40.l(this.e, bhg0Var.e) && this.f.equals(bhg0Var.f) && jl40.l(this.g, bhg0Var.g) && this.h == bhg0Var.h && this.i.equals(bhg0Var.i) && jl40.l(this.j, bhg0Var.j) && this.k == bhg0Var.k;
    }

    public final int hashCode() {
        return unr0.e(unr0.e((this.j.hashCode() + unr0.e(unr0.e(unr0.e(unr0.e(unr0.d((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + unr0.b(unr0.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e)) * 31)) * 31)) * 31, 31, this.i), 31, false), 961, false), 31, false), 31, false)) * 29791, 961, this.k), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuarkConfigInternal(paths=");
        sb.append(this.a);
        sb.append(", quarkDirs=");
        sb.append(this.b);
        sb.append(", deviceId=");
        sb.append(this.c);
        sb.append(", platformName=");
        sb.append(this.d);
        sb.append(", appVersion=");
        sb.append(this.e);
        sb.append(", aliceConfig=");
        sb.append(this.f);
        sb.append(", logLevel=");
        sb.append(this.g);
        sb.append(", language=");
        sb.append(this.h);
        sb.append(", additionalConfigPlaceholders=");
        sb.append(this.i);
        sb.append(", useCustomAuthentication=false, downloadSounds=false, hardwareRevision=null, enableSoundLogger=false, waitForAuthToRegister=false, hostConfig=");
        sb.append(this.j);
        sb.append(", deviceManufacturer=null, deviceFirmwareVersion=null, enableManualStreamingCompletion=");
        return x4e.i(sb, this.k, ", cookie=null, usePersistentConfigsCache=false, cachedSystemConfig=null)");
    }
}
