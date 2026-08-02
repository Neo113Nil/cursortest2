package com.google.ar.core;

/* loaded from: classes11.dex */
enum ai {
    a(Trackable.class, "BASE_TRACKABLE"),
    b(null, "UNKNOWN_TO_JAVA"),
    c(Plane.class, "PLANE"),
    d(Point.class, "POINT"),
    e(AugmentedImage.class, "AUGMENTED_IMAGE"),
    f(AugmentedFace.class, "FACE"),
    g(StreetscapeGeometry.class, "STREETSCAPE_GEOMETRY"),
    h(Earth.class, "EARTH"),
    i(DepthPoint.class, "DEPTH_POINT"),
    j(InstantPlacementPoint.class, "INSTANT_PLACEMENT_POINT");

    final int k;
    private final Class l;

    ai(Class cls, String str) {
        this.k = r2;
        this.l = cls;
    }

    public static ai a(Class cls) {
        for (ai aiVar : values()) {
            Class cls2 = aiVar.l;
            if (cls2 != null && cls2.equals(cls)) {
                return aiVar;
            }
        }
        return b;
    }
}
