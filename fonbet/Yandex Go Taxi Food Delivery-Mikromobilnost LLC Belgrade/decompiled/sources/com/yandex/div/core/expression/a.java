package com.yandex.div.core.expression;

import com.yandex.div.core.expression.variables.b;
import defpackage.br60;
import defpackage.c231;
import defpackage.f231;
import defpackage.sls;
import defpackage.tls;
import defpackage.tvo;
import defpackage.yuf0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {
    public final tvo a;
    public final b b;
    public final yuf0 c;
    public boolean d = true;

    public a(tvo tvoVar, b bVar, yuf0 yuf0Var) {
        this.a = tvoVar;
        this.b = bVar;
        this.c = yuf0Var;
    }

    public final void a() {
        if (this.d) {
            this.d = false;
            final tvo tvoVar = this.a;
            f231 f231Var = tvoVar.d;
            f231Var.h(tvoVar, new tls() { // from class: com.yandex.div.core.expression.ExpressionResolverImpl$subscribeOnVariables$1
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    Set set = (Set) tvo.this.i.get(((c231) obj).c());
                    List J0 = set != null ? kotlin.collections.a.J0(set) : null;
                    if (J0 != null) {
                        tvo tvoVar2 = tvo.this;
                        Iterator it = J0.iterator();
                        while (it.hasNext()) {
                            tvoVar2.h.remove((String) it.next());
                        }
                    }
                    if (J0 != null) {
                        tvo tvoVar3 = tvo.this;
                        Iterator it2 = J0.iterator();
                        while (it2.hasNext()) {
                            br60 br60Var = (br60) tvoVar3.j.get((String) it2.next());
                            if (br60Var != null) {
                                Iterator it3 = br60Var.iterator();
                                while (it3.hasNext()) {
                                    ((sls) it3.next()).invoke();
                                }
                            }
                        }
                    }
                    return zy11.a;
                }
            });
            f231Var.j();
        }
    }
}
