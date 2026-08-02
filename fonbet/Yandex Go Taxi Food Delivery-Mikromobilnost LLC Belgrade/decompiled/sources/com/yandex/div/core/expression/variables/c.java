package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.Div2View;
import defpackage.aw5;
import defpackage.bvf0;
import defpackage.c231;
import defpackage.f1k;
import defpackage.gtq0;
import defpackage.jl11;
import defpackage.jl40;
import defpackage.m6o;
import defpackage.omk;
import defpackage.tls;
import defpackage.tvo;
import defpackage.zmk;
import defpackage.zy11;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public abstract class c {
    public final m6o a;

    public c(m6o m6oVar) {
        this.a = m6oVar;
    }

    public final f1k a(final aw5 aw5Var, final String str, final jl11 jl11Var) {
        tvo y;
        final Div2View div2View = aw5Var.a;
        omk omkVar = div2View.get_divData();
        if (omkVar == null || (y = bvf0.y(aw5Var.b)) == null) {
            return f1k.O1;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        zmk dataTag = div2View.getDataTag();
        jl11Var.e(new tls() { // from class: com.yandex.div.core.expression.variables.TwoWayVariableBinder$bindVariable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                if (!jl40.l(Ref$ObjectRef.this.element, obj)) {
                    Ref$ObjectRef.this.element = obj;
                    gtq0.P(div2View, str, this.b(obj), aw5Var.b);
                }
                return zy11.a;
            }
        });
        return y.d.l(str, this.a.a(omkVar, dataTag), true, new tls() { // from class: com.yandex.div.core.expression.variables.TwoWayVariableBinder$bindVariable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                Object d = ((c231) obj).d();
                T t = d;
                if (d == null) {
                    t = 0;
                }
                if (!jl40.l(Ref$ObjectRef.this.element, t)) {
                    Ref$ObjectRef.this.element = t;
                    jl11Var.a(t);
                }
                return zy11.a;
            }
        });
    }

    public abstract String b(Object obj);
}
