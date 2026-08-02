package defpackage;

import com.yandex.go.order.external.unifiedpolling.dto.EatsOrderDto;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public final class efn {
    public final k7x0 a;
    public final uen b = new uen();
    public final ofn c = new ofn();
    public final gfn d = new gfn();
    public final cwq0 e = new cwq0();

    public efn(k7x0 k7x0Var) {
        this.a = k7x0Var;
    }

    public static pen a(EatsOrderDto.Button button) {
        if (button == null || (button.getA() == null && button.getB() == null)) {
            return null;
        }
        String a = button.getA();
        String b = button.getB();
        String c = button.getC();
        String d = button.getD();
        EatsOrderDto.WebCustomTabsActionDto e = button.getE();
        qen qenVar = e != null ? new qen(e.getA(), e.getB()) : null;
        Map f = button.getF();
        if (f == null) {
            f = b.f();
        }
        return new pen(a, b, c, d, qenVar, f);
    }
}
