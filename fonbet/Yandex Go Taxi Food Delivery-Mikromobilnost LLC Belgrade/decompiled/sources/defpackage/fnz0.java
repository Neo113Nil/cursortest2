package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class fnz0 extends keo {
    public final String c;
    public final String d;
    public final Long e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fnz0(String str, String str2, Long l) {
        super("token_generation_error", r0.j());
        MapBuilder y = qv10.y(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка генерации токена");
        if (str != null) {
        }
        y.put("error_type", str2);
        if (l != null) {
            y.put("uid", String.valueOf(l.longValue()));
        }
        this.c = str;
        this.d = str2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnz0)) {
            return false;
        }
        fnz0 fnz0Var = (fnz0) obj;
        return jl40.l(this.c, fnz0Var.c) && jl40.l(this.d, fnz0Var.d) && jl40.l(this.e, fnz0Var.e);
    }

    public final int hashCode() {
        String str = this.c;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.d);
        Long l = this.e;
        return b + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("TokenGenerationError(errorMessage=", this.c, ", errorType=", this.d, ", uid=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
