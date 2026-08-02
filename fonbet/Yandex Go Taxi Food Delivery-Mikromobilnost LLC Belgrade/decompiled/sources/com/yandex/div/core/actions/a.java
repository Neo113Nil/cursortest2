package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import defpackage.c231;
import defpackage.ej91;
import defpackage.gi91;
import defpackage.gtq0;
import defpackage.j4k;
import defpackage.jbk;
import defpackage.nbk;
import defpackage.o4k;
import defpackage.oak;
import defpackage.pak;
import defpackage.qak;
import defpackage.rvo;
import defpackage.t131;
import defpackage.t4k;
import defpackage.tls;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.List;
import org.json.JSONArray;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class a implements nbk {
    @Override // defpackage.nbk
    public final boolean a(String str, jbk jbkVar, final Div2View div2View, rvo rvoVar) {
        if (jbkVar instanceof oak) {
            j4k j4kVar = ((oak) jbkVar).b;
            final String str2 = (String) j4kVar.c.a(rvoVar);
            Expression expression = j4kVar.a;
            final Integer valueOf = expression != null ? Integer.valueOf((int) ((Number) expression.a(rvoVar)).longValue()) : null;
            final Object e = ej91.e(j4kVar.b, rvoVar);
            final tls tlsVar = new tls() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    JSONArray jSONArray = (JSONArray) obj;
                    int length = jSONArray.length();
                    Integer num = valueOf;
                    if (num == null || num.intValue() == length) {
                        final Object obj2 = e;
                        return gi91.a(jSONArray, new tls() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj3) {
                                ((List) obj3).add(obj2);
                                return zy11.a;
                            }
                        });
                    }
                    if (y6i0.n(0, length).g(num.intValue())) {
                        final Integer num2 = valueOf;
                        final Object obj3 = e;
                        return gi91.a(jSONArray, new tls() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj4) {
                                ((List) obj4).add(num2.intValue(), obj3);
                                return zy11.a;
                            }
                        });
                    }
                    div2View.logError(new IndexOutOfBoundsException("Index out of bound (" + valueOf + ") for mutation " + str2 + Extension.O_BRAKE_SPACE + length + ')'));
                    return jSONArray;
                }
            };
            gtq0.Q(div2View, str2, rvoVar, new tls() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandlerKt$updateVariable$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    c231 c231Var = (c231) obj;
                    if (!(c231Var instanceof t131)) {
                        Div2View.this.getView().logError(new IllegalArgumentException("Action requires array variable"));
                        return c231Var;
                    }
                    Object d = c231Var.d();
                    JSONArray jSONArray = d instanceof JSONArray ? (JSONArray) d : null;
                    if (jSONArray == null) {
                        Div2View.this.getView().logError(new IllegalArgumentException("Invalid variable value"));
                        return c231Var;
                    }
                    ((t131) c231Var).k((JSONArray) tlsVar.invoke(jSONArray));
                    return c231Var;
                }
            });
            return true;
        }
        if (jbkVar instanceof pak) {
            o4k o4kVar = ((pak) jbkVar).b;
            final String str3 = (String) o4kVar.b.a(rvoVar);
            final int longValue = (int) ((Number) o4kVar.a.a(rvoVar)).longValue();
            final tls tlsVar2 = new tls() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    JSONArray jSONArray = (JSONArray) obj;
                    int length = jSONArray.length();
                    final int i = longValue;
                    if (i >= 0 && i < length) {
                        return gi91.a(jSONArray, new tls() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj2) {
                                ((List) obj2).remove(i);
                                return zy11.a;
                            }
                        });
                    }
                    div2View.logError(new IndexOutOfBoundsException("Index out of bound (" + longValue + ") for mutation " + str3 + Extension.O_BRAKE_SPACE + length + ')'));
                    return jSONArray;
                }
            };
            gtq0.Q(div2View, str3, rvoVar, new tls() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandlerKt$updateVariable$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    c231 c231Var = (c231) obj;
                    if (!(c231Var instanceof t131)) {
                        Div2View.this.getView().logError(new IllegalArgumentException("Action requires array variable"));
                        return c231Var;
                    }
                    Object d = c231Var.d();
                    JSONArray jSONArray = d instanceof JSONArray ? (JSONArray) d : null;
                    if (jSONArray == null) {
                        Div2View.this.getView().logError(new IllegalArgumentException("Invalid variable value"));
                        return c231Var;
                    }
                    ((t131) c231Var).k((JSONArray) tlsVar2.invoke(jSONArray));
                    return c231Var;
                }
            });
            return true;
        }
        if (!(jbkVar instanceof qak)) {
            return false;
        }
        t4k t4kVar = ((qak) jbkVar).b;
        final String str4 = (String) t4kVar.c.a(rvoVar);
        final int longValue2 = (int) ((Number) t4kVar.a.a(rvoVar)).longValue();
        final Object e2 = ej91.e(t4kVar.b, rvoVar);
        final tls tlsVar3 = new tls() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                final int i = longValue2;
                if (i >= 0 && i < length) {
                    final Object obj2 = e2;
                    return gi91.a(jSONArray, new tls() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            ((List) obj3).set(i, obj2);
                            return zy11.a;
                        }
                    });
                }
                div2View.logError(new IndexOutOfBoundsException("Index out of bound (" + longValue2 + ") for mutation " + str4 + Extension.O_BRAKE_SPACE + length + ')'));
                return jSONArray;
            }
        };
        gtq0.Q(div2View, str4, rvoVar, new tls() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandlerKt$updateVariable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                c231 c231Var = (c231) obj;
                if (!(c231Var instanceof t131)) {
                    Div2View.this.getView().logError(new IllegalArgumentException("Action requires array variable"));
                    return c231Var;
                }
                Object d = c231Var.d();
                JSONArray jSONArray = d instanceof JSONArray ? (JSONArray) d : null;
                if (jSONArray == null) {
                    Div2View.this.getView().logError(new IllegalArgumentException("Invalid variable value"));
                    return c231Var;
                }
                ((t131) c231Var).k((JSONArray) tlsVar3.invoke(jSONArray));
                return c231Var;
            }
        });
        return true;
    }
}
