package com.yandex.mapkit.navigation.balloons;

import android.graphics.PointF;
import com.yandex.mapkit.map.Rect;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class BalloonGeometry implements Serializable {
    private BalloonAnchor anchor;
    private Rect balloonRect;
    private Rect contentRect;
    private float height;
    private PointF imageAnchor;
    private float width;

    public BalloonGeometry(BalloonAnchor balloonAnchor, float f, float f2, PointF pointF, Rect rect, Rect rect2) {
        if (balloonAnchor == null) {
            ny61.g("Required field \"anchor\" cannot be null");
            throw null;
        }
        if (pointF == null) {
            ny61.g("Required field \"imageAnchor\" cannot be null");
            throw null;
        }
        if (rect == null) {
            ny61.g("Required field \"contentRect\" cannot be null");
            throw null;
        }
        if (rect2 == null) {
            ny61.g("Required field \"balloonRect\" cannot be null");
            throw null;
        }
        this.anchor = balloonAnchor;
        this.width = f;
        this.height = f2;
        this.imageAnchor = pointF;
        this.contentRect = rect;
        this.balloonRect = rect2;
    }

    public BalloonAnchor getAnchor() {
        return this.anchor;
    }

    public Rect getBalloonRect() {
        return this.balloonRect;
    }

    public Rect getContentRect() {
        return this.contentRect;
    }

    public float getHeight() {
        return this.height;
    }

    public PointF getImageAnchor() {
        return this.imageAnchor;
    }

    public float getWidth() {
        return this.width;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.anchor = (BalloonAnchor) archive.add((Archive) this.anchor, false, (Class<Archive>) BalloonAnchor.class);
        this.width = archive.add(this.width);
        this.height = archive.add(this.height);
        this.imageAnchor = archive.add(this.imageAnchor, false);
        this.contentRect = (Rect) archive.add((Archive) this.contentRect, false, (Class<Archive>) Rect.class);
        this.balloonRect = (Rect) archive.add((Archive) this.balloonRect, false, (Class<Archive>) Rect.class);
    }

    public BalloonGeometry() {
    }
}
