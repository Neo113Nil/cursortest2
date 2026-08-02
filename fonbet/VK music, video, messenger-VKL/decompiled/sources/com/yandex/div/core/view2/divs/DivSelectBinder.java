package com.yandex.div.core.view2.divs;

import android.view.MotionEvent;
import android.view.View;
import com.yandex.div.core.expression.variables.TwoWayStringVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.animations.UtilsKt;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.a;
import com.yandex.div2.e9;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.air;
import xsna.e43;
import xsna.epx;
import xsna.hfr;
import xsna.i5g;
import xsna.izs;
import xsna.pn9;
import xsna.rli0;
import xsna.s3q0;
import xsna.wzs;
import xsna.zr;

/* compiled from: DivSelectBinder.kt */
/* loaded from: classes7.dex */
public final class DivSelectBinder extends DivViewBinder<a.j, e9, DivSelectView> {
    private final ErrorCollectors errorCollectors;
    private final DivTypefaceResolver typefaceResolver;
    private final TwoWayStringVariableBinder variableBinder;

    public DivSelectBinder(DivBaseBinder divBaseBinder, DivTypefaceResolver divTypefaceResolver, TwoWayStringVariableBinder twoWayStringVariableBinder, ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.typefaceResolver = divTypefaceResolver;
        this.variableBinder = twoWayStringVariableBinder;
        this.errorCollectors = errorCollectors;
    }

    private final void applyOptions(final DivSelectView divSelectView, final e9 e9Var, final BindingContext bindingContext) {
        wzs<View, MotionEvent, Boolean> createAnimatedTouchListener = BaseDivViewExtensionsKt.createAnimatedTouchListener(divSelectView, bindingContext, UtilsKt.getDEFAULT_CLICK_ANIMATION(), null);
        divSelectView.setOnTouchListener(createAnimatedTouchListener != null ? new pn9(createAnimatedTouchListener, 1) : null);
        final List<String> createObservedItemList = createObservedItemList(divSelectView, e9Var, bindingContext.getExpressionResolver());
        divSelectView.setItems(createObservedItemList);
        divSelectView.setOnItemSelectedListener(new izs<Integer, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$applyOptions$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Integer num) {
                invoke(num.intValue());
                return s3q0.a;
            }

            public final void invoke(int i) {
                DivSelectView.this.setText(createObservedItemList.get(i));
                izs<String, s3q0> valueUpdater = DivSelectView.this.getValueUpdater();
                if (valueUpdater != null) {
                    valueUpdater.invoke(e9Var.A.get(i).b.evaluate(bindingContext.getExpressionResolver()));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applyOptions$lambda$0(wzs wzsVar, View view, MotionEvent motionEvent) {
        return ((Boolean) wzsVar.invoke(view, motionEvent)).booleanValue();
    }

    private final List<String> createObservedItemList(final DivSelectView divSelectView, e9 e9Var, ExpressionResolver expressionResolver) {
        final ArrayList arrayList = new ArrayList();
        final int i = 0;
        for (Object obj : e9Var.A) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            e9.a aVar = (e9.a) obj;
            Expression<String> expression = aVar.a;
            if (expression == null) {
                expression = aVar.b;
            }
            arrayList.add(expression.evaluate(expressionResolver));
            expression.observe(expressionResolver, new izs<String, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$createObservedItemList$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(String str) {
                    invoke2(str);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String str) {
                    arrayList.set(i, str);
                    divSelectView.setItems(arrayList);
                }
            });
            i = i2;
        }
        return arrayList;
    }

    private final void observeBaseTextProperties(DivSelectView divSelectView, e9 e9Var, e9 e9Var2, ExpressionResolver expressionResolver) {
        Expression<Long> expression = e9Var.m;
        Expression<DivSizeUnit> expression2 = e9Var.n;
        Expression<Double> expression3 = e9Var.x;
        Expression<Integer> expression4 = e9Var.F;
        Expression<Long> expression5 = e9Var.y;
        Expression<String> expression6 = e9Var.l;
        Expression<DivFontWeight> expression7 = e9Var.p;
        Expression<Long> expression8 = e9Var.q;
        Expression<JSONObject> expression9 = e9Var.o;
        Expression<Long> expression10 = e9Var2 != null ? e9Var2.m : null;
        Expression<DivSizeUnit> expression11 = e9Var2 != null ? e9Var2.n : null;
        Expression<Double> expression12 = e9Var2 != null ? e9Var2.x : null;
        Expression<Integer> expression13 = e9Var2 != null ? e9Var2.F : null;
        Expression<Long> expression14 = e9Var2 != null ? e9Var2.y : null;
        Expression<String> expression15 = e9Var2 != null ? e9Var2.l : null;
        TextViewExtensionsKt.observeBaseTextProperties(divSelectView, expression, expression2, expression3, expression4, expression5, expression6, expression7, expression8, expression9, expression10, expression11, expression12, expression13, expression14, expression15, e9Var2 != null ? e9Var2.p : null, e9Var2 != null ? e9Var2.q : null, e9Var2 != null ? e9Var2.o : null, e9Var2, this.typefaceResolver, expressionResolver);
    }

    private final void observeHintColor(final DivSelectView divSelectView, e9 e9Var, ExpressionResolver expressionResolver) {
        divSelectView.addSubscription(e9Var.t.observeAndGet(expressionResolver, new izs<Integer, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeHintColor$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Integer num) {
                invoke(num.intValue());
                return s3q0.a;
            }

            public final void invoke(int i) {
                DivSelectView.this.setHintTextColor(i);
            }
        }));
    }

    private final void observeHintText(final DivSelectView divSelectView, e9 e9Var, ExpressionResolver expressionResolver) {
        Expression<String> expression = e9Var.u;
        if (expression == null) {
            return;
        }
        divSelectView.addSubscription(expression.observeAndGet(expressionResolver, new izs<String, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeHintText$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(String str) {
                invoke2(str);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                DivSelectView.this.setHint(str);
            }
        }));
    }

    private final void observeVariable(final DivSelectView divSelectView, final e9 e9Var, BindingContext bindingContext, DivStatePath divStatePath) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(bindingContext.getDivView().getDataTag(), bindingContext.getDivView().getDivData());
        divSelectView.addSubscription(this.variableBinder.bindVariable(bindingContext, e9Var.M, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeVariable$subscription$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(izs<? super String, s3q0> izsVar) {
                divSelectView.setValueUpdater(izsVar);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(final String str) {
                String evaluate;
                i5g i5gVar = new i5g(e9.this.A);
                final ExpressionResolver expressionResolver2 = expressionResolver;
                hfr.a aVar = new hfr.a(rli0.j(i5gVar, new izs<e9.a, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivSelectBinder$observeVariable$subscription$1$onVariableChanged$matchingOptionsSequence$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // xsna.izs
                    public final Boolean invoke(e9.a aVar2) {
                        return Boolean.valueOf(epx.f(aVar2.b.evaluate(ExpressionResolver.this), str));
                    }
                }));
                DivSelectView divSelectView2 = divSelectView;
                if (aVar.hasNext()) {
                    e9.a aVar2 = (e9.a) aVar.next();
                    if (aVar.hasNext()) {
                        orCreate.logWarning(new Throwable(zr.a("Multiple options found with value = \"", str, "\", selecting first one")));
                    }
                    Expression<String> expression = aVar2.a;
                    if (expression == null) {
                        expression = aVar2.b;
                    }
                    evaluate = expression.evaluate(expressionResolver);
                } else {
                    orCreate.logWarning(new Throwable(air.b('\"', "No option found with value = \"", str)));
                    evaluate = "";
                }
                divSelectView2.setText(evaluate);
            }
        }, divStatePath));
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(DivSelectView divSelectView, BindingContext bindingContext, e9 e9Var, e9 e9Var2, DivStatePath divStatePath) {
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divSelectView.setTextAlignment(5);
        divSelectView.setFocusTracker(divView.getInputFocusTracker$div_release());
        applyOptions(divSelectView, e9Var, bindingContext);
        observeVariable(divSelectView, e9Var, bindingContext, divStatePath);
        observeBaseTextProperties(divSelectView, e9Var, e9Var2, expressionResolver);
        observeHintText(divSelectView, e9Var, expressionResolver);
        observeHintColor(divSelectView, e9Var, expressionResolver);
    }
}
