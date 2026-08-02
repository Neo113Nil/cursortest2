package androidx.camera.core;

import androidx.camera.core.CameraState;
import defpackage.ny61;

/* loaded from: classes10.dex */
public final class a extends CameraState {
    public final CameraState.Type a;
    public final CameraState.a b;

    public a(CameraState.Type type, CameraState.a aVar) {
        if (type == null) {
            ny61.t("Null type");
            throw null;
        }
        this.a = type;
        this.b = aVar;
    }

    @Override // androidx.camera.core.CameraState
    public final CameraState.a a() {
        return this.b;
    }

    @Override // androidx.camera.core.CameraState
    public final CameraState.Type b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState)) {
            return false;
        }
        CameraState cameraState = (CameraState) obj;
        if (!this.a.equals(cameraState.b())) {
            return false;
        }
        CameraState.a aVar = this.b;
        return aVar == null ? cameraState.a() == null : aVar.equals(cameraState.a());
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        CameraState.a aVar = this.b;
        return (aVar == null ? 0 : aVar.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "CameraState{type=" + this.a + ", error=" + this.b + "}";
    }
}
