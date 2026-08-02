package defpackage;

import android.util.Range;
import android.util.Size;

/* loaded from: classes10.dex */
public final class o84 extends lru0 {
    public final Size b;
    public final Size c;
    public final q8n d;
    public final int e;
    public final Range f;
    public final szd g;
    public final boolean h;

    public o84(Size size, Size size2, q8n q8nVar, int i, Range range, szd szdVar, boolean z) {
        this.b = size;
        this.c = size2;
        this.d = q8nVar;
        this.e = i;
        this.f = range;
        this.g = szdVar;
        this.h = z;
    }

    @Override // defpackage.lru0
    public final q8n b() {
        return this.d;
    }

    @Override // defpackage.lru0
    public final Range c() {
        return this.f;
    }

    @Override // defpackage.lru0
    public final szd d() {
        return this.g;
    }

    @Override // defpackage.lru0
    public final Size e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lru0)) {
            return false;
        }
        lru0 lru0Var = (lru0) obj;
        if (!this.b.equals(lru0Var.f()) || !this.c.equals(lru0Var.e()) || !this.d.equals(lru0Var.b()) || this.e != lru0Var.g() || !this.f.equals(lru0Var.c())) {
            return false;
        }
        szd szdVar = this.g;
        if (szdVar == null) {
            if (lru0Var.d() != null) {
                return false;
            }
        } else if (!szdVar.equals(lru0Var.d())) {
            return false;
        }
        return this.h == lru0Var.h();
    }

    @Override // defpackage.lru0
    public final Size f() {
        return this.b;
    }

    @Override // defpackage.lru0
    public final int g() {
        return this.e;
    }

    @Override // defpackage.lru0
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003;
        szd szdVar = this.g;
        return (this.h ? 1231 : 1237) ^ ((hashCode ^ (szdVar == null ? 0 : szdVar.hashCode())) * 1000003);
    }

    @Override // defpackage.lru0
    public final j4n i() {
        j4n j4nVar = new j4n();
        j4nVar.a = f();
        j4nVar.b = e();
        j4nVar.c = b();
        j4nVar.x = Integer.valueOf(g());
        j4nVar.y = c();
        j4nVar.z = d();
        j4nVar.w = Boolean.valueOf(h());
        return j4nVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.b);
        sb.append(", originalConfiguredResolution=");
        sb.append(this.c);
        sb.append(", dynamicRange=");
        sb.append(this.d);
        sb.append(", sessionType=");
        sb.append(this.e);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.f);
        sb.append(", implementationOptions=");
        sb.append(this.g);
        sb.append(", zslDisabled=");
        return x4e.i(sb, this.h, "}");
    }
}
