package defpackage;

import androidx.camera.core.impl.DeferrableSurface;
import java.util.List;

/* loaded from: classes10.dex */
public final class h84 extends gyq0 {
    public final DeferrableSurface a;
    public final List b;
    public final String c;
    public final int d;
    public final int e;
    public final q8n f;

    public h84(DeferrableSurface deferrableSurface, List list, String str, int i, int i2, q8n q8nVar) {
        this.a = deferrableSurface;
        this.b = list;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = q8nVar;
    }

    @Override // defpackage.gyq0
    public final q8n b() {
        return this.f;
    }

    @Override // defpackage.gyq0
    public final int c() {
        return this.d;
    }

    @Override // defpackage.gyq0
    public final String d() {
        return this.c;
    }

    @Override // defpackage.gyq0
    public final List e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gyq0)) {
            return false;
        }
        gyq0 gyq0Var = (gyq0) obj;
        if (!this.a.equals(gyq0Var.f()) || !this.b.equals(gyq0Var.e())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (gyq0Var.d() != null) {
                return false;
            }
        } else if (!str.equals(gyq0Var.d())) {
            return false;
        }
        return this.d == gyq0Var.c() && this.e == gyq0Var.g() && this.f.equals(gyq0Var.b());
    }

    @Override // defpackage.gyq0
    public final DeferrableSurface f() {
        return this.a;
    }

    @Override // defpackage.gyq0
    public final int g() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return this.f.hashCode() ^ ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=" + this.c + ", mirrorMode=" + this.d + ", surfaceGroupId=" + this.e + ", dynamicRange=" + this.f + "}";
    }
}
