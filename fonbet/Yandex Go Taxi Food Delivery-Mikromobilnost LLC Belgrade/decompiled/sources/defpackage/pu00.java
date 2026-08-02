package defpackage;

import java.io.InputStream;
import java.util.Map;

/* loaded from: classes9.dex */
public final class pu00 implements yu00 {
    public final /* synthetic */ ie7 a;

    public pu00(ie7 ie7Var) {
        this.a = ie7Var;
    }

    @Override // defpackage.yu00
    public final Object a(Map map, InputStream inputStream) {
        return kp50.b(map, new in2(10, this.a, map, inputStream));
    }

    @Override // defpackage.yu00
    public final Object b(Map map, InputStream inputStream, wu00 wu00Var) {
        return kp50.b(map, new jo0(this.a, map, inputStream, wu00Var, 19));
    }
}
