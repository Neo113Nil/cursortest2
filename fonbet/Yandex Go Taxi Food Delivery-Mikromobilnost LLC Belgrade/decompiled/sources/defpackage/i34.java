package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* loaded from: classes10.dex */
public final class i34 {
    public final anw0 a;
    public final int b;
    public final Size c;
    public final q8n d;
    public final List e;
    public final szd f;
    public final int g;
    public final Range h;
    public final boolean i;

    public i34(anw0 anw0Var, int i, Size size, q8n q8nVar, List list, szd szdVar, int i2, Range range, boolean z) {
        this.a = anw0Var;
        this.b = i;
        if (size == null) {
            ny61.t("Null size");
            throw null;
        }
        this.c = size;
        if (q8nVar == null) {
            ny61.t("Null dynamicRange");
            throw null;
        }
        this.d = q8nVar;
        if (list == null) {
            ny61.t("Null captureTypes");
            throw null;
        }
        this.e = list;
        this.f = szdVar;
        this.g = i2;
        if (range == null) {
            ny61.t("Null targetFrameRate");
            throw null;
        }
        this.h = range;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i34)) {
            return false;
        }
        i34 i34Var = (i34) obj;
        if (!this.a.equals(i34Var.a) || this.b != i34Var.b || !this.c.equals(i34Var.c) || !this.d.equals(i34Var.d) || !this.e.equals(i34Var.e)) {
            return false;
        }
        szd szdVar = i34Var.f;
        szd szdVar2 = this.f;
        if (szdVar2 == null) {
            if (szdVar != null) {
                return false;
            }
        } else if (!szdVar2.equals(szdVar)) {
            return false;
        }
        return this.g == i34Var.g && this.h.equals(i34Var.h) && this.i == i34Var.i;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        szd szdVar = this.f;
        return (this.i ? 1231 : 1237) ^ ((((((hashCode ^ (szdVar == null ? 0 : szdVar.hashCode())) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb.append(this.a);
        sb.append(", imageFormat=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", dynamicRange=");
        sb.append(this.d);
        sb.append(", captureTypes=");
        sb.append(this.e);
        sb.append(", implementationOptions=");
        sb.append(this.f);
        sb.append(", sessionType=");
        sb.append(this.g);
        sb.append(", targetFrameRate=");
        sb.append(this.h);
        sb.append(", strictFrameRateRequired=");
        return x4e.i(sb, this.i, "}");
    }
}
