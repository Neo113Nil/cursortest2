package com.yandex.div.json.expressions;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.json.ParsingException;
import defpackage.bdo;
import defpackage.eg90;
import defpackage.f1k;
import defpackage.fg90;
import defpackage.jdo;
import defpackage.mpb1;
import defpackage.q5z;
import defpackage.r131;
import defpackage.rvo;
import defpackage.sls;
import defpackage.tls;
import defpackage.vm11;
import defpackage.wjd;
import defpackage.wm11;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class a extends Expression {
    public final String a;
    public final String b;
    public final tls c;
    public final r131 d;
    public final eg90 e;
    public final vm11 f;
    public final Expression g;
    public final String h;
    public bdo i;
    public Object j;

    public a(String str, String str2, tls tlsVar, r131 r131Var, eg90 eg90Var, vm11 vm11Var, Expression expression) {
        this.a = str;
        this.b = str2;
        this.c = tlsVar;
        this.d = r131Var;
        this.e = eg90Var;
        this.f = vm11Var;
        this.g = expression;
        this.h = str2;
    }

    @Override // com.yandex.div.json.expressions.Expression
    public final Object a(rvo rvoVar) {
        Object a;
        try {
            Object j = j(rvoVar);
            this.j = j;
            return j;
        } catch (ParsingException e) {
            String message = e.getMessage();
            eg90 eg90Var = this.e;
            if (message != null && message.length() != 0) {
                eg90Var.a(e);
                rvoVar.c(e);
            }
            Object obj = this.j;
            if (obj != null) {
                return obj;
            }
            try {
                Expression expression = this.g;
                if (expression == null || (a = expression.a(rvoVar)) == null) {
                    return this.f.q();
                }
                this.j = a;
                return a;
            } catch (ParsingException e2) {
                eg90Var.a(e2);
                rvoVar.c(e2);
                throw e2;
            }
        }
    }

    @Override // com.yandex.div.json.expressions.Expression
    public final Object b() {
        return this.h;
    }

    @Override // com.yandex.div.json.expressions.Expression
    public final f1k c(final rvo rvoVar, final tls tlsVar) {
        List list;
        List list2;
        String str = this.b;
        try {
            list = f().c();
        } catch (Exception e) {
            ParsingException i = fg90.i(this.a, str, e);
            this.e.a(i);
            rvoVar.c(i);
            list = EmptyList.a;
        }
        List<jdo> e2 = e();
        if (list.isEmpty() && ((list2 = e2) == null || list2.isEmpty())) {
            return f1k.O1;
        }
        final sls slsVar = new sls() { // from class: com.yandex.div.json.expressions.Expression$MutableExpression$observe$callbackWithValue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tls.this.invoke(this.a(rvoVar));
                return zy11.a;
            }
        };
        f1k a = rvoVar.a(str, list, slsVar);
        List list3 = e2;
        if (list3 == null || list3.isEmpty()) {
            return a;
        }
        final wjd wjdVar = new wjd();
        mpb1.e(wjdVar, a);
        mpb1.e(wjdVar, h(e2, rvoVar, slsVar));
        for (final jdo jdoVar : e2) {
            final a aVar = this;
            final rvo rvoVar2 = rvoVar;
            sls slsVar2 = new sls() { // from class: com.yandex.div.json.expressions.Expression$MutableExpression$observe$1$dynamicVarCallback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    wjd wjdVar2 = wjd.this;
                    a aVar2 = aVar;
                    jdo jdoVar2 = jdoVar;
                    rvo rvoVar3 = rvoVar2;
                    sls slsVar3 = slsVar;
                    String i2 = aVar2.i(jdoVar2, rvoVar3);
                    wjdVar2.a(i2 == null ? f1k.O1 : rvoVar3.a(aVar2.b, Collections.singletonList(i2), slsVar3));
                    return zy11.a;
                }
            };
            mpb1.e(wjdVar, rvoVar2.a(jdoVar.toString(), jdoVar.c(), slsVar2));
            mpb1.e(wjdVar, aVar.h(jdoVar.b(), rvoVar2, slsVar2));
            this = aVar;
            rvoVar = rvoVar2;
        }
        return wjdVar;
    }

    public final List e() {
        Object failure;
        try {
            bdo bdoVar = this.i;
            failure = bdoVar != null ? bdoVar.b() : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (List) (failure instanceof Result.Failure ? null : failure);
    }

    public final jdo f() {
        String str = this.b;
        bdo bdoVar = this.i;
        if (bdoVar != null) {
            return bdoVar;
        }
        try {
            Set set = jdo.c;
            bdo bdoVar2 = new bdo(str);
            this.i = bdoVar2;
            return bdoVar2;
        } catch (EvaluableException e) {
            throw fg90.i(this.a, str, e);
        }
    }

    public final List g(rvo rvoVar) {
        List list;
        ArrayList arrayList;
        try {
            list = f().c();
        } catch (Exception e) {
            ParsingException i = fg90.i(this.a, this.b, e);
            this.e.a(i);
            rvoVar.c(i);
            list = EmptyList.a;
        }
        List e2 = e();
        if (e2 != null) {
            arrayList = new ArrayList();
            Iterator it = e2.iterator();
            while (it.hasNext()) {
                String i2 = i((jdo) it.next(), rvoVar);
                if (i2 != null) {
                    arrayList.add(i2);
                }
            }
        } else {
            arrayList = null;
        }
        return (arrayList == null || arrayList.isEmpty()) ? list : kotlin.collections.a.m0(arrayList, list);
    }

    public final f1k h(List list, rvo rvoVar, sls slsVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String i = i((jdo) it.next(), rvoVar);
            if (i != null) {
                arrayList.add(i);
            }
        }
        return arrayList.isEmpty() ? f1k.O1 : rvoVar.a(this.b, arrayList, slsVar);
    }

    public final String i(jdo jdoVar, rvo rvoVar) {
        return (String) rvoVar.b(this.a, jdoVar.toString(), jdoVar, q5z.c, q5z.b, wm11.c, this.e);
    }

    public final Object j(rvo rvoVar) {
        Object b = rvoVar.b(this.a, this.b, f(), this.c, this.d, this.f, this.e);
        String str = this.b;
        String str2 = this.a;
        if (b == null) {
            throw fg90.i(str2, str, null);
        }
        if (this.f.t(b)) {
            return b;
        }
        throw fg90.k(str2, str, b, null);
    }
}
