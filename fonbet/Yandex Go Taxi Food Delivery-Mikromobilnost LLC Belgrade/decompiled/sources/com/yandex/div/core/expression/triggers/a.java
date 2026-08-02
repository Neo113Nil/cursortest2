package com.yandex.div.core.expression.triggers;

import com.yandex.div.core.c;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivTrigger$Mode;
import defpackage.b1s0;
import defpackage.f1k;
import defpackage.fu11;
import defpackage.l6o;
import defpackage.ngd0;
import defpackage.oyr;
import defpackage.sls;
import defpackage.tls;
import defpackage.tvo;
import defpackage.unr0;
import defpackage.v3k;
import defpackage.xe11;
import defpackage.z0k;
import defpackage.zy11;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a {
    public final com.yandex.div.json.expressions.a a;
    public final List b;
    public final Expression c;
    public final tvo d;
    public final l6o e;
    public final c f;
    public f1k h;
    public f1k k;
    public f1k l;
    public f1k m;
    public final LinkedHashSet n;
    public final tls g = new tls() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$changeTrigger$1
        {
            super(1);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            a.this.c();
            return zy11.a;
        }
    };
    public DivTrigger$Mode i = DivTrigger$Mode.ON_CONDITION;
    public final WeakHashMap j = new WeakHashMap();

    public a(com.yandex.div.json.expressions.a aVar, List list, Expression expression, tvo tvoVar, l6o l6oVar, c cVar) {
        this.a = aVar;
        this.b = list;
        this.c = expression;
        this.d = tvoVar;
        this.e = l6oVar;
        this.f = cVar;
        this.h = expression.d(tvoVar, new tls() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$modeObserver$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                a.this.i = (DivTrigger$Mode) obj;
                return zy11.a;
            }
        });
        z0k z0kVar = f1k.O1;
        this.k = z0kVar;
        this.l = z0kVar;
        this.m = z0kVar;
        this.n = new LinkedHashSet();
    }

    public static final void a(a aVar, Div2View div2View) {
        RuntimeException runtimeException;
        Div2View div2View2;
        aVar.getClass();
        tvo tvoVar = aVar.d;
        if (div2View.getInMiddleOfBind()) {
            aVar.m.close();
            xe11 xe11Var = new xe11(aVar, div2View);
            aVar.m = new b1s0(xe11Var, 2, div2View);
            div2View.addPersistentDivDataObserver$div_release(xe11Var);
            return;
        }
        WeakHashMap weakHashMap = aVar.j;
        com.yandex.div.json.expressions.a aVar2 = aVar.a;
        String str = aVar2.h;
        try {
            Boolean bool = (Boolean) aVar2.a(tvoVar);
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = (Boolean) weakHashMap.get(div2View);
            if (bool2 == null) {
                bool2 = Boolean.FALSE;
            }
            boolean booleanValue2 = bool2.booleanValue();
            weakHashMap.put(div2View, bool);
            if (booleanValue) {
                if (aVar.i == DivTrigger$Mode.ON_CONDITION && booleanValue2) {
                    return;
                }
                c cVar = aVar.f;
                List<v3k> list = aVar.b;
                cVar.getClass();
                for (v3k v3kVar : list) {
                    if (((Boolean) v3kVar.b.a(tvoVar)).booleanValue()) {
                        div2View2 = div2View;
                        c.b(cVar, div2View2, tvoVar, v3kVar, "trigger", null, 48);
                    } else {
                        div2View2 = div2View;
                    }
                    div2View = div2View2;
                }
            }
        } catch (Exception e) {
            if (e instanceof ClassCastException) {
                runtimeException = new RuntimeException(oyr.p("Condition evaluated in non-boolean result! (expression: '", str, "')"), e);
            } else {
                if (!(e instanceof EvaluableException)) {
                    throw e;
                }
                runtimeException = new RuntimeException(oyr.p("Condition evaluation failed! (expression: '", str, "')"), e);
            }
            aVar.e.e(runtimeException);
        }
    }

    public final void b() {
        boolean isEmpty = this.n.isEmpty();
        f1k f1kVar = this.h;
        if (isEmpty) {
            f1kVar.close();
            this.k.close();
            this.l.close();
            this.m.close();
            return;
        }
        f1kVar.close();
        tls tlsVar = this.g;
        com.yandex.div.json.expressions.a aVar = this.a;
        tvo tvoVar = this.d;
        this.k = aVar.c(tvoVar, tlsVar);
        this.l = tvoVar.d.e(aVar.g(tvoVar), new tls() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$startObserving$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                a aVar2 = a.this;
                aVar2.h.close();
                aVar2.k.close();
                aVar2.l.close();
                aVar2.m.close();
                return zy11.a;
            }
        });
        this.h = this.c.d(tvoVar, new tls() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$startObserving$2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                a.this.i = (DivTrigger$Mode) obj;
                return zy11.a;
            }
        });
        c();
    }

    public final void c() {
        for (final Div2View div2View : this.n) {
            ngd0 ngd0Var = ngd0.G;
            ngd0Var.p();
            fu11 fu11Var = fu11.a;
            if (!fu11Var.a()) {
                com.yandex.div.core.util.binding.a g = unr0.g(div2View, ngd0Var);
                if (!fu11Var.a()) {
                    g.c(new sls() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$tryTriggerActions$lambda$1$$inlined$runMainThreadAction$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            a.a(a.this, div2View);
                            return zy11.a;
                        }
                    });
                }
            }
            a(this, div2View);
        }
    }
}
