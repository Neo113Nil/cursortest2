package com.yandex.div.core.view2.divs;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.core.DivTreeVisitor;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.j3;
import com.yandex.div2.q4;
import com.yandex.div2.v9;
import java.util.ArrayList;
import java.util.List;
import xsna.ikn;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DivLayoutProviderVariablesHolder.kt */
/* loaded from: classes7.dex */
public final class DivLayoutProviderVariablesHolder extends DivTreeVisitor<s3q0> implements ExpressionSubscriber {
    private final List<String> changedVariables;
    private final List<Disposable> subscriptions;

    /* JADX WARN: Multi-variable type inference failed */
    public DivLayoutProviderVariablesHolder() {
        super(null, 1, 0 == true ? 1 : 0);
        this.changedVariables = new ArrayList();
        this.subscriptions = new ArrayList();
    }

    private final void observe(v9 v9Var, final ExpressionResolver expressionResolver) {
        Object b = v9Var.b();
        q4 q4Var = b instanceof q4 ? (q4) b : null;
        if (q4Var == null) {
            return;
        }
        Expression<Long> expression = q4Var.b;
        final Expression.MutableExpression mutableExpression = expression instanceof Expression.MutableExpression ? (Expression.MutableExpression) expression : null;
        if (mutableExpression == null) {
            return;
        }
        addSubscription(mutableExpression.observe(expressionResolver, new izs<Long, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivLayoutProviderVariablesHolder$observe$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Long l) {
                invoke(l.longValue());
                return s3q0.a;
            }

            public final void invoke(long j) {
                List list;
                list = DivLayoutProviderVariablesHolder.this.changedVariables;
                list.addAll(mutableExpression.getVariablesName(expressionResolver));
            }
        }));
    }

    private final void observeSize(ikn iknVar, ExpressionResolver expressionResolver) {
        observe(iknVar.getWidth(), expressionResolver);
        observe(iknVar.getHeight(), expressionResolver);
    }

    public final void clear() {
        this.changedVariables.clear();
    }

    public final boolean contains(String str) {
        return this.changedVariables.contains(str);
    }

    @Override // com.yandex.div.internal.core.DivTreeVisitor
    public /* bridge */ /* synthetic */ s3q0 defaultVisit(com.yandex.div2.a aVar, BindingContext bindingContext, DivStatePath divStatePath) {
        defaultVisit2(aVar, bindingContext, divStatePath);
        return s3q0.a;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    public final void observeDivData(j3 j3Var, BindingContext bindingContext) {
        for (j3.b bVar : j3Var.c) {
            visit(bVar.a, bindingContext, DivStatePath.Companion.fromState$div_release(bVar));
        }
    }

    /* renamed from: defaultVisit, reason: avoid collision after fix types in other method */
    public void defaultVisit2(com.yandex.div2.a aVar, BindingContext bindingContext, DivStatePath divStatePath) {
        observeSize(aVar.b(), bindingContext.getExpressionResolver());
    }
}
