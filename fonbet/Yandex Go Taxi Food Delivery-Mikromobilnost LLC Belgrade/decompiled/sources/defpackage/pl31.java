package defpackage;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.Timebase;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class pl31 implements vhw0 {
    public static final Size z = new Size(1280, 720);
    public final String a;
    public final Timebase b;
    public final i94 c;
    public final Size w;
    public final q8n x;
    public final Range y;

    public pl31(String str, Timebase timebase, i94 i94Var, Size size, q8n q8nVar, Range range) {
        this.a = str;
        this.b = timebase;
        this.c = i94Var;
        this.w = size;
        this.x = q8nVar;
        this.y = range;
    }

    @Override // defpackage.vhw0
    public final Object get() {
        Integer num;
        Range range = this.y;
        i94 i94Var = this.c;
        t38 b = ll31.b(i94Var, range);
        sgb1.g(3, "VidEncCfgDefaultRslvr");
        Range range2 = i94Var.c;
        sgb1.g(3, "VidEncCfgDefaultRslvr");
        q8n q8nVar = this.x;
        int i = q8nVar.b;
        int i2 = b.b;
        Size size = this.w;
        int width = size.getWidth();
        Size size2 = z;
        int d = ll31.d(14000000, i, 8, i2, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight(), range2);
        HashMap hashMap = t8n.e;
        String str = this.a;
        Map map = (Map) hashMap.get(str);
        int intValue = (map == null || (num = (Integer) map.get(q8nVar)) == null) ? -1 : num.intValue();
        e94 a = ll31.a(intValue, str);
        m d2 = d94.d();
        if (str == null) {
            ny61.t("Null mimeType");
            return null;
        }
        d2.a = str;
        Timebase timebase = this.b;
        if (timebase == null) {
            ny61.t("Null inputTimebase");
            return null;
        }
        d2.c = timebase;
        d2.d = size;
        d2.j = Integer.valueOf(d);
        d2.g = Integer.valueOf(b.a);
        d2.h = Integer.valueOf(b.b);
        d2.b = Integer.valueOf(intValue);
        d2.f = a;
        return d2.a();
    }
}
