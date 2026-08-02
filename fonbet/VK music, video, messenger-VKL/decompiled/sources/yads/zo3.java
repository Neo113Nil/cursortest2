package yads;

import com.ironsource.C4217a2;
import com.unity3d.ads.BuildConfig;
import java.util.LinkedHashMap;
import xsna.asp;
import xsna.c5g;
import xsna.on00;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class zo3 {
    public static final yo3 c;
    public static final LinkedHashMap d;
    public static final zo3 e;
    public static final /* synthetic */ zo3[] f;
    public final String b;

    static {
        zo3 zo3Var = new zo3(0, "DEFAULT", BuildConfig.FLAVOR);
        e = zo3Var;
        zo3[] zo3VarArr = {zo3Var, new zo3(1, "CACHE_ELSE_NETWORK", "cache_else_network"), new zo3(2, "CACHE_ONLY", "cache_only"), new zo3(3, "DISABLED", C4217a2.e)};
        f = zo3VarArr;
        asp aspVar = new asp(zo3VarArr);
        c = new yo3();
        int e2 = on00.e(c5g.u(aspVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2 < 16 ? 16 : e2);
        for (Object obj : aspVar) {
            linkedHashMap.put(((zo3) obj).b, obj);
        }
        d = linkedHashMap;
    }

    public zo3(int i, String str, String str2) {
        this.b = str2;
    }

    public static zo3 valueOf(String str) {
        return (zo3) Enum.valueOf(zo3.class, str);
    }

    public static zo3[] values() {
        return (zo3[]) f.clone();
    }
}
