package com.yandex.div.core.view2.divs;

import android.text.Editable;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.util.inputfilter.InputFiltersHolder;
import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.data.Variable;
import io.jsonwebtoken.JwtParser;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DivInputBinder.kt */
/* loaded from: classes7.dex */
public class DivInputBinder$createCallbacks$1 implements TwoWayVariableBinder.Callbacks {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ InputFiltersHolder $filters;
    final /* synthetic */ BaseInputMask $inputMask;
    final /* synthetic */ String $secondaryVariable;
    final /* synthetic */ DivInputView $this_createCallbacks;

    public DivInputBinder$createCallbacks$1(BaseInputMask baseInputMask, InputFiltersHolder inputFiltersHolder, DivInputView divInputView, BindingContext bindingContext, String str) {
        this.$inputMask = baseInputMask;
        this.$filters = inputFiltersHolder;
        this.$this_createCallbacks = divInputView;
        this.$bindingContext = bindingContext;
        this.$secondaryVariable = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyMaskOrFilters(Editable editable, izs<? super String, s3q0> izsVar) {
        String str;
        String obj;
        String str2 = "";
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        BaseInputMask baseInputMask = this.$inputMask;
        if (baseInputMask != null) {
            DivInputView divInputView = this.$this_createCallbacks;
            if (!epx.f(baseInputMask.getValue(), str)) {
                Editable text = divInputView.getText();
                if (text != null && (obj = text.toString()) != null) {
                    str2 = obj;
                }
                baseInputMask.applyChangeFrom(str2, Integer.valueOf(divInputView.getSelectionStart()));
                divInputView.setText(baseInputMask.getValue());
                divInputView.setSelection(baseInputMask.getCursorPosition());
                setSecondVariable(baseInputMask.getValue());
            }
            izsVar.invoke(baseInputMask.getRawValue().replace(',', JwtParser.SEPARATOR_CHAR));
            return;
        }
        InputFiltersHolder inputFiltersHolder = this.$filters;
        if (inputFiltersHolder != null) {
            DivInputView divInputView2 = this.$this_createCallbacks;
            if (epx.f(inputFiltersHolder.getCurrentValue(), str)) {
                return;
            }
            if (!inputFiltersHolder.checkValue(str)) {
                divInputView2.setText(inputFiltersHolder.getCurrentValue());
                divInputView2.setSelection(inputFiltersHolder.getCursorPosition());
                return;
            } else {
                inputFiltersHolder.setCurrentValue(str);
                inputFiltersHolder.setCursorPosition(divInputView2.getSelectionStart());
            }
        }
        izsVar.invoke(str);
    }

    private void setSecondVariable(String str) {
        VariableController variableController = UtilsKt.getVariableController(this.$bindingContext.getExpressionResolver());
        String str2 = this.$secondaryVariable;
        if (str2 != null) {
            Variable mutableVariable = variableController != null ? variableController.getMutableVariable(str2) : null;
            if (mutableVariable != null) {
                mutableVariable.set(str);
            }
        }
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
    public void setViewStateChangeListener(final izs<? super String, s3q0> izsVar) {
        this.$this_createCallbacks.addAfterTextChangeAction(new izs<Editable, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivInputBinder$createCallbacks$1$setViewStateChangeListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Editable editable) {
                invoke2(editable);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Editable editable) {
                DivInputBinder$createCallbacks$1.this.applyMaskOrFilters(editable, izsVar);
            }
        });
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
    public void onVariableChanged(String str) {
        if (str == null) {
            str = "";
        }
        BaseInputMask baseInputMask = this.$inputMask;
        if (baseInputMask != null) {
            DivInputView divInputView = this.$this_createCallbacks;
            baseInputMask.overrideRawValue(str);
            setSecondVariable(baseInputMask.getValue());
            divInputView.setText(baseInputMask.getValue());
            return;
        }
        InputFiltersHolder inputFiltersHolder = this.$filters;
        if (inputFiltersHolder != null) {
            if (!inputFiltersHolder.checkValue(str)) {
                return;
            }
            inputFiltersHolder.setCurrentValue(str);
            inputFiltersHolder.setCursorPosition(str.length());
        }
        Editable text = this.$this_createCallbacks.getText();
        if (epx.f(text != null ? text.toString() : null, str)) {
            return;
        }
        this.$this_createCallbacks.setText(str);
    }
}
