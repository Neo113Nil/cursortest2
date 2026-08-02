package com.yandex.mapkit.navigation.transport.layer;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public final class NavigationLayerSettings implements Serializable {
    private boolean useLayerBalloons;
    private boolean useLayerCamera;
    private boolean useLayerCollectionSetup;
    private boolean useLayerCursor;
    private boolean useLayerManoeuvres;

    public NavigationLayerSettings() {
        this.useLayerCamera = true;
        this.useLayerCursor = true;
        this.useLayerBalloons = true;
        this.useLayerManoeuvres = false;
        this.useLayerCollectionSetup = true;
    }

    public boolean getUseLayerBalloons() {
        return this.useLayerBalloons;
    }

    public boolean getUseLayerCamera() {
        return this.useLayerCamera;
    }

    public boolean getUseLayerCollectionSetup() {
        return this.useLayerCollectionSetup;
    }

    public boolean getUseLayerCursor() {
        return this.useLayerCursor;
    }

    public boolean getUseLayerManoeuvres() {
        return this.useLayerManoeuvres;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.useLayerCamera = archive.add(this.useLayerCamera);
        this.useLayerCursor = archive.add(this.useLayerCursor);
        this.useLayerBalloons = archive.add(this.useLayerBalloons);
        this.useLayerManoeuvres = archive.add(this.useLayerManoeuvres);
        this.useLayerCollectionSetup = archive.add(this.useLayerCollectionSetup);
    }

    public NavigationLayerSettings setUseLayerBalloons(boolean z) {
        this.useLayerBalloons = z;
        return this;
    }

    public NavigationLayerSettings setUseLayerCamera(boolean z) {
        this.useLayerCamera = z;
        return this;
    }

    public NavigationLayerSettings setUseLayerCollectionSetup(boolean z) {
        this.useLayerCollectionSetup = z;
        return this;
    }

    public NavigationLayerSettings setUseLayerCursor(boolean z) {
        this.useLayerCursor = z;
        return this;
    }

    public NavigationLayerSettings setUseLayerManoeuvres(boolean z) {
        this.useLayerManoeuvres = z;
        return this;
    }

    public NavigationLayerSettings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.useLayerCamera = z;
        this.useLayerCursor = z2;
        this.useLayerBalloons = z3;
        this.useLayerManoeuvres = z4;
        this.useLayerCollectionSetup = z5;
    }
}
