package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class l74 extends pm40 {
    public final int a;
    public final int b;
    public final String c;
    public final ArrayList d;
    public final int e;
    public final int f;

    public l74(int i, int i2, String str, ArrayList arrayList, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = arrayList;
        this.e = i3;
        this.f = i4;
    }

    @Override // defpackage.xn7
    public final int a() {
        return this.b;
    }

    @Override // defpackage.xn7
    public final String b() {
        return this.c;
    }

    @Override // defpackage.xn7
    public final List c() {
        return this.d;
    }

    @Override // defpackage.pm40
    public final int d() {
        return this.e;
    }

    @Override // defpackage.pm40
    public final int e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pm40)) {
            return false;
        }
        pm40 pm40Var = (pm40) obj;
        l74 l74Var = (l74) pm40Var;
        if (this.a != l74Var.a || this.b != l74Var.b) {
            return false;
        }
        String str = l74Var.c;
        String str2 = this.c;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.d.equals(l74Var.d) && this.e == pm40Var.d() && this.f == pm40Var.e();
    }

    @Override // defpackage.xn7
    public final int getId() {
        return this.a;
    }

    public final int hashCode() {
        int i = (((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003;
        String str = this.c;
        return this.f ^ ((((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiResolutionImageReaderOutputConfig{id=");
        sb.append(this.a);
        sb.append(", surfaceGroupId=");
        sb.append(this.b);
        sb.append(", physicalCameraId=");
        sb.append(this.c);
        sb.append(", surfaceSharingOutputConfigs=");
        sb.append(this.d);
        sb.append(", imageFormat=");
        sb.append(this.e);
        sb.append(", maxImages=");
        return oyr.m(this.f, "}", sb);
    }
}
