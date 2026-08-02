package defpackage;

import java.util.Arrays;
import java.util.Map;
import kotlin.collections.b;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes5.dex */
public final class jn51 {
    public static final k8u c = new k8u(auu0.a, cm2.a, 1);
    public final lx4 a;
    public final wnt b;

    public jn51(lx4 lx4Var, wnt wntVar) {
        this.a = lx4Var;
        this.b = wntVar;
    }

    public final void a(String[] strArr) {
        Map f;
        if (strArr.length == 0) {
            xby.l(jst.e, "YangoBusiness.Analytics.Empty", null, null, "empty JsFunctionParams", 6);
            return;
        }
        String str = strArr[0];
        int length = strArr.length;
        if (length == 1) {
            f = b.f();
        } else if (length != 2) {
            xby.l(jst.e, "YangoBusiness.Analytics.Error", null, null, "unexpected JsFunctionParams size, throwable = content: ".concat(Arrays.toString(strArr)), 6);
            return;
        } else {
            f = (Map) ((xnt) this.b).c(strArr[1], c);
        }
        i d = ((j) this.a).d(str);
        d.h(f);
        d.m();
    }
}
