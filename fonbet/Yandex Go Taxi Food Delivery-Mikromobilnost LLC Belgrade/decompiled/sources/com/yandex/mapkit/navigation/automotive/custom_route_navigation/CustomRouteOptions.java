package com.yandex.mapkit.navigation.automotive.custom_route_navigation;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public final class CustomRouteOptions implements Serializable {
    private Boolean allowMoreUturns;

    public CustomRouteOptions() {
        this.allowMoreUturns = null;
    }

    public Boolean getAllowMoreUturns() {
        return this.allowMoreUturns;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.allowMoreUturns = archive.add(this.allowMoreUturns, true);
    }

    public CustomRouteOptions setAllowMoreUturns(Boolean bool) {
        this.allowMoreUturns = bool;
        return this;
    }

    public CustomRouteOptions(Boolean bool) {
        this.allowMoreUturns = bool;
    }
}
