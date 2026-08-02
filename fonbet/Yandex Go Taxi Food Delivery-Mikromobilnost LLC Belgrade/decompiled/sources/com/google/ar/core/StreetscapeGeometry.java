package com.google.ar.core;

import defpackage.yx61;
import java.util.Collection;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public class StreetscapeGeometry extends TrackableBase {

    public enum Quality {
        NONE(0),
        BUILDING_LOD_1(1),
        BUILDING_LOD_2(2);

        final int nativeCode;

        Quality(int i) {
            this.nativeCode = i;
        }

        public static Quality forNumber(int i) {
            for (Quality quality : values()) {
                if (quality.nativeCode == i) {
                    return quality;
                }
            }
            yx61.f(a0.a((byte) 63, i, "Unexpected value for native StreetscapeGeometry.Quality, value="));
            return null;
        }
    }

    public enum Type {
        TERRAIN(0),
        BUILDING(1);

        final int nativeCode;

        Type(int i) {
            this.nativeCode = i;
        }

        public static Type forNumber(int i) {
            for (Type type : values()) {
                if (type.nativeCode == i) {
                    return type;
                }
            }
            yx61.f(a0.a(Alerts.alert_export_restriction, i, "Unexpected value for native StreetscapeGeometry.Type, value="));
            return null;
        }
    }

    public StreetscapeGeometry(long j, Session session) {
        super(j, session);
    }

    private native long nativeAcquireMesh(long j, long j2);

    private native Pose nativeGetMeshPose(long j, long j2);

    private native int nativeGetQuality(long j, long j2);

    private native int nativeGetType(long j, long j2);

    private native void nativeReleaseStreetscapeGeometry(long j, long j2);

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.ar.core.TrackableBase
    public void finalize() throws Throwable {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseStreetscapeGeometry(this.session.nativeSymbolTableHandle, j);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    public Mesh getMesh() {
        long nativeAcquireMesh = nativeAcquireMesh(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeAcquireMesh != 0) {
            return new Mesh(nativeAcquireMesh, this.session);
        }
        return null;
    }

    public Pose getMeshPose() {
        return nativeGetMeshPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Quality getQuality() {
        return Quality.forNumber(nativeGetQuality(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    public Type getType() {
        return Type.forNumber(nativeGetType(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }
}
