package defpackage;

import android.graphics.Bitmap;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* loaded from: classes6.dex */
public final class jcj implements v1g0 {
    public final wnt a;
    public final h3y b;
    public final h3y c;

    public jcj(wnt wntVar, h3y h3yVar, h3y h3yVar2) {
        this.a = wntVar;
        this.b = h3yVar;
        this.c = h3yVar2;
    }

    @Override // defpackage.v1g0
    public final boolean a(Map map) {
        String str;
        if (!"diagnostic_mode".equals((String) map.get("type"))) {
            return false;
        }
        String str2 = (String) map.get("msg");
        String str3 = (String) map.get("extra");
        KSerializer serializer = ocj.Companion.serializer();
        wnt wntVar = this.a;
        ocj ocjVar = (ocj) r85.c(wntVar, str3, serializer);
        if (ocjVar == null || (str = ocjVar.b) == null) {
            str = "";
        }
        ((xk60) this.b.get()).o(new dt20(str2, str, "default", (Bitmap) null), r85.a(wntVar, map), r85.b(map));
        ((dne0) this.c.get()).b().u("FIELD_DIAGNOSTIC_MODE_ENABLED", true);
        return true;
    }
}
