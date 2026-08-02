package com.yandex.div.data;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEvaluableType;
import defpackage.c231;
import defpackage.f1k;
import defpackage.rtf0;
import defpackage.sls;
import defpackage.tls;
import defpackage.wrr;
import defpackage.zy11;

/* loaded from: classes11.dex */
public final class a extends c231 {
    public final String b;
    public final DivEvaluableType c;
    public volatile wrr d;

    public a(String str, DivEvaluableType divEvaluableType, wrr wrrVar) {
        this.b = str;
        this.c = divEvaluableType;
        this.d = wrrVar;
    }

    @Override // defpackage.c231
    public final void a(tls tlsVar) {
        synchronized (this) {
            try {
                if (this.a.c == 0) {
                    wrr wrrVar = this.d;
                    wrrVar.A = ((rtf0) wrrVar.z).b((Expression) wrrVar.w, new sls() { // from class: com.yandex.div.data.Variable$PropertyVariable$addObserver$1$1
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            c231 c231Var = a.this;
                            c231Var.e(c231Var);
                            return zy11.a;
                        }
                    });
                }
                super.a(tlsVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.c231
    public final String c() {
        return this.b;
    }

    @Override // defpackage.c231
    public final void f(tls tlsVar) {
        synchronized (this) {
            super.f(tlsVar);
            if (this.a.c == 0) {
                wrr wrrVar = this.d;
                f1k f1kVar = (f1k) wrrVar.A;
                if (f1kVar != null) {
                    f1kVar.close();
                }
                wrrVar.A = null;
            }
        }
    }

    public final wrr j() {
        return this.d;
    }

    public final Expression k() {
        Expression expression;
        synchronized (this) {
            expression = (Expression) this.d.w;
        }
        return expression;
    }

    public final Object l() {
        Object c;
        synchronized (this) {
            wrr wrrVar = this.d;
            c = ((rtf0) wrrVar.z).c((Expression) wrrVar.w);
        }
        return c;
    }

    public final DivEvaluableType m() {
        return this.c;
    }

    public final void n(wrr wrrVar) {
        synchronized (this) {
            wrr wrrVar2 = this.d;
            f1k f1kVar = (f1k) wrrVar2.A;
            if (f1kVar != null) {
                f1kVar.close();
            }
            wrrVar2.A = null;
            this.d = wrrVar;
            if (!(this.a.c == 0)) {
                wrr wrrVar3 = this.d;
                wrrVar3.A = ((rtf0) wrrVar3.z).b((Expression) wrrVar3.w, new sls() { // from class: com.yandex.div.data.Variable$PropertyVariable$delegate$1$1
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        c231 c231Var = a.this;
                        c231Var.e(c231Var);
                        return zy11.a;
                    }
                });
            }
        }
    }

    public final void o(Object obj) {
        synchronized (this) {
            this.d.n(obj);
        }
    }
}
