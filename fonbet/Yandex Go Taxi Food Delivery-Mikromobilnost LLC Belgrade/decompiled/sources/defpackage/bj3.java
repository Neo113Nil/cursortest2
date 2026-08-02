package defpackage;

import com.yandex.div.state.db.StateEntry;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes12.dex */
public final class bj3 extends cj3 {
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bj3(int i, String str, String str2, String str3) {
        super("auth_header_update_success", r0.j());
        MapBuilder y = qv10.y(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Успешное обновление заголовков авторизации");
        y.put("attempt", String.valueOf(i));
        y.put("base_url", str);
        y.put("handler_name", "Frontback403Status1004");
        y.put(StateEntry.COLUMN_PATH, str2);
        y.put("request_id", str3);
        this.c = i;
        this.d = str;
        this.e = "Frontback403Status1004";
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj3)) {
            return false;
        }
        bj3 bj3Var = (bj3) obj;
        return this.c == bj3Var.c && jl40.l(this.d, bj3Var.d) && jl40.l(this.e, bj3Var.e) && jl40.l(this.f, bj3Var.f) && jl40.l(this.g, bj3Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(unr0.b(unr0.b(Integer.hashCode(this.c) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.c, "Success(attempt=", ", baseUrl=", this.d, ", handlerName=");
        g8e.D(v, this.e, ", path=", this.f, ", requestId=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
