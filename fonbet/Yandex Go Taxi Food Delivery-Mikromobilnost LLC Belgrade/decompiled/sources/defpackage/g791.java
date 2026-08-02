package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class g791 implements r691 {
    @Override // defpackage.r691
    public final r691 b(String str, cr71 cr71Var, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    @Override // defpackage.r691
    public final r691 e() {
        return r691.z5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof g791;
    }

    @Override // defpackage.r691
    public final String zzc() {
        return StringUtils.UNDEFINED;
    }

    @Override // defpackage.r691
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
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
