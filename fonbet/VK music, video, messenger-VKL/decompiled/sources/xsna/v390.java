package xsna;

import android.net.Uri;
import com.vk.core.apps.BuildInfo;
import com.vk.core.apps.VkBuildAppStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptySet;
import xsna.uvn;

/* compiled from: OverrideDomainConfig.kt */
/* loaded from: classes.dex */
public final class v390 {
    public static final a p = new a();
    public static final v390 q = new v390(null, null, null, null, null, null, null, null, null, null, 32764);
    public final rvn a;
    public final rvn b;
    public final Set<hil0> c;
    public final rvn d;
    public final rvn e;
    public final rvn f;
    public final rvn g;
    public final rvn h;
    public final rvn i;
    public final uvn j;
    public final uvn k;
    public final boolean l;
    public final boolean m;
    public final long n;
    public final boolean o;

    /* compiled from: OverrideDomainConfig.kt */
    public static final class a {
        public static uvn a(String str, rvn rvnVar) {
            Map map;
            if (!drm0.N(str)) {
                uvn uvnVar = uvn.b;
                return uvn.a.a(str);
            }
            if (rvnVar == null || (map = (Map) rvnVar.b.getValue()) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                g5g.y(e43.l((String) entry.getKey(), (String) entry.getValue()), arrayList);
            }
            Set S0 = j5g.S0(arrayList);
            if (S0 == null || S0.isEmpty()) {
                return null;
            }
            return new uvn(S0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v390(rvn rvnVar, rvn rvnVar2, rvn rvnVar3, rvn rvnVar4, rvn rvnVar5, rvn rvnVar6, rvn rvnVar7, rvn rvnVar8, uvn uvnVar, uvn uvnVar2, int i) {
        this(rvnVar, rvnVar2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, (i & 4096) != 0 ? r1 : true, 100L, true);
        boolean z;
        EmptySet emptySet = EmptySet.b;
        rvn rvnVar9 = (i & 8) != 0 ? null : rvnVar3;
        rvn rvnVar10 = (i & 16) != 0 ? null : rvnVar4;
        rvn rvnVar11 = (i & 32) != 0 ? null : rvnVar5;
        rvn rvnVar12 = (i & 64) != 0 ? null : rvnVar6;
        rvn rvnVar13 = (i & 128) != 0 ? null : rvnVar7;
        rvn rvnVar14 = (i & 256) != 0 ? null : rvnVar8;
        uvn uvnVar3 = (i & 512) != 0 ? null : uvnVar;
        uvn uvnVar4 = (i & 1024) != 0 ? null : uvnVar2;
        boolean z2 = false;
        if ((i & 2048) != 0) {
            z = false;
        } else {
            z = false;
            z2 = true;
        }
    }

    public static String b(String str, Map map) {
        Object failure;
        String str2;
        if (map.isEmpty()) {
            return str;
        }
        try {
            failure = Uri.parse(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Uri uri = (Uri) failure;
        if (uri == null || (str2 = uri.getHost()) == null) {
            str2 = str;
        }
        String str3 = str2;
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            if (!drm0.D(str3, str5, false) && drm0.D(str3, str4, false)) {
                str3 = brm0.y(str3, str4, str5);
            }
        }
        return brm0.y(str, str2, str3);
    }

    public final boolean a() {
        Set<hil0> set = this.c;
        if (set.isEmpty()) {
            return true;
        }
        Set<hil0> set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        for (hil0 hil0Var : set2) {
            String str = hil0Var.a;
            String str2 = hil0Var.b;
            if (str.length() == 0 || epx.f(hil0Var.a, ((VkBuildAppStore) com.vk.core.apps.a.h.getValue()).i().toLowerCase(Locale.ROOT))) {
                if (str2.length() == 0 || str2.equals(BuildInfo.b.toLowerCase(Locale.ROOT))) {
                    if (BuildInfo.e >= hil0Var.c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final Map<String, String> c(rvn rvnVar) {
        Map<String, String> map;
        return (rvnVar == null || (map = (Map) rvnVar.b.getValue()) == null || !a()) ? jgp.b : map;
    }

    public final boolean d(String str) {
        Object failure;
        Iterable iterable;
        String host;
        if (drm0.N(str)) {
            return false;
        }
        if (!a() ? false : this.m) {
            return true;
        }
        try {
            failure = Uri.parse(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Uri uri = (Uri) failure;
        if (uri != null && (host = uri.getHost()) != null) {
            str = host;
        }
        if (a()) {
            uvn uvnVar = this.k;
            if (uvnVar == null || (iterable = uvnVar.a) == null) {
                iterable = EmptySet.b;
            }
        } else {
            iterable = EmptySet.b;
        }
        Iterable<String> iterable2 = iterable;
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
            return false;
        }
        for (String str2 : iterable2) {
            if (!str.equals(str2)) {
                if (brm0.v(str, "." + str2, false)) {
                }
            }
            return true;
        }
        return false;
    }

    public v390(rvn rvnVar, rvn rvnVar2, Set<hil0> set, rvn rvnVar3, rvn rvnVar4, rvn rvnVar5, rvn rvnVar6, rvn rvnVar7, rvn rvnVar8, uvn uvnVar, uvn uvnVar2, boolean z, boolean z2, long j, boolean z3) {
        this.a = rvnVar;
        this.b = rvnVar2;
        this.c = set;
        this.d = rvnVar3;
        this.e = rvnVar4;
        this.f = rvnVar5;
        this.g = rvnVar6;
        this.h = rvnVar7;
        this.i = rvnVar8;
        this.j = uvnVar;
        this.k = uvnVar2;
        this.l = z;
        this.m = z2;
        this.n = j;
        this.o = z3;
    }
}
