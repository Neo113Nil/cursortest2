package com.yandex.passport.data.network;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.k8u;
import defpackage.p53;
import defpackage.qje;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes8.dex */
public final class r5 {
    public static final q5 Companion = new q5();
    public static final KSerializer[] f;
    public final String a;
    public final m6 b;
    public final m6 c;
    public final List d;
    public final Map e;

    static {
        auu0 auu0Var = auu0.a;
        f = new KSerializer[]{null, null, null, new p53(auu0Var, 0), new k8u(auu0Var, v5.a, 1)};
    }

    public /* synthetic */ r5(int i, String str, m6 m6Var, m6 m6Var2, List list, Map map) {
        if (16 != (i & 16)) {
            qje.Z(i, 16, p5.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = m6Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = m6Var2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        this.e = map;
    }
}
