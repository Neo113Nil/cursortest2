package com.yandex.div.state;

import defpackage.jl40;
import defpackage.tls;
import defpackage.ycc;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class a {
    public final Map a = Collections.synchronizedMap(new LinkedHashMap());
    public final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public final void a(final String str) {
        this.b.remove(str);
        ycc.v(this.a.keySet(), new tls() { // from class: com.yandex.div.state.InMemoryDivStateCache$resetCard$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return Boolean.valueOf(jl40.l(((Pair) obj).c(), str));
            }
        }, true);
    }
}
