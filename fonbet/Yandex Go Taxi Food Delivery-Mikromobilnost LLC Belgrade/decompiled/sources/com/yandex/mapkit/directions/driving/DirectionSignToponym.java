package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class DirectionSignToponym implements Serializable {
    private DirectionSignStyle style;
    private String text;

    public DirectionSignToponym(String str, DirectionSignStyle directionSignStyle) {
        if (str == null) {
            ny61.g("Required field \"text\" cannot be null");
            throw null;
        }
        if (directionSignStyle == null) {
            ny61.g("Required field \"style\" cannot be null");
            throw null;
        }
        this.text = str;
        this.style = directionSignStyle;
    }

    public DirectionSignStyle getStyle() {
        return this.style;
    }

    public String getText() {
        return this.text;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.text = archive.add(this.text, false);
        this.style = (DirectionSignStyle) archive.add((Archive) this.style, false, (Class<Archive>) DirectionSignStyle.class);
    }

    public DirectionSignToponym() {
    }
}
