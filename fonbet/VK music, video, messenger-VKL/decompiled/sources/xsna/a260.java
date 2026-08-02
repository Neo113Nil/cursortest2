package xsna;

import android.net.NetworkInfo;
import com.vk.core.preference.Preference;
import com.vk.stat.scheme.SchemeStat$TypeAppStarts;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;

/* compiled from: NetConcentrator.kt */
/* loaded from: classes11.dex */
public final class a260 implements dyp<SchemeStat$TypeAppStarts> {
    public final kw90 a;
    public final l93 b;

    public a260(kw90 kw90Var, l93 l93Var) {
        this.a = kw90Var;
        this.b = l93Var;
    }

    @Override // xsna.dyp
    public final SchemeStat$TypeAppStarts a(SchemeStat$TypeAppStarts schemeStat$TypeAppStarts) {
        r6m.a.getClass();
        NetworkInfo e = r6m.e();
        boolean z = (e != null ? e.getType() : -1) == 1;
        String simOperatorName = r6m.g().getSimOperatorName();
        String upperCase = (simOperatorName == null || simOperatorName.length() == 0) ? null : simOperatorName.toUpperCase(Locale.ROOT);
        List singletonList = upperCase != null ? Collections.singletonList(upperCase) : null;
        if (singletonList == null) {
            singletonList = EmptyList.b;
        }
        List list = singletonList;
        NetworkInfo e2 = r6m.e();
        boolean isRoaming = e2 != null ? e2.isRoaming() : false;
        boolean z2 = Preference.j().getBoolean("isRoamingState", false);
        kw90 kw90Var = this.a;
        Long l = kw90Var.g;
        String l2 = l != null ? l.toString() : null;
        Long l3 = kw90Var.h;
        return SchemeStat$TypeAppStarts.a(schemeStat$TypeAppStarts, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z), list, Boolean.valueOf(isRoaming), Boolean.valueOf(z2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l2, l3 != null ? l3.toString() : null, kw90Var.i, String.valueOf(kw90Var.j), kw90Var.k, null, null, null, this.b.a(), Boolean.valueOf(r6m.i()), null, null, Integer.MAX_VALUE, -8, 847999);
    }
}
