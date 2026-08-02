package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class l691 implements r691 {
    @Override // defpackage.r691
    public final r691 b(String str, cr71 cr71Var, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }

    @Override // defpackage.r691
    public final r691 e() {
        return r691.A5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof l691;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // defpackage.r691
    public final String zzc() {
        return "null";
    }

    @Override // defpackage.r691
    public final Double zzd() {
        return Double.valueOf(0.0d);
    }

    @Override // defpackage.r691
    public final Boolean zze() {
        return Boolean.FALSE;
    }

    @Override // defpackage.r691
    public final Iterator zzf() {
        return null;
    }
}
