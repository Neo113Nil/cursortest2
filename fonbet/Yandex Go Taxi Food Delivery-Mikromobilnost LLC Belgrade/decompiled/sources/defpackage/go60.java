package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class go60 extends ap3 {
    public final String a;
    public final String b;

    public go60(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.ap3
    public final Map b() {
        Pair pair = new Pair("X-YaTaxi-UserId", this.b);
        String str = this.a;
        return (str == null || evu0.J(str)) ? gw00.e(pair) : b.i(new Pair("Authorization", kp50.h(str)), pair);
    }
}
