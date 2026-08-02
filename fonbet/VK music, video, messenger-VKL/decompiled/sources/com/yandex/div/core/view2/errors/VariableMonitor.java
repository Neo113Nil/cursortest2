package com.yandex.div.core.view2.errors;

import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableMutationException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import xsna.c5g;
import xsna.epx;
import xsna.fw3;
import xsna.izs;
import xsna.j5g;
import xsna.jgp;
import xsna.jw5;
import xsna.s3q0;
import xsna.ss9;

/* compiled from: VariableMonitor.kt */
/* loaded from: classes7.dex */
public final class VariableMonitor {
    private final izs<Throwable, s3q0> errorHandler;
    private izs<? super List<? extends Pair<String, ? extends Variable>>, s3q0> variablesUpdatedCallback;
    private final Map<Pair<String, String>, Variable> variables = new LinkedHashMap();
    private Map<String, ? extends VariableController> controllerMap = jgp.b;

    /* JADX WARN: Multi-variable type inference failed */
    public VariableMonitor(izs<? super Throwable, s3q0> izsVar) {
        this.errorHandler = izsVar;
    }

    private final izs<Variable, s3q0> createCallback(final String str) {
        return new izs<Variable, s3q0>() { // from class: com.yandex.div.core.view2.errors.VariableMonitor$createCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Variable variable) {
                invoke2(variable);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Variable variable) {
                VariableMonitor.this.saveVariable(variable, str);
                VariableMonitor.this.notifyOnChange();
            }
        };
    }

    private final Pair<String, Variable> entriesToVariables(Map.Entry<Pair<String, String>, ? extends Variable> entry) {
        Pair<String, String> key = entry.getKey();
        return new Pair<>(key.i(), entry.getValue());
    }

    private final List<String> getAllNames(VariableController variableController) {
        List<Variable> captureAll = variableController.captureAll();
        ArrayList arrayList = new ArrayList(c5g.u(captureAll, 10));
        Iterator<T> it = captureAll.iterator();
        while (it.hasNext()) {
            arrayList.add(((Variable) it.next()).getName());
        }
        return arrayList;
    }

    private final <K, V> boolean hasAllPairs(Map<K, ? extends V> map, Map<K, ? extends V> map2) {
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry<K, ? extends V> entry : map2.entrySet()) {
            K key = entry.getKey();
            if (!epx.f(map.get(key), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyOnChange() {
        List<Pair<String, Variable>> variablesList = variablesList();
        izs<? super List<? extends Pair<String, ? extends Variable>>, s3q0> izsVar = this.variablesUpdatedCallback;
        if (izsVar != null) {
            izsVar.invoke(variablesList);
        }
    }

    private final void onControllersChange(Set<? extends VariableController> set) {
        Map<String, ? extends VariableController> map = this.controllerMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends VariableController> entry : map.entrySet()) {
            if (!set.contains(entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            VariableController variableController = (VariableController) entry2.getValue();
            VariableController.subscribeToVariablesChange$default(variableController, getAllNames(variableController), false, createCallback(str), 2, null);
        }
        this.variables.clear();
        for (Map.Entry<String, ? extends VariableController> entry3 : this.controllerMap.entrySet()) {
            String key = entry3.getKey();
            Iterator<T> it = entry3.getValue().captureAll().iterator();
            while (it.hasNext()) {
                saveVariable((Variable) it.next(), key);
            }
        }
        notifyOnChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveVariable(Variable variable, String str) {
        this.variables.put(new Pair<>(str, variable.getName()), variable);
    }

    private final List<Pair<String, Variable>> variablesList() {
        Map<Pair<String, String>, Variable> map = this.variables;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<Pair<String, String>, Variable>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(entriesToVariables(it.next()));
        }
        return j5g.D0(new Comparator() { // from class: com.yandex.div.core.view2.errors.VariableMonitor$variablesList$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Pair pair = (Pair) t;
                String str = (String) pair.d();
                Variable variable = (Variable) pair.g();
                StringBuilder e = fw3.e(str);
                e.append(variable.getName());
                String sb = e.toString();
                Pair pair2 = (Pair) t2;
                String str2 = (String) pair2.d();
                Variable variable2 = (Variable) pair2.g();
                StringBuilder e2 = fw3.e(str2);
                e2.append(variable2.getName());
                return jw5.b(sb, e2.toString());
            }
        }, arrayList);
    }

    public final void mutateVariable(String str, String str2, String str3) {
        Variable variable = this.variables.get(new Pair(str2, str));
        if (String.valueOf(variable != null ? variable.getValue() : null).equals(str3) || variable == null) {
            return;
        }
        try {
            variable.set(str3);
        } catch (Exception unused) {
            this.errorHandler.invoke(new VariableMutationException(ss9.a("Unable to set '", str3, "' value to variable '", str, "'."), null, 2, null));
        }
    }

    public final void setControllerMap(Map<String, ? extends VariableController> map) {
        if (hasAllPairs(this.controllerMap, map)) {
            return;
        }
        Set<? extends VariableController> S0 = j5g.S0(this.controllerMap.values());
        this.controllerMap = map;
        onControllersChange(S0);
    }

    public final void setVariablesUpdatedCallback(izs<? super List<? extends Pair<String, ? extends Variable>>, s3q0> izsVar) {
        this.variablesUpdatedCallback = izsVar;
        notifyOnChange();
    }
}
