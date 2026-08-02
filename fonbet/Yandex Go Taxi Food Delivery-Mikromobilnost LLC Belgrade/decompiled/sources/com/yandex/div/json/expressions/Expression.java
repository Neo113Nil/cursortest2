package com.yandex.div.json.expressions;

import com.yandex.div.json.ParsingException;
import defpackage.f1k;
import defpackage.jl40;
import defpackage.rvo;
import defpackage.tls;

/* loaded from: classes.dex */
public abstract class Expression {
    public abstract Object a(rvo rvoVar);

    public abstract Object b();

    public abstract f1k c(rvo rvoVar, tls tlsVar);

    public f1k d(rvo rvoVar, tls tlsVar) {
        Object obj;
        try {
            obj = a(rvoVar);
        } catch (ParsingException unused) {
            obj = null;
        }
        if (obj != null) {
            tlsVar.invoke(obj);
        }
        return c(rvoVar, tlsVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Expression) {
            return jl40.l(b(), ((Expression) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode() * 16;
    }
}
