package yads;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import xsna.asp;
import xsna.c5g;
import xsna.on00;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class is1 {
    public static final hs1 c;
    public static final LinkedHashMap d;
    public static final is1 e;
    public static final is1 f;
    public static final is1 g;
    public static final is1 h;
    public static final is1 i;
    public static final is1 j;
    public static final is1 k;
    public static final is1 l;
    public static final is1 m;
    public static final is1 n;
    public static final is1 o;
    public static final is1 p;
    public static final is1 q;
    public static final is1 r;
    public static final is1 s;
    public static final is1 t;
    public static final is1 u;
    public static final is1 v;
    public static final is1 w;
    public static final is1 x;
    public static final /* synthetic */ is1[] y;
    public final String b;

    static {
        is1 is1Var = new is1(0, "APPLOVIN", "applovin");
        e = is1Var;
        is1 is1Var2 = new is1(1, "APPLOVIN_MAX", "applovin_max");
        f = is1Var2;
        is1 is1Var3 = new is1(2, "APPNEXT", "appnext");
        g = is1Var3;
        is1 is1Var4 = new is1(3, "BIGOADS", "bigoads");
        h = is1Var4;
        is1 is1Var5 = new is1(4, "CHARTBOOST", "chartboost");
        i = is1Var5;
        is1 is1Var6 = new is1(5, "ADMOB", InneractiveMediationNameConsts.ADMOB);
        j = is1Var6;
        is1 is1Var7 = new is1(6, "ADMANAGER", "admanager");
        k = is1Var7;
        is1 is1Var8 = new is1(7, "DIGITAL_TURBINE", "digitalturbine");
        l = is1Var8;
        is1 is1Var9 = new is1(8, "INMOBI", "inmobi");
        m = is1Var9;
        is1 is1Var10 = new is1(9, "IRONSOURCE", "ironsource");
        n = is1Var10;
        is1 is1Var11 = new is1(10, "MINTEGRAL", "mintegral");
        o = is1Var11;
        is1 is1Var12 = new is1(11, "MYTARGET", "mytarget");
        p = is1Var12;
        is1 is1Var13 = new is1(12, "PANGLE", "pangle");
        q = is1Var13;
        is1 is1Var14 = new is1(13, "PETALADS", "petalads");
        r = is1Var14;
        is1 is1Var15 = new is1(14, "STARTAPP", "startapp");
        s = is1Var15;
        is1 is1Var16 = new is1(15, "TAPJOY", "tapjoy");
        t = is1Var16;
        is1 is1Var17 = new is1(16, "UNITYADS", "unityads");
        u = is1Var17;
        is1 is1Var18 = new is1(17, "VUNGLE", "vungle");
        v = is1Var18;
        is1 is1Var19 = new is1(18, "ZMATICOO", "zmaticoo");
        w = is1Var19;
        is1 is1Var20 = new is1(19, "UNDEFINED", StringUtils.UNDEFINED);
        x = is1Var20;
        is1[] is1VarArr = {is1Var, is1Var2, is1Var3, is1Var4, is1Var5, is1Var6, is1Var7, is1Var8, is1Var9, is1Var10, is1Var11, is1Var12, is1Var13, is1Var14, is1Var15, is1Var16, is1Var17, is1Var18, is1Var19, is1Var20};
        y = is1VarArr;
        asp aspVar = new asp(is1VarArr);
        c = new hs1();
        int e2 = on00.e(c5g.u(aspVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2 < 16 ? 16 : e2);
        for (Object obj : aspVar) {
            linkedHashMap.put(((is1) obj).b, obj);
        }
        d = linkedHashMap;
    }

    public is1(int i2, String str, String str2) {
        this.b = str2;
    }

    public static is1 valueOf(String str) {
        return (is1) Enum.valueOf(is1.class, str);
    }

    public static is1[] values() {
        return (is1[]) y.clone();
    }
}
