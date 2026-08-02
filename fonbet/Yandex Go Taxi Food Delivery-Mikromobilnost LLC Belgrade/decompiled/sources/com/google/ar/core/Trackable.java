package com.google.ar.core;

import java.util.Collection;

/* loaded from: classes11.dex */
public interface Trackable {
    Anchor createAnchor(Pose pose);

    Collection<Anchor> getAnchors();

    TrackingState getTrackingState();
}
