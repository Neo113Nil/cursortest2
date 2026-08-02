package yads;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class e00 {
    public static final d00 c;
    public static final e00 d;
    public static final e00 e;
    public static final e00 f;
    public static final e00 g;
    public static final e00 h;
    public static final e00 i;
    public static final e00 j;
    public static final /* synthetic */ e00[] k;
    public static final /* synthetic */ zrp l;
    public final String b;

    static {
        e00 e00Var = new e00(0, "BANNER", "banner");
        d = e00Var;
        e00 e00Var2 = new e00(1, "INTERSTITIAL", "interstitial");
        e = e00Var2;
        e00 e00Var3 = new e00(2, "REWARDED", "rewarded");
        f = e00Var3;
        e00 e00Var4 = new e00(3, "NATIVE", "native");
        g = e00Var4;
        e00 e00Var5 = new e00(4, "INSTREAM", "instream");
        h = e00Var5;
        e00 e00Var6 = new e00(5, "APPOPENAD", "appopenad");
        i = e00Var6;
        e00 e00Var7 = new e00(6, "RETAIL_MEDIA", "retail");
        e00 e00Var8 = new e00(7, "FEED", "feed");
        j = e00Var8;
        e00[] e00VarArr = {e00Var, e00Var2, e00Var3, e00Var4, e00Var5, e00Var6, e00Var7, e00Var8};
        k = e00VarArr;
        l = new asp(e00VarArr);
        c = new d00();
    }

    public e00(int i2, String str, String str2) {
        this.b = str2;
    }

    public static e00 valueOf(String str) {
        return (e00) Enum.valueOf(e00.class, str);
    }

    public static e00[] values() {
        return (e00[]) k.clone();
    }
}
