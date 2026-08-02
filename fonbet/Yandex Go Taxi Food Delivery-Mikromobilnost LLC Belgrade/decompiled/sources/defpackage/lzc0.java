package defpackage;

import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class lzc0 {
    public final p4d0 a;
    public final zhd0 b;

    public lzc0(p4d0 p4d0Var, zhd0 zhd0Var) {
        this.a = p4d0Var;
        this.b = zhd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzc0)) {
            return false;
        }
        lzc0 lzc0Var = (lzc0) obj;
        if (!this.a.equals(lzc0Var.a) || !jl40.l(this.b, lzc0Var.b)) {
            return false;
        }
        EmptyList emptyList = EmptyList.a;
        return emptyList.equals(emptyList);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zhd0 zhd0Var = this.b;
        return ((hashCode + (zhd0Var == null ? 0 : zhd0Var.hashCode())) * 31) + 1;
    }

    public final String toString() {
        return "PluginDependenciesModule(sdkInternal=" + this.a + ", typefaceProvider=" + this.b + ", supportedFeatures=" + EmptyList.a + ')';
    }
}
