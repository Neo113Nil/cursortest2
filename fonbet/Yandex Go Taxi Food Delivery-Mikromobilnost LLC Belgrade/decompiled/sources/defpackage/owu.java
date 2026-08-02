package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.plus.core.network.okhttp.interceptor.a;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes2.dex */
public abstract class owu {
    public static final Map a = b.i(new Pair("http", 80), new Pair(Constants.SCHEME, 443));

    public static final a a(uh21 uh21Var) {
        return new a(new com.yandex.plus.core.network.uri.b(new com.yandex.plus.core.network.uri.a(new pg21(uh21Var))));
    }
}
