package com.yandex.mapkit.transport.masstransit;

import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class IndoorSegment implements Serializable {
    private IndoorData indoorData;
    private Subpolyline subpolyline;

    public static class IndoorData implements Serializable {
        private Connector connector;
        private IndoorLevel indoorLevel;

        public static IndoorData fromConnector(Connector connector) {
            if (connector == null) {
                ny61.g("Variant value \"connector\" cannot be null");
                return null;
            }
            IndoorData indoorData = new IndoorData();
            indoorData.connector = connector;
            return indoorData;
        }

        public static IndoorData fromIndoorLevel(IndoorLevel indoorLevel) {
            if (indoorLevel == null) {
                ny61.g("Variant value \"indoorLevel\" cannot be null");
                return null;
            }
            IndoorData indoorData = new IndoorData();
            indoorData.indoorLevel = indoorLevel;
            return indoorData;
        }

        public Connector getConnector() {
            return this.connector;
        }

        public IndoorLevel getIndoorLevel() {
            return this.indoorLevel;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.indoorLevel = (IndoorLevel) archive.add((Archive) this.indoorLevel, true, (Class<Archive>) IndoorLevel.class);
            this.connector = (Connector) archive.add((Archive) this.connector, true, (Class<Archive>) Connector.class);
        }
    }

    public IndoorSegment(IndoorData indoorData, Subpolyline subpolyline) {
        if (indoorData == null) {
            ny61.g("Required field \"indoorData\" cannot be null");
            throw null;
        }
        if (subpolyline == null) {
            ny61.g("Required field \"subpolyline\" cannot be null");
            throw null;
        }
        this.indoorData = indoorData;
        this.subpolyline = subpolyline;
    }

    public IndoorData getIndoorData() {
        return this.indoorData;
    }

    public Subpolyline getSubpolyline() {
        return this.subpolyline;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.indoorData = (IndoorData) archive.add((Archive) this.indoorData, false, (Class<Archive>) IndoorData.class);
        this.subpolyline = (Subpolyline) archive.add((Archive) this.subpolyline, false, (Class<Archive>) Subpolyline.class);
    }

    public IndoorSegment() {
    }
}
