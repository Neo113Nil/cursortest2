package com.yandex.div.json.expressions;

import com.yandex.div.json.ParsingException;
import defpackage.eg90;
import defpackage.f1k;
import defpackage.fg90;
import defpackage.pvo;
import defpackage.rvo;
import defpackage.sty;
import defpackage.tcc;
import defpackage.tls;
import defpackage.wjd;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements pvo {
    public final String a;
    public final ArrayList b;
    public final sty c;
    public final eg90 d;
    public ArrayList e;

    public b(String str, ArrayList arrayList, sty styVar, eg90 eg90Var) {
        this.a = str;
        this.b = arrayList;
        this.c = styVar;
        this.d = eg90Var;
    }

    @Override // defpackage.pvo
    public final List a(rvo rvoVar) {
        try {
            ArrayList c = c(rvoVar);
            this.e = c;
            return c;
        } catch (ParsingException e) {
            this.d.a(e);
            ArrayList arrayList = this.e;
            if (arrayList != null) {
                return arrayList;
            }
            throw e;
        }
    }

    @Override // defpackage.pvo
    public final f1k b(final rvo rvoVar, final tls tlsVar) {
        tls tlsVar2 = new tls() { // from class: com.yandex.div.json.expressions.MutableExpressionList$observe$itemCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                tls.this.invoke(this.a(rvoVar));
                return zy11.a;
            }
        };
        ArrayList arrayList = this.b;
        if (arrayList.size() == 1) {
            return ((Expression) kotlin.collections.a.P(arrayList)).c(rvoVar, tlsVar2);
        }
        wjd wjdVar = new wjd();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wjdVar.a(((Expression) it.next()).c(rvoVar, tlsVar2));
        }
        return wjdVar;
    }

    public final ArrayList c(rvo rvoVar) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Expression) it.next()).a(rvoVar));
        }
        if (this.c.b(arrayList2)) {
            return arrayList2;
        }
        throw fg90.c(arrayList2, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.b.equals(((b) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() * 16;
    }
}
