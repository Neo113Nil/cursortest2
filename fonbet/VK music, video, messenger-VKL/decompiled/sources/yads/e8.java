package yads;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class e8 {
    public static final d8 c;
    public static final /* synthetic */ e8[] d;
    public static final /* synthetic */ zrp e;
    public final String b;

    static {
        e8[] e8VarArr = {new e8(0, "APPLOVIN", "applovin"), new e8(1, "APPLOVINMAX", "applovin_max"), new e8(2, "BIGOADS", "bigoads"), new e8(3, "CHARTBOOST", "chartboost"), new e8(4, "DIGITALTURBINE", "digitalturbine"), new e8(5, "GOOGLE", "admanager"), new e8(6, "ADMOB", InneractiveMediationNameConsts.ADMOB), new e8(7, "INMOBI", "inmobi"), new e8(8, "IRONSOURCE", "ironsource"), new e8(9, "MINTEGRAL", "mintegral"), new e8(10, "MYTARGET", "mytarget"), new e8(11, "PANGLE", "pangle"), new e8(12, "TAPJOY", "tapjoy"), new e8(13, "UNITYADS", "unityads"), new e8(14, "VUNGLE", "vungle"), new e8(15, "YANDEX", "yandex")};
        d = e8VarArr;
        e = new asp(e8VarArr);
        c = new d8();
    }

    public e8(int i, String str, String str2) {
        this.b = str2;
    }

    public static e8 valueOf(String str) {
        return (e8) Enum.valueOf(e8.class, str);
    }

    public static e8[] values() {
        return (e8[]) d.clone();
    }
}
