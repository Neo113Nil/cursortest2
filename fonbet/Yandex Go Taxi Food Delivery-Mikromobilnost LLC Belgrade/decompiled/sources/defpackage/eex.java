package defpackage;

import android.content.Context;
import com.yandex.go.utils.storage.json.a;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.utils.storage.b;

/* loaded from: classes8.dex */
public final class eex {
    public static final ike c = bvf0.a(jl40.a());
    public final Context a;
    public final wnt b;

    public eex(Context context, wnt wntVar) {
        this.a = context;
        this.b = wntVar;
    }

    public final a a(am2 am2Var, KSerializer kSerializer) {
        return new a(new b(kotlin.a.a(new in2(9, this, am2Var, kSerializer)), c), am2Var.c);
    }

    public final a b(am2 am2Var, KSerializer kSerializer) {
        return a(am2Var, new k8u(auu0.a, kSerializer, 1));
    }

    public final com.yandex.go.utils.storage.json.b c(am2 am2Var, KSerializer kSerializer) {
        return new com.yandex.go.utils.storage.json.b(new ru.yandex.taxi.utils.storage.a(kotlin.a.a(new in2(9, this, am2Var, kSerializer)), c), am2Var.c);
    }
}
