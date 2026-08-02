package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes6.dex */
public final class dtx {
    public static final /* synthetic */ kgx[] c = {new MutablePropertyReference1Impl("lastReceivedTags", 0, "getLastReceivedTags()Ljava/lang/String;", dtx.class)};
    public static final p53 d = new p53(auu0.a, 0);
    public final wnt a;
    public final iid0 b;

    public dtx(wnt wntVar, dne0 dne0Var) {
        this.a = wntVar;
        this.b = new iid0(dne0Var.a("last_received_tags_preferences"), "taxi.settings.preferenceslast_received_tags");
    }

    public final List a() {
        String str = (String) this.b.getValue(this, c[0]);
        if (str != null) {
            List list = (List) ((xnt) this.a).c(str, new p53(auu0.a, 0));
            if (list != null) {
                return list;
            }
        }
        return EmptyList.a;
    }
}
