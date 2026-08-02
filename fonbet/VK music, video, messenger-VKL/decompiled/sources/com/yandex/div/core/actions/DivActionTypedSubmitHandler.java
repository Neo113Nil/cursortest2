package com.yandex.div.core.actions;

import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.core.expression.RuntimeStoreProviderKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivTreeVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionSubmit;
import com.yandex.div2.a;
import com.yandex.div2.j3;
import com.yandex.div2.k0;
import com.yandex.div2.md;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.c5g;
import xsna.epx;
import xsna.i5s;
import xsna.j5g;
import xsna.s3q0;

/* compiled from: DivActionTypedSubmitHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedSubmitHandler implements DivActionTypedHandler {
    private final DivRequestExecutor requestExecutor;

    /* compiled from: DivActionTypedSubmitHandler.kt */
    public static final class ContainerFinder extends DivTreeVisitor<s3q0> {
        private final List<DivItemBuilderResult> containers;
        private final String id;

        public ContainerFinder(String str) {
            super(null, 1, null);
            this.id = str;
            this.containers = new ArrayList();
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ s3q0 defaultVisit(a aVar, BindingContext bindingContext, DivStatePath divStatePath) {
            defaultVisit2(aVar, bindingContext, divStatePath);
            return s3q0.a;
        }

        public final DivItemBuilderResult findContainer(Div2View div2View) {
            j3 divData = div2View.getDivData();
            if (divData == null) {
                return null;
            }
            for (j3.b bVar : divData.c) {
                visit(bVar.a, div2View.getBindingContext$div_release(), DivStatePath.Companion.fromState$div_release(bVar));
            }
            if (this.containers.isEmpty()) {
                DivActionTypedUtilsKt.logError(div2View, new RuntimeException(i5s.a(new StringBuilder("Error resolving container. Elements that respond to id '"), this.id, "' are not found.")));
                return null;
            }
            if (this.containers.size() <= 1) {
                return (DivItemBuilderResult) j5g.Y(this.containers);
            }
            DivActionTypedUtilsKt.logError(div2View, new RuntimeException(i5s.a(new StringBuilder("Error resolving container. Found multiple elements that respond to id '"), this.id, "'.")));
            return null;
        }

        /* renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        public void defaultVisit2(a aVar, BindingContext bindingContext, DivStatePath divStatePath) {
            if (epx.f(aVar.b().getId(), this.id)) {
                this.containers.add(DivCollectionExtensionsKt.toItemBuilderResult(aVar, bindingContext.getExpressionResolver()));
            }
        }
    }

    public DivActionTypedSubmitHandler(DivRequestExecutor divRequestExecutor) {
        this.requestExecutor = divRequestExecutor;
    }

    private final String createBody(DivItemBuilderResult divItemBuilderResult, Div2View div2View) {
        VariableController variableController;
        List<md> f = divItemBuilderResult.getDiv().b().f();
        List<md> list = f;
        if (list == null || list.isEmpty() || (variableController = UtilsKt.getVariableController(divItemBuilderResult.getExpressionResolver())) == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<T> it = f.iterator();
        while (it.hasNext()) {
            String name = RuntimeStoreProviderKt.getName((md) it.next());
            Object obj = variableController.get(name);
            if (obj == null || jSONObject.put(name, obj) == null) {
                DivActionTypedUtilsKt.logError(div2View, new MissingVariableException(name, null, 2, null));
                s3q0 s3q0Var = s3q0.a;
            }
        }
        return jSONObject.toString();
    }

    private final DivRequestExecutor.Callback createCallback(final List<DivAction> list, final List<DivAction> list2, final Div2View div2View, final ExpressionResolver expressionResolver) {
        List<DivAction> list3;
        List<DivAction> list4 = list;
        if ((list4 == null || list4.isEmpty()) && ((list3 = list2) == null || list3.isEmpty())) {
            return null;
        }
        return new DivRequestExecutor.Callback() { // from class: com.yandex.div.core.actions.DivActionTypedSubmitHandler$createCallback$1
        };
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        DivActionSubmit divActionSubmit;
        ArrayList arrayList = null;
        k0.r rVar = k0Var instanceof k0.r ? (k0.r) k0Var : null;
        if (rVar == null || (divActionSubmit = rVar.b) == null) {
            return false;
        }
        DivActionSubmit.Request request = divActionSubmit.d;
        DivItemBuilderResult findContainer = new ContainerFinder(divActionSubmit.a.evaluate(expressionResolver)).findContainer(div2View);
        if (findContainer == null) {
            return false;
        }
        List<DivActionSubmit.Request.a> list = request.a;
        if (list != null) {
            List<DivActionSubmit.Request.a> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            for (DivActionSubmit.Request.a aVar : list2) {
                arrayList.add(new DivRequestExecutor.Header(aVar.a.evaluate(expressionResolver), aVar.b.evaluate(expressionResolver)));
            }
        }
        div2View.addLoadReference(this.requestExecutor.execute(new DivRequestExecutor.Request(request.c.evaluate(expressionResolver), request.b.evaluate(expressionResolver).toString(), arrayList, createBody(findContainer, div2View)), createCallback(divActionSubmit.c, divActionSubmit.b, div2View, expressionResolver)), div2View);
        return true;
    }
}
