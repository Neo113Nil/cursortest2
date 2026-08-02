package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mim0 implements nim0 {
    public final ArrayList a;
    public final String b;
    public final boolean c;

    public mim0(String str, ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = str;
        this.c = z;
    }

    public final String a() {
        return this.b;
    }

    public final List b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mim0)) {
            return false;
        }
        mim0 mim0Var = (mim0) obj;
        return this.a.equals(mim0Var.a) && this.b.equals(mim0Var.b) && this.c == mim0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(recyclerItems=");
        sb.append(this.a);
        sb.append(", filterText=");
        sb.append(this.b);
        sb.append(", ybsListChanged=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
