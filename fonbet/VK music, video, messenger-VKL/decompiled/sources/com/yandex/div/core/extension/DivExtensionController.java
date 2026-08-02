package com.yandex.div.core.extension;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import xsna.ikn;
import xsna.zkn;

/* compiled from: DivExtensionController.kt */
/* loaded from: classes7.dex */
public class DivExtensionController {
    private final List<DivExtensionHandler> extensionHandlers;

    /* JADX WARN: Multi-variable type inference failed */
    public DivExtensionController(List<? extends DivExtensionHandler> list) {
        this.extensionHandlers = list;
    }

    private boolean hasExtensions(ikn iknVar) {
        List<zkn> m = iknVar.m();
        return (m == null || m.isEmpty() || this.extensionHandlers.isEmpty()) ? false : true;
    }

    public void beforeBindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ikn iknVar) {
        if (hasExtensions(iknVar)) {
            for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
                if (divExtensionHandler.matches(iknVar)) {
                    divExtensionHandler.beforeBindView(div2View, expressionResolver, view, iknVar);
                }
            }
        }
    }

    public void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ikn iknVar) {
        if (hasExtensions(iknVar)) {
            for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
                if (divExtensionHandler.matches(iknVar)) {
                    divExtensionHandler.bindView(div2View, expressionResolver, view, iknVar);
                }
            }
        }
    }

    public void preprocessExtensions(ikn iknVar, ExpressionResolver expressionResolver) {
        if (hasExtensions(iknVar)) {
            for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
                if (divExtensionHandler.matches(iknVar)) {
                    divExtensionHandler.preprocess(iknVar, expressionResolver);
                }
            }
        }
    }

    public void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, ikn iknVar) {
        if (hasExtensions(iknVar)) {
            for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
                if (divExtensionHandler.matches(iknVar)) {
                    divExtensionHandler.unbindView(div2View, expressionResolver, view, iknVar);
                }
            }
        }
    }
}
