package com.yandex.div.core.expression.triggers;

import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivTrigger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.epx;

/* compiled from: TriggersController.kt */
/* loaded from: classes7.dex */
public class TriggersController {
    private List<DivTrigger> activeTriggers;
    private DivViewFacade currentView;
    private final DivActionBinder divActionBinder;
    private final ErrorCollector errorCollector;
    private final Map<List<DivTrigger>, List<TriggerExecutor>> executors = new LinkedHashMap();
    private final ExpressionResolverImpl expressionResolver;
    private final Div2Logger logger;

    public TriggersController(ExpressionResolverImpl expressionResolverImpl, ErrorCollector errorCollector, Div2Logger div2Logger, DivActionBinder divActionBinder) {
        this.expressionResolver = expressionResolverImpl;
        this.errorCollector = errorCollector;
        this.logger = div2Logger;
        this.divActionBinder = divActionBinder;
    }

    private Throwable findErrors(List<String> list) {
        if (list.isEmpty()) {
            return new RuntimeException("No variables defined!");
        }
        return null;
    }

    public void clearBinding(DivViewFacade divViewFacade) {
        this.currentView = null;
        Iterator<Map.Entry<List<DivTrigger>, List<TriggerExecutor>>> it = this.executors.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                ((TriggerExecutor) it2.next()).onDetach(divViewFacade);
            }
        }
    }

    public void ensureTriggersSynced(List<DivTrigger> list) {
        if (this.activeTriggers == list) {
            return;
        }
        this.activeTriggers = list;
        DivViewFacade divViewFacade = this.currentView;
        Map<List<DivTrigger>, List<TriggerExecutor>> map = this.executors;
        List<TriggerExecutor> list2 = map.get(list);
        if (list2 == null) {
            list2 = new ArrayList<>();
            map.put(list, list2);
        }
        List<TriggerExecutor> list3 = list2;
        if (divViewFacade != null) {
            clearBinding(divViewFacade);
        }
        for (DivTrigger divTrigger : list) {
            Expression<Boolean> expression = divTrigger.b;
            Expression<Boolean> expression2 = divTrigger.b;
            Expression.MutableExpression mutableExpression = expression instanceof Expression.MutableExpression ? (Expression.MutableExpression) expression : null;
            if (mutableExpression == null) {
                this.errorCollector.logError(new IllegalStateException("Invalid condition: '" + expression2 + '\'', new RuntimeException("Condition is not mutable!")));
            } else {
                Throwable findErrors = findErrors(mutableExpression.getVariablesName(this.expressionResolver));
                if (findErrors != null) {
                    this.errorCollector.logError(new IllegalStateException("Invalid condition: '" + expression2 + '\'', findErrors));
                } else {
                    list3.add(new TriggerExecutor(mutableExpression, divTrigger.a, divTrigger.c, this.expressionResolver, this.errorCollector, this.logger, this.divActionBinder));
                }
            }
        }
        if (divViewFacade != null) {
            onAttachedToWindow(divViewFacade);
        }
    }

    public void onAttachedToWindow(DivViewFacade divViewFacade) {
        List<TriggerExecutor> list;
        if (epx.f(this.currentView, divViewFacade)) {
            return;
        }
        this.currentView = divViewFacade;
        List<DivTrigger> list2 = this.activeTriggers;
        if (list2 == null || (list = this.executors.get(list2)) == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((TriggerExecutor) it.next()).onAttach(divViewFacade);
        }
    }

    public void onDetachedFromWindow(DivViewFacade divViewFacade) {
        if (epx.f(this.currentView, divViewFacade)) {
            this.currentView = null;
        }
        Iterator<Map.Entry<List<DivTrigger>, List<TriggerExecutor>>> it = this.executors.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                ((TriggerExecutor) it2.next()).onDetach(divViewFacade);
            }
        }
    }
}
