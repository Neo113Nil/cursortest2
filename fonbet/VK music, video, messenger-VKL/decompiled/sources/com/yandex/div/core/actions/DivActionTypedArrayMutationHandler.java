package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.k0;
import java.util.List;
import org.json.JSONArray;
import xsna.izs;
import xsna.mhn;
import xsna.rhn;
import xsna.s3q0;
import xsna.swe0;
import xsna.whn;

/* compiled from: DivActionTypedArrayMutationHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedArrayMutationHandler implements DivActionTypedHandler {
    private final void handle(mhn mhnVar, final Div2View div2View, ExpressionResolver expressionResolver) {
        final String evaluate = mhnVar.c.evaluate(expressionResolver);
        Expression<Long> expression = mhnVar.a;
        final Integer valueOf = expression != null ? Integer.valueOf((int) expression.evaluate(expressionResolver).longValue()) : null;
        final Object evaluate2 = DivActionTypedUtilsKt.evaluate(mhnVar.b, expressionResolver);
        DivActionTypedArrayMutationHandlerKt.updateVariable(div2View, evaluate, expressionResolver, new izs<JSONArray, JSONArray>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public final JSONArray invoke(JSONArray jSONArray) {
                JSONArray mutate;
                JSONArray mutate2;
                int length = jSONArray.length();
                Integer num = valueOf;
                if (num == null || num.intValue() == length) {
                    final Object obj = evaluate2;
                    mutate = DivActionTypedArrayMutationHandlerKt.mutate(jSONArray, new izs<List<Object>, s3q0>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // xsna.izs
                        public /* bridge */ /* synthetic */ s3q0 invoke(List<Object> list) {
                            invoke2(list);
                            return s3q0.a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<Object> list) {
                            list.add(obj);
                        }
                    });
                    return mutate;
                }
                if (swe0.q(0, length).e(num.intValue())) {
                    final Integer num2 = valueOf;
                    final Object obj2 = evaluate2;
                    mutate2 = DivActionTypedArrayMutationHandlerKt.mutate(jSONArray, new izs<List<Object>, s3q0>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // xsna.izs
                        public /* bridge */ /* synthetic */ s3q0 invoke(List<Object> list) {
                            invoke2(list);
                            return s3q0.a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<Object> list) {
                            list.add(num2.intValue(), obj2);
                        }
                    });
                    return mutate2;
                }
                DivActionTypedUtilsKt.logError(div2View, new IndexOutOfBoundsException("Index out of bound (" + valueOf + ") for mutation " + evaluate + " (" + length + ')'));
                return jSONArray;
            }
        });
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        if (k0Var instanceof k0.c) {
            handle(((k0.c) k0Var).b, div2View, expressionResolver);
            return true;
        }
        if (k0Var instanceof k0.d) {
            handle(((k0.d) k0Var).b, div2View, expressionResolver);
            return true;
        }
        if (!(k0Var instanceof k0.e)) {
            return false;
        }
        handle(((k0.e) k0Var).b, div2View, expressionResolver);
        return true;
    }

    private final void handle(rhn rhnVar, final Div2View div2View, ExpressionResolver expressionResolver) {
        final String evaluate = rhnVar.b.evaluate(expressionResolver);
        final int longValue = (int) rhnVar.a.evaluate(expressionResolver).longValue();
        DivActionTypedArrayMutationHandlerKt.updateVariable(div2View, evaluate, expressionResolver, new izs<JSONArray, JSONArray>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public final JSONArray invoke(JSONArray jSONArray) {
                JSONArray mutate;
                int length = jSONArray.length();
                final int i = longValue;
                if (i >= 0 && i < length) {
                    mutate = DivActionTypedArrayMutationHandlerKt.mutate(jSONArray, new izs<List<Object>, s3q0>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // xsna.izs
                        public /* bridge */ /* synthetic */ s3q0 invoke(List<Object> list) {
                            invoke2(list);
                            return s3q0.a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<Object> list) {
                            list.remove(i);
                        }
                    });
                    return mutate;
                }
                DivActionTypedUtilsKt.logError(div2View, new IndexOutOfBoundsException("Index out of bound (" + longValue + ") for mutation " + evaluate + " (" + length + ')'));
                return jSONArray;
            }
        });
    }

    private final void handle(whn whnVar, final Div2View div2View, ExpressionResolver expressionResolver) {
        final String evaluate = whnVar.c.evaluate(expressionResolver);
        final int longValue = (int) whnVar.a.evaluate(expressionResolver).longValue();
        final Object evaluate2 = DivActionTypedUtilsKt.evaluate(whnVar.b, expressionResolver);
        DivActionTypedArrayMutationHandlerKt.updateVariable(div2View, evaluate, expressionResolver, new izs<JSONArray, JSONArray>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public final JSONArray invoke(JSONArray jSONArray) {
                JSONArray mutate;
                int length = jSONArray.length();
                final int i = longValue;
                if (i >= 0 && i < length) {
                    final Object obj = evaluate2;
                    mutate = DivActionTypedArrayMutationHandlerKt.mutate(jSONArray, new izs<List<Object>, s3q0>() { // from class: com.yandex.div.core.actions.DivActionTypedArrayMutationHandler$handle$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // xsna.izs
                        public /* bridge */ /* synthetic */ s3q0 invoke(List<Object> list) {
                            invoke2(list);
                            return s3q0.a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<Object> list) {
                            list.set(i, obj);
                        }
                    });
                    return mutate;
                }
                DivActionTypedUtilsKt.logError(div2View, new IndexOutOfBoundsException("Index out of bound (" + longValue + ") for mutation " + evaluate + " (" + length + ')'));
                return jSONArray;
            }
        });
    }
}
