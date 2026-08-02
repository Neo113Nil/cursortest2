package ru.rustore.sdk.review;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.core.config.a;
import xsna.bpn0;
import xsna.djz0;
import xsna.e4z0;
import xsna.fo50;
import xsna.gzs;
import xsna.pn00;

/* loaded from: classes9.dex */
public final class f {
    public final e4z0 a;
    public final djz0 b;
    public final bpn0 c = new bpn0(new a());

    public static final class a extends Lambda implements gzs<Map<String, ? extends String>> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final Map<String, ? extends String> invoke() {
            fo50 fo50Var = f.this.b.a;
            return pn00.k(new Pair("sdkName", "ru.rustore.sdk:review"), new Pair("sdkType", a.C2396a.a().a.h()), new Pair("sdkVersion", "6.1.0"));
        }
    }

    public f(e4z0 e4z0Var, djz0 djz0Var) {
        this.a = e4z0Var;
        this.b = djz0Var;
    }
}
