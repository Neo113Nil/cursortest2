package xsna;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import xsna.v55;

/* compiled from: AuthPlainTokenDataSource.kt */
/* loaded from: classes5.dex */
public final class x55 extends Lambda implements izs<v55.a, v55.a> {
    final /* synthetic */ String $app;
    final /* synthetic */ String $token;
    final /* synthetic */ v55 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x55(v55 v55Var, String str, String str2) {
        super(1);
        this.this$0 = v55Var;
        this.$app = str;
        this.$token = str2;
    }

    @Override // xsna.izs
    public final v55.a invoke(v55.a aVar) {
        Map b;
        v55.a aVar2 = aVar;
        Map<String, String> map = aVar2 != null ? aVar2.a : null;
        v55 v55Var = this.this$0;
        String str = this.$app;
        String str2 = this.$token;
        if (map != null) {
            b = new LinkedHashMap(map);
            v55Var.getClass();
            b.put(v55.b(str), str2);
        } else {
            v55Var.getClass();
            b = dt.b(v55.b(str), str2);
        }
        return new v55.a(b);
    }
}
