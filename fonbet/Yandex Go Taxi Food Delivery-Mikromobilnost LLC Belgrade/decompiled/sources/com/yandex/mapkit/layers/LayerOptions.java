package com.yandex.mapkit.layers;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes7.dex */
public final class LayerOptions implements Serializable {
    private boolean active;
    private boolean animateOnActivation;
    private boolean cacheable;
    private String clusteringParams;
    private boolean nightModeAvailable;
    private OverzoomMode overzoomMode;
    private ProjectionMode projectionMode;
    private long tileAppearingAnimationDuration;
    private boolean transparent;
    private boolean versionSupport;

    public LayerOptions(boolean z, boolean z2, boolean z3, boolean z4, long j, OverzoomMode overzoomMode, boolean z5, String str, boolean z6, ProjectionMode projectionMode) {
        this.active = true;
        this.nightModeAvailable = true;
        this.cacheable = false;
        this.animateOnActivation = false;
        this.tileAppearingAnimationDuration = 400L;
        this.overzoomMode = OverzoomMode.DISABLED;
        this.transparent = false;
        this.clusteringParams = null;
        this.versionSupport = true;
        this.projectionMode = ProjectionMode.DISABLED;
        if (overzoomMode == null) {
            ny61.g("Required field \"overzoomMode\" cannot be null");
            throw null;
        }
        if (projectionMode == null) {
            ny61.g("Required field \"projectionMode\" cannot be null");
            throw null;
        }
        this.active = z;
        this.nightModeAvailable = z2;
        this.cacheable = z3;
        this.animateOnActivation = z4;
        this.tileAppearingAnimationDuration = j;
        this.overzoomMode = overzoomMode;
        this.transparent = z5;
        this.clusteringParams = str;
        this.versionSupport = z6;
        this.projectionMode = projectionMode;
    }

    public boolean getActive() {
        return this.active;
    }

    public boolean getAnimateOnActivation() {
        return this.animateOnActivation;
    }

    public boolean getCacheable() {
        return this.cacheable;
    }

    public String getClusteringParams() {
        return this.clusteringParams;
    }

    public boolean getNightModeAvailable() {
        return this.nightModeAvailable;
    }

    public OverzoomMode getOverzoomMode() {
        return this.overzoomMode;
    }

    public ProjectionMode getProjectionMode() {
        return this.projectionMode;
    }

    public long getTileAppearingAnimationDuration() {
        return this.tileAppearingAnimationDuration;
    }

    public boolean getTransparent() {
        return this.transparent;
    }

    public boolean getVersionSupport() {
        return this.versionSupport;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.active = archive.add(this.active);
        this.nightModeAvailable = archive.add(this.nightModeAvailable);
        this.cacheable = archive.add(this.cacheable);
        this.animateOnActivation = archive.add(this.animateOnActivation);
        this.tileAppearingAnimationDuration = archive.add(this.tileAppearingAnimationDuration);
        this.overzoomMode = (OverzoomMode) archive.add((Archive) this.overzoomMode, false, (Class<Archive>) OverzoomMode.class);
        this.transparent = archive.add(this.transparent);
        this.clusteringParams = archive.add(this.clusteringParams, true);
        this.versionSupport = archive.add(this.versionSupport);
        this.projectionMode = (ProjectionMode) archive.add((Archive) this.projectionMode, false, (Class<Archive>) ProjectionMode.class);
    }

    public LayerOptions setActive(boolean z) {
        this.active = z;
        return this;
    }

    public LayerOptions setAnimateOnActivation(boolean z) {
        this.animateOnActivation = z;
        return this;
    }

    public LayerOptions setCacheable(boolean z) {
        this.cacheable = z;
        return this;
    }

    public LayerOptions setClusteringParams(String str) {
        this.clusteringParams = str;
        return this;
    }

    public LayerOptions setNightModeAvailable(boolean z) {
        this.nightModeAvailable = z;
        return this;
    }

    public LayerOptions setOverzoomMode(OverzoomMode overzoomMode) {
        if (overzoomMode != null) {
            this.overzoomMode = overzoomMode;
            return this;
        }
        ny61.g("Required field \"overzoomMode\" cannot be null");
        return null;
    }

    public LayerOptions setProjectionMode(ProjectionMode projectionMode) {
        if (projectionMode != null) {
            this.projectionMode = projectionMode;
            return this;
        }
        ny61.g("Required field \"projectionMode\" cannot be null");
        return null;
    }

    public LayerOptions setTileAppearingAnimationDuration(long j) {
        this.tileAppearingAnimationDuration = j;
        return this;
    }

    public LayerOptions setTransparent(boolean z) {
        this.transparent = z;
        return this;
    }

    public LayerOptions setVersionSupport(boolean z) {
        this.versionSupport = z;
        return this;
    }

    public LayerOptions() {
        this.active = true;
        this.nightModeAvailable = true;
        this.cacheable = false;
        this.animateOnActivation = false;
        this.tileAppearingAnimationDuration = 400L;
        this.overzoomMode = OverzoomMode.DISABLED;
        this.transparent = false;
        this.clusteringParams = null;
        this.versionSupport = true;
        this.projectionMode = ProjectionMode.DISABLED;
    }

    public LayerOptions(boolean z, boolean z2, boolean z3, boolean z4, long j, OverzoomMode overzoomMode, boolean z5, boolean z6) {
        this.active = true;
        this.nightModeAvailable = true;
        this.cacheable = false;
        this.animateOnActivation = false;
        this.tileAppearingAnimationDuration = 400L;
        this.overzoomMode = OverzoomMode.DISABLED;
        this.transparent = false;
        this.clusteringParams = null;
        this.versionSupport = true;
        this.projectionMode = ProjectionMode.DISABLED;
        if (overzoomMode != null) {
            this.active = z;
            this.nightModeAvailable = z2;
            this.cacheable = z3;
            this.animateOnActivation = z4;
            this.tileAppearingAnimationDuration = j;
            this.overzoomMode = overzoomMode;
            this.transparent = z5;
            this.versionSupport = z6;
            return;
        }
        ny61.g("Required field \"overzoomMode\" cannot be null");
        throw null;
    }
}
