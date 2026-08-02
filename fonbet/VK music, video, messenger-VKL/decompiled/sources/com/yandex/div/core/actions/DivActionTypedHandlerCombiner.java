package com.yandex.div.core.actions;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.k0;
import java.util.Iterator;
import java.util.Set;
import xsna.zcl;

/* compiled from: DivActionTypedHandlerCombiner.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedHandlerCombiner {
    private static final Companion Companion = new Companion(null);
    private final Set<DivActionTypedHandler> handlers;

    /* compiled from: DivActionTypedHandlerCombiner.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public DivActionTypedHandlerCombiner(Set<DivActionTypedHandler> set) {
        this.handlers = set;
    }

    public final boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        Object obj;
        Iterator<T> it = this.handlers.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((DivActionTypedHandler) obj).handleAction(str, k0Var, div2View, expressionResolver)) {
                break;
            }
        }
        boolean z = obj != null;
        if (!z) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.DEBUG)) {
                kLog.print(3, "DivTypedActionHandlerCombiner", "Unexpected " + k0Var.getClass() + " was not handled");
            }
        }
        return z;
    }
}
