package com.yandex.mapkit.navigation.transport;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class RouteManoeuvre implements Serializable {
    private RouteAction action;

    public RouteManoeuvre(RouteAction routeAction) {
        if (routeAction != null) {
            this.action = routeAction;
        } else {
            ny61.g("Required field \"action\" cannot be null");
            throw null;
        }
    }

    public RouteAction getAction() {
        return this.action;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.action = (RouteAction) archive.add((Archive) this.action, false, (Class<Archive>) RouteAction.class);
    }

    public RouteManoeuvre() {
    }
}
