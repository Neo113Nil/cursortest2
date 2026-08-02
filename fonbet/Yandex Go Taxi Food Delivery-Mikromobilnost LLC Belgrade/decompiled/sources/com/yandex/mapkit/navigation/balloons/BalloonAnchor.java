package com.yandex.mapkit.navigation.balloons;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class BalloonAnchor implements Serializable {
    private HorizontalPosition horizontal;
    private VerticalPosition vertical;

    public BalloonAnchor(VerticalPosition verticalPosition, HorizontalPosition horizontalPosition) {
        if (verticalPosition == null) {
            ny61.g("Required field \"vertical\" cannot be null");
            throw null;
        }
        if (horizontalPosition == null) {
            ny61.g("Required field \"horizontal\" cannot be null");
            throw null;
        }
        this.vertical = verticalPosition;
        this.horizontal = horizontalPosition;
    }

    public HorizontalPosition getHorizontal() {
        return this.horizontal;
    }

    public VerticalPosition getVertical() {
        return this.vertical;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.vertical = (VerticalPosition) archive.add((Archive) this.vertical, false, (Class<Archive>) VerticalPosition.class);
        this.horizontal = (HorizontalPosition) archive.add((Archive) this.horizontal, false, (Class<Archive>) HorizontalPosition.class);
    }

    public BalloonAnchor() {
    }
}
