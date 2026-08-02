package com.yandex.div.core.view2;

import android.view.View;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div2.a;
import xsna.ikn;
import xsna.s3q0;

/* compiled from: DivViewBinder.kt */
/* loaded from: classes7.dex */
public abstract class DivViewBinder<TData extends a, TDataValue extends ikn, TView extends View> {
    private final DivBaseBinder baseBinder;

    public DivViewBinder(DivBaseBinder divBaseBinder) {
        this.baseBinder = divBaseBinder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindViewInternal(BindingContext bindingContext, TView tview, TData tdata, DivStatePath divStatePath) {
        BindingContext bindingContext2;
        TView tview2;
        s3q0 s3q0Var;
        ikn iknVar;
        DivViewBinder divViewBinder;
        DivStatePath divStatePath2;
        a div = ((DivHolderView) tview).getDiv();
        if (tdata == div) {
            return;
        }
        this.baseBinder.bindView(bindingContext, tview, tdata, div);
        if (divStatePath != null) {
            ikn b = tdata.b();
            if (div != null) {
                iknVar = div.b();
                bindingContext2 = bindingContext;
                tview2 = tview;
                divStatePath2 = divStatePath;
                divViewBinder = this;
            } else {
                iknVar = null;
                divViewBinder = this;
                bindingContext2 = bindingContext;
                tview2 = tview;
                divStatePath2 = divStatePath;
            }
            divViewBinder.bind(tview2, bindingContext2, b, iknVar, divStatePath2);
            s3q0Var = s3q0.a;
        } else {
            bindingContext2 = bindingContext;
            tview2 = tview;
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            bind(tview2, bindingContext2, tdata.b(), div != null ? div.b() : null);
        }
    }

    public void bind(TView tview, BindingContext bindingContext, TDataValue tdatavalue, TDataValue tdatavalue2) {
    }

    public void bindView(BindingContext bindingContext, TView tview, TData tdata) {
        bindViewInternal(bindingContext, tview, tdata, null);
    }

    public void bind(TView tview, BindingContext bindingContext, TDataValue tdatavalue, TDataValue tdatavalue2, DivStatePath divStatePath) {
        bind(tview, bindingContext, tdatavalue, tdatavalue2);
    }

    public void bindView(BindingContext bindingContext, TView tview, TData tdata, DivStatePath divStatePath) {
        bindViewInternal(bindingContext, tview, tdata, divStatePath);
    }
}
