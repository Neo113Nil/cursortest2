package com.yandex.div.core.view2.divs.widgets;

import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div2.a;

/* compiled from: DivHolderView.kt */
/* loaded from: classes7.dex */
public interface DivHolderView<T extends a> extends DivBorderSupports, TransientView, ExpressionSubscriber {
    BindingContext getBindingContext();

    T getDiv();

    default void release() {
        super.release();
        setDiv(null);
        setBindingContext(null);
        releaseBorderDrawer();
    }

    void setBindingContext(BindingContext bindingContext);

    void setDiv(T t);
}
