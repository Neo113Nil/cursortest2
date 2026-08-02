package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class DirectionSignIcon implements Serializable {
    private DirectionSignImage image;
    private DirectionSignStyle style;

    public DirectionSignIcon(DirectionSignImage directionSignImage, DirectionSignStyle directionSignStyle) {
        if (directionSignImage == null) {
            ny61.g("Required field \"image\" cannot be null");
            throw null;
        }
        if (directionSignStyle == null) {
            ny61.g("Required field \"style\" cannot be null");
            throw null;
        }
        this.image = directionSignImage;
        this.style = directionSignStyle;
    }

    public DirectionSignImage getImage() {
        return this.image;
    }

    public DirectionSignStyle getStyle() {
        return this.style;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.image = (DirectionSignImage) archive.add((Archive) this.image, false, (Class<Archive>) DirectionSignImage.class);
        this.style = (DirectionSignStyle) archive.add((Archive) this.style, false, (Class<Archive>) DirectionSignStyle.class);
    }

    public DirectionSignIcon() {
    }
}
