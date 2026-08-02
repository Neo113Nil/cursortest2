package com.yandex.fintechsdk.adapters.flex.sdk.impl;

import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import com.yandex.div.core.view2.Div2View;
import com.yandex.fintechsdk.adapters.flex.sdk.api.ExecuteDivActionResult;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexDependencies;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.action.NestedActionImpl;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.FlexComponent;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.di.FlexComponentStore;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.state.JasonStateExtKt;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.state.JasonStateSerializerKt;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.utils.DocumentQueryMappingKt;
import com.yandex.fintechsdk.entities.theme.Theme;
import core.divkit.state.a;
import defpackage.bvf0;
import defpackage.c231;
import defpackage.kr;
import defpackage.ngd0;
import defpackage.nh5;
import defpackage.ny61;
import defpackage.oey;
import defpackage.pey;
import defpackage.sh5;
import defpackage.u131;
import defpackage.ug5;
import defpackage.v3k;
import defpackage.vg10;
import defpackage.vm50;
import defpackage.x131;
import defpackage.y131;
import defpackage.yvl;
import defpackage.z131;
import kotlin.Metadata;
import kotlin.collections.b;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010&\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\u0003J\u0019\u0010.\u001a\u0004\u0018\u00010!2\u0006\u0010-\u001a\u00020!H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\n2\u0006\u0010-\u001a\u00020!2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101J1\u00108\u001a\u0002072\u0006\u00102\u001a\u00020!2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020!H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\n2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u00020\u001b2\b\u0010>\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\nH\u0016¢\u0006\u0004\bA\u0010\u0003R\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u0004\u0018\u00010G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/FlexAdapterImpl;", "Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexAdapter;", "<init>", "()V", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/FlexComponent;", "component", "Loey;", "createActivityObserver", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/FlexComponent;)Loey;", "observer", "Lzy11;", "addActivityObserver", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/FlexComponent;Loey;)V", "clearActivityObserver", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/FlexComponent;)V", "initRouteHandler", "Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexDependencies;", "dependencies", "init", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexDependencies;)V", "Lug5;", "query", "loadScreen", "(Lug5;)V", "reloadDocument", "Lvm50;", "action", "", "dispatchAction", "(Lvm50;)Z", "Lnh5;", "getCurrentRouteHandler", "()Lnh5;", "", "stateName", "valueName", "", "newValue", "updateStateValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Lcom/yandex/fintechsdk/entities/theme/Theme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "updateTheme", "(Lcom/yandex/fintechsdk/entities/theme/Theme;)V", "updateLifecycleObservers", "variableName", "getVariable", "(Ljava/lang/String;)Ljava/lang/String;", "updateVariable", "(Ljava/lang/String;Ljava/lang/Object;)V", "logId", "Lorg/json/JSONObject;", "payload", "url", "widgetId", "Lcom/yandex/fintechsdk/adapters/flex/sdk/api/ExecuteDivActionResult;", "executeDivAction", "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/fintechsdk/adapters/flex/sdk/api/ExecuteDivActionResult;", "Landroid/os/Bundle;", "outState", "saveState", "(Landroid/os/Bundle;)V", "savedInstanceState", "restoreState", "(Landroid/os/Bundle;)Z", "clear", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/FlexComponentStore;", "componentStore", "Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/di/FlexComponentStore;", "activityObserver", "Loey;", "Lsh5;", "getStateManager", "()Lsh5;", "stateManager", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlexAdapterImpl implements FlexAdapter {
    private oey activityObserver;
    private FlexComponentStore componentStore;

    private final void addActivityObserver(FlexComponent component, oey observer) {
        ((FragmentActivity) component.getActivityProvider().b()).getLifecycle().a(observer);
        this.activityObserver = observer;
    }

    private final void clearActivityObserver(FlexComponent component) {
        FragmentActivity fragmentActivity;
        Lifecycle lifecycle;
        oey oeyVar = this.activityObserver;
        if (oeyVar != null && (fragmentActivity = (FragmentActivity) component.getActivityProvider().a()) != null && (lifecycle = fragmentActivity.getLifecycle()) != null) {
            lifecycle.d(oeyVar);
        }
        this.activityObserver = null;
    }

    private final oey createActivityObserver(final FlexComponent component) {
        return new DefaultLifecycleObserver() { // from class: com.yandex.fintechsdk.adapters.flex.sdk.impl.FlexAdapterImpl$createActivityObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ /* synthetic */ void onCreate(pey peyVar) {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ /* synthetic */ void onDestroy(pey peyVar) {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ /* synthetic */ void onPause(pey peyVar) {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ /* synthetic */ void onResume(pey peyVar) {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(pey owner) {
                a divkitStateDaemon = FlexComponent.this.getDivkitStateDaemon();
                divkitStateDaemon.b.post(new yvl(divkitStateDaemon, 1));
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(pey owner) {
                a divkitStateDaemon = FlexComponent.this.getDivkitStateDaemon();
                divkitStateDaemon.b.post(new yvl(divkitStateDaemon, 0));
            }
        };
    }

    private final void initRouteHandler() {
        FlexComponent m144getComponent;
        FlexComponentStore flexComponentStore = this.componentStore;
        if (flexComponentStore == null || (m144getComponent = flexComponentStore.m144getComponent()) == null) {
            return;
        }
        m144getComponent.getRouteHandler();
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter
    public void clear() {
        FlexComponent m144getComponent;
        FlexComponentStore flexComponentStore = this.componentStore;
        if (flexComponentStore == null || (m144getComponent = flexComponentStore.m144getComponent()) == null) {
            return;
        }
        clearActivityObserver(m144getComponent);
        bvf0.j(m144getComponent.getCoroutineScope(), null);
        this.componentStore = null;
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter
    public boolean dispatchAction(vm50 action) {
        FlexComponent m144getComponent;
        kr nestedAction;
        FlexComponentStore flexComponentStore = this.componentStore;
        if (flexComponentStore != null && (m144getComponent = flexComponentStore.m144getComponent()) != null) {
            NestedActionImpl nestedActionImpl = action instanceof NestedActionImpl ? (NestedActionImpl) action : null;
            if (nestedActionImpl != null && (nestedAction = nestedActionImpl.getNestedAction()) != null) {
                return m144getComponent.getRouteHandler().dispatchActionOnCurrent(nestedAction);
            }
            vg10.d("Unexpected NestedAction implementation: ".concat(action.getClass().getName()));
        }
        return false;
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter
    public ExecuteDivActionResult executeDivAction(String logId, JSONObject payload, String url, String widgetId) {
        FlexComponent m144getComponent;
        Div2View findByDataTag;
        FlexComponentStore flexComponentStore = this.componentStore;
        if (flexComponentStore == null || (m144getComponent = flexComponentStore.m144getComponent()) == null) {
            return ExecuteDivActionResult.WIDGET_NOT_FOUND;
        }
        ViewGroup viewGroup = (ViewGroup) m144getComponent.getContainerProvider().a();
        if (viewGroup != null && (findByDataTag = m144getComponent.getDiv2ViewLocator().findByDataTag(widgetId, viewGroup)) != null) {
            return Div2View.handleActionWithResult$default(findByDataTag, new v3k(ngd0.m(logId), payload, ngd0.m(Uri.parse(url)), 987), null, null, 6, null) ? ExecuteDivActionResult.SUCCESS : ExecuteDivActionResult.FAILURE;
        }
        return ExecuteDivActionResult.WIDGET_NOT_FOUND;
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter
    public nh5 getCurrentRouteHandler() {
        FlexComponent m144getComponent;
        FlexComponentStore flexComponentStore = this.componentStore;
        if (flexComponentStore == null || (m144getComponent = flexComponentStore.m144getComponent()) == null) {
            return null;
        }
        return m144getComponent.getRouteHandler();
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter
    public sh5 getStateManager() {
        FlexComponent m144getComponent;
        FlexComponentStore flexComponentStore = this.componentStore;
        if (flexComponentStore == null || (m144getComponent = flexComponentStore.m144getComponent()) == null) {
            return null;
        }
        return m144getComponent.getBduiStateManager();
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter
    public String getVariable(String variableName) {
        FlexComponent m144getComponent;
        com.yandex.div.core.expression.variables.a divVariableController;
        c231 g;
        Object d;
        FlexComponentStore flexComponentStore = this.componentStore;
        if (flexComponentStore == null || (m144getComponent = flexComponentStore.m144getComponent()) == null || (divVariableController = m144getComponent.getDivVariableController()) == null || (g = divVariableController.g(variableName)) == null || (d = g.d()) == null) {
            return null;
        }
        return d.toString();
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter
    public void init(FlexDependencies dependencies) {
        this.componentStore = new FlexComponentStore(dependencies);
        initRouteHandler();
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter
    public void loadScreen(ug5 query) {
        FlexComponent m144getComponent;
        FlexComponentStore flexComponentStore = this.componentStore;
        if (flexComponentStore == null || (m144getComponent = flexComponentStore.m144getComponent()) == null) {
            ny61.r("Flex adapter hasn't been initialized");
        } else {
            m144getComponent.getRouteHandler().forward(DocumentQueryMappingKt.toFlexQuery(query), null, false, b.f());
        }
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter
    public void reloadDocument() {
        FlexComponent m144getComponent;
        FlexComponentStore flexComponentStore = this.componentStore;
        if (flexComponentStore == null || (m144getComponent = flexComponentStore.m144getComponent()) == null) {
            return;
        }
        m144getComponent.getRouteHandler().reloadCurrentDocument();
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter
    public boolean restoreState(Bundle savedInstanceState) {
        FlexComponent m144getComponent;
        FlexComponentStore flexComponentStore = this.componentStore;
        if (flexComponentStore == null || (m144getComponent = flexComponentStore.m144getComponent()) == null) {
            return false;
        }
        return JasonStateSerializerKt.restoreFromBundle(m144getComponent.getJasonStateStore(), savedInstanceState);
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter
    public void saveState(Bundle outState) {
        FlexComponent m144getComponent;
        FlexComponentStore flexComponentStore = this.componentStore;
        if (flexComponentStore == null || (m144getComponent = flexComponentStore.m144getComponent()) == null) {
            return;
        }
        JasonStateSerializerKt.saveToBundle(m144getComponent.getJasonStateStore(), outState);
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter
    public void updateLifecycleObservers() {
        FlexComponent m144getComponent;
        FlexComponentStore flexComponentStore = this.componentStore;
        if (flexComponentStore == null || (m144getComponent = flexComponentStore.m144getComponent()) == null) {
            return;
        }
        clearActivityObserver(m144getComponent);
        addActivityObserver(m144getComponent, createActivityObserver(m144getComponent));
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter
    public void updateStateValue(String stateName, String valueName, Object newValue) {
        FlexComponent m144getComponent;
        FlexComponentStore flexComponentStore = this.componentStore;
        if (flexComponentStore == null || (m144getComponent = flexComponentStore.m144getComponent()) == null) {
            return;
        }
        JasonStateExtKt.updateValue(m144getComponent.getJasonStateStore(), stateName, valueName, newValue);
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter
    public void updateTheme(Theme theme) {
        FlexComponent m144getComponent;
        FlexComponentStore flexComponentStore = this.componentStore;
        if (flexComponentStore == null || (m144getComponent = flexComponentStore.m144getComponent()) == null) {
            return;
        }
        m144getComponent.getThemeController().a(theme.getKey());
    }

    @Override // com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter
    public void updateVariable(String variableName, Object newValue) {
        FlexComponent m144getComponent;
        com.yandex.div.core.expression.variables.a divVariableController;
        FlexComponentStore flexComponentStore = this.componentStore;
        if (flexComponentStore == null || (m144getComponent = flexComponentStore.m144getComponent()) == null || (divVariableController = m144getComponent.getDivVariableController()) == null) {
            return;
        }
        c231 z131Var = newValue instanceof String ? new z131(variableName, (String) newValue) : newValue instanceof Integer ? new y131(variableName, ((Number) newValue).intValue()) : newValue instanceof Long ? new y131(variableName, ((Number) newValue).longValue()) : newValue instanceof Boolean ? new u131(variableName, ((Boolean) newValue).booleanValue()) : newValue instanceof Double ? new x131(variableName, ((Number) newValue).doubleValue()) : null;
        if (z131Var != null) {
            divVariableController.i(z131Var);
        }
    }
}
