package com.google.ar.core;

import defpackage.yx61;

/* loaded from: classes11.dex */
public enum SemanticLabel {
    UNLABELED(0),
    SKY(1),
    BUILDING(2),
    TREE(3),
    ROAD(4),
    SIDEWALK(5),
    TERRAIN(6),
    STRUCTURE(7),
    OBJECT(8),
    VEHICLE(9),
    PERSON(10),
    WATER(11);

    final int nativeCode;

    SemanticLabel(int i) {
        this.nativeCode = i;
    }

    public static SemanticLabel forNumber(int i) {
        for (SemanticLabel semanticLabel : values()) {
            if (semanticLabel.nativeCode == i) {
                return semanticLabel;
            }
        }
        yx61.f(a0.a((byte) 49, i, "Unexpected value for native SemanticLabel, value="));
        return null;
    }
}
