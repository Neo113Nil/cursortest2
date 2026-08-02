package com.yandex.fintechsdk.adapters.flex.sdk.api;

import android.os.Bundle;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.fintechsdk.entities.theme.Theme;
import defpackage.nh5;
import defpackage.sh5;
import defpackage.ug5;
import defpackage.vm50;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0001H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020\u0015H&¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0001H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H&¢\u0006\u0004\b$\u0010\fJ1\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00152\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0015H&¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0004H&¢\u0006\u0004\b4\u0010\fR\u0016\u00108\u001a\u0004\u0018\u0001058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexAdapter;", "", "Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexDependencies;", "dependencies", "Lzy11;", "init", "(Lcom/yandex/fintechsdk/adapters/flex/sdk/api/FlexDependencies;)V", "Lug5;", "query", "loadScreen", "(Lug5;)V", "reloadDocument", "()V", "Lvm50;", "action", "", "dispatchAction", "(Lvm50;)Z", "Lnh5;", "getCurrentRouteHandler", "()Lnh5;", "", "stateName", "valueName", "newValue", "updateStateValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Lcom/yandex/fintechsdk/entities/theme/Theme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "updateTheme", "(Lcom/yandex/fintechsdk/entities/theme/Theme;)V", "variableName", "getVariable", "(Ljava/lang/String;)Ljava/lang/String;", "updateVariable", "(Ljava/lang/String;Ljava/lang/Object;)V", "updateLifecycleObservers", "logId", "Lorg/json/JSONObject;", "payload", "url", "widgetId", "Lcom/yandex/fintechsdk/adapters/flex/sdk/api/ExecuteDivActionResult;", "executeDivAction", "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/fintechsdk/adapters/flex/sdk/api/ExecuteDivActionResult;", "Landroid/os/Bundle;", "outState", "saveState", "(Landroid/os/Bundle;)V", "savedInstanceState", "restoreState", "(Landroid/os/Bundle;)Z", "clear", "Lsh5;", "getStateManager", "()Lsh5;", "stateManager", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface FlexAdapter {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean restoreState(FlexAdapter flexAdapter, Bundle bundle) {
            return false;
        }

        public static void saveState(FlexAdapter flexAdapter, Bundle bundle) {
        }
    }

    void clear();

    boolean dispatchAction(vm50 action);

    ExecuteDivActionResult executeDivAction(String logId, JSONObject payload, String url, String widgetId);

    nh5 getCurrentRouteHandler();

    sh5 getStateManager();

    String getVariable(String variableName);

    void init(FlexDependencies dependencies);

    void loadScreen(ug5 query);

    void reloadDocument();

    boolean restoreState(Bundle savedInstanceState);

    void saveState(Bundle outState);

    void updateLifecycleObservers();

    void updateStateValue(String stateName, String valueName, Object newValue);

    void updateTheme(Theme theme);

    void updateVariable(String variableName, Object newValue);
}
