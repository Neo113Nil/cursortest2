package com.yandex.div.core.expression.variables;

import android.os.Handler;
import android.os.Looper;
import com.yandex.div.data.Variable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.EmptyList;
import xsna.izs;
import xsna.j5g;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: DivVariableController.kt */
/* loaded from: classes7.dex */
public final class DivVariableController {
    private final ConcurrentLinkedQueue<DeclarationObserver> declarationObservers;
    private final Set<String> declaredVariableNames;
    private final ConcurrentLinkedQueue<izs<String, s3q0>> externalVariableRequestObservers;
    private final DivVariableController internalVariableController;
    private final Handler mainHandler;
    private final Set<String> pendingDeclaration;
    private final izs<String, s3q0> requestsObserver;
    private final Map<String, String> undeclaredVariables;
    private final MultiVariableSource variableSource;
    private final ConcurrentHashMap<String, Variable> variables;

    /* JADX WARN: Multi-variable type inference failed */
    public DivVariableController() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean isDeclaredLocal(String str) {
        boolean contains;
        synchronized (this.declaredVariableNames) {
            contains = this.declaredVariableNames.contains(str);
        }
        return contains;
    }

    public final void addDeclarationObserver$div_release(DeclarationObserver declarationObserver) {
        this.declarationObservers.add(declarationObserver);
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.addDeclarationObserver$div_release(declarationObserver);
        }
    }

    public final void addVariableObserver$div_release(izs<? super Variable, s3q0> izsVar) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            ((Variable) it.next()).addObserver(izsVar);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.addVariableObserver$div_release(izsVar);
        }
    }

    public final List<Variable> captureAllVariables() {
        List<Variable> captureAllVariables;
        Collection<Variable> values = this.variables.values();
        DivVariableController divVariableController = this.internalVariableController;
        return j5g.u0((divVariableController == null || (captureAllVariables = divVariableController.captureAllVariables()) == null) ? EmptyList.b : captureAllVariables, values);
    }

    public final Variable get(String str) {
        if (isDeclaredLocal(str)) {
            return this.variables.get(str);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            return divVariableController.get(str);
        }
        return null;
    }

    public final MultiVariableSource getVariableSource$div_release() {
        return this.variableSource;
    }

    public final void receiveVariablesUpdates$div_release(izs<? super Variable, s3q0> izsVar) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            izsVar.invoke((Variable) it.next());
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.receiveVariablesUpdates$div_release(izsVar);
        }
    }

    public final void removeDeclarationObserver$div_release(DeclarationObserver declarationObserver) {
        this.declarationObservers.remove(declarationObserver);
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.removeDeclarationObserver$div_release(declarationObserver);
        }
    }

    public final void removeVariablesObserver$div_release(izs<? super Variable, s3q0> izsVar) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            ((Variable) it.next()).removeObserver(izsVar);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.removeVariablesObserver$div_release(izsVar);
        }
    }

    public DivVariableController(DivVariableController divVariableController) {
        this.internalVariableController = divVariableController;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.variables = new ConcurrentHashMap<>();
        this.declarationObservers = new ConcurrentLinkedQueue<>();
        this.undeclaredVariables = new LinkedHashMap();
        this.declaredVariableNames = new LinkedHashSet();
        this.pendingDeclaration = new LinkedHashSet();
        this.externalVariableRequestObservers = new ConcurrentLinkedQueue<>();
        izs<String, s3q0> izsVar = new izs<String, s3q0>() { // from class: com.yandex.div.core.expression.variables.DivVariableController$requestsObserver$1
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
                ConcurrentLinkedQueue concurrentLinkedQueue;
                concurrentLinkedQueue = DivVariableController.this.externalVariableRequestObservers;
                Iterator it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    ((izs) it.next()).invoke(str);
                }
            }
        };
        this.requestsObserver = izsVar;
        this.variableSource = new MultiVariableSource(this, izsVar);
    }

    public /* synthetic */ DivVariableController(DivVariableController divVariableController, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : divVariableController);
    }
}
