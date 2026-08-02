package com.yandex.mapkit.search;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Stop implements Serializable {
    private LocalizedValue distance;
    private Line line;
    private String name;
    private Point point;
    private String stopId;
    private Style style;

    public Stop(String str, LocalizedValue localizedValue, Style style, Point point, String str2, Line line) {
        if (str == null) {
            ny61.g("Required field \"name\" cannot be null");
            throw null;
        }
        if (localizedValue == null) {
            ny61.g("Required field \"distance\" cannot be null");
            throw null;
        }
        if (style == null) {
            ny61.g("Required field \"style\" cannot be null");
            throw null;
        }
        if (point == null) {
            ny61.g("Required field \"point\" cannot be null");
            throw null;
        }
        this.name = str;
        this.distance = localizedValue;
        this.style = style;
        this.point = point;
        this.stopId = str2;
        this.line = line;
    }

    public LocalizedValue getDistance() {
        return this.distance;
    }

    public Line getLine() {
        return this.line;
    }

    public String getName() {
        return this.name;
    }

    public Point getPoint() {
        return this.point;
    }

    public String getStopId() {
        return this.stopId;
    }

    public Style getStyle() {
        return this.style;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.name = archive.add(this.name, false);
        this.distance = (LocalizedValue) archive.add((Archive) this.distance, false, (Class<Archive>) LocalizedValue.class);
        this.style = (Style) archive.add((Archive) this.style, false, (Class<Archive>) Style.class);
        this.point = (Point) archive.add((Archive) this.point, false, (Class<Archive>) Point.class);
        this.stopId = archive.add(this.stopId, true);
        this.line = (Line) archive.add((Archive) this.line, true, (Class<Archive>) Line.class);
    }

    public static class Style implements Serializable {
        private int color;

        public Style(int i) {
            this.color = i;
        }

        public int getColor() {
            return this.color;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.color = archive.add(this.color);
        }

        public Style() {
        }
    }

    public Stop() {
    }
}
