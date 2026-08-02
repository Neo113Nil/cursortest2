package defpackage;

import com.yandex.div.state.db.StateEntry;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class aj3 extends cj3 {
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aj3(int i, String str, String str2, String str3) {
        super("auth_header_update_error", r0.j());
        MapBuilder y = qv10.y(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка обновления заголовков авторизации");
        y.put("attempt", String.valueOf(i));
        y.put("base_url", str);
        y.put("handler_name", "Frontback403Status1004");
        y.put(StateEntry.COLUMN_PATH, str2);
        y.put(CRLReasonCodeExtension.REASON, "updateAuthHeaders returned null after successful token generation");
        y.put("request_id", str3);
        this.c = i;
        this.d = str;
        this.e = "Frontback403Status1004";
        this.f = str2;
        this.g = str3;
        this.h = "updateAuthHeaders returned null after successful token generation";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj3)) {
            return false;
        }
        aj3 aj3Var = (aj3) obj;
        return this.c == aj3Var.c && jl40.l(this.d, aj3Var.d) && jl40.l(this.e, aj3Var.e) && jl40.l(this.f, aj3Var.f) && jl40.l(this.g, aj3Var.g) && jl40.l(this.h, aj3Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(Integer.hashCode(this.c) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.c, "Error(attempt=", ", baseUrl=", this.d, ", handlerName=");
        g8e.D(v, this.e, ", path=", this.f, ", requestId=");
        return g8e.r(v, this.g, ", reason=", this.h, Extension.C_BRAKE);
    }
}
