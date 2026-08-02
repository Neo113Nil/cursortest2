package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes10.dex */
public final class m74 extends zr80 {
    public final UUID a;
    public final int b;
    public final int c;
    public final Rect d;
    public final Size e;
    public final int f;
    public final boolean g;

    public m74(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid == null) {
            ny61.t("Null getUuid");
            throw null;
        }
        this.a = uuid;
        this.b = i;
        this.c = i2;
        if (rect == null) {
            ny61.t("Null getCropRect");
            throw null;
        }
        this.d = rect;
        if (size == null) {
            ny61.t("Null getSize");
            throw null;
        }
        this.e = size;
        this.f = i3;
        this.g = z;
    }

    @Override // defpackage.zr80
    public final Rect a() {
        return this.d;
    }

    @Override // defpackage.zr80
    public final int b() {
        return this.c;
    }

    @Override // defpackage.zr80
    public final int c() {
        return this.f;
    }

    @Override // defpackage.zr80
    public final Size d() {
        return this.e;
    }

    @Override // defpackage.zr80
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zr80)) {
            return false;
        }
        zr80 zr80Var = (zr80) obj;
        return this.a.equals(zr80Var.f()) && this.b == zr80Var.e() && this.c == zr80Var.b() && this.d.equals(zr80Var.a()) && this.e.equals(zr80Var.d()) && this.f == zr80Var.c() && this.g == zr80Var.g() && !zr80Var.h();
    }

    @Override // defpackage.zr80
    public final UUID f() {
        return this.a;
    }

    @Override // defpackage.zr80
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.zr80
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return (((this.g ? 1231 : 1237) ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.a);
        sb.append(", getTargets=");
        sb.append(this.b);
        sb.append(", getFormat=");
        sb.append(this.c);
        sb.append(", getCropRect=");
        sb.append(this.d);
        sb.append(", getSize=");
        sb.append(this.e);
        sb.append(", getRotationDegrees=");
        sb.append(this.f);
        sb.append(", isMirroring=");
        return x4e.i(sb, this.g, ", shouldRespectInputCropRect=false}");
    }
}
