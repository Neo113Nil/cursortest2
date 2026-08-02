package com.yandex.div.core.view2.divs;

import android.view.KeyEvent;
import android.widget.TextView;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivInput;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DivInputBinder.kt */
/* loaded from: classes7.dex */
public final class DivInputBinder$observeEnterTypeAndActions$callback$1 extends Lambda implements izs<Object, s3q0> {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ DivInput $div;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivInputView $this_observeEnterTypeAndActions;
    final /* synthetic */ DivInputBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivInputBinder$observeEnterTypeAndActions$callback$1(DivInput divInput, ExpressionResolver expressionResolver, DivInputView divInputView, DivInputBinder divInputBinder, BindingContext bindingContext) {
        super(1);
        this.$div = divInput;
        this.$resolver = expressionResolver;
        this.$this_observeEnterTypeAndActions = divInputView;
        this.this$0 = divInputBinder;
        this.$bindingContext = bindingContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$0(DivInputBinder divInputBinder, BindingContext bindingContext, DivInputView divInputView, List list, TextView textView, int i, KeyEvent keyEvent) {
        DivActionBinder divActionBinder;
        if ((i & 255) == 0) {
            return false;
        }
        divActionBinder = divInputBinder.actionBinder;
        divActionBinder.handleBulkActions$div_release(bindingContext, divInputView, list, "enter");
        return false;
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
        invoke2(obj);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Object obj) {
        int imeAction;
        DivInput.EnterKeyType evaluate = this.$div.l.evaluate(this.$resolver);
        DivInputView divInputView = this.$this_observeEnterTypeAndActions;
        int imeOptions = divInputView.getImeOptions();
        imeAction = this.this$0.getImeAction(evaluate);
        divInputView.setImeOptions(imeAction + imeOptions);
        final List<DivAction> list = this.$div.k;
        List<DivAction> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            this.$this_observeEnterTypeAndActions.setOnEditorActionListener(null);
            return;
        }
        final DivInputView divInputView2 = this.$this_observeEnterTypeAndActions;
        final DivInputBinder divInputBinder = this.this$0;
        final BindingContext bindingContext = this.$bindingContext;
        divInputView2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.yandex.div.core.view2.divs.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean invoke$lambda$0;
                invoke$lambda$0 = DivInputBinder$observeEnterTypeAndActions$callback$1.invoke$lambda$0(DivInputBinder.this, bindingContext, divInputView2, list, textView, i, keyEvent);
                return invoke$lambda$0;
            }
        });
    }
}
