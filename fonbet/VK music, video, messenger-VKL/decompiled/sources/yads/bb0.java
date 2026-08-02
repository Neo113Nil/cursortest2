package yads;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class bb0 {
    public static final ab0 b;
    public static final bb0 c;
    public static final bb0 d;
    public static final /* synthetic */ bb0[] e;
    public static final /* synthetic */ zrp f;

    static {
        bb0 bb0Var = new bb0(0, "DEFAULT");
        c = bb0Var;
        bb0 bb0Var2 = new bb0(1, "RESULT");
        d = bb0Var2;
        bb0[] bb0VarArr = {bb0Var, bb0Var2};
        e = bb0VarArr;
        f = new asp(bb0VarArr);
        b = new ab0();
    }

    public bb0(int i, String str) {
    }

    public static bb0 valueOf(String str) {
        return (bb0) Enum.valueOf(bb0.class, str);
    }

    public static bb0[] values() {
        return (bb0[]) e.clone();
    }
}
