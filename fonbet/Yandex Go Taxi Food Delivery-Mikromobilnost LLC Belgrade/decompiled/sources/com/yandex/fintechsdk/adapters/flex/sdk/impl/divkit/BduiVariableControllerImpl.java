package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit;

import com.yandex.div.core.expression.variables.a;
import defpackage.a0;
import defpackage.c231;
import defpackage.tls;
import defpackage.u131;
import defpackage.z131;
import defpackage.zh5;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\n\u0010\rJ3\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R,\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u00100\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/BduiVariableControllerImpl;", "Lzh5;", "Lcom/yandex/div/core/expression/variables/a;", "divVariableController", "<init>", "(Lcom/yandex/div/core/expression/variables/a;)V", "", "name", "value", "Lzy11;", "setVariable", "(Ljava/lang/String;Ljava/lang/String;)V", "", "(Ljava/lang/String;Z)V", "variableName", "listenerKey", "Lkotlin/Function1;", "", "listener", "setVariableListener", "(Ljava/lang/String;Ljava/lang/String;Ltls;)V", "removeVariableListener", "Lcom/yandex/div/core/expression/variables/a;", "", "Lc231;", "variableListeners", "Ljava/util/Map;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BduiVariableControllerImpl implements zh5 {
    private final a divVariableController;
    private final Map<String, tls> variableListeners = new LinkedHashMap();

    public BduiVariableControllerImpl(a aVar) {
        this.divVariableController = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setVariableListener$lambda$1$lambda$0(tls tlsVar, c231 c231Var) {
        tlsVar.invoke(c231Var.d());
        return zy11.a;
    }

    @Override // defpackage.zh5
    public void removeVariableListener(String variableName, String listenerKey) {
        tls tlsVar;
        c231 g = this.divVariableController.g(variableName);
        if (g == null || (tlsVar = this.variableListeners.get(listenerKey)) == null) {
            return;
        }
        g.f(tlsVar);
        this.variableListeners.remove(listenerKey);
    }

    @Override // defpackage.zh5
    public void setVariable(String name, String value) {
        this.divVariableController.i(new z131(name, value));
    }

    @Override // defpackage.zh5
    public void setVariableListener(String variableName, String listenerKey, tls listener) {
        c231 g = this.divVariableController.g(variableName);
        if (g != null) {
            tls tlsVar = this.variableListeners.get(listenerKey);
            if (tlsVar != null) {
                g.f(tlsVar);
                this.variableListeners.remove(listenerKey);
            }
            a0 a0Var = new a0(11, listener);
            g.a(a0Var);
            this.variableListeners.put(listenerKey, a0Var);
        }
    }

    @Override // defpackage.zh5
    public void setVariable(String name, boolean value) {
        this.divVariableController.i(new u131(name, value));
    }
}
