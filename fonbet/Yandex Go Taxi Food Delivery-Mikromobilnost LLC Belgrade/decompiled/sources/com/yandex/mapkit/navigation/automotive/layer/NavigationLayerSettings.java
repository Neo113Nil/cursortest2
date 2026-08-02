package com.yandex.mapkit.navigation.automotive.layer;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public final class NavigationLayerSettings implements Serializable {
    private boolean useDefaultSublayersSetup;
    private boolean useLayerBalloonsInGuidance;
    private boolean useLayerBalloonsInNavigation;
    private boolean useLayerCamera;
    private boolean useLayerCursor;
    private boolean useLayerRequestPoints;
    private boolean useLayerRoadEvents;
    private boolean useLayerRoutes;

    public NavigationLayerSettings() {
        this.useLayerCamera = true;
        this.useLayerCursor = true;
        this.useLayerBalloonsInNavigation = true;
        this.useLayerBalloonsInGuidance = true;
        this.useLayerRoutes = true;
        this.useLayerRequestPoints = true;
        this.useLayerRoadEvents = true;
        this.useDefaultSublayersSetup = true;
    }

    public boolean getUseDefaultSublayersSetup() {
        return this.useDefaultSublayersSetup;
    }

    public boolean getUseLayerBalloonsInGuidance() {
        return this.useLayerBalloonsInGuidance;
    }

    public boolean getUseLayerBalloonsInNavigation() {
        return this.useLayerBalloonsInNavigation;
    }

    public boolean getUseLayerCamera() {
        return this.useLayerCamera;
    }

    public boolean getUseLayerCursor() {
        return this.useLayerCursor;
    }

    public boolean getUseLayerRequestPoints() {
        return this.useLayerRequestPoints;
    }

    public boolean getUseLayerRoadEvents() {
        return this.useLayerRoadEvents;
    }

    public boolean getUseLayerRoutes() {
        return this.useLayerRoutes;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.useLayerCamera = archive.add(this.useLayerCamera);
        this.useLayerCursor = archive.add(this.useLayerCursor);
        this.useLayerBalloonsInNavigation = archive.add(this.useLayerBalloonsInNavigation);
        this.useLayerBalloonsInGuidance = archive.add(this.useLayerBalloonsInGuidance);
        this.useLayerRoutes = archive.add(this.useLayerRoutes);
        this.useLayerRequestPoints = archive.add(this.useLayerRequestPoints);
        this.useLayerRoadEvents = archive.add(this.useLayerRoadEvents);
        this.useDefaultSublayersSetup = archive.add(this.useDefaultSublayersSetup);
    }

    public NavigationLayerSettings setUseDefaultSublayersSetup(boolean z) {
        this.useDefaultSublayersSetup = z;
        return this;
    }

    public NavigationLayerSettings setUseLayerBalloonsInGuidance(boolean z) {
        this.useLayerBalloonsInGuidance = z;
        return this;
    }

    public NavigationLayerSettings setUseLayerBalloonsInNavigation(boolean z) {
        this.useLayerBalloonsInNavigation = z;
        return this;
    }

    public NavigationLayerSettings setUseLayerCamera(boolean z) {
        this.useLayerCamera = z;
        return this;
    }

    public NavigationLayerSettings setUseLayerCursor(boolean z) {
        this.useLayerCursor = z;
        return this;
    }

    public NavigationLayerSettings setUseLayerRequestPoints(boolean z) {
        this.useLayerRequestPoints = z;
        return this;
    }

    public NavigationLayerSettings setUseLayerRoadEvents(boolean z) {
        this.useLayerRoadEvents = z;
        return this;
    }

    public NavigationLayerSettings setUseLayerRoutes(boolean z) {
        this.useLayerRoutes = z;
        return this;
    }

    public NavigationLayerSettings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.useLayerCamera = z;
        this.useLayerCursor = z2;
        this.useLayerBalloonsInNavigation = z3;
        this.useLayerBalloonsInGuidance = z4;
        this.useLayerRoutes = z5;
        this.useLayerRequestPoints = z6;
        this.useLayerRoadEvents = z7;
        this.useDefaultSublayersSetup = z8;
    }
}
